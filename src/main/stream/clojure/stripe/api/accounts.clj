(ns stream.clojure.stripe.api.accounts
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn get-accounts [params]
  """
  List all connected accounts

  HTTP Method: GET
  Endpoint: /v1/accounts

  Query Parameters:
    - created: Only return connected accounts that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/accounts" params))

(defn post-accounts [params]
  """
  No description available.

  HTTP Method: POST
  Endpoint: /v1/accounts

  """
  (stripe-request :post "/v1/accounts" params))

(defn post-accounts-account-login-links [account params]
  """
  Create a login link

  HTTP Method: POST
  Endpoint: /v1/accounts/{account}/login_links

  Path Parameters:
    - account: Path parameter.

  """
  (stripe-request :post "/v1/accounts/" account "/login_links" params))

(defn delete-accounts-account-persons-person [account person params]
  """
  Delete a person

  HTTP Method: DELETE
  Endpoint: /v1/accounts/{account}/persons/{person}

  Path Parameters:
    - account: Path parameter.
    - person: Path parameter.

  """
  (stripe-request :delete "/v1/accounts/" account "/persons/" person "" params))

(defn get-accounts-account-persons-person [account person params]
  """
  Retrieve a person

  HTTP Method: GET
  Endpoint: /v1/accounts/{account}/persons/{person}

  Path Parameters:
    - account: Path parameter.
    - person: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/accounts/" account "/persons/" person "" params))

(defn post-accounts-account-persons-person [account person params]
  """
  Update a person

  HTTP Method: POST
  Endpoint: /v1/accounts/{account}/persons/{person}

  Path Parameters:
    - account: Path parameter.
    - person: Path parameter.

  """
  (stripe-request :post "/v1/accounts/" account "/persons/" person "" params))

(defn delete-accounts-account-bank-accounts-id [account id params]
  """
  Delete an external account

  HTTP Method: DELETE
  Endpoint: /v1/accounts/{account}/bank_accounts/{id}

  Path Parameters:
    - account: Path parameter.
    - id: Path parameter.

  """
  (stripe-request :delete "/v1/accounts/" account "/bank_accounts/" id "" params))

(defn get-accounts-account-bank-accounts-id [account id params]
  """
  Retrieve an external account

  HTTP Method: GET
  Endpoint: /v1/accounts/{account}/bank_accounts/{id}

  Path Parameters:
    - account: Path parameter.
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/accounts/" account "/bank_accounts/" id "" params))

(defn post-accounts-account-bank-accounts-id [account id params]
  """
  No description available.

  HTTP Method: POST
  Endpoint: /v1/accounts/{account}/bank_accounts/{id}

  Path Parameters:
    - account: Path parameter.
    - id: Path parameter.

  """
  (stripe-request :post "/v1/accounts/" account "/bank_accounts/" id "" params))

(defn delete-accounts-account-people-person [account person params]
  """
  Delete a person

  HTTP Method: DELETE
  Endpoint: /v1/accounts/{account}/people/{person}

  Path Parameters:
    - account: Path parameter.
    - person: Path parameter.

  """
  (stripe-request :delete "/v1/accounts/" account "/people/" person "" params))

(defn get-accounts-account-people-person [account person params]
  """
  Retrieve a person

  HTTP Method: GET
  Endpoint: /v1/accounts/{account}/people/{person}

  Path Parameters:
    - account: Path parameter.
    - person: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/accounts/" account "/people/" person "" params))

(defn post-accounts-account-people-person [account person params]
  """
  Update a person

  HTTP Method: POST
  Endpoint: /v1/accounts/{account}/people/{person}

  Path Parameters:
    - account: Path parameter.
    - person: Path parameter.

  """
  (stripe-request :post "/v1/accounts/" account "/people/" person "" params))

(defn get-accounts-account-people [account params]
  """
  List all persons

  HTTP Method: GET
  Endpoint: /v1/accounts/{account}/people

  Path Parameters:
    - account: Path parameter.

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - relationship: Filters on the list of people returned based on the person's relationship to the account's company.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/accounts/" account "/people" params))

(defn post-accounts-account-people [account params]
  """
  Create a person

  HTTP Method: POST
  Endpoint: /v1/accounts/{account}/people

  Path Parameters:
    - account: Path parameter.

  """
  (stripe-request :post "/v1/accounts/" account "/people" params))

(defn delete-accounts-account [account params]
  """
  Delete an account

  HTTP Method: DELETE
  Endpoint: /v1/accounts/{account}

  Path Parameters:
    - account: Path parameter.

  """
  (stripe-request :delete "/v1/accounts/" account "" params))

(defn get-accounts-account [account params]
  """
  Retrieve account

  HTTP Method: GET
  Endpoint: /v1/accounts/{account}

  Path Parameters:
    - account: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/accounts/" account "" params))

(defn post-accounts-account [account params]
  """
  Update an account

  HTTP Method: POST
  Endpoint: /v1/accounts/{account}

  Path Parameters:
    - account: Path parameter.

  """
  (stripe-request :post "/v1/accounts/" account "" params))

(defn get-accounts-account-persons [account params]
  """
  List all persons

  HTTP Method: GET
  Endpoint: /v1/accounts/{account}/persons

  Path Parameters:
    - account: Path parameter.

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - relationship: Filters on the list of people returned based on the person's relationship to the account's company.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/accounts/" account "/persons" params))

(defn post-accounts-account-persons [account params]
  """
  Create a person

  HTTP Method: POST
  Endpoint: /v1/accounts/{account}/persons

  Path Parameters:
    - account: Path parameter.

  """
  (stripe-request :post "/v1/accounts/" account "/persons" params))

(defn get-accounts-account-capabilities-capability [account capability params]
  """
  Retrieve an Account Capability

  HTTP Method: GET
  Endpoint: /v1/accounts/{account}/capabilities/{capability}

  Path Parameters:
    - account: Path parameter.
    - capability: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/accounts/" account "/capabilities/" capability "" params))

(defn post-accounts-account-capabilities-capability [account capability params]
  """
  Update an Account Capability

  HTTP Method: POST
  Endpoint: /v1/accounts/{account}/capabilities/{capability}

  Path Parameters:
    - account: Path parameter.
    - capability: Path parameter.

  """
  (stripe-request :post "/v1/accounts/" account "/capabilities/" capability "" params))

(defn get-accounts-account-capabilities [account params]
  """
  List all account capabilities

  HTTP Method: GET
  Endpoint: /v1/accounts/{account}/capabilities

  Path Parameters:
    - account: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/accounts/" account "/capabilities" params))

(defn post-accounts-account-bank-accounts [account params]
  """
  Create an external account

  HTTP Method: POST
  Endpoint: /v1/accounts/{account}/bank_accounts

  Path Parameters:
    - account: Path parameter.

  """
  (stripe-request :post "/v1/accounts/" account "/bank_accounts" params))

(defn get-accounts-account-external-accounts [account params]
  """
  List all external accounts

  HTTP Method: GET
  Endpoint: /v1/accounts/{account}/external_accounts

  Path Parameters:
    - account: Path parameter.

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - object: Filter external accounts according to a particular object type.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/accounts/" account "/external_accounts" params))

(defn post-accounts-account-external-accounts [account params]
  """
  Create an external account

  HTTP Method: POST
  Endpoint: /v1/accounts/{account}/external_accounts

  Path Parameters:
    - account: Path parameter.

  """
  (stripe-request :post "/v1/accounts/" account "/external_accounts" params))

(defn delete-accounts-account-external-accounts-id [account id params]
  """
  Delete an external account

  HTTP Method: DELETE
  Endpoint: /v1/accounts/{account}/external_accounts/{id}

  Path Parameters:
    - account: Path parameter.
    - id: Path parameter.

  """
  (stripe-request :delete "/v1/accounts/" account "/external_accounts/" id "" params))

(defn get-accounts-account-external-accounts-id [account id params]
  """
  Retrieve an external account

  HTTP Method: GET
  Endpoint: /v1/accounts/{account}/external_accounts/{id}

  Path Parameters:
    - account: Path parameter.
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/accounts/" account "/external_accounts/" id "" params))

(defn post-accounts-account-external-accounts-id [account id params]
  """
  No description available.

  HTTP Method: POST
  Endpoint: /v1/accounts/{account}/external_accounts/{id}

  Path Parameters:
    - account: Path parameter.
    - id: Path parameter.

  """
  (stripe-request :post "/v1/accounts/" account "/external_accounts/" id "" params))

(defn post-accounts-account-reject [account params]
  """
  Reject an account

  HTTP Method: POST
  Endpoint: /v1/accounts/{account}/reject

  Path Parameters:
    - account: Path parameter.

  """
  (stripe-request :post "/v1/accounts/" account "/reject" params))