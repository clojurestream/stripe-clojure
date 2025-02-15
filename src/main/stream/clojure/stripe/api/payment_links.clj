(ns stream.clojure.stripe.api.payment-links
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-payment-links-payment-link [{:keys [payment-link-id query-params]}]
  "Retrieve payment link

  HTTP Method: GET
  Endpoint: /v1/payment_links/{payment-link-id}

  Path Parameters:
    - payment-link-id: The payment-link-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-payment-links-payment-link {:payment-link-id example-payment-link-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/payment_links/{payment-link-id}" :path-params {:payment-link-id payment-link-id} :query-params query-params}))

(defn update-payment-links-payment-link [{:keys [payment-link-id]}]
  "Update a payment link

  HTTP Method: POST
  Endpoint: /v1/payment_links/{payment-link-id}

  Path Parameters:
    - payment-link-id: The payment-link-id parameter. (required) [type: string]

  Example Usage:
    (update-payment-links-payment-link {:payment-link-id example-payment-link-id})"
  (stripe-request :post {:endpoint "/v1/payment_links/{payment-link-id}" :path-params {:payment-link-id payment-link-id}}))

(defn list-all-payment-links-payment-link-line-items [{:keys [payment-link-id query-params]}]
  "Retrieve a payment link's line items

  HTTP Method: GET
  Endpoint: /v1/payment_links/{payment-link-id}/line_items

  Path Parameters:
    - payment-link-id: The payment-link-id parameter. (required) [type: string]

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-payment-links-payment-link-line-items {:payment-link-id example-payment-link-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/payment_links/{payment-link-id}/line_items" :path-params {:payment-link-id payment-link-id} :query-params query-params}))

(defn list-all-payment-links [{:keys [query-params]}]
  "List all payment links

  HTTP Method: GET
  Endpoint: /v1/payment_links

  Query Parameters:
    - active: Only return payment links that are active or inactive (e.g., pass `false` to list all inactive payment links). [type: boolean]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-payment-links {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/payment_links" :query-params query-params}))

(defn create-payment-links [{:keys []}]
  "Create a payment link

  HTTP Method: POST
  Endpoint: /v1/payment_links

  Example Usage:
    (create-payment-links {})"
  (stripe-request :post {:endpoint "/v1/payment_links"}))