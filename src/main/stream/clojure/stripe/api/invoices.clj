(ns stream.clojure.stripe.api.invoices
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn create-create-preview
  "Create a preview invoice

  HTTP Method: POST
  Endpoint: /v1/invoices/create_preview

  Example Usage:
    (create-create-preview {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/invoices/create_preview" :body body}))

(defn list-all-search
  "Search invoices

  HTTP Method: GET
  Endpoint: /v1/invoices/search

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - page (String): A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results.
    - query (String): The search query string. See [search query language](https://docs.stripe.com/search#search-query-language) and the list of supported [query fields for invoices](https://docs.stripe.com/search#query-fields-for-invoices). (required)

  Example Usage:
    (list-all-search {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/invoices/search" :query-params query-params}))

(defn post-invoice-void
  "Void an invoice

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice-id}/void

  Path Parameters:
    - invoice-id (String): The invoice-id parameter. (required)

  Example Usage:
    (post-invoice-void {:invoice-id example-invoice-id})"
  [{:keys [invoice-id body]}]
  (stripe-request :post {:endpoint "/v1/invoices/{invoice-id}/void" :path-params {:invoice-id invoice-id} :body body}))

(defn post-invoice-attach-payment
  "Attach a payment to an Invoice

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice-id}/attach_payment

  Path Parameters:
    - invoice-id (String): The invoice-id parameter. (required)

  Example Usage:
    (post-invoice-attach-payment {:invoice-id example-invoice-id})"
  [{:keys [invoice-id body]}]
  (stripe-request :post {:endpoint "/v1/invoices/{invoice-id}/attach_payment" :path-params {:invoice-id invoice-id} :body body}))

(defn list-all-invoice-lines
  "Retrieve an invoice's line items

  HTTP Method: GET
  Endpoint: /v1/invoices/{invoice-id}/lines

  Path Parameters:
    - invoice-id (String): The invoice-id parameter. (required)

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-invoice-lines {:invoice-id example-invoice-id :query-params {:limit 10}})"
  [{:keys [invoice-id query-params]}]
  (stripe-request :get {:endpoint "/v1/invoices/{invoice-id}/lines" :path-params {:invoice-id invoice-id} :query-params query-params}))

(defn post-invoice-update-lines
  "Bulk update invoice line items

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice-id}/update_lines

  Path Parameters:
    - invoice-id (String): The invoice-id parameter. (required)

  Example Usage:
    (post-invoice-update-lines {:invoice-id example-invoice-id})"
  [{:keys [invoice-id body]}]
  (stripe-request :post {:endpoint "/v1/invoices/{invoice-id}/update_lines" :path-params {:invoice-id invoice-id} :body body}))

(defn post-invoice-add-lines
  "Bulk add invoice line items

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice-id}/add_lines

  Path Parameters:
    - invoice-id (String): The invoice-id parameter. (required)

  Example Usage:
    (post-invoice-add-lines {:invoice-id example-invoice-id})"
  [{:keys [invoice-id body]}]
  (stripe-request :post {:endpoint "/v1/invoices/{invoice-id}/add_lines" :path-params {:invoice-id invoice-id} :body body}))

(defn post-invoice-send
  "Send an invoice for manual payment

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice-id}/send

  Path Parameters:
    - invoice-id (String): The invoice-id parameter. (required)

  Example Usage:
    (post-invoice-send {:invoice-id example-invoice-id})"
  [{:keys [invoice-id body]}]
  (stripe-request :post {:endpoint "/v1/invoices/{invoice-id}/send" :path-params {:invoice-id invoice-id} :body body}))

(defn post-invoice-mark-uncollectible
  "Mark an invoice as uncollectible

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice-id}/mark_uncollectible

  Path Parameters:
    - invoice-id (String): The invoice-id parameter. (required)

  Example Usage:
    (post-invoice-mark-uncollectible {:invoice-id example-invoice-id})"
  [{:keys [invoice-id body]}]
  (stripe-request :post {:endpoint "/v1/invoices/{invoice-id}/mark_uncollectible" :path-params {:invoice-id invoice-id} :body body}))

(defn post-invoice-finalize
  "Finalize an invoice

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice-id}/finalize

  Path Parameters:
    - invoice-id (String): The invoice-id parameter. (required)

  Example Usage:
    (post-invoice-finalize {:invoice-id example-invoice-id})"
  [{:keys [invoice-id body]}]
  (stripe-request :post {:endpoint "/v1/invoices/{invoice-id}/finalize" :path-params {:invoice-id invoice-id} :body body}))

(defn update-invoice-lines-line-item-id
  "Update an invoice's line item

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice-id}/lines/{line-id}

  Path Parameters:
    - invoice-id (String): Invoice ID of line item
    - line-id (String): Invoice line item ID

  Example Usage:
    (update-invoice-lines-line-item-id {:invoice-id example-invoice-id :line-id example-line-id})"
  [{:keys [invoice-id line-id body]}]
  (stripe-request :post {:endpoint "/v1/invoices/{invoice-id}/lines/{line-id}" :path-params {:invoice-id invoice-id :line-id line-id} :body body}))

(defn list-all
  "List all invoices

  HTTP Method: GET
  Endpoint: /v1/invoices

  Query Parameters:
    - collection-method (String): The collection method of the invoice to retrieve. Either `charge_automatically` or `send_invoice`.
    - created (Unknown): Only return invoices that were created during the given date interval.
    - customer (String): Only return invoices for the customer specified by this customer ID.
    - customer-account (String): Only return invoices for the account representing the customer specified by this account ID.
    - due-date (Unknown): The due-date parameter.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): The status of the invoice, one of `draft`, `open`, `paid`, `uncollectible`, or `void`. [Learn more](https://docs.stripe.com/billing/invoices/workflow#workflow-overview)
    - subscription (String): Only return invoices for the subscription specified by this subscription ID.

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/invoices" :query-params query-params}))

(defn create
  "Create an invoice

  HTTP Method: POST
  Endpoint: /v1/invoices

  Example Usage:
    (create {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/invoices" :body body}))

(defn post-invoice-remove-lines
  "Bulk remove invoice line items

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice-id}/remove_lines

  Path Parameters:
    - invoice-id (String): The invoice-id parameter. (required)

  Example Usage:
    (post-invoice-remove-lines {:invoice-id example-invoice-id})"
  [{:keys [invoice-id body]}]
  (stripe-request :post {:endpoint "/v1/invoices/{invoice-id}/remove_lines" :path-params {:invoice-id invoice-id} :body body}))

(defn retrieve-invoice
  "Retrieve an invoice

  HTTP Method: GET
  Endpoint: /v1/invoices/{invoice-id}

  Path Parameters:
    - invoice-id (String): The invoice-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-invoice {:invoice-id example-invoice-id :query-params {:limit 10}})"
  [{:keys [invoice-id query-params]}]
  (stripe-request :get {:endpoint "/v1/invoices/{invoice-id}" :path-params {:invoice-id invoice-id} :query-params query-params}))

(defn delete-invoice
  "Delete a draft invoice

  HTTP Method: DELETE
  Endpoint: /v1/invoices/{invoice-id}

  Path Parameters:
    - invoice-id (String): The invoice-id parameter. (required)

  Example Usage:
    (delete-invoice {:invoice-id example-invoice-id})"
  [{:keys [invoice-id]}]
  (stripe-request :delete {:endpoint "/v1/invoices/{invoice-id}" :path-params {:invoice-id invoice-id}}))

(defn update-invoice
  "Update an invoice

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice-id}

  Path Parameters:
    - invoice-id (String): The invoice-id parameter. (required)

  Example Usage:
    (update-invoice {:invoice-id example-invoice-id})"
  [{:keys [invoice-id body]}]
  (stripe-request :post {:endpoint "/v1/invoices/{invoice-id}" :path-params {:invoice-id invoice-id} :body body}))

(defn post-invoice-pay
  "Pay an invoice

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice-id}/pay

  Path Parameters:
    - invoice-id (String): The invoice-id parameter. (required)

  Example Usage:
    (post-invoice-pay {:invoice-id example-invoice-id})"
  [{:keys [invoice-id body]}]
  (stripe-request :post {:endpoint "/v1/invoices/{invoice-id}/pay" :path-params {:invoice-id invoice-id} :body body}))