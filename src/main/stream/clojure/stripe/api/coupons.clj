(ns stream.clojure.stripe.api.coupons
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all
  "List all coupons

  HTTP Method: GET
  Endpoint: /v1/coupons

  Query Parameters:
    - created (Unknown): A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/coupons" :query-params query-params}))

(defn create
  "Create a coupon

  HTTP Method: POST
  Endpoint: /v1/coupons

  Example Usage:
    (create {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/coupons"}))

(defn delete-coupon
  "Delete a coupon

  HTTP Method: DELETE
  Endpoint: /v1/coupons/{coupon-id}

  Path Parameters:
    - coupon-id (String): The coupon-id parameter. (required)

  Example Usage:
    (delete-coupon {:coupon-id example-coupon-id})"
  [{:keys [coupon-id]}]
  (stripe-request :delete {:endpoint "/v1/coupons/{coupon-id}" :path-params {:coupon-id coupon-id}}))

(defn retrieve-coupon
  "Retrieve a coupon

  HTTP Method: GET
  Endpoint: /v1/coupons/{coupon-id}

  Path Parameters:
    - coupon-id (String): The coupon-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-coupon {:coupon-id example-coupon-id :query-params {:limit 10}})"
  [{:keys [coupon-id query-params]}]
  (stripe-request :get {:endpoint "/v1/coupons/{coupon-id}" :path-params {:coupon-id coupon-id} :query-params query-params}))

(defn update-coupon
  "Update a coupon

  HTTP Method: POST
  Endpoint: /v1/coupons/{coupon-id}

  Path Parameters:
    - coupon-id (String): The coupon-id parameter. (required)

  Example Usage:
    (update-coupon {:coupon-id example-coupon-id})"
  [{:keys [coupon-id]}]
  (stripe-request :post {:endpoint "/v1/coupons/{coupon-id}" :path-params {:coupon-id coupon-id}}))