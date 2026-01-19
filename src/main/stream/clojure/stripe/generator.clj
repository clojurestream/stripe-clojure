(ns stream.clojure.stripe.generator
  (:require [jsonista.core :as json]
            [clojure.java.io :as io]
            [clojure.string :as string]))

;; Step 1: Fetch OpenAPI Schema
(def stripe-openapi-url
  "https://raw.githubusercontent.com/stripe/openapi/master/openapi/spec3.json")

(def json-mapper
  "Object mapper that converts keys to keywords."
  json/keyword-keys-object-mapper)

(defn fetch-stripe-schema []
  (let [response (slurp stripe-openapi-url)]
    (json/read-value response json-mapper)))

;; Step 2: Extract Endpoints
(defn extract-endpoints [schema]
  (->> (:paths schema)
    (map (fn [[path methods]]
           (map (fn [[method details]]
                  {:path path
                   :method method
                   :operation-id (get details :operationId)
                   :summary (get details :summary)
                   :description (get details :description)
                   :parameters (get details :parameters [])})
             methods)))
    (apply concat)))

;; Step 3: Helpers for Function Generation

(defn extract-resource
  "Extracts the resource type from a Stripe API path.
   Example: \"/v1/customers/{customer}/bank_accounts\" → \"customers\"."
  [path]
  (second (string/split (name path) #"/" 3)))

(defn extract-path-params
  "Extracts path parameters (e.g. {customer}) from a URL string."
  [path]
  (let [path-str (name path)]
    (map #(subs % 1 (dec (count %)))
      (re-seq #"\{[^\}]+\}" path-str))))

(defn camel-to-kebab [s]
  "Converts CamelCase or underscore_names to kebab-case."
  (-> s
    (string/replace #"([a-z])([A-Z])" "$1-$2")
    (string/replace #"([A-Z]+)([A-Z][a-z])" "$1-$2")
    (string/lower-case)
    (string/replace #"_" "-")))

(defn camel-to-snake [s]
  "Converts CamelCase to snake_case."
  (-> s
    (string/replace #"([a-z])([A-Z])" "$1-$2")
    (string/replace #"([A-Z]+)([A-Z][a-z])" "$1-$2")
    (string/lower-case)))

(defn singularize
  "A simple singularization: if s ends with an \"s\" and is longer than one character, remove it."
  [s]
  (if (and (> (count s) 1)
        (.endsWith s "s"))
    (subs s 0 (dec (count s)))
    s))

(defn remove-resource-from-fn-name [fn-name resource]
  (let [segments      (string/split fn-name #"-")
        resource-lower (string/lower-case resource)
        new-segments  (remove #(= % resource-lower) segments)]
    (string/join "-" new-segments)))

;; Candidate function name is built from the operation-id, it replaces get with retrieve or list-all and post with
;; create or update based on the url. It also removes redundant resource name from operation name.
(defn candidate-fn-name [endpoint]
  (let [method      (name (:method endpoint))
        op-id       (:operation-id endpoint)
        op-id-kebab (camel-to-kebab op-id)
        resource    (extract-resource (:path endpoint))
        path        (name (:path endpoint))
        summary     (:summary endpoint)
        summary-word (when summary
                       (-> summary string/trim (string/split #" ") first string/lower-case))
        candidate (cond
                    (= method "get")
                    (if (re-matches #".*\{[^\}]+\}$" path)
                      (if (string/starts-with? op-id-kebab "get-")
                        (string/replace-first op-id-kebab #"^get-" "retrieve-")
                        (str "retrieve-" op-id-kebab))
                      (if (string/starts-with? op-id-kebab "get-")
                        (string/replace-first op-id-kebab #"^get-" "list-all-")
                        (str "list-all-" op-id-kebab)))

                    (= method "post")
                    (if summary-word
                      (case summary-word
                        "create" (if (string/starts-with? op-id-kebab "post-")
                                   (string/replace-first op-id-kebab #"^post-" "create-")
                                   (str "create-" op-id-kebab))
                        "update" (if (string/starts-with? op-id-kebab "post-")
                                   (string/replace-first op-id-kebab #"^post-" "update-")
                                   (str "update-" op-id-kebab))
                        op-id-kebab)
                      op-id-kebab)

                    :else op-id-kebab)]
    (remove-resource-from-fn-name candidate resource)))

;; Disambiguate names if needed by appending a numeric suffix.
(defn unique-function-name [existing endpoint]
  (let [base (candidate-fn-name endpoint)]
    (if (contains? existing base)
      (loop [i 2
             cand (str base "-" i)]
        (if (contains? existing cand)
          (recur (inc i) (str base "-" i))
          cand))
      base)))

;; Convert parameter names for easy comprehension: {customer} -> {customer-id}
(defn descriptive-path-param-key [path param]
  (let [segments (vec (remove empty? (string/split path #"/")))
        idx (first (keep-indexed (fn [i seg]
                                   (when (= seg (str "{" param "}"))
                                     i))
                     segments))]
    (if (and idx (pos? idx))
      (-> (nth segments (dec idx))
        (singularize)
        (camel-to-kebab)
        (str "-id")
        (keyword))
      (keyword (camel-to-kebab param)))))

;; Helper: Produce a destructuring map string for the function signature.
(defn generate-destructuring
  "Generates the destructuring map for the function signature.
   It extracts descriptive keys for all path parameters and adds
   'query-params' only if there are any query parameters."
  [path query-param-objs]
  (let [tokens (vec (extract-path-params path))
        desc-keys (map (fn [p] (descriptive-path-param-key (name path) p)) tokens)
        base (string/join " " (map name desc-keys))
        keys-str (if (seq query-param-objs)
                   (str base (when (not (empty? base)) " ") "query-params")
                   base)]
    (str "  [{:keys [" keys-str "]}]")))

;; Helper: Replace each parameter placeholder in the path with its descriptive version.
(defn descriptive-endpoint [path]
  (let [tokens (vec (extract-path-params path))]
    (reduce (fn [acc token]
              (let [dkey (name (descriptive-path-param-key (name path) token))]
                (string/replace acc (str "{" token "}") (str "{" dkey "}"))))
      path
      tokens)))

(defn replace-double-with-single [s]
  (string/replace s #"\"" "'"))

(defn generate-query-param-docs [query-param-objs]
  (map (fn [q]
         (let [qkey (-> (:name q) camel-to-kebab)
               enum-values (get-in q [:schema :enum])
               extra (if (and (= qkey "expand") (seq enum-values))
                       (str " Allowed values: " (pr-str (set (map (fn [v] (keyword (camel-to-kebab v))) enum-values))))
                       "")
               raw-desc (or (:description q)
                      (str "The " qkey " parameter."))
               desc (replace-double-with-single raw-desc)
               type (string/capitalize (get-in q [:schema :type] "Unknown"))]
           (str "    - " qkey " (" type "): " desc  (when (:required q) " (required)") extra)))
    query-param-objs))

(defn generate-example-usage [path query-param-objs fn-name]
  (let [tokens (vec (extract-path-params (name path)))
        example-lines (for [t tokens]
                        (let [k (descriptive-path-param-key (name path) t)]
                          (str ":" (name k) " example-" (name k))))
        qp-line (if (seq query-param-objs)
                  ":query-params {:limit 10}"
                  "")]
    (str "  Example Usage:
    (" fn-name " {" (string/join " " example-lines)
      (if (seq query-param-objs)
        (if (seq example-lines) (str " " qp-line) qp-line) ; extra space if qp is after another keyword
        "") "})")))

(defn generate-function-with-name [fn-name endpoint _schema]
  (let [{:keys [method path summary parameters]} endpoint
        path-tokens (vec (extract-path-params (name path)))
        ;; Generate the destructuring using both path and query parameters.
        query-param-objs (filter #(= (:in %) "query") parameters)
        destructuring (generate-destructuring (name path) query-param-objs)
        ;; Build documentation for path parameters.
        param-docs (map (fn [p]
                          (let [dkey (descriptive-path-param-key (name path) p)
                                param-def (some #(when (and (= (:name %) p)
                                                         (= (:in %) "path"))
                                                   %)
                                            parameters)
                                type (string/capitalize (get-in param-def [:schema :type] "Unknown"))
                                desc (if param-def
                                       (or (:description param-def)
                                         (str "The " (name dkey) " parameter. (required)"))
                                       (str "The " (name dkey) " parameter. (required)"))]
                            (str "    - " (name dkey) " (" type "): " desc)))
                     path-tokens)
        ;; Build documentation for query parameters.
        query-docs (generate-query-param-docs query-param-objs)
        ;; Ensure the endpoint starts with "/v1"
        clean-path (-> path str (string/replace #"^:" ""))
        descr-endpoint (if (string/starts-with? clean-path "/v1")
                         clean-path
                         (str "/v1" clean-path))
        final-endpoint (descriptive-endpoint descr-endpoint)
        ;; Build the :path-params map string only if there are path parameters.
        path-params-string (if (seq path-tokens)
                             (str ":path-params {"
                               (string/join " " (map (fn [p]
                                                       (let [dkey (descriptive-path-param-key (name path) p)]
                                                         (str ":" (name dkey) " " (name dkey))))
                                                  path-tokens))
                               "}")
                             "")
        ;; Build the :query-params string only if there are query parameters.
        query-params-string (if (seq query-param-objs)
                              ":query-params query-params"
                              "")
        entries (remove empty? (list (str ":endpoint \"" final-endpoint "\"")
                                 path-params-string
                                 query-params-string))
        request-map (str "{" (string/join " " entries) "}")
        usage (generate-example-usage (name path) query-param-objs fn-name)
        docstring (str "  \""
                    "" (or summary "No description available.") "\n\n"
                    "  HTTP Method: " (string/upper-case (name method)) "\n"
                    "  Endpoint: " final-endpoint "\n\n"
                    (when (seq param-docs)
                      (str "  Path Parameters:\n" (string/join "\n" param-docs) "\n\n"))
                    (when (seq query-docs)
                      (str "  Query Parameters:\n" (string/join "\n" query-docs) "\n\n"))
                    usage
                    "\"")]
    (str "\n(defn " fn-name "\n"
      docstring "\n"
      destructuring "\n"
      "  (stripe-request " method " " request-map "))")))

;; Step 4: Ensure Directory Exists & Write to File
(defn ensure-directory [path]
  (let [dir (io/file path)]
    (when-not (.exists dir)
      (.mkdirs dir))))

(defn write-to-file [file-name content]
  (ensure-directory (subs file-name 0 (string/last-index-of file-name "/")))
  (spit file-name content))

;; Group endpoints by resource and generate a namespace per resource.
(defn generate-namespaces [endpoints schema]
  (doseq [[resource endpoints] (group-by #(extract-resource (:path %)) endpoints)]
    (when resource
      (let [ns-name (str "stream.clojure.stripe.api." (camel-to-kebab resource))
            filename (str "src/main/stream/clojure/stripe/api/" (camel-to-snake resource) ".clj")
            fn-names (atom #{})
            functions (for [ep endpoints]
                        (let [unique-name (unique-function-name @fn-names ep)]
                          (swap! fn-names conj unique-name)
                          (generate-function-with-name unique-name ep schema)))
            info-str "  \"Info: This ns is auto-generated from the Stripe OpenAPI spec.\"\n"
            content (str "(ns " ns-name "\n"
                      info-str
                      "  (:require [stream.clojure.stripe.request :refer [stripe-request]]))\n\n"
                      (string/join "\n" functions))]
        (ensure-directory "src/main/stream/clojure/stripe/api/")
        (write-to-file filename content)))))

;; Generate version
(defn extract-stripe-api-version [spec]
  (get-in spec [:info :version] "unknown"))

(defn generate-version-file [spec]
  (let [version (extract-stripe-api-version spec)
        info-str "  \"Info: This ns is auto-generated from the Stripe OpenAPI spec.\""
        content (str "(ns versions\n"
                  info-str ")\n\n"
                  "(def stripe-api-version " (pr-str version) ")\n")]
    (write-to-file "src/dev/versions.clj" content)
    (println "Stripe version" version)))

;; Step 5: Automate SDK Generation
(defn generate-stripe-clojure-sdk []
  (let [schema (fetch-stripe-schema)
        endpoints (extract-endpoints schema)]
    (generate-version-file schema)
    (generate-namespaces endpoints schema)
    (println "Stripe Clojure SDK generated successfully!")))

(generate-stripe-clojure-sdk)

