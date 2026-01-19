(ns stream.clojure.stripe.api.subscriptions
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-subscription-exposed-id
  "Retrieve a subscription

  HTTP Method: GET
  Endpoint: /v1/subscriptions/{subscription-id}

  Path Parameters:
    - subscription-id (String): The subscription-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-subscription-exposed-id {:subscription-id example-subscription-id :query-params {:limit 10}})"
  [{:keys [subscription-id query-params]}]
  (stripe-request :get {:endpoint "/v1/subscriptions/{subscription-id}" :path-params {:subscription-id subscription-id} :query-params query-params}))

(defn delete-subscription-exposed-id
  "Cancel a subscription

  HTTP Method: DELETE
  Endpoint: /v1/subscriptions/{subscription-id}

  Path Parameters:
    - subscription-id (String): The subscription-id parameter. (required)

  Example Usage:
    (delete-subscription-exposed-id {:subscription-id example-subscription-id})"
  [{:keys [subscription-id]}]
  (stripe-request :delete {:endpoint "/v1/subscriptions/{subscription-id}" :path-params {:subscription-id subscription-id}}))

(defn update-subscription-exposed-id
  "Update a subscription

  HTTP Method: POST
  Endpoint: /v1/subscriptions/{subscription-id}

  Path Parameters:
    - subscription-id (String): The subscription-id parameter. (required)

  Example Usage:
    (update-subscription-exposed-id {:subscription-id example-subscription-id})"
  [{:keys [subscription-id]}]
  (stripe-request :post {:endpoint "/v1/subscriptions/{subscription-id}" :path-params {:subscription-id subscription-id}}))

(defn post-subscription-migrate
  "Migrate a subscription

  HTTP Method: POST
  Endpoint: /v1/subscriptions/{subscription-id}/migrate

  Path Parameters:
    - subscription-id (String): The subscription-id parameter. (required)

  Example Usage:
    (post-subscription-migrate {:subscription-id example-subscription-id})"
  [{:keys [subscription-id]}]
  (stripe-request :post {:endpoint "/v1/subscriptions/{subscription-id}/migrate" :path-params {:subscription-id subscription-id}}))

(defn delete-subscription-exposed-id-discount
  "Delete a subscription discount

  HTTP Method: DELETE
  Endpoint: /v1/subscriptions/{subscription-id}/discount

  Path Parameters:
    - subscription-id (String): The subscription-id parameter. (required)

  Example Usage:
    (delete-subscription-exposed-id-discount {:subscription-id example-subscription-id})"
  [{:keys [subscription-id]}]
  (stripe-request :delete {:endpoint "/v1/subscriptions/{subscription-id}/discount" :path-params {:subscription-id subscription-id}}))

(defn list-all-search
  "Search subscriptions

  HTTP Method: GET
  Endpoint: /v1/subscriptions/search

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - page (String): A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results.
    - query (String): The search query string. See [search query language](https://docs.stripe.com/search#search-query-language) and the list of supported [query fields for subscriptions](https://docs.stripe.com/search#query-fields-for-subscriptions). (required)

  Example Usage:
    (list-all-search {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/subscriptions/search" :query-params query-params}))

(defn post-subscription-resume
  "Resume a subscription

  HTTP Method: POST
  Endpoint: /v1/subscriptions/{subscription-id}/resume

  Path Parameters:
    - subscription-id (String): The subscription-id parameter. (required)

  Example Usage:
    (post-subscription-resume {:subscription-id example-subscription-id})"
  [{:keys [subscription-id]}]
  (stripe-request :post {:endpoint "/v1/subscriptions/{subscription-id}/resume" :path-params {:subscription-id subscription-id}}))

(defn list-all
  "List subscriptions

  HTTP Method: GET
  Endpoint: /v1/subscriptions

  Query Parameters:
    - automatic-tax (Object): Filter subscriptions by their automatic tax settings.
    - collection-method (String): The collection method of the subscriptions to retrieve. Either `charge_automatically` or `send_invoice`.
    - created (Unknown): Only return subscriptions that were created during the given date interval.
    - current-period-end (Unknown): Only return subscriptions whose minimum item current_period_end falls within the given date interval.
    - current-period-start (Unknown): Only return subscriptions whose maximum item current_period_start falls within the given date interval.
    - customer (String): The ID of the customer whose subscriptions you're retrieving.
    - customer-account (String): The ID of the account representing the customer whose subscriptions you're retrieving.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - price (String): Filter for subscriptions that contain this recurring price ID.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): The status of the subscriptions to retrieve. Passing in a value of `canceled` will return all canceled subscriptions, including those belonging to deleted customers. Pass `ended` to find subscriptions that are canceled and subscriptions that are expired due to [incomplete payment](https://docs.stripe.com/billing/subscriptions/overview#subscription-statuses). Passing in a value of `all` will return subscriptions of all statuses. If no value is supplied, all subscriptions that have not been canceled are returned.
    - test-clock (String): Filter for subscriptions that are associated with the specified test clock. The response will not include subscriptions with test clocks if this and the customer parameter is not set.

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/subscriptions" :query-params query-params}))

(defn create
  "Create a subscription

  HTTP Method: POST
  Endpoint: /v1/subscriptions

  Example Usage:
    (create {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/subscriptions"}))