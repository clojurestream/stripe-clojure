(ns stream.clojure.stripe.api.invoiceitems
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn delete-invoiceitems-invoiceitem [invoiceitem params]
  """
  Delete an invoice item

  HTTP Method: DELETE
  Endpoint: /v1/invoiceitems/{invoiceitem}

  Path Parameters:
    - invoiceitem: Path parameter.

  """
  (stripe-request :delete "/v1/invoiceitems/" invoiceitem "" params))

(defn get-invoiceitems-invoiceitem [invoiceitem params]
  """
  Retrieve an invoice item

  HTTP Method: GET
  Endpoint: /v1/invoiceitems/{invoiceitem}

  Path Parameters:
    - invoiceitem: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/invoiceitems/" invoiceitem "" params))

(defn post-invoiceitems-invoiceitem [invoiceitem params]
  """
  Update an invoice item

  HTTP Method: POST
  Endpoint: /v1/invoiceitems/{invoiceitem}

  Path Parameters:
    - invoiceitem: Path parameter.

  """
  (stripe-request :post "/v1/invoiceitems/" invoiceitem "" params))

(defn get-invoiceitems [params]
  """
  List all invoice items

  HTTP Method: GET
  Endpoint: /v1/invoiceitems

  Query Parameters:
    - created: Only return invoice items that were created during the given date interval.
    - customer: The identifier of the customer whose invoice items to return. If none is provided, all invoice items will be returned.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - invoice: Only return invoice items belonging to this invoice. If none is provided, all invoice items will be returned. If specifying an invoice, no customer identifier is needed.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - pending: Set to `true` to only show pending invoice items, which are not yet attached to any invoices. Set to `false` to only show invoice items already attached to invoices. If unspecified, no filter is applied.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/invoiceitems" params))

(defn post-invoiceitems [params]
  """
  Create an invoice item

  HTTP Method: POST
  Endpoint: /v1/invoiceitems

  """
  (stripe-request :post "/v1/invoiceitems" params))