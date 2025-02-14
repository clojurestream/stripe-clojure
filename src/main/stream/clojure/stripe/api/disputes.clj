(ns stream.clojure.stripe.api.disputes
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-disputes [params]
  """
  List all disputes

  HTTP Method: GET
  Endpoint: /v1/disputes

  Query Parameters:
    - charge: Only return disputes associated to the charge specified by this charge ID.
    - created: Only return disputes that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - payment_intent: Only return disputes associated to the PaymentIntent specified by this PaymentIntent ID.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/disputes") params))

(defn create-disputes [dispute params]
  """
  Close a dispute

  HTTP Method: POST
  Endpoint: /v1/disputes/{dispute}/close

  Path Parameters:
    - dispute: Path parameter.

  """
  (stripe-request :post (str "/v1/disputes/" dispute "/close") params))

(defn retrieve-disputes [dispute params]
  """
  Retrieve a dispute

  HTTP Method: GET
  Endpoint: /v1/disputes/{dispute}

  Path Parameters:
    - dispute: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/disputes/" dispute "") params))

(defn create-disputes [dispute params]
  """
  Update a dispute

  HTTP Method: POST
  Endpoint: /v1/disputes/{dispute}

  Path Parameters:
    - dispute: Path parameter.

  """
  (stripe-request :post (str "/v1/disputes/" dispute "") params))