(ns stream.clojure.stripe.api.products
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all [{:keys [query-params]}]
  "List all products

  HTTP Method: GET
  Endpoint: /v1/products

  Query Parameters:
    - active: Only return products that are active or inactive (e.g., pass `false` to list all inactive products). [type: boolean]
    - created: Only return products that were created during the given date interval. [type: unknown]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - ids: Only return products with the given IDs. Cannot be used with [starting_after](https://stripe.com/docs/api#list_products-starting_after) or [ending_before](https://stripe.com/docs/api#list_products-ending_before). [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - shippable: Only return products that can be shipped (i.e., physical, not digital products). [type: boolean]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - url: Only return products with the given url. [type: string]

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/products" :query-params query-params}))

(defn create [{:keys []}]
  "Create a product

  HTTP Method: POST
  Endpoint: /v1/products

  Example Usage:
    (create {})"
  (stripe-request :post {:endpoint "/v1/products"}))

(defn list-all-search [{:keys [query-params]}]
  "Search products

  HTTP Method: GET
  Endpoint: /v1/products/search

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - page: A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results. [type: string]
    - query: The search query string. See [search query language](https://stripe.com/docs/search#search-query-language) and the list of supported [query fields for products](https://stripe.com/docs/search#query-fields-for-products). (required) [type: string]

  Example Usage:
    (list-all-search {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/products/search" :query-params query-params}))

(defn delete-product-features-id [{:keys [product-id feature-id]}]
  "Remove a feature from a product

  HTTP Method: DELETE
  Endpoint: /v1/products/{product-id}/features/{feature-id}

  Path Parameters:
    - product-id: The product-id parameter. (required) [type: string]
    - feature-id: The feature-id parameter. (required) [type: string]

  Example Usage:
    (delete-product-features-id {:product-id example-product-id :feature-id example-feature-id})"
  (stripe-request :delete {:endpoint "/v1/products/{product-id}/features/{feature-id}" :path-params {:product-id product-id :feature-id feature-id}}))

(defn retrieve-product-features-id [{:keys [product-id feature-id query-params]}]
  "Retrieve a product_feature

  HTTP Method: GET
  Endpoint: /v1/products/{product-id}/features/{feature-id}

  Path Parameters:
    - product-id: The ID of the product.
    - feature-id: The ID of the product_feature.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-product-features-id {:product-id example-product-id :feature-id example-feature-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/products/{product-id}/features/{feature-id}" :path-params {:product-id product-id :feature-id feature-id} :query-params query-params}))

(defn list-all-product-features [{:keys [product-id query-params]}]
  "List all features attached to a product

  HTTP Method: GET
  Endpoint: /v1/products/{product-id}/features

  Path Parameters:
    - product-id: The product-id parameter. (required) [type: string]

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-product-features {:product-id example-product-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/products/{product-id}/features" :path-params {:product-id product-id} :query-params query-params}))

(defn post-product-features [{:keys [product-id]}]
  "Attach a feature to a product

  HTTP Method: POST
  Endpoint: /v1/products/{product-id}/features

  Path Parameters:
    - product-id: The product-id parameter. (required) [type: string]

  Example Usage:
    (post-product-features {:product-id example-product-id})"
  (stripe-request :post {:endpoint "/v1/products/{product-id}/features" :path-params {:product-id product-id}}))

(defn delete-id [{:keys [product-id]}]
  "Delete a product

  HTTP Method: DELETE
  Endpoint: /v1/products/{product-id}

  Path Parameters:
    - product-id: The product-id parameter. (required) [type: string]

  Example Usage:
    (delete-id {:product-id example-product-id})"
  (stripe-request :delete {:endpoint "/v1/products/{product-id}" :path-params {:product-id product-id}}))

(defn retrieve-id [{:keys [product-id query-params]}]
  "Retrieve a product

  HTTP Method: GET
  Endpoint: /v1/products/{product-id}

  Path Parameters:
    - product-id: The product-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-id {:product-id example-product-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/products/{product-id}" :path-params {:product-id product-id} :query-params query-params}))

(defn update-id [{:keys [product-id]}]
  "Update a product

  HTTP Method: POST
  Endpoint: /v1/products/{product-id}

  Path Parameters:
    - product-id: The product-id parameter. (required) [type: string]

  Example Usage:
    (update-id {:product-id example-product-id})"
  (stripe-request :post {:endpoint "/v1/products/{product-id}" :path-params {:product-id product-id}}))