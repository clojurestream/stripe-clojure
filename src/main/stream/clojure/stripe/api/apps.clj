(ns stream.clojure.stripe.api.apps
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn get-apps-secrets [params]
  """
  List secrets

  HTTP Method: GET
  Endpoint: /v1/apps/secrets

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - scope: Specifies the scoping of the secret. Requests originating from UI extensions can only access account-scoped secrets or secrets scoped to their own user.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/apps/secrets" params))

(defn post-apps-secrets [params]
  """
  Set a Secret

  HTTP Method: POST
  Endpoint: /v1/apps/secrets

  """
  (stripe-request :post "/v1/apps/secrets" params))

(defn post-apps-secrets-delete [params]
  """
  Delete a Secret

  HTTP Method: POST
  Endpoint: /v1/apps/secrets/delete

  """
  (stripe-request :post "/v1/apps/secrets/delete" params))

(defn get-apps-secrets-find [params]
  """
  Find a Secret

  HTTP Method: GET
  Endpoint: /v1/apps/secrets/find

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.
    - name: A name for the secret that's unique within the scope.
    - scope: Specifies the scoping of the secret. Requests originating from UI extensions can only access account-scoped secrets or secrets scoped to their own user.

  """
  (stripe-request :get "/v1/apps/secrets/find" params))