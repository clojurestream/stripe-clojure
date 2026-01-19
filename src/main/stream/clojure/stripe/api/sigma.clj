(ns stream.clojure.stripe.api.sigma
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-scheduled-query-runs
  "List all scheduled query runs

  HTTP Method: GET
  Endpoint: /v1/sigma/scheduled_query_runs

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-scheduled-query-runs {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/sigma/scheduled_query_runs" :query-params query-params}))

(defn update-saved-queries-id
  "Update an existing Sigma Query

  HTTP Method: POST
  Endpoint: /v1/sigma/saved_queries/{saved-querie-id}

  Path Parameters:
    - saved-querie-id (String): The `id` of the saved query to update. This should be a valid `id` that was previously created.

  Example Usage:
    (update-saved-queries-id {:saved-querie-id example-saved-querie-id})"
  [{:keys [saved-querie-id]}]
  (stripe-request :post {:endpoint "/v1/sigma/saved_queries/{saved-querie-id}" :path-params {:saved-querie-id saved-querie-id}}))

(defn retrieve-scheduled-query-runs-scheduled-query-run
  "Retrieve a scheduled query run

  HTTP Method: GET
  Endpoint: /v1/sigma/scheduled_query_runs/{scheduled-query-run-id}

  Path Parameters:
    - scheduled-query-run-id (String): The scheduled-query-run-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-scheduled-query-runs-scheduled-query-run {:scheduled-query-run-id example-scheduled-query-run-id :query-params {:limit 10}})"
  [{:keys [scheduled-query-run-id query-params]}]
  (stripe-request :get {:endpoint "/v1/sigma/scheduled_query_runs/{scheduled-query-run-id}" :path-params {:scheduled-query-run-id scheduled-query-run-id} :query-params query-params}))