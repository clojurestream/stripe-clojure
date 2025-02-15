(ns stream.clojure.stripe.api.files
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all [{:keys [query-params]}]
  "List all files

  HTTP Method: GET
  Endpoint: /v1/files

  Query Parameters:
    - created: Only return files that were created during the given date interval. [type: unknown]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - purpose: Filter queries by the file purpose. If you don't provide a purpose, the queries return unfiltered files. [type: string]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/files" :query-params query-params}))

(defn create [{:keys []}]
  "Create a file

  HTTP Method: POST
  Endpoint: /v1/files

  Example Usage:
    (create {})"
  (stripe-request :post {:endpoint "/v1/files"}))

(defn retrieve-file [{:keys [file-id query-params]}]
  "Retrieve a file

  HTTP Method: GET
  Endpoint: /v1/files/{file-id}

  Path Parameters:
    - file-id: The file-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-file {:file-id example-file-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/files/{file-id}" :path-params {:file-id file-id} :query-params query-params}))