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

(defn build-query-string [qp]
  (->> qp
    (map (fn [[k v]]
           (str (name k) "=" (URLEncoder/encode (str v) "UTF-8"))))
    (clojure.string/join "&")))

(defonce ^HttpClient client
  (-> (HttpClient/newBuilder)
    (.version HttpClient$Version/HTTP_2)
    (.connectTimeout (Duration/ofSeconds 10))
    (.build)))

(defn send
  [method url {:keys [headers body as timeout query-params] :or {headers {}, as :json, timeout 10}}]
  (let [url (if query-params (str url "?" (build-query-string query-params)))
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
    (prn :req-builder request-builder)
    (try
      {:status (.statusCode response)
       :body (if (= as :json)
               (json/read-str (.body response) :key-fn keyword)
               (.body response))}
      (catch Exception e
        {:error (.getMessage e)}))))

(def stripe-base-url "https://api.stripe.com/")

(defn stripe-request
  [method params]
  (send method (str stripe-base-url (:endpoint params))
    (merge {:headers {"Authorization" (str "Bearer " api/*stripe-api-key*)}} params)))