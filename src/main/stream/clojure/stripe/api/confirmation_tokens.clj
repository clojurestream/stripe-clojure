(ns stream.clojure.stripe.api.confirmation-tokens
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-confirmation-tokens [confirmation_token params]
  """
  Retrieve a ConfirmationToken

  HTTP Method: GET
  Endpoint: /v1/confirmation_tokens/{confirmation_token}

  Path Parameters:
    - confirmation_token: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/confirmation_tokens/" confirmation_token "") params))