(ns stream.clojure.stripe.api.payment-method-configurations
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn get-payment-method-configurations [params]
  """
  List payment method configurations

  HTTP Method: GET
  Endpoint: /v1/payment_method_configurations

  Query Parameters:
    - application: The Connect application to filter by.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/payment_method_configurations" params))

(defn post-payment-method-configurations [params]
  """
  Create a payment method configuration

  HTTP Method: POST
  Endpoint: /v1/payment_method_configurations

  """
  (stripe-request :post "/v1/payment_method_configurations" params))

(defn get-payment-method-configurations-configuration [configuration params]
  """
  Retrieve payment method configuration

  HTTP Method: GET
  Endpoint: /v1/payment_method_configurations/{configuration}

  Path Parameters:
    - configuration: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/payment_method_configurations/" configuration "" params))

(defn post-payment-method-configurations-configuration [configuration params]
  """
  Update payment method configuration

  HTTP Method: POST
  Endpoint: /v1/payment_method_configurations/{configuration}

  Path Parameters:
    - configuration: Path parameter.

  """
  (stripe-request :post "/v1/payment_method_configurations/" configuration "" params))