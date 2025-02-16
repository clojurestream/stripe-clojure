(ns stream.clojure.stripe.api.prices
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all
  "List all prices

  HTTP Method: GET
  Endpoint: /v1/prices

  Query Parameters:
    - active (Boolean): Only return prices that are active or inactive (e.g., pass `false` to list all inactive prices).
    - created (Unknown): A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options.
    - currency (String): Only return prices for the given currency.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - lookup-keys (Array): Only return the price with these lookup_keys, if any exist. You can specify up to 10 lookup_keys.
    - product (String): Only return prices for the given product.
    - recurring (Object): Only return prices with these recurring fields.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - type (String): Only return prices of type `recurring` or `one_time`.

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/prices" :query-params query-params}))

(defn create
  "Create a price

  HTTP Method: POST
  Endpoint: /v1/prices

  Example Usage:
    (create {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/prices"}))

(defn retrieve-price
  "Retrieve a price

  HTTP Method: GET
  Endpoint: /v1/prices/{price-id}

  Path Parameters:
    - price-id (String): The price-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-price {:price-id example-price-id :query-params {:limit 10}})"
  [{:keys [price-id query-params]}]
  (stripe-request :get {:endpoint "/v1/prices/{price-id}" :path-params {:price-id price-id} :query-params query-params}))

(defn update-price
  "Update a price

  HTTP Method: POST
  Endpoint: /v1/prices/{price-id}

  Path Parameters:
    - price-id (String): The price-id parameter. (required)

  Example Usage:
    (update-price {:price-id example-price-id})"
  [{:keys [price-id]}]
  (stripe-request :post {:endpoint "/v1/prices/{price-id}" :path-params {:price-id price-id}}))

(defn list-all-search
  "Search prices

  HTTP Method: GET
  Endpoint: /v1/prices/search

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - page (String): A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results.
    - query (String): The search query string. See [search query language](https://stripe.com/docs/search#search-query-language) and the list of supported [query fields for prices](https://stripe.com/docs/search#query-fields-for-prices). (required)

  Example Usage:
    (list-all-search {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/prices/search" :query-params query-params}))