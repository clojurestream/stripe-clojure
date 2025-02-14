(ns stream.clojure.stripe.api.terminal
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn delete-terminal [configuration params]
  """
  Delete a Configuration

  HTTP Method: DELETE
  Endpoint: /v1/terminal/configurations/{configuration}

  Path Parameters:
    - configuration: Path parameter.

  """
  (stripe-request :delete (str "/v1/terminal/configurations/" configuration "") params))

(defn retrieve-terminal [configuration params]
  """
  Retrieve a Configuration

  HTTP Method: GET
  Endpoint: /v1/terminal/configurations/{configuration}

  Path Parameters:
    - configuration: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/terminal/configurations/" configuration "") params))

(defn create-terminal [configuration params]
  """
  Update a Configuration

  HTTP Method: POST
  Endpoint: /v1/terminal/configurations/{configuration}

  Path Parameters:
    - configuration: Path parameter.

  """
  (stripe-request :post (str "/v1/terminal/configurations/" configuration "") params))

(defn retrieve-terminal [params]
  """
  List all Configurations

  HTTP Method: GET
  Endpoint: /v1/terminal/configurations

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - is_account_default: if present, only return the account default or non-default configurations.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/terminal/configurations") params))

(defn create-terminal [params]
  """
  Create a Configuration

  HTTP Method: POST
  Endpoint: /v1/terminal/configurations

  """
  (stripe-request :post (str "/v1/terminal/configurations") params))

(defn create-terminal [reader params]
  """
  Hand-off a PaymentIntent to a Reader

  HTTP Method: POST
  Endpoint: /v1/terminal/readers/{reader}/process_payment_intent

  Path Parameters:
    - reader: Path parameter.

  """
  (stripe-request :post (str "/v1/terminal/readers/" reader "/process_payment_intent") params))

(defn create-terminal [reader params]
  """
  Set reader display

  HTTP Method: POST
  Endpoint: /v1/terminal/readers/{reader}/set_reader_display

  Path Parameters:
    - reader: Path parameter.

  """
  (stripe-request :post (str "/v1/terminal/readers/" reader "/set_reader_display") params))

(defn create-terminal [reader params]
  """
  Refund a Charge or a PaymentIntent in-person

  HTTP Method: POST
  Endpoint: /v1/terminal/readers/{reader}/refund_payment

  Path Parameters:
    - reader: Path parameter.

  """
  (stripe-request :post (str "/v1/terminal/readers/" reader "/refund_payment") params))

(defn delete-terminal [reader params]
  """
  Delete a Reader

  HTTP Method: DELETE
  Endpoint: /v1/terminal/readers/{reader}

  Path Parameters:
    - reader: Path parameter.

  """
  (stripe-request :delete (str "/v1/terminal/readers/" reader "") params))

(defn retrieve-terminal [reader params]
  """
  Retrieve a Reader

  HTTP Method: GET
  Endpoint: /v1/terminal/readers/{reader}

  Path Parameters:
    - reader: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/terminal/readers/" reader "") params))

(defn create-terminal [reader params]
  """
  Update a Reader

  HTTP Method: POST
  Endpoint: /v1/terminal/readers/{reader}

  Path Parameters:
    - reader: Path parameter.

  """
  (stripe-request :post (str "/v1/terminal/readers/" reader "") params))

(defn delete-terminal [location params]
  """
  Delete a Location

  HTTP Method: DELETE
  Endpoint: /v1/terminal/locations/{location}

  Path Parameters:
    - location: Path parameter.

  """
  (stripe-request :delete (str "/v1/terminal/locations/" location "") params))

(defn retrieve-terminal [location params]
  """
  Retrieve a Location

  HTTP Method: GET
  Endpoint: /v1/terminal/locations/{location}

  Path Parameters:
    - location: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/terminal/locations/" location "") params))

(defn create-terminal [location params]
  """
  Update a Location

  HTTP Method: POST
  Endpoint: /v1/terminal/locations/{location}

  Path Parameters:
    - location: Path parameter.

  """
  (stripe-request :post (str "/v1/terminal/locations/" location "") params))

(defn create-terminal [reader params]
  """
  Hand-off a SetupIntent to a Reader

  HTTP Method: POST
  Endpoint: /v1/terminal/readers/{reader}/process_setup_intent

  Path Parameters:
    - reader: Path parameter.

  """
  (stripe-request :post (str "/v1/terminal/readers/" reader "/process_setup_intent") params))

(defn create-terminal [reader params]
  """
  Cancel the current reader action

  HTTP Method: POST
  Endpoint: /v1/terminal/readers/{reader}/cancel_action

  Path Parameters:
    - reader: Path parameter.

  """
  (stripe-request :post (str "/v1/terminal/readers/" reader "/cancel_action") params))

(defn retrieve-terminal [params]
  """
  List all Readers

  HTTP Method: GET
  Endpoint: /v1/terminal/readers

  Query Parameters:
    - device_type: Filters readers by device type
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - location: A location ID to filter the response list to only readers at the specific location
    - serial_number: Filters readers by serial number
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: A status filter to filter readers to only offline or online readers

  """
  (stripe-request :get (str "/v1/terminal/readers") params))

(defn create-terminal [params]
  """
  Create a Reader

  HTTP Method: POST
  Endpoint: /v1/terminal/readers

  """
  (stripe-request :post (str "/v1/terminal/readers") params))

(defn retrieve-terminal [params]
  """
  List all Locations

  HTTP Method: GET
  Endpoint: /v1/terminal/locations

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/terminal/locations") params))

(defn create-terminal [params]
  """
  Create a Location

  HTTP Method: POST
  Endpoint: /v1/terminal/locations

  """
  (stripe-request :post (str "/v1/terminal/locations") params))

(defn create-terminal [params]
  """
  Create a Connection Token

  HTTP Method: POST
  Endpoint: /v1/terminal/connection_tokens

  """
  (stripe-request :post (str "/v1/terminal/connection_tokens") params))