(ns stream.clojure.stripe.api.charges
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn get-charges [params]
  """
  List all charges

  HTTP Method: GET
  Endpoint: /v1/charges

  Query Parameters:
    - created: Only return charges that were created during the given date interval.
    - customer: Only return charges for the customer specified by this customer ID.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - payment_intent: Only return charges that were created by the PaymentIntent specified by this PaymentIntent ID.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - transfer_group: Only return charges for this transfer group, limited to 100.

  """
  (stripe-request :get "/v1/charges" params))

(defn post-charges [params]
  """
  No description available.

  HTTP Method: POST
  Endpoint: /v1/charges

  """
  (stripe-request :post "/v1/charges" params))

(defn get-charges-charge-refunds [charge params]
  """
  List all refunds

  HTTP Method: GET
  Endpoint: /v1/charges/{charge}/refunds

  Path Parameters:
    - charge: Path parameter.

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/charges/" charge "/refunds" params))

(defn post-charges-charge-refunds [charge params]
  """
  Create customer balance refund

  HTTP Method: POST
  Endpoint: /v1/charges/{charge}/refunds

  Path Parameters:
    - charge: Path parameter.

  """
  (stripe-request :post "/v1/charges/" charge "/refunds" params))

(defn post-charges-charge-dispute-close [charge params]
  """
  No description available.

  HTTP Method: POST
  Endpoint: /v1/charges/{charge}/dispute/close

  Path Parameters:
    - charge: Path parameter.

  """
  (stripe-request :post "/v1/charges/" charge "/dispute/close" params))

(defn post-charges-charge-capture [charge params]
  """
  Capture a payment

  HTTP Method: POST
  Endpoint: /v1/charges/{charge}/capture

  Path Parameters:
    - charge: Path parameter.

  """
  (stripe-request :post "/v1/charges/" charge "/capture" params))

(defn get-charges-search [params]
  """
  Search charges

  HTTP Method: GET
  Endpoint: /v1/charges/search

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - page: A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results.
    - query: The search query string. See [search query language](https://stripe.com/docs/search#search-query-language) and the list of supported [query fields for charges](https://stripe.com/docs/search#query-fields-for-charges).

  """
  (stripe-request :get "/v1/charges/search" params))

(defn get-charges-charge-dispute [charge params]
  """
  No description available.

  HTTP Method: GET
  Endpoint: /v1/charges/{charge}/dispute

  Path Parameters:
    - charge: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/charges/" charge "/dispute" params))

(defn post-charges-charge-dispute [charge params]
  """
  No description available.

  HTTP Method: POST
  Endpoint: /v1/charges/{charge}/dispute

  Path Parameters:
    - charge: Path parameter.

  """
  (stripe-request :post "/v1/charges/" charge "/dispute" params))

(defn get-charges-charge [charge params]
  """
  Retrieve a charge

  HTTP Method: GET
  Endpoint: /v1/charges/{charge}

  Path Parameters:
    - charge: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/charges/" charge "" params))

(defn post-charges-charge [charge params]
  """
  Update a charge

  HTTP Method: POST
  Endpoint: /v1/charges/{charge}

  Path Parameters:
    - charge: Path parameter.

  """
  (stripe-request :post "/v1/charges/" charge "" params))

(defn post-charges-charge-refund [charge params]
  """
  Create a refund

  HTTP Method: POST
  Endpoint: /v1/charges/{charge}/refund

  Path Parameters:
    - charge: Path parameter.

  """
  (stripe-request :post "/v1/charges/" charge "/refund" params))

(defn get-charges-charge-refunds-refund [charge refund params]
  """
  No description available.

  HTTP Method: GET
  Endpoint: /v1/charges/{charge}/refunds/{refund}

  Path Parameters:
    - charge: Path parameter.
    - refund: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/charges/" charge "/refunds/" refund "" params))

(defn post-charges-charge-refunds-refund [charge refund params]
  """
  No description available.

  HTTP Method: POST
  Endpoint: /v1/charges/{charge}/refunds/{refund}

  Path Parameters:
    - charge: Path parameter.
    - refund: Path parameter.

  """
  (stripe-request :post "/v1/charges/" charge "/refunds/" refund "" params))