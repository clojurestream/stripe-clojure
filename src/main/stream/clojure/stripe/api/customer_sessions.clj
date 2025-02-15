(ns stream.clojure.stripe.api.customer-sessions
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn create-customer-sessions [{:keys []}]
  "Create a Customer Session

  HTTP Method: POST
  Endpoint: /v1/customer_sessions

  Example Usage:
    (create-customer-sessions {})"
  (stripe-request :post {:endpoint "/v1/customer_sessions"}))