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
                   :parameters (get details :parameters [])})  ;; Include parameters
             methods)))
    (apply concat)))

;; Step 3: Generate Functions
(defn extract-path-params [path]
  "Extracts path parameters like {customer} from a URL string."
  (let [path-str (name path)]
    (map #(subs % 1 (dec (count %)))
      (re-seq #"\{[^\}]+\}" path-str))))

(defn camel-to-kebab [s]
  "Converts CamelCase to kebab-case"
  (-> s
    (string/replace #"([a-z])([A-Z])" "$1-$2") ;; Add hyphen between camelCase transitions
    (string/replace #"([A-Z]+)([A-Z][a-z])" "$1-$2") ;; Fix uppercase sequences
    (string/lower-case) ;; Convert everything to lowercase
    (string/replace #"_" "-"))) ;; Replace underscores with dashes

(defn generate-function [endpoint]
  (let [{:keys [operation-id method path summary parameters]} endpoint
        kebab-op-id (camel-to-kebab operation-id)
        path-str (name path) ;; Ensure it's a string
        params (extract-path-params path-str)
        param-names (if (empty? params) "params" (string/join " " params)) ;; Convert to function arguments
        replaced-path (reduce (fn [p param]
                                (string/replace p (str "{" param "}") (str "\" " param " \"")))
                        path-str
                        params)
        path-params (filter #(= (:in %) "path") parameters)
        query-params (filter #(= (:in %) "query") parameters)
        docstring (str "  \"\"\"\n"
                    "  " (or summary "No description available.") "\n\n"
                    "  HTTP Method: " (string/upper-case (name method)) "\n"
                    "  Endpoint: " path-str "\n\n"
                    (when (seq path-params)
                      (str "  Path Parameters:\n"
                        (string/join "\n" (map #(str "    - " (:name %) ": " (:description %)) path-params))
                        "\n\n"))
                    (when (seq query-params)
                      (str "  Query Parameters:\n"
                        (string/join "\n" (map #(str "    - " (:name %) ": " (:description %)) query-params))
                        "\n\n"))
                    "  \"\"\"")]
    (str "\n(defn " kebab-op-id " [" param-names " params]\n"
      docstring "\n"
      "  (stripe-request :" (name method) " (str \"" replaced-path "\") params))")))

;; Step 4: Ensure Directory Exists & Write to File
(defn ensure-directory [path]
  (let [dir (io/file path)]
    (when-not (.exists dir)
      (.mkdirs dir))))

(defn write-to-file [filename content]
  (ensure-directory "src/main/stream/clojure/stripe")
  (spit filename content))

(defn generate-clj-file [functions]
  (let [docstring (str
                    "  \"WARNING: This file is auto-generated from Stripe's OpenAPI spec.\n"
                    "  DO NOT MODIFY THIS FILE MANUALLY. Any changes will be overwritten.\n"
                    "  ALPHA: Work-in-progress - expect breaking changes before the stable release.\"")
        header (str "(ns stream.clojure.stripe.api\n" docstring "\n (:require [stream.clojure.stripe.request :refer [stripe-request]]))\n")
        body (string/join "\n" functions)
        content (str header body)]
    (write-to-file "src/main/stream/clojure/stripe/api.clj" content)))

;; Step 5: Automate
(defn generate-stripe-clojure-sdk []
  (let [schema (fetch-stripe-schema)
        endpoints (extract-endpoints schema)
        functions (map generate-function endpoints)]
    (generate-clj-file functions)
    (println "Stripe API wrapper generated successfully!")))

(generate-stripe-clojure-sdk)