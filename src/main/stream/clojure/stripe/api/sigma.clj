(ns stream.clojure.stripe.api.sigma
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn get-sigma-scheduled-query-runs [params]
  """
  List all scheduled query runs

  HTTP Method: GET
  Endpoint: /v1/sigma/scheduled_query_runs

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/sigma/scheduled_query_runs" params))

(defn get-sigma-scheduled-query-runs-scheduled-query-run [scheduled_query_run params]
  """
  Retrieve a scheduled query run

  HTTP Method: GET
  Endpoint: /v1/sigma/scheduled_query_runs/{scheduled_query_run}

  Path Parameters:
    - scheduled_query_run: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/sigma/scheduled_query_runs/" scheduled_query_run "" params))