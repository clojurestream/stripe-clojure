(ns stream.clojure.stripe.error-test
  (:require [clojure.test :refer :all]
            [stream.clojure.stripe.error :as error]))

(deftest status->category-test
  (testing "Maps HTTP status codes to correct anomaly categories"
    (is (= :cognitect.anomalies/incorrect (error/status->category 400)))
    (is (= :cognitect.anomalies/forbidden (error/status->category 401)))
    (is (= :cognitect.anomalies/incorrect (error/status->category 402)))
    (is (= :cognitect.anomalies/forbidden (error/status->category 403)))
    (is (= :cognitect.anomalies/not-found (error/status->category 404)))
    (is (= :cognitect.anomalies/conflict (error/status->category 409)))
    (is (= :cognitect.anomalies/busy (error/status->category 429)))
    (is (= :cognitect.anomalies/fault (error/status->category 500)))
    (is (= :cognitect.anomalies/unavailable (error/status->category 502)))
    (is (= :cognitect.anomalies/unavailable (error/status->category 503)))
    (is (= :cognitect.anomalies/unavailable (error/status->category 504))))

  (testing "Falls back to range-based categories for unknown status codes"
    (is (= :cognitect.anomalies/incorrect (error/status->category 418))) ; I'm a teapot
    (is (= :cognitect.anomalies/fault (error/status->category 599))))

  (testing "Returns nil for success status codes"
    (is (nil? (error/status->category 200)))
    (is (nil? (error/status->category 201)))
    (is (nil? (error/status->category 204)))))

(deftest anomaly?-test
  (testing "Detects anomaly responses"
    (is (error/anomaly? {:cognitect.anomalies/category :cognitect.anomalies/fault}))
    (is (error/anomaly? {:cognitect.anomalies/category :cognitect.anomalies/not-found
                         :cognitect.anomalies/message "Not found"})))

  (testing "Returns false for success responses"
    (is (not (error/anomaly? {:status 200 :body {}})))
    (is (not (error/anomaly? {})))
    (is (not (error/anomaly? nil)))))

(deftest retryable?-test
  (testing "Identifies retryable anomalies"
    (is (error/retryable? {:cognitect.anomalies/category :cognitect.anomalies/busy}))
    (is (error/retryable? {:cognitect.anomalies/category :cognitect.anomalies/unavailable}))
    (is (error/retryable? {:cognitect.anomalies/category :cognitect.anomalies/interrupted})))

  (testing "Returns false for non-retryable anomalies"
    (is (not (error/retryable? {:cognitect.anomalies/category :cognitect.anomalies/incorrect})))
    (is (not (error/retryable? {:cognitect.anomalies/category :cognitect.anomalies/forbidden})))
    (is (not (error/retryable? {:cognitect.anomalies/category :cognitect.anomalies/not-found})))
    (is (not (error/retryable? {:cognitect.anomalies/category :cognitect.anomalies/conflict})))
    (is (not (error/retryable? {:cognitect.anomalies/category :cognitect.anomalies/fault}))))

  (testing "Returns false for success responses"
    (is (not (error/retryable? {:status 200 :body {}})))))

(deftest accessor-functions-test
  (let [anomaly {:cognitect.anomalies/category :cognitect.anomalies/incorrect
                 :cognitect.anomalies/message "Your card was declined."
                 :stripe/type "card_error"
                 :stripe/code "card_declined"
                 :stripe/decline-code "insufficient_funds"}]

    (testing "category returns the anomaly category"
      (is (= :cognitect.anomalies/incorrect (error/category anomaly))))

    (testing "message returns the error message"
      (is (= "Your card was declined." (error/message anomaly))))

    (testing "stripe-error-type returns Stripe error type"
      (is (= "card_error" (error/stripe-error-type anomaly))))

    (testing "stripe-error-code returns Stripe error code"
      (is (= "card_declined" (error/stripe-error-code anomaly))))

    (testing "decline-code returns card decline code"
      (is (= "insufficient_funds" (error/decline-code anomaly)))))

  (testing "Accessors return nil for missing keys"
    (is (nil? (error/category {})))
    (is (nil? (error/stripe-error-type {:status 200})))
    (is (nil? (error/decline-code {:stripe/type "api_error"})))))

(deftest parse-stripe-error-test
  (testing "Parses complete Stripe error response"
    (let [body {:error {:type "card_error"
                        :code "card_declined"
                        :message "Your card was declined."
                        :param "source"
                        :decline_code "insufficient_funds"
                        :doc_url "https://stripe.com/docs/error-codes/card-declined"
                        :charge "ch_xxx"
                        :payment_intent "pi_xxx"
                        :payment_method "pm_xxx"}}
          parsed (error/parse-stripe-error body)]
      (is (= "card_error" (:stripe/type parsed)))
      (is (= "card_declined" (:stripe/code parsed)))
      (is (= "Your card was declined." (:stripe/message parsed)))
      (is (= "source" (:stripe/param parsed)))
      (is (= "insufficient_funds" (:stripe/decline-code parsed)))
      (is (= "https://stripe.com/docs/error-codes/card-declined" (:stripe/doc-url parsed)))
      (is (= "ch_xxx" (:stripe/charge parsed)))
      (is (= "pi_xxx" (:stripe/payment-intent parsed)))
      (is (= "pm_xxx" (:stripe/payment-method parsed)))))

  (testing "Parses minimal Stripe error"
    (let [body {:error {:type "invalid_request_error"
                        :message "Invalid API Key"}}
          parsed (error/parse-stripe-error body)]
      (is (= "invalid_request_error" (:stripe/type parsed)))
      (is (= "Invalid API Key" (:stripe/message parsed)))
      (is (nil? (:stripe/code parsed)))
      (is (nil? (:stripe/decline-code parsed)))))

  (testing "Returns nil when no error in body"
    (is (nil? (error/parse-stripe-error {:id "cus_xxx"})))
    (is (nil? (error/parse-stripe-error {})))))

(deftest build-anomaly-test
  (testing "Builds anomaly from Stripe error response"
    (let [body {:error {:type "card_error"
                        :code "card_declined"
                        :message "Your card was declined."}}
          anomaly (error/build-anomaly 402 body "req_123")]
      (is (= :cognitect.anomalies/incorrect (:cognitect.anomalies/category anomaly)))
      (is (= "Your card was declined." (:cognitect.anomalies/message anomaly)))
      (is (= 402 (:http/status anomaly)))
      (is (= "card_error" (:stripe/type anomaly)))
      (is (= "card_declined" (:stripe/code anomaly)))
      (is (= "req_123" (:stripe/request-id anomaly)))))

  (testing "Stripe error type takes precedence over HTTP status for category"
    (let [body {:error {:type "rate_limit_error" :message "Too many requests"}}
          anomaly (error/build-anomaly 429 body nil)]
      (is (= :cognitect.anomalies/busy (:cognitect.anomalies/category anomaly)))))

  (testing "Falls back to HTTP status when no Stripe type"
    (let [anomaly (error/build-anomaly 404 {} nil)]
      (is (= :cognitect.anomalies/not-found (:cognitect.anomalies/category anomaly)))
      (is (= "HTTP 404 error" (:cognitect.anomalies/message anomaly)))))

  (testing "Does not include request-id when nil"
    (let [anomaly (error/build-anomaly 500 {} nil)]
      (is (not (contains? anomaly :stripe/request-id))))))

(deftest exception->anomaly-test
  (testing "Timeout exceptions map to :interrupted"
    (let [e (java.net.http.HttpTimeoutException. "Read timed out")
          anomaly (error/exception->anomaly e)]
      (is (= :cognitect.anomalies/interrupted (:cognitect.anomalies/category anomaly)))
      (is (= "Read timed out" (:cognitect.anomalies/message anomaly)))
      (is (= "HttpTimeoutException" (:error/exception-class anomaly)))))

  (testing "Connection exceptions map to :unavailable"
    (let [e (java.net.ConnectException. "Connection refused")
          anomaly (error/exception->anomaly e)]
      (is (= :cognitect.anomalies/unavailable (:cognitect.anomalies/category anomaly)))
      (is (= "Connection refused" (:cognitect.anomalies/message anomaly)))))

  (testing "Unknown host maps to :unavailable"
    (let [e (java.net.UnknownHostException. "api.stripe.com")
          anomaly (error/exception->anomaly e)]
      (is (= :cognitect.anomalies/unavailable (:cognitect.anomalies/category anomaly)))))

  (testing "Generic IOException maps to :unavailable"
    (let [e (java.io.IOException. "Network error")
          anomaly (error/exception->anomaly e)]
      (is (= :cognitect.anomalies/unavailable (:cognitect.anomalies/category anomaly)))))

  (testing "Unknown exceptions map to :fault"
    (let [e (RuntimeException. "Something went wrong")
          anomaly (error/exception->anomaly e)]
      (is (= :cognitect.anomalies/fault (:cognitect.anomalies/category anomaly)))
      (is (= "Something went wrong" (:cognitect.anomalies/message anomaly)))
      (is (= "RuntimeException" (:error/exception-class anomaly)))))

  (testing "Handles nil message gracefully"
    (let [e (RuntimeException.)
          anomaly (error/exception->anomaly e)]
      (is (= "Unknown error" (:cognitect.anomalies/message anomaly))))))
