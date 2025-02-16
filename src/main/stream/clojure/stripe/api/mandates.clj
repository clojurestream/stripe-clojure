(ns stream.clojure.stripe.api.mandates
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-mandate
  "Retrieve a Mandate

  HTTP Method: GET
  Endpoint: /v1/mandates/{mandate-id}

  Path Parameters:
    - mandate-id (String): The mandate-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-mandate {:mandate-id example-mandate-id :query-params {:limit 10}})"
  [{:keys [mandate-id query-params]}]
  (stripe-request :get {:endpoint "/v1/mandates/{mandate-id}" :path-params {:mandate-id mandate-id} :query-params query-params}))