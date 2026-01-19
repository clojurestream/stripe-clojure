(ns stream.clojure.stripe.api.payment-links
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-payment-links-payment-link
  "Retrieve payment link

  HTTP Method: GET
  Endpoint: /v1/payment_links/{payment-link-id}

  Path Parameters:
    - payment-link-id (String): The payment-link-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-payment-links-payment-link {:payment-link-id example-payment-link-id :query-params {:limit 10}})"
  [{:keys [payment-link-id query-params]}]
  (stripe-request :get {:endpoint "/v1/payment_links/{payment-link-id}" :path-params {:payment-link-id payment-link-id} :query-params query-params}))

(defn update-payment-links-payment-link
  "Update a payment link

  HTTP Method: POST
  Endpoint: /v1/payment_links/{payment-link-id}

  Path Parameters:
    - payment-link-id (String): The payment-link-id parameter. (required)

  Example Usage:
    (update-payment-links-payment-link {:payment-link-id example-payment-link-id})"
  [{:keys [payment-link-id body]}]
  (stripe-request :post {:endpoint "/v1/payment_links/{payment-link-id}" :path-params {:payment-link-id payment-link-id} :body body}))

(defn list-all-payment-links-payment-link-line-items
  "Retrieve a payment link's line items

  HTTP Method: GET
  Endpoint: /v1/payment_links/{payment-link-id}/line_items

  Path Parameters:
    - payment-link-id (String): The payment-link-id parameter. (required)

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-payment-links-payment-link-line-items {:payment-link-id example-payment-link-id :query-params {:limit 10}})"
  [{:keys [payment-link-id query-params]}]
  (stripe-request :get {:endpoint "/v1/payment_links/{payment-link-id}/line_items" :path-params {:payment-link-id payment-link-id} :query-params query-params}))

(defn list-all-payment-links
  "List all payment links

  HTTP Method: GET
  Endpoint: /v1/payment_links

  Query Parameters:
    - active (Boolean): Only return payment links that are active or inactive (e.g., pass `false` to list all inactive payment links).
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-payment-links {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/payment_links" :query-params query-params}))

(defn create-payment-links
  "Create a payment link

  HTTP Method: POST
  Endpoint: /v1/payment_links

  Example Usage:
    (create-payment-links {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/payment_links" :body body}))