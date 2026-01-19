(ns stream.clojure.stripe.api.subscription-schedules
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-subscription-schedules
  "List all schedules

  HTTP Method: GET
  Endpoint: /v1/subscription_schedules

  Query Parameters:
    - canceled-at (Unknown): Only return subscription schedules that were created canceled the given date interval.
    - completed-at (Unknown): Only return subscription schedules that completed during the given date interval.
    - created (Unknown): Only return subscription schedules that were created during the given date interval.
    - customer (String): Only return subscription schedules for the given customer.
    - customer-account (String): Only return subscription schedules for the given account.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - released-at (Unknown): Only return subscription schedules that were released during the given date interval.
    - scheduled (Boolean): Only return subscription schedules that have not started yet.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-subscription-schedules {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/subscription_schedules" :query-params query-params}))

(defn create-subscription-schedules
  "Create a schedule

  HTTP Method: POST
  Endpoint: /v1/subscription_schedules

  Example Usage:
    (create-subscription-schedules {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/subscription_schedules"}))

(defn post-subscription-schedules-schedule-release
  "Release a schedule

  HTTP Method: POST
  Endpoint: /v1/subscription_schedules/{subscription-schedule-id}/release

  Path Parameters:
    - subscription-schedule-id (String): The subscription-schedule-id parameter. (required)

  Example Usage:
    (post-subscription-schedules-schedule-release {:subscription-schedule-id example-subscription-schedule-id})"
  [{:keys [subscription-schedule-id]}]
  (stripe-request :post {:endpoint "/v1/subscription_schedules/{subscription-schedule-id}/release" :path-params {:subscription-schedule-id subscription-schedule-id}}))

(defn retrieve-subscription-schedules-schedule
  "Retrieve a schedule

  HTTP Method: GET
  Endpoint: /v1/subscription_schedules/{subscription-schedule-id}

  Path Parameters:
    - subscription-schedule-id (String): The subscription-schedule-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-subscription-schedules-schedule {:subscription-schedule-id example-subscription-schedule-id :query-params {:limit 10}})"
  [{:keys [subscription-schedule-id query-params]}]
  (stripe-request :get {:endpoint "/v1/subscription_schedules/{subscription-schedule-id}" :path-params {:subscription-schedule-id subscription-schedule-id} :query-params query-params}))

(defn update-subscription-schedules-schedule
  "Update a schedule

  HTTP Method: POST
  Endpoint: /v1/subscription_schedules/{subscription-schedule-id}

  Path Parameters:
    - subscription-schedule-id (String): The subscription-schedule-id parameter. (required)

  Example Usage:
    (update-subscription-schedules-schedule {:subscription-schedule-id example-subscription-schedule-id})"
  [{:keys [subscription-schedule-id]}]
  (stripe-request :post {:endpoint "/v1/subscription_schedules/{subscription-schedule-id}" :path-params {:subscription-schedule-id subscription-schedule-id}}))

(defn post-subscription-schedules-schedule-cancel
  "Cancel a schedule

  HTTP Method: POST
  Endpoint: /v1/subscription_schedules/{subscription-schedule-id}/cancel

  Path Parameters:
    - subscription-schedule-id (String): The subscription-schedule-id parameter. (required)

  Example Usage:
    (post-subscription-schedules-schedule-cancel {:subscription-schedule-id example-subscription-schedule-id})"
  [{:keys [subscription-schedule-id]}]
  (stripe-request :post {:endpoint "/v1/subscription_schedules/{subscription-schedule-id}/cancel" :path-params {:subscription-schedule-id subscription-schedule-id}}))