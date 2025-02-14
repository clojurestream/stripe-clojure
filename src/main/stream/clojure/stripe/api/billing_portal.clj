(ns stream.clojure.stripe.api.billing-portal
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn create-billing-portal [params]
  """
  Create a portal session

  HTTP Method: POST
  Endpoint: /v1/billing_portal/sessions

  """
  (stripe-request :post (str "/v1/billing_portal/sessions") params))

(defn retrieve-billing-portal [params]
  """
  List portal configurations

  HTTP Method: GET
  Endpoint: /v1/billing_portal/configurations

  Query Parameters:
    - active: Only return configurations that are active or inactive (e.g., pass `true` to only list active configurations).
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - is_default: Only return the default or non-default configurations (e.g., pass `true` to only list the default configuration).
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/billing_portal/configurations") params))

(defn create-billing-portal [params]
  """
  Create a portal configuration

  HTTP Method: POST
  Endpoint: /v1/billing_portal/configurations

  """
  (stripe-request :post (str "/v1/billing_portal/configurations") params))

(defn retrieve-billing-portal [configuration params]
  """
  Retrieve a portal configuration

  HTTP Method: GET
  Endpoint: /v1/billing_portal/configurations/{configuration}

  Path Parameters:
    - configuration: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/billing_portal/configurations/" configuration "") params))

(defn create-billing-portal [configuration params]
  """
  Update a portal configuration

  HTTP Method: POST
  Endpoint: /v1/billing_portal/configurations/{configuration}

  Path Parameters:
    - configuration: Path parameter.

  """
  (stripe-request :post (str "/v1/billing_portal/configurations/" configuration "") params))