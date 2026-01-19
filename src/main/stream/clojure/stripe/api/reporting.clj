(ns stream.clojure.stripe.api.reporting
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-report-types
  "List all Report Types

  HTTP Method: GET
  Endpoint: /v1/reporting/report_types

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (list-all-report-types {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/reporting/report_types" :query-params query-params}))

(defn list-all-report-runs
  "List all Report Runs

  HTTP Method: GET
  Endpoint: /v1/reporting/report_runs

  Query Parameters:
    - created (Unknown): Only return Report Runs that were created during the given date interval.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-report-runs {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/reporting/report_runs" :query-params query-params}))

(defn create-report-runs
  "Create a Report Run

  HTTP Method: POST
  Endpoint: /v1/reporting/report_runs

  Example Usage:
    (create-report-runs {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/reporting/report_runs" :body body}))

(defn retrieve-report-types-report-type
  "Retrieve a Report Type

  HTTP Method: GET
  Endpoint: /v1/reporting/report_types/{report-type-id}

  Path Parameters:
    - report-type-id (String): The report-type-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-report-types-report-type {:report-type-id example-report-type-id :query-params {:limit 10}})"
  [{:keys [report-type-id query-params]}]
  (stripe-request :get {:endpoint "/v1/reporting/report_types/{report-type-id}" :path-params {:report-type-id report-type-id} :query-params query-params}))

(defn retrieve-report-runs-report-run
  "Retrieve a Report Run

  HTTP Method: GET
  Endpoint: /v1/reporting/report_runs/{report-run-id}

  Path Parameters:
    - report-run-id (String): The report-run-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-report-runs-report-run {:report-run-id example-report-run-id :query-params {:limit 10}})"
  [{:keys [report-run-id query-params]}]
  (stripe-request :get {:endpoint "/v1/reporting/report_runs/{report-run-id}" :path-params {:report-run-id report-run-id} :query-params query-params}))