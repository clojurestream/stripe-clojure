(ns stream.clojure.stripe.api.tokens
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-tokens [token params]
  """
  Retrieve a token

  HTTP Method: GET
  Endpoint: /v1/tokens/{token}

  Path Parameters:
    - token: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/tokens/" token "") params))

(defn create-tokens [params]
  """
  Create a CVC update token

  HTTP Method: POST
  Endpoint: /v1/tokens

  """
  (stripe-request :post (str "/v1/tokens") params))