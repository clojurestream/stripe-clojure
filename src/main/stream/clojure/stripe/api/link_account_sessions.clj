(ns stream.clojure.stripe.api.link-account-sessions
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn create-link-account-sessions
  "Create a Session

  HTTP Method: POST
  Endpoint: /v1/link_account_sessions

  Example Usage:
    (create-link-account-sessions {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/link_account_sessions" :body body}))

(defn retrieve-link-account-sessions-session
  "Retrieve a Session

  HTTP Method: GET
  Endpoint: /v1/link_account_sessions/{link-account-session-id}

  Path Parameters:
    - link-account-session-id (String): The link-account-session-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-link-account-sessions-session {:link-account-session-id example-link-account-session-id :query-params {:limit 10}})"
  [{:keys [link-account-session-id query-params]}]
  (stripe-request :get {:endpoint "/v1/link_account_sessions/{link-account-session-id}" :path-params {:link-account-session-id link-account-session-id} :query-params query-params}))