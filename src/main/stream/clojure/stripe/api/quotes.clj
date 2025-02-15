(ns stream.clojure.stripe.api.quotes
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-quote-accept [{:keys [quote-id]}]
  "Accept a quote

  HTTP Method: POST
  Endpoint: /v1/quotes/{quote-id}/accept

  Path Parameters:
    - quote-id: The quote-id parameter. (required) [type: string]

  Example Usage:
    (post-quote-accept {:quote-id example-quote-id})"
  (stripe-request :post {:endpoint "/v1/quotes/{quote-id}/accept" :path-params {:quote-id quote-id}}))

(defn list-all-quote-line-items [{:keys [quote-id query-params]}]
  "Retrieve a quote's line items

  HTTP Method: GET
  Endpoint: /v1/quotes/{quote-id}/line_items

  Path Parameters:
    - quote-id: The quote-id parameter. (required) [type: string]

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-quote-line-items {:quote-id example-quote-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/quotes/{quote-id}/line_items" :path-params {:quote-id quote-id} :query-params query-params}))

(defn post-quote-finalize [{:keys [quote-id]}]
  "Finalize a quote

  HTTP Method: POST
  Endpoint: /v1/quotes/{quote-id}/finalize

  Path Parameters:
    - quote-id: The quote-id parameter. (required) [type: string]

  Example Usage:
    (post-quote-finalize {:quote-id example-quote-id})"
  (stripe-request :post {:endpoint "/v1/quotes/{quote-id}/finalize" :path-params {:quote-id quote-id}}))

(defn list-all [{:keys [query-params]}]
  "List all quotes

  HTTP Method: GET
  Endpoint: /v1/quotes

  Query Parameters:
    - customer: The ID of the customer whose quotes will be retrieved. [type: string]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - status: The status of the quote. [type: string]
    - test-clock: Provides a list of quotes that are associated with the specified test clock. The response will not include quotes with test clocks if this and the customer parameter is not set. [type: string]

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/quotes" :query-params query-params}))

(defn create [{:keys []}]
  "Create a quote

  HTTP Method: POST
  Endpoint: /v1/quotes

  Example Usage:
    (create {})"
  (stripe-request :post {:endpoint "/v1/quotes"}))

(defn list-all-quote-computed-upfront-line-items [{:keys [quote-id query-params]}]
  "Retrieve a quote's upfront line items

  HTTP Method: GET
  Endpoint: /v1/quotes/{quote-id}/computed_upfront_line_items

  Path Parameters:
    - quote-id: The quote-id parameter. (required) [type: string]

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-quote-computed-upfront-line-items {:quote-id example-quote-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/quotes/{quote-id}/computed_upfront_line_items" :path-params {:quote-id quote-id} :query-params query-params}))

(defn post-quote-cancel [{:keys [quote-id]}]
  "Cancel a quote

  HTTP Method: POST
  Endpoint: /v1/quotes/{quote-id}/cancel

  Path Parameters:
    - quote-id: The quote-id parameter. (required) [type: string]

  Example Usage:
    (post-quote-cancel {:quote-id example-quote-id})"
  (stripe-request :post {:endpoint "/v1/quotes/{quote-id}/cancel" :path-params {:quote-id quote-id}}))

(defn retrieve-quote [{:keys [quote-id query-params]}]
  "Retrieve a quote

  HTTP Method: GET
  Endpoint: /v1/quotes/{quote-id}

  Path Parameters:
    - quote-id: The quote-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-quote {:quote-id example-quote-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/quotes/{quote-id}" :path-params {:quote-id quote-id} :query-params query-params}))

(defn update-quote [{:keys [quote-id]}]
  "Update a quote

  HTTP Method: POST
  Endpoint: /v1/quotes/{quote-id}

  Path Parameters:
    - quote-id: The quote-id parameter. (required) [type: string]

  Example Usage:
    (update-quote {:quote-id example-quote-id})"
  (stripe-request :post {:endpoint "/v1/quotes/{quote-id}" :path-params {:quote-id quote-id}}))

(defn list-all-quote-pdf [{:keys [quote-id query-params]}]
  "Download quote PDF

  HTTP Method: GET
  Endpoint: /v1/quotes/{quote-id}/pdf

  Path Parameters:
    - quote-id: The quote-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (list-all-quote-pdf {:quote-id example-quote-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/quotes/{quote-id}/pdf" :path-params {:quote-id quote-id} :query-params query-params}))