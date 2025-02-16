(ns stream.clojure.stripe.api.treasury
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-transaction-entries-id
  "Retrieve a TransactionEntry

  HTTP Method: GET
  Endpoint: /v1/treasury/transaction_entries/{transaction-entrie-id}

  Path Parameters:
    - transaction-entrie-id (String): The transaction-entrie-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-transaction-entries-id {:transaction-entrie-id example-transaction-entrie-id :query-params {:limit 10}})"
  [{:keys [transaction-entrie-id query-params]}]
  (stripe-request :get {:endpoint "/v1/treasury/transaction_entries/{transaction-entrie-id}" :path-params {:transaction-entrie-id transaction-entrie-id} :query-params query-params}))

(defn retrieve-outbound-payments-id
  "Retrieve an OutboundPayment

  HTTP Method: GET
  Endpoint: /v1/treasury/outbound_payments/{outbound-payment-id}

  Path Parameters:
    - outbound-payment-id (String): The outbound-payment-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-outbound-payments-id {:outbound-payment-id example-outbound-payment-id :query-params {:limit 10}})"
  [{:keys [outbound-payment-id query-params]}]
  (stripe-request :get {:endpoint "/v1/treasury/outbound_payments/{outbound-payment-id}" :path-params {:outbound-payment-id outbound-payment-id} :query-params query-params}))

(defn list-all-transactions
  "List all Transactions

  HTTP Method: GET
  Endpoint: /v1/treasury/transactions

  Query Parameters:
    - created (Unknown): Only return Transactions that were created during the given date interval.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - financial-account (String): Returns objects associated with this FinancialAccount. (required)
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - order-by (String): The results are in reverse chronological order by `created` or `posted_at`. The default is `created`.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): Only return Transactions that have the given status: `open`, `posted`, or `void`.
    - status-transitions (Object): A filter for the `status_transitions.posted_at` timestamp. When using this filter, `status=posted` and `order_by=posted_at` must also be specified.

  Example Usage:
    (list-all-transactions {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/treasury/transactions" :query-params query-params}))

(defn retrieve-outbound-transfers-outbound-transfer
  "Retrieve an OutboundTransfer

  HTTP Method: GET
  Endpoint: /v1/treasury/outbound_transfers/{outbound-transfer-id}

  Path Parameters:
    - outbound-transfer-id (String): The outbound-transfer-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-outbound-transfers-outbound-transfer {:outbound-transfer-id example-outbound-transfer-id :query-params {:limit 10}})"
  [{:keys [outbound-transfer-id query-params]}]
  (stripe-request :get {:endpoint "/v1/treasury/outbound_transfers/{outbound-transfer-id}" :path-params {:outbound-transfer-id outbound-transfer-id} :query-params query-params}))

(defn post-financial-accounts-financial-account-close
  "Close a FinancialAccount

  HTTP Method: POST
  Endpoint: /v1/treasury/financial_accounts/{financial-account-id}/close

  Path Parameters:
    - financial-account-id (String): The financial-account-id parameter. (required)

  Example Usage:
    (post-financial-accounts-financial-account-close {:financial-account-id example-financial-account-id})"
  [{:keys [financial-account-id]}]
  (stripe-request :post {:endpoint "/v1/treasury/financial_accounts/{financial-account-id}/close" :path-params {:financial-account-id financial-account-id}}))

(defn list-all-outbound-transfers
  "List all OutboundTransfers

  HTTP Method: GET
  Endpoint: /v1/treasury/outbound_transfers

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - financial-account (String): Returns objects associated with this FinancialAccount. (required)
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): Only return OutboundTransfers that have the given status: `processing`, `canceled`, `failed`, `posted`, or `returned`.

  Example Usage:
    (list-all-outbound-transfers {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/treasury/outbound_transfers" :query-params query-params}))

(defn create-outbound-transfers
  "Create an OutboundTransfer

  HTTP Method: POST
  Endpoint: /v1/treasury/outbound_transfers

  Example Usage:
    (create-outbound-transfers {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/treasury/outbound_transfers"}))

(defn list-all-transaction-entries
  "List all TransactionEntries

  HTTP Method: GET
  Endpoint: /v1/treasury/transaction_entries

  Query Parameters:
    - created (Unknown): Only return TransactionEntries that were created during the given date interval.
    - effective-at (Unknown): The effective-at parameter.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - financial-account (String): Returns objects associated with this FinancialAccount. (required)
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - order-by (String): The results are in reverse chronological order by `created` or `effective_at`. The default is `created`.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - transaction (String): Only return TransactionEntries associated with this Transaction.

  Example Usage:
    (list-all-transaction-entries {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/treasury/transaction_entries" :query-params query-params}))

(defn retrieve-credit-reversals-credit-reversal
  "Retrieve a CreditReversal

  HTTP Method: GET
  Endpoint: /v1/treasury/credit_reversals/{credit-reversal-id}

  Path Parameters:
    - credit-reversal-id (String): The credit-reversal-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-credit-reversals-credit-reversal {:credit-reversal-id example-credit-reversal-id :query-params {:limit 10}})"
  [{:keys [credit-reversal-id query-params]}]
  (stripe-request :get {:endpoint "/v1/treasury/credit_reversals/{credit-reversal-id}" :path-params {:credit-reversal-id credit-reversal-id} :query-params query-params}))

(defn list-all-financial-accounts-financial-account-features
  "Retrieve FinancialAccount Features

  HTTP Method: GET
  Endpoint: /v1/treasury/financial_accounts/{financial-account-id}/features

  Path Parameters:
    - financial-account-id (String): The financial-account-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (list-all-financial-accounts-financial-account-features {:financial-account-id example-financial-account-id :query-params {:limit 10}})"
  [{:keys [financial-account-id query-params]}]
  (stripe-request :get {:endpoint "/v1/treasury/financial_accounts/{financial-account-id}/features" :path-params {:financial-account-id financial-account-id} :query-params query-params}))

(defn update-financial-accounts-financial-account-features
  "Update FinancialAccount Features

  HTTP Method: POST
  Endpoint: /v1/treasury/financial_accounts/{financial-account-id}/features

  Path Parameters:
    - financial-account-id (String): The financial-account-id parameter. (required)

  Example Usage:
    (update-financial-accounts-financial-account-features {:financial-account-id example-financial-account-id})"
  [{:keys [financial-account-id]}]
  (stripe-request :post {:endpoint "/v1/treasury/financial_accounts/{financial-account-id}/features" :path-params {:financial-account-id financial-account-id}}))

(defn retrieve-inbound-transfers-id
  "Retrieve an InboundTransfer

  HTTP Method: GET
  Endpoint: /v1/treasury/inbound_transfers/{inbound-transfer-id}

  Path Parameters:
    - inbound-transfer-id (String): The inbound-transfer-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-inbound-transfers-id {:inbound-transfer-id example-inbound-transfer-id :query-params {:limit 10}})"
  [{:keys [inbound-transfer-id query-params]}]
  (stripe-request :get {:endpoint "/v1/treasury/inbound_transfers/{inbound-transfer-id}" :path-params {:inbound-transfer-id inbound-transfer-id} :query-params query-params}))

(defn list-all-financial-accounts
  "List all FinancialAccounts

  HTTP Method: GET
  Endpoint: /v1/treasury/financial_accounts

  Query Parameters:
    - created (Unknown): Only return FinancialAccounts that were created during the given date interval.
    - ending-before (String): An object ID cursor for use in pagination.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit ranging from 1 to 100 (defaults to 10).
    - starting-after (String): An object ID cursor for use in pagination.

  Example Usage:
    (list-all-financial-accounts {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/treasury/financial_accounts" :query-params query-params}))

(defn create-financial-accounts
  "Create a FinancialAccount

  HTTP Method: POST
  Endpoint: /v1/treasury/financial_accounts

  Example Usage:
    (create-financial-accounts {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/treasury/financial_accounts"}))

(defn post-inbound-transfers-inbound-transfer-cancel
  "Cancel an InboundTransfer

  HTTP Method: POST
  Endpoint: /v1/treasury/inbound_transfers/{inbound-transfer-id}/cancel

  Path Parameters:
    - inbound-transfer-id (String): The inbound-transfer-id parameter. (required)

  Example Usage:
    (post-inbound-transfers-inbound-transfer-cancel {:inbound-transfer-id example-inbound-transfer-id})"
  [{:keys [inbound-transfer-id]}]
  (stripe-request :post {:endpoint "/v1/treasury/inbound_transfers/{inbound-transfer-id}/cancel" :path-params {:inbound-transfer-id inbound-transfer-id}}))

(defn retrieve-received-debits-id
  "Retrieve a ReceivedDebit

  HTTP Method: GET
  Endpoint: /v1/treasury/received_debits/{received-debit-id}

  Path Parameters:
    - received-debit-id (String): The received-debit-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-received-debits-id {:received-debit-id example-received-debit-id :query-params {:limit 10}})"
  [{:keys [received-debit-id query-params]}]
  (stripe-request :get {:endpoint "/v1/treasury/received_debits/{received-debit-id}" :path-params {:received-debit-id received-debit-id} :query-params query-params}))

(defn post-outbound-payments-id-cancel
  "Cancel an OutboundPayment

  HTTP Method: POST
  Endpoint: /v1/treasury/outbound_payments/{outbound-payment-id}/cancel

  Path Parameters:
    - outbound-payment-id (String): The outbound-payment-id parameter. (required)

  Example Usage:
    (post-outbound-payments-id-cancel {:outbound-payment-id example-outbound-payment-id})"
  [{:keys [outbound-payment-id]}]
  (stripe-request :post {:endpoint "/v1/treasury/outbound_payments/{outbound-payment-id}/cancel" :path-params {:outbound-payment-id outbound-payment-id}}))

(defn list-all-outbound-payments
  "List all OutboundPayments

  HTTP Method: GET
  Endpoint: /v1/treasury/outbound_payments

  Query Parameters:
    - created (Unknown): Only return OutboundPayments that were created during the given date interval.
    - customer (String): Only return OutboundPayments sent to this customer.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - financial-account (String): Returns objects associated with this FinancialAccount. (required)
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): Only return OutboundPayments that have the given status: `processing`, `failed`, `posted`, `returned`, or `canceled`.

  Example Usage:
    (list-all-outbound-payments {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/treasury/outbound_payments" :query-params query-params}))

(defn create-outbound-payments
  "Create an OutboundPayment

  HTTP Method: POST
  Endpoint: /v1/treasury/outbound_payments

  Example Usage:
    (create-outbound-payments {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/treasury/outbound_payments"}))

(defn post-outbound-transfers-outbound-transfer-cancel
  "Cancel an OutboundTransfer

  HTTP Method: POST
  Endpoint: /v1/treasury/outbound_transfers/{outbound-transfer-id}/cancel

  Path Parameters:
    - outbound-transfer-id (String): The outbound-transfer-id parameter. (required)

  Example Usage:
    (post-outbound-transfers-outbound-transfer-cancel {:outbound-transfer-id example-outbound-transfer-id})"
  [{:keys [outbound-transfer-id]}]
  (stripe-request :post {:endpoint "/v1/treasury/outbound_transfers/{outbound-transfer-id}/cancel" :path-params {:outbound-transfer-id outbound-transfer-id}}))

(defn list-all-received-debits
  "List all ReceivedDebits

  HTTP Method: GET
  Endpoint: /v1/treasury/received_debits

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - financial-account (String): The FinancialAccount that funds were pulled from. (required)
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): Only return ReceivedDebits that have the given status: `succeeded` or `failed`.

  Example Usage:
    (list-all-received-debits {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/treasury/received_debits" :query-params query-params}))

(defn retrieve-debit-reversals-debit-reversal
  "Retrieve a DebitReversal

  HTTP Method: GET
  Endpoint: /v1/treasury/debit_reversals/{debit-reversal-id}

  Path Parameters:
    - debit-reversal-id (String): The debit-reversal-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-debit-reversals-debit-reversal {:debit-reversal-id example-debit-reversal-id :query-params {:limit 10}})"
  [{:keys [debit-reversal-id query-params]}]
  (stripe-request :get {:endpoint "/v1/treasury/debit_reversals/{debit-reversal-id}" :path-params {:debit-reversal-id debit-reversal-id} :query-params query-params}))

(defn retrieve-received-credits-id
  "Retrieve a ReceivedCredit

  HTTP Method: GET
  Endpoint: /v1/treasury/received_credits/{received-credit-id}

  Path Parameters:
    - received-credit-id (String): The received-credit-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-received-credits-id {:received-credit-id example-received-credit-id :query-params {:limit 10}})"
  [{:keys [received-credit-id query-params]}]
  (stripe-request :get {:endpoint "/v1/treasury/received_credits/{received-credit-id}" :path-params {:received-credit-id received-credit-id} :query-params query-params}))

(defn list-all-received-credits
  "List all ReceivedCredits

  HTTP Method: GET
  Endpoint: /v1/treasury/received_credits

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - financial-account (String): The FinancialAccount that received the funds. (required)
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - linked-flows (Object): Only return ReceivedCredits described by the flow.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): Only return ReceivedCredits that have the given status: `succeeded` or `failed`.

  Example Usage:
    (list-all-received-credits {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/treasury/received_credits" :query-params query-params}))

(defn list-all-inbound-transfers
  "List all InboundTransfers

  HTTP Method: GET
  Endpoint: /v1/treasury/inbound_transfers

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - financial-account (String): Returns objects associated with this FinancialAccount. (required)
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): Only return InboundTransfers that have the given status: `processing`, `succeeded`, `failed` or `canceled`.

  Example Usage:
    (list-all-inbound-transfers {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/treasury/inbound_transfers" :query-params query-params}))

(defn create-inbound-transfers
  "Create an InboundTransfer

  HTTP Method: POST
  Endpoint: /v1/treasury/inbound_transfers

  Example Usage:
    (create-inbound-transfers {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/treasury/inbound_transfers"}))

(defn list-all-credit-reversals
  "List all CreditReversals

  HTTP Method: GET
  Endpoint: /v1/treasury/credit_reversals

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - financial-account (String): Returns objects associated with this FinancialAccount. (required)
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - received-credit (String): Only return CreditReversals for the ReceivedCredit ID.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): Only return CreditReversals for a given status.

  Example Usage:
    (list-all-credit-reversals {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/treasury/credit_reversals" :query-params query-params}))

(defn create-credit-reversals
  "Create a CreditReversal

  HTTP Method: POST
  Endpoint: /v1/treasury/credit_reversals

  Example Usage:
    (create-credit-reversals {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/treasury/credit_reversals"}))

(defn retrieve-transactions-id
  "Retrieve a Transaction

  HTTP Method: GET
  Endpoint: /v1/treasury/transactions/{transaction-id}

  Path Parameters:
    - transaction-id (String): The transaction-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-transactions-id {:transaction-id example-transaction-id :query-params {:limit 10}})"
  [{:keys [transaction-id query-params]}]
  (stripe-request :get {:endpoint "/v1/treasury/transactions/{transaction-id}" :path-params {:transaction-id transaction-id} :query-params query-params}))

(defn retrieve-financial-accounts-financial-account
  "Retrieve a FinancialAccount

  HTTP Method: GET
  Endpoint: /v1/treasury/financial_accounts/{financial-account-id}

  Path Parameters:
    - financial-account-id (String): The financial-account-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-financial-accounts-financial-account {:financial-account-id example-financial-account-id :query-params {:limit 10}})"
  [{:keys [financial-account-id query-params]}]
  (stripe-request :get {:endpoint "/v1/treasury/financial_accounts/{financial-account-id}" :path-params {:financial-account-id financial-account-id} :query-params query-params}))

(defn update-financial-accounts-financial-account
  "Update a FinancialAccount

  HTTP Method: POST
  Endpoint: /v1/treasury/financial_accounts/{financial-account-id}

  Path Parameters:
    - financial-account-id (String): The financial-account-id parameter. (required)

  Example Usage:
    (update-financial-accounts-financial-account {:financial-account-id example-financial-account-id})"
  [{:keys [financial-account-id]}]
  (stripe-request :post {:endpoint "/v1/treasury/financial_accounts/{financial-account-id}" :path-params {:financial-account-id financial-account-id}}))

(defn list-all-debit-reversals
  "List all DebitReversals

  HTTP Method: GET
  Endpoint: /v1/treasury/debit_reversals

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - financial-account (String): Returns objects associated with this FinancialAccount. (required)
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - received-debit (String): Only return DebitReversals for the ReceivedDebit ID.
    - resolution (String): Only return DebitReversals for a given resolution.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): Only return DebitReversals for a given status.

  Example Usage:
    (list-all-debit-reversals {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/treasury/debit_reversals" :query-params query-params}))

(defn create-debit-reversals
  "Create a DebitReversal

  HTTP Method: POST
  Endpoint: /v1/treasury/debit_reversals

  Example Usage:
    (create-debit-reversals {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/treasury/debit_reversals"}))