(ns stream.clojure.stripe.api.topups
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all [{:keys [query-params]}]
  "List all top-ups

  HTTP Method: GET
  Endpoint: /v1/topups

  Query Parameters:
    - amount: A positive integer representing how much to transfer. [type: unknown]
    - created: A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options. [type: unknown]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - status: Only return top-ups that have the given status. One of `canceled`, `failed`, `pending` or `succeeded`. [type: string]

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/topups" :query-params query-params}))

(defn create [{:keys []}]
  "Create a top-up

  HTTP Method: POST
  Endpoint: /v1/topups

  Example Usage:
    (create {})"
  (stripe-request :post {:endpoint "/v1/topups"}))

(defn post-topup-cancel [{:keys [topup-id]}]
  "Cancel a top-up

  HTTP Method: POST
  Endpoint: /v1/topups/{topup-id}/cancel

  Path Parameters:
    - topup-id: The topup-id parameter. (required) [type: string]

  Example Usage:
    (post-topup-cancel {:topup-id example-topup-id})"
  (stripe-request :post {:endpoint "/v1/topups/{topup-id}/cancel" :path-params {:topup-id topup-id}}))

(defn retrieve-topup [{:keys [topup-id query-params]}]
  "Retrieve a top-up

  HTTP Method: GET
  Endpoint: /v1/topups/{topup-id}

  Path Parameters:
    - topup-id: The topup-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-topup {:topup-id example-topup-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/topups/{topup-id}" :path-params {:topup-id topup-id} :query-params query-params}))

(defn update-topup [{:keys [topup-id]}]
  "Update a top-up

  HTTP Method: POST
  Endpoint: /v1/topups/{topup-id}

  Path Parameters:
    - topup-id: The topup-id parameter. (required) [type: string]

  Example Usage:
    (update-topup {:topup-id example-topup-id})"
  (stripe-request :post {:endpoint "/v1/topups/{topup-id}" :path-params {:topup-id topup-id}}))