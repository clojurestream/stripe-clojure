(ns stream.clojure.stripe.api.charges
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all
  "List all charges

  HTTP Method: GET
  Endpoint: /v1/charges

  Query Parameters:
    - created (Unknown): Only return charges that were created during the given date interval.
    - customer (String): Only return charges for the customer specified by this customer ID.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - payment-intent (String): Only return charges that were created by the PaymentIntent specified by this PaymentIntent ID.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - transfer-group (String): Only return charges for this transfer group, limited to 100.

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/charges" :query-params query-params}))

(defn post
  "No description available.

  HTTP Method: POST
  Endpoint: /v1/charges

  Example Usage:
    (post {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/charges"}))

(defn list-all-charge-refunds
  "List all refunds

  HTTP Method: GET
  Endpoint: /v1/charges/{charge-id}/refunds

  Path Parameters:
    - charge-id (String): The charge-id parameter. (required)

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-charge-refunds {:charge-id example-charge-id :query-params {:limit 10}})"
  [{:keys [charge-id query-params]}]
  (stripe-request :get {:endpoint "/v1/charges/{charge-id}/refunds" :path-params {:charge-id charge-id} :query-params query-params}))

(defn create-charge-refunds
  "Create customer balance refund

  HTTP Method: POST
  Endpoint: /v1/charges/{charge-id}/refunds

  Path Parameters:
    - charge-id (String): The identifier of the charge to refund.

  Example Usage:
    (create-charge-refunds {:charge-id example-charge-id})"
  [{:keys [charge-id]}]
  (stripe-request :post {:endpoint "/v1/charges/{charge-id}/refunds" :path-params {:charge-id charge-id}}))

(defn post-charge-dispute-close
  "No description available.

  HTTP Method: POST
  Endpoint: /v1/charges/{charge-id}/dispute/close

  Path Parameters:
    - charge-id (String): The charge-id parameter. (required)

  Example Usage:
    (post-charge-dispute-close {:charge-id example-charge-id})"
  [{:keys [charge-id]}]
  (stripe-request :post {:endpoint "/v1/charges/{charge-id}/dispute/close" :path-params {:charge-id charge-id}}))

(defn post-charge-capture
  "Capture a payment

  HTTP Method: POST
  Endpoint: /v1/charges/{charge-id}/capture

  Path Parameters:
    - charge-id (String): The charge-id parameter. (required)

  Example Usage:
    (post-charge-capture {:charge-id example-charge-id})"
  [{:keys [charge-id]}]
  (stripe-request :post {:endpoint "/v1/charges/{charge-id}/capture" :path-params {:charge-id charge-id}}))

(defn list-all-search
  "Search charges

  HTTP Method: GET
  Endpoint: /v1/charges/search

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - page (String): A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results.
    - query (String): The search query string. See [search query language](https://stripe.com/docs/search#search-query-language) and the list of supported [query fields for charges](https://stripe.com/docs/search#query-fields-for-charges). (required)

  Example Usage:
    (list-all-search {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/charges/search" :query-params query-params}))

(defn list-all-charge-dispute
  "No description available.

  HTTP Method: GET
  Endpoint: /v1/charges/{charge-id}/dispute

  Path Parameters:
    - charge-id (String): The charge-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (list-all-charge-dispute {:charge-id example-charge-id :query-params {:limit 10}})"
  [{:keys [charge-id query-params]}]
  (stripe-request :get {:endpoint "/v1/charges/{charge-id}/dispute" :path-params {:charge-id charge-id} :query-params query-params}))

(defn post-charge-dispute
  "No description available.

  HTTP Method: POST
  Endpoint: /v1/charges/{charge-id}/dispute

  Path Parameters:
    - charge-id (String): The charge-id parameter. (required)

  Example Usage:
    (post-charge-dispute {:charge-id example-charge-id})"
  [{:keys [charge-id]}]
  (stripe-request :post {:endpoint "/v1/charges/{charge-id}/dispute" :path-params {:charge-id charge-id}}))

(defn retrieve-charge
  "Retrieve a charge

  HTTP Method: GET
  Endpoint: /v1/charges/{charge-id}

  Path Parameters:
    - charge-id (String): The charge-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-charge {:charge-id example-charge-id :query-params {:limit 10}})"
  [{:keys [charge-id query-params]}]
  (stripe-request :get {:endpoint "/v1/charges/{charge-id}" :path-params {:charge-id charge-id} :query-params query-params}))

(defn update-charge
  "Update a charge

  HTTP Method: POST
  Endpoint: /v1/charges/{charge-id}

  Path Parameters:
    - charge-id (String): The charge-id parameter. (required)

  Example Usage:
    (update-charge {:charge-id example-charge-id})"
  [{:keys [charge-id]}]
  (stripe-request :post {:endpoint "/v1/charges/{charge-id}" :path-params {:charge-id charge-id}}))

(defn create-charge-refund
  "Create a refund

  HTTP Method: POST
  Endpoint: /v1/charges/{charge-id}/refund

  Path Parameters:
    - charge-id (String): The identifier of the charge to refund.

  Example Usage:
    (create-charge-refund {:charge-id example-charge-id})"
  [{:keys [charge-id]}]
  (stripe-request :post {:endpoint "/v1/charges/{charge-id}/refund" :path-params {:charge-id charge-id}}))

(defn retrieve-charge-refunds-refund
  "No description available.

  HTTP Method: GET
  Endpoint: /v1/charges/{charge-id}/refunds/{refund-id}

  Path Parameters:
    - charge-id (String): The charge-id parameter. (required)
    - refund-id (String): The refund-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-charge-refunds-refund {:charge-id example-charge-id :refund-id example-refund-id :query-params {:limit 10}})"
  [{:keys [charge-id refund-id query-params]}]
  (stripe-request :get {:endpoint "/v1/charges/{charge-id}/refunds/{refund-id}" :path-params {:charge-id charge-id :refund-id refund-id} :query-params query-params}))

(defn post-charge-refunds-refund
  "No description available.

  HTTP Method: POST
  Endpoint: /v1/charges/{charge-id}/refunds/{refund-id}

  Path Parameters:
    - charge-id (String): The charge-id parameter. (required)
    - refund-id (String): The refund-id parameter. (required)

  Example Usage:
    (post-charge-refunds-refund {:charge-id example-charge-id :refund-id example-refund-id})"
  [{:keys [charge-id refund-id]}]
  (stripe-request :post {:endpoint "/v1/charges/{charge-id}/refunds/{refund-id}" :path-params {:charge-id charge-id :refund-id refund-id}}))