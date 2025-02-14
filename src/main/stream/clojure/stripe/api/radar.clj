(ns stream.clojure.stripe.api.radar
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-radar [params]
  """
  List all early fraud warnings

  HTTP Method: GET
  Endpoint: /v1/radar/early_fraud_warnings

  Query Parameters:
    - charge: Only return early fraud warnings for the charge specified by this charge ID.
    - created: Only return early fraud warnings that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - payment_intent: Only return early fraud warnings for charges that were created by the PaymentIntent specified by this PaymentIntent ID.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/radar/early_fraud_warnings") params))

(defn delete-radar [item params]
  """
  Delete a value list item

  HTTP Method: DELETE
  Endpoint: /v1/radar/value_list_items/{item}

  Path Parameters:
    - item: Path parameter.

  """
  (stripe-request :delete (str "/v1/radar/value_list_items/" item "") params))

(defn retrieve-radar [item params]
  """
  Retrieve a value list item

  HTTP Method: GET
  Endpoint: /v1/radar/value_list_items/{item}

  Path Parameters:
    - item: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/radar/value_list_items/" item "") params))

(defn delete-radar [value_list params]
  """
  Delete a value list

  HTTP Method: DELETE
  Endpoint: /v1/radar/value_lists/{value_list}

  Path Parameters:
    - value_list: Path parameter.

  """
  (stripe-request :delete (str "/v1/radar/value_lists/" value_list "") params))

(defn retrieve-radar [value_list params]
  """
  Retrieve a value list

  HTTP Method: GET
  Endpoint: /v1/radar/value_lists/{value_list}

  Path Parameters:
    - value_list: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/radar/value_lists/" value_list "") params))

(defn create-radar [value_list params]
  """
  Update a value list

  HTTP Method: POST
  Endpoint: /v1/radar/value_lists/{value_list}

  Path Parameters:
    - value_list: Path parameter.

  """
  (stripe-request :post (str "/v1/radar/value_lists/" value_list "") params))

(defn retrieve-radar [params]
  """
  List all value lists

  HTTP Method: GET
  Endpoint: /v1/radar/value_lists

  Query Parameters:
    - alias: The alias used to reference the value list when writing rules.
    - contains: A value contained within a value list - returns all value lists containing this value.
    - created: Only return value lists that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/radar/value_lists") params))

(defn create-radar [params]
  """
  Create a value list

  HTTP Method: POST
  Endpoint: /v1/radar/value_lists

  """
  (stripe-request :post (str "/v1/radar/value_lists") params))

(defn retrieve-radar [params]
  """
  List all value list items

  HTTP Method: GET
  Endpoint: /v1/radar/value_list_items

  Query Parameters:
    - created: Only return items that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - value: Return items belonging to the parent list whose value matches the specified value (using an "is like" match).
    - value_list: Identifier for the parent value list this item belongs to.

  """
  (stripe-request :get (str "/v1/radar/value_list_items") params))

(defn create-radar [params]
  """
  Create a value list item

  HTTP Method: POST
  Endpoint: /v1/radar/value_list_items

  """
  (stripe-request :post (str "/v1/radar/value_list_items") params))

(defn retrieve-radar [early_fraud_warning params]
  """
  Retrieve an early fraud warning

  HTTP Method: GET
  Endpoint: /v1/radar/early_fraud_warnings/{early_fraud_warning}

  Path Parameters:
    - early_fraud_warning: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/radar/early_fraud_warnings/" early_fraud_warning "") params))