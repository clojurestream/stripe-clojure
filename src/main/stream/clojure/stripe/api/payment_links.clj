(ns stream.clojure.stripe.api.payment-links
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn get-payment-links-payment-link [payment_link params]
  """
  Retrieve payment link

  HTTP Method: GET
  Endpoint: /v1/payment_links/{payment_link}

  Path Parameters:
    - payment_link: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/payment_links/" payment_link "" params))

(defn post-payment-links-payment-link [payment_link params]
  """
  Update a payment link

  HTTP Method: POST
  Endpoint: /v1/payment_links/{payment_link}

  Path Parameters:
    - payment_link: Path parameter.

  """
  (stripe-request :post "/v1/payment_links/" payment_link "" params))

(defn get-payment-links-payment-link-line-items [payment_link params]
  """
  Retrieve a payment link's line items

  HTTP Method: GET
  Endpoint: /v1/payment_links/{payment_link}/line_items

  Path Parameters:
    - payment_link: Path parameter.

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/payment_links/" payment_link "/line_items" params))

(defn get-payment-links [params]
  """
  List all payment links

  HTTP Method: GET
  Endpoint: /v1/payment_links

  Query Parameters:
    - active: Only return payment links that are active or inactive (e.g., pass `false` to list all inactive payment links).
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/payment_links" params))

(defn post-payment-links [params]
  """
  Create a payment link

  HTTP Method: POST
  Endpoint: /v1/payment_links

  """
  (stripe-request :post "/v1/payment_links" params))