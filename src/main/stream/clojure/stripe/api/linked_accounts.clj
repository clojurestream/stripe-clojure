(ns stream.clojure.stripe.api.linked-accounts
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-linked-accounts-account [{:keys [linked-account-id query-params]}]
  "Retrieve an Account

  HTTP Method: GET
  Endpoint: /v1/linked_accounts/{linked-account-id}

  Path Parameters:
    - linked-account-id: The linked-account-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-linked-accounts-account {:linked-account-id example-linked-account-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/linked_accounts/{linked-account-id}" :path-params {:linked-account-id linked-account-id} :query-params query-params}))

(defn list-all-linked-accounts-account-owners [{:keys [linked-account-id query-params]}]
  "List Account Owners

  HTTP Method: GET
  Endpoint: /v1/linked_accounts/{linked-account-id}/owners

  Path Parameters:
    - linked-account-id: The linked-account-id parameter. (required) [type: string]

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - ownership: The ID of the ownership object to fetch owners from. (required) [type: string]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-linked-accounts-account-owners {:linked-account-id example-linked-account-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/linked_accounts/{linked-account-id}/owners" :path-params {:linked-account-id linked-account-id} :query-params query-params}))

(defn post-linked-accounts-account-refresh [{:keys [linked-account-id]}]
  "Refresh Account data

  HTTP Method: POST
  Endpoint: /v1/linked_accounts/{linked-account-id}/refresh

  Path Parameters:
    - linked-account-id: The linked-account-id parameter. (required) [type: string]

  Example Usage:
    (post-linked-accounts-account-refresh {:linked-account-id example-linked-account-id})"
  (stripe-request :post {:endpoint "/v1/linked_accounts/{linked-account-id}/refresh" :path-params {:linked-account-id linked-account-id}}))

(defn post-linked-accounts-account-disconnect [{:keys [linked-account-id]}]
  "Disconnect an Account

  HTTP Method: POST
  Endpoint: /v1/linked_accounts/{linked-account-id}/disconnect

  Path Parameters:
    - linked-account-id: The linked-account-id parameter. (required) [type: string]

  Example Usage:
    (post-linked-accounts-account-disconnect {:linked-account-id example-linked-account-id})"
  (stripe-request :post {:endpoint "/v1/linked_accounts/{linked-account-id}/disconnect" :path-params {:linked-account-id linked-account-id}}))

(defn list-all-linked-accounts [{:keys [query-params]}]
  "List Accounts

  HTTP Method: GET
  Endpoint: /v1/linked_accounts

  Query Parameters:
    - account-holder: If present, only return accounts that belong to the specified account holder. `account_holder[customer]` and `account_holder[account]` are mutually exclusive. [type: object]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - session: If present, only return accounts that were collected as part of the given session. [type: string]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-linked-accounts {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/linked_accounts" :query-params query-params}))