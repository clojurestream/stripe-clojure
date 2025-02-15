(ns stream.clojure.stripe.api.customers
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-customer-cash-balance-transactions-transaction [{:keys [customer-id cash-balance-transaction-id query-params]}]
  "Retrieve a cash balance transaction

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/cash_balance_transactions/{cash-balance-transaction-id}

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]
    - cash-balance-transaction-id: The cash-balance-transaction-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-customer-cash-balance-transactions-transaction {:customer-id example-customer-id :cash-balance-transaction-id example-cash-balance-transaction-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/cash_balance_transactions/{cash-balance-transaction-id}" :path-params {:customer-id customer-id :cash-balance-transaction-id cash-balance-transaction-id} :query-params query-params}))

(defn list-all-customer-balance-transactions [{:keys [customer-id query-params]}]
  "List customer balance transactions

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/balance_transactions

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-customer-balance-transactions {:customer-id example-customer-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/balance_transactions" :path-params {:customer-id customer-id} :query-params query-params}))

(defn create-customer-balance-transactions [{:keys [customer-id]}]
  "Create a customer balance transaction

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/balance_transactions

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]

  Example Usage:
    (create-customer-balance-transactions {:customer-id example-customer-id})"
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/balance_transactions" :path-params {:customer-id customer-id}}))

(defn retrieve-customer-payment-methods-payment-method [{:keys [customer-id payment-method-id query-params]}]
  "Retrieve a Customer's PaymentMethod

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/payment_methods/{payment-method-id}

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]
    - payment-method-id: The payment-method-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-customer-payment-methods-payment-method {:customer-id example-customer-id :payment-method-id example-payment-method-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/payment_methods/{payment-method-id}" :path-params {:customer-id customer-id :payment-method-id payment-method-id} :query-params query-params}))

(defn delete-customer-subscriptions-subscription-exposed-id [{:keys [customer-id subscription-id]}]
  "Cancel a subscription

  HTTP Method: DELETE
  Endpoint: /v1/customers/{customer-id}/subscriptions/{subscription-id}

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]
    - subscription-id: The subscription-id parameter. (required) [type: string]

  Example Usage:
    (delete-customer-subscriptions-subscription-exposed-id {:customer-id example-customer-id :subscription-id example-subscription-id})"
  (stripe-request :delete {:endpoint "/v1/customers/{customer-id}/subscriptions/{subscription-id}" :path-params {:customer-id customer-id :subscription-id subscription-id}}))

(defn retrieve-customer-subscriptions-subscription-exposed-id [{:keys [customer-id subscription-id query-params]}]
  "Retrieve a subscription

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/subscriptions/{subscription-id}

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]
    - subscription-id: The subscription-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-customer-subscriptions-subscription-exposed-id {:customer-id example-customer-id :subscription-id example-subscription-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/subscriptions/{subscription-id}" :path-params {:customer-id customer-id :subscription-id subscription-id} :query-params query-params}))

(defn update-customer-subscriptions-subscription-exposed-id [{:keys [customer-id subscription-id]}]
  "Update a subscription on a customer

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/subscriptions/{subscription-id}

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]
    - subscription-id: The subscription-id parameter. (required) [type: string]

  Example Usage:
    (update-customer-subscriptions-subscription-exposed-id {:customer-id example-customer-id :subscription-id example-subscription-id})"
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/subscriptions/{subscription-id}" :path-params {:customer-id customer-id :subscription-id subscription-id}}))

(defn list-all-customer-bank-accounts [{:keys [customer-id query-params]}]
  "List all bank accounts

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/bank_accounts

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-customer-bank-accounts {:customer-id example-customer-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/bank_accounts" :path-params {:customer-id customer-id} :query-params query-params}))

(defn create-customer-bank-accounts [{:keys [customer-id]}]
  "Create a card

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/bank_accounts

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]

  Example Usage:
    (create-customer-bank-accounts {:customer-id example-customer-id})"
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/bank_accounts" :path-params {:customer-id customer-id}}))

(defn list-all-search [{:keys [query-params]}]
  "Search customers

  HTTP Method: GET
  Endpoint: /v1/customers/search

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - page: A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results. [type: string]
    - query: The search query string. See [search query language](https://stripe.com/docs/search#search-query-language) and the list of supported [query fields for customers](https://stripe.com/docs/search#query-fields-for-customers). (required) [type: string]

  Example Usage:
    (list-all-search {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/customers/search" :query-params query-params}))

(defn list-all-customer-cards [{:keys [customer-id query-params]}]
  "List all cards

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/cards

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-customer-cards {:customer-id example-customer-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/cards" :path-params {:customer-id customer-id} :query-params query-params}))

(defn create-customer-cards [{:keys [customer-id]}]
  "Create a card

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/cards

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]

  Example Usage:
    (create-customer-cards {:customer-id example-customer-id})"
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/cards" :path-params {:customer-id customer-id}}))

(defn list-all-customer-cash-balance-transactions [{:keys [customer-id query-params]}]
  "List cash balance transactions

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/cash_balance_transactions

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-customer-cash-balance-transactions {:customer-id example-customer-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/cash_balance_transactions" :path-params {:customer-id customer-id} :query-params query-params}))

(defn delete-customer-subscriptions-subscription-exposed-id-discount [{:keys [customer-id subscription-id]}]
  "Delete a customer discount

  HTTP Method: DELETE
  Endpoint: /v1/customers/{customer-id}/subscriptions/{subscription-id}/discount

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]
    - subscription-id: The subscription-id parameter. (required) [type: string]

  Example Usage:
    (delete-customer-subscriptions-subscription-exposed-id-discount {:customer-id example-customer-id :subscription-id example-subscription-id})"
  (stripe-request :delete {:endpoint "/v1/customers/{customer-id}/subscriptions/{subscription-id}/discount" :path-params {:customer-id customer-id :subscription-id subscription-id}}))

(defn list-all-customer-subscriptions-subscription-exposed-id-discount [{:keys [customer-id subscription-id query-params]}]
  "No description available.

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/subscriptions/{subscription-id}/discount

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]
    - subscription-id: The subscription-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (list-all-customer-subscriptions-subscription-exposed-id-discount {:customer-id example-customer-id :subscription-id example-subscription-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/subscriptions/{subscription-id}/discount" :path-params {:customer-id customer-id :subscription-id subscription-id} :query-params query-params}))

(defn list-all-customer-tax-ids [{:keys [customer-id query-params]}]
  "List all Customer tax IDs

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/tax_ids

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-customer-tax-ids {:customer-id example-customer-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/tax_ids" :path-params {:customer-id customer-id} :query-params query-params}))

(defn create-customer-tax-ids [{:keys [customer-id]}]
  "Create a Customer tax ID

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/tax_ids

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]

  Example Usage:
    (create-customer-tax-ids {:customer-id example-customer-id})"
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/tax_ids" :path-params {:customer-id customer-id}}))

(defn list-all-customer-sources [{:keys [customer-id query-params]}]
  "No description available.

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/sources

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - object: Filter sources according to a particular object type. [type: string]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-customer-sources {:customer-id example-customer-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/sources" :path-params {:customer-id customer-id} :query-params query-params}))

(defn create-customer-sources [{:keys [customer-id]}]
  "Create a card

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/sources

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]

  Example Usage:
    (create-customer-sources {:customer-id example-customer-id})"
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/sources" :path-params {:customer-id customer-id}}))

(defn delete-customer-bank-accounts-id [{:keys [customer-id bank-account-id]}]
  "Delete a customer source

  HTTP Method: DELETE
  Endpoint: /v1/customers/{customer-id}/bank_accounts/{bank-account-id}

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]
    - bank-account-id: The bank-account-id parameter. (required) [type: string]

  Example Usage:
    (delete-customer-bank-accounts-id {:customer-id example-customer-id :bank-account-id example-bank-account-id})"
  (stripe-request :delete {:endpoint "/v1/customers/{customer-id}/bank_accounts/{bank-account-id}" :path-params {:customer-id customer-id :bank-account-id bank-account-id}}))

(defn retrieve-customer-bank-accounts-id [{:keys [customer-id bank-account-id query-params]}]
  "Retrieve a bank account

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/bank_accounts/{bank-account-id}

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]
    - bank-account-id: The bank-account-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-customer-bank-accounts-id {:customer-id example-customer-id :bank-account-id example-bank-account-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/bank_accounts/{bank-account-id}" :path-params {:customer-id customer-id :bank-account-id bank-account-id} :query-params query-params}))

(defn post-customer-bank-accounts-id [{:keys [customer-id bank-account-id]}]
  "No description available.

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/bank_accounts/{bank-account-id}

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]
    - bank-account-id: The bank-account-id parameter. (required) [type: string]

  Example Usage:
    (post-customer-bank-accounts-id {:customer-id example-customer-id :bank-account-id example-bank-account-id})"
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/bank_accounts/{bank-account-id}" :path-params {:customer-id customer-id :bank-account-id bank-account-id}}))

(defn post-customer-bank-accounts-id-verify [{:keys [customer-id bank-account-id]}]
  "Verify a bank account

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/bank_accounts/{bank-account-id}/verify

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]
    - bank-account-id: The bank-account-id parameter. (required) [type: string]

  Example Usage:
    (post-customer-bank-accounts-id-verify {:customer-id example-customer-id :bank-account-id example-bank-account-id})"
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/bank_accounts/{bank-account-id}/verify" :path-params {:customer-id customer-id :bank-account-id bank-account-id}}))

(defn create-customer-funding-instructions [{:keys [customer-id]}]
  "Create or retrieve funding instructions for a customer cash balance

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/funding_instructions

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]

  Example Usage:
    (create-customer-funding-instructions {:customer-id example-customer-id})"
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/funding_instructions" :path-params {:customer-id customer-id}}))

(defn list-all-customer-subscriptions [{:keys [customer-id query-params]}]
  "List active subscriptions

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/subscriptions

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-customer-subscriptions {:customer-id example-customer-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/subscriptions" :path-params {:customer-id customer-id} :query-params query-params}))

(defn create-customer-subscriptions [{:keys [customer-id]}]
  "Create a subscription

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/subscriptions

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]

  Example Usage:
    (create-customer-subscriptions {:customer-id example-customer-id})"
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/subscriptions" :path-params {:customer-id customer-id}}))

(defn delete-customer-sources-id [{:keys [customer-id source-id]}]
  "Delete a customer source

  HTTP Method: DELETE
  Endpoint: /v1/customers/{customer-id}/sources/{source-id}

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]
    - source-id: The source-id parameter. (required) [type: string]

  Example Usage:
    (delete-customer-sources-id {:customer-id example-customer-id :source-id example-source-id})"
  (stripe-request :delete {:endpoint "/v1/customers/{customer-id}/sources/{source-id}" :path-params {:customer-id customer-id :source-id source-id}}))

(defn retrieve-customer-sources-id [{:keys [customer-id source-id query-params]}]
  "No description available.

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/sources/{source-id}

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]
    - source-id: The source-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-customer-sources-id {:customer-id example-customer-id :source-id example-source-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/sources/{source-id}" :path-params {:customer-id customer-id :source-id source-id} :query-params query-params}))

(defn post-customer-sources-id [{:keys [customer-id source-id]}]
  "No description available.

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/sources/{source-id}

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]
    - source-id: The source-id parameter. (required) [type: string]

  Example Usage:
    (post-customer-sources-id {:customer-id example-customer-id :source-id example-source-id})"
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/sources/{source-id}" :path-params {:customer-id customer-id :source-id source-id}}))

(defn retrieve-customer-balance-transactions-transaction [{:keys [customer-id balance-transaction-id query-params]}]
  "Retrieve a customer balance transaction

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/balance_transactions/{balance-transaction-id}

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]
    - balance-transaction-id: The balance-transaction-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-customer-balance-transactions-transaction {:customer-id example-customer-id :balance-transaction-id example-balance-transaction-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/balance_transactions/{balance-transaction-id}" :path-params {:customer-id customer-id :balance-transaction-id balance-transaction-id} :query-params query-params}))

(defn update-customer-balance-transactions-transaction [{:keys [customer-id balance-transaction-id]}]
  "Update a customer credit balance transaction

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/balance_transactions/{balance-transaction-id}

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]
    - balance-transaction-id: The balance-transaction-id parameter. (required) [type: string]

  Example Usage:
    (update-customer-balance-transactions-transaction {:customer-id example-customer-id :balance-transaction-id example-balance-transaction-id})"
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/balance_transactions/{balance-transaction-id}" :path-params {:customer-id customer-id :balance-transaction-id balance-transaction-id}}))

(defn list-all-customer-cash-balance [{:keys [customer-id query-params]}]
  "Retrieve a cash balance

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/cash_balance

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (list-all-customer-cash-balance {:customer-id example-customer-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/cash_balance" :path-params {:customer-id customer-id} :query-params query-params}))

(defn update-customer-cash-balance [{:keys [customer-id]}]
  "Update a cash balance's settings

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/cash_balance

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]

  Example Usage:
    (update-customer-cash-balance {:customer-id example-customer-id})"
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/cash_balance" :path-params {:customer-id customer-id}}))

(defn delete-customer-tax-ids-id [{:keys [customer-id tax-id-id]}]
  "Delete a Customer tax ID

  HTTP Method: DELETE
  Endpoint: /v1/customers/{customer-id}/tax_ids/{tax-id-id}

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]
    - tax-id-id: The tax-id-id parameter. (required) [type: string]

  Example Usage:
    (delete-customer-tax-ids-id {:customer-id example-customer-id :tax-id-id example-tax-id-id})"
  (stripe-request :delete {:endpoint "/v1/customers/{customer-id}/tax_ids/{tax-id-id}" :path-params {:customer-id customer-id :tax-id-id tax-id-id}}))

(defn retrieve-customer-tax-ids-id [{:keys [customer-id tax-id-id query-params]}]
  "Retrieve a Customer tax ID

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/tax_ids/{tax-id-id}

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]
    - tax-id-id: The tax-id-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-customer-tax-ids-id {:customer-id example-customer-id :tax-id-id example-tax-id-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/tax_ids/{tax-id-id}" :path-params {:customer-id customer-id :tax-id-id tax-id-id} :query-params query-params}))

(defn delete-customer [{:keys [customer-id]}]
  "Delete a customer

  HTTP Method: DELETE
  Endpoint: /v1/customers/{customer-id}

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]

  Example Usage:
    (delete-customer {:customer-id example-customer-id})"
  (stripe-request :delete {:endpoint "/v1/customers/{customer-id}" :path-params {:customer-id customer-id}}))

(defn retrieve-customer [{:keys [customer-id query-params]}]
  "Retrieve a customer

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-customer {:customer-id example-customer-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}" :path-params {:customer-id customer-id} :query-params query-params}))

(defn update-customer [{:keys [customer-id]}]
  "Update a customer

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]

  Example Usage:
    (update-customer {:customer-id example-customer-id})"
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}" :path-params {:customer-id customer-id}}))

(defn delete-customer-cards-id [{:keys [customer-id card-id]}]
  "Delete a customer source

  HTTP Method: DELETE
  Endpoint: /v1/customers/{customer-id}/cards/{card-id}

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]
    - card-id: The card-id parameter. (required) [type: string]

  Example Usage:
    (delete-customer-cards-id {:customer-id example-customer-id :card-id example-card-id})"
  (stripe-request :delete {:endpoint "/v1/customers/{customer-id}/cards/{card-id}" :path-params {:customer-id customer-id :card-id card-id}}))

(defn retrieve-customer-cards-id [{:keys [customer-id card-id query-params]}]
  "Retrieve a card

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/cards/{card-id}

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]
    - card-id: The card-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-customer-cards-id {:customer-id example-customer-id :card-id example-card-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/cards/{card-id}" :path-params {:customer-id customer-id :card-id card-id} :query-params query-params}))

(defn post-customer-cards-id [{:keys [customer-id card-id]}]
  "No description available.

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/cards/{card-id}

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]
    - card-id: The card-id parameter. (required) [type: string]

  Example Usage:
    (post-customer-cards-id {:customer-id example-customer-id :card-id example-card-id})"
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/cards/{card-id}" :path-params {:customer-id customer-id :card-id card-id}}))

(defn post-customer-sources-id-verify [{:keys [customer-id source-id]}]
  "Verify a bank account

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/sources/{source-id}/verify

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]
    - source-id: The source-id parameter. (required) [type: string]

  Example Usage:
    (post-customer-sources-id-verify {:customer-id example-customer-id :source-id example-source-id})"
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/sources/{source-id}/verify" :path-params {:customer-id customer-id :source-id source-id}}))

(defn list-all-customer-payment-methods [{:keys [customer-id query-params]}]
  "List a Customer's PaymentMethods

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/payment_methods

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]

  Query Parameters:
    - allow-redisplay: This field indicates whether this payment method can be shown again to its customer in a checkout flow. Stripe products such as Checkout and Elements use this field to determine whether a payment method can be shown as a saved payment method in a checkout flow. The field defaults to `unspecified`. [type: string]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - type: An optional filter on the list, based on the object `type` field. Without the filter, the list includes all current and future payment method types. If your integration expects only one type of payment method in the response, make sure to provide a type value in the request. [type: string]

  Example Usage:
    (list-all-customer-payment-methods {:customer-id example-customer-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/payment_methods" :path-params {:customer-id customer-id} :query-params query-params}))

(defn list-all [{:keys [query-params]}]
  "List all customers

  HTTP Method: GET
  Endpoint: /v1/customers

  Query Parameters:
    - created: Only return customers that were created during the given date interval. [type: unknown]
    - email: A case-sensitive filter on the list based on the customer's `email` field. The value must be a string. [type: string]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - test-clock: Provides a list of customers that are associated with the specified test clock. The response will not include customers with test clocks if this parameter is not set. [type: string]

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/customers" :query-params query-params}))

(defn create [{:keys []}]
  "Create a customer

  HTTP Method: POST
  Endpoint: /v1/customers

  Example Usage:
    (create {})"
  (stripe-request :post {:endpoint "/v1/customers"}))

(defn delete-customer-discount [{:keys [customer-id]}]
  "Delete a customer discount

  HTTP Method: DELETE
  Endpoint: /v1/customers/{customer-id}/discount

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]

  Example Usage:
    (delete-customer-discount {:customer-id example-customer-id})"
  (stripe-request :delete {:endpoint "/v1/customers/{customer-id}/discount" :path-params {:customer-id customer-id}}))

(defn list-all-customer-discount [{:keys [customer-id query-params]}]
  "No description available.

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/discount

  Path Parameters:
    - customer-id: The customer-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (list-all-customer-discount {:customer-id example-customer-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/discount" :path-params {:customer-id customer-id} :query-params query-params}))