(ns stream.clojure.stripe.api.financial-connections
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn create-financial-connections [params]
  """
  Create a Session

  HTTP Method: POST
  Endpoint: /v1/financial_connections/sessions

  """
  (stripe-request :post (str "/v1/financial_connections/sessions") params))

(defn retrieve-financial-connections [account params]
  """
  Retrieve an Account

  HTTP Method: GET
  Endpoint: /v1/financial_connections/accounts/{account}

  Path Parameters:
    - account: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/financial_connections/accounts/" account "") params))

(defn create-financial-connections [account params]
  """
  Refresh Account data

  HTTP Method: POST
  Endpoint: /v1/financial_connections/accounts/{account}/refresh

  Path Parameters:
    - account: Path parameter.

  """
  (stripe-request :post (str "/v1/financial_connections/accounts/" account "/refresh") params))

(defn create-financial-connections [account params]
  """
  Unsubscribe from data refreshes for an Account

  HTTP Method: POST
  Endpoint: /v1/financial_connections/accounts/{account}/unsubscribe

  Path Parameters:
    - account: Path parameter.

  """
  (stripe-request :post (str "/v1/financial_connections/accounts/" account "/unsubscribe") params))

(defn create-financial-connections [account params]
  """
  Disconnect an Account

  HTTP Method: POST
  Endpoint: /v1/financial_connections/accounts/{account}/disconnect

  Path Parameters:
    - account: Path parameter.

  """
  (stripe-request :post (str "/v1/financial_connections/accounts/" account "/disconnect") params))

(defn retrieve-financial-connections [params]
  """
  List Transactions

  HTTP Method: GET
  Endpoint: /v1/financial_connections/transactions

  Query Parameters:
    - account: The ID of the Financial Connections Account whose transactions will be retrieved.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - transacted_at: A filter on the list based on the object `transacted_at` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with the following options:
    - transaction_refresh: A filter on the list based on the object `transaction_refresh` field. The value can be a dictionary with the following options:

  """
  (stripe-request :get (str "/v1/financial_connections/transactions") params))

(defn retrieve-financial-connections [account params]
  """
  List Account Owners

  HTTP Method: GET
  Endpoint: /v1/financial_connections/accounts/{account}/owners

  Path Parameters:
    - account: Path parameter.

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - ownership: The ID of the ownership object to fetch owners from.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/financial_connections/accounts/" account "/owners") params))

(defn retrieve-financial-connections [transaction params]
  """
  Retrieve a Transaction

  HTTP Method: GET
  Endpoint: /v1/financial_connections/transactions/{transaction}

  Path Parameters:
    - transaction: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/financial_connections/transactions/" transaction "") params))

(defn retrieve-financial-connections [session params]
  """
  Retrieve a Session

  HTTP Method: GET
  Endpoint: /v1/financial_connections/sessions/{session}

  Path Parameters:
    - session: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/financial_connections/sessions/" session "") params))

(defn create-financial-connections [account params]
  """
  Subscribe to data refreshes for an Account

  HTTP Method: POST
  Endpoint: /v1/financial_connections/accounts/{account}/subscribe

  Path Parameters:
    - account: Path parameter.

  """
  (stripe-request :post (str "/v1/financial_connections/accounts/" account "/subscribe") params))

(defn retrieve-financial-connections [params]
  """
  List Accounts

  HTTP Method: GET
  Endpoint: /v1/financial_connections/accounts

  Query Parameters:
    - account_holder: If present, only return accounts that belong to the specified account holder. `account_holder[customer]` and `account_holder[account]` are mutually exclusive.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - session: If present, only return accounts that were collected as part of the given session.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/financial_connections/accounts") params))