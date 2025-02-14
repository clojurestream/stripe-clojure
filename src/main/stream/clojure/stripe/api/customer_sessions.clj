(ns stream.clojure.stripe.api.customer-sessions
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-customer-sessions [params]
  """
  Create a Customer Session

  HTTP Method: POST
  Endpoint: /v1/customer_sessions

  """
  (stripe-request :post "/v1/customer_sessions" params))