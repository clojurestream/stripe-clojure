(ns stream.clojure.stripe.api.tokens
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-token [{:keys [token-id query-params]}]
  "Retrieve a token

  HTTP Method: GET
  Endpoint: /v1/tokens/{token-id}

  Path Parameters:
    - token-id: The token-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-token {:token-id example-token-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/tokens/{token-id}" :path-params {:token-id token-id} :query-params query-params}))

(defn create [{:keys []}]
  "Create a CVC update token

  HTTP Method: POST
  Endpoint: /v1/tokens

  Example Usage:
    (create {})"
  (stripe-request :post {:endpoint "/v1/tokens"}))