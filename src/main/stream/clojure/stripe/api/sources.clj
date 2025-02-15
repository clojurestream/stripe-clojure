(ns stream.clojure.stripe.api.sources
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-source-source-transactions-source-transaction [{:keys [source-id source-transaction-id query-params]}]
  "Retrieve a source transaction

  HTTP Method: GET
  Endpoint: /v1/sources/{source-id}/source_transactions/{source-transaction-id}

  Path Parameters:
    - source-id: The source-id parameter. (required) [type: string]
    - source-transaction-id: The source-transaction-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-source-source-transactions-source-transaction {:source-id example-source-id :source-transaction-id example-source-transaction-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/sources/{source-id}/source_transactions/{source-transaction-id}" :path-params {:source-id source-id :source-transaction-id source-transaction-id} :query-params query-params}))

(defn post-source-verify [{:keys [source-id]}]
  "No description available.

  HTTP Method: POST
  Endpoint: /v1/sources/{source-id}/verify

  Path Parameters:
    - source-id: The source-id parameter. (required) [type: string]

  Example Usage:
    (post-source-verify {:source-id example-source-id})"
  (stripe-request :post {:endpoint "/v1/sources/{source-id}/verify" :path-params {:source-id source-id}}))

(defn retrieve-source [{:keys [source-id query-params]}]
  "Retrieve a source

  HTTP Method: GET
  Endpoint: /v1/sources/{source-id}

  Path Parameters:
    - source-id: The source-id parameter. (required) [type: string]

  Query Parameters:
    - client-secret: The client secret of the source. Required if a publishable key is used to retrieve the source. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-source {:source-id example-source-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/sources/{source-id}" :path-params {:source-id source-id} :query-params query-params}))

(defn update-source [{:keys [source-id]}]
  "Update a source

  HTTP Method: POST
  Endpoint: /v1/sources/{source-id}

  Path Parameters:
    - source-id: The source-id parameter. (required) [type: string]

  Example Usage:
    (update-source {:source-id example-source-id})"
  (stripe-request :post {:endpoint "/v1/sources/{source-id}" :path-params {:source-id source-id}}))

(defn retrieve-source-mandate-notifications-mandate-notification [{:keys [source-id mandate-notification-id query-params]}]
  "Retrieve a Source MandateNotification

  HTTP Method: GET
  Endpoint: /v1/sources/{source-id}/mandate_notifications/{mandate-notification-id}

  Path Parameters:
    - source-id: The source-id parameter. (required) [type: string]
    - mandate-notification-id: The mandate-notification-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-source-mandate-notifications-mandate-notification {:source-id example-source-id :mandate-notification-id example-mandate-notification-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/sources/{source-id}/mandate_notifications/{mandate-notification-id}" :path-params {:source-id source-id :mandate-notification-id mandate-notification-id} :query-params query-params}))

(defn list-all-source-source-transactions [{:keys [source-id query-params]}]
  "No description available.

  HTTP Method: GET
  Endpoint: /v1/sources/{source-id}/source_transactions

  Path Parameters:
    - source-id: The source-id parameter. (required) [type: string]

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-source-source-transactions {:source-id example-source-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/sources/{source-id}/source_transactions" :path-params {:source-id source-id} :query-params query-params}))

(defn post [{:keys []}]
  "Shares a source

  HTTP Method: POST
  Endpoint: /v1/sources

  Example Usage:
    (post {})"
  (stripe-request :post {:endpoint "/v1/sources"}))