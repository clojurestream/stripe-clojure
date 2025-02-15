(ns stream.clojure.stripe.api.disputes
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all [{:keys [query-params]}]
  "List all disputes

  HTTP Method: GET
  Endpoint: /v1/disputes

  Query Parameters:
    - charge: Only return disputes associated to the charge specified by this charge ID. [type: string]
    - created: Only return disputes that were created during the given date interval. [type: unknown]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - payment-intent: Only return disputes associated to the PaymentIntent specified by this PaymentIntent ID. [type: string]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/disputes" :query-params query-params}))

(defn post-dispute-close [{:keys [dispute-id]}]
  "Close a dispute

  HTTP Method: POST
  Endpoint: /v1/disputes/{dispute-id}/close

  Path Parameters:
    - dispute-id: The dispute-id parameter. (required) [type: string]

  Example Usage:
    (post-dispute-close {:dispute-id example-dispute-id})"
  (stripe-request :post {:endpoint "/v1/disputes/{dispute-id}/close" :path-params {:dispute-id dispute-id}}))

(defn retrieve-dispute [{:keys [dispute-id query-params]}]
  "Retrieve a dispute

  HTTP Method: GET
  Endpoint: /v1/disputes/{dispute-id}

  Path Parameters:
    - dispute-id: The dispute-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-dispute {:dispute-id example-dispute-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/disputes/{dispute-id}" :path-params {:dispute-id dispute-id} :query-params query-params}))

(defn update-dispute [{:keys [dispute-id]}]
  "Update a dispute

  HTTP Method: POST
  Endpoint: /v1/disputes/{dispute-id}

  Path Parameters:
    - dispute-id: The dispute-id parameter. (required) [type: string]

  Example Usage:
    (update-dispute {:dispute-id example-dispute-id})"
  (stripe-request :post {:endpoint "/v1/disputes/{dispute-id}" :path-params {:dispute-id dispute-id}}))