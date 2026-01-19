(ns stream.clojure.stripe.api.invoice-rendering-templates
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-invoice-rendering-templates-template-archive
  "Archive an invoice rendering template

  HTTP Method: POST
  Endpoint: /v1/invoice_rendering_templates/{invoice-rendering-template-id}/archive

  Path Parameters:
    - invoice-rendering-template-id (String): The invoice-rendering-template-id parameter. (required)

  Example Usage:
    (post-invoice-rendering-templates-template-archive {:invoice-rendering-template-id example-invoice-rendering-template-id})"
  [{:keys [invoice-rendering-template-id body]}]
  (stripe-request :post {:endpoint "/v1/invoice_rendering_templates/{invoice-rendering-template-id}/archive" :path-params {:invoice-rendering-template-id invoice-rendering-template-id} :body body}))

(defn list-all-invoice-rendering-templates
  "List all invoice rendering templates

  HTTP Method: GET
  Endpoint: /v1/invoice_rendering_templates

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): The status parameter.

  Example Usage:
    (list-all-invoice-rendering-templates {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/invoice_rendering_templates" :query-params query-params}))

(defn retrieve-invoice-rendering-templates-template
  "Retrieve an invoice rendering template

  HTTP Method: GET
  Endpoint: /v1/invoice_rendering_templates/{invoice-rendering-template-id}

  Path Parameters:
    - invoice-rendering-template-id (String): The invoice-rendering-template-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.
    - version (Integer): The version parameter.

  Example Usage:
    (retrieve-invoice-rendering-templates-template {:invoice-rendering-template-id example-invoice-rendering-template-id :query-params {:limit 10}})"
  [{:keys [invoice-rendering-template-id query-params]}]
  (stripe-request :get {:endpoint "/v1/invoice_rendering_templates/{invoice-rendering-template-id}" :path-params {:invoice-rendering-template-id invoice-rendering-template-id} :query-params query-params}))

(defn post-invoice-rendering-templates-template-unarchive
  "Unarchive an invoice rendering template

  HTTP Method: POST
  Endpoint: /v1/invoice_rendering_templates/{invoice-rendering-template-id}/unarchive

  Path Parameters:
    - invoice-rendering-template-id (String): The invoice-rendering-template-id parameter. (required)

  Example Usage:
    (post-invoice-rendering-templates-template-unarchive {:invoice-rendering-template-id example-invoice-rendering-template-id})"
  [{:keys [invoice-rendering-template-id body]}]
  (stripe-request :post {:endpoint "/v1/invoice_rendering_templates/{invoice-rendering-template-id}/unarchive" :path-params {:invoice-rendering-template-id invoice-rendering-template-id} :body body}))