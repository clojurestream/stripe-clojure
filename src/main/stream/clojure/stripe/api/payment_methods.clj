(ns stream.clojure.stripe.api.payment-methods
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-payment-methods-payment-method-detach
  "Detach a PaymentMethod from a Customer

  HTTP Method: POST
  Endpoint: /v1/payment_methods/{payment-method-id}/detach

  Path Parameters:
    - payment-method-id (String): The payment-method-id parameter. (required)

  Example Usage:
    (post-payment-methods-payment-method-detach {:payment-method-id example-payment-method-id})"
  [{:keys [payment-method-id]}]
  (stripe-request :post {:endpoint "/v1/payment_methods/{payment-method-id}/detach" :path-params {:payment-method-id payment-method-id}}))

(defn list-all-payment-methods
  "List PaymentMethods

  HTTP Method: GET
  Endpoint: /v1/payment_methods

  Query Parameters:
    - allow-redisplay (String): This field indicates whether this payment method can be shown again to its customer in a checkout flow. Stripe products such as Checkout and Elements use this field to determine whether a payment method can be shown as a saved payment method in a checkout flow.
    - customer (String): The ID of the customer whose PaymentMethods will be retrieved.
    - customer-account (String): The ID of the Account whose PaymentMethods will be retrieved.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - type (String): Filters the list by the object `type` field. Unfiltered, the list returns all payment method types except `custom`. If your integration expects only one type of payment method in the response, specify that type value in the request to reduce your payload.

  Example Usage:
    (list-all-payment-methods {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/payment_methods" :query-params query-params}))

(defn post-payment-methods
  "Shares a PaymentMethod

  HTTP Method: POST
  Endpoint: /v1/payment_methods

  Example Usage:
    (post-payment-methods {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/payment_methods"}))

(defn post-payment-methods-payment-method-attach
  "Attach a PaymentMethod to a Customer

  HTTP Method: POST
  Endpoint: /v1/payment_methods/{payment-method-id}/attach

  Path Parameters:
    - payment-method-id (String): The payment-method-id parameter. (required)

  Example Usage:
    (post-payment-methods-payment-method-attach {:payment-method-id example-payment-method-id})"
  [{:keys [payment-method-id]}]
  (stripe-request :post {:endpoint "/v1/payment_methods/{payment-method-id}/attach" :path-params {:payment-method-id payment-method-id}}))

(defn retrieve-payment-methods-payment-method
  "Retrieve a PaymentMethod

  HTTP Method: GET
  Endpoint: /v1/payment_methods/{payment-method-id}

  Path Parameters:
    - payment-method-id (String): The payment-method-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-payment-methods-payment-method {:payment-method-id example-payment-method-id :query-params {:limit 10}})"
  [{:keys [payment-method-id query-params]}]
  (stripe-request :get {:endpoint "/v1/payment_methods/{payment-method-id}" :path-params {:payment-method-id payment-method-id} :query-params query-params}))

(defn update-payment-methods-payment-method
  "Update a PaymentMethod

  HTTP Method: POST
  Endpoint: /v1/payment_methods/{payment-method-id}

  Path Parameters:
    - payment-method-id (String): The payment-method-id parameter. (required)

  Example Usage:
    (update-payment-methods-payment-method {:payment-method-id example-payment-method-id})"
  [{:keys [payment-method-id]}]
  (stripe-request :post {:endpoint "/v1/payment_methods/{payment-method-id}" :path-params {:payment-method-id payment-method-id}}))