(ns stream.clojure.stripe.api.invoices
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-upcoming-lines
  "Retrieve an upcoming invoice's line items

  HTTP Method: GET
  Endpoint: /v1/invoices/upcoming/lines

  Query Parameters:
    - automatic-tax (Object): Settings for automatic tax lookup for this invoice preview.
    - coupon (String): The ID of the coupon to apply to this phase of the subscription schedule. This field has been deprecated and will be removed in a future API version. Use `discounts` instead.
    - currency (String): The currency to preview this invoice in. Defaults to that of `customer` if not specified.
    - customer (String): The identifier of the customer whose upcoming invoice you'd like to retrieve. If `automatic_tax` is enabled then one of `customer`, `customer_details`, `subscription`, or `schedule` must be set.
    - customer-details (Object): Details about the customer you want to invoice or overrides for an existing customer. If `automatic_tax` is enabled then one of `customer`, `customer_details`, `subscription`, or `schedule` must be set.
    - discounts (Unknown): The coupons to redeem into discounts for the invoice preview. If not specified, inherits the discount from the subscription or customer. This works for both coupons directly applied to an invoice and coupons applied to a subscription. Pass an empty string to avoid inheriting any discounts.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - invoice-items (Array): List of invoice items to add or update in the upcoming invoice preview (up to 250).
    - issuer (Object): The connected account that issues the invoice. The invoice is presented with the branding and support information of the specified account.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - on-behalf-of (Unknown): The account (if any) for which the funds of the invoice payment are intended. If set, the invoice will be presented with the branding and support information of the specified account. See the [Invoices with Connect](https://stripe.com/docs/billing/invoices/connect) documentation for details.
    - preview-mode (String): Customizes the types of values to include when calculating the invoice. Defaults to `next` if unspecified.
    - schedule (String): The identifier of the schedule whose upcoming invoice you'd like to retrieve. Cannot be used with subscription or subscription fields.
    - schedule-details (Object): The schedule creation or modification params to apply as a preview. Cannot be used with `subscription` or `subscription_` prefixed fields.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - subscription (String): The identifier of the subscription for which you'd like to retrieve the upcoming invoice. If not provided, but a `subscription_details.items` is provided, you will preview creating a subscription with those items. If neither `subscription` nor `subscription_details.items` is provided, you will retrieve the next upcoming invoice from among the customer's subscriptions.
    - subscription-billing-cycle-anchor (Unknown): For new subscriptions, a future timestamp to anchor the subscription's [billing cycle](https://stripe.com/docs/subscriptions/billing-cycle). This is used to determine the date of the first full invoice, and, for plans with `month` or `year` intervals, the day of the month for subsequent invoices. For existing subscriptions, the value can only be set to `now` or `unchanged`. This field has been deprecated and will be removed in a future API version. Use `subscription_details.billing_cycle_anchor` instead.
    - subscription-cancel-at (Unknown): A timestamp at which the subscription should cancel. If set to a date before the current period ends, this will cause a proration if prorations have been enabled using `proration_behavior`. If set during a future period, this will always cause a proration for that period. This field has been deprecated and will be removed in a future API version. Use `subscription_details.cancel_at` instead.
    - subscription-cancel-at-period-end (Boolean): Indicate whether this subscription should cancel at the end of the current period (`current_period_end`). Defaults to `false`. This field has been deprecated and will be removed in a future API version. Use `subscription_details.cancel_at_period_end` instead.
    - subscription-cancel-now (Boolean): This simulates the subscription being canceled or expired immediately. This field has been deprecated and will be removed in a future API version. Use `subscription_details.cancel_now` instead.
    - subscription-default-tax-rates (Unknown): If provided, the invoice returned will preview updating or creating a subscription with these default tax rates. The default tax rates will apply to any line item that does not have `tax_rates` set. This field has been deprecated and will be removed in a future API version. Use `subscription_details.default_tax_rates` instead.
    - subscription-details (Object): The subscription creation or modification params to apply as a preview. Cannot be used with `schedule` or `schedule_details` fields.
    - subscription-items (Array): A list of up to 20 subscription items, each with an attached price. This field has been deprecated and will be removed in a future API version. Use `subscription_details.items` instead.
    - subscription-proration-behavior (String): Determines how to handle [prorations](https://stripe.com/docs/billing/subscriptions/prorations) when the billing cycle changes (e.g., when switching plans, resetting `billing_cycle_anchor=now`, or starting a trial), or if an item's `quantity` changes. The default value is `create_prorations`. This field has been deprecated and will be removed in a future API version. Use `subscription_details.proration_behavior` instead.
    - subscription-proration-date (Integer): If previewing an update to a subscription, and doing proration, `subscription_proration_date` forces the proration to be calculated as though the update was done at the specified time. The time given must be within the current subscription period and within the current phase of the schedule backing this subscription, if the schedule exists. If set, `subscription`, and one of `subscription_items`, or `subscription_trial_end` are required. Also, `subscription_proration_behavior` cannot be set to 'none'. This field has been deprecated and will be removed in a future API version. Use `subscription_details.proration_date` instead.
    - subscription-resume-at (String): For paused subscriptions, setting `subscription_resume_at` to `now` will preview the invoice that will be generated if the subscription is resumed. This field has been deprecated and will be removed in a future API version. Use `subscription_details.resume_at` instead.
    - subscription-start-date (Integer): Date a subscription is intended to start (can be future or past). This field has been deprecated and will be removed in a future API version. Use `subscription_details.start_date` instead.
    - subscription-trial-end (Unknown): If provided, the invoice returned will preview updating or creating a subscription with that trial end. If set, one of `subscription_items` or `subscription` is required. This field has been deprecated and will be removed in a future API version. Use `subscription_details.trial_end` instead.

  Example Usage:
    (list-all-upcoming-lines {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/invoices/upcoming/lines" :query-params query-params}))

(defn create-create-preview
  "Create a preview invoice

  HTTP Method: POST
  Endpoint: /v1/invoices/create_preview

  Example Usage:
    (create-create-preview {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/invoices/create_preview"}))

(defn list-all-search
  "Search invoices

  HTTP Method: GET
  Endpoint: /v1/invoices/search

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - page (String): A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results.
    - query (String): The search query string. See [search query language](https://stripe.com/docs/search#search-query-language) and the list of supported [query fields for invoices](https://stripe.com/docs/search#query-fields-for-invoices). (required)

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
  [{:keys [invoice-id]}]
  (stripe-request :post {:endpoint "/v1/invoices/{invoice-id}/void" :path-params {:invoice-id invoice-id}}))

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
  [{:keys [invoice-id]}]
  (stripe-request :post {:endpoint "/v1/invoices/{invoice-id}/update_lines" :path-params {:invoice-id invoice-id}}))

(defn post-invoice-add-lines
  "Bulk add invoice line items

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice-id}/add_lines

  Path Parameters:
    - invoice-id (String): The invoice-id parameter. (required)

  Example Usage:
    (post-invoice-add-lines {:invoice-id example-invoice-id})"
  [{:keys [invoice-id]}]
  (stripe-request :post {:endpoint "/v1/invoices/{invoice-id}/add_lines" :path-params {:invoice-id invoice-id}}))

(defn post-invoice-send
  "Send an invoice for manual payment

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice-id}/send

  Path Parameters:
    - invoice-id (String): The invoice-id parameter. (required)

  Example Usage:
    (post-invoice-send {:invoice-id example-invoice-id})"
  [{:keys [invoice-id]}]
  (stripe-request :post {:endpoint "/v1/invoices/{invoice-id}/send" :path-params {:invoice-id invoice-id}}))

(defn post-invoice-mark-uncollectible
  "Mark an invoice as uncollectible

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice-id}/mark_uncollectible

  Path Parameters:
    - invoice-id (String): The invoice-id parameter. (required)

  Example Usage:
    (post-invoice-mark-uncollectible {:invoice-id example-invoice-id})"
  [{:keys [invoice-id]}]
  (stripe-request :post {:endpoint "/v1/invoices/{invoice-id}/mark_uncollectible" :path-params {:invoice-id invoice-id}}))

(defn post-invoice-finalize
  "Finalize an invoice

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice-id}/finalize

  Path Parameters:
    - invoice-id (String): The invoice-id parameter. (required)

  Example Usage:
    (post-invoice-finalize {:invoice-id example-invoice-id})"
  [{:keys [invoice-id]}]
  (stripe-request :post {:endpoint "/v1/invoices/{invoice-id}/finalize" :path-params {:invoice-id invoice-id}}))

(defn update-invoice-lines-line-item-id
  "Update an invoice's line item

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice-id}/lines/{line-id}

  Path Parameters:
    - invoice-id (String): Invoice ID of line item
    - line-id (String): Invoice line item ID

  Example Usage:
    (update-invoice-lines-line-item-id {:invoice-id example-invoice-id :line-id example-line-id})"
  [{:keys [invoice-id line-id]}]
  (stripe-request :post {:endpoint "/v1/invoices/{invoice-id}/lines/{line-id}" :path-params {:invoice-id invoice-id :line-id line-id}}))

(defn list-all
  "List all invoices

  HTTP Method: GET
  Endpoint: /v1/invoices

  Query Parameters:
    - collection-method (String): The collection method of the invoice to retrieve. Either `charge_automatically` or `send_invoice`.
    - created (Unknown): Only return invoices that were created during the given date interval.
    - customer (String): Only return invoices for the customer specified by this customer ID.
    - due-date (Unknown): The due-date parameter.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): The status of the invoice, one of `draft`, `open`, `paid`, `uncollectible`, or `void`. [Learn more](https://stripe.com/docs/billing/invoices/workflow#workflow-overview)
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
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/invoices"}))

(defn post-invoice-remove-lines
  "Bulk remove invoice line items

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice-id}/remove_lines

  Path Parameters:
    - invoice-id (String): The invoice-id parameter. (required)

  Example Usage:
    (post-invoice-remove-lines {:invoice-id example-invoice-id})"
  [{:keys [invoice-id]}]
  (stripe-request :post {:endpoint "/v1/invoices/{invoice-id}/remove_lines" :path-params {:invoice-id invoice-id}}))

(defn list-all-upcoming
  "Retrieve an upcoming invoice

  HTTP Method: GET
  Endpoint: /v1/invoices/upcoming

  Query Parameters:
    - automatic-tax (Object): Settings for automatic tax lookup for this invoice preview.
    - coupon (String): The ID of the coupon to apply to this phase of the subscription schedule. This field has been deprecated and will be removed in a future API version. Use `discounts` instead.
    - currency (String): The currency to preview this invoice in. Defaults to that of `customer` if not specified.
    - customer (String): The identifier of the customer whose upcoming invoice you'd like to retrieve. If `automatic_tax` is enabled then one of `customer`, `customer_details`, `subscription`, or `schedule` must be set.
    - customer-details (Object): Details about the customer you want to invoice or overrides for an existing customer. If `automatic_tax` is enabled then one of `customer`, `customer_details`, `subscription`, or `schedule` must be set.
    - discounts (Unknown): The coupons to redeem into discounts for the invoice preview. If not specified, inherits the discount from the subscription or customer. This works for both coupons directly applied to an invoice and coupons applied to a subscription. Pass an empty string to avoid inheriting any discounts.
    - expand (Array): Specifies which fields in the response should be expanded.
    - invoice-items (Array): List of invoice items to add or update in the upcoming invoice preview (up to 250).
    - issuer (Object): The connected account that issues the invoice. The invoice is presented with the branding and support information of the specified account.
    - on-behalf-of (Unknown): The account (if any) for which the funds of the invoice payment are intended. If set, the invoice will be presented with the branding and support information of the specified account. See the [Invoices with Connect](https://stripe.com/docs/billing/invoices/connect) documentation for details.
    - preview-mode (String): Customizes the types of values to include when calculating the invoice. Defaults to `next` if unspecified.
    - schedule (String): The identifier of the schedule whose upcoming invoice you'd like to retrieve. Cannot be used with subscription or subscription fields.
    - schedule-details (Object): The schedule creation or modification params to apply as a preview. Cannot be used with `subscription` or `subscription_` prefixed fields.
    - subscription (String): The identifier of the subscription for which you'd like to retrieve the upcoming invoice. If not provided, but a `subscription_details.items` is provided, you will preview creating a subscription with those items. If neither `subscription` nor `subscription_details.items` is provided, you will retrieve the next upcoming invoice from among the customer's subscriptions.
    - subscription-billing-cycle-anchor (Unknown): For new subscriptions, a future timestamp to anchor the subscription's [billing cycle](https://stripe.com/docs/subscriptions/billing-cycle). This is used to determine the date of the first full invoice, and, for plans with `month` or `year` intervals, the day of the month for subsequent invoices. For existing subscriptions, the value can only be set to `now` or `unchanged`. This field has been deprecated and will be removed in a future API version. Use `subscription_details.billing_cycle_anchor` instead.
    - subscription-cancel-at (Unknown): A timestamp at which the subscription should cancel. If set to a date before the current period ends, this will cause a proration if prorations have been enabled using `proration_behavior`. If set during a future period, this will always cause a proration for that period. This field has been deprecated and will be removed in a future API version. Use `subscription_details.cancel_at` instead.
    - subscription-cancel-at-period-end (Boolean): Indicate whether this subscription should cancel at the end of the current period (`current_period_end`). Defaults to `false`. This field has been deprecated and will be removed in a future API version. Use `subscription_details.cancel_at_period_end` instead.
    - subscription-cancel-now (Boolean): This simulates the subscription being canceled or expired immediately. This field has been deprecated and will be removed in a future API version. Use `subscription_details.cancel_now` instead.
    - subscription-default-tax-rates (Unknown): If provided, the invoice returned will preview updating or creating a subscription with these default tax rates. The default tax rates will apply to any line item that does not have `tax_rates` set. This field has been deprecated and will be removed in a future API version. Use `subscription_details.default_tax_rates` instead.
    - subscription-details (Object): The subscription creation or modification params to apply as a preview. Cannot be used with `schedule` or `schedule_details` fields.
    - subscription-items (Array): A list of up to 20 subscription items, each with an attached price. This field has been deprecated and will be removed in a future API version. Use `subscription_details.items` instead.
    - subscription-proration-behavior (String): Determines how to handle [prorations](https://stripe.com/docs/billing/subscriptions/prorations) when the billing cycle changes (e.g., when switching plans, resetting `billing_cycle_anchor=now`, or starting a trial), or if an item's `quantity` changes. The default value is `create_prorations`. This field has been deprecated and will be removed in a future API version. Use `subscription_details.proration_behavior` instead.
    - subscription-proration-date (Integer): If previewing an update to a subscription, and doing proration, `subscription_proration_date` forces the proration to be calculated as though the update was done at the specified time. The time given must be within the current subscription period and within the current phase of the schedule backing this subscription, if the schedule exists. If set, `subscription`, and one of `subscription_items`, or `subscription_trial_end` are required. Also, `subscription_proration_behavior` cannot be set to 'none'. This field has been deprecated and will be removed in a future API version. Use `subscription_details.proration_date` instead.
    - subscription-resume-at (String): For paused subscriptions, setting `subscription_resume_at` to `now` will preview the invoice that will be generated if the subscription is resumed. This field has been deprecated and will be removed in a future API version. Use `subscription_details.resume_at` instead.
    - subscription-start-date (Integer): Date a subscription is intended to start (can be future or past). This field has been deprecated and will be removed in a future API version. Use `subscription_details.start_date` instead.
    - subscription-trial-end (Unknown): If provided, the invoice returned will preview updating or creating a subscription with that trial end. If set, one of `subscription_items` or `subscription` is required. This field has been deprecated and will be removed in a future API version. Use `subscription_details.trial_end` instead.

  Example Usage:
    (list-all-upcoming {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/invoices/upcoming" :query-params query-params}))

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

(defn update-invoice
  "Update an invoice

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice-id}

  Path Parameters:
    - invoice-id (String): The invoice-id parameter. (required)

  Example Usage:
    (update-invoice {:invoice-id example-invoice-id})"
  [{:keys [invoice-id]}]
  (stripe-request :post {:endpoint "/v1/invoices/{invoice-id}" :path-params {:invoice-id invoice-id}}))

(defn post-invoice-pay
  "Pay an invoice

  HTTP Method: POST
  Endpoint: /v1/invoices/{invoice-id}/pay

  Path Parameters:
    - invoice-id (String): The invoice-id parameter. (required)

  Example Usage:
    (post-invoice-pay {:invoice-id example-invoice-id})"
  [{:keys [invoice-id]}]
  (stripe-request :post {:endpoint "/v1/invoices/{invoice-id}/pay" :path-params {:invoice-id invoice-id}}))