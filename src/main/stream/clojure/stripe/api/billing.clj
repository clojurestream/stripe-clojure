(ns stream.clojure.stripe.api.billing
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-alerts-id-archive [{:keys [alert-id]}]
  "Archive a billing alert

  HTTP Method: POST
  Endpoint: /v1/billing/alerts/{alert-id}/archive

  Path Parameters:
    - alert-id: The alert-id parameter. (required) [type: string]

  Example Usage:
    (post-alerts-id-archive {:alert-id example-alert-id})"
  (stripe-request :post {:endpoint "/v1/billing/alerts/{alert-id}/archive" :path-params {:alert-id alert-id}}))

(defn retrieve-alerts-id [{:keys [alert-id query-params]}]
  "Retrieve a billing alert

  HTTP Method: GET
  Endpoint: /v1/billing/alerts/{alert-id}

  Path Parameters:
    - alert-id: The alert-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-alerts-id {:alert-id example-alert-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/billing/alerts/{alert-id}" :path-params {:alert-id alert-id} :query-params query-params}))

(defn list-all-credit-grants [{:keys [query-params]}]
  "List credit grants

  HTTP Method: GET
  Endpoint: /v1/billing/credit_grants

  Query Parameters:
    - customer: Only return credit grants for this customer. [type: string]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-credit-grants {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/billing/credit_grants" :query-params query-params}))

(defn create-credit-grants [{:keys []}]
  "Create a credit grant

  HTTP Method: POST
  Endpoint: /v1/billing/credit_grants

  Example Usage:
    (create-credit-grants {})"
  (stripe-request :post {:endpoint "/v1/billing/credit_grants"}))

(defn list-all-meters-id-event-summaries [{:keys [meter-id query-params]}]
  "List billing meter event summaries

  HTTP Method: GET
  Endpoint: /v1/billing/meters/{meter-id}/event_summaries

  Path Parameters:
    - meter-id: Unique identifier for the object.

  Query Parameters:
    - customer: The customer for which to fetch event summaries. (required) [type: string]
    - end-time: The timestamp from when to stop aggregating meter events (exclusive). Must be aligned with minute boundaries. (required) [type: integer]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - start-time: The timestamp from when to start aggregating meter events (inclusive). Must be aligned with minute boundaries. (required) [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - value-grouping-window: Specifies what granularity to use when generating event summaries. If not specified, a single event summary would be returned for the specified time range. For hourly granularity, start and end times must align with hour boundaries (e.g., 00:00, 01:00, ..., 23:00). For daily granularity, start and end times must align with UTC day boundaries (00:00 UTC). [type: string]

  Example Usage:
    (list-all-meters-id-event-summaries {:meter-id example-meter-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/billing/meters/{meter-id}/event_summaries" :path-params {:meter-id meter-id} :query-params query-params}))

(defn create-meter-event-adjustments [{:keys []}]
  "Create a billing meter event adjustment

  HTTP Method: POST
  Endpoint: /v1/billing/meter_event_adjustments

  Example Usage:
    (create-meter-event-adjustments {})"
  (stripe-request :post {:endpoint "/v1/billing/meter_event_adjustments"}))

(defn post-alerts-id-deactivate [{:keys [alert-id]}]
  "Deactivate a billing alert

  HTTP Method: POST
  Endpoint: /v1/billing/alerts/{alert-id}/deactivate

  Path Parameters:
    - alert-id: The alert-id parameter. (required) [type: string]

  Example Usage:
    (post-alerts-id-deactivate {:alert-id example-alert-id})"
  (stripe-request :post {:endpoint "/v1/billing/alerts/{alert-id}/deactivate" :path-params {:alert-id alert-id}}))

(defn post-credit-grants-id-expire [{:keys [credit-grant-id]}]
  "Expire a credit grant

  HTTP Method: POST
  Endpoint: /v1/billing/credit_grants/{credit-grant-id}/expire

  Path Parameters:
    - credit-grant-id: Unique identifier for the object.

  Example Usage:
    (post-credit-grants-id-expire {:credit-grant-id example-credit-grant-id})"
  (stripe-request :post {:endpoint "/v1/billing/credit_grants/{credit-grant-id}/expire" :path-params {:credit-grant-id credit-grant-id}}))

(defn post-meters-id-deactivate [{:keys [meter-id]}]
  "Deactivate a billing meter

  HTTP Method: POST
  Endpoint: /v1/billing/meters/{meter-id}/deactivate

  Path Parameters:
    - meter-id: Unique identifier for the object.

  Example Usage:
    (post-meters-id-deactivate {:meter-id example-meter-id})"
  (stripe-request :post {:endpoint "/v1/billing/meters/{meter-id}/deactivate" :path-params {:meter-id meter-id}}))

(defn list-all-alerts [{:keys [query-params]}]
  "List billing alerts

  HTTP Method: GET
  Endpoint: /v1/billing/alerts

  Query Parameters:
    - alert-type: Filter results to only include this type of alert. [type: string]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - meter: Filter results to only include alerts with the given meter. [type: string]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-alerts {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/billing/alerts" :query-params query-params}))

(defn create-alerts [{:keys []}]
  "Create a billing alert

  HTTP Method: POST
  Endpoint: /v1/billing/alerts

  Example Usage:
    (create-alerts {})"
  (stripe-request :post {:endpoint "/v1/billing/alerts"}))

(defn post-alerts-id-activate [{:keys [alert-id]}]
  "Activate a billing alert

  HTTP Method: POST
  Endpoint: /v1/billing/alerts/{alert-id}/activate

  Path Parameters:
    - alert-id: The alert-id parameter. (required) [type: string]

  Example Usage:
    (post-alerts-id-activate {:alert-id example-alert-id})"
  (stripe-request :post {:endpoint "/v1/billing/alerts/{alert-id}/activate" :path-params {:alert-id alert-id}}))

(defn retrieve-credit-balance-transactions-id [{:keys [credit-balance-transaction-id query-params]}]
  "Retrieve a credit balance transaction

  HTTP Method: GET
  Endpoint: /v1/billing/credit_balance_transactions/{credit-balance-transaction-id}

  Path Parameters:
    - credit-balance-transaction-id: Unique identifier for the object.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-credit-balance-transactions-id {:credit-balance-transaction-id example-credit-balance-transaction-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/billing/credit_balance_transactions/{credit-balance-transaction-id}" :path-params {:credit-balance-transaction-id credit-balance-transaction-id} :query-params query-params}))

(defn list-all-meters [{:keys [query-params]}]
  "List billing meters

  HTTP Method: GET
  Endpoint: /v1/billing/meters

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - status: Filter results to only include meters with the given status. [type: string]

  Example Usage:
    (list-all-meters {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/billing/meters" :query-params query-params}))

(defn create-meters [{:keys []}]
  "Create a billing meter

  HTTP Method: POST
  Endpoint: /v1/billing/meters

  Example Usage:
    (create-meters {})"
  (stripe-request :post {:endpoint "/v1/billing/meters"}))

(defn list-all-credit-balance-summary [{:keys [query-params]}]
  "Retrieve the credit balance summary for a customer

  HTTP Method: GET
  Endpoint: /v1/billing/credit_balance_summary

  Query Parameters:
    - customer: The customer for which to fetch credit balance summary. (required) [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - filter: The filter criteria for the credit balance summary. (required) [type: object]

  Example Usage:
    (list-all-credit-balance-summary {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/billing/credit_balance_summary" :query-params query-params}))

(defn post-meters-id-reactivate [{:keys [meter-id]}]
  "Reactivate a billing meter

  HTTP Method: POST
  Endpoint: /v1/billing/meters/{meter-id}/reactivate

  Path Parameters:
    - meter-id: Unique identifier for the object.

  Example Usage:
    (post-meters-id-reactivate {:meter-id example-meter-id})"
  (stripe-request :post {:endpoint "/v1/billing/meters/{meter-id}/reactivate" :path-params {:meter-id meter-id}}))

(defn post-credit-grants-id-void [{:keys [credit-grant-id]}]
  "Void a credit grant

  HTTP Method: POST
  Endpoint: /v1/billing/credit_grants/{credit-grant-id}/void

  Path Parameters:
    - credit-grant-id: Unique identifier for the object.

  Example Usage:
    (post-credit-grants-id-void {:credit-grant-id example-credit-grant-id})"
  (stripe-request :post {:endpoint "/v1/billing/credit_grants/{credit-grant-id}/void" :path-params {:credit-grant-id credit-grant-id}}))

(defn retrieve-credit-grants-id [{:keys [credit-grant-id query-params]}]
  "Retrieve a credit grant

  HTTP Method: GET
  Endpoint: /v1/billing/credit_grants/{credit-grant-id}

  Path Parameters:
    - credit-grant-id: Unique identifier for the object.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-credit-grants-id {:credit-grant-id example-credit-grant-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/billing/credit_grants/{credit-grant-id}" :path-params {:credit-grant-id credit-grant-id} :query-params query-params}))

(defn update-credit-grants-id [{:keys [credit-grant-id]}]
  "Update a credit grant

  HTTP Method: POST
  Endpoint: /v1/billing/credit_grants/{credit-grant-id}

  Path Parameters:
    - credit-grant-id: Unique identifier for the object.

  Example Usage:
    (update-credit-grants-id {:credit-grant-id example-credit-grant-id})"
  (stripe-request :post {:endpoint "/v1/billing/credit_grants/{credit-grant-id}" :path-params {:credit-grant-id credit-grant-id}}))

(defn list-all-credit-balance-transactions [{:keys [query-params]}]
  "List credit balance transactions

  HTTP Method: GET
  Endpoint: /v1/billing/credit_balance_transactions

  Query Parameters:
    - credit-grant: The credit grant for which to fetch credit balance transactions. [type: string]
    - customer: The customer for which to fetch credit balance transactions. (required) [type: string]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-credit-balance-transactions {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/billing/credit_balance_transactions" :query-params query-params}))

(defn retrieve-meters-id [{:keys [meter-id query-params]}]
  "Retrieve a billing meter

  HTTP Method: GET
  Endpoint: /v1/billing/meters/{meter-id}

  Path Parameters:
    - meter-id: Unique identifier for the object.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-meters-id {:meter-id example-meter-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/billing/meters/{meter-id}" :path-params {:meter-id meter-id} :query-params query-params}))

(defn update-meters-id [{:keys [meter-id]}]
  "Update a billing meter

  HTTP Method: POST
  Endpoint: /v1/billing/meters/{meter-id}

  Path Parameters:
    - meter-id: Unique identifier for the object.

  Example Usage:
    (update-meters-id {:meter-id example-meter-id})"
  (stripe-request :post {:endpoint "/v1/billing/meters/{meter-id}" :path-params {:meter-id meter-id}}))

(defn create-meter-events [{:keys []}]
  "Create a billing meter event

  HTTP Method: POST
  Endpoint: /v1/billing/meter_events

  Example Usage:
    (create-meter-events {})"
  (stripe-request :post {:endpoint "/v1/billing/meter_events"}))