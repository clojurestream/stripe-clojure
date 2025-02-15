(ns stream.clojure.stripe.api.tax
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-registrations-id [{:keys [registration-id query-params]}]
  "Retrieve a registration

  HTTP Method: GET
  Endpoint: /v1/tax/registrations/{registration-id}

  Path Parameters:
    - registration-id: The registration-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-registrations-id {:registration-id example-registration-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/tax/registrations/{registration-id}" :path-params {:registration-id registration-id} :query-params query-params}))

(defn update-registrations-id [{:keys [registration-id]}]
  "Update a registration

  HTTP Method: POST
  Endpoint: /v1/tax/registrations/{registration-id}

  Path Parameters:
    - registration-id: The registration-id parameter. (required) [type: string]

  Example Usage:
    (update-registrations-id {:registration-id example-registration-id})"
  (stripe-request :post {:endpoint "/v1/tax/registrations/{registration-id}" :path-params {:registration-id registration-id}}))

(defn create-transactions-create-reversal [{:keys []}]
  "Create a reversal transaction

  HTTP Method: POST
  Endpoint: /v1/tax/transactions/create_reversal

  Example Usage:
    (create-transactions-create-reversal {})"
  (stripe-request :post {:endpoint "/v1/tax/transactions/create_reversal"}))

(defn retrieve-transactions-transaction [{:keys [transaction-id query-params]}]
  "Retrieve a transaction

  HTTP Method: GET
  Endpoint: /v1/tax/transactions/{transaction-id}

  Path Parameters:
    - transaction-id: The transaction-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-transactions-transaction {:transaction-id example-transaction-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/tax/transactions/{transaction-id}" :path-params {:transaction-id transaction-id} :query-params query-params}))

(defn create-transactions-create-from-calculation [{:keys []}]
  "Create a transaction from a calculation

  HTTP Method: POST
  Endpoint: /v1/tax/transactions/create_from_calculation

  Example Usage:
    (create-transactions-create-from-calculation {})"
  (stripe-request :post {:endpoint "/v1/tax/transactions/create_from_calculation"}))

(defn list-all-calculations-calculation-line-items [{:keys [calculation-id query-params]}]
  "Retrieve a calculation's line items

  HTTP Method: GET
  Endpoint: /v1/tax/calculations/{calculation-id}/line_items

  Path Parameters:
    - calculation-id: The calculation-id parameter. (required) [type: string]

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-calculations-calculation-line-items {:calculation-id example-calculation-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/tax/calculations/{calculation-id}/line_items" :path-params {:calculation-id calculation-id} :query-params query-params}))

(defn list-all-settings [{:keys [query-params]}]
  "Retrieve settings

  HTTP Method: GET
  Endpoint: /v1/tax/settings

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (list-all-settings {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/tax/settings" :query-params query-params}))

(defn update-settings [{:keys []}]
  "Update settings

  HTTP Method: POST
  Endpoint: /v1/tax/settings

  Example Usage:
    (update-settings {})"
  (stripe-request :post {:endpoint "/v1/tax/settings"}))

(defn list-all-registrations [{:keys [query-params]}]
  "List registrations

  HTTP Method: GET
  Endpoint: /v1/tax/registrations

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - status: The status of the Tax Registration. [type: string]

  Example Usage:
    (list-all-registrations {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/tax/registrations" :query-params query-params}))

(defn create-registrations [{:keys []}]
  "Create a registration

  HTTP Method: POST
  Endpoint: /v1/tax/registrations

  Example Usage:
    (create-registrations {})"
  (stripe-request :post {:endpoint "/v1/tax/registrations"}))

(defn create-calculations [{:keys []}]
  "Create a Tax Calculation

  HTTP Method: POST
  Endpoint: /v1/tax/calculations

  Example Usage:
    (create-calculations {})"
  (stripe-request :post {:endpoint "/v1/tax/calculations"}))

(defn list-all-transactions-transaction-line-items [{:keys [transaction-id query-params]}]
  "Retrieve a transaction's line items

  HTTP Method: GET
  Endpoint: /v1/tax/transactions/{transaction-id}/line_items

  Path Parameters:
    - transaction-id: The transaction-id parameter. (required) [type: string]

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-transactions-transaction-line-items {:transaction-id example-transaction-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/tax/transactions/{transaction-id}/line_items" :path-params {:transaction-id transaction-id} :query-params query-params}))

(defn retrieve-calculations-calculation [{:keys [calculation-id query-params]}]
  "Retrieve a Tax Calculation

  HTTP Method: GET
  Endpoint: /v1/tax/calculations/{calculation-id}

  Path Parameters:
    - calculation-id: The calculation-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-calculations-calculation {:calculation-id example-calculation-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/tax/calculations/{calculation-id}" :path-params {:calculation-id calculation-id} :query-params query-params}))