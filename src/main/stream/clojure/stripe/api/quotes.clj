(ns stream.clojure.stripe.api.quotes
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-quotes-quote-accept [quote params]
  """
  Accept a quote

  HTTP Method: POST
  Endpoint: /v1/quotes/{quote}/accept

  Path Parameters:
    - quote: Path parameter.

  """
  (stripe-request :post "/v1/quotes/" quote "/accept" params))

(defn get-quotes-quote-line-items [quote params]
  """
  Retrieve a quote's line items

  HTTP Method: GET
  Endpoint: /v1/quotes/{quote}/line_items

  Path Parameters:
    - quote: Path parameter.

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/quotes/" quote "/line_items" params))

(defn post-quotes-quote-finalize [quote params]
  """
  Finalize a quote

  HTTP Method: POST
  Endpoint: /v1/quotes/{quote}/finalize

  Path Parameters:
    - quote: Path parameter.

  """
  (stripe-request :post "/v1/quotes/" quote "/finalize" params))

(defn get-quotes [params]
  """
  List all quotes

  HTTP Method: GET
  Endpoint: /v1/quotes

  Query Parameters:
    - customer: The ID of the customer whose quotes will be retrieved.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: The status of the quote.
    - test_clock: Provides a list of quotes that are associated with the specified test clock. The response will not include quotes with test clocks if this and the customer parameter is not set.

  """
  (stripe-request :get "/v1/quotes" params))

(defn post-quotes [params]
  """
  Create a quote

  HTTP Method: POST
  Endpoint: /v1/quotes

  """
  (stripe-request :post "/v1/quotes" params))

(defn get-quotes-quote-computed-upfront-line-items [quote params]
  """
  Retrieve a quote's upfront line items

  HTTP Method: GET
  Endpoint: /v1/quotes/{quote}/computed_upfront_line_items

  Path Parameters:
    - quote: Path parameter.

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/quotes/" quote "/computed_upfront_line_items" params))

(defn post-quotes-quote-cancel [quote params]
  """
  Cancel a quote

  HTTP Method: POST
  Endpoint: /v1/quotes/{quote}/cancel

  Path Parameters:
    - quote: Path parameter.

  """
  (stripe-request :post "/v1/quotes/" quote "/cancel" params))

(defn get-quotes-quote [quote params]
  """
  Retrieve a quote

  HTTP Method: GET
  Endpoint: /v1/quotes/{quote}

  Path Parameters:
    - quote: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/quotes/" quote "" params))

(defn post-quotes-quote [quote params]
  """
  Update a quote

  HTTP Method: POST
  Endpoint: /v1/quotes/{quote}

  Path Parameters:
    - quote: Path parameter.

  """
  (stripe-request :post "/v1/quotes/" quote "" params))

(defn get-quotes-quote-pdf [quote params]
  """
  Download quote PDF

  HTTP Method: GET
  Endpoint: /v1/quotes/{quote}/pdf

  Path Parameters:
    - quote: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/quotes/" quote "/pdf" params))