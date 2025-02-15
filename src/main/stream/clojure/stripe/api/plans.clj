(ns stream.clojure.stripe.api.plans
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all [{:keys [query-params]}]
  "List all plans

  HTTP Method: GET
  Endpoint: /v1/plans

  Query Parameters:
    - active: Only return plans that are active or inactive (e.g., pass `false` to list all inactive plans). [type: boolean]
    - created: A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options. [type: unknown]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - product: Only return plans for the given product. [type: string]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/plans" :query-params query-params}))

(defn create [{:keys []}]
  "Create a plan

  HTTP Method: POST
  Endpoint: /v1/plans

  Example Usage:
    (create {})"
  (stripe-request :post {:endpoint "/v1/plans"}))

(defn delete-plan [{:keys [plan-id]}]
  "Delete a plan

  HTTP Method: DELETE
  Endpoint: /v1/plans/{plan-id}

  Path Parameters:
    - plan-id: The plan-id parameter. (required) [type: string]

  Example Usage:
    (delete-plan {:plan-id example-plan-id})"
  (stripe-request :delete {:endpoint "/v1/plans/{plan-id}" :path-params {:plan-id plan-id}}))

(defn retrieve-plan [{:keys [plan-id query-params]}]
  "Retrieve a plan

  HTTP Method: GET
  Endpoint: /v1/plans/{plan-id}

  Path Parameters:
    - plan-id: The plan-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-plan {:plan-id example-plan-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/plans/{plan-id}" :path-params {:plan-id plan-id} :query-params query-params}))

(defn update-plan [{:keys [plan-id]}]
  "Update a plan

  HTTP Method: POST
  Endpoint: /v1/plans/{plan-id}

  Path Parameters:
    - plan-id: The plan-id parameter. (required) [type: string]

  Example Usage:
    (update-plan {:plan-id example-plan-id})"
  (stripe-request :post {:endpoint "/v1/plans/{plan-id}" :path-params {:plan-id plan-id}}))