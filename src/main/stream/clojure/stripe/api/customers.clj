(ns stream.clojure.stripe.api.customers
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-customer-cash-balance-transactions-transaction
  "Retrieve a cash balance transaction

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/cash_balance_transactions/{cash-balance-transaction-id}

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)
    - cash-balance-transaction-id (String): The cash-balance-transaction-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-customer-cash-balance-transactions-transaction {:customer-id example-customer-id :cash-balance-transaction-id example-cash-balance-transaction-id :query-params {:limit 10}})"
  [{:keys [customer-id cash-balance-transaction-id query-params]}]
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/cash_balance_transactions/{cash-balance-transaction-id}" :path-params {:customer-id customer-id :cash-balance-transaction-id cash-balance-transaction-id} :query-params query-params}))

(defn list-all-customer-balance-transactions
  "List customer balance transactions

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/balance_transactions

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)

  Query Parameters:
    - created (Unknown): Only return customer balance transactions that were created during the given date interval.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - invoice (String): Only return transactions that are related to the specified invoice.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-customer-balance-transactions {:customer-id example-customer-id :query-params {:limit 10}})"
  [{:keys [customer-id query-params]}]
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/balance_transactions" :path-params {:customer-id customer-id} :query-params query-params}))

(defn create-customer-balance-transactions
  "Create a customer balance transaction

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/balance_transactions

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)

  Example Usage:
    (create-customer-balance-transactions {:customer-id example-customer-id})"
  [{:keys [customer-id]}]
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/balance_transactions" :path-params {:customer-id customer-id}}))

(defn retrieve-customer-payment-methods-payment-method
  "Retrieve a Customer's PaymentMethod

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/payment_methods/{payment-method-id}

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)
    - payment-method-id (String): The payment-method-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-customer-payment-methods-payment-method {:customer-id example-customer-id :payment-method-id example-payment-method-id :query-params {:limit 10}})"
  [{:keys [customer-id payment-method-id query-params]}]
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/payment_methods/{payment-method-id}" :path-params {:customer-id customer-id :payment-method-id payment-method-id} :query-params query-params}))

(defn retrieve-customer-subscriptions-subscription-exposed-id
  "Retrieve a subscription

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/subscriptions/{subscription-id}

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)
    - subscription-id (String): The subscription-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-customer-subscriptions-subscription-exposed-id {:customer-id example-customer-id :subscription-id example-subscription-id :query-params {:limit 10}})"
  [{:keys [customer-id subscription-id query-params]}]
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/subscriptions/{subscription-id}" :path-params {:customer-id customer-id :subscription-id subscription-id} :query-params query-params}))

(defn delete-customer-subscriptions-subscription-exposed-id
  "Cancel a subscription

  HTTP Method: DELETE
  Endpoint: /v1/customers/{customer-id}/subscriptions/{subscription-id}

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)
    - subscription-id (String): The subscription-id parameter. (required)

  Example Usage:
    (delete-customer-subscriptions-subscription-exposed-id {:customer-id example-customer-id :subscription-id example-subscription-id})"
  [{:keys [customer-id subscription-id]}]
  (stripe-request :delete {:endpoint "/v1/customers/{customer-id}/subscriptions/{subscription-id}" :path-params {:customer-id customer-id :subscription-id subscription-id}}))

(defn update-customer-subscriptions-subscription-exposed-id
  "Update a subscription on a customer

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/subscriptions/{subscription-id}

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)
    - subscription-id (String): The subscription-id parameter. (required)

  Example Usage:
    (update-customer-subscriptions-subscription-exposed-id {:customer-id example-customer-id :subscription-id example-subscription-id})"
  [{:keys [customer-id subscription-id]}]
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/subscriptions/{subscription-id}" :path-params {:customer-id customer-id :subscription-id subscription-id}}))

(defn list-all-customer-bank-accounts
  "List all bank accounts

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/bank_accounts

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-customer-bank-accounts {:customer-id example-customer-id :query-params {:limit 10}})"
  [{:keys [customer-id query-params]}]
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/bank_accounts" :path-params {:customer-id customer-id} :query-params query-params}))

(defn create-customer-bank-accounts
  "Create a card

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/bank_accounts

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)

  Example Usage:
    (create-customer-bank-accounts {:customer-id example-customer-id})"
  [{:keys [customer-id]}]
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/bank_accounts" :path-params {:customer-id customer-id}}))

(defn list-all-search
  "Search customers

  HTTP Method: GET
  Endpoint: /v1/customers/search

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - page (String): A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results.
    - query (String): The search query string. See [search query language](https://docs.stripe.com/search#search-query-language) and the list of supported [query fields for customers](https://docs.stripe.com/search#query-fields-for-customers). (required)

  Example Usage:
    (list-all-search {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/customers/search" :query-params query-params}))

(defn list-all-customer-cards
  "List all cards

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/cards

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-customer-cards {:customer-id example-customer-id :query-params {:limit 10}})"
  [{:keys [customer-id query-params]}]
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/cards" :path-params {:customer-id customer-id} :query-params query-params}))

(defn create-customer-cards
  "Create a card

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/cards

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)

  Example Usage:
    (create-customer-cards {:customer-id example-customer-id})"
  [{:keys [customer-id]}]
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/cards" :path-params {:customer-id customer-id}}))

(defn list-all-customer-cash-balance-transactions
  "List cash balance transactions

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/cash_balance_transactions

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-customer-cash-balance-transactions {:customer-id example-customer-id :query-params {:limit 10}})"
  [{:keys [customer-id query-params]}]
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/cash_balance_transactions" :path-params {:customer-id customer-id} :query-params query-params}))

(defn list-all-customer-subscriptions-subscription-exposed-id-discount
  "No description available.

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/subscriptions/{subscription-id}/discount

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)
    - subscription-id (String): The subscription-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (list-all-customer-subscriptions-subscription-exposed-id-discount {:customer-id example-customer-id :subscription-id example-subscription-id :query-params {:limit 10}})"
  [{:keys [customer-id subscription-id query-params]}]
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/subscriptions/{subscription-id}/discount" :path-params {:customer-id customer-id :subscription-id subscription-id} :query-params query-params}))

(defn delete-customer-subscriptions-subscription-exposed-id-discount
  "Delete a customer discount

  HTTP Method: DELETE
  Endpoint: /v1/customers/{customer-id}/subscriptions/{subscription-id}/discount

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)
    - subscription-id (String): The subscription-id parameter. (required)

  Example Usage:
    (delete-customer-subscriptions-subscription-exposed-id-discount {:customer-id example-customer-id :subscription-id example-subscription-id})"
  [{:keys [customer-id subscription-id]}]
  (stripe-request :delete {:endpoint "/v1/customers/{customer-id}/subscriptions/{subscription-id}/discount" :path-params {:customer-id customer-id :subscription-id subscription-id}}))

(defn list-all-customer-tax-ids
  "List all Customer tax IDs

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/tax_ids

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-customer-tax-ids {:customer-id example-customer-id :query-params {:limit 10}})"
  [{:keys [customer-id query-params]}]
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/tax_ids" :path-params {:customer-id customer-id} :query-params query-params}))

(defn create-customer-tax-ids
  "Create a Customer tax ID

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/tax_ids

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)

  Example Usage:
    (create-customer-tax-ids {:customer-id example-customer-id})"
  [{:keys [customer-id]}]
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/tax_ids" :path-params {:customer-id customer-id}}))

(defn list-all-customer-sources
  "No description available.

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/sources

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - object (String): Filter sources according to a particular object type.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-customer-sources {:customer-id example-customer-id :query-params {:limit 10}})"
  [{:keys [customer-id query-params]}]
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/sources" :path-params {:customer-id customer-id} :query-params query-params}))

(defn create-customer-sources
  "Create a card

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/sources

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)

  Example Usage:
    (create-customer-sources {:customer-id example-customer-id})"
  [{:keys [customer-id]}]
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/sources" :path-params {:customer-id customer-id}}))

(defn retrieve-customer-bank-accounts-id
  "Retrieve a bank account

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/bank_accounts/{bank-account-id}

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)
    - bank-account-id (String): The bank-account-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-customer-bank-accounts-id {:customer-id example-customer-id :bank-account-id example-bank-account-id :query-params {:limit 10}})"
  [{:keys [customer-id bank-account-id query-params]}]
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/bank_accounts/{bank-account-id}" :path-params {:customer-id customer-id :bank-account-id bank-account-id} :query-params query-params}))

(defn delete-customer-bank-accounts-id
  "Delete a customer source

  HTTP Method: DELETE
  Endpoint: /v1/customers/{customer-id}/bank_accounts/{bank-account-id}

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)
    - bank-account-id (String): The bank-account-id parameter. (required)

  Example Usage:
    (delete-customer-bank-accounts-id {:customer-id example-customer-id :bank-account-id example-bank-account-id})"
  [{:keys [customer-id bank-account-id]}]
  (stripe-request :delete {:endpoint "/v1/customers/{customer-id}/bank_accounts/{bank-account-id}" :path-params {:customer-id customer-id :bank-account-id bank-account-id}}))

(defn post-customer-bank-accounts-id
  "No description available.

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/bank_accounts/{bank-account-id}

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)
    - bank-account-id (String): The bank-account-id parameter. (required)

  Example Usage:
    (post-customer-bank-accounts-id {:customer-id example-customer-id :bank-account-id example-bank-account-id})"
  [{:keys [customer-id bank-account-id]}]
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/bank_accounts/{bank-account-id}" :path-params {:customer-id customer-id :bank-account-id bank-account-id}}))

(defn post-customer-bank-accounts-id-verify
  "Verify a bank account

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/bank_accounts/{bank-account-id}/verify

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)
    - bank-account-id (String): The bank-account-id parameter. (required)

  Example Usage:
    (post-customer-bank-accounts-id-verify {:customer-id example-customer-id :bank-account-id example-bank-account-id})"
  [{:keys [customer-id bank-account-id]}]
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/bank_accounts/{bank-account-id}/verify" :path-params {:customer-id customer-id :bank-account-id bank-account-id}}))

(defn create-customer-funding-instructions
  "Create or retrieve funding instructions for a customer cash balance

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/funding_instructions

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)

  Example Usage:
    (create-customer-funding-instructions {:customer-id example-customer-id})"
  [{:keys [customer-id]}]
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/funding_instructions" :path-params {:customer-id customer-id}}))

(defn list-all-customer-subscriptions
  "List active subscriptions

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/subscriptions

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-customer-subscriptions {:customer-id example-customer-id :query-params {:limit 10}})"
  [{:keys [customer-id query-params]}]
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/subscriptions" :path-params {:customer-id customer-id} :query-params query-params}))

(defn create-customer-subscriptions
  "Create a subscription

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/subscriptions

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)

  Example Usage:
    (create-customer-subscriptions {:customer-id example-customer-id})"
  [{:keys [customer-id]}]
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/subscriptions" :path-params {:customer-id customer-id}}))

(defn retrieve-customer-sources-id
  "No description available.

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/sources/{source-id}

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)
    - source-id (String): The source-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-customer-sources-id {:customer-id example-customer-id :source-id example-source-id :query-params {:limit 10}})"
  [{:keys [customer-id source-id query-params]}]
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/sources/{source-id}" :path-params {:customer-id customer-id :source-id source-id} :query-params query-params}))

(defn delete-customer-sources-id
  "Delete a customer source

  HTTP Method: DELETE
  Endpoint: /v1/customers/{customer-id}/sources/{source-id}

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)
    - source-id (String): The source-id parameter. (required)

  Example Usage:
    (delete-customer-sources-id {:customer-id example-customer-id :source-id example-source-id})"
  [{:keys [customer-id source-id]}]
  (stripe-request :delete {:endpoint "/v1/customers/{customer-id}/sources/{source-id}" :path-params {:customer-id customer-id :source-id source-id}}))

(defn post-customer-sources-id
  "No description available.

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/sources/{source-id}

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)
    - source-id (String): The source-id parameter. (required)

  Example Usage:
    (post-customer-sources-id {:customer-id example-customer-id :source-id example-source-id})"
  [{:keys [customer-id source-id]}]
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/sources/{source-id}" :path-params {:customer-id customer-id :source-id source-id}}))

(defn retrieve-customer-balance-transactions-transaction
  "Retrieve a customer balance transaction

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/balance_transactions/{balance-transaction-id}

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)
    - balance-transaction-id (String): The balance-transaction-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-customer-balance-transactions-transaction {:customer-id example-customer-id :balance-transaction-id example-balance-transaction-id :query-params {:limit 10}})"
  [{:keys [customer-id balance-transaction-id query-params]}]
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/balance_transactions/{balance-transaction-id}" :path-params {:customer-id customer-id :balance-transaction-id balance-transaction-id} :query-params query-params}))

(defn update-customer-balance-transactions-transaction
  "Update a customer credit balance transaction

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/balance_transactions/{balance-transaction-id}

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)
    - balance-transaction-id (String): The balance-transaction-id parameter. (required)

  Example Usage:
    (update-customer-balance-transactions-transaction {:customer-id example-customer-id :balance-transaction-id example-balance-transaction-id})"
  [{:keys [customer-id balance-transaction-id]}]
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/balance_transactions/{balance-transaction-id}" :path-params {:customer-id customer-id :balance-transaction-id balance-transaction-id}}))

(defn list-all-customer-cash-balance
  "Retrieve a cash balance

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/cash_balance

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (list-all-customer-cash-balance {:customer-id example-customer-id :query-params {:limit 10}})"
  [{:keys [customer-id query-params]}]
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/cash_balance" :path-params {:customer-id customer-id} :query-params query-params}))

(defn update-customer-cash-balance
  "Update a cash balance's settings

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/cash_balance

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)

  Example Usage:
    (update-customer-cash-balance {:customer-id example-customer-id})"
  [{:keys [customer-id]}]
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/cash_balance" :path-params {:customer-id customer-id}}))

(defn retrieve-customer-tax-ids-id
  "Retrieve a Customer tax ID

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/tax_ids/{tax-id-id}

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)
    - tax-id-id (String): The tax-id-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-customer-tax-ids-id {:customer-id example-customer-id :tax-id-id example-tax-id-id :query-params {:limit 10}})"
  [{:keys [customer-id tax-id-id query-params]}]
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/tax_ids/{tax-id-id}" :path-params {:customer-id customer-id :tax-id-id tax-id-id} :query-params query-params}))

(defn delete-customer-tax-ids-id
  "Delete a Customer tax ID

  HTTP Method: DELETE
  Endpoint: /v1/customers/{customer-id}/tax_ids/{tax-id-id}

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)
    - tax-id-id (String): The tax-id-id parameter. (required)

  Example Usage:
    (delete-customer-tax-ids-id {:customer-id example-customer-id :tax-id-id example-tax-id-id})"
  [{:keys [customer-id tax-id-id]}]
  (stripe-request :delete {:endpoint "/v1/customers/{customer-id}/tax_ids/{tax-id-id}" :path-params {:customer-id customer-id :tax-id-id tax-id-id}}))

(defn retrieve-customer
  "Retrieve a customer

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-customer {:customer-id example-customer-id :query-params {:limit 10}})"
  [{:keys [customer-id query-params]}]
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}" :path-params {:customer-id customer-id} :query-params query-params}))

(defn delete-customer
  "Delete a customer

  HTTP Method: DELETE
  Endpoint: /v1/customers/{customer-id}

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)

  Example Usage:
    (delete-customer {:customer-id example-customer-id})"
  [{:keys [customer-id]}]
  (stripe-request :delete {:endpoint "/v1/customers/{customer-id}" :path-params {:customer-id customer-id}}))

(defn update-customer
  "Update a customer

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)

  Example Usage:
    (update-customer {:customer-id example-customer-id})"
  [{:keys [customer-id]}]
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}" :path-params {:customer-id customer-id}}))

(defn retrieve-customer-cards-id
  "Retrieve a card

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/cards/{card-id}

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)
    - card-id (String): The card-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-customer-cards-id {:customer-id example-customer-id :card-id example-card-id :query-params {:limit 10}})"
  [{:keys [customer-id card-id query-params]}]
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/cards/{card-id}" :path-params {:customer-id customer-id :card-id card-id} :query-params query-params}))

(defn delete-customer-cards-id
  "Delete a customer source

  HTTP Method: DELETE
  Endpoint: /v1/customers/{customer-id}/cards/{card-id}

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)
    - card-id (String): The card-id parameter. (required)

  Example Usage:
    (delete-customer-cards-id {:customer-id example-customer-id :card-id example-card-id})"
  [{:keys [customer-id card-id]}]
  (stripe-request :delete {:endpoint "/v1/customers/{customer-id}/cards/{card-id}" :path-params {:customer-id customer-id :card-id card-id}}))

(defn post-customer-cards-id
  "No description available.

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/cards/{card-id}

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)
    - card-id (String): The card-id parameter. (required)

  Example Usage:
    (post-customer-cards-id {:customer-id example-customer-id :card-id example-card-id})"
  [{:keys [customer-id card-id]}]
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/cards/{card-id}" :path-params {:customer-id customer-id :card-id card-id}}))

(defn post-customer-sources-id-verify
  "Verify a bank account

  HTTP Method: POST
  Endpoint: /v1/customers/{customer-id}/sources/{source-id}/verify

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)
    - source-id (String): The source-id parameter. (required)

  Example Usage:
    (post-customer-sources-id-verify {:customer-id example-customer-id :source-id example-source-id})"
  [{:keys [customer-id source-id]}]
  (stripe-request :post {:endpoint "/v1/customers/{customer-id}/sources/{source-id}/verify" :path-params {:customer-id customer-id :source-id source-id}}))

(defn list-all-customer-payment-methods
  "List a Customer's PaymentMethods

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/payment_methods

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)

  Query Parameters:
    - allow-redisplay (String): This field indicates whether this payment method can be shown again to its customer in a checkout flow. Stripe products such as Checkout and Elements use this field to determine whether a payment method can be shown as a saved payment method in a checkout flow.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - type (String): An optional filter on the list, based on the object `type` field. Without the filter, the list includes all current and future payment method types. If your integration expects only one type of payment method in the response, make sure to provide a type value in the request.

  Example Usage:
    (list-all-customer-payment-methods {:customer-id example-customer-id :query-params {:limit 10}})"
  [{:keys [customer-id query-params]}]
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/payment_methods" :path-params {:customer-id customer-id} :query-params query-params}))

(defn list-all
  "List all customers

  HTTP Method: GET
  Endpoint: /v1/customers

  Query Parameters:
    - created (Unknown): Only return customers that were created during the given date interval.
    - email (String): A case-sensitive filter on the list based on the customer's `email` field. The value must be a string.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - test-clock (String): Provides a list of customers that are associated with the specified test clock. The response will not include customers with test clocks if this parameter is not set.

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/customers" :query-params query-params}))

(defn create
  "Create a customer

  HTTP Method: POST
  Endpoint: /v1/customers

  Example Usage:
    (create {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/customers"}))

(defn list-all-customer-discount
  "No description available.

  HTTP Method: GET
  Endpoint: /v1/customers/{customer-id}/discount

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (list-all-customer-discount {:customer-id example-customer-id :query-params {:limit 10}})"
  [{:keys [customer-id query-params]}]
  (stripe-request :get {:endpoint "/v1/customers/{customer-id}/discount" :path-params {:customer-id customer-id} :query-params query-params}))

(defn delete-customer-discount
  "Delete a customer discount

  HTTP Method: DELETE
  Endpoint: /v1/customers/{customer-id}/discount

  Path Parameters:
    - customer-id (String): The customer-id parameter. (required)

  Example Usage:
    (delete-customer-discount {:customer-id example-customer-id})"
  [{:keys [customer-id]}]
  (stripe-request :delete {:endpoint "/v1/customers/{customer-id}/discount" :path-params {:customer-id customer-id}}))