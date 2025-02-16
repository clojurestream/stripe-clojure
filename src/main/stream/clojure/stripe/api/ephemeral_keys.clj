(ns stream.clojure.stripe.api.ephemeral-keys
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn delete-ephemeral-keys-key
  "Immediately invalidate an ephemeral key

  HTTP Method: DELETE
  Endpoint: /v1/ephemeral_keys/{ephemeral-key-id}

  Path Parameters:
    - ephemeral-key-id (String): The ephemeral-key-id parameter. (required)

  Example Usage:
    (delete-ephemeral-keys-key {:ephemeral-key-id example-ephemeral-key-id})"
  [{:keys [ephemeral-key-id]}]
  (stripe-request :delete {:endpoint "/v1/ephemeral_keys/{ephemeral-key-id}" :path-params {:ephemeral-key-id ephemeral-key-id}}))

(defn create-ephemeral-keys
  "Create an ephemeral key

  HTTP Method: POST
  Endpoint: /v1/ephemeral_keys

  Example Usage:
    (create-ephemeral-keys {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/ephemeral_keys"}))