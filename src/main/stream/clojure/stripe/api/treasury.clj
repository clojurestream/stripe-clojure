(ns stream.clojure.stripe.api.treasury
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-treasury [id params]
  """
  Retrieve a TransactionEntry

  HTTP Method: GET
  Endpoint: /v1/treasury/transaction_entries/{id}

  Path Parameters:
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/treasury/transaction_entries/" id "") params))

(defn retrieve-treasury [id params]
  """
  Retrieve an OutboundPayment

  HTTP Method: GET
  Endpoint: /v1/treasury/outbound_payments/{id}

  Path Parameters:
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/treasury/outbound_payments/" id "") params))

(defn retrieve-treasury [params]
  """
  List all Transactions

  HTTP Method: GET
  Endpoint: /v1/treasury/transactions

  Query Parameters:
    - created: Only return Transactions that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - financial_account: Returns objects associated with this FinancialAccount.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - order_by: The results are in reverse chronological order by `created` or `posted_at`. The default is `created`.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return Transactions that have the given status: `open`, `posted`, or `void`.
    - status_transitions: A filter for the `status_transitions.posted_at` timestamp. When using this filter, `status=posted` and `order_by=posted_at` must also be specified.

  """
  (stripe-request :get (str "/v1/treasury/transactions") params))

(defn retrieve-treasury [outbound_transfer params]
  """
  Retrieve an OutboundTransfer

  HTTP Method: GET
  Endpoint: /v1/treasury/outbound_transfers/{outbound_transfer}

  Path Parameters:
    - outbound_transfer: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/treasury/outbound_transfers/" outbound_transfer "") params))

(defn create-treasury [financial_account params]
  """
  Close a FinancialAccount

  HTTP Method: POST
  Endpoint: /v1/treasury/financial_accounts/{financial_account}/close

  Path Parameters:
    - financial_account: Path parameter.

  """
  (stripe-request :post (str "/v1/treasury/financial_accounts/" financial_account "/close") params))

(defn retrieve-treasury [params]
  """
  List all OutboundTransfers

  HTTP Method: GET
  Endpoint: /v1/treasury/outbound_transfers

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - financial_account: Returns objects associated with this FinancialAccount.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return OutboundTransfers that have the given status: `processing`, `canceled`, `failed`, `posted`, or `returned`.

  """
  (stripe-request :get (str "/v1/treasury/outbound_transfers") params))

(defn create-treasury [params]
  """
  Create an OutboundTransfer

  HTTP Method: POST
  Endpoint: /v1/treasury/outbound_transfers

  """
  (stripe-request :post (str "/v1/treasury/outbound_transfers") params))

(defn retrieve-treasury [params]
  """
  List all TransactionEntries

  HTTP Method: GET
  Endpoint: /v1/treasury/transaction_entries

  Query Parameters:
    - created: Only return TransactionEntries that were created during the given date interval.
    - effective_at: 
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - financial_account: Returns objects associated with this FinancialAccount.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - order_by: The results are in reverse chronological order by `created` or `effective_at`. The default is `created`.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - transaction: Only return TransactionEntries associated with this Transaction.

  """
  (stripe-request :get (str "/v1/treasury/transaction_entries") params))

(defn retrieve-treasury [credit_reversal params]
  """
  Retrieve a CreditReversal

  HTTP Method: GET
  Endpoint: /v1/treasury/credit_reversals/{credit_reversal}

  Path Parameters:
    - credit_reversal: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/treasury/credit_reversals/" credit_reversal "") params))

(defn retrieve-treasury [financial_account params]
  """
  Retrieve FinancialAccount Features

  HTTP Method: GET
  Endpoint: /v1/treasury/financial_accounts/{financial_account}/features

  Path Parameters:
    - financial_account: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/treasury/financial_accounts/" financial_account "/features") params))

(defn create-treasury [financial_account params]
  """
  Update FinancialAccount Features

  HTTP Method: POST
  Endpoint: /v1/treasury/financial_accounts/{financial_account}/features

  Path Parameters:
    - financial_account: Path parameter.

  """
  (stripe-request :post (str "/v1/treasury/financial_accounts/" financial_account "/features") params))

(defn retrieve-treasury [id params]
  """
  Retrieve an InboundTransfer

  HTTP Method: GET
  Endpoint: /v1/treasury/inbound_transfers/{id}

  Path Parameters:
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/treasury/inbound_transfers/" id "") params))

(defn retrieve-treasury [params]
  """
  List all FinancialAccounts

  HTTP Method: GET
  Endpoint: /v1/treasury/financial_accounts

  Query Parameters:
    - created: Only return FinancialAccounts that were created during the given date interval.
    - ending_before: An object ID cursor for use in pagination.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit ranging from 1 to 100 (defaults to 10).
    - starting_after: An object ID cursor for use in pagination.

  """
  (stripe-request :get (str "/v1/treasury/financial_accounts") params))

(defn create-treasury [params]
  """
  Create a FinancialAccount

  HTTP Method: POST
  Endpoint: /v1/treasury/financial_accounts

  """
  (stripe-request :post (str "/v1/treasury/financial_accounts") params))

(defn create-treasury [inbound_transfer params]
  """
  Cancel an InboundTransfer

  HTTP Method: POST
  Endpoint: /v1/treasury/inbound_transfers/{inbound_transfer}/cancel

  Path Parameters:
    - inbound_transfer: Path parameter.

  """
  (stripe-request :post (str "/v1/treasury/inbound_transfers/" inbound_transfer "/cancel") params))

(defn retrieve-treasury [id params]
  """
  Retrieve a ReceivedDebit

  HTTP Method: GET
  Endpoint: /v1/treasury/received_debits/{id}

  Path Parameters:
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/treasury/received_debits/" id "") params))

(defn create-treasury [id params]
  """
  Cancel an OutboundPayment

  HTTP Method: POST
  Endpoint: /v1/treasury/outbound_payments/{id}/cancel

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :post (str "/v1/treasury/outbound_payments/" id "/cancel") params))

(defn retrieve-treasury [params]
  """
  List all OutboundPayments

  HTTP Method: GET
  Endpoint: /v1/treasury/outbound_payments

  Query Parameters:
    - created: Only return OutboundPayments that were created during the given date interval.
    - customer: Only return OutboundPayments sent to this customer.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - financial_account: Returns objects associated with this FinancialAccount.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return OutboundPayments that have the given status: `processing`, `failed`, `posted`, `returned`, or `canceled`.

  """
  (stripe-request :get (str "/v1/treasury/outbound_payments") params))

(defn create-treasury [params]
  """
  Create an OutboundPayment

  HTTP Method: POST
  Endpoint: /v1/treasury/outbound_payments

  """
  (stripe-request :post (str "/v1/treasury/outbound_payments") params))

(defn create-treasury [outbound_transfer params]
  """
  Cancel an OutboundTransfer

  HTTP Method: POST
  Endpoint: /v1/treasury/outbound_transfers/{outbound_transfer}/cancel

  Path Parameters:
    - outbound_transfer: Path parameter.

  """
  (stripe-request :post (str "/v1/treasury/outbound_transfers/" outbound_transfer "/cancel") params))

(defn retrieve-treasury [params]
  """
  List all ReceivedDebits

  HTTP Method: GET
  Endpoint: /v1/treasury/received_debits

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - financial_account: The FinancialAccount that funds were pulled from.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return ReceivedDebits that have the given status: `succeeded` or `failed`.

  """
  (stripe-request :get (str "/v1/treasury/received_debits") params))

(defn retrieve-treasury [debit_reversal params]
  """
  Retrieve a DebitReversal

  HTTP Method: GET
  Endpoint: /v1/treasury/debit_reversals/{debit_reversal}

  Path Parameters:
    - debit_reversal: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/treasury/debit_reversals/" debit_reversal "") params))

(defn retrieve-treasury [id params]
  """
  Retrieve a ReceivedCredit

  HTTP Method: GET
  Endpoint: /v1/treasury/received_credits/{id}

  Path Parameters:
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/treasury/received_credits/" id "") params))

(defn retrieve-treasury [params]
  """
  List all ReceivedCredits

  HTTP Method: GET
  Endpoint: /v1/treasury/received_credits

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - financial_account: The FinancialAccount that received the funds.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - linked_flows: Only return ReceivedCredits described by the flow.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return ReceivedCredits that have the given status: `succeeded` or `failed`.

  """
  (stripe-request :get (str "/v1/treasury/received_credits") params))

(defn retrieve-treasury [params]
  """
  List all InboundTransfers

  HTTP Method: GET
  Endpoint: /v1/treasury/inbound_transfers

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - financial_account: Returns objects associated with this FinancialAccount.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return InboundTransfers that have the given status: `processing`, `succeeded`, `failed` or `canceled`.

  """
  (stripe-request :get (str "/v1/treasury/inbound_transfers") params))

(defn create-treasury [params]
  """
  Create an InboundTransfer

  HTTP Method: POST
  Endpoint: /v1/treasury/inbound_transfers

  """
  (stripe-request :post (str "/v1/treasury/inbound_transfers") params))

(defn retrieve-treasury [params]
  """
  List all CreditReversals

  HTTP Method: GET
  Endpoint: /v1/treasury/credit_reversals

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - financial_account: Returns objects associated with this FinancialAccount.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - received_credit: Only return CreditReversals for the ReceivedCredit ID.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return CreditReversals for a given status.

  """
  (stripe-request :get (str "/v1/treasury/credit_reversals") params))

(defn create-treasury [params]
  """
  Create a CreditReversal

  HTTP Method: POST
  Endpoint: /v1/treasury/credit_reversals

  """
  (stripe-request :post (str "/v1/treasury/credit_reversals") params))

(defn retrieve-treasury [id params]
  """
  Retrieve a Transaction

  HTTP Method: GET
  Endpoint: /v1/treasury/transactions/{id}

  Path Parameters:
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/treasury/transactions/" id "") params))

(defn retrieve-treasury [financial_account params]
  """
  Retrieve a FinancialAccount

  HTTP Method: GET
  Endpoint: /v1/treasury/financial_accounts/{financial_account}

  Path Parameters:
    - financial_account: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/treasury/financial_accounts/" financial_account "") params))

(defn create-treasury [financial_account params]
  """
  Update a FinancialAccount

  HTTP Method: POST
  Endpoint: /v1/treasury/financial_accounts/{financial_account}

  Path Parameters:
    - financial_account: Path parameter.

  """
  (stripe-request :post (str "/v1/treasury/financial_accounts/" financial_account "") params))

(defn retrieve-treasury [params]
  """
  List all DebitReversals

  HTTP Method: GET
  Endpoint: /v1/treasury/debit_reversals

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - financial_account: Returns objects associated with this FinancialAccount.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - received_debit: Only return DebitReversals for the ReceivedDebit ID.
    - resolution: Only return DebitReversals for a given resolution.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return DebitReversals for a given status.

  """
  (stripe-request :get (str "/v1/treasury/debit_reversals") params))

(defn create-treasury [params]
  """
  Create a DebitReversal

  HTTP Method: POST
  Endpoint: /v1/treasury/debit_reversals

  """
  (stripe-request :post (str "/v1/treasury/debit_reversals") params))