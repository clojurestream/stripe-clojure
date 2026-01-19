(ns stream.clojure.stripe.api.tax
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-registrations-id
  "Retrieve a registration

  HTTP Method: GET
  Endpoint: /v1/tax/registrations/{registration-id}

  Path Parameters:
    - registration-id (String): The registration-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-registrations-id {:registration-id example-registration-id :query-params {:limit 10}})"
  [{:keys [registration-id query-params]}]
  (stripe-request :get {:endpoint "/v1/tax/registrations/{registration-id}" :path-params {:registration-id registration-id} :query-params query-params}))

(defn update-registrations-id
  "Update a registration

  HTTP Method: POST
  Endpoint: /v1/tax/registrations/{registration-id}

  Path Parameters:
    - registration-id (String): The registration-id parameter. (required)

  Example Usage:
    (update-registrations-id {:registration-id example-registration-id})"
  [{:keys [registration-id body]}]
  (stripe-request :post {:endpoint "/v1/tax/registrations/{registration-id}" :path-params {:registration-id registration-id} :body body}))

(defn create-transactions-create-reversal
  "Create a reversal transaction

  HTTP Method: POST
  Endpoint: /v1/tax/transactions/create_reversal

  Example Usage:
    (create-transactions-create-reversal {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/tax/transactions/create_reversal" :body body}))

(defn retrieve-transactions-transaction
  "Retrieve a transaction

  HTTP Method: GET
  Endpoint: /v1/tax/transactions/{transaction-id}

  Path Parameters:
    - transaction-id (String): The transaction-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-transactions-transaction {:transaction-id example-transaction-id :query-params {:limit 10}})"
  [{:keys [transaction-id query-params]}]
  (stripe-request :get {:endpoint "/v1/tax/transactions/{transaction-id}" :path-params {:transaction-id transaction-id} :query-params query-params}))

(defn create-transactions-create-from-calculation
  "Create a transaction from a calculation

  HTTP Method: POST
  Endpoint: /v1/tax/transactions/create_from_calculation

  Example Usage:
    (create-transactions-create-from-calculation {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/tax/transactions/create_from_calculation" :body body}))

(defn list-all-calculations-calculation-line-items
  "Retrieve a calculation's line items

  HTTP Method: GET
  Endpoint: /v1/tax/calculations/{calculation-id}/line_items

  Path Parameters:
    - calculation-id (String): The calculation-id parameter. (required)

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-calculations-calculation-line-items {:calculation-id example-calculation-id :query-params {:limit 10}})"
  [{:keys [calculation-id query-params]}]
  (stripe-request :get {:endpoint "/v1/tax/calculations/{calculation-id}/line_items" :path-params {:calculation-id calculation-id} :query-params query-params}))

(defn list-all-settings
  "Retrieve settings

  HTTP Method: GET
  Endpoint: /v1/tax/settings

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (list-all-settings {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/tax/settings" :query-params query-params}))

(defn update-settings
  "Update settings

  HTTP Method: POST
  Endpoint: /v1/tax/settings

  Example Usage:
    (update-settings {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/tax/settings" :body body}))

(defn list-all-registrations
  "List registrations

  HTTP Method: GET
  Endpoint: /v1/tax/registrations

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): The status of the Tax Registration.

  Example Usage:
    (list-all-registrations {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/tax/registrations" :query-params query-params}))

(defn create-registrations
  "Create a registration

  HTTP Method: POST
  Endpoint: /v1/tax/registrations

  Example Usage:
    (create-registrations {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/tax/registrations" :body body}))

(defn create-calculations
  "Create a Tax Calculation

  HTTP Method: POST
  Endpoint: /v1/tax/calculations

  Example Usage:
    (create-calculations {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/tax/calculations" :body body}))

(defn list-all-transactions-transaction-line-items
  "Retrieve a transaction's line items

  HTTP Method: GET
  Endpoint: /v1/tax/transactions/{transaction-id}/line_items

  Path Parameters:
    - transaction-id (String): The transaction-id parameter. (required)

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-transactions-transaction-line-items {:transaction-id example-transaction-id :query-params {:limit 10}})"
  [{:keys [transaction-id query-params]}]
  (stripe-request :get {:endpoint "/v1/tax/transactions/{transaction-id}/line_items" :path-params {:transaction-id transaction-id} :query-params query-params}))

(defn retrieve-calculations-calculation
  "Retrieve a Tax Calculation

  HTTP Method: GET
  Endpoint: /v1/tax/calculations/{calculation-id}

  Path Parameters:
    - calculation-id (String): The calculation-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-calculations-calculation {:calculation-id example-calculation-id :query-params {:limit 10}})"
  [{:keys [calculation-id query-params]}]
  (stripe-request :get {:endpoint "/v1/tax/calculations/{calculation-id}" :path-params {:calculation-id calculation-id} :query-params query-params}))

(defn list-all-associations-find
  "Find a Tax Association

  HTTP Method: GET
  Endpoint: /v1/tax/associations/find

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.
    - payment-intent (String): Valid [PaymentIntent](https://docs.stripe.com/api/payment_intents/object) id (required)

  Example Usage:
    (list-all-associations-find {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/tax/associations/find" :query-params query-params}))