(ns stream.clojure.stripe.api.payment-method-domains
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-payment-method-domains [{:keys [query-params]}]
  "List payment method domains

  HTTP Method: GET
  Endpoint: /v1/payment_method_domains

  Query Parameters:
    - domain-name: The domain name that this payment method domain object represents. [type: string]
    - enabled: Whether this payment method domain is enabled. If the domain is not enabled, payment methods will not appear in Elements [type: boolean]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-payment-method-domains {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/payment_method_domains" :query-params query-params}))

(defn create-payment-method-domains [{:keys []}]
  "Create a payment method domain

  HTTP Method: POST
  Endpoint: /v1/payment_method_domains

  Example Usage:
    (create-payment-method-domains {})"
  (stripe-request :post {:endpoint "/v1/payment_method_domains"}))

(defn retrieve-payment-method-domains-payment-method-domain [{:keys [payment-method-domain-id query-params]}]
  "Retrieve a payment method domain

  HTTP Method: GET
  Endpoint: /v1/payment_method_domains/{payment-method-domain-id}

  Path Parameters:
    - payment-method-domain-id: The payment-method-domain-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-payment-method-domains-payment-method-domain {:payment-method-domain-id example-payment-method-domain-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/payment_method_domains/{payment-method-domain-id}" :path-params {:payment-method-domain-id payment-method-domain-id} :query-params query-params}))

(defn update-payment-method-domains-payment-method-domain [{:keys [payment-method-domain-id]}]
  "Update a payment method domain

  HTTP Method: POST
  Endpoint: /v1/payment_method_domains/{payment-method-domain-id}

  Path Parameters:
    - payment-method-domain-id: The payment-method-domain-id parameter. (required) [type: string]

  Example Usage:
    (update-payment-method-domains-payment-method-domain {:payment-method-domain-id example-payment-method-domain-id})"
  (stripe-request :post {:endpoint "/v1/payment_method_domains/{payment-method-domain-id}" :path-params {:payment-method-domain-id payment-method-domain-id}}))

(defn post-payment-method-domains-payment-method-domain-validate [{:keys [payment-method-domain-id]}]
  "Validate an existing payment method domain

  HTTP Method: POST
  Endpoint: /v1/payment_method_domains/{payment-method-domain-id}/validate

  Path Parameters:
    - payment-method-domain-id: The payment-method-domain-id parameter. (required) [type: string]

  Example Usage:
    (post-payment-method-domains-payment-method-domain-validate {:payment-method-domain-id example-payment-method-domain-id})"
  (stripe-request :post {:endpoint "/v1/payment_method_domains/{payment-method-domain-id}/validate" :path-params {:payment-method-domain-id payment-method-domain-id}}))