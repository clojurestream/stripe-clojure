(ns stream.clojure.stripe.api.entitlements
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn get-entitlements-features [params]
  """
  List all features

  HTTP Method: GET
  Endpoint: /v1/entitlements/features

  Query Parameters:
    - archived: If set, filter results to only include features with the given archive status.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - lookup_key: If set, filter results to only include features with the given lookup_key.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/entitlements/features" params))

(defn post-entitlements-features [params]
  """
  Create a feature

  HTTP Method: POST
  Endpoint: /v1/entitlements/features

  """
  (stripe-request :post "/v1/entitlements/features" params))

(defn get-entitlements-features-id [id params]
  """
  Retrieve a feature

  HTTP Method: GET
  Endpoint: /v1/entitlements/features/{id}

  Path Parameters:
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/entitlements/features/" id "" params))

(defn post-entitlements-features-id [id params]
  """
  Updates a feature

  HTTP Method: POST
  Endpoint: /v1/entitlements/features/{id}

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :post "/v1/entitlements/features/" id "" params))

(defn get-entitlements-active-entitlements-id [id params]
  """
  Retrieve an active entitlement

  HTTP Method: GET
  Endpoint: /v1/entitlements/active_entitlements/{id}

  Path Parameters:
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/entitlements/active_entitlements/" id "" params))

(defn get-entitlements-active-entitlements [params]
  """
  List all active entitlements

  HTTP Method: GET
  Endpoint: /v1/entitlements/active_entitlements

  Query Parameters:
    - customer: The ID of the customer.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/entitlements/active_entitlements" params))