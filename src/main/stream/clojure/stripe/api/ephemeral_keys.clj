(ns stream.clojure.stripe.api.ephemeral-keys
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn delete-ephemeral-keys-key [key params]
  """
  Immediately invalidate an ephemeral key

  HTTP Method: DELETE
  Endpoint: /v1/ephemeral_keys/{key}

  Path Parameters:
    - key: Path parameter.

  """
  (stripe-request :delete "/v1/ephemeral_keys/" key "" params))

(defn post-ephemeral-keys [params]
  """
  Create an ephemeral key

  HTTP Method: POST
  Endpoint: /v1/ephemeral_keys

  """
  (stripe-request :post "/v1/ephemeral_keys" params))