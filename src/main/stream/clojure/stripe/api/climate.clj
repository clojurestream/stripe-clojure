(ns stream.clojure.stripe.api.climate
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-climate-orders-order-cancel [order params]
  """
  Cancel an order

  HTTP Method: POST
  Endpoint: /v1/climate/orders/{order}/cancel

  Path Parameters:
    - order: Path parameter.

  """
  (stripe-request :post "/v1/climate/orders/" order "/cancel" params))

(defn get-climate-suppliers [params]
  """
  List suppliers

  HTTP Method: GET
  Endpoint: /v1/climate/suppliers

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/climate/suppliers" params))

(defn get-climate-products [params]
  """
  List products

  HTTP Method: GET
  Endpoint: /v1/climate/products

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/climate/products" params))

(defn get-climate-products-product [product params]
  """
  Retrieve a product

  HTTP Method: GET
  Endpoint: /v1/climate/products/{product}

  Path Parameters:
    - product: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/climate/products/" product "" params))

(defn get-climate-orders [params]
  """
  List orders

  HTTP Method: GET
  Endpoint: /v1/climate/orders

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/climate/orders" params))

(defn post-climate-orders [params]
  """
  Create an order

  HTTP Method: POST
  Endpoint: /v1/climate/orders

  """
  (stripe-request :post "/v1/climate/orders" params))

(defn get-climate-orders-order [order params]
  """
  Retrieve an order

  HTTP Method: GET
  Endpoint: /v1/climate/orders/{order}

  Path Parameters:
    - order: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/climate/orders/" order "" params))

(defn post-climate-orders-order [order params]
  """
  Update an order

  HTTP Method: POST
  Endpoint: /v1/climate/orders/{order}

  Path Parameters:
    - order: Path parameter.

  """
  (stripe-request :post "/v1/climate/orders/" order "" params))

(defn get-climate-suppliers-supplier [supplier params]
  """
  Retrieve a supplier

  HTTP Method: GET
  Endpoint: /v1/climate/suppliers/{supplier}

  Path Parameters:
    - supplier: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/climate/suppliers/" supplier "" params))