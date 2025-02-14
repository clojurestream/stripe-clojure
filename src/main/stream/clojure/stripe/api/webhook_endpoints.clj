(ns stream.clojure.stripe.api.webhook-endpoints
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-webhook-endpoints [params]
  """
  List all webhook endpoints

  HTTP Method: GET
  Endpoint: /v1/webhook_endpoints

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/webhook_endpoints") params))

(defn create-webhook-endpoints [params]
  """
  Create a webhook endpoint

  HTTP Method: POST
  Endpoint: /v1/webhook_endpoints

  """
  (stripe-request :post (str "/v1/webhook_endpoints") params))

(defn delete-webhook-endpoints [webhook_endpoint params]
  """
  Delete a webhook endpoint

  HTTP Method: DELETE
  Endpoint: /v1/webhook_endpoints/{webhook_endpoint}

  Path Parameters:
    - webhook_endpoint: Path parameter.

  """
  (stripe-request :delete (str "/v1/webhook_endpoints/" webhook_endpoint "") params))

(defn retrieve-webhook-endpoints [webhook_endpoint params]
  """
  Retrieve a webhook endpoint

  HTTP Method: GET
  Endpoint: /v1/webhook_endpoints/{webhook_endpoint}

  Path Parameters:
    - webhook_endpoint: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/webhook_endpoints/" webhook_endpoint "") params))

(defn create-webhook-endpoints [webhook_endpoint params]
  """
  Update a webhook endpoint

  HTTP Method: POST
  Endpoint: /v1/webhook_endpoints/{webhook_endpoint}

  Path Parameters:
    - webhook_endpoint: Path parameter.

  """
  (stripe-request :post (str "/v1/webhook_endpoints/" webhook_endpoint "") params))