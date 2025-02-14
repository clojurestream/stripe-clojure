(ns stream.clojure.stripe.api.link-account-sessions
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-link-account-sessions [params]
  """
  Create a Session

  HTTP Method: POST
  Endpoint: /v1/link_account_sessions

  """
  (stripe-request :post "/v1/link_account_sessions" params))

(defn get-link-account-sessions-session [session params]
  """
  Retrieve a Session

  HTTP Method: GET
  Endpoint: /v1/link_account_sessions/{session}

  Path Parameters:
    - session: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/link_account_sessions/" session "" params))