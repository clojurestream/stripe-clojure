(ns stream.clojure.stripe.api.file-links
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-file-links-link [{:keys [file-link-id query-params]}]
  "Retrieve a file link

  HTTP Method: GET
  Endpoint: /v1/file_links/{file-link-id}

  Path Parameters:
    - file-link-id: The file-link-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-file-links-link {:file-link-id example-file-link-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/file_links/{file-link-id}" :path-params {:file-link-id file-link-id} :query-params query-params}))

(defn update-file-links-link [{:keys [file-link-id]}]
  "Update a file link

  HTTP Method: POST
  Endpoint: /v1/file_links/{file-link-id}

  Path Parameters:
    - file-link-id: The file-link-id parameter. (required) [type: string]

  Example Usage:
    (update-file-links-link {:file-link-id example-file-link-id})"
  (stripe-request :post {:endpoint "/v1/file_links/{file-link-id}" :path-params {:file-link-id file-link-id}}))

(defn list-all-file-links [{:keys [query-params]}]
  "List all file links

  HTTP Method: GET
  Endpoint: /v1/file_links

  Query Parameters:
    - created: Only return links that were created during the given date interval. [type: unknown]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - expired: Filter links by their expiration status. By default, Stripe returns all links. [type: boolean]
    - file: Only return links for the given file. [type: string]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-file-links {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/file_links" :query-params query-params}))

(defn create-file-links [{:keys []}]
  "Create a file link

  HTTP Method: POST
  Endpoint: /v1/file_links

  Example Usage:
    (create-file-links {})"
  (stripe-request :post {:endpoint "/v1/file_links"}))