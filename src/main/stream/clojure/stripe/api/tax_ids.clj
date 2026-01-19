(ns stream.clojure.stripe.api.tax-ids
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-tax-ids
  "List all tax IDs

  HTTP Method: GET
  Endpoint: /v1/tax_ids

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - owner (Object): The account or customer the tax ID belongs to. Defaults to `owner[type]=self`.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-tax-ids {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/tax_ids" :query-params query-params}))

(defn create-tax-ids
  "Create a tax ID

  HTTP Method: POST
  Endpoint: /v1/tax_ids

  Example Usage:
    (create-tax-ids {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/tax_ids" :body body}))

(defn retrieve-tax-ids-id
  "Retrieve a tax ID

  HTTP Method: GET
  Endpoint: /v1/tax_ids/{tax-id-id}

  Path Parameters:
    - tax-id-id (String): The tax-id-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-tax-ids-id {:tax-id-id example-tax-id-id :query-params {:limit 10}})"
  [{:keys [tax-id-id query-params]}]
  (stripe-request :get {:endpoint "/v1/tax_ids/{tax-id-id}" :path-params {:tax-id-id tax-id-id} :query-params query-params}))

(defn delete-tax-ids-id
  "Delete a tax ID

  HTTP Method: DELETE
  Endpoint: /v1/tax_ids/{tax-id-id}

  Path Parameters:
    - tax-id-id (String): The tax-id-id parameter. (required)

  Example Usage:
    (delete-tax-ids-id {:tax-id-id example-tax-id-id})"
  [{:keys [tax-id-id]}]
  (stripe-request :delete {:endpoint "/v1/tax_ids/{tax-id-id}" :path-params {:tax-id-id tax-id-id}}))