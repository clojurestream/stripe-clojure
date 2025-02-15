(ns stream.clojure.stripe.api.tax-codes
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-tax-codes [{:keys [query-params]}]
  "List all tax codes

  HTTP Method: GET
  Endpoint: /v1/tax_codes

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-tax-codes {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/tax_codes" :query-params query-params}))

(defn retrieve-tax-codes-id [{:keys [tax-code-id query-params]}]
  "Retrieve a tax code

  HTTP Method: GET
  Endpoint: /v1/tax_codes/{tax-code-id}

  Path Parameters:
    - tax-code-id: The tax-code-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-tax-codes-id {:tax-code-id example-tax-code-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/tax_codes/{tax-code-id}" :path-params {:tax-code-id tax-code-id} :query-params query-params}))