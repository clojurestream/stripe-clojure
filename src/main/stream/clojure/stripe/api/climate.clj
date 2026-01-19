(ns stream.clojure.stripe.api.climate
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-orders-order-cancel
  "Cancel an order

  HTTP Method: POST
  Endpoint: /v1/climate/orders/{order-id}/cancel

  Path Parameters:
    - order-id (String): Unique identifier of the order.

  Example Usage:
    (post-orders-order-cancel {:order-id example-order-id})"
  [{:keys [order-id body]}]
  (stripe-request :post {:endpoint "/v1/climate/orders/{order-id}/cancel" :path-params {:order-id order-id} :body body}))

(defn list-all-suppliers
  "List suppliers

  HTTP Method: GET
  Endpoint: /v1/climate/suppliers

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-suppliers {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/climate/suppliers" :query-params query-params}))

(defn list-all-products
  "List products

  HTTP Method: GET
  Endpoint: /v1/climate/products

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-products {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/climate/products" :query-params query-params}))

(defn retrieve-products-product
  "Retrieve a product

  HTTP Method: GET
  Endpoint: /v1/climate/products/{product-id}

  Path Parameters:
    - product-id (String): The product-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-products-product {:product-id example-product-id :query-params {:limit 10}})"
  [{:keys [product-id query-params]}]
  (stripe-request :get {:endpoint "/v1/climate/products/{product-id}" :path-params {:product-id product-id} :query-params query-params}))

(defn list-all-orders
  "List orders

  HTTP Method: GET
  Endpoint: /v1/climate/orders

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-orders {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/climate/orders" :query-params query-params}))

(defn create-orders
  "Create an order

  HTTP Method: POST
  Endpoint: /v1/climate/orders

  Example Usage:
    (create-orders {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/climate/orders" :body body}))

(defn retrieve-orders-order
  "Retrieve an order

  HTTP Method: GET
  Endpoint: /v1/climate/orders/{order-id}

  Path Parameters:
    - order-id (String): Unique identifier of the order.

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-orders-order {:order-id example-order-id :query-params {:limit 10}})"
  [{:keys [order-id query-params]}]
  (stripe-request :get {:endpoint "/v1/climate/orders/{order-id}" :path-params {:order-id order-id} :query-params query-params}))

(defn update-orders-order
  "Update an order

  HTTP Method: POST
  Endpoint: /v1/climate/orders/{order-id}

  Path Parameters:
    - order-id (String): Unique identifier of the order.

  Example Usage:
    (update-orders-order {:order-id example-order-id})"
  [{:keys [order-id body]}]
  (stripe-request :post {:endpoint "/v1/climate/orders/{order-id}" :path-params {:order-id order-id} :body body}))

(defn retrieve-suppliers-supplier
  "Retrieve a supplier

  HTTP Method: GET
  Endpoint: /v1/climate/suppliers/{supplier-id}

  Path Parameters:
    - supplier-id (String): The supplier-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-suppliers-supplier {:supplier-id example-supplier-id :query-params {:limit 10}})"
  [{:keys [supplier-id query-params]}]
  (stripe-request :get {:endpoint "/v1/climate/suppliers/{supplier-id}" :path-params {:supplier-id supplier-id} :query-params query-params}))