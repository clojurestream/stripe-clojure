(ns stream.clojure.stripe.api.forwarding
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-requests [{:keys [query-params]}]
  "List all ForwardingRequests

  HTTP Method: GET
  Endpoint: /v1/forwarding/requests

  Query Parameters:
    - created: Similar to other List endpoints, filters results based on created timestamp. You can pass gt, gte, lt, and lte timestamp values. [type: object]
    - ending-before: A pagination cursor to fetch the previous page of the list. The value must be a ForwardingRequest ID. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A pagination cursor to fetch the next page of the list. The value must be a ForwardingRequest ID. [type: string]

  Example Usage:
    (list-all-requests {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/forwarding/requests" :query-params query-params}))

(defn create-requests [{:keys []}]
  "Create a ForwardingRequest

  HTTP Method: POST
  Endpoint: /v1/forwarding/requests

  Example Usage:
    (create-requests {})"
  (stripe-request :post {:endpoint "/v1/forwarding/requests"}))

(defn retrieve-requests-id [{:keys [request-id query-params]}]
  "Retrieve a ForwardingRequest

  HTTP Method: GET
  Endpoint: /v1/forwarding/requests/{request-id}

  Path Parameters:
    - request-id: The request-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-requests-id {:request-id example-request-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/forwarding/requests/{request-id}" :path-params {:request-id request-id} :query-params query-params}))