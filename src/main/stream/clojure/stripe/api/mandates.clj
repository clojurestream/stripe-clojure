(ns stream.clojure.stripe.api.mandates
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-mandate [{:keys [mandate-id query-params]}]
  "Retrieve a Mandate

  HTTP Method: GET
  Endpoint: /v1/mandates/{mandate-id}

  Path Parameters:
    - mandate-id: The mandate-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-mandate {:mandate-id example-mandate-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/mandates/{mandate-id}" :path-params {:mandate-id mandate-id} :query-params query-params}))