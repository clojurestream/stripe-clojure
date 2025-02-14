(ns stream.clojure.stripe.api.reporting
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-reporting [params]
  """
  List all Report Types

  HTTP Method: GET
  Endpoint: /v1/reporting/report_types

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/reporting/report_types") params))

(defn retrieve-reporting [params]
  """
  List all Report Runs

  HTTP Method: GET
  Endpoint: /v1/reporting/report_runs

  Query Parameters:
    - created: Only return Report Runs that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/reporting/report_runs") params))

(defn create-reporting [params]
  """
  Create a Report Run

  HTTP Method: POST
  Endpoint: /v1/reporting/report_runs

  """
  (stripe-request :post (str "/v1/reporting/report_runs") params))

(defn retrieve-reporting [report_type params]
  """
  Retrieve a Report Type

  HTTP Method: GET
  Endpoint: /v1/reporting/report_types/{report_type}

  Path Parameters:
    - report_type: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/reporting/report_types/" report_type "") params))

(defn retrieve-reporting [report_run params]
  """
  Retrieve a Report Run

  HTTP Method: GET
  Endpoint: /v1/reporting/report_runs/{report_run}

  Path Parameters:
    - report_run: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/reporting/report_runs/" report_run "") params))