(ns stream.clojure.stripe.api.linked-accounts
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-linked-accounts [account params]
  """
  Retrieve an Account

  HTTP Method: GET
  Endpoint: /v1/linked_accounts/{account}

  Path Parameters:
    - account: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/linked_accounts/" account "") params))

(defn retrieve-linked-accounts [account params]
  """
  List Account Owners

  HTTP Method: GET
  Endpoint: /v1/linked_accounts/{account}/owners

  Path Parameters:
    - account: Path parameter.

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - ownership: The ID of the ownership object to fetch owners from.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/linked_accounts/" account "/owners") params))

(defn create-linked-accounts [account params]
  """
  Refresh Account data

  HTTP Method: POST
  Endpoint: /v1/linked_accounts/{account}/refresh

  Path Parameters:
    - account: Path parameter.

  """
  (stripe-request :post (str "/v1/linked_accounts/" account "/refresh") params))

(defn create-linked-accounts [account params]
  """
  Disconnect an Account

  HTTP Method: POST
  Endpoint: /v1/linked_accounts/{account}/disconnect

  Path Parameters:
    - account: Path parameter.

  """
  (stripe-request :post (str "/v1/linked_accounts/" account "/disconnect") params))

(defn retrieve-linked-accounts [params]
  """
  List Accounts

  HTTP Method: GET
  Endpoint: /v1/linked_accounts

  Query Parameters:
    - account_holder: If present, only return accounts that belong to the specified account holder. `account_holder[customer]` and `account_holder[account]` are mutually exclusive.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - session: If present, only return accounts that were collected as part of the given session.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/linked_accounts") params))