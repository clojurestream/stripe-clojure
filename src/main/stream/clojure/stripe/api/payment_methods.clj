(ns stream.clojure.stripe.api.payment-methods
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-payment-methods-payment-method-detach [{:keys [payment-method-id]}]
  "Detach a PaymentMethod from a Customer

  HTTP Method: POST
  Endpoint: /v1/payment_methods/{payment-method-id}/detach

  Path Parameters:
    - payment-method-id: The payment-method-id parameter. (required) [type: string]

  Example Usage:
    (post-payment-methods-payment-method-detach {:payment-method-id example-payment-method-id})"
  (stripe-request :post {:endpoint "/v1/payment_methods/{payment-method-id}/detach" :path-params {:payment-method-id payment-method-id}}))

(defn list-all-payment-methods [{:keys [query-params]}]
  "List PaymentMethods

  HTTP Method: GET
  Endpoint: /v1/payment_methods

  Query Parameters:
    - customer: The ID of the customer whose PaymentMethods will be retrieved. [type: string]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - type: An optional filter on the list, based on the object `type` field. Without the filter, the list includes all current and future payment method types. If your integration expects only one type of payment method in the response, make sure to provide a type value in the request. [type: string]

  Example Usage:
    (list-all-payment-methods {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/payment_methods" :query-params query-params}))

(defn post-payment-methods [{:keys []}]
  "Shares a PaymentMethod

  HTTP Method: POST
  Endpoint: /v1/payment_methods

  Example Usage:
    (post-payment-methods {})"
  (stripe-request :post {:endpoint "/v1/payment_methods"}))

(defn post-payment-methods-payment-method-attach [{:keys [payment-method-id]}]
  "Attach a PaymentMethod to a Customer

  HTTP Method: POST
  Endpoint: /v1/payment_methods/{payment-method-id}/attach

  Path Parameters:
    - payment-method-id: The payment-method-id parameter. (required) [type: string]

  Example Usage:
    (post-payment-methods-payment-method-attach {:payment-method-id example-payment-method-id})"
  (stripe-request :post {:endpoint "/v1/payment_methods/{payment-method-id}/attach" :path-params {:payment-method-id payment-method-id}}))

(defn retrieve-payment-methods-payment-method [{:keys [payment-method-id query-params]}]
  "Retrieve a PaymentMethod

  HTTP Method: GET
  Endpoint: /v1/payment_methods/{payment-method-id}

  Path Parameters:
    - payment-method-id: The payment-method-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-payment-methods-payment-method {:payment-method-id example-payment-method-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/payment_methods/{payment-method-id}" :path-params {:payment-method-id payment-method-id} :query-params query-params}))

(defn update-payment-methods-payment-method [{:keys [payment-method-id]}]
  "Update a PaymentMethod

  HTTP Method: POST
  Endpoint: /v1/payment_methods/{payment-method-id}

  Path Parameters:
    - payment-method-id: The payment-method-id parameter. (required) [type: string]

  Example Usage:
    (update-payment-methods-payment-method {:payment-method-id example-payment-method-id})"
  (stripe-request :post {:endpoint "/v1/payment_methods/{payment-method-id}" :path-params {:payment-method-id payment-method-id}}))