(ns stream.clojure.stripe.api.subscription-items
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-subscription-items-item
  "Retrieve a subscription item

  HTTP Method: GET
  Endpoint: /v1/subscription_items/{subscription-item-id}

  Path Parameters:
    - subscription-item-id (String): The subscription-item-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-subscription-items-item {:subscription-item-id example-subscription-item-id :query-params {:limit 10}})"
  [{:keys [subscription-item-id query-params]}]
  (stripe-request :get {:endpoint "/v1/subscription_items/{subscription-item-id}" :path-params {:subscription-item-id subscription-item-id} :query-params query-params}))

(defn delete-subscription-items-item
  "Delete a subscription item

  HTTP Method: DELETE
  Endpoint: /v1/subscription_items/{subscription-item-id}

  Path Parameters:
    - subscription-item-id (String): The subscription-item-id parameter. (required)

  Example Usage:
    (delete-subscription-items-item {:subscription-item-id example-subscription-item-id})"
  [{:keys [subscription-item-id]}]
  (stripe-request :delete {:endpoint "/v1/subscription_items/{subscription-item-id}" :path-params {:subscription-item-id subscription-item-id}}))

(defn update-subscription-items-item
  "Update a subscription item

  HTTP Method: POST
  Endpoint: /v1/subscription_items/{subscription-item-id}

  Path Parameters:
    - subscription-item-id (String): The subscription-item-id parameter. (required)

  Example Usage:
    (update-subscription-items-item {:subscription-item-id example-subscription-item-id})"
  [{:keys [subscription-item-id body]}]
  (stripe-request :post {:endpoint "/v1/subscription_items/{subscription-item-id}" :path-params {:subscription-item-id subscription-item-id} :body body}))

(defn list-all-subscription-items
  "List all subscription items

  HTTP Method: GET
  Endpoint: /v1/subscription_items

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - subscription (String): The ID of the subscription whose items will be retrieved. (required)

  Example Usage:
    (list-all-subscription-items {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/subscription_items" :query-params query-params}))

(defn create-subscription-items
  "Create a subscription item

  HTTP Method: POST
  Endpoint: /v1/subscription_items

  Example Usage:
    (create-subscription-items {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/subscription_items" :body body}))