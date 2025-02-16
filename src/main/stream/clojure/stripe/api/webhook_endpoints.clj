(ns stream.clojure.stripe.api.webhook-endpoints
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-webhook-endpoints
  "List all webhook endpoints

  HTTP Method: GET
  Endpoint: /v1/webhook_endpoints

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-webhook-endpoints {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/webhook_endpoints" :query-params query-params}))

(defn create-webhook-endpoints
  "Create a webhook endpoint

  HTTP Method: POST
  Endpoint: /v1/webhook_endpoints

  Example Usage:
    (create-webhook-endpoints {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/webhook_endpoints"}))

(defn delete-webhook-endpoints-webhook-endpoint
  "Delete a webhook endpoint

  HTTP Method: DELETE
  Endpoint: /v1/webhook_endpoints/{webhook-endpoint-id}

  Path Parameters:
    - webhook-endpoint-id (String): The webhook-endpoint-id parameter. (required)

  Example Usage:
    (delete-webhook-endpoints-webhook-endpoint {:webhook-endpoint-id example-webhook-endpoint-id})"
  [{:keys [webhook-endpoint-id]}]
  (stripe-request :delete {:endpoint "/v1/webhook_endpoints/{webhook-endpoint-id}" :path-params {:webhook-endpoint-id webhook-endpoint-id}}))

(defn retrieve-webhook-endpoints-webhook-endpoint
  "Retrieve a webhook endpoint

  HTTP Method: GET
  Endpoint: /v1/webhook_endpoints/{webhook-endpoint-id}

  Path Parameters:
    - webhook-endpoint-id (String): The webhook-endpoint-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-webhook-endpoints-webhook-endpoint {:webhook-endpoint-id example-webhook-endpoint-id :query-params {:limit 10}})"
  [{:keys [webhook-endpoint-id query-params]}]
  (stripe-request :get {:endpoint "/v1/webhook_endpoints/{webhook-endpoint-id}" :path-params {:webhook-endpoint-id webhook-endpoint-id} :query-params query-params}))

(defn update-webhook-endpoints-webhook-endpoint
  "Update a webhook endpoint

  HTTP Method: POST
  Endpoint: /v1/webhook_endpoints/{webhook-endpoint-id}

  Path Parameters:
    - webhook-endpoint-id (String): The webhook-endpoint-id parameter. (required)

  Example Usage:
    (update-webhook-endpoints-webhook-endpoint {:webhook-endpoint-id example-webhook-endpoint-id})"
  [{:keys [webhook-endpoint-id]}]
  (stripe-request :post {:endpoint "/v1/webhook_endpoints/{webhook-endpoint-id}" :path-params {:webhook-endpoint-id webhook-endpoint-id}}))