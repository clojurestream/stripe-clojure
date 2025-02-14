(ns stream.clojure.stripe.api.coupons
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-coupons [params]
  """
  List all coupons

  HTTP Method: GET
  Endpoint: /v1/coupons

  Query Parameters:
    - created: A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/coupons") params))

(defn create-coupons [params]
  """
  Create a coupon

  HTTP Method: POST
  Endpoint: /v1/coupons

  """
  (stripe-request :post (str "/v1/coupons") params))

(defn delete-coupons [coupon params]
  """
  Delete a coupon

  HTTP Method: DELETE
  Endpoint: /v1/coupons/{coupon}

  Path Parameters:
    - coupon: Path parameter.

  """
  (stripe-request :delete (str "/v1/coupons/" coupon "") params))

(defn retrieve-coupons [coupon params]
  """
  Retrieve a coupon

  HTTP Method: GET
  Endpoint: /v1/coupons/{coupon}

  Path Parameters:
    - coupon: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/coupons/" coupon "") params))

(defn create-coupons [coupon params]
  """
  Update a coupon

  HTTP Method: POST
  Endpoint: /v1/coupons/{coupon}

  Path Parameters:
    - coupon: Path parameter.

  """
  (stripe-request :post (str "/v1/coupons/" coupon "") params))