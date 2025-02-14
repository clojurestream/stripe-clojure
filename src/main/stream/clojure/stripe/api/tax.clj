(ns stream.clojure.stripe.api.tax
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-tax [id params]
  """
  Retrieve a registration

  HTTP Method: GET
  Endpoint: /v1/tax/registrations/{id}

  Path Parameters:
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/tax/registrations/" id "") params))

(defn create-tax [id params]
  """
  Update a registration

  HTTP Method: POST
  Endpoint: /v1/tax/registrations/{id}

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :post (str "/v1/tax/registrations/" id "") params))

(defn create-tax [params]
  """
  Create a reversal transaction

  HTTP Method: POST
  Endpoint: /v1/tax/transactions/create_reversal

  """
  (stripe-request :post (str "/v1/tax/transactions/create_reversal") params))

(defn retrieve-tax [transaction params]
  """
  Retrieve a transaction

  HTTP Method: GET
  Endpoint: /v1/tax/transactions/{transaction}

  Path Parameters:
    - transaction: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/tax/transactions/" transaction "") params))

(defn create-tax [params]
  """
  Create a transaction from a calculation

  HTTP Method: POST
  Endpoint: /v1/tax/transactions/create_from_calculation

  """
  (stripe-request :post (str "/v1/tax/transactions/create_from_calculation") params))

(defn retrieve-tax [calculation params]
  """
  Retrieve a calculation's line items

  HTTP Method: GET
  Endpoint: /v1/tax/calculations/{calculation}/line_items

  Path Parameters:
    - calculation: Path parameter.

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/tax/calculations/" calculation "/line_items") params))

(defn retrieve-tax [params]
  """
  Retrieve settings

  HTTP Method: GET
  Endpoint: /v1/tax/settings

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/tax/settings") params))

(defn create-tax [params]
  """
  Update settings

  HTTP Method: POST
  Endpoint: /v1/tax/settings

  """
  (stripe-request :post (str "/v1/tax/settings") params))

(defn retrieve-tax [params]
  """
  List registrations

  HTTP Method: GET
  Endpoint: /v1/tax/registrations

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: The status of the Tax Registration.

  """
  (stripe-request :get (str "/v1/tax/registrations") params))

(defn create-tax [params]
  """
  Create a registration

  HTTP Method: POST
  Endpoint: /v1/tax/registrations

  """
  (stripe-request :post (str "/v1/tax/registrations") params))

(defn create-tax [params]
  """
  Create a Tax Calculation

  HTTP Method: POST
  Endpoint: /v1/tax/calculations

  """
  (stripe-request :post (str "/v1/tax/calculations") params))

(defn retrieve-tax [transaction params]
  """
  Retrieve a transaction's line items

  HTTP Method: GET
  Endpoint: /v1/tax/transactions/{transaction}/line_items

  Path Parameters:
    - transaction: Path parameter.

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/tax/transactions/" transaction "/line_items") params))

(defn retrieve-tax [calculation params]
  """
  Retrieve a Tax Calculation

  HTTP Method: GET
  Endpoint: /v1/tax/calculations/{calculation}

  Path Parameters:
    - calculation: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/tax/calculations/" calculation "") params))