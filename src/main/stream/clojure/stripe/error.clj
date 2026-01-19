(ns stream.clojure.stripe.error
  "Structured error handling using Cognitect anomalies pattern.

   Anomaly categories map to Stripe/HTTP errors:
   - :cognitect.anomalies/busy        - 429 Rate limit
   - :cognitect.anomalies/unavailable - 5xx Server errors, connection errors
   - :cognitect.anomalies/interrupted - Request timeout
   - :cognitect.anomalies/incorrect   - 400 Invalid request, card errors
   - :cognitect.anomalies/forbidden   - 401/403 Auth errors
   - :cognitect.anomalies/not-found   - 404 Resource not found
   - :cognitect.anomalies/conflict    - 409 Idempotency errors
   - :cognitect.anomalies/fault       - Unexpected errors, parse failures"
  (:import (java.io IOException)
           (java.net ConnectException UnknownHostException)
           (java.net.http HttpTimeoutException)
           (java.util.concurrent TimeoutException)
           (javax.net.ssl SSLException)))

;;; ---------------------------------------------------------------------------
;;; Category Mappings
;;; ---------------------------------------------------------------------------

(def http-status->category
  "Maps HTTP status codes to anomaly categories."
  {400 :cognitect.anomalies/incorrect
   401 :cognitect.anomalies/forbidden
   402 :cognitect.anomalies/incorrect    ; Payment required (card declined)
   403 :cognitect.anomalies/forbidden
   404 :cognitect.anomalies/not-found
   409 :cognitect.anomalies/conflict     ; Idempotency conflict
   429 :cognitect.anomalies/busy         ; Rate limited
   500 :cognitect.anomalies/fault
   502 :cognitect.anomalies/unavailable
   503 :cognitect.anomalies/unavailable
   504 :cognitect.anomalies/unavailable})

(def stripe-type->category
  "Maps Stripe error types to anomaly categories.
   Takes precedence over HTTP status when available."
  {"api_error"             :cognitect.anomalies/fault
   "card_error"            :cognitect.anomalies/incorrect
   "idempotency_error"     :cognitect.anomalies/conflict
   "invalid_request_error" :cognitect.anomalies/incorrect
   "authentication_error"  :cognitect.anomalies/forbidden
   "rate_limit_error"      :cognitect.anomalies/busy})

(defn status->category
  "Returns anomaly category for HTTP status, with fallback based on range."
  [status]
  (or (get http-status->category status)
      (cond
        (<= 400 status 499) :cognitect.anomalies/incorrect
        (<= 500 status 599) :cognitect.anomalies/fault
        :else nil)))

;;; ---------------------------------------------------------------------------
;;; Predicates
;;; ---------------------------------------------------------------------------

(defn anomaly?
  "Returns true if response contains an anomaly category."
  [response]
  (contains? response :cognitect.anomalies/category))

(defn retryable?
  "Returns true if the anomaly is potentially retryable.
   Categories :busy, :unavailable, and :interrupted may succeed on retry."
  [response]
  (contains? #{:cognitect.anomalies/busy
               :cognitect.anomalies/unavailable
               :cognitect.anomalies/interrupted}
             (:cognitect.anomalies/category response)))

;;; ---------------------------------------------------------------------------
;;; Accessors
;;; ---------------------------------------------------------------------------

(defn category
  "Returns the anomaly category keyword, or nil if not an anomaly."
  [response]
  (:cognitect.anomalies/category response))

(defn message
  "Returns the error message."
  [response]
  (:cognitect.anomalies/message response))

(defn stripe-error-type
  "Returns the Stripe error type string (e.g. \"card_error\"), or nil."
  [response]
  (:stripe/type response))

(defn stripe-error-code
  "Returns the Stripe error code string (e.g. \"card_declined\"), or nil."
  [response]
  (:stripe/code response))

(defn decline-code
  "Returns the card decline code (e.g. \"insufficient_funds\"), or nil."
  [response]
  (:stripe/decline-code response))

;;; ---------------------------------------------------------------------------
;;; Error Parsing
;;; ---------------------------------------------------------------------------

(defn parse-stripe-error
  "Parses a Stripe error response body into namespaced keys.
   Returns nil if no :error key in body."
  [body]
  (when-let [error (:error body)]
    (cond-> {}
      (:type error)           (assoc :stripe/type (:type error))
      (:code error)           (assoc :stripe/code (:code error))
      (:message error)        (assoc :stripe/message (:message error))
      (:param error)          (assoc :stripe/param (:param error))
      (:decline_code error)   (assoc :stripe/decline-code (:decline_code error))
      (:doc_url error)        (assoc :stripe/doc-url (:doc_url error))
      (:charge error)         (assoc :stripe/charge (:charge error))
      (:payment_intent error) (assoc :stripe/payment-intent (:payment_intent error))
      (:payment_method error) (assoc :stripe/payment-method (:payment_method error)))))

(defn build-anomaly
  "Builds an anomaly map from HTTP status, response body, and request-id."
  [status body request-id]
  (let [stripe-error (parse-stripe-error body)
        stripe-type (:stripe/type stripe-error)
        category (or (get stripe-type->category stripe-type)
                     (status->category status)
                     :cognitect.anomalies/fault)
        message (or (:stripe/message stripe-error)
                    (str "HTTP " status " error"))]
    (cond-> {:cognitect.anomalies/category category
             :cognitect.anomalies/message message
             :http/status status}
      stripe-error (merge stripe-error)
      request-id   (assoc :stripe/request-id request-id))))

;;; ---------------------------------------------------------------------------
;;; Exception Handling
;;; ---------------------------------------------------------------------------

(defn exception->anomaly
  "Converts a Java exception to an anomaly map."
  [^Exception e]
  (let [ex-class (.getSimpleName (class e))
        message (.getMessage e)]
    (cond
      ;; Timeout exceptions
      (or (instance? HttpTimeoutException e)
          (instance? TimeoutException e))
      {:cognitect.anomalies/category :cognitect.anomalies/interrupted
       :cognitect.anomalies/message (or message "Request timed out")
       :error/exception-class ex-class}

      ;; Connection errors
      (or (instance? ConnectException e)
          (instance? UnknownHostException e)
          (instance? IOException e))
      {:cognitect.anomalies/category :cognitect.anomalies/unavailable
       :cognitect.anomalies/message (or message "Connection failed")
       :error/exception-class ex-class}

      ;; SSL/TLS errors
      (instance? SSLException e)
      {:cognitect.anomalies/category :cognitect.anomalies/unavailable
       :cognitect.anomalies/message (or message "SSL/TLS error")
       :error/exception-class ex-class}

      ;; Default
      :else
      {:cognitect.anomalies/category :cognitect.anomalies/fault
       :cognitect.anomalies/message (or message "Unknown error")
       :error/exception-class ex-class})))
