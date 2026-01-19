(ns stream.clojure.stripe.api.products
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all
  "List all products

  HTTP Method: GET
  Endpoint: /v1/products

  Query Parameters:
    - active (Boolean): Only return products that are active or inactive (e.g., pass `false` to list all inactive products).
    - created (Unknown): Only return products that were created during the given date interval.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - ids (Array): Only return products with the given IDs. Cannot be used with [starting_after](https://api.stripe.com#list_products-starting_after) or [ending_before](https://api.stripe.com#list_products-ending_before).
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - shippable (Boolean): Only return products that can be shipped (i.e., physical, not digital products).
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - url (String): Only return products with the given url.

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/products" :query-params query-params}))

(defn create
  "Create a product

  HTTP Method: POST
  Endpoint: /v1/products

  Example Usage:
    (create {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/products" :body body}))

(defn list-all-search
  "Search products

  HTTP Method: GET
  Endpoint: /v1/products/search

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - page (String): A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results.
    - query (String): The search query string. See [search query language](https://docs.stripe.com/search#search-query-language) and the list of supported [query fields for products](https://docs.stripe.com/search#query-fields-for-products). (required)

  Example Usage:
    (list-all-search {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/products/search" :query-params query-params}))

(defn retrieve-product-features-id
  "Retrieve a product_feature

  HTTP Method: GET
  Endpoint: /v1/products/{product-id}/features/{feature-id}

  Path Parameters:
    - product-id (String): The ID of the product.
    - feature-id (String): The ID of the product_feature.

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-product-features-id {:product-id example-product-id :feature-id example-feature-id :query-params {:limit 10}})"
  [{:keys [product-id feature-id query-params]}]
  (stripe-request :get {:endpoint "/v1/products/{product-id}/features/{feature-id}" :path-params {:product-id product-id :feature-id feature-id} :query-params query-params}))

(defn delete-product-features-id
  "Remove a feature from a product

  HTTP Method: DELETE
  Endpoint: /v1/products/{product-id}/features/{feature-id}

  Path Parameters:
    - product-id (String): The product-id parameter. (required)
    - feature-id (String): The feature-id parameter. (required)

  Example Usage:
    (delete-product-features-id {:product-id example-product-id :feature-id example-feature-id})"
  [{:keys [product-id feature-id]}]
  (stripe-request :delete {:endpoint "/v1/products/{product-id}/features/{feature-id}" :path-params {:product-id product-id :feature-id feature-id}}))

(defn list-all-product-features
  "List all features attached to a product

  HTTP Method: GET
  Endpoint: /v1/products/{product-id}/features

  Path Parameters:
    - product-id (String): The product-id parameter. (required)

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-product-features {:product-id example-product-id :query-params {:limit 10}})"
  [{:keys [product-id query-params]}]
  (stripe-request :get {:endpoint "/v1/products/{product-id}/features" :path-params {:product-id product-id} :query-params query-params}))

(defn post-product-features
  "Attach a feature to a product

  HTTP Method: POST
  Endpoint: /v1/products/{product-id}/features

  Path Parameters:
    - product-id (String): The product-id parameter. (required)

  Example Usage:
    (post-product-features {:product-id example-product-id})"
  [{:keys [product-id body]}]
  (stripe-request :post {:endpoint "/v1/products/{product-id}/features" :path-params {:product-id product-id} :body body}))

(defn retrieve-id
  "Retrieve a product

  HTTP Method: GET
  Endpoint: /v1/products/{product-id}

  Path Parameters:
    - product-id (String): The product-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-id {:product-id example-product-id :query-params {:limit 10}})"
  [{:keys [product-id query-params]}]
  (stripe-request :get {:endpoint "/v1/products/{product-id}" :path-params {:product-id product-id} :query-params query-params}))

(defn delete-id
  "Delete a product

  HTTP Method: DELETE
  Endpoint: /v1/products/{product-id}

  Path Parameters:
    - product-id (String): The product-id parameter. (required)

  Example Usage:
    (delete-id {:product-id example-product-id})"
  [{:keys [product-id]}]
  (stripe-request :delete {:endpoint "/v1/products/{product-id}" :path-params {:product-id product-id}}))

(defn update-id
  "Update a product

  HTTP Method: POST
  Endpoint: /v1/products/{product-id}

  Path Parameters:
    - product-id (String): The product-id parameter. (required)

  Example Usage:
    (update-id {:product-id example-product-id})"
  [{:keys [product-id body]}]
  (stripe-request :post {:endpoint "/v1/products/{product-id}" :path-params {:product-id product-id} :body body}))