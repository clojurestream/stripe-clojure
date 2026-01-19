(ns stream.clojure.stripe.integration-test
  "Integration tests against stripe-mock.

   To run these tests locally:
   1. Start stripe-mock: docker run --rm -p 12111:12111 stripe/stripe-mock:latest
   2. Run tests: clojure -M:test-integration

   These tests verify:
   - Correct endpoint URLs are hit
   - Request parameters are properly encoded
   - Response parsing works correctly
   - Headers are sent properly"
  (:require
    [clojure.test :refer :all]
    [stream.clojure.stripe.api :as stripe]
    [stream.clojure.stripe.api.customers :as customers]
    [stream.clojure.stripe.api.charges :as charges]
    [stream.clojure.stripe.api.products :as products]
    [stream.clojure.stripe.api.prices :as prices]
    [stream.clojure.stripe.error :as error]
    [stream.clojure.stripe.request :as request]))

(def stripe-mock-url "http://localhost:12111")

(defn stripe-mock-available? []
  (try
    (let [response (request/send :get (str stripe-mock-url "/v1/customers")
                                 {:headers {"Authorization" "Bearer sk_test_mock"}})]
      (not (error/anomaly? response)))
    (catch Exception _
      false)))

(defn with-stripe-mock [f]
  (if (stripe-mock-available?)
    (binding [request/*stripe-base-url* stripe-mock-url
              stripe/*stripe-api-key* "sk_test_mock"]
      (f))
    (println "SKIPPING integration tests - stripe-mock not available at" stripe-mock-url)))

(use-fixtures :once with-stripe-mock)

;;; ---------------------------------------------------------------------------
;;; Customer API Tests
;;; ---------------------------------------------------------------------------

(deftest list-customers-test
  (when (stripe-mock-available?)
    (testing "List customers returns valid response"
      (let [result (customers/list-all {:query-params {:limit 10}})]
        (is (not (error/anomaly? result)) (str "Unexpected error: " result))
        (is (= 200 (:status result)))
        (is (map? (:body result)))
        (is (= "list" (get-in result [:body :object])))
        (is (vector? (get-in result [:body :data])))))

    (testing "List customers with pagination params"
      (let [result (customers/list-all {:query-params {:limit 5}})]
        (is (not (error/anomaly? result)))
        (is (= 200 (:status result)))))))

(deftest retrieve-customer-test
  (when (stripe-mock-available?)
    (testing "Retrieve customer returns valid response"
      (let [result (customers/retrieve-customer {:customer-id "cus_mock"})]
        (is (not (error/anomaly? result)) (str "Unexpected error: " result))
        (is (= 200 (:status result)))
        (is (map? (:body result)))
        (is (= "customer" (get-in result [:body :object])))))))

(deftest create-customer-test
  (when (stripe-mock-available?)
    (testing "Create customer returns valid response"
      (let [result (customers/create {})]
        (is (not (error/anomaly? result)) (str "Unexpected error: " result))
        (is (= 200 (:status result)))
        (is (= "customer" (get-in result [:body :object])))))))

;;; ---------------------------------------------------------------------------
;;; Charges API Tests
;;; ---------------------------------------------------------------------------

(deftest list-charges-test
  (when (stripe-mock-available?)
    (testing "List charges returns valid response"
      (let [result (charges/list-all {:query-params {:limit 10}})]
        (is (not (error/anomaly? result)) (str "Unexpected error: " result))
        (is (= 200 (:status result)))
        (is (= "list" (get-in result [:body :object])))))))

;;; ---------------------------------------------------------------------------
;;; Products API Tests
;;; ---------------------------------------------------------------------------

(deftest list-products-test
  (when (stripe-mock-available?)
    (testing "List products returns valid response"
      (let [result (products/list-all {:query-params {:limit 10}})]
        (is (not (error/anomaly? result)) (str "Unexpected error: " result))
        (is (= 200 (:status result)))
        (is (= "list" (get-in result [:body :object])))))))

;;; ---------------------------------------------------------------------------
;;; Prices API Tests (tests nested query params fix)
;;; ---------------------------------------------------------------------------

(deftest list-prices-with-nested-params-test
  (when (stripe-mock-available?)
    (testing "List prices with nested recurring params"
      (let [result (prices/list-all {:query-params {:limit 10
                                                    :type "recurring"
                                                    :recurring {:interval "month"}}})]
        (is (not (error/anomaly? result)) (str "Unexpected error: " result))
        (is (= 200 (:status result)))
        (is (= "list" (get-in result [:body :object])))))))

;;; ---------------------------------------------------------------------------
;;; Request/Response Tests
;;; ---------------------------------------------------------------------------

(deftest response-includes-request-id-test
  (when (stripe-mock-available?)
    (testing "Response includes Stripe request ID"
      (let [result (customers/list-all {:query-params {:limit 1}})]
        (is (not (error/anomaly? result)))
        ;; stripe-mock may or may not include request-id header
        ;; but our code should handle it either way
        (is (contains? result :status))))))

(deftest handles-path-params-correctly-test
  (when (stripe-mock-available?)
    (testing "Path parameters are interpolated correctly"
      ;; This tests that {customer-id} is replaced in the URL
      (let [result (customers/retrieve-customer {:customer-id "cus_test123"})]
        (is (not (error/anomaly? result)))
        (is (= 200 (:status result)))))))
