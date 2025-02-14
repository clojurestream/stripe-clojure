(ns stream.clojure.stripe.api.invoices
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-invoices [params]
  """
  Retrieve an upcoming invoice's line items

  HTTP Method: GET
  Endpoint: /v1/invoices/upcoming/lines

  Query Parameters:
    - automatic_tax: Settings for automatic tax lookup for this invoice preview.
    - coupon: The ID of the coupon to apply to this phase of the subscription schedule. This field has been deprecated and will be removed in a future API version. Use `discounts` instead.
    - currency: The currency to preview this invoice in. Defaults to that of `customer` if not specified.
    - customer: The identifier of the customer whose upcoming invoice you'd like to retrieve. If `automatic_tax` is enabled then one of `customer`, `customer_details`, `subscription`, or `schedule` must be set.
    - customer_details: Details about the customer you want to invoice or overrides for an existing customer. If `automatic_tax` is enabled then one of `customer`, `customer_details`, `subscription`, or `schedule` must be set.
    - discounts: The coupons to redeem into discounts for the invoice preview. If not specified, inherits the discount from the subscription or customer. This works for both coupons directly applied to an invoice and coupons applied to a subscription. Pass an empty string to avoid inheriting any discounts.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - invoice_items: List of invoice items to add or update in the upcoming invoice preview (up to 250).
    - issuer: The connected account that issues the invoice. The invoice is presented with the branding and support information of the specified account.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - on_behalf_of: The account (if any) for which the funds of the invoice payment are intended. If set, the invoice will be presented with the branding and support information of the specified account. See the [Invoices with Connect](https://stripe.com/docs/billing/invoices/connect) documentation for details.
    - preview_mode: Customizes the types of values to include when calculating the invoice. Defaults to `next` if unspecified.
    - schedule: The identifier of the schedule whose upcoming invoice you'd like to retrieve. Cannot be used with subscription or subscription fields.
    - schedule_details: The schedule creation or modification params to apply as a preview. Cannot be used with `subscription` or `subscription_` prefixed fields.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - subscription: The identifier of the subscription for which you'd like to retrieve the upcoming invoice. If not provided, but a `subscription_details.items` is provided, you will preview creating a subscription with those items. If neither `subscription` nor `subscription_details.items` is provided, you will retrieve the next upcoming invoice from among the customer's subscriptions.
    - subscription_billing_cycle_anchor: For new subscriptions, a future timestamp to anchor the subscription's [billing cycle](https://stripe.com/docs/subscriptions/billing-cycle). This is used to determine the date of the first full invoice, and, for plans with `month` or `year` intervals, the day of the month for subsequent invoices. For existing subscriptions, the value can only be set to `now` or `unchanged`. This field has been deprecated and will be removed in a future API version. Use `subscription_details.billing_cycle_anchor` instead.
    - subscription_cancel_at: A timestamp at which the subscription should cancel. If set to a date before the current period ends, this will cause a proration if prorations have been enabled using `proration_behavior`. If set during a future period, this will always cause a proration for that period. This field has been deprecated and will be removed in a future API version. Use `subscription_details.cancel_at` instead.
    - subscription_cancel_at_period_end: Indicate whether this subscription should cancel at the end of the current period (`current_period_end`). Defaults to `false`. This field has been deprecated and will be removed in a future API version. Use `subscription_details.cancel_at_period_end` instead.
    - subscription_cancel_now: This simulates the subscription being canceled or expired immediately. This field has been deprecated and will be removed in a future API version. Use `subscription_details.cancel_now` instead.
    - subscription_default_tax_rates: If provided, the invoice returned will preview updating or creating a subscription with these default tax rates. The default tax rates will apply to any line item that does not have `tax_rates` set. This field has been deprecated and will be removed in a future API version. Use `subscription_details.default_tax_rates` instead.
    - subscription_details: The subscription creation or modification params to apply as a preview. Cannot be used with `schedule` or `schedule_details` fields.
    - subscription_items: A list of up to 20 subscription items, each with an attached price. This field has been deprecated and will be removed in a future API version. Use `subscription_details.items` instead.
    - subscription_proration_behavior: Determines how to handle [prorations](https://stripe.com/docs/billing/subscriptions/prorations) when the billing cycle changes (e.g., when switching plans, resetting `billing_cycle_anchor=now`, or starting a trial), or if an item's `quantity` changes. The default value is `create_prorations`. This field has been deprecated and will be removed in a future API version. Use `subscription_details.proration_behavior` instead.
    - subscription_proration_date: If previewing an update to a subscription, and doing proration, `subscription_proration_date` forces the proration to be calculated as though the update was done at the specified time. The time given must be within the current subscription period and within the current phase of the schedule backing this subscription, if the schedule exists. If set, `subscription`, and one of `subscription_items`, or `subscription_trial_end` are required. Also, `subscription_proration_behavior` cannot be set to 'none'. This field has been deprecated and will be removed in a future API version. Use `subscription_details.proration_date` instead.
    - subscription_resume_at: For paused subscriptions, setting `subscription_resume_at` to `now` will preview the invoice that will be generated if the subscription is resumed. This field has been deprecated and will be removed in a future API version. Use `subscription_details.resume_at` instead.
    - subscription_start_date: Date a subscription is intended to start (can be future or past). This field has been deprecated and will be removed in a future API version. Use `subscription_details.start_date` instead.
    - subscription_trial_end: If provided, the invoice returned will preview updating or creating a subscription with that trial end. If set, one of `subscription_items` or `subscription` is required. This field has been deprecated and will be removed in a future API version. Use `subscription_details.trial_end` instead.

  """
  (stripe-request :get (str "/v1/invoices/upcoming/lines") params))

(defn create-invoices [params]
  """
  Create a preview invoice

  HTTP Method: POST
  Endpoint: /v1/invoices/create_preview

  """
  (stripe-request :post (str "/v1/invoices/create_preview") params))

(defn retrieve-invoices [params]
  """
  Search invoices

  HTTP Method: GET
  Endpoint: /v1/invoices/search

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - page: A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results.
    - query: The search query string. See [search query language](https://stripe.com/docs/search#search-query-language) and the list of supported [query fields for invoices](https://stripe.com/docs/search#query-fields-for-invoices).

  """
  (stripe-request :get (str "/v1/invoices/search") params))

(defn create-invoices [invoice params]
  """
  Void an invoice

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice}/void

  Path Parameters:
    - invoice: Path parameter.

  """
  (stripe-request :post (str "/v1/invoices/" invoice "/void") params))

(defn retrieve-invoices [invoice params]
  """
  Retrieve an invoice's line items

  HTTP Method: GET
  Endpoint: /v1/invoices/{invoice}/lines

  Path Parameters:
    - invoice: Path parameter.

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/invoices/" invoice "/lines") params))

(defn create-invoices [invoice params]
  """
  Bulk update invoice line items

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice}/update_lines

  Path Parameters:
    - invoice: Path parameter.

  """
  (stripe-request :post (str "/v1/invoices/" invoice "/update_lines") params))

(defn create-invoices [invoice params]
  """
  Bulk add invoice line items

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice}/add_lines

  Path Parameters:
    - invoice: Path parameter.

  """
  (stripe-request :post (str "/v1/invoices/" invoice "/add_lines") params))

(defn create-invoices [invoice params]
  """
  Send an invoice for manual payment

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice}/send

  Path Parameters:
    - invoice: Path parameter.

  """
  (stripe-request :post (str "/v1/invoices/" invoice "/send") params))

(defn create-invoices [invoice params]
  """
  Mark an invoice as uncollectible

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice}/mark_uncollectible

  Path Parameters:
    - invoice: Path parameter.

  """
  (stripe-request :post (str "/v1/invoices/" invoice "/mark_uncollectible") params))

(defn create-invoices [invoice params]
  """
  Finalize an invoice

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice}/finalize

  Path Parameters:
    - invoice: Path parameter.

  """
  (stripe-request :post (str "/v1/invoices/" invoice "/finalize") params))

(defn create-invoices [invoice line_item_id params]
  """
  Update an invoice's line item

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice}/lines/{line_item_id}

  Path Parameters:
    - invoice: Path parameter.
    - line_item_id: Path parameter.

  """
  (stripe-request :post (str "/v1/invoices/" invoice "/lines/" line_item_id "") params))

(defn retrieve-invoices [params]
  """
  List all invoices

  HTTP Method: GET
  Endpoint: /v1/invoices

  Query Parameters:
    - collection_method: The collection method of the invoice to retrieve. Either `charge_automatically` or `send_invoice`.
    - created: Only return invoices that were created during the given date interval.
    - customer: Only return invoices for the customer specified by this customer ID.
    - due_date: 
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: The status of the invoice, one of `draft`, `open`, `paid`, `uncollectible`, or `void`. [Learn more](https://stripe.com/docs/billing/invoices/workflow#workflow-overview)
    - subscription: Only return invoices for the subscription specified by this subscription ID.

  """
  (stripe-request :get (str "/v1/invoices") params))

(defn create-invoices [params]
  """
  Create an invoice

  HTTP Method: POST
  Endpoint: /v1/invoices

  """
  (stripe-request :post (str "/v1/invoices") params))

(defn create-invoices [invoice params]
  """
  Bulk remove invoice line items

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice}/remove_lines

  Path Parameters:
    - invoice: Path parameter.

  """
  (stripe-request :post (str "/v1/invoices/" invoice "/remove_lines") params))

(defn retrieve-invoices [params]
  """
  Retrieve an upcoming invoice

  HTTP Method: GET
  Endpoint: /v1/invoices/upcoming

  Query Parameters:
    - automatic_tax: Settings for automatic tax lookup for this invoice preview.
    - coupon: The ID of the coupon to apply to this phase of the subscription schedule. This field has been deprecated and will be removed in a future API version. Use `discounts` instead.
    - currency: The currency to preview this invoice in. Defaults to that of `customer` if not specified.
    - customer: The identifier of the customer whose upcoming invoice you'd like to retrieve. If `automatic_tax` is enabled then one of `customer`, `customer_details`, `subscription`, or `schedule` must be set.
    - customer_details: Details about the customer you want to invoice or overrides for an existing customer. If `automatic_tax` is enabled then one of `customer`, `customer_details`, `subscription`, or `schedule` must be set.
    - discounts: The coupons to redeem into discounts for the invoice preview. If not specified, inherits the discount from the subscription or customer. This works for both coupons directly applied to an invoice and coupons applied to a subscription. Pass an empty string to avoid inheriting any discounts.
    - expand: Specifies which fields in the response should be expanded.
    - invoice_items: List of invoice items to add or update in the upcoming invoice preview (up to 250).
    - issuer: The connected account that issues the invoice. The invoice is presented with the branding and support information of the specified account.
    - on_behalf_of: The account (if any) for which the funds of the invoice payment are intended. If set, the invoice will be presented with the branding and support information of the specified account. See the [Invoices with Connect](https://stripe.com/docs/billing/invoices/connect) documentation for details.
    - preview_mode: Customizes the types of values to include when calculating the invoice. Defaults to `next` if unspecified.
    - schedule: The identifier of the schedule whose upcoming invoice you'd like to retrieve. Cannot be used with subscription or subscription fields.
    - schedule_details: The schedule creation or modification params to apply as a preview. Cannot be used with `subscription` or `subscription_` prefixed fields.
    - subscription: The identifier of the subscription for which you'd like to retrieve the upcoming invoice. If not provided, but a `subscription_details.items` is provided, you will preview creating a subscription with those items. If neither `subscription` nor `subscription_details.items` is provided, you will retrieve the next upcoming invoice from among the customer's subscriptions.
    - subscription_billing_cycle_anchor: For new subscriptions, a future timestamp to anchor the subscription's [billing cycle](https://stripe.com/docs/subscriptions/billing-cycle). This is used to determine the date of the first full invoice, and, for plans with `month` or `year` intervals, the day of the month for subsequent invoices. For existing subscriptions, the value can only be set to `now` or `unchanged`. This field has been deprecated and will be removed in a future API version. Use `subscription_details.billing_cycle_anchor` instead.
    - subscription_cancel_at: A timestamp at which the subscription should cancel. If set to a date before the current period ends, this will cause a proration if prorations have been enabled using `proration_behavior`. If set during a future period, this will always cause a proration for that period. This field has been deprecated and will be removed in a future API version. Use `subscription_details.cancel_at` instead.
    - subscription_cancel_at_period_end: Indicate whether this subscription should cancel at the end of the current period (`current_period_end`). Defaults to `false`. This field has been deprecated and will be removed in a future API version. Use `subscription_details.cancel_at_period_end` instead.
    - subscription_cancel_now: This simulates the subscription being canceled or expired immediately. This field has been deprecated and will be removed in a future API version. Use `subscription_details.cancel_now` instead.
    - subscription_default_tax_rates: If provided, the invoice returned will preview updating or creating a subscription with these default tax rates. The default tax rates will apply to any line item that does not have `tax_rates` set. This field has been deprecated and will be removed in a future API version. Use `subscription_details.default_tax_rates` instead.
    - subscription_details: The subscription creation or modification params to apply as a preview. Cannot be used with `schedule` or `schedule_details` fields.
    - subscription_items: A list of up to 20 subscription items, each with an attached price. This field has been deprecated and will be removed in a future API version. Use `subscription_details.items` instead.
    - subscription_proration_behavior: Determines how to handle [prorations](https://stripe.com/docs/billing/subscriptions/prorations) when the billing cycle changes (e.g., when switching plans, resetting `billing_cycle_anchor=now`, or starting a trial), or if an item's `quantity` changes. The default value is `create_prorations`. This field has been deprecated and will be removed in a future API version. Use `subscription_details.proration_behavior` instead.
    - subscription_proration_date: If previewing an update to a subscription, and doing proration, `subscription_proration_date` forces the proration to be calculated as though the update was done at the specified time. The time given must be within the current subscription period and within the current phase of the schedule backing this subscription, if the schedule exists. If set, `subscription`, and one of `subscription_items`, or `subscription_trial_end` are required. Also, `subscription_proration_behavior` cannot be set to 'none'. This field has been deprecated and will be removed in a future API version. Use `subscription_details.proration_date` instead.
    - subscription_resume_at: For paused subscriptions, setting `subscription_resume_at` to `now` will preview the invoice that will be generated if the subscription is resumed. This field has been deprecated and will be removed in a future API version. Use `subscription_details.resume_at` instead.
    - subscription_start_date: Date a subscription is intended to start (can be future or past). This field has been deprecated and will be removed in a future API version. Use `subscription_details.start_date` instead.
    - subscription_trial_end: If provided, the invoice returned will preview updating or creating a subscription with that trial end. If set, one of `subscription_items` or `subscription` is required. This field has been deprecated and will be removed in a future API version. Use `subscription_details.trial_end` instead.

  """
  (stripe-request :get (str "/v1/invoices/upcoming") params))

(defn delete-invoices [invoice params]
  """
  Delete a draft invoice

  HTTP Method: DELETE
  Endpoint: /v1/invoices/{invoice}

  Path Parameters:
    - invoice: Path parameter.

  """
  (stripe-request :delete (str "/v1/invoices/" invoice "") params))

(defn retrieve-invoices [invoice params]
  """
  Retrieve an invoice

  HTTP Method: GET
  Endpoint: /v1/invoices/{invoice}

  Path Parameters:
    - invoice: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/invoices/" invoice "") params))

(defn create-invoices [invoice params]
  """
  Update an invoice

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice}

  Path Parameters:
    - invoice: Path parameter.

  """
  (stripe-request :post (str "/v1/invoices/" invoice "") params))

(defn create-invoices [invoice params]
  """
  Pay an invoice

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice}/pay

  Path Parameters:
    - invoice: Path parameter.

  """
  (stripe-request :post (str "/v1/invoices/" invoice "/pay") params))