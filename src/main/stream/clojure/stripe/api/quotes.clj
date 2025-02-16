(ns stream.clojure.stripe.api.quotes
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-quote-accept
  "Accept a quote

  HTTP Method: POST
  Endpoint: /v1/quotes/{quote-id}/accept

  Path Parameters:
    - quote-id (String): The quote-id parameter. (required)

  Example Usage:
    (post-quote-accept {:quote-id example-quote-id})"
  [{:keys [quote-id]}]
  (stripe-request :post {:endpoint "/v1/quotes/{quote-id}/accept" :path-params {:quote-id quote-id}}))

(defn list-all-quote-line-items
  "Retrieve a quote's line items

  HTTP Method: GET
  Endpoint: /v1/quotes/{quote-id}/line_items

  Path Parameters:
    - quote-id (String): The quote-id parameter. (required)

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-quote-line-items {:quote-id example-quote-id :query-params {:limit 10}})"
  [{:keys [quote-id query-params]}]
  (stripe-request :get {:endpoint "/v1/quotes/{quote-id}/line_items" :path-params {:quote-id quote-id} :query-params query-params}))

(defn post-quote-finalize
  "Finalize a quote

  HTTP Method: POST
  Endpoint: /v1/quotes/{quote-id}/finalize

  Path Parameters:
    - quote-id (String): The quote-id parameter. (required)

  Example Usage:
    (post-quote-finalize {:quote-id example-quote-id})"
  [{:keys [quote-id]}]
  (stripe-request :post {:endpoint "/v1/quotes/{quote-id}/finalize" :path-params {:quote-id quote-id}}))

(defn list-all
  "List all quotes

  HTTP Method: GET
  Endpoint: /v1/quotes

  Query Parameters:
    - customer (String): The ID of the customer whose quotes will be retrieved.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): The status of the quote.
    - test-clock (String): Provides a list of quotes that are associated with the specified test clock. The response will not include quotes with test clocks if this and the customer parameter is not set.

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/quotes" :query-params query-params}))

(defn create
  "Create a quote

  HTTP Method: POST
  Endpoint: /v1/quotes

  Example Usage:
    (create {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/quotes"}))

(defn list-all-quote-computed-upfront-line-items
  "Retrieve a quote's upfront line items

  HTTP Method: GET
  Endpoint: /v1/quotes/{quote-id}/computed_upfront_line_items

  Path Parameters:
    - quote-id (String): The quote-id parameter. (required)

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-quote-computed-upfront-line-items {:quote-id example-quote-id :query-params {:limit 10}})"
  [{:keys [quote-id query-params]}]
  (stripe-request :get {:endpoint "/v1/quotes/{quote-id}/computed_upfront_line_items" :path-params {:quote-id quote-id} :query-params query-params}))

(defn post-quote-cancel
  "Cancel a quote

  HTTP Method: POST
  Endpoint: /v1/quotes/{quote-id}/cancel

  Path Parameters:
    - quote-id (String): The quote-id parameter. (required)

  Example Usage:
    (post-quote-cancel {:quote-id example-quote-id})"
  [{:keys [quote-id]}]
  (stripe-request :post {:endpoint "/v1/quotes/{quote-id}/cancel" :path-params {:quote-id quote-id}}))

(defn retrieve-quote
  "Retrieve a quote

  HTTP Method: GET
  Endpoint: /v1/quotes/{quote-id}

  Path Parameters:
    - quote-id (String): The quote-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-quote {:quote-id example-quote-id :query-params {:limit 10}})"
  [{:keys [quote-id query-params]}]
  (stripe-request :get {:endpoint "/v1/quotes/{quote-id}" :path-params {:quote-id quote-id} :query-params query-params}))

(defn update-quote
  "Update a quote

  HTTP Method: POST
  Endpoint: /v1/quotes/{quote-id}

  Path Parameters:
    - quote-id (String): The quote-id parameter. (required)

  Example Usage:
    (update-quote {:quote-id example-quote-id})"
  [{:keys [quote-id]}]
  (stripe-request :post {:endpoint "/v1/quotes/{quote-id}" :path-params {:quote-id quote-id}}))

(defn list-all-quote-pdf
  "Download quote PDF

  HTTP Method: GET
  Endpoint: /v1/quotes/{quote-id}/pdf

  Path Parameters:
    - quote-id (String): The quote-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (list-all-quote-pdf {:quote-id example-quote-id :query-params {:limit 10}})"
  [{:keys [quote-id query-params]}]
  (stripe-request :get {:endpoint "/v1/quotes/{quote-id}/pdf" :path-params {:quote-id quote-id} :query-params query-params}))