(ns stream.clojure.stripe.api.payouts
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-payout-cancel [{:keys [payout-id]}]
  "Cancel a payout

  HTTP Method: POST
  Endpoint: /v1/payouts/{payout-id}/cancel

  Path Parameters:
    - payout-id: The payout-id parameter. (required) [type: string]

  Example Usage:
    (post-payout-cancel {:payout-id example-payout-id})"
  (stripe-request :post {:endpoint "/v1/payouts/{payout-id}/cancel" :path-params {:payout-id payout-id}}))

(defn retrieve-payout [{:keys [payout-id query-params]}]
  "Retrieve a payout

  HTTP Method: GET
  Endpoint: /v1/payouts/{payout-id}

  Path Parameters:
    - payout-id: The payout-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-payout {:payout-id example-payout-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/payouts/{payout-id}" :path-params {:payout-id payout-id} :query-params query-params}))

(defn update-payout [{:keys [payout-id]}]
  "Update a payout

  HTTP Method: POST
  Endpoint: /v1/payouts/{payout-id}

  Path Parameters:
    - payout-id: The payout-id parameter. (required) [type: string]

  Example Usage:
    (update-payout {:payout-id example-payout-id})"
  (stripe-request :post {:endpoint "/v1/payouts/{payout-id}" :path-params {:payout-id payout-id}}))

(defn post-payout-reverse [{:keys [payout-id]}]
  "Reverse a payout

  HTTP Method: POST
  Endpoint: /v1/payouts/{payout-id}/reverse

  Path Parameters:
    - payout-id: The payout-id parameter. (required) [type: string]

  Example Usage:
    (post-payout-reverse {:payout-id example-payout-id})"
  (stripe-request :post {:endpoint "/v1/payouts/{payout-id}/reverse" :path-params {:payout-id payout-id}}))

(defn list-all [{:keys [query-params]}]
  "List all payouts

  HTTP Method: GET
  Endpoint: /v1/payouts

  Query Parameters:
    - arrival-date: Only return payouts that are expected to arrive during the given date interval. [type: unknown]
    - created: Only return payouts that were created during the given date interval. [type: unknown]
    - destination: The ID of an external account - only return payouts sent to this external account. [type: string]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - status: Only return payouts that have the given status: `pending`, `paid`, `failed`, or `canceled`. [type: string]

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/payouts" :query-params query-params}))

(defn create [{:keys []}]
  "Create a payout

  HTTP Method: POST
  Endpoint: /v1/payouts

  Example Usage:
    (create {})"
  (stripe-request :post {:endpoint "/v1/payouts"}))