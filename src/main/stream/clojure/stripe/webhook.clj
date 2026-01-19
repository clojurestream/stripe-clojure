(ns stream.clojure.stripe.webhook
  "Webhook signature verification for Stripe webhooks.

   Stripe signs webhook events using HMAC-SHA256. This namespace provides
   functions to verify signatures and construct verified event objects.

   Usage:
   ```clojure
   (require '[stream.clojure.stripe.webhook :as webhook])

   ;; In your HTTP handler
   (let [payload (slurp (:body request))
         sig-header (get-in request [:headers \"stripe-signature\"])
         result (webhook/construct-event payload sig-header \"whsec_xxx\")]
     (if (webhook/verification-error? result)
       {:status 400 :body \"Invalid signature\"}
       (process-event result)))
   ```"
  (:require
    [clojure.string :as str]
    [jsonista.core :as json])
  (:import
    [javax.crypto Mac]
    [javax.crypto.spec SecretKeySpec]
    [java.nio.charset StandardCharsets]))

;;; ---------------------------------------------------------------------------
;;; Configuration
;;; ---------------------------------------------------------------------------

(def ^:dynamic *default-tolerance*
  "Default timestamp tolerance in seconds (5 minutes)."
  300)

(def json-mapper
  "JSON mapper with keyword keys."
  (json/object-mapper {:decode-key-fn keyword}))

;;; ---------------------------------------------------------------------------
;;; Cryptographic functions
;;; ---------------------------------------------------------------------------

(defn- hex-encode
  "Convert byte array to lowercase hex string."
  [^bytes data]
  (let [sb (StringBuilder.)]
    (doseq [b data]
      (.append sb (format "%02x" (bit-and b 0xff))))
    (.toString sb)))

(defn- compute-signature
  "Compute HMAC-SHA256 signature of payload using secret."
  [^String payload ^String secret]
  (let [mac (Mac/getInstance "HmacSHA256")
        key-spec (SecretKeySpec. (.getBytes secret StandardCharsets/UTF_8) "HmacSHA256")]
    (.init mac key-spec)
    (hex-encode (.doFinal mac (.getBytes payload StandardCharsets/UTF_8)))))

(defn- secure-compare
  "Constant-time string comparison to prevent timing attacks."
  [^String a ^String b]
  (if (not= (count a) (count b))
    false
    (let [a-bytes (.getBytes a StandardCharsets/UTF_8)
          b-bytes (.getBytes b StandardCharsets/UTF_8)]
      (zero? (reduce (fn [acc i]
                       (bit-or acc (bit-xor (aget a-bytes i) (aget b-bytes i))))
                     0
                     (range (alength a-bytes)))))))

;;; ---------------------------------------------------------------------------
;;; Signature header parsing
;;; ---------------------------------------------------------------------------

(defn- parse-signature-header
  "Parse Stripe-Signature header into map of {scheme -> [signatures]}.

   Header format: t=timestamp,v1=sig1,v1=sig2,v0=sig3
   Returns: {:t [\"timestamp\"] :v1 [\"sig1\" \"sig2\"] :v0 [\"sig3\"]}"
  [header]
  (when header
    (reduce (fn [acc item]
              (let [[k v] (str/split item #"=" 2)]
                (when (and k v)
                  (update acc (keyword k) (fnil conj []) v))))
            {}
            (str/split header #","))))

;;; ---------------------------------------------------------------------------
;;; Verification errors
;;; ---------------------------------------------------------------------------

(defn verification-error
  "Create a verification error map."
  [code message]
  {:error/code code
   :error/message message})

(defn verification-error?
  "Check if result is a verification error."
  [result]
  (contains? result :error/code))

;;; ---------------------------------------------------------------------------
;;; Public API
;;; ---------------------------------------------------------------------------

(defn verify-header
  "Verify a Stripe webhook signature.

   Arguments:
   - payload: Raw request body as string (must be exact bytes received)
   - sig-header: Value of Stripe-Signature header
   - secret: Webhook signing secret (starts with whsec_)
   - opts: Optional map with:
     - :tolerance - Max age in seconds (default: 300)
     - :timestamp - Current timestamp for testing (default: System/currentTimeMillis / 1000)

   Returns:
   - {:timestamp <unix-timestamp>} on success
   - {:error/code :invalid-header :error/message \"...\"} on failure"
  ([payload sig-header secret]
   (verify-header payload sig-header secret {}))
  ([payload sig-header secret {:keys [tolerance timestamp]
                               :or {tolerance *default-tolerance*}}]
   (let [parsed (parse-signature-header sig-header)]
     (cond
       ;; Missing or empty header
       (or (nil? sig-header) (str/blank? sig-header))
       (verification-error :invalid-header "Missing Stripe-Signature header")

       ;; Missing timestamp
       (empty? (:t parsed))
       (verification-error :invalid-header "Missing timestamp in signature header")

       ;; Missing v1 signature
       (empty? (:v1 parsed))
       (verification-error :invalid-header "Missing v1 signature in header")

       :else
       (let [header-timestamp (try
                                (Long/parseLong (first (:t parsed)))
                                (catch NumberFormatException _
                                  nil))]
         (cond
           ;; Invalid timestamp format
           (nil? header-timestamp)
           (verification-error :invalid-header "Invalid timestamp format")

           :else
           (let [;; Compute expected signature
                 signed-payload (str header-timestamp "." payload)
                 expected-sig (compute-signature signed-payload secret)

                 ;; Check if any v1 signature matches
                 signatures (:v1 parsed)
                 matches? (some #(secure-compare expected-sig %) signatures)]
             (cond
               ;; No signature match
               (not matches?)
               (verification-error :invalid-signature
                                   "Signature verification failed")

               ;; Check timestamp tolerance
               :else
               (let [now (or timestamp (quot (System/currentTimeMillis) 1000))
                     age (- now header-timestamp)]
                 (if (> age tolerance)
                   (verification-error :timestamp-expired
                                       (str "Timestamp expired: " age "s old, tolerance is " tolerance "s"))
                   {:timestamp header-timestamp}))))))))))

(defn construct-event
  "Verify webhook signature and parse the event payload.

   Arguments:
   - payload: Raw request body as string
   - sig-header: Value of Stripe-Signature header
   - secret: Webhook signing secret
   - opts: Optional verification options (see verify-header)

   Returns:
   - Parsed event map on success (with :id, :type, :data, etc.)
   - {:error/code ... :error/message ...} on failure

   Example:
   ```clojure
   (let [result (construct-event payload sig-header \"whsec_xxx\")]
     (if (verification-error? result)
       (handle-error result)
       (case (:type result)
         \"customer.created\" (handle-customer-created result)
         \"invoice.paid\" (handle-invoice-paid result)
         nil)))
   ```"
  ([payload sig-header secret]
   (construct-event payload sig-header secret {}))
  ([payload sig-header secret opts]
   (let [verification (verify-header payload sig-header secret opts)]
     (if (verification-error? verification)
       verification
       (try
         (json/read-value payload json-mapper)
         (catch Exception e
           (verification-error :invalid-payload
                               (str "Failed to parse event JSON: " (.getMessage e)))))))))

(defn generate-test-header
  "Generate a Stripe-Signature header for testing.

   Arguments:
   - payload: Event payload string
   - secret: Webhook signing secret
   - opts: Optional map with:
     - :timestamp - Unix timestamp (default: current time)
     - :scheme - Signature scheme (default: \"v1\")

   Returns: Stripe-Signature header string"
  ([payload secret]
   (generate-test-header payload secret {}))
  ([payload secret {:keys [timestamp scheme]
                    :or {scheme "v1"}}]
   (let [ts (or timestamp (quot (System/currentTimeMillis) 1000))
         signed-payload (str ts "." payload)
         signature (compute-signature signed-payload secret)]
     (str "t=" ts "," scheme "=" signature))))
