(ns stream.clojure.stripe.api.billing-portal
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn create-billing-portal-sessions
  "Create a portal session

  HTTP Method: POST
  Endpoint: /v1/billing_portal/sessions

  Example Usage:
    (create-billing-portal-sessions {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/billing_portal/sessions"}))

(defn list-all-billing-portal-configurations
  "List portal configurations

  HTTP Method: GET
  Endpoint: /v1/billing_portal/configurations

  Query Parameters:
    - active (Boolean): Only return configurations that are active or inactive (e.g., pass `true` to only list active configurations).
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - is-default (Boolean): Only return the default or non-default configurations (e.g., pass `true` to only list the default configuration).
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-billing-portal-configurations {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/billing_portal/configurations" :query-params query-params}))

(defn create-billing-portal-configurations
  "Create a portal configuration

  HTTP Method: POST
  Endpoint: /v1/billing_portal/configurations

  Example Usage:
    (create-billing-portal-configurations {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/billing_portal/configurations"}))

(defn retrieve-billing-portal-configurations-configuration
  "Retrieve a portal configuration

  HTTP Method: GET
  Endpoint: /v1/billing_portal/configurations/{configuration-id}

  Path Parameters:
    - configuration-id (String): The configuration-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-billing-portal-configurations-configuration {:configuration-id example-configuration-id :query-params {:limit 10}})"
  [{:keys [configuration-id query-params]}]
  (stripe-request :get {:endpoint "/v1/billing_portal/configurations/{configuration-id}" :path-params {:configuration-id configuration-id} :query-params query-params}))

(defn update-billing-portal-configurations-configuration
  "Update a portal configuration

  HTTP Method: POST
  Endpoint: /v1/billing_portal/configurations/{configuration-id}

  Path Parameters:
    - configuration-id (String): The configuration-id parameter. (required)

  Example Usage:
    (update-billing-portal-configurations-configuration {:configuration-id example-configuration-id})"
  [{:keys [configuration-id]}]
  (stripe-request :post {:endpoint "/v1/billing_portal/configurations/{configuration-id}" :path-params {:configuration-id configuration-id}}))