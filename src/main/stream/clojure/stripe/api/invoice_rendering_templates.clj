(ns stream.clojure.stripe.api.invoice-rendering-templates
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-invoice-rendering-templates-template-archive [template params]
  """
  Archive an invoice rendering template

  HTTP Method: POST
  Endpoint: /v1/invoice_rendering_templates/{template}/archive

  Path Parameters:
    - template: Path parameter.

  """
  (stripe-request :post "/v1/invoice_rendering_templates/" template "/archive" params))

(defn get-invoice-rendering-templates [params]
  """
  List all invoice rendering templates

  HTTP Method: GET
  Endpoint: /v1/invoice_rendering_templates

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: 

  """
  (stripe-request :get "/v1/invoice_rendering_templates" params))

(defn get-invoice-rendering-templates-template [template params]
  """
  Retrieve an invoice rendering template

  HTTP Method: GET
  Endpoint: /v1/invoice_rendering_templates/{template}

  Path Parameters:
    - template: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.
    - version: 

  """
  (stripe-request :get "/v1/invoice_rendering_templates/" template "" params))

(defn post-invoice-rendering-templates-template-unarchive [template params]
  """
  Unarchive an invoice rendering template

  HTTP Method: POST
  Endpoint: /v1/invoice_rendering_templates/{template}/unarchive

  Path Parameters:
    - template: Path parameter.

  """
  (stripe-request :post "/v1/invoice_rendering_templates/" template "/unarchive" params))