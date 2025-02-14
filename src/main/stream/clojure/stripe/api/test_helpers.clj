(ns stream.clojure.stripe.api.test-helpers
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn create-test-helpers [id params]
  """
  Test mode: Fail an OutboundPayment

  HTTP Method: POST
  Endpoint: /v1/test_helpers/treasury/outbound_payments/{id}/fail

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/treasury/outbound_payments/" id "/fail") params))

(defn create-test-helpers [outbound_transfer params]
  """
  Test mode: Post an OutboundTransfer

  HTTP Method: POST
  Endpoint: /v1/test_helpers/treasury/outbound_transfers/{outbound_transfer}/post

  Path Parameters:
    - outbound_transfer: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/treasury/outbound_transfers/" outbound_transfer "/post") params))

(defn create-test-helpers [authorization params]
  """
  Finalize a test-mode authorization's amount

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/authorizations/{authorization}/finalize_amount

  Path Parameters:
    - authorization: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/issuing/authorizations/" authorization "/finalize_amount") params))

(defn create-test-helpers [transaction params]
  """
  Refund a test-mode transaction

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/transactions/{transaction}/refund

  Path Parameters:
    - transaction: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/issuing/transactions/" transaction "/refund") params))

(defn create-test-helpers [params]
  """
  Create a test-mode authorization

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/authorizations

  """
  (stripe-request :post (str "/v1/test_helpers/issuing/authorizations") params))

(defn create-test-helpers [params]
  """
  Test mode: Create a ReceivedDebit

  HTTP Method: POST
  Endpoint: /v1/test_helpers/treasury/received_debits

  """
  (stripe-request :post (str "/v1/test_helpers/treasury/received_debits") params))

(defn create-test-helpers [id params]
  """
  Test mode: Succeed an InboundTransfer

  HTTP Method: POST
  Endpoint: /v1/test_helpers/treasury/inbound_transfers/{id}/succeed

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/treasury/inbound_transfers/" id "/succeed") params))

(defn create-test-helpers [personalization_design params]
  """
  Reject a testmode personalization design

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/personalization_designs/{personalization_design}/reject

  Path Parameters:
    - personalization_design: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/issuing/personalization_designs/" personalization_design "/reject") params))

(defn create-test-helpers [authorization params]
  """
  Reverse a test-mode authorization

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/authorizations/{authorization}/reverse

  Path Parameters:
    - authorization: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/issuing/authorizations/" authorization "/reverse") params))

(defn create-test-helpers [id params]
  """
  Test mode: Return an OutboundPayment

  HTTP Method: POST
  Endpoint: /v1/test_helpers/treasury/outbound_payments/{id}/return

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/treasury/outbound_payments/" id "/return") params))

(defn create-test-helpers [id params]
  """
  Test mode: Fail an InboundTransfer

  HTTP Method: POST
  Endpoint: /v1/test_helpers/treasury/inbound_transfers/{id}/fail

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/treasury/inbound_transfers/" id "/fail") params))

(defn create-test-helpers [params]
  """
  Test mode: Create a ReceivedCredit

  HTTP Method: POST
  Endpoint: /v1/test_helpers/treasury/received_credits

  """
  (stripe-request :post (str "/v1/test_helpers/treasury/received_credits") params))

(defn create-test-helpers [card params]
  """
  Return a testmode card

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/cards/{card}/shipping/return

  Path Parameters:
    - card: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/issuing/cards/" card "/shipping/return") params))

(defn create-test-helpers [personalization_design params]
  """
  Deactivate a testmode personalization design

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/personalization_designs/{personalization_design}/deactivate

  Path Parameters:
    - personalization_design: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/issuing/personalization_designs/" personalization_design "/deactivate") params))

(defn create-test-helpers [outbound_transfer params]
  """
  Test mode: Fail an OutboundTransfer

  HTTP Method: POST
  Endpoint: /v1/test_helpers/treasury/outbound_transfers/{outbound_transfer}/fail

  Path Parameters:
    - outbound_transfer: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/treasury/outbound_transfers/" outbound_transfer "/fail") params))

(defn create-test-helpers [params]
  """
  Create a test Confirmation Token

  HTTP Method: POST
  Endpoint: /v1/test_helpers/confirmation_tokens

  """
  (stripe-request :post (str "/v1/test_helpers/confirmation_tokens") params))

(defn delete-test-helpers [test_clock params]
  """
  Delete a test clock

  HTTP Method: DELETE
  Endpoint: /v1/test_helpers/test_clocks/{test_clock}

  Path Parameters:
    - test_clock: Path parameter.

  """
  (stripe-request :delete (str "/v1/test_helpers/test_clocks/" test_clock "") params))

(defn retrieve-test-helpers [test_clock params]
  """
  Retrieve a test clock

  HTTP Method: GET
  Endpoint: /v1/test_helpers/test_clocks/{test_clock}

  Path Parameters:
    - test_clock: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/test_helpers/test_clocks/" test_clock "") params))

(defn create-test-helpers [refund params]
  """
  Expire a pending refund.

  HTTP Method: POST
  Endpoint: /v1/test_helpers/refunds/{refund}/expire

  Path Parameters:
    - refund: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/refunds/" refund "/expire") params))

(defn create-test-helpers [card params]
  """
  Fail a testmode card

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/cards/{card}/shipping/fail

  Path Parameters:
    - card: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/issuing/cards/" card "/shipping/fail") params))

(defn create-test-helpers [authorization params]
  """
  Capture a test-mode authorization

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/authorizations/{authorization}/capture

  Path Parameters:
    - authorization: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/issuing/authorizations/" authorization "/capture") params))

(defn create-test-helpers [id params]
  """
  Test mode: Post an OutboundPayment

  HTTP Method: POST
  Endpoint: /v1/test_helpers/treasury/outbound_payments/{id}/post

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/treasury/outbound_payments/" id "/post") params))

(defn create-test-helpers [outbound_transfer params]
  """
  Test mode: Return an OutboundTransfer

  HTTP Method: POST
  Endpoint: /v1/test_helpers/treasury/outbound_transfers/{outbound_transfer}/return

  Path Parameters:
    - outbound_transfer: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/treasury/outbound_transfers/" outbound_transfer "/return") params))

(defn create-test-helpers [authorization params]
  """
  Respond to fraud challenge

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/authorizations/{authorization}/fraud_challenges/respond

  Path Parameters:
    - authorization: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/issuing/authorizations/" authorization "/fraud_challenges/respond") params))

(defn create-test-helpers [authorization params]
  """
  Expire a test-mode authorization

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/authorizations/{authorization}/expire

  Path Parameters:
    - authorization: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/issuing/authorizations/" authorization "/expire") params))

(defn create-test-helpers [customer params]
  """
  Fund a test mode cash balance

  HTTP Method: POST
  Endpoint: /v1/test_helpers/customers/{customer}/fund_cash_balance

  Path Parameters:
    - customer: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/customers/" customer "/fund_cash_balance") params))

(defn create-test-helpers [test_clock params]
  """
  Advance a test clock

  HTTP Method: POST
  Endpoint: /v1/test_helpers/test_clocks/{test_clock}/advance

  Path Parameters:
    - test_clock: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/test_clocks/" test_clock "/advance") params))

(defn create-test-helpers [id params]
  """
  Test mode: Return an InboundTransfer

  HTTP Method: POST
  Endpoint: /v1/test_helpers/treasury/inbound_transfers/{id}/return

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/treasury/inbound_transfers/" id "/return") params))

(defn create-test-helpers [outbound_transfer params]
  """
  Test mode: Update an OutboundTransfer

  HTTP Method: POST
  Endpoint: /v1/test_helpers/treasury/outbound_transfers/{outbound_transfer}

  Path Parameters:
    - outbound_transfer: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/treasury/outbound_transfers/" outbound_transfer "") params))

(defn create-test-helpers [personalization_design params]
  """
  Activate a testmode personalization design

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/personalization_designs/{personalization_design}/activate

  Path Parameters:
    - personalization_design: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/issuing/personalization_designs/" personalization_design "/activate") params))

(defn create-test-helpers [params]
  """
  Create a test-mode settleemnt

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/settlements

  """
  (stripe-request :post (str "/v1/test_helpers/issuing/settlements") params))

(defn create-test-helpers [params]
  """
  Create a test-mode unlinked refund

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/transactions/create_unlinked_refund

  """
  (stripe-request :post (str "/v1/test_helpers/issuing/transactions/create_unlinked_refund") params))

(defn create-test-helpers [authorization params]
  """
  Increment a test-mode authorization

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/authorizations/{authorization}/increment

  Path Parameters:
    - authorization: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/issuing/authorizations/" authorization "/increment") params))

(defn create-test-helpers [card params]
  """
  Ship a testmode card

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/cards/{card}/shipping/ship

  Path Parameters:
    - card: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/issuing/cards/" card "/shipping/ship") params))

(defn create-test-helpers [card params]
  """
  Deliver a testmode card

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/cards/{card}/shipping/deliver

  Path Parameters:
    - card: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/issuing/cards/" card "/shipping/deliver") params))

(defn create-test-helpers [reader params]
  """
  Simulate presenting a payment method

  HTTP Method: POST
  Endpoint: /v1/test_helpers/terminal/readers/{reader}/present_payment_method

  Path Parameters:
    - reader: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/terminal/readers/" reader "/present_payment_method") params))

(defn retrieve-test-helpers [params]
  """
  List all test clocks

  HTTP Method: GET
  Endpoint: /v1/test_helpers/test_clocks

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/test_helpers/test_clocks") params))

(defn create-test-helpers [params]
  """
  Create a test clock

  HTTP Method: POST
  Endpoint: /v1/test_helpers/test_clocks

  """
  (stripe-request :post (str "/v1/test_helpers/test_clocks") params))

(defn create-test-helpers [params]
  """
  Create a test-mode force capture

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/transactions/create_force_capture

  """
  (stripe-request :post (str "/v1/test_helpers/issuing/transactions/create_force_capture") params))

(defn create-test-helpers [id params]
  """
  Test mode: Update an OutboundPayment

  HTTP Method: POST
  Endpoint: /v1/test_helpers/treasury/outbound_payments/{id}

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/treasury/outbound_payments/" id "") params))

(defn create-test-helpers [card params]
  """
  Submit a testmode card

  HTTP Method: POST
  Endpoint: /v1/test_helpers/issuing/cards/{card}/shipping/submit

  Path Parameters:
    - card: Path parameter.

  """
  (stripe-request :post (str "/v1/test_helpers/issuing/cards/" card "/shipping/submit") params))