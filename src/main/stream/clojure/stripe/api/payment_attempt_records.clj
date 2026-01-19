(ns stream.clojure.stripe.api.payment-attempt-records
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-payment-attempt-records
  "List Payment Attempt Records

  HTTP Method: GET
  Endpoint: /v1/payment_attempt_records

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - payment-record (String): The ID of the Payment Record. (required)
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-payment-attempt-records {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/payment_attempt_records" :query-params query-params}))

(defn retrieve-payment-attempt-records-id
  "Retrieve a Payment Attempt Record

  HTTP Method: GET
  Endpoint: /v1/payment_attempt_records/{payment-attempt-record-id}

  Path Parameters:
    - payment-attempt-record-id (String): The ID of the Payment Attempt Record.

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-payment-attempt-records-id {:payment-attempt-record-id example-payment-attempt-record-id :query-params {:limit 10}})"
  [{:keys [payment-attempt-record-id query-params]}]
  (stripe-request :get {:endpoint "/v1/payment_attempt_records/{payment-attempt-record-id}" :path-params {:payment-attempt-record-id payment-attempt-record-id} :query-params query-params}))