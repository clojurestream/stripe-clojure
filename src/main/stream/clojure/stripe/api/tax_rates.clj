(ns stream.clojure.stripe.api.tax-rates
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-tax-rates-tax-rate [{:keys [tax-rate-id query-params]}]
  "Retrieve a tax rate

  HTTP Method: GET
  Endpoint: /v1/tax_rates/{tax-rate-id}

  Path Parameters:
    - tax-rate-id: The tax-rate-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-tax-rates-tax-rate {:tax-rate-id example-tax-rate-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/tax_rates/{tax-rate-id}" :path-params {:tax-rate-id tax-rate-id} :query-params query-params}))

(defn update-tax-rates-tax-rate [{:keys [tax-rate-id]}]
  "Update a tax rate

  HTTP Method: POST
  Endpoint: /v1/tax_rates/{tax-rate-id}

  Path Parameters:
    - tax-rate-id: The tax-rate-id parameter. (required) [type: string]

  Example Usage:
    (update-tax-rates-tax-rate {:tax-rate-id example-tax-rate-id})"
  (stripe-request :post {:endpoint "/v1/tax_rates/{tax-rate-id}" :path-params {:tax-rate-id tax-rate-id}}))

(defn list-all-tax-rates [{:keys [query-params]}]
  "List all tax rates

  HTTP Method: GET
  Endpoint: /v1/tax_rates

  Query Parameters:
    - active: Optional flag to filter by tax rates that are either active or inactive (archived). [type: boolean]
    - created: Optional range for filtering created date. [type: unknown]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - inclusive: Optional flag to filter by tax rates that are inclusive (or those that are not inclusive). [type: boolean]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-tax-rates {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/tax_rates" :query-params query-params}))

(defn create-tax-rates [{:keys []}]
  "Create a tax rate

  HTTP Method: POST
  Endpoint: /v1/tax_rates

  Example Usage:
    (create-tax-rates {})"
  (stripe-request :post {:endpoint "/v1/tax_rates"}))