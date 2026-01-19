(ns stream.clojure.stripe.request
  (:refer-clojure :exclude [send])
  (:require [clojure.string :as string]
            [jsonista.core :as json]
            [stream.clojure.stripe.api :as api]
            [stream.clojure.stripe.error :as error])
  (:import [java.net.http HttpClient HttpRequest HttpClient$Version]
           [java.net.http HttpRequest$BodyPublishers HttpResponse$BodyHandlers]
           [java.net URI URLEncoder]
           [java.time Duration]))

;;; ---------------------------------------------------------------------------
;;; Configuration
;;; ---------------------------------------------------------------------------

(def ^:dynamic *stripe-base-url* "https://api.stripe.com")

(def ^:dynamic *stripe-version* "2025-02-24.acacia")

(def sdk-version "0.1.0-alpha")

(def user-agent (str "stripe-clojure/" sdk-version " clojure/" (clojure-version)))

;;; ---------------------------------------------------------------------------
;;; JSON handling (jsonista)
;;; ---------------------------------------------------------------------------

(def json-mapper
  "Object mapper that converts keys to keywords on read."
  json/keyword-keys-object-mapper)

(defn- parse-json [s]
  (json/read-value s json-mapper))

(defn- write-json [data]
  (json/write-value-as-string data))

;;; ---------------------------------------------------------------------------
;;; URL/Form encoding
;;; ---------------------------------------------------------------------------

(defn- url-encode [s]
  (URLEncoder/encode (str s) "UTF-8"))

(defn flatten-params
  "Flattens nested maps into bracket notation for Stripe API.
   {:foo 1 :bar {:baz 2}} => [[\"foo\" 1] [\"bar[baz]\" 2]]"
  ([params] (flatten-params params nil))
  ([params prefix]
   (reduce-kv
     (fn [acc k v]
       (let [key-name (if (keyword? k) (name k) (str k))
             full-key (if prefix
                        (str prefix "[" key-name "]")
                        key-name)]
         (cond
           (map? v)
           (into acc (flatten-params v full-key))

           (sequential? v)
           (reduce into acc
                   (map-indexed
                     (fn [i item]
                       (if (map? item)
                         (flatten-params item (str full-key "[" i "]"))
                         [[(str full-key "[" i "]") item]]))
                     v))

           :else
           (conj acc [full-key v]))))
     []
     params)))

(defn build-query-string
  "Builds URL query string from params map."
  [params]
  (->> (flatten-params params)
       (map (fn [[k v]] (str k "=" (url-encode v))))
       (string/join "&")))

(defn build-form-body
  "Builds form-urlencoded body from params map."
  [params]
  (build-query-string params))

;;; ---------------------------------------------------------------------------
;;; HTTP Client
;;; ---------------------------------------------------------------------------

(defonce ^HttpClient client
  (-> (HttpClient/newBuilder)
      (.version HttpClient$Version/HTTP_2)
      (.connectTimeout (Duration/ofSeconds 30))
      (.build)))

(defn- parse-response-body
  "Safely parses JSON response body. Returns parsed map or {:parse-error ...} on failure."
  [body-str]
  (try
    (parse-json body-str)
    (catch Exception e
      {:parse-error true
       :raw-body body-str
       :exception-message (.getMessage e)})))

(defn- extract-request-id
  "Extracts Stripe request ID from response headers."
  [response]
  (-> response
      (.headers)
      (.firstValue "Request-Id")
      (.orElse nil)))

(defn send
  "Sends an HTTP request. Returns success map or anomaly map on error.

   Options:
     :headers      - Additional headers map
     :body         - Request body (map for form encoding, string for raw)
     :query-params - URL query parameters
     :timeout      - Request timeout in seconds (default: 30)
     :as           - Response format, :json (default) or :raw

   Success: {:status 2xx :body parsed-json :stripe/request-id \"req_xxx\"}
   Error:   {:cognitect.anomalies/category ... :stripe/type ... etc}"
  [method url {:keys [headers body timeout query-params as]
               :or {headers {} timeout 30 as :json}}]
  (try
    (let [url (if (and query-params (seq query-params))
                (str url "?" (build-query-string query-params))
                url)
          ;; Determine content type and body encoding
          [content-type encoded-body]
          (cond
            (nil? body) ["application/x-www-form-urlencoded" ""]
            (map? body) ["application/x-www-form-urlencoded" (build-form-body body)]
            (string? body) ["application/x-www-form-urlencoded" body]
            :else (throw (IllegalArgumentException. (str "Invalid body type: " (type body)))))

          request-builder (-> (HttpRequest/newBuilder)
                              (.uri (URI/create url))
                              (.timeout (Duration/ofSeconds timeout))
                              (.header "Content-Type" content-type))
          request-builder (reduce (fn [req [k v]] (.header req k v)) request-builder headers)
          request (case method
                    :get (.GET request-builder)
                    :delete (.DELETE request-builder)
                    :post (.POST request-builder (HttpRequest$BodyPublishers/ofString encoded-body))
                    :put (.PUT request-builder (HttpRequest$BodyPublishers/ofString encoded-body))
                    (throw (IllegalArgumentException. (str "Unsupported HTTP method: " method))))
          response (.send client (.build request) (HttpResponse$BodyHandlers/ofString))
          status (.statusCode response)
          request-id (extract-request-id response)
          parsed-body (if (= as :json)
                        (parse-response-body (.body response))
                        (.body response))]

      (cond
        ;; JSON parse error
        (:parse-error parsed-body)
        {:cognitect.anomalies/category :cognitect.anomalies/fault
         :cognitect.anomalies/message "Failed to parse response body"
         :http/status status
         :stripe/request-id request-id
         :error/raw-body (:raw-body parsed-body)}

        ;; HTTP error (4xx, 5xx)
        (>= status 400)
        (error/build-anomaly status parsed-body request-id)

        ;; Success
        :else
        (cond-> {:status status :body parsed-body}
          request-id (assoc :stripe/request-id request-id))))

    (catch Exception e
      (error/exception->anomaly e))))

;;; ---------------------------------------------------------------------------
;;; Stripe Request
;;; ---------------------------------------------------------------------------

(defn interpolate-endpoint
  "Replaces path parameter placeholders in endpoint template."
  [endpoint path-params]
  (reduce (fn [s [k v]]
            (string/replace s (str "{" (name k) "}") (str v)))
          endpoint
          path-params))

(defn stripe-request
  "Makes a request to the Stripe API.

   Params:
     :endpoint      - API endpoint path (e.g. \"/v1/customers\")
     :path-params   - Map of path parameter replacements
     :query-params  - Map of query parameters
     :body          - Request body (for POST/PUT)
     :idempotency-key - Optional idempotency key for safe retries

   Returns success map or anomaly map on error."
  [method params]
  (let [raw-endpoint (:endpoint params)
        path-params (:path-params params)
        endpoint (if path-params
                   (interpolate-endpoint raw-endpoint path-params)
                   raw-endpoint)
        url (str *stripe-base-url* endpoint)
        idempotency-key (:idempotency-key params)
        base-headers {"Authorization" (str "Bearer " api/*stripe-api-key*)
                      "Stripe-Version" *stripe-version*
                      "User-Agent" user-agent}
        headers (cond-> base-headers
                  idempotency-key (assoc "Idempotency-Key" idempotency-key))]
    (send method url
          (-> params
              (dissoc :endpoint :path-params :idempotency-key)
              (assoc :headers headers)))))
