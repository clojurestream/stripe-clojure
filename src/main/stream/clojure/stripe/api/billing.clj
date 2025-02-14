(ns stream.clojure.stripe.api.billing
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn create-billing [id params]
  """
  Archive a billing alert

  HTTP Method: POST
  Endpoint: /v1/billing/alerts/{id}/archive

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :post (str "/v1/billing/alerts/" id "/archive") params))

(defn retrieve-billing [id params]
  """
  Retrieve a billing alert

  HTTP Method: GET
  Endpoint: /v1/billing/alerts/{id}

  Path Parameters:
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/billing/alerts/" id "") params))

(defn retrieve-billing [params]
  """
  List credit grants

  HTTP Method: GET
  Endpoint: /v1/billing/credit_grants

  Query Parameters:
    - customer: Only return credit grants for this customer.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/billing/credit_grants") params))

(defn create-billing [params]
  """
  Create a credit grant

  HTTP Method: POST
  Endpoint: /v1/billing/credit_grants

  """
  (stripe-request :post (str "/v1/billing/credit_grants") params))

(defn retrieve-billing [id params]
  """
  List billing meter event summaries

  HTTP Method: GET
  Endpoint: /v1/billing/meters/{id}/event_summaries

  Path Parameters:
    - id: Path parameter.

  Query Parameters:
    - customer: The customer for which to fetch event summaries.
    - end_time: The timestamp from when to stop aggregating meter events (exclusive). Must be aligned with minute boundaries.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - start_time: The timestamp from when to start aggregating meter events (inclusive). Must be aligned with minute boundaries.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - value_grouping_window: Specifies what granularity to use when generating event summaries. If not specified, a single event summary would be returned for the specified time range. For hourly granularity, start and end times must align with hour boundaries (e.g., 00:00, 01:00, ..., 23:00). For daily granularity, start and end times must align with UTC day boundaries (00:00 UTC).

  """
  (stripe-request :get (str "/v1/billing/meters/" id "/event_summaries") params))

(defn create-billing [params]
  """
  Create a billing meter event adjustment

  HTTP Method: POST
  Endpoint: /v1/billing/meter_event_adjustments

  """
  (stripe-request :post (str "/v1/billing/meter_event_adjustments") params))

(defn create-billing [id params]
  """
  Deactivate a billing alert

  HTTP Method: POST
  Endpoint: /v1/billing/alerts/{id}/deactivate

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :post (str "/v1/billing/alerts/" id "/deactivate") params))

(defn create-billing [id params]
  """
  Expire a credit grant

  HTTP Method: POST
  Endpoint: /v1/billing/credit_grants/{id}/expire

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :post (str "/v1/billing/credit_grants/" id "/expire") params))

(defn create-billing [id params]
  """
  Deactivate a billing meter

  HTTP Method: POST
  Endpoint: /v1/billing/meters/{id}/deactivate

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :post (str "/v1/billing/meters/" id "/deactivate") params))

(defn retrieve-billing [params]
  """
  List billing alerts

  HTTP Method: GET
  Endpoint: /v1/billing/alerts

  Query Parameters:
    - alert_type: Filter results to only include this type of alert.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - meter: Filter results to only include alerts with the given meter.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/billing/alerts") params))

(defn create-billing [params]
  """
  Create a billing alert

  HTTP Method: POST
  Endpoint: /v1/billing/alerts

  """
  (stripe-request :post (str "/v1/billing/alerts") params))

(defn create-billing [id params]
  """
  Activate a billing alert

  HTTP Method: POST
  Endpoint: /v1/billing/alerts/{id}/activate

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :post (str "/v1/billing/alerts/" id "/activate") params))

(defn retrieve-billing [id params]
  """
  Retrieve a credit balance transaction

  HTTP Method: GET
  Endpoint: /v1/billing/credit_balance_transactions/{id}

  Path Parameters:
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/billing/credit_balance_transactions/" id "") params))

(defn retrieve-billing [params]
  """
  List billing meters

  HTTP Method: GET
  Endpoint: /v1/billing/meters

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Filter results to only include meters with the given status.

  """
  (stripe-request :get (str "/v1/billing/meters") params))

(defn create-billing [params]
  """
  Create a billing meter

  HTTP Method: POST
  Endpoint: /v1/billing/meters

  """
  (stripe-request :post (str "/v1/billing/meters") params))

(defn retrieve-billing [params]
  """
  Retrieve the credit balance summary for a customer

  HTTP Method: GET
  Endpoint: /v1/billing/credit_balance_summary

  Query Parameters:
    - customer: The customer for which to fetch credit balance summary.
    - expand: Specifies which fields in the response should be expanded.
    - filter: The filter criteria for the credit balance summary.

  """
  (stripe-request :get (str "/v1/billing/credit_balance_summary") params))

(defn create-billing [id params]
  """
  Reactivate a billing meter

  HTTP Method: POST
  Endpoint: /v1/billing/meters/{id}/reactivate

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :post (str "/v1/billing/meters/" id "/reactivate") params))

(defn create-billing [id params]
  """
  Void a credit grant

  HTTP Method: POST
  Endpoint: /v1/billing/credit_grants/{id}/void

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :post (str "/v1/billing/credit_grants/" id "/void") params))

(defn retrieve-billing [id params]
  """
  Retrieve a credit grant

  HTTP Method: GET
  Endpoint: /v1/billing/credit_grants/{id}

  Path Parameters:
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/billing/credit_grants/" id "") params))

(defn create-billing [id params]
  """
  Update a credit grant

  HTTP Method: POST
  Endpoint: /v1/billing/credit_grants/{id}

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :post (str "/v1/billing/credit_grants/" id "") params))

(defn retrieve-billing [params]
  """
  List credit balance transactions

  HTTP Method: GET
  Endpoint: /v1/billing/credit_balance_transactions

  Query Parameters:
    - credit_grant: The credit grant for which to fetch credit balance transactions.
    - customer: The customer for which to fetch credit balance transactions.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/billing/credit_balance_transactions") params))

(defn retrieve-billing [id params]
  """
  Retrieve a billing meter

  HTTP Method: GET
  Endpoint: /v1/billing/meters/{id}

  Path Parameters:
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/billing/meters/" id "") params))

(defn create-billing [id params]
  """
  Update a billing meter

  HTTP Method: POST
  Endpoint: /v1/billing/meters/{id}

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :post (str "/v1/billing/meters/" id "") params))

(defn create-billing [params]
  """
  Create a billing meter event

  HTTP Method: POST
  Endpoint: /v1/billing/meter_events

  """
  (stripe-request :post (str "/v1/billing/meter_events") params))