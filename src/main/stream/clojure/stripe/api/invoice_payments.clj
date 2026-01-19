(ns stream.clojure.stripe.api.invoice-payments
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-invoice-payments-invoice-payment
  "Retrieve an InvoicePayment

  HTTP Method: GET
  Endpoint: /v1/invoice_payments/{invoice-payment-id}

  Path Parameters:
    - invoice-payment-id (String): The invoice-payment-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-invoice-payments-invoice-payment {:invoice-payment-id example-invoice-payment-id :query-params {:limit 10}})"
  [{:keys [invoice-payment-id query-params]}]
  (stripe-request :get {:endpoint "/v1/invoice_payments/{invoice-payment-id}" :path-params {:invoice-payment-id invoice-payment-id} :query-params query-params}))

(defn list-all-invoice-payments
  "List all payments for an invoice

  HTTP Method: GET
  Endpoint: /v1/invoice_payments

  Query Parameters:
    - created (Unknown): Only return invoice payments that were created during the given date interval.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - invoice (String): The identifier of the invoice whose payments to return.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - payment (Object): The payment details of the invoice payments to return.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): The status of the invoice payments to return.

  Example Usage:
    (list-all-invoice-payments {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/invoice_payments" :query-params query-params}))