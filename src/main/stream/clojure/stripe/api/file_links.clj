(ns stream.clojure.stripe.api.file-links
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-file-links-link
  "Retrieve a file link

  HTTP Method: GET
  Endpoint: /v1/file_links/{file-link-id}

  Path Parameters:
    - file-link-id (String): The file-link-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-file-links-link {:file-link-id example-file-link-id :query-params {:limit 10}})"
  [{:keys [file-link-id query-params]}]
  (stripe-request :get {:endpoint "/v1/file_links/{file-link-id}" :path-params {:file-link-id file-link-id} :query-params query-params}))

(defn update-file-links-link
  "Update a file link

  HTTP Method: POST
  Endpoint: /v1/file_links/{file-link-id}

  Path Parameters:
    - file-link-id (String): The file-link-id parameter. (required)

  Example Usage:
    (update-file-links-link {:file-link-id example-file-link-id})"
  [{:keys [file-link-id]}]
  (stripe-request :post {:endpoint "/v1/file_links/{file-link-id}" :path-params {:file-link-id file-link-id}}))

(defn list-all-file-links
  "List all file links

  HTTP Method: GET
  Endpoint: /v1/file_links

  Query Parameters:
    - created (Unknown): Only return links that were created during the given date interval.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - expired (Boolean): Filter links by their expiration status. By default, Stripe returns all links.
    - file (String): Only return links for the given file.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-file-links {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/file_links" :query-params query-params}))

(defn create-file-links
  "Create a file link

  HTTP Method: POST
  Endpoint: /v1/file_links

  Example Usage:
    (create-file-links {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/file_links"}))