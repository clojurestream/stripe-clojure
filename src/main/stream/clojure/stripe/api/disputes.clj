(ns stream.clojure.stripe.api.disputes
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all
  "List all disputes

  HTTP Method: GET
  Endpoint: /v1/disputes

  Query Parameters:
    - charge (String): Only return disputes associated to the charge specified by this charge ID.
    - created (Unknown): Only return disputes that were created during the given date interval.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - payment-intent (String): Only return disputes associated to the PaymentIntent specified by this PaymentIntent ID.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/disputes" :query-params query-params}))

(defn post-dispute-close
  "Close a dispute

  HTTP Method: POST
  Endpoint: /v1/disputes/{dispute-id}/close

  Path Parameters:
    - dispute-id (String): The dispute-id parameter. (required)

  Example Usage:
    (post-dispute-close {:dispute-id example-dispute-id})"
  [{:keys [dispute-id body]}]
  (stripe-request :post {:endpoint "/v1/disputes/{dispute-id}/close" :path-params {:dispute-id dispute-id} :body body}))

(defn retrieve-dispute
  "Retrieve a dispute

  HTTP Method: GET
  Endpoint: /v1/disputes/{dispute-id}

  Path Parameters:
    - dispute-id (String): The dispute-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-dispute {:dispute-id example-dispute-id :query-params {:limit 10}})"
  [{:keys [dispute-id query-params]}]
  (stripe-request :get {:endpoint "/v1/disputes/{dispute-id}" :path-params {:dispute-id dispute-id} :query-params query-params}))

(defn update-dispute
  "Update a dispute

  HTTP Method: POST
  Endpoint: /v1/disputes/{dispute-id}

  Path Parameters:
    - dispute-id (String): The dispute-id parameter. (required)

  Example Usage:
    (update-dispute {:dispute-id example-dispute-id})"
  [{:keys [dispute-id body]}]
  (stripe-request :post {:endpoint "/v1/disputes/{dispute-id}" :path-params {:dispute-id dispute-id} :body body}))