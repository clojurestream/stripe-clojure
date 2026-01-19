(ns stream.clojure.stripe.request-test
  (:require
    [clojure.string :as string]
    [clojure.test :refer :all]
    [stream.clojure.stripe.request :as request]
    ))

;;; ---------------------------------------------------------------------------
;;; flatten-params tests
;;; ---------------------------------------------------------------------------

(deftest flatten-params-test
  (testing "Simple flat map"
    (is (= [["foo" 1] ["bar" 2]]
           (request/flatten-params {:foo 1 :bar 2}))))

  (testing "Nested map"
    (is (= [["foo" 1] ["bar[baz]" 2]]
           (request/flatten-params {:foo 1 :bar {:baz 2}}))))

  (testing "Deeply nested map"
    (is (= [["a[b][c][d]" "deep"]]
           (request/flatten-params {:a {:b {:c {:d "deep"}}}}))))

  (testing "Simple array"
    (is (= [["expand[0]" "data.customer"] ["expand[1]" "data.invoice"]]
           (request/flatten-params {:expand ["data.customer" "data.invoice"]}))))

  (testing "Array of maps"
    (is (= [["items[0][price]" "price_123"] ["items[1][price]" "price_456"]]
           (request/flatten-params {:items [{:price "price_123"} {:price "price_456"}]}))))

  (testing "Array of maps with multiple keys"
    (let [result (request/flatten-params {:line_items [{:price "price_123" :quantity 1}
                                                       {:price "price_456" :quantity 2}]})]
      (is (some #(= % ["line_items[0][price]" "price_123"]) result))
      (is (some #(= % ["line_items[0][quantity]" 1]) result))
      (is (some #(= % ["line_items[1][price]" "price_456"]) result))
      (is (some #(= % ["line_items[1][quantity]" 2]) result))))

  (testing "Mixed nested structure"
    (let [result (request/flatten-params {:active true
                                          :recurring {:interval "month" :usage_type "licensed"}})]
      (is (some #(= % ["active" true]) result))
      (is (some #(= % ["recurring[interval]" "month"]) result))
      (is (some #(= % ["recurring[usage_type]" "licensed"]) result))))

  (testing "Empty map"
    (is (= [] (request/flatten-params {}))))

  (testing "String keys work"
    (is (= [["foo" 1]]
           (request/flatten-params {"foo" 1}))))

  (testing "Boolean values"
    (is (= [["active" true] ["archived" false]]
           (request/flatten-params {:active true :archived false}))))

  (testing "Nil values"
    (is (= [["foo" nil]]
           (request/flatten-params {:foo nil})))))

;;; ---------------------------------------------------------------------------
;;; build-query-string tests
;;; ---------------------------------------------------------------------------

(deftest build-query-string-test
  (testing "Simple params"
    (is (= "foo=bar&baz=123"
           (request/build-query-string {:foo "bar" :baz 123}))))

  (testing "URL encodes special characters"
    (is (= "email=test%40example.com"
           (request/build-query-string {:email "test@example.com"}))))

  (testing "URL encodes spaces"
    (is (= "name=John+Doe"
           (request/build-query-string {:name "John Doe"}))))

  (testing "Nested params with bracket notation"
    (is (= "recurring[interval]=month"
           (request/build-query-string {:recurring {:interval "month"}}))))

  (testing "Array params"
    (is (= "expand[0]=data.customer&expand[1]=data.invoice"
           (request/build-query-string {:expand ["data.customer" "data.invoice"]}))))

  (testing "Empty params"
    (is (= "" (request/build-query-string {}))))

  (testing "Boolean values converted to strings"
    (is (= "active=true"
           (request/build-query-string {:active true})))))

;;; ---------------------------------------------------------------------------
;;; build-form-body tests
;;; ---------------------------------------------------------------------------

(deftest build-form-body-test
  (testing "Form body is same as query string"
    (is (= (request/build-query-string {:amount 1000 :currency "usd"})
           (request/build-form-body {:amount 1000 :currency "usd"}))))

  (testing "Complex form body"
    (let [body (request/build-form-body {:amount 2000
                                         :currency "usd"
                                         :source "tok_visa"
                                         :metadata {:order_id "order_123"}})]
      (is (string/includes? body "amount=2000"))
      (is (string/includes? body "currency=usd"))
      (is (string/includes? body "source=tok_visa"))
      (is (string/includes? body "metadata[order_id]=order_123")))))

;;; ---------------------------------------------------------------------------
;;; interpolate-endpoint tests
;;; ---------------------------------------------------------------------------

(deftest interpolate-endpoint-test
  (testing "Single path parameter"
    (is (= "/v1/customers/cus_123"
           (request/interpolate-endpoint "/v1/customers/{customer-id}" {:customer-id "cus_123"}))))

  (testing "Multiple path parameters"
    (is (= "/v1/customers/cus_123/sources/src_456"
           (request/interpolate-endpoint "/v1/customers/{customer-id}/sources/{source-id}"
                                         {:customer-id "cus_123" :source-id "src_456"}))))

  (testing "No path parameters"
    (is (= "/v1/customers"
           (request/interpolate-endpoint "/v1/customers" {}))))

  (testing "Path parameter with keyword key"
    (is (= "/v1/charges/ch_abc"
           (request/interpolate-endpoint "/v1/charges/{charge-id}" {:charge-id "ch_abc"}))))

  (testing "Preserves endpoint when no matching params"
    (is (= "/v1/customers/{customer-id}"
           (request/interpolate-endpoint "/v1/customers/{customer-id}" {:other "value"})))))

;;; ---------------------------------------------------------------------------
;;; Configuration tests
;;; ---------------------------------------------------------------------------

(deftest configuration-test
  (testing "*stripe-base-url* is correct"
    (is (= "https://api.stripe.com" request/*stripe-base-url*)))

  (testing "user-agent contains version info"
    (is (string/includes? request/user-agent "stripe-clojure/"))
    (is (string/includes? request/user-agent "clojure/")))

  (testing "stripe-version is a dynamic var"
    (is (bound? #'request/*stripe-version*))
    (is (string? request/*stripe-version*)))

  (testing "stripe-version can be rebound"
    (binding [request/*stripe-version* "2024-01-01"]
      (is (= "2024-01-01" request/*stripe-version*)))))
