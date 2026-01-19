(ns stream.clojure.stripe.api.tokens
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-token
  "Retrieve a token

  HTTP Method: GET
  Endpoint: /v1/tokens/{token-id}

  Path Parameters:
    - token-id (String): The token-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-token {:token-id example-token-id :query-params {:limit 10}})"
  [{:keys [token-id query-params]}]
  (stripe-request :get {:endpoint "/v1/tokens/{token-id}" :path-params {:token-id token-id} :query-params query-params}))

(defn create
  "Create a CVC update token

  HTTP Method: POST
  Endpoint: /v1/tokens

  Example Usage:
    (create {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/tokens" :body body}))