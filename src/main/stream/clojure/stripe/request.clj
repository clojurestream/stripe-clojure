(ns stream.clojure.stripe.request
  (:refer-clojure :exclude [send])
  (:require [clojure.string :as string]
            [clojure.data.json :as json]
            [stream.clojure.stripe.api :as api])
  (:import [java.net.http HttpClient HttpRequest HttpClient$Version]
           [java.net.http HttpRequest$BodyPublishers HttpResponse$BodyHandlers]
           [java.net URI URLEncoder]
           [java.time Duration]))

(defn kebabify-key [k]
  (-> k name
    (string/replace #"([a-z])([A-Z])" "$1-$2")
    (string/lower-case)))

(defn flatten-params
  "Flattens nested maps into bracket notation for Stripe API.
   {:foo 1 :bar {:baz 2}} => [[\"foo\" 1] [\"bar[baz]\" 2]]"
  ([params] (flatten-params params nil))
  ([params prefix]
   (reduce-kv
     (fn [acc k v]
       (let [key-name (name k)
             full-key (if prefix
                        (str prefix "[" key-name "]")
                        key-name)]
         (if (map? v)
           (into acc (flatten-params v full-key))
           (conj acc [full-key v]))))
     []
     params)))

(defn build-query-string [qp]
  (->> (flatten-params qp)
       (map (fn [[k v]]
              (str k "=" (URLEncoder/encode (str v) "UTF-8"))))
       (string/join "&")))

(defonce ^HttpClient client
  (-> (HttpClient/newBuilder)
    (.version HttpClient$Version/HTTP_2)
    (.connectTimeout (Duration/ofSeconds 10))
    (.build)))

(defn send
  [method url {:keys [headers body as timeout query-params] :or {headers {}, as :json, timeout 10}}]
  (let [url (if query-params
              (str url "?" (build-query-string query-params))
              url)
        request-builder (-> (HttpRequest/newBuilder)
                          (.uri (URI/create url))
                          (.timeout (Duration/ofSeconds timeout))
                          (.header "Content-Type" "application/json"))
        request-builder (reduce (fn [req [k v]] (.header req k v)) request-builder headers)
        json-body (cond
                    (map? body) (json/write-str body)
                    (string? body) body
                    (nil? body) ""
                    :else (throw (IllegalArgumentException. (str "Invalid body type: " (type body)))))
        request (cond
                  (= method :get) (.GET request-builder)
                  (= method :delete) (.DELETE request-builder)
                  (= method :post) (.POST request-builder (HttpRequest$BodyPublishers/ofString json-body))
                  (= method :put) (.PUT request-builder (HttpRequest$BodyPublishers/ofString json-body))
                  :else (throw (IllegalArgumentException. (str "Unsupported HTTP method: " method))))
        response (.send client (.build request) (HttpResponse$BodyHandlers/ofString))]
    (try
      {:status (.statusCode response)
       :body (if (= as :json)
               (json/read-str (.body response) :key-fn keyword)
               (.body response))}
      (catch Exception e
        {:error (.getMessage e)}))))

(def stripe-base-url "https://api.stripe.com")

(defn interpolate-endpoint [endpoint path-params]
  (reduce (fn [s [k v]]
            (string/replace s (str "{" (name k) "}") (str v)))
    endpoint
    path-params))

(defn stripe-request
  [method params]
  (let [raw-endpoint (:endpoint params)
        path-params  (:path-params params)
        endpoint     (if path-params
                       (interpolate-endpoint raw-endpoint path-params)
                       raw-endpoint)
        url          (str stripe-base-url endpoint)]
    (send method url
      (merge {:headers {"Authorization" (str "Bearer " api/*stripe-api-key*)}}
        params))))