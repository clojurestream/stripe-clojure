(ns stream.clojure.stripe.api.subscription-schedules
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-subscription-schedules [{:keys [query-params]}]
  "List all schedules

  HTTP Method: GET
  Endpoint: /v1/subscription_schedules

  Query Parameters:
    - canceled-at: Only return subscription schedules that were created canceled the given date interval. [type: unknown]
    - completed-at: Only return subscription schedules that completed during the given date interval. [type: unknown]
    - created: Only return subscription schedules that were created during the given date interval. [type: unknown]
    - customer: Only return subscription schedules for the given customer. [type: string]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - released-at: Only return subscription schedules that were released during the given date interval. [type: unknown]
    - scheduled: Only return subscription schedules that have not started yet. [type: boolean]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-subscription-schedules {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/subscription_schedules" :query-params query-params}))

(defn create-subscription-schedules [{:keys []}]
  "Create a schedule

  HTTP Method: POST
  Endpoint: /v1/subscription_schedules

  Example Usage:
    (create-subscription-schedules {})"
  (stripe-request :post {:endpoint "/v1/subscription_schedules"}))

(defn post-subscription-schedules-schedule-release [{:keys [subscription-schedule-id]}]
  "Release a schedule

  HTTP Method: POST
  Endpoint: /v1/subscription_schedules/{subscription-schedule-id}/release

  Path Parameters:
    - subscription-schedule-id: The subscription-schedule-id parameter. (required) [type: string]

  Example Usage:
    (post-subscription-schedules-schedule-release {:subscription-schedule-id example-subscription-schedule-id})"
  (stripe-request :post {:endpoint "/v1/subscription_schedules/{subscription-schedule-id}/release" :path-params {:subscription-schedule-id subscription-schedule-id}}))

(defn retrieve-subscription-schedules-schedule [{:keys [subscription-schedule-id query-params]}]
  "Retrieve a schedule

  HTTP Method: GET
  Endpoint: /v1/subscription_schedules/{subscription-schedule-id}

  Path Parameters:
    - subscription-schedule-id: The subscription-schedule-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-subscription-schedules-schedule {:subscription-schedule-id example-subscription-schedule-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/subscription_schedules/{subscription-schedule-id}" :path-params {:subscription-schedule-id subscription-schedule-id} :query-params query-params}))

(defn update-subscription-schedules-schedule [{:keys [subscription-schedule-id]}]
  "Update a schedule

  HTTP Method: POST
  Endpoint: /v1/subscription_schedules/{subscription-schedule-id}

  Path Parameters:
    - subscription-schedule-id: The subscription-schedule-id parameter. (required) [type: string]

  Example Usage:
    (update-subscription-schedules-schedule {:subscription-schedule-id example-subscription-schedule-id})"
  (stripe-request :post {:endpoint "/v1/subscription_schedules/{subscription-schedule-id}" :path-params {:subscription-schedule-id subscription-schedule-id}}))

(defn post-subscription-schedules-schedule-cancel [{:keys [subscription-schedule-id]}]
  "Cancel a schedule

  HTTP Method: POST
  Endpoint: /v1/subscription_schedules/{subscription-schedule-id}/cancel

  Path Parameters:
    - subscription-schedule-id: The subscription-schedule-id parameter. (required) [type: string]

  Example Usage:
    (post-subscription-schedules-schedule-cancel {:subscription-schedule-id example-subscription-schedule-id})"
  (stripe-request :post {:endpoint "/v1/subscription_schedules/{subscription-schedule-id}/cancel" :path-params {:subscription-schedule-id subscription-schedule-id}}))