(ns stream.clojure.stripe.api.fabric
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-service-subscribe
  "No description available.

  HTTP Method: POST
  Endpoint: /v1/fabric/service/subscribe

  Example Usage:
    (post-service-subscribe {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/fabric/service/subscribe"}))

(defn list-all-service-integration-config
  "No description available.

  HTTP Method: GET
  Endpoint: /v1/fabric/service/integration_config

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.
    - service-name (String): The service-name parameter. (required)

  Example Usage:
    (list-all-service-integration-config {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/fabric/service/integration_config" :query-params query-params}))