(ns stream.clojure.stripe.api.apps
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-installs-id-uninstall
  "Uninstall an app install

  HTTP Method: POST
  Endpoint: /v1/apps/installs/{install-id}/uninstall

  Path Parameters:
    - install-id (String): The install-id parameter. (required)

  Example Usage:
    (post-installs-id-uninstall {:install-id example-install-id})"
  [{:keys [install-id body]}]
  (stripe-request :post {:endpoint "/v1/apps/installs/{install-id}/uninstall" :path-params {:install-id install-id} :body body}))

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
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/apps/secrets" :body body}))

(defn retrieve-installs-id
  "Retrieve an app install

  HTTP Method: GET
  Endpoint: /v1/apps/installs/{install-id}

  Path Parameters:
    - install-id (String): The install-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-installs-id {:install-id example-install-id :query-params {:limit 10}})"
  [{:keys [install-id query-params]}]
  (stripe-request :get {:endpoint "/v1/apps/installs/{install-id}" :path-params {:install-id install-id} :query-params query-params}))

(defn update-installs-id
  "Update an app install

  HTTP Method: POST
  Endpoint: /v1/apps/installs/{install-id}

  Path Parameters:
    - install-id (String): The install-id parameter. (required)

  Example Usage:
    (update-installs-id {:install-id example-install-id})"
  [{:keys [install-id body]}]
  (stripe-request :post {:endpoint "/v1/apps/installs/{install-id}" :path-params {:install-id install-id} :body body}))

(defn post-secrets-delete
  "Delete a Secret

  HTTP Method: POST
  Endpoint: /v1/apps/secrets/delete

  Example Usage:
    (post-secrets-delete {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/apps/secrets/delete" :body body}))

(defn list-all-installs
  "List all app installs

  HTTP Method: GET
  Endpoint: /v1/apps/installs

  Query Parameters:
    - account (String): Only return installs made by this account. Only useful to app developers and embedding platforms, whose lists span the accounts that installed their app.
    - app (String): Only return installs for the app specified by this app ID.
    - approval-required (Boolean): Only return installs whose installer must authorize pending permissions, content security policy entries, or endpoints.
    - channel (String): Only return installs in the distribution channel specified by this channel name.
    - created (Unknown): Only return app installs that were created during the given date interval.
    - created-by (String): Only return installs created by the embedding platform specified by this account ID.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): Only return installs with the given status.

  Example Usage:
    (list-all-installs {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/apps/installs" :query-params query-params}))

(defn create-installs
  "Create an app install

  HTTP Method: POST
  Endpoint: /v1/apps/installs

  Example Usage:
    (create-installs {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/apps/installs" :body body}))

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