(ns stream.clojure.stripe.api.file-links
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-file-links [link params]
  """
  Retrieve a file link

  HTTP Method: GET
  Endpoint: /v1/file_links/{link}

  Path Parameters:
    - link: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/file_links/" link "") params))

(defn create-file-links [link params]
  """
  Update a file link

  HTTP Method: POST
  Endpoint: /v1/file_links/{link}

  Path Parameters:
    - link: Path parameter.

  """
  (stripe-request :post (str "/v1/file_links/" link "") params))

(defn retrieve-file-links [params]
  """
  List all file links

  HTTP Method: GET
  Endpoint: /v1/file_links

  Query Parameters:
    - created: Only return links that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - expired: Filter links by their expiration status. By default, Stripe returns all links.
    - file: Only return links for the given file.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/file_links") params))

(defn create-file-links [params]
  """
  Create a file link

  HTTP Method: POST
  Endpoint: /v1/file_links

  """
  (stripe-request :post (str "/v1/file_links") params))