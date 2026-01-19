(ns stream.clojure.stripe.api.entitlements
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-features
  "List all features

  HTTP Method: GET
  Endpoint: /v1/entitlements/features

  Query Parameters:
    - archived (Boolean): If set, filter results to only include features with the given archive status.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - lookup-key (String): If set, filter results to only include features with the given lookup_key.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-features {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/entitlements/features" :query-params query-params}))

(defn create-features
  "Create a feature

  HTTP Method: POST
  Endpoint: /v1/entitlements/features

  Example Usage:
    (create-features {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/entitlements/features" :body body}))

(defn retrieve-features-id
  "Retrieve a feature

  HTTP Method: GET
  Endpoint: /v1/entitlements/features/{feature-id}

  Path Parameters:
    - feature-id (String): The ID of the feature.

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-features-id {:feature-id example-feature-id :query-params {:limit 10}})"
  [{:keys [feature-id query-params]}]
  (stripe-request :get {:endpoint "/v1/entitlements/features/{feature-id}" :path-params {:feature-id feature-id} :query-params query-params}))

(defn post-features-id
  "Updates a feature

  HTTP Method: POST
  Endpoint: /v1/entitlements/features/{feature-id}

  Path Parameters:
    - feature-id (String): The feature-id parameter. (required)

  Example Usage:
    (post-features-id {:feature-id example-feature-id})"
  [{:keys [feature-id body]}]
  (stripe-request :post {:endpoint "/v1/entitlements/features/{feature-id}" :path-params {:feature-id feature-id} :body body}))

(defn retrieve-active-id
  "Retrieve an active entitlement

  HTTP Method: GET
  Endpoint: /v1/entitlements/active_entitlements/{active-entitlement-id}

  Path Parameters:
    - active-entitlement-id (String): The ID of the entitlement.

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-active-id {:active-entitlement-id example-active-entitlement-id :query-params {:limit 10}})"
  [{:keys [active-entitlement-id query-params]}]
  (stripe-request :get {:endpoint "/v1/entitlements/active_entitlements/{active-entitlement-id}" :path-params {:active-entitlement-id active-entitlement-id} :query-params query-params}))

(defn list-all-active
  "List all active entitlements

  HTTP Method: GET
  Endpoint: /v1/entitlements/active_entitlements

  Query Parameters:
    - customer (String): The ID of the customer. (required)
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-active {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/entitlements/active_entitlements" :query-params query-params}))