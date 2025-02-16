(ns stream.clojure.stripe.api.account-links
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn create-account-links
  "Create an account link

  HTTP Method: POST
  Endpoint: /v1/account_links

  Example Usage:
    (create-account-links {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/account_links"}))