(ns stream.clojure.stripe.api.entitlements
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-features [{:keys [query-params]}]
  "List all features

  HTTP Method: GET
  Endpoint: /v1/entitlements/features

  Query Parameters:
    - archived: If set, filter results to only include features with the given archive status. [type: boolean]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - lookup-key: If set, filter results to only include features with the given lookup_key. [type: string]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-features {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/entitlements/features" :query-params query-params}))

(defn create-features [{:keys []}]
  "Create a feature

  HTTP Method: POST
  Endpoint: /v1/entitlements/features

  Example Usage:
    (create-features {})"
  (stripe-request :post {:endpoint "/v1/entitlements/features"}))

(defn retrieve-features-id [{:keys [feature-id query-params]}]
  "Retrieve a feature

  HTTP Method: GET
  Endpoint: /v1/entitlements/features/{feature-id}

  Path Parameters:
    - feature-id: The ID of the feature.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-features-id {:feature-id example-feature-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/entitlements/features/{feature-id}" :path-params {:feature-id feature-id} :query-params query-params}))

(defn post-features-id [{:keys [feature-id]}]
  "Updates a feature

  HTTP Method: POST
  Endpoint: /v1/entitlements/features/{feature-id}

  Path Parameters:
    - feature-id: The feature-id parameter. (required) [type: string]

  Example Usage:
    (post-features-id {:feature-id example-feature-id})"
  (stripe-request :post {:endpoint "/v1/entitlements/features/{feature-id}" :path-params {:feature-id feature-id}}))

(defn retrieve-active-id [{:keys [active-entitlement-id query-params]}]
  "Retrieve an active entitlement

  HTTP Method: GET
  Endpoint: /v1/entitlements/active_entitlements/{active-entitlement-id}

  Path Parameters:
    - active-entitlement-id: The ID of the entitlement.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-active-id {:active-entitlement-id example-active-entitlement-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/entitlements/active_entitlements/{active-entitlement-id}" :path-params {:active-entitlement-id active-entitlement-id} :query-params query-params}))

(defn list-all-active [{:keys [query-params]}]
  "List all active entitlements

  HTTP Method: GET
  Endpoint: /v1/entitlements/active_entitlements

  Query Parameters:
    - customer: The ID of the customer. (required) [type: string]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-active {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/entitlements/active_entitlements" :query-params query-params}))