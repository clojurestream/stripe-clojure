(ns stream.clojure.stripe.request
  (:require [clojure.data.json :as json])
  (:import [java.net.http HttpClient HttpRequest HttpClient$Version]
           [java.net.http HttpRequest$BodyPublishers HttpResponse$BodyHandlers]
           [java.net URI]
           [java.time Duration]))

(defonce ^HttpClient client
  (-> (HttpClient/newBuilder)
    (.version HttpClient$Version/HTTP_2)
    (.connectTimeout (Duration/ofSeconds 10))
    (.build)))

(defn send
  [method url {:keys [headers body as timeout] :or {headers {}, as :json, timeout 10}}]
  (let [request-builder (-> (HttpRequest/newBuilder)
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

(def stripe-base-url "https://api.stripe.com/")

(defn stripe-request
  [method endpoint params]
  (let [api-key "sk_test_api_key"]
    (send method (str stripe-base-url endpoint)
      (merge {:headers {"Authorization" (str "Bearer" api-key)}} params))))