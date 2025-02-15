(ns stream.clojure.stripe.api.promotion-codes
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-promotion-codes-promotion-code [{:keys [promotion-code-id query-params]}]
  "Retrieve a promotion code

  HTTP Method: GET
  Endpoint: /v1/promotion_codes/{promotion-code-id}

  Path Parameters:
    - promotion-code-id: The promotion-code-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-promotion-codes-promotion-code {:promotion-code-id example-promotion-code-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/promotion_codes/{promotion-code-id}" :path-params {:promotion-code-id promotion-code-id} :query-params query-params}))

(defn update-promotion-codes-promotion-code [{:keys [promotion-code-id]}]
  "Update a promotion code

  HTTP Method: POST
  Endpoint: /v1/promotion_codes/{promotion-code-id}

  Path Parameters:
    - promotion-code-id: The promotion-code-id parameter. (required) [type: string]

  Example Usage:
    (update-promotion-codes-promotion-code {:promotion-code-id example-promotion-code-id})"
  (stripe-request :post {:endpoint "/v1/promotion_codes/{promotion-code-id}" :path-params {:promotion-code-id promotion-code-id}}))

(defn list-all-promotion-codes [{:keys [query-params]}]
  "List all promotion codes

  HTTP Method: GET
  Endpoint: /v1/promotion_codes

  Query Parameters:
    - active: Filter promotion codes by whether they are active. [type: boolean]
    - code: Only return promotion codes that have this case-insensitive code. [type: string]
    - coupon: Only return promotion codes for this coupon. [type: string]
    - created: A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options. [type: unknown]
    - customer: Only return promotion codes that are restricted to this customer. [type: string]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-promotion-codes {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/promotion_codes" :query-params query-params}))

(defn create-promotion-codes [{:keys []}]
  "Create a promotion code

  HTTP Method: POST
  Endpoint: /v1/promotion_codes

  Example Usage:
    (create-promotion-codes {})"
  (stripe-request :post {:endpoint "/v1/promotion_codes"}))