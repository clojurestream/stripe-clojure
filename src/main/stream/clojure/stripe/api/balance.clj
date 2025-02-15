(ns stream.clojure.stripe.api.balance
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-history [{:keys [query-params]}]
  "List all balance transactions

  HTTP Method: GET
  Endpoint: /v1/balance/history

  Query Parameters:
    - created: Only return transactions that were created during the given date interval. [type: unknown]
    - currency: Only return transactions in a certain currency. Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies). [type: string]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - payout: For automatic Stripe payouts only, only returns transactions that were paid out on the specified payout ID. [type: string]
    - source: Only returns the original transaction. [type: string]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - type: Only returns transactions of the given type. One of: `adjustment`, `advance`, `advance_funding`, `anticipation_repayment`, `application_fee`, `application_fee_refund`, `charge`, `climate_order_purchase`, `climate_order_refund`, `connect_collection_transfer`, `contribution`, `issuing_authorization_hold`, `issuing_authorization_release`, `issuing_dispute`, `issuing_transaction`, `obligation_outbound`, `obligation_reversal_inbound`, `payment`, `payment_failure_refund`, `payment_network_reserve_hold`, `payment_network_reserve_release`, `payment_refund`, `payment_reversal`, `payment_unreconciled`, `payout`, `payout_cancel`, `payout_failure`, `payout_minimum_balance_hold`, `payout_minimum_balance_release`, `refund`, `refund_failure`, `reserve_transaction`, `reserved_funds`, `stripe_fee`, `stripe_fx_fee`, `tax_fee`, `topup`, `topup_reversal`, `transfer`, `transfer_cancel`, `transfer_failure`, or `transfer_refund`. [type: string]

  Example Usage:
    (list-all-history {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/balance/history" :query-params query-params}))

(defn retrieve-history-id [{:keys [history-id query-params]}]
  "Retrieve a balance transaction

  HTTP Method: GET
  Endpoint: /v1/balance/history/{history-id}

  Path Parameters:
    - history-id: The history-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-history-id {:history-id example-history-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/balance/history/{history-id}" :path-params {:history-id history-id} :query-params query-params}))

(defn list-all [{:keys [query-params]}]
  "Retrieve balance

  HTTP Method: GET
  Endpoint: /v1/balance

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/balance" :query-params query-params}))