(ns stream.clojure.stripe.api.tax-ids
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn get-tax-ids [params]
  """
  List all tax IDs

  HTTP Method: GET
  Endpoint: /v1/tax_ids

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - owner: The account or customer the tax ID belongs to. Defaults to `owner[type]=self`.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/tax_ids" params))

(defn post-tax-ids [params]
  """
  Create a tax ID

  HTTP Method: POST
  Endpoint: /v1/tax_ids

  """
  (stripe-request :post "/v1/tax_ids" params))

(defn delete-tax-ids-id [id params]
  """
  Delete a tax ID

  HTTP Method: DELETE
  Endpoint: /v1/tax_ids/{id}

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :delete "/v1/tax_ids/" id "" params))

(defn get-tax-ids-id [id params]
  """
  Retrieve a tax ID

  HTTP Method: GET
  Endpoint: /v1/tax_ids/{id}

  Path Parameters:
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/tax_ids/" id "" params))