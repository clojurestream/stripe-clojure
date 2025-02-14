(ns stream.clojure.stripe.api.subscriptions
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn delete-subscriptions [subscription_exposed_id params]
  """
  Cancel a subscription

  HTTP Method: DELETE
  Endpoint: /v1/subscriptions/{subscription_exposed_id}

  Path Parameters:
    - subscription_exposed_id: Path parameter.

  """
  (stripe-request :delete (str "/v1/subscriptions/" subscription_exposed_id "") params))

(defn retrieve-subscriptions [subscription_exposed_id params]
  """
  Retrieve a subscription

  HTTP Method: GET
  Endpoint: /v1/subscriptions/{subscription_exposed_id}

  Path Parameters:
    - subscription_exposed_id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/subscriptions/" subscription_exposed_id "") params))

(defn create-subscriptions [subscription_exposed_id params]
  """
  Update a subscription

  HTTP Method: POST
  Endpoint: /v1/subscriptions/{subscription_exposed_id}

  Path Parameters:
    - subscription_exposed_id: Path parameter.

  """
  (stripe-request :post (str "/v1/subscriptions/" subscription_exposed_id "") params))

(defn delete-subscriptions [subscription_exposed_id params]
  """
  Delete a subscription discount

  HTTP Method: DELETE
  Endpoint: /v1/subscriptions/{subscription_exposed_id}/discount

  Path Parameters:
    - subscription_exposed_id: Path parameter.

  """
  (stripe-request :delete (str "/v1/subscriptions/" subscription_exposed_id "/discount") params))

(defn retrieve-subscriptions [params]
  """
  Search subscriptions

  HTTP Method: GET
  Endpoint: /v1/subscriptions/search

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - page: A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results.
    - query: The search query string. See [search query language](https://stripe.com/docs/search#search-query-language) and the list of supported [query fields for subscriptions](https://stripe.com/docs/search#query-fields-for-subscriptions).

  """
  (stripe-request :get (str "/v1/subscriptions/search") params))

(defn create-subscriptions [subscription params]
  """
  Resume a subscription

  HTTP Method: POST
  Endpoint: /v1/subscriptions/{subscription}/resume

  Path Parameters:
    - subscription: Path parameter.

  """
  (stripe-request :post (str "/v1/subscriptions/" subscription "/resume") params))

(defn retrieve-subscriptions [params]
  """
  List subscriptions

  HTTP Method: GET
  Endpoint: /v1/subscriptions

  Query Parameters:
    - automatic_tax: Filter subscriptions by their automatic tax settings.
    - collection_method: The collection method of the subscriptions to retrieve. Either `charge_automatically` or `send_invoice`.
    - created: Only return subscriptions that were created during the given date interval.
    - current_period_end: Only return subscriptions whose current_period_end falls within the given date interval.
    - current_period_start: Only return subscriptions whose current_period_start falls within the given date interval.
    - customer: The ID of the customer whose subscriptions will be retrieved.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - price: Filter for subscriptions that contain this recurring price ID.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: The status of the subscriptions to retrieve. Passing in a value of `canceled` will return all canceled subscriptions, including those belonging to deleted customers. Pass `ended` to find subscriptions that are canceled and subscriptions that are expired due to [incomplete payment](https://stripe.com/docs/billing/subscriptions/overview#subscription-statuses). Passing in a value of `all` will return subscriptions of all statuses. If no value is supplied, all subscriptions that have not been canceled are returned.
    - test_clock: Filter for subscriptions that are associated with the specified test clock. The response will not include subscriptions with test clocks if this and the customer parameter is not set.

  """
  (stripe-request :get (str "/v1/subscriptions") params))

(defn create-subscriptions [params]
  """
  Create a subscription

  HTTP Method: POST
  Endpoint: /v1/subscriptions

  """
  (stripe-request :post (str "/v1/subscriptions") params))