(ns stream.clojure.stripe.api.payment-intents
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn get-payment-intents-intent [intent params]
  """
  Retrieve a PaymentIntent

  HTTP Method: GET
  Endpoint: /v1/payment_intents/{intent}

  Path Parameters:
    - intent: Path parameter.

  Query Parameters:
    - client_secret: The client secret of the PaymentIntent. We require it if you use a publishable key to retrieve the source.
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/payment_intents/" intent "" params))

(defn post-payment-intents-intent [intent params]
  """
  Update a PaymentIntent

  HTTP Method: POST
  Endpoint: /v1/payment_intents/{intent}

  Path Parameters:
    - intent: Path parameter.

  """
  (stripe-request :post "/v1/payment_intents/" intent "" params))

(defn post-payment-intents-intent-increment-authorization [intent params]
  """
  Increment an authorization

  HTTP Method: POST
  Endpoint: /v1/payment_intents/{intent}/increment_authorization

  Path Parameters:
    - intent: Path parameter.

  """
  (stripe-request :post "/v1/payment_intents/" intent "/increment_authorization" params))

(defn post-payment-intents-intent-verify-microdeposits [intent params]
  """
  Verify microdeposits on a PaymentIntent

  HTTP Method: POST
  Endpoint: /v1/payment_intents/{intent}/verify_microdeposits

  Path Parameters:
    - intent: Path parameter.

  """
  (stripe-request :post "/v1/payment_intents/" intent "/verify_microdeposits" params))

(defn post-payment-intents-intent-capture [intent params]
  """
  Capture a PaymentIntent

  HTTP Method: POST
  Endpoint: /v1/payment_intents/{intent}/capture

  Path Parameters:
    - intent: Path parameter.

  """
  (stripe-request :post "/v1/payment_intents/" intent "/capture" params))

(defn post-payment-intents-intent-cancel [intent params]
  """
  Cancel a PaymentIntent

  HTTP Method: POST
  Endpoint: /v1/payment_intents/{intent}/cancel

  Path Parameters:
    - intent: Path parameter.

  """
  (stripe-request :post "/v1/payment_intents/" intent "/cancel" params))

(defn get-payment-intents-search [params]
  """
  Search PaymentIntents

  HTTP Method: GET
  Endpoint: /v1/payment_intents/search

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - page: A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results.
    - query: The search query string. See [search query language](https://stripe.com/docs/search#search-query-language) and the list of supported [query fields for payment intents](https://stripe.com/docs/search#query-fields-for-payment-intents).

  """
  (stripe-request :get "/v1/payment_intents/search" params))

(defn post-payment-intents-intent-confirm [intent params]
  """
  Confirm a PaymentIntent

  HTTP Method: POST
  Endpoint: /v1/payment_intents/{intent}/confirm

  Path Parameters:
    - intent: Path parameter.

  """
  (stripe-request :post "/v1/payment_intents/" intent "/confirm" params))

(defn post-payment-intents-intent-apply-customer-balance [intent params]
  """
  Reconcile a customer_balance PaymentIntent

  HTTP Method: POST
  Endpoint: /v1/payment_intents/{intent}/apply_customer_balance

  Path Parameters:
    - intent: Path parameter.

  """
  (stripe-request :post "/v1/payment_intents/" intent "/apply_customer_balance" params))

(defn get-payment-intents [params]
  """
  List all PaymentIntents

  HTTP Method: GET
  Endpoint: /v1/payment_intents

  Query Parameters:
    - created: A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp or a dictionary with a number of different query options.
    - customer: Only return PaymentIntents for the customer that this customer ID specifies.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/payment_intents" params))

(defn post-payment-intents [params]
  """
  Create a PaymentIntent

  HTTP Method: POST
  Endpoint: /v1/payment_intents

  """
  (stripe-request :post "/v1/payment_intents" params))