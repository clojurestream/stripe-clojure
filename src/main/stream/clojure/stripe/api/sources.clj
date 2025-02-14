(ns stream.clojure.stripe.api.sources
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-sources [source source_transaction params]
  """
  Retrieve a source transaction

  HTTP Method: GET
  Endpoint: /v1/sources/{source}/source_transactions/{source_transaction}

  Path Parameters:
    - source: Path parameter.
    - source_transaction: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/sources/" source "/source_transactions/" source_transaction "") params))

(defn create-sources [source params]
  """
  No description available.

  HTTP Method: POST
  Endpoint: /v1/sources/{source}/verify

  Path Parameters:
    - source: Path parameter.

  """
  (stripe-request :post (str "/v1/sources/" source "/verify") params))

(defn retrieve-sources [source params]
  """
  Retrieve a source

  HTTP Method: GET
  Endpoint: /v1/sources/{source}

  Path Parameters:
    - source: Path parameter.

  Query Parameters:
    - client_secret: The client secret of the source. Required if a publishable key is used to retrieve the source.
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/sources/" source "") params))

(defn create-sources [source params]
  """
  Update a source

  HTTP Method: POST
  Endpoint: /v1/sources/{source}

  Path Parameters:
    - source: Path parameter.

  """
  (stripe-request :post (str "/v1/sources/" source "") params))

(defn retrieve-sources [source mandate_notification params]
  """
  Retrieve a Source MandateNotification

  HTTP Method: GET
  Endpoint: /v1/sources/{source}/mandate_notifications/{mandate_notification}

  Path Parameters:
    - source: Path parameter.
    - mandate_notification: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/sources/" source "/mandate_notifications/" mandate_notification "") params))

(defn retrieve-sources [source params]
  """
  No description available.

  HTTP Method: GET
  Endpoint: /v1/sources/{source}/source_transactions

  Path Parameters:
    - source: Path parameter.

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/sources/" source "/source_transactions") params))

(defn create-sources [params]
  """
  Shares a source

  HTTP Method: POST
  Endpoint: /v1/sources

  """
  (stripe-request :post (str "/v1/sources") params))