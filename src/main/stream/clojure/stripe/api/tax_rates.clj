(ns stream.clojure.stripe.api.tax-rates
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-tax-rates-tax-rate
  "Retrieve a tax rate

  HTTP Method: GET
  Endpoint: /v1/tax_rates/{tax-rate-id}

  Path Parameters:
    - tax-rate-id (String): The tax-rate-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-tax-rates-tax-rate {:tax-rate-id example-tax-rate-id :query-params {:limit 10}})"
  [{:keys [tax-rate-id query-params]}]
  (stripe-request :get {:endpoint "/v1/tax_rates/{tax-rate-id}" :path-params {:tax-rate-id tax-rate-id} :query-params query-params}))

(defn update-tax-rates-tax-rate
  "Update a tax rate

  HTTP Method: POST
  Endpoint: /v1/tax_rates/{tax-rate-id}

  Path Parameters:
    - tax-rate-id (String): The tax-rate-id parameter. (required)

  Example Usage:
    (update-tax-rates-tax-rate {:tax-rate-id example-tax-rate-id})"
  [{:keys [tax-rate-id body]}]
  (stripe-request :post {:endpoint "/v1/tax_rates/{tax-rate-id}" :path-params {:tax-rate-id tax-rate-id} :body body}))

(defn list-all-tax-rates
  "List all tax rates

  HTTP Method: GET
  Endpoint: /v1/tax_rates

  Query Parameters:
    - active (Boolean): Optional flag to filter by tax rates that are either active or inactive (archived).
    - created (Unknown): Optional range for filtering created date.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - inclusive (Boolean): Optional flag to filter by tax rates that are inclusive (or those that are not inclusive).
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-tax-rates {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/tax_rates" :query-params query-params}))

(defn create-tax-rates
  "Create a tax rate

  HTTP Method: POST
  Endpoint: /v1/tax_rates

  Example Usage:
    (create-tax-rates {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/tax_rates" :body body}))