(ns stream.clojure.stripe.api.promotion-codes
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn get-promotion-codes-promotion-code [promotion_code params]
  """
  Retrieve a promotion code

  HTTP Method: GET
  Endpoint: /v1/promotion_codes/{promotion_code}

  Path Parameters:
    - promotion_code: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/promotion_codes/" promotion_code "" params))

(defn post-promotion-codes-promotion-code [promotion_code params]
  """
  Update a promotion code

  HTTP Method: POST
  Endpoint: /v1/promotion_codes/{promotion_code}

  Path Parameters:
    - promotion_code: Path parameter.

  """
  (stripe-request :post "/v1/promotion_codes/" promotion_code "" params))

(defn get-promotion-codes [params]
  """
  List all promotion codes

  HTTP Method: GET
  Endpoint: /v1/promotion_codes

  Query Parameters:
    - active: Filter promotion codes by whether they are active.
    - code: Only return promotion codes that have this case-insensitive code.
    - coupon: Only return promotion codes for this coupon.
    - created: A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options.
    - customer: Only return promotion codes that are restricted to this customer.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/promotion_codes" params))

(defn post-promotion-codes [params]
  """
  Create a promotion code

  HTTP Method: POST
  Endpoint: /v1/promotion_codes

  """
  (stripe-request :post "/v1/promotion_codes" params))