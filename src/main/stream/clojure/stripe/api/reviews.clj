(ns stream.clojure.stripe.api.reviews
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-review-approve [{:keys [review-id]}]
  "Approve a review

  HTTP Method: POST
  Endpoint: /v1/reviews/{review-id}/approve

  Path Parameters:
    - review-id: The review-id parameter. (required) [type: string]

  Example Usage:
    (post-review-approve {:review-id example-review-id})"
  (stripe-request :post {:endpoint "/v1/reviews/{review-id}/approve" :path-params {:review-id review-id}}))

(defn retrieve-review [{:keys [review-id query-params]}]
  "Retrieve a review

  HTTP Method: GET
  Endpoint: /v1/reviews/{review-id}

  Path Parameters:
    - review-id: The review-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-review {:review-id example-review-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/reviews/{review-id}" :path-params {:review-id review-id} :query-params query-params}))

(defn list-all [{:keys [query-params]}]
  "List all open reviews

  HTTP Method: GET
  Endpoint: /v1/reviews

  Query Parameters:
    - created: Only return reviews that were created during the given date interval. [type: unknown]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/reviews" :query-params query-params}))