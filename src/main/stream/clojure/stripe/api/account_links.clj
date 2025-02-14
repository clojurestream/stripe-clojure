(ns stream.clojure.stripe.api.account-links
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn create-account-links [params]
  """
  Create an account link

  HTTP Method: POST
  Endpoint: /v1/account_links

  """
  (stripe-request :post (str "/v1/account_links") params))