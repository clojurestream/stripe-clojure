(ns stream.clojure.stripe.api.payouts
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-payout-cancel
  "Cancel a payout

  HTTP Method: POST
  Endpoint: /v1/payouts/{payout-id}/cancel

  Path Parameters:
    - payout-id (String): The payout-id parameter. (required)

  Example Usage:
    (post-payout-cancel {:payout-id example-payout-id})"
  [{:keys [payout-id]}]
  (stripe-request :post {:endpoint "/v1/payouts/{payout-id}/cancel" :path-params {:payout-id payout-id}}))

(defn retrieve-payout
  "Retrieve a payout

  HTTP Method: GET
  Endpoint: /v1/payouts/{payout-id}

  Path Parameters:
    - payout-id (String): The payout-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-payout {:payout-id example-payout-id :query-params {:limit 10}})"
  [{:keys [payout-id query-params]}]
  (stripe-request :get {:endpoint "/v1/payouts/{payout-id}" :path-params {:payout-id payout-id} :query-params query-params}))

(defn update-payout
  "Update a payout

  HTTP Method: POST
  Endpoint: /v1/payouts/{payout-id}

  Path Parameters:
    - payout-id (String): The payout-id parameter. (required)

  Example Usage:
    (update-payout {:payout-id example-payout-id})"
  [{:keys [payout-id]}]
  (stripe-request :post {:endpoint "/v1/payouts/{payout-id}" :path-params {:payout-id payout-id}}))

(defn post-payout-reverse
  "Reverse a payout

  HTTP Method: POST
  Endpoint: /v1/payouts/{payout-id}/reverse

  Path Parameters:
    - payout-id (String): The payout-id parameter. (required)

  Example Usage:
    (post-payout-reverse {:payout-id example-payout-id})"
  [{:keys [payout-id]}]
  (stripe-request :post {:endpoint "/v1/payouts/{payout-id}/reverse" :path-params {:payout-id payout-id}}))

(defn list-all
  "List all payouts

  HTTP Method: GET
  Endpoint: /v1/payouts

  Query Parameters:
    - arrival-date (Unknown): Only return payouts that are expected to arrive during the given date interval.
    - created (Unknown): Only return payouts that were created during the given date interval.
    - destination (String): The ID of an external account - only return payouts sent to this external account.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): Only return payouts that have the given status: `pending`, `paid`, `failed`, or `canceled`.

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/payouts" :query-params query-params}))

(defn create
  "Create a payout

  HTTP Method: POST
  Endpoint: /v1/payouts

  Example Usage:
    (create {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/payouts"}))