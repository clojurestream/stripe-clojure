(ns stream.clojure.stripe.api.apple-pay
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn delete-apple-pay-domains-domain [{:keys [domain-id]}]
  "No description available.

  HTTP Method: DELETE
  Endpoint: /v1/apple_pay/domains/{domain-id}

  Path Parameters:
    - domain-id: The domain-id parameter. (required) [type: string]

  Example Usage:
    (delete-apple-pay-domains-domain {:domain-id example-domain-id})"
  (stripe-request :delete {:endpoint "/v1/apple_pay/domains/{domain-id}" :path-params {:domain-id domain-id}}))

(defn retrieve-apple-pay-domains-domain [{:keys [domain-id query-params]}]
  "No description available.

  HTTP Method: GET
  Endpoint: /v1/apple_pay/domains/{domain-id}

  Path Parameters:
    - domain-id: The domain-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-apple-pay-domains-domain {:domain-id example-domain-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/apple_pay/domains/{domain-id}" :path-params {:domain-id domain-id} :query-params query-params}))

(defn list-all-apple-pay-domains [{:keys [query-params]}]
  "No description available.

  HTTP Method: GET
  Endpoint: /v1/apple_pay/domains

  Query Parameters:
    - domain-name: The domain-name parameter. [type: string]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-apple-pay-domains {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/apple_pay/domains" :query-params query-params}))

(defn post-apple-pay-domains [{:keys []}]
  "No description available.

  HTTP Method: POST
  Endpoint: /v1/apple_pay/domains

  Example Usage:
    (post-apple-pay-domains {})"
  (stripe-request :post {:endpoint "/v1/apple_pay/domains"}))