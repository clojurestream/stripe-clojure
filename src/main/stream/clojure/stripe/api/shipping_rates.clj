(ns stream.clojure.stripe.api.shipping-rates
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-shipping-rates [shipping_rate_token params]
  """
  Retrieve a shipping rate

  HTTP Method: GET
  Endpoint: /v1/shipping_rates/{shipping_rate_token}

  Path Parameters:
    - shipping_rate_token: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/shipping_rates/" shipping_rate_token "") params))

(defn create-shipping-rates [shipping_rate_token params]
  """
  Update a shipping rate

  HTTP Method: POST
  Endpoint: /v1/shipping_rates/{shipping_rate_token}

  Path Parameters:
    - shipping_rate_token: Path parameter.

  """
  (stripe-request :post (str "/v1/shipping_rates/" shipping_rate_token "") params))

(defn retrieve-shipping-rates [params]
  """
  List all shipping rates

  HTTP Method: GET
  Endpoint: /v1/shipping_rates

  Query Parameters:
    - active: Only return shipping rates that are active or inactive.
    - created: A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options.
    - currency: Only return shipping rates for the given currency.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/shipping_rates") params))

(defn create-shipping-rates [params]
  """
  Create a shipping rate

  HTTP Method: POST
  Endpoint: /v1/shipping_rates

  """
  (stripe-request :post (str "/v1/shipping_rates") params))