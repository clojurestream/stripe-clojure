(ns stream.clojure.stripe.api.apple-pay
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn delete-apple-pay [domain params]
  """
  No description available.

  HTTP Method: DELETE
  Endpoint: /v1/apple_pay/domains/{domain}

  Path Parameters:
    - domain: Path parameter.

  """
  (stripe-request :delete (str "/v1/apple_pay/domains/" domain "") params))

(defn retrieve-apple-pay [domain params]
  """
  No description available.

  HTTP Method: GET
  Endpoint: /v1/apple_pay/domains/{domain}

  Path Parameters:
    - domain: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/apple_pay/domains/" domain "") params))

(defn retrieve-apple-pay [params]
  """
  No description available.

  HTTP Method: GET
  Endpoint: /v1/apple_pay/domains

  Query Parameters:
    - domain_name: 
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/apple_pay/domains") params))

(defn create-apple-pay [params]
  """
  No description available.

  HTTP Method: POST
  Endpoint: /v1/apple_pay/domains

  """
  (stripe-request :post (str "/v1/apple_pay/domains") params))