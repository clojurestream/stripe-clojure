(ns stream.clojure.stripe.api.apps
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-secrets
  "List secrets

  HTTP Method: GET
  Endpoint: /v1/apps/secrets

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - scope (Object): Specifies the scoping of the secret. Requests originating from UI extensions can only access account-scoped secrets or secrets scoped to their own user. (required)
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-secrets {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/apps/secrets" :query-params query-params}))

(defn post-secrets
  "Set a Secret

  HTTP Method: POST
  Endpoint: /v1/apps/secrets

  Example Usage:
    (post-secrets {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/apps/secrets"}))

(defn post-secrets-delete
  "Delete a Secret

  HTTP Method: POST
  Endpoint: /v1/apps/secrets/delete

  Example Usage:
    (post-secrets-delete {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/apps/secrets/delete"}))

(defn list-all-secrets-find
  "Find a Secret

  HTTP Method: GET
  Endpoint: /v1/apps/secrets/find

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.
    - name (String): A name for the secret that's unique within the scope. (required)
    - scope (Object): Specifies the scoping of the secret. Requests originating from UI extensions can only access account-scoped secrets or secrets scoped to their own user. (required)

  Example Usage:
    (list-all-secrets-find {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/apps/secrets/find" :query-params query-params}))