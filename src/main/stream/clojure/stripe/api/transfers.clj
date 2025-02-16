(ns stream.clojure.stripe.api.transfers
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-id-reversals
  "List all reversals

  HTTP Method: GET
  Endpoint: /v1/transfers/{transfer-id}/reversals

  Path Parameters:
    - transfer-id (String): The transfer-id parameter. (required)

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-id-reversals {:transfer-id example-transfer-id :query-params {:limit 10}})"
  [{:keys [transfer-id query-params]}]
  (stripe-request :get {:endpoint "/v1/transfers/{transfer-id}/reversals" :path-params {:transfer-id transfer-id} :query-params query-params}))

(defn create-id-reversals
  "Create a transfer reversal

  HTTP Method: POST
  Endpoint: /v1/transfers/{transfer-id}/reversals

  Path Parameters:
    - transfer-id (String): The transfer-id parameter. (required)

  Example Usage:
    (create-id-reversals {:transfer-id example-transfer-id})"
  [{:keys [transfer-id]}]
  (stripe-request :post {:endpoint "/v1/transfers/{transfer-id}/reversals" :path-params {:transfer-id transfer-id}}))

(defn retrieve-transfer-reversals-id
  "Retrieve a reversal

  HTTP Method: GET
  Endpoint: /v1/transfers/{transfer-id}/reversals/{reversal-id}

  Path Parameters:
    - transfer-id (String): The transfer-id parameter. (required)
    - reversal-id (String): The reversal-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-transfer-reversals-id {:transfer-id example-transfer-id :reversal-id example-reversal-id :query-params {:limit 10}})"
  [{:keys [transfer-id reversal-id query-params]}]
  (stripe-request :get {:endpoint "/v1/transfers/{transfer-id}/reversals/{reversal-id}" :path-params {:transfer-id transfer-id :reversal-id reversal-id} :query-params query-params}))

(defn update-transfer-reversals-id
  "Update a reversal

  HTTP Method: POST
  Endpoint: /v1/transfers/{transfer-id}/reversals/{reversal-id}

  Path Parameters:
    - transfer-id (String): The transfer-id parameter. (required)
    - reversal-id (String): The reversal-id parameter. (required)

  Example Usage:
    (update-transfer-reversals-id {:transfer-id example-transfer-id :reversal-id example-reversal-id})"
  [{:keys [transfer-id reversal-id]}]
  (stripe-request :post {:endpoint "/v1/transfers/{transfer-id}/reversals/{reversal-id}" :path-params {:transfer-id transfer-id :reversal-id reversal-id}}))

(defn list-all
  "List all transfers

  HTTP Method: GET
  Endpoint: /v1/transfers

  Query Parameters:
    - created (Unknown): Only return transfers that were created during the given date interval.
    - destination (String): Only return transfers for the destination specified by this account ID.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - transfer-group (String): Only return transfers with the specified transfer group.

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/transfers" :query-params query-params}))

(defn create
  "Create a transfer

  HTTP Method: POST
  Endpoint: /v1/transfers

  Example Usage:
    (create {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/transfers"}))

(defn retrieve-transfer
  "Retrieve a transfer

  HTTP Method: GET
  Endpoint: /v1/transfers/{transfer-id}

  Path Parameters:
    - transfer-id (String): The transfer-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-transfer {:transfer-id example-transfer-id :query-params {:limit 10}})"
  [{:keys [transfer-id query-params]}]
  (stripe-request :get {:endpoint "/v1/transfers/{transfer-id}" :path-params {:transfer-id transfer-id} :query-params query-params}))

(defn update-transfer
  "Update a transfer

  HTTP Method: POST
  Endpoint: /v1/transfers/{transfer-id}

  Path Parameters:
    - transfer-id (String): The transfer-id parameter. (required)

  Example Usage:
    (update-transfer {:transfer-id example-transfer-id})"
  [{:keys [transfer-id]}]
  (stripe-request :post {:endpoint "/v1/transfers/{transfer-id}" :path-params {:transfer-id transfer-id}}))