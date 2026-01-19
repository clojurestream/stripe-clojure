(ns stream.clojure.stripe.api.payment-records
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-payment-records-report-payment
  "Report a payment

  HTTP Method: POST
  Endpoint: /v1/payment_records/report_payment

  Example Usage:
    (post-payment-records-report-payment {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/payment_records/report_payment"}))

(defn post-payment-records-id-report-payment-attempt-canceled
  "Report payment attempt canceled

  HTTP Method: POST
  Endpoint: /v1/payment_records/{payment-record-id}/report_payment_attempt_canceled

  Path Parameters:
    - payment-record-id (String): The ID of the Payment Record.

  Example Usage:
    (post-payment-records-id-report-payment-attempt-canceled {:payment-record-id example-payment-record-id})"
  [{:keys [payment-record-id]}]
  (stripe-request :post {:endpoint "/v1/payment_records/{payment-record-id}/report_payment_attempt_canceled" :path-params {:payment-record-id payment-record-id}}))

(defn post-payment-records-id-report-payment-attempt
  "Report a payment attempt

  HTTP Method: POST
  Endpoint: /v1/payment_records/{payment-record-id}/report_payment_attempt

  Path Parameters:
    - payment-record-id (String): The ID of the Payment Record.

  Example Usage:
    (post-payment-records-id-report-payment-attempt {:payment-record-id example-payment-record-id})"
  [{:keys [payment-record-id]}]
  (stripe-request :post {:endpoint "/v1/payment_records/{payment-record-id}/report_payment_attempt" :path-params {:payment-record-id payment-record-id}}))

(defn retrieve-payment-records-id
  "Retrieve a Payment Record

  HTTP Method: GET
  Endpoint: /v1/payment_records/{payment-record-id}

  Path Parameters:
    - payment-record-id (String): The ID of the Payment Record.

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-payment-records-id {:payment-record-id example-payment-record-id :query-params {:limit 10}})"
  [{:keys [payment-record-id query-params]}]
  (stripe-request :get {:endpoint "/v1/payment_records/{payment-record-id}" :path-params {:payment-record-id payment-record-id} :query-params query-params}))

(defn post-payment-records-id-report-payment-attempt-informational
  "Report payment attempt informational

  HTTP Method: POST
  Endpoint: /v1/payment_records/{payment-record-id}/report_payment_attempt_informational

  Path Parameters:
    - payment-record-id (String): The ID of the Payment Record.

  Example Usage:
    (post-payment-records-id-report-payment-attempt-informational {:payment-record-id example-payment-record-id})"
  [{:keys [payment-record-id]}]
  (stripe-request :post {:endpoint "/v1/payment_records/{payment-record-id}/report_payment_attempt_informational" :path-params {:payment-record-id payment-record-id}}))

(defn post-payment-records-id-report-refund
  "Report a refund

  HTTP Method: POST
  Endpoint: /v1/payment_records/{payment-record-id}/report_refund

  Path Parameters:
    - payment-record-id (String): The ID of the Payment Record.

  Example Usage:
    (post-payment-records-id-report-refund {:payment-record-id example-payment-record-id})"
  [{:keys [payment-record-id]}]
  (stripe-request :post {:endpoint "/v1/payment_records/{payment-record-id}/report_refund" :path-params {:payment-record-id payment-record-id}}))

(defn post-payment-records-id-report-payment-attempt-failed
  "Report payment attempt failed

  HTTP Method: POST
  Endpoint: /v1/payment_records/{payment-record-id}/report_payment_attempt_failed

  Path Parameters:
    - payment-record-id (String): The ID of the Payment Record.

  Example Usage:
    (post-payment-records-id-report-payment-attempt-failed {:payment-record-id example-payment-record-id})"
  [{:keys [payment-record-id]}]
  (stripe-request :post {:endpoint "/v1/payment_records/{payment-record-id}/report_payment_attempt_failed" :path-params {:payment-record-id payment-record-id}}))

(defn post-payment-records-id-report-payment-attempt-guaranteed
  "Report payment attempt guaranteed

  HTTP Method: POST
  Endpoint: /v1/payment_records/{payment-record-id}/report_payment_attempt_guaranteed

  Path Parameters:
    - payment-record-id (String): The ID of the Payment Record.

  Example Usage:
    (post-payment-records-id-report-payment-attempt-guaranteed {:payment-record-id example-payment-record-id})"
  [{:keys [payment-record-id]}]
  (stripe-request :post {:endpoint "/v1/payment_records/{payment-record-id}/report_payment_attempt_guaranteed" :path-params {:payment-record-id payment-record-id}}))