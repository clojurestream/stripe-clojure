(ns stream.clojure.stripe.generator
  (:require [clojure.data.json :as json]
            [clojure.java.io :as io]
            [clojure.string :as string]
            [stream.clojure.stripe.request :as request]))

;; Step 1: Fetch OpenAPI Schema
(def stripe-openapi-url
  "https://raw.githubusercontent.com/stripe/openapi/master/openapi/spec3.json")

(defn fetch-stripe-schema []
  (let [response (slurp stripe-openapi-url)]
    (json/read-str response :key-fn keyword)))

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

;; Step 3: Generate Functions
(defn extract-resource [path]
  "Extracts the resource type from a Stripe API path."
  (second (clojure.string/split (name path) #"/" 3)))


(defn extract-path-params [path]
  "Extracts path parameters like {customer} from a URL string."
  (let [path-str (name path)]
    (map #(subs % 1 (dec (count %)))
      (re-seq #"\{[^\}]+\}" path-str))))

(defn camel-to-kebab [s]
  "Converts CamelCase to kebab-case"
  (-> s
    (string/replace #"([a-z])([A-Z])" "$1-$2") ; Add hyphen between camelCase transitions
    (string/replace #"([A-Z]+)([A-Z][a-z])" "$1-$2") ; Fix uppercase sequences
    (string/lower-case) ; Convert everything to lowercase
    (string/replace #"_" "-"))) ; Replace underscores with dashes

(defn camel-to-snake [s]
  "Converts CamelCase to snake_case"
  (-> s
    (string/replace #"([a-z])([A-Z])" "$1-$2") ; Add hyphen between camelCase transitions
    (string/replace #"([A-Z]+)([A-Z][a-z])" "$1-$2") ; Fix uppercase sequences
    (string/lower-case))) ; Convert everything to lowercase

(defn generate-function [endpoint schema]
  (let [{:keys [operation-id method path summary parameters]} endpoint
        kebab-op-id (camel-to-kebab operation-id)
        params (extract-path-params path)
        required-params (string/join " " params)
        param-docs (map (fn [p] (str "    - " p ": Path parameter.")) params)
        query-params (filter #(= (:in %) "query") parameters)
        query-docs (map (fn [q] (str "    - " (:name q) ": " (:description q))) query-params)
        clean-path (-> path str (string/replace #"^:" ""))  ;; Remove leading colon
        replaced-path (reduce (fn [p param]
                                (string/replace p (str "{" param "}") (str "\" " param " \"")))
                        clean-path
                        params)
        final-path (str "\"" replaced-path "\"")
        docstring (str "  \"\"\"\n"
                    "  " (or summary "No description available.") "\n\n"
                    "  HTTP Method: " (string/upper-case (name method)) "\n"
                    "  Endpoint: " clean-path "\n\n"
                    (when (seq param-docs)
                      (str "  Path Parameters:\n" (string/join "\n" param-docs) "\n\n"))
                    (when (seq query-docs)
                      (str "  Query Parameters:\n" (string/join "\n" query-docs) "\n\n"))
                    "  \"\"\"")]
    (str "\n(defn " kebab-op-id " [" (if (empty? required-params) "params" (str required-params " params")) "]\n"
      docstring "\n"
      "  (stripe-request :" (name method) " " final-path " params))")))

;; Step 4: Ensure Directory Exists & Write to File
(defn ensure-directory [path]
  (let [dir (io/file path)]
    (when-not (.exists dir)
      (.mkdirs dir))))

(defn write-to-file [file-name content]
  (ensure-directory (subs file-name 0 (string/last-index-of file-name "/")))
  (spit file-name content))

(defn generate-namespaces [endpoints schema]
  (let [grouped-by-resource (group-by #(extract-resource (:path %)) endpoints)]
    (doseq [[resource endpoints] grouped-by-resource]
      (when resource
        (let [ns-name (str "stream.clojure.stripe.api." (camel-to-kebab resource))
              filename (str "src/main/stream/clojure/stripe/api/" (camel-to-snake resource) ".clj")
              functions (map #(generate-function % schema) endpoints)
              content (str "(ns " ns-name "\n"
                        "  (:require [stream.clojure.stripe.request :refer [stripe-request]]))\n\n"
                        (string/join "\n" functions))]
          (ensure-directory "src/main/stream/clojure/stripe/api/")
          (write-to-file filename content))))))

;; Step 5: Automate
(defn generate-stripe-clojure-sdk []
  (let [schema (fetch-stripe-schema)
        endpoints (extract-endpoints schema)
        ; namespaces (generate-namespaces endpoints schema)
        ; functions (map #(generate-function % schema) endpoints)
        ]
    (generate-namespaces endpoints schema)
    ;(generate-clj-file functions)
    (println "Stripe Clojure SDK generated successfully!")))

(generate-stripe-clojure-sdk)