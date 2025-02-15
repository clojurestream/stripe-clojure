(ns stream.clojure.stripe.api.sigma
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-scheduled-query-runs [{:keys [query-params]}]
  "List all scheduled query runs

  HTTP Method: GET
  Endpoint: /v1/sigma/scheduled_query_runs

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-scheduled-query-runs {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/sigma/scheduled_query_runs" :query-params query-params}))

(defn retrieve-scheduled-query-runs-scheduled-query-run [{:keys [scheduled-query-run-id query-params]}]
  "Retrieve a scheduled query run

  HTTP Method: GET
  Endpoint: /v1/sigma/scheduled_query_runs/{scheduled-query-run-id}

  Path Parameters:
    - scheduled-query-run-id: The scheduled-query-run-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-scheduled-query-runs-scheduled-query-run {:scheduled-query-run-id example-scheduled-query-run-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/sigma/scheduled_query_runs/{scheduled-query-run-id}" :path-params {:scheduled-query-run-id scheduled-query-run-id} :query-params query-params}))