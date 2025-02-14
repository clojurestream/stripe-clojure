(ns stream.clojure.stripe.api.prices
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn get-prices [params]
  """
  List all prices

  HTTP Method: GET
  Endpoint: /v1/prices

  Query Parameters:
    - active: Only return prices that are active or inactive (e.g., pass `false` to list all inactive prices).
    - created: A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options.
    - currency: Only return prices for the given currency.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - lookup_keys: Only return the price with these lookup_keys, if any exist. You can specify up to 10 lookup_keys.
    - product: Only return prices for the given product.
    - recurring: Only return prices with these recurring fields.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - type: Only return prices of type `recurring` or `one_time`.

  """
  (stripe-request :get "/v1/prices" params))

(defn post-prices [params]
  """
  Create a price

  HTTP Method: POST
  Endpoint: /v1/prices

  """
  (stripe-request :post "/v1/prices" params))

(defn get-prices-price [price params]
  """
  Retrieve a price

  HTTP Method: GET
  Endpoint: /v1/prices/{price}

  Path Parameters:
    - price: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/prices/" price "" params))

(defn post-prices-price [price params]
  """
  Update a price

  HTTP Method: POST
  Endpoint: /v1/prices/{price}

  Path Parameters:
    - price: Path parameter.

  """
  (stripe-request :post "/v1/prices/" price "" params))

(defn get-prices-search [params]
  """
  Search prices

  HTTP Method: GET
  Endpoint: /v1/prices/search

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - page: A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results.
    - query: The search query string. See [search query language](https://stripe.com/docs/search#search-query-language) and the list of supported [query fields for prices](https://stripe.com/docs/search#query-fields-for-prices).

  """
  (stripe-request :get "/v1/prices/search" params))