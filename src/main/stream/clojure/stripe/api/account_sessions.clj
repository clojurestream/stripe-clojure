(ns stream.clojure.stripe.api.account-sessions
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn create-account-sessions
  "Create an Account Session

  HTTP Method: POST
  Endpoint: /v1/account_sessions

  Example Usage:
    (create-account-sessions {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/account_sessions"}))