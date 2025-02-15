(ns stream.clojure.stripe.api.credit-notes
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-credit-notes-id-void [{:keys [credit-note-id]}]
  "Void a credit note

  HTTP Method: POST
  Endpoint: /v1/credit_notes/{credit-note-id}/void

  Path Parameters:
    - credit-note-id: The credit-note-id parameter. (required) [type: string]

  Example Usage:
    (post-credit-notes-id-void {:credit-note-id example-credit-note-id})"
  (stripe-request :post {:endpoint "/v1/credit_notes/{credit-note-id}/void" :path-params {:credit-note-id credit-note-id}}))

(defn list-all-credit-notes-preview-lines [{:keys [query-params]}]
  "Retrieve a credit note preview's line items

  HTTP Method: GET
  Endpoint: /v1/credit_notes/preview/lines

  Query Parameters:
    - amount: The integer amount in cents (or local equivalent) representing the total amount of the credit note. [type: integer]
    - credit-amount: The integer amount in cents (or local equivalent) representing the amount to credit the customer's balance, which will be automatically applied to their next invoice. [type: integer]
    - effective-at: The date when this credit note is in effect. Same as `created` unless overwritten. When defined, this value replaces the system-generated 'Date of issue' printed on the credit note PDF. [type: integer]
    - email-type: Type of email to send to the customer, one of `credit_note` or `none` and the default is `credit_note`. [type: string]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - invoice: ID of the invoice. (required) [type: string]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - lines: Line items that make up the credit note. [type: array]
    - memo: The credit note's memo appears on the credit note PDF. [type: string]
    - metadata: Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format. Individual keys can be unset by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`. [type: object]
    - out-of-band-amount: The integer amount in cents (or local equivalent) representing the amount that is credited outside of Stripe. [type: integer]
    - reason: Reason for issuing this credit note, one of `duplicate`, `fraudulent`, `order_change`, or `product_unsatisfactory` [type: string]
    - refund: ID of an existing refund to link this credit note to. [type: string]
    - refund-amount: The integer amount in cents (or local equivalent) representing the amount to refund. If set, a refund will be created for the charge associated with the invoice. [type: integer]
    - shipping-cost: When shipping_cost contains the shipping_rate from the invoice, the shipping_cost is included in the credit note. [type: object]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-credit-notes-preview-lines {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/credit_notes/preview/lines" :query-params query-params}))

(defn list-all-credit-notes-credit-note-lines [{:keys [credit-note-id query-params]}]
  "Retrieve a credit note's line items

  HTTP Method: GET
  Endpoint: /v1/credit_notes/{credit-note-id}/lines

  Path Parameters:
    - credit-note-id: The credit-note-id parameter. (required) [type: string]

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-credit-notes-credit-note-lines {:credit-note-id example-credit-note-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/credit_notes/{credit-note-id}/lines" :path-params {:credit-note-id credit-note-id} :query-params query-params}))

(defn list-all-credit-notes [{:keys [query-params]}]
  "List all credit notes

  HTTP Method: GET
  Endpoint: /v1/credit_notes

  Query Parameters:
    - created: Only return credit notes that were created during the given date interval. [type: unknown]
    - customer: Only return credit notes for the customer specified by this customer ID. [type: string]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - invoice: Only return credit notes for the invoice specified by this invoice ID. [type: string]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-credit-notes {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/credit_notes" :query-params query-params}))

(defn create-credit-notes [{:keys []}]
  "Create a credit note

  HTTP Method: POST
  Endpoint: /v1/credit_notes

  Example Usage:
    (create-credit-notes {})"
  (stripe-request :post {:endpoint "/v1/credit_notes"}))

(defn retrieve-credit-notes-id [{:keys [credit-note-id query-params]}]
  "Retrieve a credit note

  HTTP Method: GET
  Endpoint: /v1/credit_notes/{credit-note-id}

  Path Parameters:
    - credit-note-id: The credit-note-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-credit-notes-id {:credit-note-id example-credit-note-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/credit_notes/{credit-note-id}" :path-params {:credit-note-id credit-note-id} :query-params query-params}))

(defn update-credit-notes-id [{:keys [credit-note-id]}]
  "Update a credit note

  HTTP Method: POST
  Endpoint: /v1/credit_notes/{credit-note-id}

  Path Parameters:
    - credit-note-id: The credit-note-id parameter. (required) [type: string]

  Example Usage:
    (update-credit-notes-id {:credit-note-id example-credit-note-id})"
  (stripe-request :post {:endpoint "/v1/credit_notes/{credit-note-id}" :path-params {:credit-note-id credit-note-id}}))

(defn list-all-credit-notes-preview [{:keys [query-params]}]
  "Preview a credit note

  HTTP Method: GET
  Endpoint: /v1/credit_notes/preview

  Query Parameters:
    - amount: The integer amount in cents (or local equivalent) representing the total amount of the credit note. [type: integer]
    - credit-amount: The integer amount in cents (or local equivalent) representing the amount to credit the customer's balance, which will be automatically applied to their next invoice. [type: integer]
    - effective-at: The date when this credit note is in effect. Same as `created` unless overwritten. When defined, this value replaces the system-generated 'Date of issue' printed on the credit note PDF. [type: integer]
    - email-type: Type of email to send to the customer, one of `credit_note` or `none` and the default is `credit_note`. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - invoice: ID of the invoice. (required) [type: string]
    - lines: Line items that make up the credit note. [type: array]
    - memo: The credit note's memo appears on the credit note PDF. [type: string]
    - metadata: Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format. Individual keys can be unset by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`. [type: object]
    - out-of-band-amount: The integer amount in cents (or local equivalent) representing the amount that is credited outside of Stripe. [type: integer]
    - reason: Reason for issuing this credit note, one of `duplicate`, `fraudulent`, `order_change`, or `product_unsatisfactory` [type: string]
    - refund: ID of an existing refund to link this credit note to. [type: string]
    - refund-amount: The integer amount in cents (or local equivalent) representing the amount to refund. If set, a refund will be created for the charge associated with the invoice. [type: integer]
    - shipping-cost: When shipping_cost contains the shipping_rate from the invoice, the shipping_cost is included in the credit note. [type: object]

  Example Usage:
    (list-all-credit-notes-preview {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/credit_notes/preview" :query-params query-params}))