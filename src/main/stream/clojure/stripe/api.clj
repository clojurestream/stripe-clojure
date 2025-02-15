(ns stream.clojure.stripe.api)

(def ^:dynamic *stripe-api-key* "sk_test_api_key")

(defn set-api-key [key]
  "Set API Key"
  (alter-var-root #'*stripe-api-key* (constantly key)))