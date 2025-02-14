(ns stream.clojure.stripe.api.refunds
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-refunds-refund-cancel [refund params]
  """
  Cancel a refund

  HTTP Method: POST
  Endpoint: /v1/refunds/{refund}/cancel

  Path Parameters:
    - refund: Path parameter.

  """
  (stripe-request :post "/v1/refunds/" refund "/cancel" params))

(defn get-refunds-refund [refund params]
  """
  Retrieve a refund

  HTTP Method: GET
  Endpoint: /v1/refunds/{refund}

  Path Parameters:
    - refund: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/refunds/" refund "" params))

(defn post-refunds-refund [refund params]
  """
  Update a refund

  HTTP Method: POST
  Endpoint: /v1/refunds/{refund}

  Path Parameters:
    - refund: Path parameter.

  """
  (stripe-request :post "/v1/refunds/" refund "" params))

(defn get-refunds [params]
  """
  List all refunds

  HTTP Method: GET
  Endpoint: /v1/refunds

  Query Parameters:
    - charge: Only return refunds for the charge specified by this charge ID.
    - created: Only return refunds that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - payment_intent: Only return refunds for the PaymentIntent specified by this ID.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/refunds" params))

(defn post-refunds [params]
  """
  Create customer balance refund

  HTTP Method: POST
  Endpoint: /v1/refunds

  """
  (stripe-request :post "/v1/refunds" params))