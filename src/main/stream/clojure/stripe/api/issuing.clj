(ns stream.clojure.stripe.api.issuing
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-issuing [dispute params]
  """
  Retrieve a dispute

  HTTP Method: GET
  Endpoint: /v1/issuing/disputes/{dispute}

  Path Parameters:
    - dispute: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/issuing/disputes/" dispute "") params))

(defn create-issuing [dispute params]
  """
  Update a dispute

  HTTP Method: POST
  Endpoint: /v1/issuing/disputes/{dispute}

  Path Parameters:
    - dispute: Path parameter.

  """
  (stripe-request :post (str "/v1/issuing/disputes/" dispute "") params))

(defn retrieve-issuing [params]
  """
  List all disputes

  HTTP Method: GET
  Endpoint: /v1/issuing/disputes

  Query Parameters:
    - created: Only return Issuing disputes that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Select Issuing disputes with the given status.
    - transaction: Select the Issuing dispute for the given transaction.

  """
  (stripe-request :get (str "/v1/issuing/disputes") params))

(defn create-issuing [params]
  """
  Create a dispute

  HTTP Method: POST
  Endpoint: /v1/issuing/disputes

  """
  (stripe-request :post (str "/v1/issuing/disputes") params))

(defn create-issuing [dispute params]
  """
  Submit a dispute

  HTTP Method: POST
  Endpoint: /v1/issuing/disputes/{dispute}/submit

  Path Parameters:
    - dispute: Path parameter.

  """
  (stripe-request :post (str "/v1/issuing/disputes/" dispute "/submit") params))

(defn retrieve-issuing [params]
  """
  List all issuing tokens for card

  HTTP Method: GET
  Endpoint: /v1/issuing/tokens

  Query Parameters:
    - card: The Issuing card identifier to list tokens for.
    - created: Only return Issuing tokens that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Select Issuing tokens with the given status.

  """
  (stripe-request :get (str "/v1/issuing/tokens") params))

(defn retrieve-issuing [personalization_design params]
  """
  Retrieve a personalization design

  HTTP Method: GET
  Endpoint: /v1/issuing/personalization_designs/{personalization_design}

  Path Parameters:
    - personalization_design: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/issuing/personalization_designs/" personalization_design "") params))

(defn create-issuing [personalization_design params]
  """
  Update a personalization design

  HTTP Method: POST
  Endpoint: /v1/issuing/personalization_designs/{personalization_design}

  Path Parameters:
    - personalization_design: Path parameter.

  """
  (stripe-request :post (str "/v1/issuing/personalization_designs/" personalization_design "") params))

(defn retrieve-issuing [params]
  """
  List all cardholders

  HTTP Method: GET
  Endpoint: /v1/issuing/cardholders

  Query Parameters:
    - created: Only return cardholders that were created during the given date interval.
    - email: Only return cardholders that have the given email address.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - phone_number: Only return cardholders that have the given phone number.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return cardholders that have the given status. One of `active`, `inactive`, or `blocked`.
    - type: Only return cardholders that have the given type. One of `individual` or `company`.

  """
  (stripe-request :get (str "/v1/issuing/cardholders") params))

(defn create-issuing [params]
  """
  Create a cardholder

  HTTP Method: POST
  Endpoint: /v1/issuing/cardholders

  """
  (stripe-request :post (str "/v1/issuing/cardholders") params))

(defn create-issuing [authorization params]
  """
  Decline an authorization

  HTTP Method: POST
  Endpoint: /v1/issuing/authorizations/{authorization}/decline

  Path Parameters:
    - authorization: Path parameter.

  """
  (stripe-request :post (str "/v1/issuing/authorizations/" authorization "/decline") params))

(defn retrieve-issuing [authorization params]
  """
  Retrieve an authorization

  HTTP Method: GET
  Endpoint: /v1/issuing/authorizations/{authorization}

  Path Parameters:
    - authorization: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/issuing/authorizations/" authorization "") params))

(defn create-issuing [authorization params]
  """
  Update an authorization

  HTTP Method: POST
  Endpoint: /v1/issuing/authorizations/{authorization}

  Path Parameters:
    - authorization: Path parameter.

  """
  (stripe-request :post (str "/v1/issuing/authorizations/" authorization "") params))

(defn retrieve-issuing [params]
  """
  List all authorizations

  HTTP Method: GET
  Endpoint: /v1/issuing/authorizations

  Query Parameters:
    - card: Only return authorizations that belong to the given card.
    - cardholder: Only return authorizations that belong to the given cardholder.
    - created: Only return authorizations that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return authorizations with the given status. One of `pending`, `closed`, or `reversed`.

  """
  (stripe-request :get (str "/v1/issuing/authorizations") params))

(defn retrieve-issuing [params]
  """
  List all cards

  HTTP Method: GET
  Endpoint: /v1/issuing/cards

  Query Parameters:
    - cardholder: Only return cards belonging to the Cardholder with the provided ID.
    - created: Only return cards that were issued during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - exp_month: Only return cards that have the given expiration month.
    - exp_year: Only return cards that have the given expiration year.
    - expand: Specifies which fields in the response should be expanded.
    - last4: Only return cards that have the given last four digits.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - personalization_design: 
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return cards that have the given status. One of `active`, `inactive`, or `canceled`.
    - type: Only return cards that have the given type. One of `virtual` or `physical`.

  """
  (stripe-request :get (str "/v1/issuing/cards") params))

(defn create-issuing [params]
  """
  Create a card

  HTTP Method: POST
  Endpoint: /v1/issuing/cards

  """
  (stripe-request :post (str "/v1/issuing/cards") params))

(defn retrieve-issuing [transaction params]
  """
  Retrieve a transaction

  HTTP Method: GET
  Endpoint: /v1/issuing/transactions/{transaction}

  Path Parameters:
    - transaction: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/issuing/transactions/" transaction "") params))

(defn create-issuing [transaction params]
  """
  Update a transaction

  HTTP Method: POST
  Endpoint: /v1/issuing/transactions/{transaction}

  Path Parameters:
    - transaction: Path parameter.

  """
  (stripe-request :post (str "/v1/issuing/transactions/" transaction "") params))

(defn retrieve-issuing [params]
  """
  List all physical bundles

  HTTP Method: GET
  Endpoint: /v1/issuing/physical_bundles

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return physical bundles with the given status.
    - type: Only return physical bundles with the given type.

  """
  (stripe-request :get (str "/v1/issuing/physical_bundles") params))

(defn retrieve-issuing [card params]
  """
  Retrieve a card

  HTTP Method: GET
  Endpoint: /v1/issuing/cards/{card}

  Path Parameters:
    - card: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/issuing/cards/" card "") params))

(defn create-issuing [card params]
  """
  Update a card

  HTTP Method: POST
  Endpoint: /v1/issuing/cards/{card}

  Path Parameters:
    - card: Path parameter.

  """
  (stripe-request :post (str "/v1/issuing/cards/" card "") params))

(defn retrieve-issuing [params]
  """
  List all transactions

  HTTP Method: GET
  Endpoint: /v1/issuing/transactions

  Query Parameters:
    - card: Only return transactions that belong to the given card.
    - cardholder: Only return transactions that belong to the given cardholder.
    - created: Only return transactions that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - type: Only return transactions that have the given type. One of `capture` or `refund`.

  """
  (stripe-request :get (str "/v1/issuing/transactions") params))

(defn retrieve-issuing [params]
  """
  List all personalization designs

  HTTP Method: GET
  Endpoint: /v1/issuing/personalization_designs

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - lookup_keys: Only return personalization designs with the given lookup keys.
    - preferences: Only return personalization designs with the given preferences.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return personalization designs with the given status.

  """
  (stripe-request :get (str "/v1/issuing/personalization_designs") params))

(defn create-issuing [params]
  """
  Create a personalization design

  HTTP Method: POST
  Endpoint: /v1/issuing/personalization_designs

  """
  (stripe-request :post (str "/v1/issuing/personalization_designs") params))

(defn retrieve-issuing [physical_bundle params]
  """
  Retrieve a physical bundle

  HTTP Method: GET
  Endpoint: /v1/issuing/physical_bundles/{physical_bundle}

  Path Parameters:
    - physical_bundle: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/issuing/physical_bundles/" physical_bundle "") params))

(defn retrieve-issuing [cardholder params]
  """
  Retrieve a cardholder

  HTTP Method: GET
  Endpoint: /v1/issuing/cardholders/{cardholder}

  Path Parameters:
    - cardholder: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/issuing/cardholders/" cardholder "") params))

(defn create-issuing [cardholder params]
  """
  Update a cardholder

  HTTP Method: POST
  Endpoint: /v1/issuing/cardholders/{cardholder}

  Path Parameters:
    - cardholder: Path parameter.

  """
  (stripe-request :post (str "/v1/issuing/cardholders/" cardholder "") params))

(defn create-issuing [authorization params]
  """
  Approve an authorization

  HTTP Method: POST
  Endpoint: /v1/issuing/authorizations/{authorization}/approve

  Path Parameters:
    - authorization: Path parameter.

  """
  (stripe-request :post (str "/v1/issuing/authorizations/" authorization "/approve") params))

(defn retrieve-issuing [settlement params]
  """
  Retrieve a settlement

  HTTP Method: GET
  Endpoint: /v1/issuing/settlements/{settlement}

  Path Parameters:
    - settlement: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/issuing/settlements/" settlement "") params))

(defn create-issuing [settlement params]
  """
  Update a settlement

  HTTP Method: POST
  Endpoint: /v1/issuing/settlements/{settlement}

  Path Parameters:
    - settlement: Path parameter.

  """
  (stripe-request :post (str "/v1/issuing/settlements/" settlement "") params))

(defn retrieve-issuing [token params]
  """
  Retrieve an issuing token

  HTTP Method: GET
  Endpoint: /v1/issuing/tokens/{token}

  Path Parameters:
    - token: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/issuing/tokens/" token "") params))

(defn create-issuing [token params]
  """
  Update a token status

  HTTP Method: POST
  Endpoint: /v1/issuing/tokens/{token}

  Path Parameters:
    - token: Path parameter.

  """
  (stripe-request :post (str "/v1/issuing/tokens/" token "") params))