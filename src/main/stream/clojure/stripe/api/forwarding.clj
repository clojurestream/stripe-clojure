(ns stream.clojure.stripe.api.forwarding
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn get-forwarding-requests [params]
  """
  List all ForwardingRequests

  HTTP Method: GET
  Endpoint: /v1/forwarding/requests

  Query Parameters:
    - created: Similar to other List endpoints, filters results based on created timestamp. You can pass gt, gte, lt, and lte timestamp values.
    - ending_before: A pagination cursor to fetch the previous page of the list. The value must be a ForwardingRequest ID.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A pagination cursor to fetch the next page of the list. The value must be a ForwardingRequest ID.

  """
  (stripe-request :get "/v1/forwarding/requests" params))

(defn post-forwarding-requests [params]
  """
  Create a ForwardingRequest

  HTTP Method: POST
  Endpoint: /v1/forwarding/requests

  """
  (stripe-request :post "/v1/forwarding/requests" params))

(defn get-forwarding-requests-id [id params]
  """
  Retrieve a ForwardingRequest

  HTTP Method: GET
  Endpoint: /v1/forwarding/requests/{id}

  Path Parameters:
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/forwarding/requests/" id "" params))