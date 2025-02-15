(ns stream.clojure.stripe.api.test-helpers
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-test-helpers-treasury-outbound-payments-id-fail [{:keys [outbound-payment-id]}]
  "Test mode: Fail an OutboundPayment

  HTTP Method: POST
  Endpoint: /v1/test_helpers/treasury/outbound_payments/{outbound-payment-id}/fail

  Path Parameters:
    - outbound-payment-id: The outbound-payment-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-treasury-outbound-payments-id-fail {:outbound-payment-id example-outbound-payment-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/treasury/outbound_payments/{outbound-payment-id}/fail" :path-params {:outbound-payment-id outbound-payment-id}}))

(defn post-test-helpers-treasury-outbound-transfers-outbound-transfer-post [{:keys [outbound-transfer-id]}]
  "Test mode: Post an OutboundTransfer

  HTTP Method: POST
  Endpoint: /v1/test_helpers/treasury/outbound_transfers/{outbound-transfer-id}/post

  Path Parameters:
    - outbound-transfer-id: The outbound-transfer-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-treasury-outbound-transfers-outbound-transfer-post {:outbound-transfer-id example-outbound-transfer-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/treasury/outbound_transfers/{outbound-transfer-id}/post" :path-params {:outbound-transfer-id outbound-transfer-id}}))

(defn post-test-helpers-issuing-authorizations-authorization-finalize-amount [{:keys [authorization-id]}]
  "Finalize a test-mode authorization's amount

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/authorizations/{authorization-id}/finalize_amount

  Path Parameters:
    - authorization-id: The authorization-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-issuing-authorizations-authorization-finalize-amount {:authorization-id example-authorization-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/issuing/authorizations/{authorization-id}/finalize_amount" :path-params {:authorization-id authorization-id}}))

(defn post-test-helpers-issuing-transactions-transaction-refund [{:keys [transaction-id]}]
  "Refund a test-mode transaction

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/transactions/{transaction-id}/refund

  Path Parameters:
    - transaction-id: The transaction-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-issuing-transactions-transaction-refund {:transaction-id example-transaction-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/issuing/transactions/{transaction-id}/refund" :path-params {:transaction-id transaction-id}}))

(defn create-test-helpers-issuing-authorizations [{:keys []}]
  "Create a test-mode authorization

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/authorizations

  Example Usage:
    (create-test-helpers-issuing-authorizations {})"
  (stripe-request :post {:endpoint "/v1/test_helpers/issuing/authorizations"}))

(defn post-test-helpers-treasury-received-debits [{:keys []}]
  "Test mode: Create a ReceivedDebit

  HTTP Method: POST
  Endpoint: /v1/test_helpers/treasury/received_debits

  Example Usage:
    (post-test-helpers-treasury-received-debits {})"
  (stripe-request :post {:endpoint "/v1/test_helpers/treasury/received_debits"}))

(defn post-test-helpers-treasury-inbound-transfers-id-succeed [{:keys [inbound-transfer-id]}]
  "Test mode: Succeed an InboundTransfer

  HTTP Method: POST
  Endpoint: /v1/test_helpers/treasury/inbound_transfers/{inbound-transfer-id}/succeed

  Path Parameters:
    - inbound-transfer-id: The inbound-transfer-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-treasury-inbound-transfers-id-succeed {:inbound-transfer-id example-inbound-transfer-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/treasury/inbound_transfers/{inbound-transfer-id}/succeed" :path-params {:inbound-transfer-id inbound-transfer-id}}))

(defn post-test-helpers-issuing-settlements-settlement-complete [{:keys [settlement-id]}]
  "Complete a test-mode settlement

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/settlements/{settlement-id}/complete

  Path Parameters:
    - settlement-id: The settlement token to mark as complete.

  Example Usage:
    (post-test-helpers-issuing-settlements-settlement-complete {:settlement-id example-settlement-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/issuing/settlements/{settlement-id}/complete" :path-params {:settlement-id settlement-id}}))

(defn post-test-helpers-issuing-personalization-designs-personalization-design-reject [{:keys [personalization-design-id]}]
  "Reject a testmode personalization design

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/personalization_designs/{personalization-design-id}/reject

  Path Parameters:
    - personalization-design-id: The personalization-design-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-issuing-personalization-designs-personalization-design-reject {:personalization-design-id example-personalization-design-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/issuing/personalization_designs/{personalization-design-id}/reject" :path-params {:personalization-design-id personalization-design-id}}))

(defn post-test-helpers-issuing-authorizations-authorization-reverse [{:keys [authorization-id]}]
  "Reverse a test-mode authorization

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/authorizations/{authorization-id}/reverse

  Path Parameters:
    - authorization-id: The authorization-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-issuing-authorizations-authorization-reverse {:authorization-id example-authorization-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/issuing/authorizations/{authorization-id}/reverse" :path-params {:authorization-id authorization-id}}))

(defn post-test-helpers-treasury-outbound-payments-id-return [{:keys [outbound-payment-id]}]
  "Test mode: Return an OutboundPayment

  HTTP Method: POST
  Endpoint: /v1/test_helpers/treasury/outbound_payments/{outbound-payment-id}/return

  Path Parameters:
    - outbound-payment-id: The outbound-payment-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-treasury-outbound-payments-id-return {:outbound-payment-id example-outbound-payment-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/treasury/outbound_payments/{outbound-payment-id}/return" :path-params {:outbound-payment-id outbound-payment-id}}))

(defn post-test-helpers-treasury-inbound-transfers-id-fail [{:keys [inbound-transfer-id]}]
  "Test mode: Fail an InboundTransfer

  HTTP Method: POST
  Endpoint: /v1/test_helpers/treasury/inbound_transfers/{inbound-transfer-id}/fail

  Path Parameters:
    - inbound-transfer-id: The inbound-transfer-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-treasury-inbound-transfers-id-fail {:inbound-transfer-id example-inbound-transfer-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/treasury/inbound_transfers/{inbound-transfer-id}/fail" :path-params {:inbound-transfer-id inbound-transfer-id}}))

(defn post-test-helpers-treasury-received-credits [{:keys []}]
  "Test mode: Create a ReceivedCredit

  HTTP Method: POST
  Endpoint: /v1/test_helpers/treasury/received_credits

  Example Usage:
    (post-test-helpers-treasury-received-credits {})"
  (stripe-request :post {:endpoint "/v1/test_helpers/treasury/received_credits"}))

(defn post-test-helpers-issuing-cards-card-shipping-return [{:keys [card-id]}]
  "Return a testmode card

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/cards/{card-id}/shipping/return

  Path Parameters:
    - card-id: The card-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-issuing-cards-card-shipping-return {:card-id example-card-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/issuing/cards/{card-id}/shipping/return" :path-params {:card-id card-id}}))

(defn post-test-helpers-issuing-personalization-designs-personalization-design-deactivate [{:keys [personalization-design-id]}]
  "Deactivate a testmode personalization design

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/personalization_designs/{personalization-design-id}/deactivate

  Path Parameters:
    - personalization-design-id: The personalization-design-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-issuing-personalization-designs-personalization-design-deactivate {:personalization-design-id example-personalization-design-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/issuing/personalization_designs/{personalization-design-id}/deactivate" :path-params {:personalization-design-id personalization-design-id}}))

(defn post-test-helpers-treasury-outbound-transfers-outbound-transfer-fail [{:keys [outbound-transfer-id]}]
  "Test mode: Fail an OutboundTransfer

  HTTP Method: POST
  Endpoint: /v1/test_helpers/treasury/outbound_transfers/{outbound-transfer-id}/fail

  Path Parameters:
    - outbound-transfer-id: The outbound-transfer-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-treasury-outbound-transfers-outbound-transfer-fail {:outbound-transfer-id example-outbound-transfer-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/treasury/outbound_transfers/{outbound-transfer-id}/fail" :path-params {:outbound-transfer-id outbound-transfer-id}}))

(defn create-test-helpers-confirmation-tokens [{:keys []}]
  "Create a test Confirmation Token

  HTTP Method: POST
  Endpoint: /v1/test_helpers/confirmation_tokens

  Example Usage:
    (create-test-helpers-confirmation-tokens {})"
  (stripe-request :post {:endpoint "/v1/test_helpers/confirmation_tokens"}))

(defn delete-test-helpers-test-clocks-test-clock [{:keys [test-clock-id]}]
  "Delete a test clock

  HTTP Method: DELETE
  Endpoint: /v1/test_helpers/test_clocks/{test-clock-id}

  Path Parameters:
    - test-clock-id: The test-clock-id parameter. (required) [type: string]

  Example Usage:
    (delete-test-helpers-test-clocks-test-clock {:test-clock-id example-test-clock-id})"
  (stripe-request :delete {:endpoint "/v1/test_helpers/test_clocks/{test-clock-id}" :path-params {:test-clock-id test-clock-id}}))

(defn retrieve-test-helpers-test-clocks-test-clock [{:keys [test-clock-id query-params]}]
  "Retrieve a test clock

  HTTP Method: GET
  Endpoint: /v1/test_helpers/test_clocks/{test-clock-id}

  Path Parameters:
    - test-clock-id: The test-clock-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-test-helpers-test-clocks-test-clock {:test-clock-id example-test-clock-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/test_helpers/test_clocks/{test-clock-id}" :path-params {:test-clock-id test-clock-id} :query-params query-params}))

(defn post-test-helpers-refunds-refund-expire [{:keys [refund-id]}]
  "Expire a pending refund.

  HTTP Method: POST
  Endpoint: /v1/test_helpers/refunds/{refund-id}/expire

  Path Parameters:
    - refund-id: The refund-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-refunds-refund-expire {:refund-id example-refund-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/refunds/{refund-id}/expire" :path-params {:refund-id refund-id}}))

(defn post-test-helpers-issuing-cards-card-shipping-fail [{:keys [card-id]}]
  "Fail a testmode card

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/cards/{card-id}/shipping/fail

  Path Parameters:
    - card-id: The card-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-issuing-cards-card-shipping-fail {:card-id example-card-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/issuing/cards/{card-id}/shipping/fail" :path-params {:card-id card-id}}))

(defn post-test-helpers-issuing-authorizations-authorization-capture [{:keys [authorization-id]}]
  "Capture a test-mode authorization

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/authorizations/{authorization-id}/capture

  Path Parameters:
    - authorization-id: The authorization-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-issuing-authorizations-authorization-capture {:authorization-id example-authorization-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/issuing/authorizations/{authorization-id}/capture" :path-params {:authorization-id authorization-id}}))

(defn post-test-helpers-treasury-outbound-payments-id-post [{:keys [outbound-payment-id]}]
  "Test mode: Post an OutboundPayment

  HTTP Method: POST
  Endpoint: /v1/test_helpers/treasury/outbound_payments/{outbound-payment-id}/post

  Path Parameters:
    - outbound-payment-id: The outbound-payment-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-treasury-outbound-payments-id-post {:outbound-payment-id example-outbound-payment-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/treasury/outbound_payments/{outbound-payment-id}/post" :path-params {:outbound-payment-id outbound-payment-id}}))

(defn post-test-helpers-treasury-outbound-transfers-outbound-transfer-return [{:keys [outbound-transfer-id]}]
  "Test mode: Return an OutboundTransfer

  HTTP Method: POST
  Endpoint: /v1/test_helpers/treasury/outbound_transfers/{outbound-transfer-id}/return

  Path Parameters:
    - outbound-transfer-id: The outbound-transfer-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-treasury-outbound-transfers-outbound-transfer-return {:outbound-transfer-id example-outbound-transfer-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/treasury/outbound_transfers/{outbound-transfer-id}/return" :path-params {:outbound-transfer-id outbound-transfer-id}}))

(defn post-test-helpers-issuing-authorizations-authorization-fraud-challenges-respond [{:keys [authorization-id]}]
  "Respond to fraud challenge

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/authorizations/{authorization-id}/fraud_challenges/respond

  Path Parameters:
    - authorization-id: The authorization-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-issuing-authorizations-authorization-fraud-challenges-respond {:authorization-id example-authorization-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/issuing/authorizations/{authorization-id}/fraud_challenges/respond" :path-params {:authorization-id authorization-id}}))

(defn post-test-helpers-issuing-authorizations-authorization-expire [{:keys [authorization-id]}]
  "Expire a test-mode authorization

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/authorizations/{authorization-id}/expire

  Path Parameters:
    - authorization-id: The authorization-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-issuing-authorizations-authorization-expire {:authorization-id example-authorization-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/issuing/authorizations/{authorization-id}/expire" :path-params {:authorization-id authorization-id}}))

(defn post-test-helpers-customers-customer-fund-cash-balance [{:keys [customer-id]}]
  "Fund a test mode cash balance

  HTTP Method: POST
  Endpoint: /v1/test_helpers/customers/{customer-id}/fund_cash_balance

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-customers-customer-fund-cash-balance {:customer-id example-customer-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/customers/{customer-id}/fund_cash_balance" :path-params {:customer-id customer-id}}))

(defn post-test-helpers-test-clocks-test-clock-advance [{:keys [test-clock-id]}]
  "Advance a test clock

  HTTP Method: POST
  Endpoint: /v1/test_helpers/test_clocks/{test-clock-id}/advance

  Path Parameters:
    - test-clock-id: The test-clock-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-test-clocks-test-clock-advance {:test-clock-id example-test-clock-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/test_clocks/{test-clock-id}/advance" :path-params {:test-clock-id test-clock-id}}))

(defn post-test-helpers-treasury-inbound-transfers-id-return [{:keys [inbound-transfer-id]}]
  "Test mode: Return an InboundTransfer

  HTTP Method: POST
  Endpoint: /v1/test_helpers/treasury/inbound_transfers/{inbound-transfer-id}/return

  Path Parameters:
    - inbound-transfer-id: The inbound-transfer-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-treasury-inbound-transfers-id-return {:inbound-transfer-id example-inbound-transfer-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/treasury/inbound_transfers/{inbound-transfer-id}/return" :path-params {:inbound-transfer-id inbound-transfer-id}}))

(defn post-test-helpers-treasury-outbound-transfers-outbound-transfer [{:keys [outbound-transfer-id]}]
  "Test mode: Update an OutboundTransfer

  HTTP Method: POST
  Endpoint: /v1/test_helpers/treasury/outbound_transfers/{outbound-transfer-id}

  Path Parameters:
    - outbound-transfer-id: The outbound-transfer-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-treasury-outbound-transfers-outbound-transfer {:outbound-transfer-id example-outbound-transfer-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/treasury/outbound_transfers/{outbound-transfer-id}" :path-params {:outbound-transfer-id outbound-transfer-id}}))

(defn post-test-helpers-issuing-personalization-designs-personalization-design-activate [{:keys [personalization-design-id]}]
  "Activate a testmode personalization design

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/personalization_designs/{personalization-design-id}/activate

  Path Parameters:
    - personalization-design-id: The personalization-design-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-issuing-personalization-designs-personalization-design-activate {:personalization-design-id example-personalization-design-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/issuing/personalization_designs/{personalization-design-id}/activate" :path-params {:personalization-design-id personalization-design-id}}))

(defn create-test-helpers-issuing-settlements [{:keys []}]
  "Create a test-mode settleemnt

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/settlements

  Example Usage:
    (create-test-helpers-issuing-settlements {})"
  (stripe-request :post {:endpoint "/v1/test_helpers/issuing/settlements"}))

(defn create-test-helpers-issuing-transactions-create-unlinked-refund [{:keys []}]
  "Create a test-mode unlinked refund

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/transactions/create_unlinked_refund

  Example Usage:
    (create-test-helpers-issuing-transactions-create-unlinked-refund {})"
  (stripe-request :post {:endpoint "/v1/test_helpers/issuing/transactions/create_unlinked_refund"}))

(defn post-test-helpers-issuing-authorizations-authorization-increment [{:keys [authorization-id]}]
  "Increment a test-mode authorization

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/authorizations/{authorization-id}/increment

  Path Parameters:
    - authorization-id: The authorization-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-issuing-authorizations-authorization-increment {:authorization-id example-authorization-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/issuing/authorizations/{authorization-id}/increment" :path-params {:authorization-id authorization-id}}))

(defn post-test-helpers-issuing-cards-card-shipping-ship [{:keys [card-id]}]
  "Ship a testmode card

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/cards/{card-id}/shipping/ship

  Path Parameters:
    - card-id: The card-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-issuing-cards-card-shipping-ship {:card-id example-card-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/issuing/cards/{card-id}/shipping/ship" :path-params {:card-id card-id}}))

(defn post-test-helpers-issuing-cards-card-shipping-deliver [{:keys [card-id]}]
  "Deliver a testmode card

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/cards/{card-id}/shipping/deliver

  Path Parameters:
    - card-id: The card-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-issuing-cards-card-shipping-deliver {:card-id example-card-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/issuing/cards/{card-id}/shipping/deliver" :path-params {:card-id card-id}}))

(defn post-test-helpers-terminal-readers-reader-present-payment-method [{:keys [reader-id]}]
  "Simulate presenting a payment method

  HTTP Method: POST
  Endpoint: /v1/test_helpers/terminal/readers/{reader-id}/present_payment_method

  Path Parameters:
    - reader-id: The reader-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-terminal-readers-reader-present-payment-method {:reader-id example-reader-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/terminal/readers/{reader-id}/present_payment_method" :path-params {:reader-id reader-id}}))

(defn list-all-test-helpers-test-clocks [{:keys [query-params]}]
  "List all test clocks

  HTTP Method: GET
  Endpoint: /v1/test_helpers/test_clocks

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-test-helpers-test-clocks {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/test_helpers/test_clocks" :query-params query-params}))

(defn create-test-helpers-test-clocks [{:keys []}]
  "Create a test clock

  HTTP Method: POST
  Endpoint: /v1/test_helpers/test_clocks

  Example Usage:
    (create-test-helpers-test-clocks {})"
  (stripe-request :post {:endpoint "/v1/test_helpers/test_clocks"}))

(defn create-test-helpers-issuing-transactions-create-force-capture [{:keys []}]
  "Create a test-mode force capture

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/transactions/create_force_capture

  Example Usage:
    (create-test-helpers-issuing-transactions-create-force-capture {})"
  (stripe-request :post {:endpoint "/v1/test_helpers/issuing/transactions/create_force_capture"}))

(defn post-test-helpers-treasury-outbound-payments-id [{:keys [outbound-payment-id]}]
  "Test mode: Update an OutboundPayment

  HTTP Method: POST
  Endpoint: /v1/test_helpers/treasury/outbound_payments/{outbound-payment-id}

  Path Parameters:
    - outbound-payment-id: The outbound-payment-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-treasury-outbound-payments-id {:outbound-payment-id example-outbound-payment-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/treasury/outbound_payments/{outbound-payment-id}" :path-params {:outbound-payment-id outbound-payment-id}}))

(defn post-test-helpers-issuing-cards-card-shipping-submit [{:keys [card-id]}]
  "Submit a testmode card

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/cards/{card-id}/shipping/submit

  Path Parameters:
    - card-id: The card-id parameter. (required) [type: string]

  Example Usage:
    (post-test-helpers-issuing-cards-card-shipping-submit {:card-id example-card-id})"
  (stripe-request :post {:endpoint "/v1/test_helpers/issuing/cards/{card-id}/shipping/submit" :path-params {:card-id card-id}}))