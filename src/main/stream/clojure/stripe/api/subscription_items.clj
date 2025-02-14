(ns stream.clojure.stripe.api.subscription-items
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn delete-subscription-items [item params]
  """
  Delete a subscription item

  HTTP Method: DELETE
  Endpoint: /v1/subscription_items/{item}

  Path Parameters:
    - item: Path parameter.

  """
  (stripe-request :delete (str "/v1/subscription_items/" item "") params))

(defn retrieve-subscription-items [item params]
  """
  Retrieve a subscription item

  HTTP Method: GET
  Endpoint: /v1/subscription_items/{item}

  Path Parameters:
    - item: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/subscription_items/" item "") params))

(defn create-subscription-items [item params]
  """
  Update a subscription item

  HTTP Method: POST
  Endpoint: /v1/subscription_items/{item}

  Path Parameters:
    - item: Path parameter.

  """
  (stripe-request :post (str "/v1/subscription_items/" item "") params))

(defn retrieve-subscription-items [params]
  """
  List all subscription items

  HTTP Method: GET
  Endpoint: /v1/subscription_items

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - subscription: The ID of the subscription whose items will be retrieved.

  """
  (stripe-request :get (str "/v1/subscription_items") params))

(defn create-subscription-items [params]
  """
  Create a subscription item

  HTTP Method: POST
  Endpoint: /v1/subscription_items

  """
  (stripe-request :post (str "/v1/subscription_items") params))

(defn retrieve-subscription-items [subscription_item params]
  """
  List all subscription item period summaries

  HTTP Method: GET
  Endpoint: /v1/subscription_items/{subscription_item}/usage_record_summaries

  Path Parameters:
    - subscription_item: Path parameter.

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/subscription_items/" subscription_item "/usage_record_summaries") params))

(defn create-subscription-items [subscription_item params]
  """
  Create a usage record

  HTTP Method: POST
  Endpoint: /v1/subscription_items/{subscription_item}/usage_records

  Path Parameters:
    - subscription_item: Path parameter.

  """
  (stripe-request :post (str "/v1/subscription_items/" subscription_item "/usage_records") params))