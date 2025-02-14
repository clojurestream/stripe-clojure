(ns stream.clojure.stripe.api.account-sessions
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-account-sessions [params]
  """
  Create an Account Session

  HTTP Method: POST
  Endpoint: /v1/account_sessions

  """
  (stripe-request :post "/v1/account_sessions" params))