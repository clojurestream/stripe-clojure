(ns stream.clojure.stripe.api.application-fees
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn get-application-fees-id-refunds [id params]
  """
  List all application fee refunds

  HTTP Method: GET
  Endpoint: /v1/application_fees/{id}/refunds

  Path Parameters:
    - id: Path parameter.

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/application_fees/" id "/refunds" params))

(defn post-application-fees-id-refunds [id params]
  """
  Create an application fee refund

  HTTP Method: POST
  Endpoint: /v1/application_fees/{id}/refunds

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :post "/v1/application_fees/" id "/refunds" params))

(defn get-application-fees [params]
  """
  List all application fees

  HTTP Method: GET
  Endpoint: /v1/application_fees

  Query Parameters:
    - charge: Only return application fees for the charge specified by this charge ID.
    - created: Only return applications fees that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/application_fees" params))

(defn get-application-fees-fee-refunds-id [fee id params]
  """
  Retrieve an application fee refund

  HTTP Method: GET
  Endpoint: /v1/application_fees/{fee}/refunds/{id}

  Path Parameters:
    - fee: Path parameter.
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/application_fees/" fee "/refunds/" id "" params))

(defn post-application-fees-fee-refunds-id [fee id params]
  """
  Update an application fee refund

  HTTP Method: POST
  Endpoint: /v1/application_fees/{fee}/refunds/{id}

  Path Parameters:
    - fee: Path parameter.
    - id: Path parameter.

  """
  (stripe-request :post "/v1/application_fees/" fee "/refunds/" id "" params))

(defn get-application-fees-id [id params]
  """
  Retrieve an application fee

  HTTP Method: GET
  Endpoint: /v1/application_fees/{id}

  Path Parameters:
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/application_fees/" id "" params))

(defn post-application-fees-id-refund [id params]
  """
  No description available.

  HTTP Method: POST
  Endpoint: /v1/application_fees/{id}/refund

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :post "/v1/application_fees/" id "/refund" params))