(ns stream.clojure.stripe.api.transfers
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-id-reversals [{:keys [transfer-id query-params]}]
  "List all reversals

  HTTP Method: GET
  Endpoint: /v1/transfers/{transfer-id}/reversals

  Path Parameters:
    - transfer-id: The transfer-id parameter. (required) [type: string]

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-id-reversals {:transfer-id example-transfer-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/transfers/{transfer-id}/reversals" :path-params {:transfer-id transfer-id} :query-params query-params}))

(defn create-id-reversals [{:keys [transfer-id]}]
  "Create a transfer reversal

  HTTP Method: POST
  Endpoint: /v1/transfers/{transfer-id}/reversals

  Path Parameters:
    - transfer-id: The transfer-id parameter. (required) [type: string]

  Example Usage:
    (create-id-reversals {:transfer-id example-transfer-id})"
  (stripe-request :post {:endpoint "/v1/transfers/{transfer-id}/reversals" :path-params {:transfer-id transfer-id}}))

(defn retrieve-transfer-reversals-id [{:keys [transfer-id reversal-id query-params]}]
  "Retrieve a reversal

  HTTP Method: GET
  Endpoint: /v1/transfers/{transfer-id}/reversals/{reversal-id}

  Path Parameters:
    - transfer-id: The transfer-id parameter. (required) [type: string]
    - reversal-id: The reversal-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-transfer-reversals-id {:transfer-id example-transfer-id :reversal-id example-reversal-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/transfers/{transfer-id}/reversals/{reversal-id}" :path-params {:transfer-id transfer-id :reversal-id reversal-id} :query-params query-params}))

(defn update-transfer-reversals-id [{:keys [transfer-id reversal-id]}]
  "Update a reversal

  HTTP Method: POST
  Endpoint: /v1/transfers/{transfer-id}/reversals/{reversal-id}

  Path Parameters:
    - transfer-id: The transfer-id parameter. (required) [type: string]
    - reversal-id: The reversal-id parameter. (required) [type: string]

  Example Usage:
    (update-transfer-reversals-id {:transfer-id example-transfer-id :reversal-id example-reversal-id})"
  (stripe-request :post {:endpoint "/v1/transfers/{transfer-id}/reversals/{reversal-id}" :path-params {:transfer-id transfer-id :reversal-id reversal-id}}))

(defn list-all [{:keys [query-params]}]
  "List all transfers

  HTTP Method: GET
  Endpoint: /v1/transfers

  Query Parameters:
    - created: Only return transfers that were created during the given date interval. [type: unknown]
    - destination: Only return transfers for the destination specified by this account ID. [type: string]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - transfer-group: Only return transfers with the specified transfer group. [type: string]

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/transfers" :query-params query-params}))

(defn create [{:keys []}]
  "Create a transfer

  HTTP Method: POST
  Endpoint: /v1/transfers

  Example Usage:
    (create {})"
  (stripe-request :post {:endpoint "/v1/transfers"}))

(defn retrieve-transfer [{:keys [transfer-id query-params]}]
  "Retrieve a transfer

  HTTP Method: GET
  Endpoint: /v1/transfers/{transfer-id}

  Path Parameters:
    - transfer-id: The transfer-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-transfer {:transfer-id example-transfer-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/transfers/{transfer-id}" :path-params {:transfer-id transfer-id} :query-params query-params}))

(defn update-transfer [{:keys [transfer-id]}]
  "Update a transfer

  HTTP Method: POST
  Endpoint: /v1/transfers/{transfer-id}

  Path Parameters:
    - transfer-id: The transfer-id parameter. (required) [type: string]

  Example Usage:
    (update-transfer {:transfer-id example-transfer-id})"
  (stripe-request :post {:endpoint "/v1/transfers/{transfer-id}" :path-params {:transfer-id transfer-id}}))