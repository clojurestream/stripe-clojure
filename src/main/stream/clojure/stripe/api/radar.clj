(ns stream.clojure.stripe.api.radar
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-early-fraud-warnings [{:keys [query-params]}]
  "List all early fraud warnings

  HTTP Method: GET
  Endpoint: /v1/radar/early_fraud_warnings

  Query Parameters:
    - charge: Only return early fraud warnings for the charge specified by this charge ID. [type: string]
    - created: Only return early fraud warnings that were created during the given date interval. [type: unknown]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - payment-intent: Only return early fraud warnings for charges that were created by the PaymentIntent specified by this PaymentIntent ID. [type: string]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-early-fraud-warnings {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/radar/early_fraud_warnings" :query-params query-params}))

(defn delete-value-list-items-item [{:keys [value-list-item-id]}]
  "Delete a value list item

  HTTP Method: DELETE
  Endpoint: /v1/radar/value_list_items/{value-list-item-id}

  Path Parameters:
    - value-list-item-id: The value-list-item-id parameter. (required) [type: string]

  Example Usage:
    (delete-value-list-items-item {:value-list-item-id example-value-list-item-id})"
  (stripe-request :delete {:endpoint "/v1/radar/value_list_items/{value-list-item-id}" :path-params {:value-list-item-id value-list-item-id}}))

(defn retrieve-value-list-items-item [{:keys [value-list-item-id query-params]}]
  "Retrieve a value list item

  HTTP Method: GET
  Endpoint: /v1/radar/value_list_items/{value-list-item-id}

  Path Parameters:
    - value-list-item-id: The value-list-item-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-value-list-items-item {:value-list-item-id example-value-list-item-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/radar/value_list_items/{value-list-item-id}" :path-params {:value-list-item-id value-list-item-id} :query-params query-params}))

(defn delete-value-lists-value-list [{:keys [value-list-id]}]
  "Delete a value list

  HTTP Method: DELETE
  Endpoint: /v1/radar/value_lists/{value-list-id}

  Path Parameters:
    - value-list-id: The value-list-id parameter. (required) [type: string]

  Example Usage:
    (delete-value-lists-value-list {:value-list-id example-value-list-id})"
  (stripe-request :delete {:endpoint "/v1/radar/value_lists/{value-list-id}" :path-params {:value-list-id value-list-id}}))

(defn retrieve-value-lists-value-list [{:keys [value-list-id query-params]}]
  "Retrieve a value list

  HTTP Method: GET
  Endpoint: /v1/radar/value_lists/{value-list-id}

  Path Parameters:
    - value-list-id: The value-list-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-value-lists-value-list {:value-list-id example-value-list-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/radar/value_lists/{value-list-id}" :path-params {:value-list-id value-list-id} :query-params query-params}))

(defn update-value-lists-value-list [{:keys [value-list-id]}]
  "Update a value list

  HTTP Method: POST
  Endpoint: /v1/radar/value_lists/{value-list-id}

  Path Parameters:
    - value-list-id: The value-list-id parameter. (required) [type: string]

  Example Usage:
    (update-value-lists-value-list {:value-list-id example-value-list-id})"
  (stripe-request :post {:endpoint "/v1/radar/value_lists/{value-list-id}" :path-params {:value-list-id value-list-id}}))

(defn list-all-value-lists [{:keys [query-params]}]
  "List all value lists

  HTTP Method: GET
  Endpoint: /v1/radar/value_lists

  Query Parameters:
    - alias: The alias used to reference the value list when writing rules. [type: string]
    - contains: A value contained within a value list - returns all value lists containing this value. [type: string]
    - created: Only return value lists that were created during the given date interval. [type: unknown]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-value-lists {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/radar/value_lists" :query-params query-params}))

(defn create-value-lists [{:keys []}]
  "Create a value list

  HTTP Method: POST
  Endpoint: /v1/radar/value_lists

  Example Usage:
    (create-value-lists {})"
  (stripe-request :post {:endpoint "/v1/radar/value_lists"}))

(defn list-all-value-list-items [{:keys [query-params]}]
  "List all value list items

  HTTP Method: GET
  Endpoint: /v1/radar/value_list_items

  Query Parameters:
    - created: Only return items that were created during the given date interval. [type: unknown]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - value: Return items belonging to the parent list whose value matches the specified value (using an 'is like' match). [type: string]
    - value-list: Identifier for the parent value list this item belongs to. (required) [type: string]

  Example Usage:
    (list-all-value-list-items {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/radar/value_list_items" :query-params query-params}))

(defn create-value-list-items [{:keys []}]
  "Create a value list item

  HTTP Method: POST
  Endpoint: /v1/radar/value_list_items

  Example Usage:
    (create-value-list-items {})"
  (stripe-request :post {:endpoint "/v1/radar/value_list_items"}))

(defn retrieve-early-fraud-warnings-early-fraud-warning [{:keys [early-fraud-warning-id query-params]}]
  "Retrieve an early fraud warning

  HTTP Method: GET
  Endpoint: /v1/radar/early_fraud_warnings/{early-fraud-warning-id}

  Path Parameters:
    - early-fraud-warning-id: The early-fraud-warning-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-early-fraud-warnings-early-fraud-warning {:early-fraud-warning-id example-early-fraud-warning-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/radar/early_fraud_warnings/{early-fraud-warning-id}" :path-params {:early-fraud-warning-id early-fraud-warning-id} :query-params query-params}))