(ns stream.clojure.stripe.api.apps
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-secrets [{:keys [query-params]}]
  "List secrets

  HTTP Method: GET
  Endpoint: /v1/apps/secrets

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - scope: Specifies the scoping of the secret. Requests originating from UI extensions can only access account-scoped secrets or secrets scoped to their own user. (required) [type: object]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-secrets {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/apps/secrets" :query-params query-params}))

(defn post-secrets [{:keys []}]
  "Set a Secret

  HTTP Method: POST
  Endpoint: /v1/apps/secrets

  Example Usage:
    (post-secrets {})"
  (stripe-request :post {:endpoint "/v1/apps/secrets"}))

(defn post-secrets-delete [{:keys []}]
  "Delete a Secret

  HTTP Method: POST
  Endpoint: /v1/apps/secrets/delete

  Example Usage:
    (post-secrets-delete {})"
  (stripe-request :post {:endpoint "/v1/apps/secrets/delete"}))

(defn list-all-secrets-find [{:keys [query-params]}]
  "Find a Secret

  HTTP Method: GET
  Endpoint: /v1/apps/secrets/find

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - name: A name for the secret that's unique within the scope. (required) [type: string]
    - scope: Specifies the scoping of the secret. Requests originating from UI extensions can only access account-scoped secrets or secrets scoped to their own user. (required) [type: object]

  Example Usage:
    (list-all-secrets-find {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/apps/secrets/find" :query-params query-params}))