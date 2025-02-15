(ns stream.clojure.stripe.api.confirmation-tokens
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-confirmation-tokens-confirmation-token [{:keys [confirmation-token-id query-params]}]
  "Retrieve a ConfirmationToken

  HTTP Method: GET
  Endpoint: /v1/confirmation_tokens/{confirmation-token-id}

  Path Parameters:
    - confirmation-token-id: The confirmation-token-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-confirmation-tokens-confirmation-token {:confirmation-token-id example-confirmation-token-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/confirmation_tokens/{confirmation-token-id}" :path-params {:confirmation-token-id confirmation-token-id} :query-params query-params}))