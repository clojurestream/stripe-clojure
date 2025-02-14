(ns stream.clojure.stripe.api.customers
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-customers [customer transaction params]
  """
  Retrieve a cash balance transaction

  HTTP Method: GET
  Endpoint: /v1/customers/{customer}/cash_balance_transactions/{transaction}

  Path Parameters:
    - customer: Path parameter.
    - transaction: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/customers/" customer "/cash_balance_transactions/" transaction "") params))

(defn retrieve-customers [customer params]
  """
  List customer balance transactions

  HTTP Method: GET
  Endpoint: /v1/customers/{customer}/balance_transactions

  Path Parameters:
    - customer: Path parameter.

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/customers/" customer "/balance_transactions") params))

(defn create-customers [customer params]
  """
  Create a customer balance transaction

  HTTP Method: POST
  Endpoint: /v1/customers/{customer}/balance_transactions

  Path Parameters:
    - customer: Path parameter.

  """
  (stripe-request :post (str "/v1/customers/" customer "/balance_transactions") params))

(defn retrieve-customers [customer payment_method params]
  """
  Retrieve a Customer's PaymentMethod

  HTTP Method: GET
  Endpoint: /v1/customers/{customer}/payment_methods/{payment_method}

  Path Parameters:
    - customer: Path parameter.
    - payment_method: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/customers/" customer "/payment_methods/" payment_method "") params))

(defn delete-customers [customer subscription_exposed_id params]
  """
  Cancel a subscription

  HTTP Method: DELETE
  Endpoint: /v1/customers/{customer}/subscriptions/{subscription_exposed_id}

  Path Parameters:
    - customer: Path parameter.
    - subscription_exposed_id: Path parameter.

  """
  (stripe-request :delete (str "/v1/customers/" customer "/subscriptions/" subscription_exposed_id "") params))

(defn retrieve-customers [customer subscription_exposed_id params]
  """
  Retrieve a subscription

  HTTP Method: GET
  Endpoint: /v1/customers/{customer}/subscriptions/{subscription_exposed_id}

  Path Parameters:
    - customer: Path parameter.
    - subscription_exposed_id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/customers/" customer "/subscriptions/" subscription_exposed_id "") params))

(defn create-customers [customer subscription_exposed_id params]
  """
  Update a subscription on a customer

  HTTP Method: POST
  Endpoint: /v1/customers/{customer}/subscriptions/{subscription_exposed_id}

  Path Parameters:
    - customer: Path parameter.
    - subscription_exposed_id: Path parameter.

  """
  (stripe-request :post (str "/v1/customers/" customer "/subscriptions/" subscription_exposed_id "") params))

(defn retrieve-customers [customer params]
  """
  List all bank accounts

  HTTP Method: GET
  Endpoint: /v1/customers/{customer}/bank_accounts

  Path Parameters:
    - customer: Path parameter.

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/customers/" customer "/bank_accounts") params))

(defn create-customers [customer params]
  """
  Create a card

  HTTP Method: POST
  Endpoint: /v1/customers/{customer}/bank_accounts

  Path Parameters:
    - customer: Path parameter.

  """
  (stripe-request :post (str "/v1/customers/" customer "/bank_accounts") params))

(defn retrieve-customers [params]
  """
  Search customers

  HTTP Method: GET
  Endpoint: /v1/customers/search

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - page: A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results.
    - query: The search query string. See [search query language](https://stripe.com/docs/search#search-query-language) and the list of supported [query fields for customers](https://stripe.com/docs/search#query-fields-for-customers).

  """
  (stripe-request :get (str "/v1/customers/search") params))

(defn retrieve-customers [customer params]
  """
  List all cards

  HTTP Method: GET
  Endpoint: /v1/customers/{customer}/cards

  Path Parameters:
    - customer: Path parameter.

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/customers/" customer "/cards") params))

(defn create-customers [customer params]
  """
  Create a card

  HTTP Method: POST
  Endpoint: /v1/customers/{customer}/cards

  Path Parameters:
    - customer: Path parameter.

  """
  (stripe-request :post (str "/v1/customers/" customer "/cards") params))

(defn retrieve-customers [customer params]
  """
  List cash balance transactions

  HTTP Method: GET
  Endpoint: /v1/customers/{customer}/cash_balance_transactions

  Path Parameters:
    - customer: Path parameter.

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/customers/" customer "/cash_balance_transactions") params))

(defn delete-customers [customer subscription_exposed_id params]
  """
  Delete a customer discount

  HTTP Method: DELETE
  Endpoint: /v1/customers/{customer}/subscriptions/{subscription_exposed_id}/discount

  Path Parameters:
    - customer: Path parameter.
    - subscription_exposed_id: Path parameter.

  """
  (stripe-request :delete (str "/v1/customers/" customer "/subscriptions/" subscription_exposed_id "/discount") params))

(defn retrieve-customers [customer subscription_exposed_id params]
  """
  No description available.

  HTTP Method: GET
  Endpoint: /v1/customers/{customer}/subscriptions/{subscription_exposed_id}/discount

  Path Parameters:
    - customer: Path parameter.
    - subscription_exposed_id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/customers/" customer "/subscriptions/" subscription_exposed_id "/discount") params))

(defn retrieve-customers [customer params]
  """
  List all Customer tax IDs

  HTTP Method: GET
  Endpoint: /v1/customers/{customer}/tax_ids

  Path Parameters:
    - customer: Path parameter.

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/customers/" customer "/tax_ids") params))

(defn create-customers [customer params]
  """
  Create a Customer tax ID

  HTTP Method: POST
  Endpoint: /v1/customers/{customer}/tax_ids

  Path Parameters:
    - customer: Path parameter.

  """
  (stripe-request :post (str "/v1/customers/" customer "/tax_ids") params))

(defn retrieve-customers [customer params]
  """
  No description available.

  HTTP Method: GET
  Endpoint: /v1/customers/{customer}/sources

  Path Parameters:
    - customer: Path parameter.

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - object: Filter sources according to a particular object type.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/customers/" customer "/sources") params))

(defn create-customers [customer params]
  """
  Create a card

  HTTP Method: POST
  Endpoint: /v1/customers/{customer}/sources

  Path Parameters:
    - customer: Path parameter.

  """
  (stripe-request :post (str "/v1/customers/" customer "/sources") params))

(defn delete-customers [customer id params]
  """
  Delete a customer source

  HTTP Method: DELETE
  Endpoint: /v1/customers/{customer}/bank_accounts/{id}

  Path Parameters:
    - customer: Path parameter.
    - id: Path parameter.

  """
  (stripe-request :delete (str "/v1/customers/" customer "/bank_accounts/" id "") params))

(defn retrieve-customers [customer id params]
  """
  Retrieve a bank account

  HTTP Method: GET
  Endpoint: /v1/customers/{customer}/bank_accounts/{id}

  Path Parameters:
    - customer: Path parameter.
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/customers/" customer "/bank_accounts/" id "") params))

(defn create-customers [customer id params]
  """
  No description available.

  HTTP Method: POST
  Endpoint: /v1/customers/{customer}/bank_accounts/{id}

  Path Parameters:
    - customer: Path parameter.
    - id: Path parameter.

  """
  (stripe-request :post (str "/v1/customers/" customer "/bank_accounts/" id "") params))

(defn create-customers [customer id params]
  """
  Verify a bank account

  HTTP Method: POST
  Endpoint: /v1/customers/{customer}/bank_accounts/{id}/verify

  Path Parameters:
    - customer: Path parameter.
    - id: Path parameter.

  """
  (stripe-request :post (str "/v1/customers/" customer "/bank_accounts/" id "/verify") params))

(defn create-customers [customer params]
  """
  Create or retrieve funding instructions for a customer cash balance

  HTTP Method: POST
  Endpoint: /v1/customers/{customer}/funding_instructions

  Path Parameters:
    - customer: Path parameter.

  """
  (stripe-request :post (str "/v1/customers/" customer "/funding_instructions") params))

(defn retrieve-customers [customer params]
  """
  List active subscriptions

  HTTP Method: GET
  Endpoint: /v1/customers/{customer}/subscriptions

  Path Parameters:
    - customer: Path parameter.

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/customers/" customer "/subscriptions") params))

(defn create-customers [customer params]
  """
  Create a subscription

  HTTP Method: POST
  Endpoint: /v1/customers/{customer}/subscriptions

  Path Parameters:
    - customer: Path parameter.

  """
  (stripe-request :post (str "/v1/customers/" customer "/subscriptions") params))

(defn delete-customers [customer id params]
  """
  Delete a customer source

  HTTP Method: DELETE
  Endpoint: /v1/customers/{customer}/sources/{id}

  Path Parameters:
    - customer: Path parameter.
    - id: Path parameter.

  """
  (stripe-request :delete (str "/v1/customers/" customer "/sources/" id "") params))

(defn retrieve-customers [customer id params]
  """
  No description available.

  HTTP Method: GET
  Endpoint: /v1/customers/{customer}/sources/{id}

  Path Parameters:
    - customer: Path parameter.
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/customers/" customer "/sources/" id "") params))

(defn create-customers [customer id params]
  """
  No description available.

  HTTP Method: POST
  Endpoint: /v1/customers/{customer}/sources/{id}

  Path Parameters:
    - customer: Path parameter.
    - id: Path parameter.

  """
  (stripe-request :post (str "/v1/customers/" customer "/sources/" id "") params))

(defn retrieve-customers [customer transaction params]
  """
  Retrieve a customer balance transaction

  HTTP Method: GET
  Endpoint: /v1/customers/{customer}/balance_transactions/{transaction}

  Path Parameters:
    - customer: Path parameter.
    - transaction: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/customers/" customer "/balance_transactions/" transaction "") params))

(defn create-customers [customer transaction params]
  """
  Update a customer credit balance transaction

  HTTP Method: POST
  Endpoint: /v1/customers/{customer}/balance_transactions/{transaction}

  Path Parameters:
    - customer: Path parameter.
    - transaction: Path parameter.

  """
  (stripe-request :post (str "/v1/customers/" customer "/balance_transactions/" transaction "") params))

(defn retrieve-customers [customer params]
  """
  Retrieve a cash balance

  HTTP Method: GET
  Endpoint: /v1/customers/{customer}/cash_balance

  Path Parameters:
    - customer: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/customers/" customer "/cash_balance") params))

(defn create-customers [customer params]
  """
  Update a cash balance's settings

  HTTP Method: POST
  Endpoint: /v1/customers/{customer}/cash_balance

  Path Parameters:
    - customer: Path parameter.

  """
  (stripe-request :post (str "/v1/customers/" customer "/cash_balance") params))

(defn delete-customers [customer id params]
  """
  Delete a Customer tax ID

  HTTP Method: DELETE
  Endpoint: /v1/customers/{customer}/tax_ids/{id}

  Path Parameters:
    - customer: Path parameter.
    - id: Path parameter.

  """
  (stripe-request :delete (str "/v1/customers/" customer "/tax_ids/" id "") params))

(defn retrieve-customers [customer id params]
  """
  Retrieve a Customer tax ID

  HTTP Method: GET
  Endpoint: /v1/customers/{customer}/tax_ids/{id}

  Path Parameters:
    - customer: Path parameter.
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/customers/" customer "/tax_ids/" id "") params))

(defn delete-customers [customer params]
  """
  Delete a customer

  HTTP Method: DELETE
  Endpoint: /v1/customers/{customer}

  Path Parameters:
    - customer: Path parameter.

  """
  (stripe-request :delete (str "/v1/customers/" customer "") params))

(defn retrieve-customers [customer params]
  """
  Retrieve a customer

  HTTP Method: GET
  Endpoint: /v1/customers/{customer}

  Path Parameters:
    - customer: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/customers/" customer "") params))

(defn create-customers [customer params]
  """
  Update a customer

  HTTP Method: POST
  Endpoint: /v1/customers/{customer}

  Path Parameters:
    - customer: Path parameter.

  """
  (stripe-request :post (str "/v1/customers/" customer "") params))

(defn delete-customers [customer id params]
  """
  Delete a customer source

  HTTP Method: DELETE
  Endpoint: /v1/customers/{customer}/cards/{id}

  Path Parameters:
    - customer: Path parameter.
    - id: Path parameter.

  """
  (stripe-request :delete (str "/v1/customers/" customer "/cards/" id "") params))

(defn retrieve-customers [customer id params]
  """
  Retrieve a card

  HTTP Method: GET
  Endpoint: /v1/customers/{customer}/cards/{id}

  Path Parameters:
    - customer: Path parameter.
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/customers/" customer "/cards/" id "") params))

(defn create-customers [customer id params]
  """
  No description available.

  HTTP Method: POST
  Endpoint: /v1/customers/{customer}/cards/{id}

  Path Parameters:
    - customer: Path parameter.
    - id: Path parameter.

  """
  (stripe-request :post (str "/v1/customers/" customer "/cards/" id "") params))

(defn create-customers [customer id params]
  """
  Verify a bank account

  HTTP Method: POST
  Endpoint: /v1/customers/{customer}/sources/{id}/verify

  Path Parameters:
    - customer: Path parameter.
    - id: Path parameter.

  """
  (stripe-request :post (str "/v1/customers/" customer "/sources/" id "/verify") params))

(defn retrieve-customers [customer params]
  """
  List a Customer's PaymentMethods

  HTTP Method: GET
  Endpoint: /v1/customers/{customer}/payment_methods

  Path Parameters:
    - customer: Path parameter.

  Query Parameters:
    - allow_redisplay: This field indicates whether this payment method can be shown again to its customer in a checkout flow. Stripe products such as Checkout and Elements use this field to determine whether a payment method can be shown as a saved payment method in a checkout flow. The field defaults to `unspecified`.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - type: An optional filter on the list, based on the object `type` field. Without the filter, the list includes all current and future payment method types. If your integration expects only one type of payment method in the response, make sure to provide a type value in the request.

  """
  (stripe-request :get (str "/v1/customers/" customer "/payment_methods") params))

(defn retrieve-customers [params]
  """
  List all customers

  HTTP Method: GET
  Endpoint: /v1/customers

  Query Parameters:
    - created: Only return customers that were created during the given date interval.
    - email: A case-sensitive filter on the list based on the customer's `email` field. The value must be a string.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - test_clock: Provides a list of customers that are associated with the specified test clock. The response will not include customers with test clocks if this parameter is not set.

  """
  (stripe-request :get (str "/v1/customers") params))

(defn create-customers [params]
  """
  Create a customer

  HTTP Method: POST
  Endpoint: /v1/customers

  """
  (stripe-request :post (str "/v1/customers") params))

(defn delete-customers [customer params]
  """
  Delete a customer discount

  HTTP Method: DELETE
  Endpoint: /v1/customers/{customer}/discount

  Path Parameters:
    - customer: Path parameter.

  """
  (stripe-request :delete (str "/v1/customers/" customer "/discount") params))

(defn retrieve-customers [customer params]
  """
  No description available.

  HTTP Method: GET
  Endpoint: /v1/customers/{customer}/discount

  Path Parameters:
    - customer: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/customers/" customer "/discount") params))