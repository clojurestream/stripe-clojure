(ns stream.clojure.stripe.api.products
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-products [params]
  """
  List all products

  HTTP Method: GET
  Endpoint: /v1/products

  Query Parameters:
    - active: Only return products that are active or inactive (e.g., pass `false` to list all inactive products).
    - created: Only return products that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - ids: Only return products with the given IDs. Cannot be used with [starting_after](https://stripe.com/docs/api#list_products-starting_after) or [ending_before](https://stripe.com/docs/api#list_products-ending_before).
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - shippable: Only return products that can be shipped (i.e., physical, not digital products).
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - url: Only return products with the given url.

  """
  (stripe-request :get (str "/v1/products") params))

(defn create-products [params]
  """
  Create a product

  HTTP Method: POST
  Endpoint: /v1/products

  """
  (stripe-request :post (str "/v1/products") params))

(defn retrieve-products [params]
  """
  Search products

  HTTP Method: GET
  Endpoint: /v1/products/search

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - page: A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results.
    - query: The search query string. See [search query language](https://stripe.com/docs/search#search-query-language) and the list of supported [query fields for products](https://stripe.com/docs/search#query-fields-for-products).

  """
  (stripe-request :get (str "/v1/products/search") params))

(defn delete-products [product id params]
  """
  Remove a feature from a product

  HTTP Method: DELETE
  Endpoint: /v1/products/{product}/features/{id}

  Path Parameters:
    - product: Path parameter.
    - id: Path parameter.

  """
  (stripe-request :delete (str "/v1/products/" product "/features/" id "") params))

(defn retrieve-products [product id params]
  """
  Retrieve a product_feature

  HTTP Method: GET
  Endpoint: /v1/products/{product}/features/{id}

  Path Parameters:
    - product: Path parameter.
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/products/" product "/features/" id "") params))

(defn retrieve-products [product params]
  """
  List all features attached to a product

  HTTP Method: GET
  Endpoint: /v1/products/{product}/features

  Path Parameters:
    - product: Path parameter.

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/products/" product "/features") params))

(defn create-products [product params]
  """
  Attach a feature to a product

  HTTP Method: POST
  Endpoint: /v1/products/{product}/features

  Path Parameters:
    - product: Path parameter.

  """
  (stripe-request :post (str "/v1/products/" product "/features") params))

(defn delete-products [id params]
  """
  Delete a product

  HTTP Method: DELETE
  Endpoint: /v1/products/{id}

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :delete (str "/v1/products/" id "") params))

(defn retrieve-products [id params]
  """
  Retrieve a product

  HTTP Method: GET
  Endpoint: /v1/products/{id}

  Path Parameters:
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/products/" id "") params))

(defn create-products [id params]
  """
  Update a product

  HTTP Method: POST
  Endpoint: /v1/products/{id}

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :post (str "/v1/products/" id "") params))