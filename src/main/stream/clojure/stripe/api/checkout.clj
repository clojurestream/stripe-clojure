(ns stream.clojure.stripe.api.checkout
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-checkout [session params]
  """
  Retrieve a Session

  HTTP Method: GET
  Endpoint: /v1/checkout/sessions/{session}

  Path Parameters:
    - session: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/checkout/sessions/" session "") params))

(defn create-checkout [session params]
  """
  Update a Session

  HTTP Method: POST
  Endpoint: /v1/checkout/sessions/{session}

  Path Parameters:
    - session: Path parameter.

  """
  (stripe-request :post (str "/v1/checkout/sessions/" session "") params))

(defn retrieve-checkout [params]
  """
  List all Checkout Sessions

  HTTP Method: GET
  Endpoint: /v1/checkout/sessions

  Query Parameters:
    - created: Only return Checkout Sessions that were created during the given date interval.
    - customer: Only return the Checkout Sessions for the Customer specified.
    - customer_details: Only return the Checkout Sessions for the Customer details specified.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - payment_intent: Only return the Checkout Session for the PaymentIntent specified.
    - payment_link: Only return the Checkout Sessions for the Payment Link specified.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return the Checkout Sessions matching the given status.
    - subscription: Only return the Checkout Session for the subscription specified.

  """
  (stripe-request :get (str "/v1/checkout/sessions") params))

(defn create-checkout [params]
  """
  Create a Session

  HTTP Method: POST
  Endpoint: /v1/checkout/sessions

  """
  (stripe-request :post (str "/v1/checkout/sessions") params))

(defn retrieve-checkout [session params]
  """
  Retrieve a Checkout Session's line items

  HTTP Method: GET
  Endpoint: /v1/checkout/sessions/{session}/line_items

  Path Parameters:
    - session: Path parameter.

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/checkout/sessions/" session "/line_items") params))

(defn create-checkout [session params]
  """
  Expire a Session

  HTTP Method: POST
  Endpoint: /v1/checkout/sessions/{session}/expire

  Path Parameters:
    - session: Path parameter.

  """
  (stripe-request :post (str "/v1/checkout/sessions/" session "/expire") params))