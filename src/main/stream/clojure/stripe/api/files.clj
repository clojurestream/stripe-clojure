(ns stream.clojure.stripe.api.files
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-files [params]
  """
  List all files

  HTTP Method: GET
  Endpoint: /v1/files

  Query Parameters:
    - created: Only return files that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - purpose: Filter queries by the file purpose. If you don't provide a purpose, the queries return unfiltered files.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/files") params))

(defn create-files [params]
  """
  Create a file

  HTTP Method: POST
  Endpoint: /v1/files

  """
  (stripe-request :post (str "/v1/files") params))

(defn retrieve-files [file params]
  """
  Retrieve a file

  HTTP Method: GET
  Endpoint: /v1/files/{file}

  Path Parameters:
    - file: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/files/" file "") params))