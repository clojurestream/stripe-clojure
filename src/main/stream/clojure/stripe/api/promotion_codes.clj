(ns stream.clojure.stripe.api.promotion-codes
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-promotion-codes-promotion-code
  "Retrieve a promotion code

  HTTP Method: GET
  Endpoint: /v1/promotion_codes/{promotion-code-id}

  Path Parameters:
    - promotion-code-id (String): The promotion-code-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-promotion-codes-promotion-code {:promotion-code-id example-promotion-code-id :query-params {:limit 10}})"
  [{:keys [promotion-code-id query-params]}]
  (stripe-request :get {:endpoint "/v1/promotion_codes/{promotion-code-id}" :path-params {:promotion-code-id promotion-code-id} :query-params query-params}))

(defn update-promotion-codes-promotion-code
  "Update a promotion code

  HTTP Method: POST
  Endpoint: /v1/promotion_codes/{promotion-code-id}

  Path Parameters:
    - promotion-code-id (String): The promotion-code-id parameter. (required)

  Example Usage:
    (update-promotion-codes-promotion-code {:promotion-code-id example-promotion-code-id})"
  [{:keys [promotion-code-id]}]
  (stripe-request :post {:endpoint "/v1/promotion_codes/{promotion-code-id}" :path-params {:promotion-code-id promotion-code-id}}))

(defn list-all-promotion-codes
  "List all promotion codes

  HTTP Method: GET
  Endpoint: /v1/promotion_codes

  Query Parameters:
    - active (Boolean): Filter promotion codes by whether they are active.
    - code (String): Only return promotion codes that have this case-insensitive code.
    - coupon (String): Only return promotion codes for this coupon.
    - created (Unknown): A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options.
    - customer (String): Only return promotion codes that are restricted to this customer.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-promotion-codes {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/promotion_codes" :query-params query-params}))

(defn create-promotion-codes
  "Create a promotion code

  HTTP Method: POST
  Endpoint: /v1/promotion_codes

  Example Usage:
    (create-promotion-codes {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/promotion_codes"}))