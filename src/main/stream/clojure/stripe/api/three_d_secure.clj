(ns stream.clojure.stripe.api.three-d-secure
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-three-d-secure-authentications
  "List all 3D Secure Authentications

  HTTP Method: GET
  Endpoint: /v1/three_d_secure/authentications

  Query Parameters:
    - created (Unknown): A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp or a dictionary with a number of different query options.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): Only return 3D Secure Authentications for specified status.

  Example Usage:
    (list-all-three-d-secure-authentications {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/three_d_secure/authentications" :query-params query-params}))

(defn create-three-d-secure-authentications
  "Create a 3DS Authentication

  HTTP Method: POST
  Endpoint: /v1/three_d_secure/authentications

  Example Usage:
    (create-three-d-secure-authentications {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/three_d_secure/authentications" :body body}))

(defn retrieve-three-d-secure-authentications-authentication
  "Retrieve a 3DS Authentication

  HTTP Method: GET
  Endpoint: /v1/three_d_secure/authentications/{authentication-id}

  Path Parameters:
    - authentication-id (String): The authentication-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-three-d-secure-authentications-authentication {:authentication-id example-authentication-id :query-params {:limit 10}})"
  [{:keys [authentication-id query-params]}]
  (stripe-request :get {:endpoint "/v1/three_d_secure/authentications/{authentication-id}" :path-params {:authentication-id authentication-id} :query-params query-params}))

(defn post-three-d-secure-authentications-authentication-cancel
  "Cancel a 3DS Authentication

  HTTP Method: POST
  Endpoint: /v1/three_d_secure/authentications/{authentication-id}/cancel

  Path Parameters:
    - authentication-id (String): The authentication-id parameter. (required)

  Example Usage:
    (post-three-d-secure-authentications-authentication-cancel {:authentication-id example-authentication-id})"
  [{:keys [authentication-id body]}]
  (stripe-request :post {:endpoint "/v1/three_d_secure/authentications/{authentication-id}/cancel" :path-params {:authentication-id authentication-id} :body body}))

(defn post-three-d-secure-authentications-authentication-submit
  "Submit a 3DS Authentication

  HTTP Method: POST
  Endpoint: /v1/three_d_secure/authentications/{authentication-id}/submit

  Path Parameters:
    - authentication-id (String): The authentication-id parameter. (required)

  Example Usage:
    (post-three-d-secure-authentications-authentication-submit {:authentication-id example-authentication-id})"
  [{:keys [authentication-id body]}]
  (stripe-request :post {:endpoint "/v1/three_d_secure/authentications/{authentication-id}/submit" :path-params {:authentication-id authentication-id} :body body}))