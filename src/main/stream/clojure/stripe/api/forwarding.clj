(ns stream.clojure.stripe.api.forwarding
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-requests
  "List all ForwardingRequests

  HTTP Method: GET
  Endpoint: /v1/forwarding/requests

  Query Parameters:
    - created (Object): Similar to other List endpoints, filters results based on created timestamp. You can pass gt, gte, lt, and lte timestamp values.
    - ending-before (String): A pagination cursor to fetch the previous page of the list. The value must be a ForwardingRequest ID.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A pagination cursor to fetch the next page of the list. The value must be a ForwardingRequest ID.

  Example Usage:
    (list-all-requests {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/forwarding/requests" :query-params query-params}))

(defn create-requests
  "Create a ForwardingRequest

  HTTP Method: POST
  Endpoint: /v1/forwarding/requests

  Example Usage:
    (create-requests {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/forwarding/requests" :body body}))

(defn retrieve-requests-id
  "Retrieve a ForwardingRequest

  HTTP Method: GET
  Endpoint: /v1/forwarding/requests/{request-id}

  Path Parameters:
    - request-id (String): The request-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-requests-id {:request-id example-request-id :query-params {:limit 10}})"
  [{:keys [request-id query-params]}]
  (stripe-request :get {:endpoint "/v1/forwarding/requests/{request-id}" :path-params {:request-id request-id} :query-params query-params}))