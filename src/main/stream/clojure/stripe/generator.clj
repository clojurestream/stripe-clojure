(ns stream.clojure.stripe.generator
  (:require [clojure.data.json :as json]
            [clojure.java.io :as io]
            [stream.clojure.stripe.request :as request ]))

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
                   :operation-id (get details :operationId)})
             methods)))
    (apply concat)))

;; Step 3: Generate Functions
(defn extract-path-params [path]
  "Extracts path parameters like {customer} from a URL string."
  (let [path-str (name path)]
    (map #(subs % 1 (dec (count %)))
      (re-seq #"\{[^\}]+\}" path-str))))

(defn generate-function [endpoint]
  (let [{:keys [operation-id method path]} endpoint
        path-str (name path)  ;; Ensure it's a string
        params (extract-path-params path-str)
        param-names (clojure.string/join " " params)  ;; Convert to function arguments
        replaced-path (reduce (fn [p param]
                                (clojure.string/replace p (str "{" param "}") (str "\" " param " \"")))
                        path-str
                        params)]
    (str "\n(defn " operation-id " [" param-names " params]\n"
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
        body (clojure.string/join "\n" functions)
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