(ns stream.clojure.stripe.api.plans
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all
  "List all plans

  HTTP Method: GET
  Endpoint: /v1/plans

  Query Parameters:
    - active (Boolean): Only return plans that are active or inactive (e.g., pass `false` to list all inactive plans).
    - created (Unknown): A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - product (String): Only return plans for the given product.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/plans" :query-params query-params}))

(defn create
  "Create a plan

  HTTP Method: POST
  Endpoint: /v1/plans

  Example Usage:
    (create {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/plans" :body body}))

(defn retrieve-plan
  "Retrieve a plan

  HTTP Method: GET
  Endpoint: /v1/plans/{plan-id}

  Path Parameters:
    - plan-id (String): The plan-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-plan {:plan-id example-plan-id :query-params {:limit 10}})"
  [{:keys [plan-id query-params]}]
  (stripe-request :get {:endpoint "/v1/plans/{plan-id}" :path-params {:plan-id plan-id} :query-params query-params}))

(defn delete-plan
  "Delete a plan

  HTTP Method: DELETE
  Endpoint: /v1/plans/{plan-id}

  Path Parameters:
    - plan-id (String): The plan-id parameter. (required)

  Example Usage:
    (delete-plan {:plan-id example-plan-id})"
  [{:keys [plan-id]}]
  (stripe-request :delete {:endpoint "/v1/plans/{plan-id}" :path-params {:plan-id plan-id}}))

(defn update-plan
  "Update a plan

  HTTP Method: POST
  Endpoint: /v1/plans/{plan-id}

  Path Parameters:
    - plan-id (String): The plan-id parameter. (required)

  Example Usage:
    (update-plan {:plan-id example-plan-id})"
  [{:keys [plan-id body]}]
  (stripe-request :post {:endpoint "/v1/plans/{plan-id}" :path-params {:plan-id plan-id} :body body}))