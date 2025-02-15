(ns stream.clojure.stripe.api.account-links
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn create-account-links [{:keys []}]
  "Create an account link

  HTTP Method: POST
  Endpoint: /v1/account_links

  Example Usage:
    (create-account-links {})"
  (stripe-request :post {:endpoint "/v1/account_links"}))