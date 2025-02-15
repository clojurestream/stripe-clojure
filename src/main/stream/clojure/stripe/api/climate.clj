(ns stream.clojure.stripe.api.climate
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-orders-order-cancel [{:keys [order-id]}]
  "Cancel an order

  HTTP Method: POST
  Endpoint: /v1/climate/orders/{order-id}/cancel

  Path Parameters:
    - order-id: Unique identifier of the order.

  Example Usage:
    (post-orders-order-cancel {:order-id example-order-id})"
  (stripe-request :post {:endpoint "/v1/climate/orders/{order-id}/cancel" :path-params {:order-id order-id}}))

(defn list-all-suppliers [{:keys [query-params]}]
  "List suppliers

  HTTP Method: GET
  Endpoint: /v1/climate/suppliers

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-suppliers {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/climate/suppliers" :query-params query-params}))

(defn list-all-products [{:keys [query-params]}]
  "List products

  HTTP Method: GET
  Endpoint: /v1/climate/products

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-products {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/climate/products" :query-params query-params}))

(defn retrieve-products-product [{:keys [product-id query-params]}]
  "Retrieve a product

  HTTP Method: GET
  Endpoint: /v1/climate/products/{product-id}

  Path Parameters:
    - product-id: The product-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-products-product {:product-id example-product-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/climate/products/{product-id}" :path-params {:product-id product-id} :query-params query-params}))

(defn list-all-orders [{:keys [query-params]}]
  "List orders

  HTTP Method: GET
  Endpoint: /v1/climate/orders

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-orders {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/climate/orders" :query-params query-params}))

(defn create-orders [{:keys []}]
  "Create an order

  HTTP Method: POST
  Endpoint: /v1/climate/orders

  Example Usage:
    (create-orders {})"
  (stripe-request :post {:endpoint "/v1/climate/orders"}))

(defn retrieve-orders-order [{:keys [order-id query-params]}]
  "Retrieve an order

  HTTP Method: GET
  Endpoint: /v1/climate/orders/{order-id}

  Path Parameters:
    - order-id: Unique identifier of the order.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-orders-order {:order-id example-order-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/climate/orders/{order-id}" :path-params {:order-id order-id} :query-params query-params}))

(defn update-orders-order [{:keys [order-id]}]
  "Update an order

  HTTP Method: POST
  Endpoint: /v1/climate/orders/{order-id}

  Path Parameters:
    - order-id: Unique identifier of the order.

  Example Usage:
    (update-orders-order {:order-id example-order-id})"
  (stripe-request :post {:endpoint "/v1/climate/orders/{order-id}" :path-params {:order-id order-id}}))

(defn retrieve-suppliers-supplier [{:keys [supplier-id query-params]}]
  "Retrieve a supplier

  HTTP Method: GET
  Endpoint: /v1/climate/suppliers/{supplier-id}

  Path Parameters:
    - supplier-id: The supplier-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-suppliers-supplier {:supplier-id example-supplier-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/climate/suppliers/{supplier-id}" :path-params {:supplier-id supplier-id} :query-params query-params}))