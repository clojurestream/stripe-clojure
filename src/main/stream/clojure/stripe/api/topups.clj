(ns stream.clojure.stripe.api.topups
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all
  "List all top-ups

  HTTP Method: GET
  Endpoint: /v1/topups

  Query Parameters:
    - amount (Unknown): A positive integer representing how much to transfer.
    - created (Unknown): A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): Only return top-ups that have the given status. One of `canceled`, `failed`, `pending` or `succeeded`.

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/topups" :query-params query-params}))

(defn create
  "Create a top-up

  HTTP Method: POST
  Endpoint: /v1/topups

  Example Usage:
    (create {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/topups"}))

(defn post-topup-cancel
  "Cancel a top-up

  HTTP Method: POST
  Endpoint: /v1/topups/{topup-id}/cancel

  Path Parameters:
    - topup-id (String): The topup-id parameter. (required)

  Example Usage:
    (post-topup-cancel {:topup-id example-topup-id})"
  [{:keys [topup-id]}]
  (stripe-request :post {:endpoint "/v1/topups/{topup-id}/cancel" :path-params {:topup-id topup-id}}))

(defn retrieve-topup
  "Retrieve a top-up

  HTTP Method: GET
  Endpoint: /v1/topups/{topup-id}

  Path Parameters:
    - topup-id (String): The topup-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-topup {:topup-id example-topup-id :query-params {:limit 10}})"
  [{:keys [topup-id query-params]}]
  (stripe-request :get {:endpoint "/v1/topups/{topup-id}" :path-params {:topup-id topup-id} :query-params query-params}))

(defn update-topup
  "Update a top-up

  HTTP Method: POST
  Endpoint: /v1/topups/{topup-id}

  Path Parameters:
    - topup-id (String): The topup-id parameter. (required)

  Example Usage:
    (update-topup {:topup-id example-topup-id})"
  [{:keys [topup-id]}]
  (stripe-request :post {:endpoint "/v1/topups/{topup-id}" :path-params {:topup-id topup-id}}))