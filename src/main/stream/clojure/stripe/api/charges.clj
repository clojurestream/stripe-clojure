(ns stream.clojure.stripe.api.charges
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all [{:keys [query-params]}]
  "List all charges

  HTTP Method: GET
  Endpoint: /v1/charges

  Query Parameters:
    - created: Only return charges that were created during the given date interval. [type: unknown]
    - customer: Only return charges for the customer specified by this customer ID. [type: string]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - payment-intent: Only return charges that were created by the PaymentIntent specified by this PaymentIntent ID. [type: string]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - transfer-group: Only return charges for this transfer group, limited to 100. [type: string]

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/charges" :query-params query-params}))

(defn post [{:keys []}]
  "No description available.

  HTTP Method: POST
  Endpoint: /v1/charges

  Example Usage:
    (post {})"
  (stripe-request :post {:endpoint "/v1/charges"}))

(defn list-all-charge-refunds [{:keys [charge-id query-params]}]
  "List all refunds

  HTTP Method: GET
  Endpoint: /v1/charges/{charge-id}/refunds

  Path Parameters:
    - charge-id: The charge-id parameter. (required) [type: string]

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-charge-refunds {:charge-id example-charge-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/charges/{charge-id}/refunds" :path-params {:charge-id charge-id} :query-params query-params}))

(defn create-charge-refunds [{:keys [charge-id]}]
  "Create customer balance refund

  HTTP Method: POST
  Endpoint: /v1/charges/{charge-id}/refunds

  Path Parameters:
    - charge-id: The identifier of the charge to refund.

  Example Usage:
    (create-charge-refunds {:charge-id example-charge-id})"
  (stripe-request :post {:endpoint "/v1/charges/{charge-id}/refunds" :path-params {:charge-id charge-id}}))

(defn post-charge-dispute-close [{:keys [charge-id]}]
  "No description available.

  HTTP Method: POST
  Endpoint: /v1/charges/{charge-id}/dispute/close

  Path Parameters:
    - charge-id: The charge-id parameter. (required) [type: string]

  Example Usage:
    (post-charge-dispute-close {:charge-id example-charge-id})"
  (stripe-request :post {:endpoint "/v1/charges/{charge-id}/dispute/close" :path-params {:charge-id charge-id}}))

(defn post-charge-capture [{:keys [charge-id]}]
  "Capture a payment

  HTTP Method: POST
  Endpoint: /v1/charges/{charge-id}/capture

  Path Parameters:
    - charge-id: The charge-id parameter. (required) [type: string]

  Example Usage:
    (post-charge-capture {:charge-id example-charge-id})"
  (stripe-request :post {:endpoint "/v1/charges/{charge-id}/capture" :path-params {:charge-id charge-id}}))

(defn list-all-search [{:keys [query-params]}]
  "Search charges

  HTTP Method: GET
  Endpoint: /v1/charges/search

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - page: A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results. [type: string]
    - query: The search query string. See [search query language](https://stripe.com/docs/search#search-query-language) and the list of supported [query fields for charges](https://stripe.com/docs/search#query-fields-for-charges). (required) [type: string]

  Example Usage:
    (list-all-search {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/charges/search" :query-params query-params}))

(defn list-all-charge-dispute [{:keys [charge-id query-params]}]
  "No description available.

  HTTP Method: GET
  Endpoint: /v1/charges/{charge-id}/dispute

  Path Parameters:
    - charge-id: The charge-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (list-all-charge-dispute {:charge-id example-charge-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/charges/{charge-id}/dispute" :path-params {:charge-id charge-id} :query-params query-params}))

(defn post-charge-dispute [{:keys [charge-id]}]
  "No description available.

  HTTP Method: POST
  Endpoint: /v1/charges/{charge-id}/dispute

  Path Parameters:
    - charge-id: The charge-id parameter. (required) [type: string]

  Example Usage:
    (post-charge-dispute {:charge-id example-charge-id})"
  (stripe-request :post {:endpoint "/v1/charges/{charge-id}/dispute" :path-params {:charge-id charge-id}}))

(defn retrieve-charge [{:keys [charge-id query-params]}]
  "Retrieve a charge

  HTTP Method: GET
  Endpoint: /v1/charges/{charge-id}

  Path Parameters:
    - charge-id: The charge-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-charge {:charge-id example-charge-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/charges/{charge-id}" :path-params {:charge-id charge-id} :query-params query-params}))

(defn update-charge [{:keys [charge-id]}]
  "Update a charge

  HTTP Method: POST
  Endpoint: /v1/charges/{charge-id}

  Path Parameters:
    - charge-id: The charge-id parameter. (required) [type: string]

  Example Usage:
    (update-charge {:charge-id example-charge-id})"
  (stripe-request :post {:endpoint "/v1/charges/{charge-id}" :path-params {:charge-id charge-id}}))

(defn create-charge-refund [{:keys [charge-id]}]
  "Create a refund

  HTTP Method: POST
  Endpoint: /v1/charges/{charge-id}/refund

  Path Parameters:
    - charge-id: The identifier of the charge to refund.

  Example Usage:
    (create-charge-refund {:charge-id example-charge-id})"
  (stripe-request :post {:endpoint "/v1/charges/{charge-id}/refund" :path-params {:charge-id charge-id}}))

(defn retrieve-charge-refunds-refund [{:keys [charge-id refund-id query-params]}]
  "No description available.

  HTTP Method: GET
  Endpoint: /v1/charges/{charge-id}/refunds/{refund-id}

  Path Parameters:
    - charge-id: The charge-id parameter. (required) [type: string]
    - refund-id: The refund-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-charge-refunds-refund {:charge-id example-charge-id :refund-id example-refund-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/charges/{charge-id}/refunds/{refund-id}" :path-params {:charge-id charge-id :refund-id refund-id} :query-params query-params}))

(defn post-charge-refunds-refund [{:keys [charge-id refund-id]}]
  "No description available.

  HTTP Method: POST
  Endpoint: /v1/charges/{charge-id}/refunds/{refund-id}

  Path Parameters:
    - charge-id: The charge-id parameter. (required) [type: string]
    - refund-id: The refund-id parameter. (required) [type: string]

  Example Usage:
    (post-charge-refunds-refund {:charge-id example-charge-id :refund-id example-refund-id})"
  (stripe-request :post {:endpoint "/v1/charges/{charge-id}/refunds/{refund-id}" :path-params {:charge-id charge-id :refund-id refund-id}}))