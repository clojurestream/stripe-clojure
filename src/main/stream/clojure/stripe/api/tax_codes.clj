(ns stream.clojure.stripe.api.tax-codes
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-tax-codes
  "List all tax codes

  HTTP Method: GET
  Endpoint: /v1/tax_codes

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-tax-codes {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/tax_codes" :query-params query-params}))

(defn retrieve-tax-codes-id
  "Retrieve a tax code

  HTTP Method: GET
  Endpoint: /v1/tax_codes/{tax-code-id}

  Path Parameters:
    - tax-code-id (String): The tax-code-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-tax-codes-id {:tax-code-id example-tax-code-id :query-params {:limit 10}})"
  [{:keys [tax-code-id query-params]}]
  (stripe-request :get {:endpoint "/v1/tax_codes/{tax-code-id}" :path-params {:tax-code-id tax-code-id} :query-params query-params}))