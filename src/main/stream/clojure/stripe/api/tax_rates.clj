(ns stream.clojure.stripe.api.tax-rates
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn get-tax-rates-tax-rate [tax_rate params]
  """
  Retrieve a tax rate

  HTTP Method: GET
  Endpoint: /v1/tax_rates/{tax_rate}

  Path Parameters:
    - tax_rate: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/tax_rates/" tax_rate "" params))

(defn post-tax-rates-tax-rate [tax_rate params]
  """
  Update a tax rate

  HTTP Method: POST
  Endpoint: /v1/tax_rates/{tax_rate}

  Path Parameters:
    - tax_rate: Path parameter.

  """
  (stripe-request :post "/v1/tax_rates/" tax_rate "" params))

(defn get-tax-rates [params]
  """
  List all tax rates

  HTTP Method: GET
  Endpoint: /v1/tax_rates

  Query Parameters:
    - active: Optional flag to filter by tax rates that are either active or inactive (archived).
    - created: Optional range for filtering created date.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - inclusive: Optional flag to filter by tax rates that are inclusive (or those that are not inclusive).
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/tax_rates" params))

(defn post-tax-rates [params]
  """
  Create a tax rate

  HTTP Method: POST
  Endpoint: /v1/tax_rates

  """
  (stripe-request :post "/v1/tax_rates" params))