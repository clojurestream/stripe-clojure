(ns stream.clojure.stripe.api.credit-notes
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-credit-notes-id-void
  "Void a credit note

  HTTP Method: POST
  Endpoint: /v1/credit_notes/{credit-note-id}/void

  Path Parameters:
    - credit-note-id (String): The credit-note-id parameter. (required)

  Example Usage:
    (post-credit-notes-id-void {:credit-note-id example-credit-note-id})"
  [{:keys [credit-note-id]}]
  (stripe-request :post {:endpoint "/v1/credit_notes/{credit-note-id}/void" :path-params {:credit-note-id credit-note-id}}))

(defn list-all-credit-notes-preview-lines
  "Retrieve a credit note preview's line items

  HTTP Method: GET
  Endpoint: /v1/credit_notes/preview/lines

  Query Parameters:
    - amount (Integer): The integer amount in cents (or local equivalent) representing the total amount of the credit note. One of `amount`, `lines`, or `shipping_cost` must be provided.
    - credit-amount (Integer): The integer amount in cents (or local equivalent) representing the amount to credit the customer's balance, which will be automatically applied to their next invoice.
    - effective-at (Integer): The date when this credit note is in effect. Same as `created` unless overwritten. When defined, this value replaces the system-generated 'Date of issue' printed on the credit note PDF.
    - email-type (String): Type of email to send to the customer, one of `credit_note` or `none` and the default is `credit_note`.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - invoice (String): ID of the invoice. (required)
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - lines (Array): Line items that make up the credit note. One of `amount`, `lines`, or `shipping_cost` must be provided.
    - memo (String): The credit note's memo appears on the credit note PDF.
    - metadata (Object): Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format. Individual keys can be unset by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
    - out-of-band-amount (Integer): The integer amount in cents (or local equivalent) representing the amount that is credited outside of Stripe.
    - reason (String): Reason for issuing this credit note, one of `duplicate`, `fraudulent`, `order_change`, or `product_unsatisfactory`
    - refund-amount (Integer): The integer amount in cents (or local equivalent) representing the amount to refund. If set, a refund will be created for the charge associated with the invoice.
    - refunds (Array): Refunds to link to this credit note.
    - shipping-cost (Object): When shipping_cost contains the shipping_rate from the invoice, the shipping_cost is included in the credit note. One of `amount`, `lines`, or `shipping_cost` must be provided.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-credit-notes-preview-lines {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/credit_notes/preview/lines" :query-params query-params}))

(defn list-all-credit-notes-credit-note-lines
  "Retrieve a credit note's line items

  HTTP Method: GET
  Endpoint: /v1/credit_notes/{credit-note-id}/lines

  Path Parameters:
    - credit-note-id (String): The credit-note-id parameter. (required)

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-credit-notes-credit-note-lines {:credit-note-id example-credit-note-id :query-params {:limit 10}})"
  [{:keys [credit-note-id query-params]}]
  (stripe-request :get {:endpoint "/v1/credit_notes/{credit-note-id}/lines" :path-params {:credit-note-id credit-note-id} :query-params query-params}))

(defn list-all-credit-notes
  "List all credit notes

  HTTP Method: GET
  Endpoint: /v1/credit_notes

  Query Parameters:
    - created (Unknown): Only return credit notes that were created during the given date interval.
    - customer (String): Only return credit notes for the customer specified by this customer ID.
    - customer-account (String): Only return credit notes for the account representing the customer specified by this account ID.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - invoice (String): Only return credit notes for the invoice specified by this invoice ID.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-credit-notes {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/credit_notes" :query-params query-params}))

(defn create-credit-notes
  "Create a credit note

  HTTP Method: POST
  Endpoint: /v1/credit_notes

  Example Usage:
    (create-credit-notes {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/credit_notes"}))

(defn retrieve-credit-notes-id
  "Retrieve a credit note

  HTTP Method: GET
  Endpoint: /v1/credit_notes/{credit-note-id}

  Path Parameters:
    - credit-note-id (String): The credit-note-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-credit-notes-id {:credit-note-id example-credit-note-id :query-params {:limit 10}})"
  [{:keys [credit-note-id query-params]}]
  (stripe-request :get {:endpoint "/v1/credit_notes/{credit-note-id}" :path-params {:credit-note-id credit-note-id} :query-params query-params}))

(defn update-credit-notes-id
  "Update a credit note

  HTTP Method: POST
  Endpoint: /v1/credit_notes/{credit-note-id}

  Path Parameters:
    - credit-note-id (String): The credit-note-id parameter. (required)

  Example Usage:
    (update-credit-notes-id {:credit-note-id example-credit-note-id})"
  [{:keys [credit-note-id]}]
  (stripe-request :post {:endpoint "/v1/credit_notes/{credit-note-id}" :path-params {:credit-note-id credit-note-id}}))

(defn list-all-credit-notes-preview
  "Preview a credit note

  HTTP Method: GET
  Endpoint: /v1/credit_notes/preview

  Query Parameters:
    - amount (Integer): The integer amount in cents (or local equivalent) representing the total amount of the credit note. One of `amount`, `lines`, or `shipping_cost` must be provided.
    - credit-amount (Integer): The integer amount in cents (or local equivalent) representing the amount to credit the customer's balance, which will be automatically applied to their next invoice.
    - effective-at (Integer): The date when this credit note is in effect. Same as `created` unless overwritten. When defined, this value replaces the system-generated 'Date of issue' printed on the credit note PDF.
    - email-type (String): Type of email to send to the customer, one of `credit_note` or `none` and the default is `credit_note`.
    - expand (Array): Specifies which fields in the response should be expanded.
    - invoice (String): ID of the invoice. (required)
    - lines (Array): Line items that make up the credit note. One of `amount`, `lines`, or `shipping_cost` must be provided.
    - memo (String): The credit note's memo appears on the credit note PDF.
    - metadata (Object): Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format. Individual keys can be unset by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
    - out-of-band-amount (Integer): The integer amount in cents (or local equivalent) representing the amount that is credited outside of Stripe.
    - reason (String): Reason for issuing this credit note, one of `duplicate`, `fraudulent`, `order_change`, or `product_unsatisfactory`
    - refund-amount (Integer): The integer amount in cents (or local equivalent) representing the amount to refund. If set, a refund will be created for the charge associated with the invoice.
    - refunds (Array): Refunds to link to this credit note.
    - shipping-cost (Object): When shipping_cost contains the shipping_rate from the invoice, the shipping_cost is included in the credit note. One of `amount`, `lines`, or `shipping_cost` must be provided.

  Example Usage:
    (list-all-credit-notes-preview {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/credit_notes/preview" :query-params query-params}))