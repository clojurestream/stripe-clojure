(ns stream.clojure.stripe.api.reviews
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn create-reviews [review params]
  """
  Approve a review

  HTTP Method: POST
  Endpoint: /v1/reviews/{review}/approve

  Path Parameters:
    - review: Path parameter.

  """
  (stripe-request :post (str "/v1/reviews/" review "/approve") params))

(defn retrieve-reviews [review params]
  """
  Retrieve a review

  HTTP Method: GET
  Endpoint: /v1/reviews/{review}

  Path Parameters:
    - review: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/reviews/" review "") params))

(defn retrieve-reviews [params]
  """
  List all open reviews

  HTTP Method: GET
  Endpoint: /v1/reviews

  Query Parameters:
    - created: Only return reviews that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/reviews") params))