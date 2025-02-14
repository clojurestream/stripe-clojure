(ns stream.clojure.stripe.api.credit-notes
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn create-credit-notes [id params]
  """
  Void a credit note

  HTTP Method: POST
  Endpoint: /v1/credit_notes/{id}/void

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :post (str "/v1/credit_notes/" id "/void") params))

(defn retrieve-credit-notes [params]
  """
  Retrieve a credit note preview's line items

  HTTP Method: GET
  Endpoint: /v1/credit_notes/preview/lines

  Query Parameters:
    - amount: The integer amount in cents (or local equivalent) representing the total amount of the credit note.
    - credit_amount: The integer amount in cents (or local equivalent) representing the amount to credit the customer's balance, which will be automatically applied to their next invoice.
    - effective_at: The date when this credit note is in effect. Same as `created` unless overwritten. When defined, this value replaces the system-generated 'Date of issue' printed on the credit note PDF.
    - email_type: Type of email to send to the customer, one of `credit_note` or `none` and the default is `credit_note`.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - invoice: ID of the invoice.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - lines: Line items that make up the credit note.
    - memo: The credit note's memo appears on the credit note PDF.
    - metadata: Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format. Individual keys can be unset by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
    - out_of_band_amount: The integer amount in cents (or local equivalent) representing the amount that is credited outside of Stripe.
    - reason: Reason for issuing this credit note, one of `duplicate`, `fraudulent`, `order_change`, or `product_unsatisfactory`
    - refund: ID of an existing refund to link this credit note to.
    - refund_amount: The integer amount in cents (or local equivalent) representing the amount to refund. If set, a refund will be created for the charge associated with the invoice.
    - shipping_cost: When shipping_cost contains the shipping_rate from the invoice, the shipping_cost is included in the credit note.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/credit_notes/preview/lines") params))

(defn retrieve-credit-notes [credit_note params]
  """
  Retrieve a credit note's line items

  HTTP Method: GET
  Endpoint: /v1/credit_notes/{credit_note}/lines

  Path Parameters:
    - credit_note: Path parameter.

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/credit_notes/" credit_note "/lines") params))

(defn retrieve-credit-notes [params]
  """
  List all credit notes

  HTTP Method: GET
  Endpoint: /v1/credit_notes

  Query Parameters:
    - created: Only return credit notes that were created during the given date interval.
    - customer: Only return credit notes for the customer specified by this customer ID.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - invoice: Only return credit notes for the invoice specified by this invoice ID.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/credit_notes") params))

(defn create-credit-notes [params]
  """
  Create a credit note

  HTTP Method: POST
  Endpoint: /v1/credit_notes

  """
  (stripe-request :post (str "/v1/credit_notes") params))

(defn retrieve-credit-notes [id params]
  """
  Retrieve a credit note

  HTTP Method: GET
  Endpoint: /v1/credit_notes/{id}

  Path Parameters:
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/credit_notes/" id "") params))

(defn create-credit-notes [id params]
  """
  Update a credit note

  HTTP Method: POST
  Endpoint: /v1/credit_notes/{id}

  Path Parameters:
    - id: Path parameter.

  """
  (stripe-request :post (str "/v1/credit_notes/" id "") params))

(defn retrieve-credit-notes [params]
  """
  Preview a credit note

  HTTP Method: GET
  Endpoint: /v1/credit_notes/preview

  Query Parameters:
    - amount: The integer amount in cents (or local equivalent) representing the total amount of the credit note.
    - credit_amount: The integer amount in cents (or local equivalent) representing the amount to credit the customer's balance, which will be automatically applied to their next invoice.
    - effective_at: The date when this credit note is in effect. Same as `created` unless overwritten. When defined, this value replaces the system-generated 'Date of issue' printed on the credit note PDF.
    - email_type: Type of email to send to the customer, one of `credit_note` or `none` and the default is `credit_note`.
    - expand: Specifies which fields in the response should be expanded.
    - invoice: ID of the invoice.
    - lines: Line items that make up the credit note.
    - memo: The credit note's memo appears on the credit note PDF.
    - metadata: Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format. Individual keys can be unset by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
    - out_of_band_amount: The integer amount in cents (or local equivalent) representing the amount that is credited outside of Stripe.
    - reason: Reason for issuing this credit note, one of `duplicate`, `fraudulent`, `order_change`, or `product_unsatisfactory`
    - refund: ID of an existing refund to link this credit note to.
    - refund_amount: The integer amount in cents (or local equivalent) representing the amount to refund. If set, a refund will be created for the charge associated with the invoice.
    - shipping_cost: When shipping_cost contains the shipping_rate from the invoice, the shipping_cost is included in the credit note.

  """
  (stripe-request :get (str "/v1/credit_notes/preview") params))