(ns stream.clojure.stripe.api.reviews
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-review-approve
  "Approve a review

  HTTP Method: POST
  Endpoint: /v1/reviews/{review-id}/approve

  Path Parameters:
    - review-id (String): The review-id parameter. (required)

  Example Usage:
    (post-review-approve {:review-id example-review-id})"
  [{:keys [review-id]}]
  (stripe-request :post {:endpoint "/v1/reviews/{review-id}/approve" :path-params {:review-id review-id}}))

(defn retrieve-review
  "Retrieve a review

  HTTP Method: GET
  Endpoint: /v1/reviews/{review-id}

  Path Parameters:
    - review-id (String): The review-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-review {:review-id example-review-id :query-params {:limit 10}})"
  [{:keys [review-id query-params]}]
  (stripe-request :get {:endpoint "/v1/reviews/{review-id}" :path-params {:review-id review-id} :query-params query-params}))

(defn list-all
  "List all open reviews

  HTTP Method: GET
  Endpoint: /v1/reviews

  Query Parameters:
    - created (Unknown): Only return reviews that were created during the given date interval.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/reviews" :query-params query-params}))