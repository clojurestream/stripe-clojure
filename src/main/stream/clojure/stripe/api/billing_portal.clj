(ns stream.clojure.stripe.api.billing-portal
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn create-billing-portal-sessions [{:keys []}]
  "Create a portal session

  HTTP Method: POST
  Endpoint: /v1/billing_portal/sessions

  Example Usage:
    (create-billing-portal-sessions {})"
  (stripe-request :post {:endpoint "/v1/billing_portal/sessions"}))

(defn list-all-billing-portal-configurations [{:keys [query-params]}]
  "List portal configurations

  HTTP Method: GET
  Endpoint: /v1/billing_portal/configurations

  Query Parameters:
    - active: Only return configurations that are active or inactive (e.g., pass `true` to only list active configurations). [type: boolean]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - is-default: Only return the default or non-default configurations (e.g., pass `true` to only list the default configuration). [type: boolean]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-billing-portal-configurations {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/billing_portal/configurations" :query-params query-params}))

(defn create-billing-portal-configurations [{:keys []}]
  "Create a portal configuration

  HTTP Method: POST
  Endpoint: /v1/billing_portal/configurations

  Example Usage:
    (create-billing-portal-configurations {})"
  (stripe-request :post {:endpoint "/v1/billing_portal/configurations"}))

(defn retrieve-billing-portal-configurations-configuration [{:keys [configuration-id query-params]}]
  "Retrieve a portal configuration

  HTTP Method: GET
  Endpoint: /v1/billing_portal/configurations/{configuration-id}

  Path Parameters:
    - configuration-id: The configuration-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-billing-portal-configurations-configuration {:configuration-id example-configuration-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/billing_portal/configurations/{configuration-id}" :path-params {:configuration-id configuration-id} :query-params query-params}))

(defn update-billing-portal-configurations-configuration [{:keys [configuration-id]}]
  "Update a portal configuration

  HTTP Method: POST
  Endpoint: /v1/billing_portal/configurations/{configuration-id}

  Path Parameters:
    - configuration-id: The configuration-id parameter. (required) [type: string]

  Example Usage:
    (update-billing-portal-configurations-configuration {:configuration-id example-configuration-id})"
  (stripe-request :post {:endpoint "/v1/billing_portal/configurations/{configuration-id}" :path-params {:configuration-id configuration-id}}))