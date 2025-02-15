(ns stream.clojure.stripe.api.account
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all [{:keys [query-params]}]
  "Retrieve account

  HTTP Method: GET
  Endpoint: /v1/account

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/account" :query-params query-params}))