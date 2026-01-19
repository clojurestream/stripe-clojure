(ns stream.clojure.stripe.api.payment-method-domains
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-payment-method-domains
  "List payment method domains

  HTTP Method: GET
  Endpoint: /v1/payment_method_domains

  Query Parameters:
    - domain-name (String): The domain name that this payment method domain object represents.
    - enabled (Boolean): Whether this payment method domain is enabled. If the domain is not enabled, payment methods will not appear in Elements or Embedded Checkout
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-payment-method-domains {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/payment_method_domains" :query-params query-params}))

(defn create-payment-method-domains
  "Create a payment method domain

  HTTP Method: POST
  Endpoint: /v1/payment_method_domains

  Example Usage:
    (create-payment-method-domains {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/payment_method_domains"}))

(defn retrieve-payment-method-domains-payment-method-domain
  "Retrieve a payment method domain

  HTTP Method: GET
  Endpoint: /v1/payment_method_domains/{payment-method-domain-id}

  Path Parameters:
    - payment-method-domain-id (String): The payment-method-domain-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-payment-method-domains-payment-method-domain {:payment-method-domain-id example-payment-method-domain-id :query-params {:limit 10}})"
  [{:keys [payment-method-domain-id query-params]}]
  (stripe-request :get {:endpoint "/v1/payment_method_domains/{payment-method-domain-id}" :path-params {:payment-method-domain-id payment-method-domain-id} :query-params query-params}))

(defn update-payment-method-domains-payment-method-domain
  "Update a payment method domain

  HTTP Method: POST
  Endpoint: /v1/payment_method_domains/{payment-method-domain-id}

  Path Parameters:
    - payment-method-domain-id (String): The payment-method-domain-id parameter. (required)

  Example Usage:
    (update-payment-method-domains-payment-method-domain {:payment-method-domain-id example-payment-method-domain-id})"
  [{:keys [payment-method-domain-id]}]
  (stripe-request :post {:endpoint "/v1/payment_method_domains/{payment-method-domain-id}" :path-params {:payment-method-domain-id payment-method-domain-id}}))

(defn post-payment-method-domains-payment-method-domain-validate
  "Validate an existing payment method domain

  HTTP Method: POST
  Endpoint: /v1/payment_method_domains/{payment-method-domain-id}/validate

  Path Parameters:
    - payment-method-domain-id (String): The payment-method-domain-id parameter. (required)

  Example Usage:
    (post-payment-method-domains-payment-method-domain-validate {:payment-method-domain-id example-payment-method-domain-id})"
  [{:keys [payment-method-domain-id]}]
  (stripe-request :post {:endpoint "/v1/payment_method_domains/{payment-method-domain-id}/validate" :path-params {:payment-method-domain-id payment-method-domain-id}}))