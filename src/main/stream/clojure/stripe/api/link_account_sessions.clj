(ns stream.clojure.stripe.api.link-account-sessions
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn create-link-account-sessions [{:keys []}]
  "Create a Session

  HTTP Method: POST
  Endpoint: /v1/link_account_sessions

  Example Usage:
    (create-link-account-sessions {})"
  (stripe-request :post {:endpoint "/v1/link_account_sessions"}))

(defn retrieve-link-account-sessions-session [{:keys [link-account-session-id query-params]}]
  "Retrieve a Session

  HTTP Method: GET
  Endpoint: /v1/link_account_sessions/{link-account-session-id}

  Path Parameters:
    - link-account-session-id: The link-account-session-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-link-account-sessions-session {:link-account-session-id example-link-account-session-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/link_account_sessions/{link-account-session-id}" :path-params {:link-account-session-id link-account-session-id} :query-params query-params}))