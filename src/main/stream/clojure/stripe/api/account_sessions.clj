(ns stream.clojure.stripe.api.account-sessions
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn create-account-sessions [{:keys []}]
  "Create an Account Session

  HTTP Method: POST
  Endpoint: /v1/account_sessions

  Example Usage:
    (create-account-sessions {})"
  (stripe-request :post {:endpoint "/v1/account_sessions"}))