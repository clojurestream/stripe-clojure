(ns stream.clojure.stripe.e2e-test
  "End-to-end tests against real Stripe test mode API.

   These tests only run in CI with STRIPE_TEST_KEY secret.
   They verify actual API behavior that stripe-mock might not cover.

   To run locally (not recommended, uses real API quota):
   STRIPE_TEST_KEY=sk_test_xxx clojure -M:test-e2e"
  (:require
    [clojure.string :as string]
    [clojure.test :refer :all]
    [stream.clojure.stripe.api :as stripe]
    [stream.clojure.stripe.api.customers :as customers]
    [stream.clojure.stripe.api.products :as products]
    [stream.clojure.stripe.api.prices :as prices]
    [stream.clojure.stripe.error :as error]))

(def stripe-test-key (System/getenv "STRIPE_TEST_KEY"))

(defn e2e-available? []
  (and stripe-test-key
       (string/starts-with? stripe-test-key "sk_test_")))

(defn with-stripe-test-key [f]
  (if (e2e-available?)
    (binding [stripe/*stripe-api-key* stripe-test-key]
      (f))
    (println "SKIPPING E2E tests - STRIPE_TEST_KEY not set or invalid")))

(use-fixtures :once with-stripe-test-key)

;;; ---------------------------------------------------------------------------
;;; Customer Lifecycle Test
;;; ---------------------------------------------------------------------------

(deftest customer-lifecycle-test
  (when (e2e-available?)
    (testing "Create, retrieve, update, and delete customer"
      (let [;; Create
            create-result (customers/create {:body {:email "e2e-test@example.com"
                                                    :name "E2E Test Customer"
                                                    :metadata {:test "true"}}})
            _ (is (not (error/anomaly? create-result))
                  (str "Create failed: " create-result))
            customer-id (get-in create-result [:body :id])]

        (is (some? customer-id) "Customer ID should be present")
        (is (= "e2e-test@example.com" (get-in create-result [:body :email])))

        ;; Retrieve
        (let [retrieve-result (customers/retrieve-customer {:customer-id customer-id})]
          (is (not (error/anomaly? retrieve-result))
              (str "Retrieve failed: " retrieve-result))
          (is (= customer-id (get-in retrieve-result [:body :id]))))

        ;; Update
        (let [update-result (customers/update-customer {:customer-id customer-id
                                                        :body {:name "Updated E2E Customer"}})]
          (is (not (error/anomaly? update-result))
              (str "Update failed: " update-result))
          (is (= "Updated E2E Customer" (get-in update-result [:body :name]))))

        ;; Delete
        (let [delete-result (customers/delete-customer {:customer-id customer-id})]
          (is (not (error/anomaly? delete-result))
              (str "Delete failed: " delete-result))
          (is (true? (get-in delete-result [:body :deleted]))))))))

;;; ---------------------------------------------------------------------------
;;; Product and Price Test
;;; ---------------------------------------------------------------------------

(deftest product-price-test
  (when (e2e-available?)
    (testing "Create product with price"
      (let [;; Create product
            product-result (products/create {:body {:name "E2E Test Product"
                                                    :metadata {:test "true"}}})
            _ (is (not (error/anomaly? product-result))
                  (str "Product create failed: " product-result))
            product-id (get-in product-result [:body :id])]

        (is (some? product-id) "Product ID should be present")

        ;; Create price for product
        (let [price-result (prices/create {:body {:product product-id
                                                  :unit_amount 1999
                                                  :currency "usd"
                                                  :recurring {:interval "month"}}})]
          (is (not (error/anomaly? price-result))
              (str "Price create failed: " price-result))
          (is (= 1999 (get-in price-result [:body :unit_amount])))
          (is (= "month" (get-in price-result [:body :recurring :interval]))))

        ;; Archive product (cleanup)
        (let [archive-result (products/update-id {:id product-id
                                                  :body {:active false}})]
          (is (not (error/anomaly? archive-result))
              (str "Product archive failed: " archive-result)))))))

;;; ---------------------------------------------------------------------------
;;; Error Handling Test
;;; ---------------------------------------------------------------------------

(deftest error-handling-test
  (when (e2e-available?)
    (testing "Invalid customer ID returns not-found"
      (let [result (customers/retrieve-customer {:customer-id "cus_nonexistent_12345"})]
        (is (error/anomaly? result) "Should return an anomaly")
        (is (= :cognitect.anomalies/not-found (error/category result)))))

    (testing "Invalid API key returns forbidden"
      (binding [stripe/*stripe-api-key* "sk_test_invalid"]
        (let [result (customers/list-all {:query-params {:limit 1}})]
          (is (error/anomaly? result) "Should return an anomaly")
          (is (= :cognitect.anomalies/forbidden (error/category result))))))))

;;; ---------------------------------------------------------------------------
;;; List with Pagination Test
;;; ---------------------------------------------------------------------------

(deftest list-pagination-test
  (when (e2e-available?)
    (testing "List customers with limit"
      (let [result (customers/list-all {:query-params {:limit 3}})]
        (is (not (error/anomaly? result)) (str "List failed: " result))
        (is (= "list" (get-in result [:body :object])))
        (is (<= (count (get-in result [:body :data])) 3))))))
