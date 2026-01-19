(ns stream.clojure.stripe.api.balance-transactions
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-balance-transactions
  "List all balance transactions

  HTTP Method: GET
  Endpoint: /v1/balance_transactions

  Query Parameters:
    - created (Unknown): Only return transactions that were created during the given date interval.
    - currency (String): Only return transactions in a certain currency. Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - payout (String): For automatic Stripe payouts only, only returns transactions that were paid out on the specified payout ID.
    - source (String): Only returns the original transaction.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - type (String): Only returns transactions of the given type. One of: `adjustment`, `advance`, `advance_funding`, `anticipation_repayment`, `application_fee`, `application_fee_refund`, `charge`, `climate_order_purchase`, `climate_order_refund`, `connect_collection_transfer`, `contribution`, `issuing_authorization_hold`, `issuing_authorization_release`, `issuing_dispute`, `issuing_transaction`, `obligation_outbound`, `obligation_reversal_inbound`, `payment`, `payment_failure_refund`, `payment_network_reserve_hold`, `payment_network_reserve_release`, `payment_refund`, `payment_reversal`, `payment_unreconciled`, `payout`, `payout_cancel`, `payout_failure`, `payout_minimum_balance_hold`, `payout_minimum_balance_release`, `refund`, `refund_failure`, `reserve_transaction`, `reserved_funds`, `stripe_fee`, `stripe_fx_fee`, `stripe_balance_payment_debit`, `stripe_balance_payment_debit_reversal`, `tax_fee`, `topup`, `topup_reversal`, `transfer`, `transfer_cancel`, `transfer_failure`, or `transfer_refund`.

  Example Usage:
    (list-all-balance-transactions {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/balance_transactions" :query-params query-params}))

(defn retrieve-balance-transactions-id
  "Retrieve a balance transaction

  HTTP Method: GET
  Endpoint: /v1/balance_transactions/{balance-transaction-id}

  Path Parameters:
    - balance-transaction-id (String): The balance-transaction-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-balance-transactions-id {:balance-transaction-id example-balance-transaction-id :query-params {:limit 10}})"
  [{:keys [balance-transaction-id query-params]}]
  (stripe-request :get {:endpoint "/v1/balance_transactions/{balance-transaction-id}" :path-params {:balance-transaction-id balance-transaction-id} :query-params query-params}))