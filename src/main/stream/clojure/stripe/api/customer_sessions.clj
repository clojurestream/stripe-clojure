(ns stream.clojure.stripe.api.customer-sessions
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn create-customer-sessions [params]
  """
  Create a Customer Session

  HTTP Method: POST
  Endpoint: /v1/customer_sessions

  """
  (stripe-request :post (str "/v1/customer_sessions") params))