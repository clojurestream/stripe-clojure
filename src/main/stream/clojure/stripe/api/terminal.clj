(ns stream.clojure.stripe.api.terminal
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn delete-terminal-configurations-configuration [configuration params]
  """
  Delete a Configuration

  HTTP Method: DELETE
  Endpoint: /v1/terminal/configurations/{configuration}

  Path Parameters:
    - configuration: Path parameter.

  """
  (stripe-request :delete "/v1/terminal/configurations/" configuration "" params))

(defn get-terminal-configurations-configuration [configuration params]
  """
  Retrieve a Configuration

  HTTP Method: GET
  Endpoint: /v1/terminal/configurations/{configuration}

  Path Parameters:
    - configuration: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/terminal/configurations/" configuration "" params))

(defn post-terminal-configurations-configuration [configuration params]
  """
  Update a Configuration

  HTTP Method: POST
  Endpoint: /v1/terminal/configurations/{configuration}

  Path Parameters:
    - configuration: Path parameter.

  """
  (stripe-request :post "/v1/terminal/configurations/" configuration "" params))

(defn get-terminal-configurations [params]
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
  (stripe-request :get "/v1/terminal/configurations" params))

(defn post-terminal-configurations [params]
  """
  Create a Configuration

  HTTP Method: POST
  Endpoint: /v1/terminal/configurations

  """
  (stripe-request :post "/v1/terminal/configurations" params))

(defn post-terminal-readers-reader-process-payment-intent [reader params]
  """
  Hand-off a PaymentIntent to a Reader

  HTTP Method: POST
  Endpoint: /v1/terminal/readers/{reader}/process_payment_intent

  Path Parameters:
    - reader: Path parameter.

  """
  (stripe-request :post "/v1/terminal/readers/" reader "/process_payment_intent" params))

(defn post-terminal-readers-reader-set-reader-display [reader params]
  """
  Set reader display

  HTTP Method: POST
  Endpoint: /v1/terminal/readers/{reader}/set_reader_display

  Path Parameters:
    - reader: Path parameter.

  """
  (stripe-request :post "/v1/terminal/readers/" reader "/set_reader_display" params))

(defn post-terminal-readers-reader-refund-payment [reader params]
  """
  Refund a Charge or a PaymentIntent in-person

  HTTP Method: POST
  Endpoint: /v1/terminal/readers/{reader}/refund_payment

  Path Parameters:
    - reader: Path parameter.

  """
  (stripe-request :post "/v1/terminal/readers/" reader "/refund_payment" params))

(defn delete-terminal-readers-reader [reader params]
  """
  Delete a Reader

  HTTP Method: DELETE
  Endpoint: /v1/terminal/readers/{reader}

  Path Parameters:
    - reader: Path parameter.

  """
  (stripe-request :delete "/v1/terminal/readers/" reader "" params))

(defn get-terminal-readers-reader [reader params]
  """
  Retrieve a Reader

  HTTP Method: GET
  Endpoint: /v1/terminal/readers/{reader}

  Path Parameters:
    - reader: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/terminal/readers/" reader "" params))

(defn post-terminal-readers-reader [reader params]
  """
  Update a Reader

  HTTP Method: POST
  Endpoint: /v1/terminal/readers/{reader}

  Path Parameters:
    - reader: Path parameter.

  """
  (stripe-request :post "/v1/terminal/readers/" reader "" params))

(defn delete-terminal-locations-location [location params]
  """
  Delete a Location

  HTTP Method: DELETE
  Endpoint: /v1/terminal/locations/{location}

  Path Parameters:
    - location: Path parameter.

  """
  (stripe-request :delete "/v1/terminal/locations/" location "" params))

(defn get-terminal-locations-location [location params]
  """
  Retrieve a Location

  HTTP Method: GET
  Endpoint: /v1/terminal/locations/{location}

  Path Parameters:
    - location: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/terminal/locations/" location "" params))

(defn post-terminal-locations-location [location params]
  """
  Update a Location

  HTTP Method: POST
  Endpoint: /v1/terminal/locations/{location}

  Path Parameters:
    - location: Path parameter.

  """
  (stripe-request :post "/v1/terminal/locations/" location "" params))

(defn post-terminal-readers-reader-process-setup-intent [reader params]
  """
  Hand-off a SetupIntent to a Reader

  HTTP Method: POST
  Endpoint: /v1/terminal/readers/{reader}/process_setup_intent

  Path Parameters:
    - reader: Path parameter.

  """
  (stripe-request :post "/v1/terminal/readers/" reader "/process_setup_intent" params))

(defn post-terminal-readers-reader-cancel-action [reader params]
  """
  Cancel the current reader action

  HTTP Method: POST
  Endpoint: /v1/terminal/readers/{reader}/cancel_action

  Path Parameters:
    - reader: Path parameter.

  """
  (stripe-request :post "/v1/terminal/readers/" reader "/cancel_action" params))

(defn get-terminal-readers [params]
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
  (stripe-request :get "/v1/terminal/readers" params))

(defn post-terminal-readers [params]
  """
  Create a Reader

  HTTP Method: POST
  Endpoint: /v1/terminal/readers

  """
  (stripe-request :post "/v1/terminal/readers" params))

(defn get-terminal-locations [params]
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
  (stripe-request :get "/v1/terminal/locations" params))

(defn post-terminal-locations [params]
  """
  Create a Location

  HTTP Method: POST
  Endpoint: /v1/terminal/locations

  """
  (stripe-request :post "/v1/terminal/locations" params))

(defn post-terminal-connection-tokens [params]
  """
  Create a Connection Token

  HTTP Method: POST
  Endpoint: /v1/terminal/connection_tokens

  """
  (stripe-request :post "/v1/terminal/connection_tokens" params))