(ns stream.clojure.stripe.api.prices
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all [{:keys [query-params]}]
  "List all prices

  HTTP Method: GET
  Endpoint: /v1/prices

  Query Parameters:
    - active: Only return prices that are active or inactive (e.g., pass `false` to list all inactive prices). [type: boolean]
    - created: A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options. [type: unknown]
    - currency: Only return prices for the given currency. [type: string]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - lookup-keys: Only return the price with these lookup_keys, if any exist. You can specify up to 10 lookup_keys. [type: array]
    - product: Only return prices for the given product. [type: string]
    - recurring: Only return prices with these recurring fields. [type: object]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - type: Only return prices of type `recurring` or `one_time`. [type: string]

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/prices" :query-params query-params}))

(defn create [{:keys []}]
  "Create a price

  HTTP Method: POST
  Endpoint: /v1/prices

  Example Usage:
    (create {})"
  (stripe-request :post {:endpoint "/v1/prices"}))

(defn retrieve-price [{:keys [price-id query-params]}]
  "Retrieve a price

  HTTP Method: GET
  Endpoint: /v1/prices/{price-id}

  Path Parameters:
    - price-id: The price-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-price {:price-id example-price-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/prices/{price-id}" :path-params {:price-id price-id} :query-params query-params}))

(defn update-price [{:keys [price-id]}]
  "Update a price

  HTTP Method: POST
  Endpoint: /v1/prices/{price-id}

  Path Parameters:
    - price-id: The price-id parameter. (required) [type: string]

  Example Usage:
    (update-price {:price-id example-price-id})"
  (stripe-request :post {:endpoint "/v1/prices/{price-id}" :path-params {:price-id price-id}}))

(defn list-all-search [{:keys [query-params]}]
  "Search prices

  HTTP Method: GET
  Endpoint: /v1/prices/search

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - page: A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results. [type: string]
    - query: The search query string. See [search query language](https://stripe.com/docs/search#search-query-language) and the list of supported [query fields for prices](https://stripe.com/docs/search#query-fields-for-prices). (required) [type: string]

  Example Usage:
    (list-all-search {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/prices/search" :query-params query-params}))