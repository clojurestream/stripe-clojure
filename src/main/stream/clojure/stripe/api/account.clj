(ns stream.clojure.stripe.api.account
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-account [params]
  """
  Retrieve account

  HTTP Method: GET
  Endpoint: /v1/account

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/account") params))