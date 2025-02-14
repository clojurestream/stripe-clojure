(ns stream.clojure.stripe.api.plans
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-plans [params]
  """
  List all plans

  HTTP Method: GET
  Endpoint: /v1/plans

  Query Parameters:
    - active: Only return plans that are active or inactive (e.g., pass `false` to list all inactive plans).
    - created: A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - product: Only return plans for the given product.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/plans") params))

(defn create-plans [params]
  """
  Create a plan

  HTTP Method: POST
  Endpoint: /v1/plans

  """
  (stripe-request :post (str "/v1/plans") params))

(defn delete-plans [plan params]
  """
  Delete a plan

  HTTP Method: DELETE
  Endpoint: /v1/plans/{plan}

  Path Parameters:
    - plan: Path parameter.

  """
  (stripe-request :delete (str "/v1/plans/" plan "") params))

(defn retrieve-plans [plan params]
  """
  Retrieve a plan

  HTTP Method: GET
  Endpoint: /v1/plans/{plan}

  Path Parameters:
    - plan: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/plans/" plan "") params))

(defn create-plans [plan params]
  """
  Update a plan

  HTTP Method: POST
  Endpoint: /v1/plans/{plan}

  Path Parameters:
    - plan: Path parameter.

  """
  (stripe-request :post (str "/v1/plans/" plan "") params))