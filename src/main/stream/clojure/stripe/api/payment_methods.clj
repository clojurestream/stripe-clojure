(ns stream.clojure.stripe.api.payment-methods
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-payment-methods-payment-method-detach [payment_method params]
  """
  Detach a PaymentMethod from a Customer

  HTTP Method: POST
  Endpoint: /v1/payment_methods/{payment_method}/detach

  Path Parameters:
    - payment_method: Path parameter.

  """
  (stripe-request :post "/v1/payment_methods/" payment_method "/detach" params))

(defn get-payment-methods [params]
  """
  List PaymentMethods

  HTTP Method: GET
  Endpoint: /v1/payment_methods

  Query Parameters:
    - customer: The ID of the customer whose PaymentMethods will be retrieved.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - type: An optional filter on the list, based on the object `type` field. Without the filter, the list includes all current and future payment method types. If your integration expects only one type of payment method in the response, make sure to provide a type value in the request.

  """
  (stripe-request :get "/v1/payment_methods" params))

(defn post-payment-methods [params]
  """
  Shares a PaymentMethod

  HTTP Method: POST
  Endpoint: /v1/payment_methods

  """
  (stripe-request :post "/v1/payment_methods" params))

(defn post-payment-methods-payment-method-attach [payment_method params]
  """
  Attach a PaymentMethod to a Customer

  HTTP Method: POST
  Endpoint: /v1/payment_methods/{payment_method}/attach

  Path Parameters:
    - payment_method: Path parameter.

  """
  (stripe-request :post "/v1/payment_methods/" payment_method "/attach" params))

(defn get-payment-methods-payment-method [payment_method params]
  """
  Retrieve a PaymentMethod

  HTTP Method: GET
  Endpoint: /v1/payment_methods/{payment_method}

  Path Parameters:
    - payment_method: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/payment_methods/" payment_method "" params))

(defn post-payment-methods-payment-method [payment_method params]
  """
  Update a PaymentMethod

  HTTP Method: POST
  Endpoint: /v1/payment_methods/{payment_method}

  Path Parameters:
    - payment_method: Path parameter.

  """
  (stripe-request :post "/v1/payment_methods/" payment_method "" params))