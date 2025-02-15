(ns stream.clojure.stripe.api.subscription-items
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn delete-subscription-items-item [{:keys [subscription-item-id]}]
  "Delete a subscription item

  HTTP Method: DELETE
  Endpoint: /v1/subscription_items/{subscription-item-id}

  Path Parameters:
    - subscription-item-id: The subscription-item-id parameter. (required) [type: string]

  Example Usage:
    (delete-subscription-items-item {:subscription-item-id example-subscription-item-id})"
  (stripe-request :delete {:endpoint "/v1/subscription_items/{subscription-item-id}" :path-params {:subscription-item-id subscription-item-id}}))

(defn retrieve-subscription-items-item [{:keys [subscription-item-id query-params]}]
  "Retrieve a subscription item

  HTTP Method: GET
  Endpoint: /v1/subscription_items/{subscription-item-id}

  Path Parameters:
    - subscription-item-id: The subscription-item-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-subscription-items-item {:subscription-item-id example-subscription-item-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/subscription_items/{subscription-item-id}" :path-params {:subscription-item-id subscription-item-id} :query-params query-params}))

(defn update-subscription-items-item [{:keys [subscription-item-id]}]
  "Update a subscription item

  HTTP Method: POST
  Endpoint: /v1/subscription_items/{subscription-item-id}

  Path Parameters:
    - subscription-item-id: The subscription-item-id parameter. (required) [type: string]

  Example Usage:
    (update-subscription-items-item {:subscription-item-id example-subscription-item-id})"
  (stripe-request :post {:endpoint "/v1/subscription_items/{subscription-item-id}" :path-params {:subscription-item-id subscription-item-id}}))

(defn list-all-subscription-items [{:keys [query-params]}]
  "List all subscription items

  HTTP Method: GET
  Endpoint: /v1/subscription_items

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - subscription: The ID of the subscription whose items will be retrieved. (required) [type: string]

  Example Usage:
    (list-all-subscription-items {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/subscription_items" :query-params query-params}))

(defn create-subscription-items [{:keys []}]
  "Create a subscription item

  HTTP Method: POST
  Endpoint: /v1/subscription_items

  Example Usage:
    (create-subscription-items {})"
  (stripe-request :post {:endpoint "/v1/subscription_items"}))

(defn list-all-subscription-items-subscription-item-usage-record-summaries [{:keys [subscription-item-id query-params]}]
  "List all subscription item period summaries

  HTTP Method: GET
  Endpoint: /v1/subscription_items/{subscription-item-id}/usage_record_summaries

  Path Parameters:
    - subscription-item-id: The subscription-item-id parameter. (required) [type: string]

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-subscription-items-subscription-item-usage-record-summaries {:subscription-item-id example-subscription-item-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/subscription_items/{subscription-item-id}/usage_record_summaries" :path-params {:subscription-item-id subscription-item-id} :query-params query-params}))

(defn create-subscription-items-subscription-item-usage-records [{:keys [subscription-item-id]}]
  "Create a usage record

  HTTP Method: POST
  Endpoint: /v1/subscription_items/{subscription-item-id}/usage_records

  Path Parameters:
    - subscription-item-id: The subscription-item-id parameter. (required) [type: string]

  Example Usage:
    (create-subscription-items-subscription-item-usage-records {:subscription-item-id example-subscription-item-id})"
  (stripe-request :post {:endpoint "/v1/subscription_items/{subscription-item-id}/usage_records" :path-params {:subscription-item-id subscription-item-id}}))