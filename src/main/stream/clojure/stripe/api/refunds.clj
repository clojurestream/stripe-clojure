(ns stream.clojure.stripe.api.refunds
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-refund-cancel [{:keys [refund-id]}]
  "Cancel a refund

  HTTP Method: POST
  Endpoint: /v1/refunds/{refund-id}/cancel

  Path Parameters:
    - refund-id: The refund-id parameter. (required) [type: string]

  Example Usage:
    (post-refund-cancel {:refund-id example-refund-id})"
  (stripe-request :post {:endpoint "/v1/refunds/{refund-id}/cancel" :path-params {:refund-id refund-id}}))

(defn retrieve-refund [{:keys [refund-id query-params]}]
  "Retrieve a refund

  HTTP Method: GET
  Endpoint: /v1/refunds/{refund-id}

  Path Parameters:
    - refund-id: The refund-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-refund {:refund-id example-refund-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/refunds/{refund-id}" :path-params {:refund-id refund-id} :query-params query-params}))

(defn update-refund [{:keys [refund-id]}]
  "Update a refund

  HTTP Method: POST
  Endpoint: /v1/refunds/{refund-id}

  Path Parameters:
    - refund-id: The refund-id parameter. (required) [type: string]

  Example Usage:
    (update-refund {:refund-id example-refund-id})"
  (stripe-request :post {:endpoint "/v1/refunds/{refund-id}" :path-params {:refund-id refund-id}}))

(defn list-all [{:keys [query-params]}]
  "List all refunds

  HTTP Method: GET
  Endpoint: /v1/refunds

  Query Parameters:
    - charge: Only return refunds for the charge specified by this charge ID. [type: string]
    - created: Only return refunds that were created during the given date interval. [type: unknown]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - payment-intent: Only return refunds for the PaymentIntent specified by this ID. [type: string]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/refunds" :query-params query-params}))

(defn create [{:keys []}]
  "Create customer balance refund

  HTTP Method: POST
  Endpoint: /v1/refunds

  Example Usage:
    (create {})"
  (stripe-request :post {:endpoint "/v1/refunds"}))