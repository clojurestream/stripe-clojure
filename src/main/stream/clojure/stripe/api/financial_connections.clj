(ns stream.clojure.stripe.api.financial-connections
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn create-financial-connections-sessions
  "Create a Session

  HTTP Method: POST
  Endpoint: /v1/financial_connections/sessions

  Example Usage:
    (create-financial-connections-sessions {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/financial_connections/sessions" :body body}))

(defn retrieve-financial-connections-accounts-account
  "Retrieve an Account

  HTTP Method: GET
  Endpoint: /v1/financial_connections/accounts/{account-id}

  Path Parameters:
    - account-id (String): The account-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-financial-connections-accounts-account {:account-id example-account-id :query-params {:limit 10}})"
  [{:keys [account-id query-params]}]
  (stripe-request :get {:endpoint "/v1/financial_connections/accounts/{account-id}" :path-params {:account-id account-id} :query-params query-params}))

(defn post-financial-connections-accounts-account-refresh
  "Refresh Account data

  HTTP Method: POST
  Endpoint: /v1/financial_connections/accounts/{account-id}/refresh

  Path Parameters:
    - account-id (String): The account-id parameter. (required)

  Example Usage:
    (post-financial-connections-accounts-account-refresh {:account-id example-account-id})"
  [{:keys [account-id body]}]
  (stripe-request :post {:endpoint "/v1/financial_connections/accounts/{account-id}/refresh" :path-params {:account-id account-id} :body body}))

(defn post-financial-connections-accounts-account-unsubscribe
  "Unsubscribe from data refreshes for an Account

  HTTP Method: POST
  Endpoint: /v1/financial_connections/accounts/{account-id}/unsubscribe

  Path Parameters:
    - account-id (String): The account-id parameter. (required)

  Example Usage:
    (post-financial-connections-accounts-account-unsubscribe {:account-id example-account-id})"
  [{:keys [account-id body]}]
  (stripe-request :post {:endpoint "/v1/financial_connections/accounts/{account-id}/unsubscribe" :path-params {:account-id account-id} :body body}))

(defn post-financial-connections-accounts-account-disconnect
  "Disconnect an Account

  HTTP Method: POST
  Endpoint: /v1/financial_connections/accounts/{account-id}/disconnect

  Path Parameters:
    - account-id (String): The account-id parameter. (required)

  Example Usage:
    (post-financial-connections-accounts-account-disconnect {:account-id example-account-id})"
  [{:keys [account-id body]}]
  (stripe-request :post {:endpoint "/v1/financial_connections/accounts/{account-id}/disconnect" :path-params {:account-id account-id} :body body}))

(defn list-all-financial-connections-transactions
  "List Transactions

  HTTP Method: GET
  Endpoint: /v1/financial_connections/transactions

  Query Parameters:
    - account (String): The ID of the Financial Connections Account whose transactions will be retrieved. (required)
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - transacted-at (Unknown): A filter on the list based on the object `transacted_at` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with the following options:
    - transaction-refresh (Object): A filter on the list based on the object `transaction_refresh` field. The value can be a dictionary with the following options:

  Example Usage:
    (list-all-financial-connections-transactions {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/financial_connections/transactions" :query-params query-params}))

(defn list-all-financial-connections-accounts-account-owners
  "List Account Owners

  HTTP Method: GET
  Endpoint: /v1/financial_connections/accounts/{account-id}/owners

  Path Parameters:
    - account-id (String): The account-id parameter. (required)

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - ownership (String): The ID of the ownership object to fetch owners from. (required)
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-financial-connections-accounts-account-owners {:account-id example-account-id :query-params {:limit 10}})"
  [{:keys [account-id query-params]}]
  (stripe-request :get {:endpoint "/v1/financial_connections/accounts/{account-id}/owners" :path-params {:account-id account-id} :query-params query-params}))

(defn retrieve-financial-connections-transactions-transaction
  "Retrieve a Transaction

  HTTP Method: GET
  Endpoint: /v1/financial_connections/transactions/{transaction-id}

  Path Parameters:
    - transaction-id (String): The transaction-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-financial-connections-transactions-transaction {:transaction-id example-transaction-id :query-params {:limit 10}})"
  [{:keys [transaction-id query-params]}]
  (stripe-request :get {:endpoint "/v1/financial_connections/transactions/{transaction-id}" :path-params {:transaction-id transaction-id} :query-params query-params}))

(defn retrieve-financial-connections-sessions-session
  "Retrieve a Session

  HTTP Method: GET
  Endpoint: /v1/financial_connections/sessions/{session-id}

  Path Parameters:
    - session-id (String): The session-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-financial-connections-sessions-session {:session-id example-session-id :query-params {:limit 10}})"
  [{:keys [session-id query-params]}]
  (stripe-request :get {:endpoint "/v1/financial_connections/sessions/{session-id}" :path-params {:session-id session-id} :query-params query-params}))

(defn post-financial-connections-accounts-account-subscribe
  "Subscribe to data refreshes for an Account

  HTTP Method: POST
  Endpoint: /v1/financial_connections/accounts/{account-id}/subscribe

  Path Parameters:
    - account-id (String): The account-id parameter. (required)

  Example Usage:
    (post-financial-connections-accounts-account-subscribe {:account-id example-account-id})"
  [{:keys [account-id body]}]
  (stripe-request :post {:endpoint "/v1/financial_connections/accounts/{account-id}/subscribe" :path-params {:account-id account-id} :body body}))

(defn list-all-financial-connections-accounts
  "List Accounts

  HTTP Method: GET
  Endpoint: /v1/financial_connections/accounts

  Query Parameters:
    - account-holder (Object): If present, only return accounts that belong to the specified account holder. `account_holder[customer]` and `account_holder[account]` are mutually exclusive.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - session (String): If present, only return accounts that were collected as part of the given session.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-financial-connections-accounts {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/financial_connections/accounts" :query-params query-params}))