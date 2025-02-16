(ns playground
  (:require [stream.clojure.stripe.api :as api]
            [stream.clojure.stripe.api.customers :as customers]
            [stream.clojure.stripe.api.products :as products]))

(def stripe-api-key (System/getenv "STRIPE_API_KEY"))

(api/set-api-key stripe-api-key)

(count (-> (products/list-all {:query-params {:limit 2}}) :body :data))

(customers/list-all {:query-params {:limit 1}})

(customers/retrieve-customer {:customer-id "cus_OW1RKPdJ5FUoEz"})