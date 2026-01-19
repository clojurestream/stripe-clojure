(ns stream.clojure.stripe.webhook-test
  (:require
    [clojure.test :refer :all]
    [stream.clojure.stripe.webhook :as webhook]))

(def test-secret "whsec_test_secret_key_for_testing")

(def test-payload
  "{\"id\":\"evt_test123\",\"type\":\"customer.created\",\"data\":{\"object\":{\"id\":\"cus_test\"}}}")

;;; ---------------------------------------------------------------------------
;;; verify-header tests
;;; ---------------------------------------------------------------------------

(deftest verify-header-test
  (testing "Valid signature is accepted"
    (let [header (webhook/generate-test-header test-payload test-secret {:timestamp 1000})
          result (webhook/verify-header test-payload header test-secret {:timestamp 1000})]
      (is (not (webhook/verification-error? result)))
      (is (= 1000 (:timestamp result)))))

  (testing "Missing header returns error"
    (let [result (webhook/verify-header test-payload nil test-secret)]
      (is (webhook/verification-error? result))
      (is (= :invalid-header (:error/code result)))))

  (testing "Empty header returns error"
    (let [result (webhook/verify-header test-payload "" test-secret)]
      (is (webhook/verification-error? result))
      (is (= :invalid-header (:error/code result)))))

  (testing "Missing timestamp returns error"
    (let [result (webhook/verify-header test-payload "v1=abc123" test-secret)]
      (is (webhook/verification-error? result))
      (is (= :invalid-header (:error/code result)))))

  (testing "Missing v1 signature returns error"
    (let [result (webhook/verify-header test-payload "t=1000" test-secret)]
      (is (webhook/verification-error? result))
      (is (= :invalid-header (:error/code result)))))

  (testing "Invalid signature returns error"
    (let [result (webhook/verify-header test-payload "t=1000,v1=invalid_sig" test-secret {:timestamp 1000})]
      (is (webhook/verification-error? result))
      (is (= :invalid-signature (:error/code result)))))

  (testing "Wrong secret returns error"
    (let [header (webhook/generate-test-header test-payload test-secret {:timestamp 1000})
          result (webhook/verify-header test-payload header "wrong_secret" {:timestamp 1000})]
      (is (webhook/verification-error? result))
      (is (= :invalid-signature (:error/code result)))))

  (testing "Modified payload returns error"
    (let [header (webhook/generate-test-header test-payload test-secret {:timestamp 1000})
          modified-payload (str test-payload " ")
          result (webhook/verify-header modified-payload header test-secret {:timestamp 1000})]
      (is (webhook/verification-error? result))
      (is (= :invalid-signature (:error/code result)))))

  (testing "Expired timestamp returns error"
    (let [old-timestamp 1000
          current-timestamp (+ old-timestamp 400)  ;; 400 seconds later (> 300 default tolerance)
          header (webhook/generate-test-header test-payload test-secret {:timestamp old-timestamp})
          result (webhook/verify-header test-payload header test-secret {:timestamp current-timestamp})]
      (is (webhook/verification-error? result))
      (is (= :timestamp-expired (:error/code result)))))

  (testing "Timestamp within tolerance is accepted"
    (let [old-timestamp 1000
          current-timestamp (+ old-timestamp 200)  ;; 200 seconds later (< 300 default tolerance)
          header (webhook/generate-test-header test-payload test-secret {:timestamp old-timestamp})
          result (webhook/verify-header test-payload header test-secret {:timestamp current-timestamp})]
      (is (not (webhook/verification-error? result)))
      (is (= old-timestamp (:timestamp result)))))

  (testing "Custom tolerance is respected"
    (let [old-timestamp 1000
          current-timestamp (+ old-timestamp 50)
          header (webhook/generate-test-header test-payload test-secret {:timestamp old-timestamp})
          ;; With 30 second tolerance, 50 seconds old should fail
          result (webhook/verify-header test-payload header test-secret
                                        {:timestamp current-timestamp :tolerance 30})]
      (is (webhook/verification-error? result))
      (is (= :timestamp-expired (:error/code result)))))

  (testing "Multiple v1 signatures - first matches"
    (let [valid-header (webhook/generate-test-header test-payload test-secret {:timestamp 1000})
          ;; Add extra invalid signature
          header (str valid-header ",v1=invalid_sig")
          result (webhook/verify-header test-payload header test-secret {:timestamp 1000})]
      (is (not (webhook/verification-error? result)))))

  (testing "Multiple v1 signatures - second matches"
    (let [valid-sig (-> (webhook/generate-test-header test-payload test-secret {:timestamp 1000})
                        (subs 7))  ;; Remove "t=1000," prefix to get just v1=...
          header (str "t=1000,v1=invalid_sig," valid-sig)
          result (webhook/verify-header test-payload header test-secret {:timestamp 1000})]
      (is (not (webhook/verification-error? result))))))

;;; ---------------------------------------------------------------------------
;;; construct-event tests
;;; ---------------------------------------------------------------------------

(deftest construct-event-test
  (testing "Valid signature returns parsed event"
    (let [header (webhook/generate-test-header test-payload test-secret {:timestamp 1000})
          result (webhook/construct-event test-payload header test-secret {:timestamp 1000})]
      (is (not (webhook/verification-error? result)))
      (is (= "evt_test123" (:id result)))
      (is (= "customer.created" (:type result)))
      (is (= "cus_test" (get-in result [:data :object :id])))))

  (testing "Invalid signature returns error"
    (let [result (webhook/construct-event test-payload "t=1000,v1=invalid" test-secret {:timestamp 1000})]
      (is (webhook/verification-error? result))
      (is (= :invalid-signature (:error/code result)))))

  (testing "Invalid JSON returns error"
    (let [bad-payload "not valid json"
          header (webhook/generate-test-header bad-payload test-secret {:timestamp 1000})
          result (webhook/construct-event bad-payload header test-secret {:timestamp 1000})]
      (is (webhook/verification-error? result))
      (is (= :invalid-payload (:error/code result))))))

;;; ---------------------------------------------------------------------------
;;; generate-test-header tests
;;; ---------------------------------------------------------------------------

(deftest generate-test-header-test
  (testing "Generates valid header format"
    (let [header (webhook/generate-test-header test-payload test-secret {:timestamp 1234567890})]
      (is (clojure.string/starts-with? header "t=1234567890,v1="))
      ;; t=1234567890,v1= (17 chars) + 64 hex chars = 81 total
      (is (re-matches #"t=\d+,v1=[a-f0-9]{64}" header))))

  (testing "Same inputs produce same output"
    (let [header1 (webhook/generate-test-header test-payload test-secret {:timestamp 1000})
          header2 (webhook/generate-test-header test-payload test-secret {:timestamp 1000})]
      (is (= header1 header2))))

  (testing "Different payloads produce different signatures"
    (let [header1 (webhook/generate-test-header "payload1" test-secret {:timestamp 1000})
          header2 (webhook/generate-test-header "payload2" test-secret {:timestamp 1000})]
      (is (not= header1 header2))))

  (testing "Different secrets produce different signatures"
    (let [header1 (webhook/generate-test-header test-payload "secret1" {:timestamp 1000})
          header2 (webhook/generate-test-header test-payload "secret2" {:timestamp 1000})]
      (is (not= header1 header2))))

  (testing "Different timestamps produce different signatures"
    (let [header1 (webhook/generate-test-header test-payload test-secret {:timestamp 1000})
          header2 (webhook/generate-test-header test-payload test-secret {:timestamp 2000})]
      (is (not= header1 header2)))))

;;; ---------------------------------------------------------------------------
;;; verification-error? tests
;;; ---------------------------------------------------------------------------

(deftest verification-error?-test
  (testing "Error map is detected"
    (is (webhook/verification-error? {:error/code :test :error/message "test"})))

  (testing "Event map is not detected as error"
    (is (not (webhook/verification-error? {:id "evt_123" :type "test"}))))

  (testing "Empty map is not detected as error"
    (is (not (webhook/verification-error? {})))))
