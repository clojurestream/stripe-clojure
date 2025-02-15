(ns stream.clojure.stripe.api.payment-method-configurations
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-payment-method-configurations [{:keys [query-params]}]
  "List payment method configurations

  HTTP Method: GET
  Endpoint: /v1/payment_method_configurations

  Query Parameters:
    - application: The Connect application to filter by. [type: unknown]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-payment-method-configurations {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/payment_method_configurations" :query-params query-params}))

(defn create-payment-method-configurations [{:keys []}]
  "Create a payment method configuration

  HTTP Method: POST
  Endpoint: /v1/payment_method_configurations

  Example Usage:
    (create-payment-method-configurations {})"
  (stripe-request :post {:endpoint "/v1/payment_method_configurations"}))

(defn retrieve-payment-method-configurations-configuration [{:keys [payment-method-configuration-id query-params]}]
  "Retrieve payment method configuration

  HTTP Method: GET
  Endpoint: /v1/payment_method_configurations/{payment-method-configuration-id}

  Path Parameters:
    - payment-method-configuration-id: The payment-method-configuration-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-payment-method-configurations-configuration {:payment-method-configuration-id example-payment-method-configuration-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/payment_method_configurations/{payment-method-configuration-id}" :path-params {:payment-method-configuration-id payment-method-configuration-id} :query-params query-params}))

(defn update-payment-method-configurations-configuration [{:keys [payment-method-configuration-id]}]
  "Update payment method configuration

  HTTP Method: POST
  Endpoint: /v1/payment_method_configurations/{payment-method-configuration-id}

  Path Parameters:
    - payment-method-configuration-id: The payment-method-configuration-id parameter. (required) [type: string]

  Example Usage:
    (update-payment-method-configurations-configuration {:payment-method-configuration-id example-payment-method-configuration-id})"
  (stripe-request :post {:endpoint "/v1/payment_method_configurations/{payment-method-configuration-id}" :path-params {:payment-method-configuration-id payment-method-configuration-id}}))