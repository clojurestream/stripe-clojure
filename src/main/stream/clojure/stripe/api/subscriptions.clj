(ns stream.clojure.stripe.api.subscriptions
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn delete-subscription-exposed-id [{:keys [subscription-id]}]
  "Cancel a subscription

  HTTP Method: DELETE
  Endpoint: /v1/subscriptions/{subscription-id}

  Path Parameters:
    - subscription-id: The subscription-id parameter. (required) [type: string]

  Example Usage:
    (delete-subscription-exposed-id {:subscription-id example-subscription-id})"
  (stripe-request :delete {:endpoint "/v1/subscriptions/{subscription-id}" :path-params {:subscription-id subscription-id}}))

(defn retrieve-subscription-exposed-id [{:keys [subscription-id query-params]}]
  "Retrieve a subscription

  HTTP Method: GET
  Endpoint: /v1/subscriptions/{subscription-id}

  Path Parameters:
    - subscription-id: The subscription-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-subscription-exposed-id {:subscription-id example-subscription-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/subscriptions/{subscription-id}" :path-params {:subscription-id subscription-id} :query-params query-params}))

(defn update-subscription-exposed-id [{:keys [subscription-id]}]
  "Update a subscription

  HTTP Method: POST
  Endpoint: /v1/subscriptions/{subscription-id}

  Path Parameters:
    - subscription-id: The subscription-id parameter. (required) [type: string]

  Example Usage:
    (update-subscription-exposed-id {:subscription-id example-subscription-id})"
  (stripe-request :post {:endpoint "/v1/subscriptions/{subscription-id}" :path-params {:subscription-id subscription-id}}))

(defn delete-subscription-exposed-id-discount [{:keys [subscription-id]}]
  "Delete a subscription discount

  HTTP Method: DELETE
  Endpoint: /v1/subscriptions/{subscription-id}/discount

  Path Parameters:
    - subscription-id: The subscription-id parameter. (required) [type: string]

  Example Usage:
    (delete-subscription-exposed-id-discount {:subscription-id example-subscription-id})"
  (stripe-request :delete {:endpoint "/v1/subscriptions/{subscription-id}/discount" :path-params {:subscription-id subscription-id}}))

(defn list-all-search [{:keys [query-params]}]
  "Search subscriptions

  HTTP Method: GET
  Endpoint: /v1/subscriptions/search

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - page: A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results. [type: string]
    - query: The search query string. See [search query language](https://stripe.com/docs/search#search-query-language) and the list of supported [query fields for subscriptions](https://stripe.com/docs/search#query-fields-for-subscriptions). (required) [type: string]

  Example Usage:
    (list-all-search {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/subscriptions/search" :query-params query-params}))

(defn post-subscription-resume [{:keys [subscription-id]}]
  "Resume a subscription

  HTTP Method: POST
  Endpoint: /v1/subscriptions/{subscription-id}/resume

  Path Parameters:
    - subscription-id: The subscription-id parameter. (required) [type: string]

  Example Usage:
    (post-subscription-resume {:subscription-id example-subscription-id})"
  (stripe-request :post {:endpoint "/v1/subscriptions/{subscription-id}/resume" :path-params {:subscription-id subscription-id}}))

(defn list-all [{:keys [query-params]}]
  "List subscriptions

  HTTP Method: GET
  Endpoint: /v1/subscriptions

  Query Parameters:
    - automatic-tax: Filter subscriptions by their automatic tax settings. [type: object]
    - collection-method: The collection method of the subscriptions to retrieve. Either `charge_automatically` or `send_invoice`. [type: string]
    - created: Only return subscriptions that were created during the given date interval. [type: unknown]
    - current-period-end: Only return subscriptions whose current_period_end falls within the given date interval. [type: unknown]
    - current-period-start: Only return subscriptions whose current_period_start falls within the given date interval. [type: unknown]
    - customer: The ID of the customer whose subscriptions will be retrieved. [type: string]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - price: Filter for subscriptions that contain this recurring price ID. [type: string]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - status: The status of the subscriptions to retrieve. Passing in a value of `canceled` will return all canceled subscriptions, including those belonging to deleted customers. Pass `ended` to find subscriptions that are canceled and subscriptions that are expired due to [incomplete payment](https://stripe.com/docs/billing/subscriptions/overview#subscription-statuses). Passing in a value of `all` will return subscriptions of all statuses. If no value is supplied, all subscriptions that have not been canceled are returned. [type: string]
    - test-clock: Filter for subscriptions that are associated with the specified test clock. The response will not include subscriptions with test clocks if this and the customer parameter is not set. [type: string]

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/subscriptions" :query-params query-params}))

(defn create [{:keys []}]
  "Create a subscription

  HTTP Method: POST
  Endpoint: /v1/subscriptions

  Example Usage:
    (create {})"
  (stripe-request :post {:endpoint "/v1/subscriptions"}))