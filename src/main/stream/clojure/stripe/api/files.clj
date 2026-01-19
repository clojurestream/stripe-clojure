(ns stream.clojure.stripe.api.files
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all
  "List all files

  HTTP Method: GET
  Endpoint: /v1/files

  Query Parameters:
    - created (Unknown): Only return files that were created during the given date interval.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - purpose (String): Filter queries by the file purpose. If you don't provide a purpose, the queries return unfiltered files.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/files" :query-params query-params}))

(defn create
  "Create a file

  HTTP Method: POST
  Endpoint: /v1/files

  Example Usage:
    (create {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/files" :body body}))

(defn retrieve-file
  "Retrieve a file

  HTTP Method: GET
  Endpoint: /v1/files/{file-id}

  Path Parameters:
    - file-id (String): The file-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-file {:file-id example-file-id :query-params {:limit 10}})"
  [{:keys [file-id query-params]}]
  (stripe-request :get {:endpoint "/v1/files/{file-id}" :path-params {:file-id file-id} :query-params query-params}))