(ns stream.clojure.stripe.api.transfers
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn get-transfers-id-reversals [id params]
  """
  List all reversals

  HTTP Method: GET
  Endpoint: /v1/transfers/{id}/reversals

  Path Parameters:
    - id: Path parameter.

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/transfers/" id "/reversals" params))

(defn post-transfers-id-reversals [id params]
  """
  Create a transfer reversal

  HTTP Method: POST
  Endpoint: /v1/transfers/{id}/reversals

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :post "/v1/transfers/" id "/reversals" params))

(defn get-transfers-transfer-reversals-id [transfer id params]
  """
  Retrieve a reversal

  HTTP Method: GET
  Endpoint: /v1/transfers/{transfer}/reversals/{id}

  Path Parameters:
    - transfer: Path parameter.
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/transfers/" transfer "/reversals/" id "" params))

(defn post-transfers-transfer-reversals-id [transfer id params]
  """
  Update a reversal

  HTTP Method: POST
  Endpoint: /v1/transfers/{transfer}/reversals/{id}

  Path Parameters:
    - transfer: Path parameter.
    - id: Path parameter.

  """
  (stripe-request :post "/v1/transfers/" transfer "/reversals/" id "" params))

(defn get-transfers [params]
  """
  List all transfers

  HTTP Method: GET
  Endpoint: /v1/transfers

  Query Parameters:
    - created: Only return transfers that were created during the given date interval.
    - destination: Only return transfers for the destination specified by this account ID.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - transfer_group: Only return transfers with the specified transfer group.

  """
  (stripe-request :get "/v1/transfers" params))

(defn post-transfers [params]
  """
  Create a transfer

  HTTP Method: POST
  Endpoint: /v1/transfers

  """
  (stripe-request :post "/v1/transfers" params))

(defn get-transfers-transfer [transfer params]
  """
  Retrieve a transfer

  HTTP Method: GET
  Endpoint: /v1/transfers/{transfer}

  Path Parameters:
    - transfer: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/transfers/" transfer "" params))

(defn post-transfers-transfer [transfer params]
  """
  Update a transfer

  HTTP Method: POST
  Endpoint: /v1/transfers/{transfer}

  Path Parameters:
    - transfer: Path parameter.

  """
  (stripe-request :post "/v1/transfers/" transfer "" params))