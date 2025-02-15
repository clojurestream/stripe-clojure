(ns stream.clojure.stripe.api.payment-intents
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-payment-intents-intent [{:keys [payment-intent-id query-params]}]
  "Retrieve a PaymentIntent

  HTTP Method: GET
  Endpoint: /v1/payment_intents/{payment-intent-id}

  Path Parameters:
    - payment-intent-id: The payment-intent-id parameter. (required) [type: string]

  Query Parameters:
    - client-secret: The client secret of the PaymentIntent. We require it if you use a publishable key to retrieve the source. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-payment-intents-intent {:payment-intent-id example-payment-intent-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/payment_intents/{payment-intent-id}" :path-params {:payment-intent-id payment-intent-id} :query-params query-params}))

(defn update-payment-intents-intent [{:keys [payment-intent-id]}]
  "Update a PaymentIntent

  HTTP Method: POST
  Endpoint: /v1/payment_intents/{payment-intent-id}

  Path Parameters:
    - payment-intent-id: The payment-intent-id parameter. (required) [type: string]

  Example Usage:
    (update-payment-intents-intent {:payment-intent-id example-payment-intent-id})"
  (stripe-request :post {:endpoint "/v1/payment_intents/{payment-intent-id}" :path-params {:payment-intent-id payment-intent-id}}))

(defn post-payment-intents-intent-increment-authorization [{:keys [payment-intent-id]}]
  "Increment an authorization

  HTTP Method: POST
  Endpoint: /v1/payment_intents/{payment-intent-id}/increment_authorization

  Path Parameters:
    - payment-intent-id: The payment-intent-id parameter. (required) [type: string]

  Example Usage:
    (post-payment-intents-intent-increment-authorization {:payment-intent-id example-payment-intent-id})"
  (stripe-request :post {:endpoint "/v1/payment_intents/{payment-intent-id}/increment_authorization" :path-params {:payment-intent-id payment-intent-id}}))

(defn post-payment-intents-intent-verify-microdeposits [{:keys [payment-intent-id]}]
  "Verify microdeposits on a PaymentIntent

  HTTP Method: POST
  Endpoint: /v1/payment_intents/{payment-intent-id}/verify_microdeposits

  Path Parameters:
    - payment-intent-id: The payment-intent-id parameter. (required) [type: string]

  Example Usage:
    (post-payment-intents-intent-verify-microdeposits {:payment-intent-id example-payment-intent-id})"
  (stripe-request :post {:endpoint "/v1/payment_intents/{payment-intent-id}/verify_microdeposits" :path-params {:payment-intent-id payment-intent-id}}))

(defn post-payment-intents-intent-capture [{:keys [payment-intent-id]}]
  "Capture a PaymentIntent

  HTTP Method: POST
  Endpoint: /v1/payment_intents/{payment-intent-id}/capture

  Path Parameters:
    - payment-intent-id: The payment-intent-id parameter. (required) [type: string]

  Example Usage:
    (post-payment-intents-intent-capture {:payment-intent-id example-payment-intent-id})"
  (stripe-request :post {:endpoint "/v1/payment_intents/{payment-intent-id}/capture" :path-params {:payment-intent-id payment-intent-id}}))

(defn post-payment-intents-intent-cancel [{:keys [payment-intent-id]}]
  "Cancel a PaymentIntent

  HTTP Method: POST
  Endpoint: /v1/payment_intents/{payment-intent-id}/cancel

  Path Parameters:
    - payment-intent-id: The payment-intent-id parameter. (required) [type: string]

  Example Usage:
    (post-payment-intents-intent-cancel {:payment-intent-id example-payment-intent-id})"
  (stripe-request :post {:endpoint "/v1/payment_intents/{payment-intent-id}/cancel" :path-params {:payment-intent-id payment-intent-id}}))

(defn list-all-payment-intents-search [{:keys [query-params]}]
  "Search PaymentIntents

  HTTP Method: GET
  Endpoint: /v1/payment_intents/search

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - page: A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results. [type: string]
    - query: The search query string. See [search query language](https://stripe.com/docs/search#search-query-language) and the list of supported [query fields for payment intents](https://stripe.com/docs/search#query-fields-for-payment-intents). (required) [type: string]

  Example Usage:
    (list-all-payment-intents-search {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/payment_intents/search" :query-params query-params}))

(defn post-payment-intents-intent-confirm [{:keys [payment-intent-id]}]
  "Confirm a PaymentIntent

  HTTP Method: POST
  Endpoint: /v1/payment_intents/{payment-intent-id}/confirm

  Path Parameters:
    - payment-intent-id: The payment-intent-id parameter. (required) [type: string]

  Example Usage:
    (post-payment-intents-intent-confirm {:payment-intent-id example-payment-intent-id})"
  (stripe-request :post {:endpoint "/v1/payment_intents/{payment-intent-id}/confirm" :path-params {:payment-intent-id payment-intent-id}}))

(defn post-payment-intents-intent-apply-customer-balance [{:keys [payment-intent-id]}]
  "Reconcile a customer_balance PaymentIntent

  HTTP Method: POST
  Endpoint: /v1/payment_intents/{payment-intent-id}/apply_customer_balance

  Path Parameters:
    - payment-intent-id: The payment-intent-id parameter. (required) [type: string]

  Example Usage:
    (post-payment-intents-intent-apply-customer-balance {:payment-intent-id example-payment-intent-id})"
  (stripe-request :post {:endpoint "/v1/payment_intents/{payment-intent-id}/apply_customer_balance" :path-params {:payment-intent-id payment-intent-id}}))

(defn list-all-payment-intents [{:keys [query-params]}]
  "List all PaymentIntents

  HTTP Method: GET
  Endpoint: /v1/payment_intents

  Query Parameters:
    - created: A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp or a dictionary with a number of different query options. [type: unknown]
    - customer: Only return PaymentIntents for the customer that this customer ID specifies. [type: string]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-payment-intents {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/payment_intents" :query-params query-params}))

(defn create-payment-intents [{:keys []}]
  "Create a PaymentIntent

  HTTP Method: POST
  Endpoint: /v1/payment_intents

  Example Usage:
    (create-payment-intents {})"
  (stripe-request :post {:endpoint "/v1/payment_intents"}))