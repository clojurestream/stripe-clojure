(ns stream.clojure.stripe.api.balance-settings
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-balance-settings
  "Retrieve balance settings

  HTTP Method: GET
  Endpoint: /v1/balance_settings

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (list-all-balance-settings {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/balance_settings" :query-params query-params}))

(defn update-balance-settings
  "Update balance settings

  HTTP Method: POST
  Endpoint: /v1/balance_settings

  Example Usage:
    (update-balance-settings {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/balance_settings"}))