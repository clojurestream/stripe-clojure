(ns stream.clojure.stripe.api.subscription-schedules
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-subscription-schedules [params]
  """
  List all schedules

  HTTP Method: GET
  Endpoint: /v1/subscription_schedules

  Query Parameters:
    - canceled_at: Only return subscription schedules that were created canceled the given date interval.
    - completed_at: Only return subscription schedules that completed during the given date interval.
    - created: Only return subscription schedules that were created during the given date interval.
    - customer: Only return subscription schedules for the given customer.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - released_at: Only return subscription schedules that were released during the given date interval.
    - scheduled: Only return subscription schedules that have not started yet.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/subscription_schedules") params))

(defn create-subscription-schedules [params]
  """
  Create a schedule

  HTTP Method: POST
  Endpoint: /v1/subscription_schedules

  """
  (stripe-request :post (str "/v1/subscription_schedules") params))

(defn create-subscription-schedules [schedule params]
  """
  Release a schedule

  HTTP Method: POST
  Endpoint: /v1/subscription_schedules/{schedule}/release

  Path Parameters:
    - schedule: Path parameter.

  """
  (stripe-request :post (str "/v1/subscription_schedules/" schedule "/release") params))

(defn retrieve-subscription-schedules [schedule params]
  """
  Retrieve a schedule

  HTTP Method: GET
  Endpoint: /v1/subscription_schedules/{schedule}

  Path Parameters:
    - schedule: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/subscription_schedules/" schedule "") params))

(defn create-subscription-schedules [schedule params]
  """
  Update a schedule

  HTTP Method: POST
  Endpoint: /v1/subscription_schedules/{schedule}

  Path Parameters:
    - schedule: Path parameter.

  """
  (stripe-request :post (str "/v1/subscription_schedules/" schedule "") params))

(defn create-subscription-schedules [schedule params]
  """
  Cancel a schedule

  HTTP Method: POST
  Endpoint: /v1/subscription_schedules/{schedule}/cancel

  Path Parameters:
    - schedule: Path parameter.

  """
  (stripe-request :post (str "/v1/subscription_schedules/" schedule "/cancel") params))