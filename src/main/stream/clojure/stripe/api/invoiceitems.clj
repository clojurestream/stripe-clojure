(ns stream.clojure.stripe.api.invoiceitems
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-invoiceitem
  "Retrieve an invoice item

  HTTP Method: GET
  Endpoint: /v1/invoiceitems/{invoiceitem-id}

  Path Parameters:
    - invoiceitem-id (String): The invoiceitem-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-invoiceitem {:invoiceitem-id example-invoiceitem-id :query-params {:limit 10}})"
  [{:keys [invoiceitem-id query-params]}]
  (stripe-request :get {:endpoint "/v1/invoiceitems/{invoiceitem-id}" :path-params {:invoiceitem-id invoiceitem-id} :query-params query-params}))

(defn delete-invoiceitem
  "Delete an invoice item

  HTTP Method: DELETE
  Endpoint: /v1/invoiceitems/{invoiceitem-id}

  Path Parameters:
    - invoiceitem-id (String): The invoiceitem-id parameter. (required)

  Example Usage:
    (delete-invoiceitem {:invoiceitem-id example-invoiceitem-id})"
  [{:keys [invoiceitem-id]}]
  (stripe-request :delete {:endpoint "/v1/invoiceitems/{invoiceitem-id}" :path-params {:invoiceitem-id invoiceitem-id}}))

(defn update-invoiceitem
  "Update an invoice item

  HTTP Method: POST
  Endpoint: /v1/invoiceitems/{invoiceitem-id}

  Path Parameters:
    - invoiceitem-id (String): The invoiceitem-id parameter. (required)

  Example Usage:
    (update-invoiceitem {:invoiceitem-id example-invoiceitem-id})"
  [{:keys [invoiceitem-id]}]
  (stripe-request :post {:endpoint "/v1/invoiceitems/{invoiceitem-id}" :path-params {:invoiceitem-id invoiceitem-id}}))

(defn list-all
  "List all invoice items

  HTTP Method: GET
  Endpoint: /v1/invoiceitems

  Query Parameters:
    - created (Unknown): Only return invoice items that were created during the given date interval.
    - customer (String): The identifier of the customer whose invoice items to return. If none is provided, returns all invoice items.
    - customer-account (String): The identifier of the account representing the customer whose invoice items to return. If none is provided, returns all invoice items.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - invoice (String): Only return invoice items belonging to this invoice. If none is provided, all invoice items will be returned. If specifying an invoice, no customer identifier is needed.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - pending (Boolean): Set to `true` to only show pending invoice items, which are not yet attached to any invoices. Set to `false` to only show invoice items already attached to invoices. If unspecified, no filter is applied.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/invoiceitems" :query-params query-params}))

(defn create
  "Create an invoice item

  HTTP Method: POST
  Endpoint: /v1/invoiceitems

  Example Usage:
    (create {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/invoiceitems"}))