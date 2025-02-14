(ns stream.clojure.stripe.api
  "WARNING: This file is auto-generated from Stripe's OpenAPI spec.
  DO NOT MODIFY THIS FILE MANUALLY. Any changes will be overwritten.
  ALPHA: Work-in-progress - expect breaking changes before the stable release."
 (:require [stream.clojure.stripe.request :refer [stripe-request]]))

(defn post-billing-alerts-id-archive [id params]
  """
  Archive a billing alert

  HTTP Method: POST
  Endpoint: v1/billing/alerts/{id}/archive

  Path Parameters:
    - id: 

  """
  (stripe-request :post (str "v1/billing/alerts/" id "/archive") params))

(defn post-climate-orders-order-cancel [order params]
  """
  Cancel an order

  HTTP Method: POST
  Endpoint: v1/climate/orders/{order}/cancel

  Path Parameters:
    - order: Unique identifier of the order.

  """
  (stripe-request :post (str "v1/climate/orders/" order "/cancel") params))

(defn get-subscription-schedules [params params]
  """
  List all schedules

  HTTP Method: GET
  Endpoint: v1/subscription_schedules

  Query Parameters:
    - canceled_at: Only return subscription schedules that were created canceled the given date interval.
    - completed_at: Only return subscription schedules that completed during the given date interval.
    - created: Only return subscription schedules that were created during the given date interval.
    - customer: Only return subscription schedules for the given customer.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - released_at: Only return subscription schedules that were released during the given date interval.
    - scheduled: Only return subscription schedules that have not started yet.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/subscription_schedules") params))

(defn post-subscription-schedules [params params]
  """
  Create a schedule

  HTTP Method: POST
  Endpoint: v1/subscription_schedules

  """
  (stripe-request :post (str "v1/subscription_schedules") params))

(defn get-radar-early-fraud-warnings [params params]
  """
  List all early fraud warnings

  HTTP Method: GET
  Endpoint: v1/radar/early_fraud_warnings

  Query Parameters:
    - charge: Only return early fraud warnings for the charge specified by this charge ID.
    - created: Only return early fraud warnings that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - payment_intent: Only return early fraud warnings for charges that were created by the PaymentIntent specified by this PaymentIntent ID.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/radar/early_fraud_warnings") params))

(defn get-treasury-transaction-entries-id [id params]
  """
  Retrieve a TransactionEntry

  HTTP Method: GET
  Endpoint: v1/treasury/transaction_entries/{id}

  Path Parameters:
    - id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/treasury/transaction_entries/" id "") params))

(defn post-test-helpers-treasury-outbound-payments-id-fail [id params]
  """
  Test mode: Fail an OutboundPayment

  HTTP Method: POST
  Endpoint: v1/test_helpers/treasury/outbound_payments/{id}/fail

  Path Parameters:
    - id: 

  """
  (stripe-request :post (str "v1/test_helpers/treasury/outbound_payments/" id "/fail") params))

(defn get-tax-ids [params params]
  """
  List all tax IDs

  HTTP Method: GET
  Endpoint: v1/tax_ids

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - owner: The account or customer the tax ID belongs to. Defaults to `owner[type]=self`.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/tax_ids") params))

(defn post-tax-ids [params params]
  """
  Create a tax ID

  HTTP Method: POST
  Endpoint: v1/tax_ids

  """
  (stripe-request :post (str "v1/tax_ids") params))

(defn get-climate-suppliers [params params]
  """
  List suppliers

  HTTP Method: GET
  Endpoint: v1/climate/suppliers

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/climate/suppliers") params))

(defn get-linked-accounts-account [account params]
  """
  Retrieve an Account

  HTTP Method: GET
  Endpoint: v1/linked_accounts/{account}

  Path Parameters:
    - account: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/linked_accounts/" account "") params))

(defn get-tax-registrations-id [id params]
  """
  Retrieve a registration

  HTTP Method: GET
  Endpoint: v1/tax/registrations/{id}

  Path Parameters:
    - id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/tax/registrations/" id "") params))

(defn post-tax-registrations-id [id params]
  """
  Update a registration

  HTTP Method: POST
  Endpoint: v1/tax/registrations/{id}

  Path Parameters:
    - id: 

  """
  (stripe-request :post (str "v1/tax/registrations/" id "") params))

(defn get-balance-history [params params]
  """
  List all balance transactions

  HTTP Method: GET
  Endpoint: v1/balance/history

  Query Parameters:
    - created: Only return transactions that were created during the given date interval.
    - currency: Only return transactions in a certain currency. Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - payout: For automatic Stripe payouts only, only returns transactions that were paid out on the specified payout ID.
    - source: Only returns the original transaction.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - type: Only returns transactions of the given type. One of: `adjustment`, `advance`, `advance_funding`, `anticipation_repayment`, `application_fee`, `application_fee_refund`, `charge`, `climate_order_purchase`, `climate_order_refund`, `connect_collection_transfer`, `contribution`, `issuing_authorization_hold`, `issuing_authorization_release`, `issuing_dispute`, `issuing_transaction`, `obligation_outbound`, `obligation_reversal_inbound`, `payment`, `payment_failure_refund`, `payment_network_reserve_hold`, `payment_network_reserve_release`, `payment_refund`, `payment_reversal`, `payment_unreconciled`, `payout`, `payout_cancel`, `payout_failure`, `payout_minimum_balance_hold`, `payout_minimum_balance_release`, `refund`, `refund_failure`, `reserve_transaction`, `reserved_funds`, `stripe_fee`, `stripe_fx_fee`, `tax_fee`, `topup`, `topup_reversal`, `transfer`, `transfer_cancel`, `transfer_failure`, or `transfer_refund`.

  """
  (stripe-request :get (str "v1/balance/history") params))

(defn get-promotion-codes-promotion-code [promotion_code params]
  """
  Retrieve a promotion code

  HTTP Method: GET
  Endpoint: v1/promotion_codes/{promotion_code}

  Path Parameters:
    - promotion_code: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/promotion_codes/" promotion_code "") params))

(defn post-promotion-codes-promotion-code [promotion_code params]
  """
  Update a promotion code

  HTTP Method: POST
  Endpoint: v1/promotion_codes/{promotion_code}

  Path Parameters:
    - promotion_code: 

  """
  (stripe-request :post (str "v1/promotion_codes/" promotion_code "") params))

(defn get-customers-customer-cash-balance-transactions-transaction [customer transaction params]
  """
  Retrieve a cash balance transaction

  HTTP Method: GET
  Endpoint: v1/customers/{customer}/cash_balance_transactions/{transaction}

  Path Parameters:
    - customer: 
    - transaction: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/customers/" customer "/cash_balance_transactions/" transaction "") params))

(defn get-topups [params params]
  """
  List all top-ups

  HTTP Method: GET
  Endpoint: v1/topups

  Query Parameters:
    - amount: A positive integer representing how much to transfer.
    - created: A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return top-ups that have the given status. One of `canceled`, `failed`, `pending` or `succeeded`.

  """
  (stripe-request :get (str "v1/topups") params))

(defn post-topups [params params]
  """
  Create a top-up

  HTTP Method: POST
  Endpoint: v1/topups

  """
  (stripe-request :post (str "v1/topups") params))

(defn get-payment-links-payment-link [payment_link params]
  """
  Retrieve payment link

  HTTP Method: GET
  Endpoint: v1/payment_links/{payment_link}

  Path Parameters:
    - payment_link: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/payment_links/" payment_link "") params))

(defn post-payment-links-payment-link [payment_link params]
  """
  Update a payment link

  HTTP Method: POST
  Endpoint: v1/payment_links/{payment_link}

  Path Parameters:
    - payment_link: 

  """
  (stripe-request :post (str "v1/payment_links/" payment_link "") params))

(defn get-payment-method-domains [params params]
  """
  List payment method domains

  HTTP Method: GET
  Endpoint: v1/payment_method_domains

  Query Parameters:
    - domain_name: The domain name that this payment method domain object represents.
    - enabled: Whether this payment method domain is enabled. If the domain is not enabled, payment methods will not appear in Elements
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/payment_method_domains") params))

(defn post-payment-method-domains [params params]
  """
  Create a payment method domain

  HTTP Method: POST
  Endpoint: v1/payment_method_domains

  """
  (stripe-request :post (str "v1/payment_method_domains") params))

(defn post-billing-portal-sessions [params params]
  """
  Create a portal session

  HTTP Method: POST
  Endpoint: v1/billing_portal/sessions

  """
  (stripe-request :post (str "v1/billing_portal/sessions") params))

(defn post-account-links [params params]
  """
  Create an account link

  HTTP Method: POST
  Endpoint: v1/account_links

  """
  (stripe-request :post (str "v1/account_links") params))

(defn get-sources-source-source-transactions-source-transaction [source source_transaction params]
  """
  Retrieve a source transaction

  HTTP Method: GET
  Endpoint: v1/sources/{source}/source_transactions/{source_transaction}

  Path Parameters:
    - source: 
    - source_transaction: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/sources/" source "/source_transactions/" source_transaction "") params))

(defn get-invoices-upcoming-lines [params params]
  """
  Retrieve an upcoming invoice's line items

  HTTP Method: GET
  Endpoint: v1/invoices/upcoming/lines

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
  (stripe-request :get (str "v1/invoices/upcoming/lines") params))

(defn get-issuing-disputes-dispute [dispute params]
  """
  Retrieve a dispute

  HTTP Method: GET
  Endpoint: v1/issuing/disputes/{dispute}

  Path Parameters:
    - dispute: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/issuing/disputes/" dispute "") params))

(defn post-issuing-disputes-dispute [dispute params]
  """
  Update a dispute

  HTTP Method: POST
  Endpoint: v1/issuing/disputes/{dispute}

  Path Parameters:
    - dispute: 

  """
  (stripe-request :post (str "v1/issuing/disputes/" dispute "") params))

(defn get-climate-products [params params]
  """
  List products

  HTTP Method: GET
  Endpoint: v1/climate/products

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/climate/products") params))

(defn post-refunds-refund-cancel [refund params]
  """
  Cancel a refund

  HTTP Method: POST
  Endpoint: v1/refunds/{refund}/cancel

  Path Parameters:
    - refund: 

  """
  (stripe-request :post (str "v1/refunds/" refund "/cancel") params))

(defn post-tax-transactions-create-reversal [params params]
  """
  Create a reversal transaction

  HTTP Method: POST
  Endpoint: v1/tax/transactions/create_reversal

  """
  (stripe-request :post (str "v1/tax/transactions/create_reversal") params))

(defn delete-terminal-configurations-configuration [configuration params]
  """
  Delete a Configuration

  HTTP Method: DELETE
  Endpoint: v1/terminal/configurations/{configuration}

  Path Parameters:
    - configuration: 

  """
  (stripe-request :delete (str "v1/terminal/configurations/" configuration "") params))

(defn get-terminal-configurations-configuration [configuration params]
  """
  Retrieve a Configuration

  HTTP Method: GET
  Endpoint: v1/terminal/configurations/{configuration}

  Path Parameters:
    - configuration: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/terminal/configurations/" configuration "") params))

(defn post-terminal-configurations-configuration [configuration params]
  """
  Update a Configuration

  HTTP Method: POST
  Endpoint: v1/terminal/configurations/{configuration}

  Path Parameters:
    - configuration: 

  """
  (stripe-request :post (str "v1/terminal/configurations/" configuration "") params))

(defn get-mandates-mandate [mandate params]
  """
  Retrieve a Mandate

  HTTP Method: GET
  Endpoint: v1/mandates/{mandate}

  Path Parameters:
    - mandate: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/mandates/" mandate "") params))

(defn get-prices [params params]
  """
  List all prices

  HTTP Method: GET
  Endpoint: v1/prices

  Query Parameters:
    - active: Only return prices that are active or inactive (e.g., pass `false` to list all inactive prices).
    - created: A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options.
    - currency: Only return prices for the given currency.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - lookup_keys: Only return the price with these lookup_keys, if any exist. You can specify up to 10 lookup_keys.
    - product: Only return prices for the given product.
    - recurring: Only return prices with these recurring fields.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - type: Only return prices of type `recurring` or `one_time`.

  """
  (stripe-request :get (str "v1/prices") params))

(defn post-prices [params params]
  """
  Create a price

  HTTP Method: POST
  Endpoint: v1/prices

  """
  (stripe-request :post (str "v1/prices") params))

(defn post-setup-intents-intent-cancel [intent params]
  """
  Cancel a SetupIntent

  HTTP Method: POST
  Endpoint: v1/setup_intents/{intent}/cancel

  Path Parameters:
    - intent: 

  """
  (stripe-request :post (str "v1/setup_intents/" intent "/cancel") params))

(defn get-identity-verification-sessions [params params]
  """
  List VerificationSessions

  HTTP Method: GET
  Endpoint: v1/identity/verification_sessions

  Query Parameters:
    - client_reference_id: A string to reference this user. This can be a customer ID, a session ID, or similar, and can be used to reconcile this verification with your internal systems.
    - created: Only return VerificationSessions that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - related_customer: 
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return VerificationSessions with this status. [Learn more about the lifecycle of sessions](https://stripe.com/docs/identity/how-sessions-work).

  """
  (stripe-request :get (str "v1/identity/verification_sessions") params))

(defn post-identity-verification-sessions [params params]
  """
  Create a VerificationSession

  HTTP Method: POST
  Endpoint: v1/identity/verification_sessions

  """
  (stripe-request :post (str "v1/identity/verification_sessions") params))

(defn get-treasury-outbound-payments-id [id params]
  """
  Retrieve an OutboundPayment

  HTTP Method: GET
  Endpoint: v1/treasury/outbound_payments/{id}

  Path Parameters:
    - id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/treasury/outbound_payments/" id "") params))

(defn post-test-helpers-treasury-outbound-transfers-outbound-transfer-post [outbound_transfer params]
  """
  Test mode: Post an OutboundTransfer

  HTTP Method: POST
  Endpoint: v1/test_helpers/treasury/outbound_transfers/{outbound_transfer}/post

  Path Parameters:
    - outbound_transfer: 

  """
  (stripe-request :post (str "v1/test_helpers/treasury/outbound_transfers/" outbound_transfer "/post") params))

(defn post-test-helpers-issuing-authorizations-authorization-finalize-amount [authorization params]
  """
  Finalize a test-mode authorization's amount

  HTTP Method: POST
  Endpoint: v1/test_helpers/issuing/authorizations/{authorization}/finalize_amount

  Path Parameters:
    - authorization: 

  """
  (stripe-request :post (str "v1/test_helpers/issuing/authorizations/" authorization "/finalize_amount") params))

(defn post-sources-source-verify [source params]
  """
  No description available.

  HTTP Method: POST
  Endpoint: v1/sources/{source}/verify

  Path Parameters:
    - source: 

  """
  (stripe-request :post (str "v1/sources/" source "/verify") params))

(defn get-treasury-transactions [params params]
  """
  List all Transactions

  HTTP Method: GET
  Endpoint: v1/treasury/transactions

  Query Parameters:
    - created: Only return Transactions that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - financial_account: Returns objects associated with this FinancialAccount.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - order_by: The results are in reverse chronological order by `created` or `posted_at`. The default is `created`.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return Transactions that have the given status: `open`, `posted`, or `void`.
    - status_transitions: A filter for the `status_transitions.posted_at` timestamp. When using this filter, `status=posted` and `order_by=posted_at` must also be specified.

  """
  (stripe-request :get (str "v1/treasury/transactions") params))

(defn get-checkout-sessions-session [session params]
  """
  Retrieve a Session

  HTTP Method: GET
  Endpoint: v1/checkout/sessions/{session}

  Path Parameters:
    - session: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/checkout/sessions/" session "") params))

(defn post-checkout-sessions-session [session params]
  """
  Update a Session

  HTTP Method: POST
  Endpoint: v1/checkout/sessions/{session}

  Path Parameters:
    - session: 

  """
  (stripe-request :post (str "v1/checkout/sessions/" session "") params))

(defn get-climate-products-product [product params]
  """
  Retrieve a product

  HTTP Method: GET
  Endpoint: v1/climate/products/{product}

  Path Parameters:
    - product: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/climate/products/" product "") params))

(defn post-financial-connections-sessions [params params]
  """
  Create a Session

  HTTP Method: POST
  Endpoint: v1/financial_connections/sessions

  """
  (stripe-request :post (str "v1/financial_connections/sessions") params))

(defn post-invoice-rendering-templates-template-archive [template params]
  """
  Archive an invoice rendering template

  HTTP Method: POST
  Endpoint: v1/invoice_rendering_templates/{template}/archive

  Path Parameters:
    - template: 

  """
  (stripe-request :post (str "v1/invoice_rendering_templates/" template "/archive") params))

(defn post-test-helpers-issuing-transactions-transaction-refund [transaction params]
  """
  Refund a test-mode transaction

  HTTP Method: POST
  Endpoint: v1/test_helpers/issuing/transactions/{transaction}/refund

  Path Parameters:
    - transaction: 

  """
  (stripe-request :post (str "v1/test_helpers/issuing/transactions/" transaction "/refund") params))

(defn post-invoices-create-preview [params params]
  """
  Create a preview invoice

  HTTP Method: POST
  Endpoint: v1/invoices/create_preview

  """
  (stripe-request :post (str "v1/invoices/create_preview") params))

(defn get-customers-customer-balance-transactions [customer params]
  """
  List customer balance transactions

  HTTP Method: GET
  Endpoint: v1/customers/{customer}/balance_transactions

  Path Parameters:
    - customer: 

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/customers/" customer "/balance_transactions") params))

(defn post-customers-customer-balance-transactions [customer params]
  """
  Create a customer balance transaction

  HTTP Method: POST
  Endpoint: v1/customers/{customer}/balance_transactions

  Path Parameters:
    - customer: 

  """
  (stripe-request :post (str "v1/customers/" customer "/balance_transactions") params))

(defn post-credit-notes-id-void [id params]
  """
  Void a credit note

  HTTP Method: POST
  Endpoint: v1/credit_notes/{id}/void

  Path Parameters:
    - id: 

  """
  (stripe-request :post (str "v1/credit_notes/" id "/void") params))

(defn get-balance-transactions [params params]
  """
  List all balance transactions

  HTTP Method: GET
  Endpoint: v1/balance_transactions

  Query Parameters:
    - created: Only return transactions that were created during the given date interval.
    - currency: Only return transactions in a certain currency. Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - payout: For automatic Stripe payouts only, only returns transactions that were paid out on the specified payout ID.
    - source: Only returns the original transaction.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - type: Only returns transactions of the given type. One of: `adjustment`, `advance`, `advance_funding`, `anticipation_repayment`, `application_fee`, `application_fee_refund`, `charge`, `climate_order_purchase`, `climate_order_refund`, `connect_collection_transfer`, `contribution`, `issuing_authorization_hold`, `issuing_authorization_release`, `issuing_dispute`, `issuing_transaction`, `obligation_outbound`, `obligation_reversal_inbound`, `payment`, `payment_failure_refund`, `payment_network_reserve_hold`, `payment_network_reserve_release`, `payment_refund`, `payment_reversal`, `payment_unreconciled`, `payout`, `payout_cancel`, `payout_failure`, `payout_minimum_balance_hold`, `payout_minimum_balance_release`, `refund`, `refund_failure`, `reserve_transaction`, `reserved_funds`, `stripe_fee`, `stripe_fx_fee`, `tax_fee`, `topup`, `topup_reversal`, `transfer`, `transfer_cancel`, `transfer_failure`, or `transfer_refund`.

  """
  (stripe-request :get (str "v1/balance_transactions") params))

(defn get-terminal-configurations [params params]
  """
  List all Configurations

  HTTP Method: GET
  Endpoint: v1/terminal/configurations

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - is_account_default: if present, only return the account default or non-default configurations.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/terminal/configurations") params))

(defn post-terminal-configurations [params params]
  """
  Create a Configuration

  HTTP Method: POST
  Endpoint: v1/terminal/configurations

  """
  (stripe-request :post (str "v1/terminal/configurations") params))

(defn get-customers-customer-payment-methods-payment-method [customer payment_method params]
  """
  Retrieve a Customer's PaymentMethod

  HTTP Method: GET
  Endpoint: v1/customers/{customer}/payment_methods/{payment_method}

  Path Parameters:
    - customer: 
    - payment_method: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/customers/" customer "/payment_methods/" payment_method "") params))

(defn post-payouts-payout-cancel [payout params]
  """
  Cancel a payout

  HTTP Method: POST
  Endpoint: v1/payouts/{payout}/cancel

  Path Parameters:
    - payout: 

  """
  (stripe-request :post (str "v1/payouts/" payout "/cancel") params))

(defn post-terminal-readers-reader-process-payment-intent [reader params]
  """
  Hand-off a PaymentIntent to a Reader

  HTTP Method: POST
  Endpoint: v1/terminal/readers/{reader}/process_payment_intent

  Path Parameters:
    - reader: 

  """
  (stripe-request :post (str "v1/terminal/readers/" reader "/process_payment_intent") params))

(defn get-files [params params]
  """
  List all files

  HTTP Method: GET
  Endpoint: v1/files

  Query Parameters:
    - created: Only return files that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - purpose: Filter queries by the file purpose. If you don't provide a purpose, the queries return unfiltered files.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/files") params))

(defn post-files [params params]
  """
  Create a file

  HTTP Method: POST
  Endpoint: v1/files

  """
  (stripe-request :post (str "v1/files") params))

(defn post-test-helpers-issuing-authorizations [params params]
  """
  Create a test-mode authorization

  HTTP Method: POST
  Endpoint: v1/test_helpers/issuing/authorizations

  """
  (stripe-request :post (str "v1/test_helpers/issuing/authorizations") params))

(defn get-invoice-rendering-templates [params params]
  """
  List all invoice rendering templates

  HTTP Method: GET
  Endpoint: v1/invoice_rendering_templates

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: 

  """
  (stripe-request :get (str "v1/invoice_rendering_templates") params))

(defn get-reporting-report-types [params params]
  """
  List all Report Types

  HTTP Method: GET
  Endpoint: v1/reporting/report_types

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/reporting/report_types") params))

(defn get-issuing-disputes [params params]
  """
  List all disputes

  HTTP Method: GET
  Endpoint: v1/issuing/disputes

  Query Parameters:
    - created: Only return Issuing disputes that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Select Issuing disputes with the given status.
    - transaction: Select the Issuing dispute for the given transaction.

  """
  (stripe-request :get (str "v1/issuing/disputes") params))

(defn post-issuing-disputes [params params]
  """
  Create a dispute

  HTTP Method: POST
  Endpoint: v1/issuing/disputes

  """
  (stripe-request :post (str "v1/issuing/disputes") params))

(defn get-billing-alerts-id [id params]
  """
  Retrieve a billing alert

  HTTP Method: GET
  Endpoint: v1/billing/alerts/{id}

  Path Parameters:
    - id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/billing/alerts/" id "") params))

(defn get-transfers-id-reversals [id params]
  """
  List all reversals

  HTTP Method: GET
  Endpoint: v1/transfers/{id}/reversals

  Path Parameters:
    - id: 

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/transfers/" id "/reversals") params))

(defn post-transfers-id-reversals [id params]
  """
  Create a transfer reversal

  HTTP Method: POST
  Endpoint: v1/transfers/{id}/reversals

  Path Parameters:
    - id: 

  """
  (stripe-request :post (str "v1/transfers/" id "/reversals") params))

(defn get-products [params params]
  """
  List all products

  HTTP Method: GET
  Endpoint: v1/products

  Query Parameters:
    - active: Only return products that are active or inactive (e.g., pass `false` to list all inactive products).
    - created: Only return products that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - ids: Only return products with the given IDs. Cannot be used with [starting_after](https://stripe.com/docs/api#list_products-starting_after) or [ending_before](https://stripe.com/docs/api#list_products-ending_before).
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - shippable: Only return products that can be shipped (i.e., physical, not digital products).
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - url: Only return products with the given url.

  """
  (stripe-request :get (str "v1/products") params))

(defn post-products [params params]
  """
  Create a product

  HTTP Method: POST
  Endpoint: v1/products

  """
  (stripe-request :post (str "v1/products") params))

(defn delete-customers-customer-subscriptions-subscription-exposed-id [customer subscription_exposed_id params]
  """
  Cancel a subscription

  HTTP Method: DELETE
  Endpoint: v1/customers/{customer}/subscriptions/{subscription_exposed_id}

  Path Parameters:
    - customer: 
    - subscription_exposed_id: 

  """
  (stripe-request :delete (str "v1/customers/" customer "/subscriptions/" subscription_exposed_id "") params))

(defn get-customers-customer-subscriptions-subscription-exposed-id [customer subscription_exposed_id params]
  """
  Retrieve a subscription

  HTTP Method: GET
  Endpoint: v1/customers/{customer}/subscriptions/{subscription_exposed_id}

  Path Parameters:
    - customer: 
    - subscription_exposed_id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/customers/" customer "/subscriptions/" subscription_exposed_id "") params))

(defn post-customers-customer-subscriptions-subscription-exposed-id [customer subscription_exposed_id params]
  """
  Update a subscription on a customer

  HTTP Method: POST
  Endpoint: v1/customers/{customer}/subscriptions/{subscription_exposed_id}

  Path Parameters:
    - customer: 
    - subscription_exposed_id: 

  """
  (stripe-request :post (str "v1/customers/" customer "/subscriptions/" subscription_exposed_id "") params))

(defn get-invoices-search [params params]
  """
  Search invoices

  HTTP Method: GET
  Endpoint: v1/invoices/search

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - page: A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results.
    - query: The search query string. See [search query language](https://stripe.com/docs/search#search-query-language) and the list of supported [query fields for invoices](https://stripe.com/docs/search#query-fields-for-invoices).

  """
  (stripe-request :get (str "v1/invoices/search") params))

(defn post-test-helpers-treasury-received-debits [params params]
  """
  Test mode: Create a ReceivedDebit

  HTTP Method: POST
  Endpoint: v1/test_helpers/treasury/received_debits

  """
  (stripe-request :post (str "v1/test_helpers/treasury/received_debits") params))

(defn get-treasury-outbound-transfers-outbound-transfer [outbound_transfer params]
  """
  Retrieve an OutboundTransfer

  HTTP Method: GET
  Endpoint: v1/treasury/outbound_transfers/{outbound_transfer}

  Path Parameters:
    - outbound_transfer: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/treasury/outbound_transfers/" outbound_transfer "") params))

(defn get-customers-customer-bank-accounts [customer params]
  """
  List all bank accounts

  HTTP Method: GET
  Endpoint: v1/customers/{customer}/bank_accounts

  Path Parameters:
    - customer: 

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/customers/" customer "/bank_accounts") params))

(defn post-customers-customer-bank-accounts [customer params]
  """
  Create a card

  HTTP Method: POST
  Endpoint: v1/customers/{customer}/bank_accounts

  Path Parameters:
    - customer: 

  """
  (stripe-request :post (str "v1/customers/" customer "/bank_accounts") params))

(defn delete-subscriptions-subscription-exposed-id [subscription_exposed_id params]
  """
  Cancel a subscription

  HTTP Method: DELETE
  Endpoint: v1/subscriptions/{subscription_exposed_id}

  Path Parameters:
    - subscription_exposed_id: 

  """
  (stripe-request :delete (str "v1/subscriptions/" subscription_exposed_id "") params))

(defn get-subscriptions-subscription-exposed-id [subscription_exposed_id params]
  """
  Retrieve a subscription

  HTTP Method: GET
  Endpoint: v1/subscriptions/{subscription_exposed_id}

  Path Parameters:
    - subscription_exposed_id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/subscriptions/" subscription_exposed_id "") params))

(defn post-subscriptions-subscription-exposed-id [subscription_exposed_id params]
  """
  Update a subscription

  HTTP Method: POST
  Endpoint: v1/subscriptions/{subscription_exposed_id}

  Path Parameters:
    - subscription_exposed_id: 

  """
  (stripe-request :post (str "v1/subscriptions/" subscription_exposed_id "") params))

(defn get-events [params params]
  """
  List all events

  HTTP Method: GET
  Endpoint: v1/events

  Query Parameters:
    - created: Only return events that were created during the given date interval.
    - delivery_success: Filter events by whether all webhooks were successfully delivered. If false, events which are still pending or have failed all delivery attempts to a webhook endpoint will be returned.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - type: A string containing a specific event name, or group of events using * as a wildcard. The list will be filtered to include only events with a matching event property.
    - types: An array of up to 20 strings containing specific event names. The list will be filtered to include only events with a matching event property. You may pass either `type` or `types`, but not both.

  """
  (stripe-request :get (str "v1/events") params))

(defn get-accounts [params params]
  """
  List all connected accounts

  HTTP Method: GET
  Endpoint: v1/accounts

  Query Parameters:
    - created: Only return connected accounts that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/accounts") params))

(defn post-accounts [params params]
  """
  No description available.

  HTTP Method: POST
  Endpoint: v1/accounts

  """
  (stripe-request :post (str "v1/accounts") params))

(defn post-terminal-readers-reader-set-reader-display [reader params]
  """
  Set reader display

  HTTP Method: POST
  Endpoint: v1/terminal/readers/{reader}/set_reader_display

  Path Parameters:
    - reader: 

  """
  (stripe-request :post (str "v1/terminal/readers/" reader "/set_reader_display") params))

(defn get-tax-codes [params params]
  """
  List all tax codes

  HTTP Method: GET
  Endpoint: v1/tax_codes

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/tax_codes") params))

(defn get-tax-transactions-transaction [transaction params]
  """
  Retrieve a transaction

  HTTP Method: GET
  Endpoint: v1/tax/transactions/{transaction}

  Path Parameters:
    - transaction: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/tax/transactions/" transaction "") params))

(defn post-invoices-invoice-void [invoice params]
  """
  Void an invoice

  HTTP Method: POST
  Endpoint: v1/invoices/{invoice}/void

  Path Parameters:
    - invoice: 

  """
  (stripe-request :post (str "v1/invoices/" invoice "/void") params))

(defn get-refunds-refund [refund params]
  """
  Retrieve a refund

  HTTP Method: GET
  Endpoint: v1/refunds/{refund}

  Path Parameters:
    - refund: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/refunds/" refund "") params))

(defn post-refunds-refund [refund params]
  """
  Update a refund

  HTTP Method: POST
  Endpoint: v1/refunds/{refund}

  Path Parameters:
    - refund: 

  """
  (stripe-request :post (str "v1/refunds/" refund "") params))

(defn get-balance-history-id [id params]
  """
  Retrieve a balance transaction

  HTTP Method: GET
  Endpoint: v1/balance/history/{id}

  Path Parameters:
    - id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/balance/history/" id "") params))

(defn get-setup-attempts [params params]
  """
  List all SetupAttempts

  HTTP Method: GET
  Endpoint: v1/setup_attempts

  Query Parameters:
    - created: A filter on the list, based on the object `created` field. The value
can be a string with an integer Unix timestamp or a
dictionary with a number of different query options.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - setup_intent: Only return SetupAttempts created by the SetupIntent specified by
this ID.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/setup_attempts") params))

(defn post-treasury-financial-accounts-financial-account-close [financial_account params]
  """
  Close a FinancialAccount

  HTTP Method: POST
  Endpoint: v1/treasury/financial_accounts/{financial_account}/close

  Path Parameters:
    - financial_account: 

  """
  (stripe-request :post (str "v1/treasury/financial_accounts/" financial_account "/close") params))

(defn post-quotes-quote-accept [quote params]
  """
  Accept a quote

  HTTP Method: POST
  Endpoint: v1/quotes/{quote}/accept

  Path Parameters:
    - quote: 

  """
  (stripe-request :post (str "v1/quotes/" quote "/accept") params))

(defn get-entitlements-features [params params]
  """
  List all features

  HTTP Method: GET
  Endpoint: v1/entitlements/features

  Query Parameters:
    - archived: If set, filter results to only include features with the given archive status.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - lookup_key: If set, filter results to only include features with the given lookup_key.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/entitlements/features") params))

(defn post-entitlements-features [params params]
  """
  Create a feature

  HTTP Method: POST
  Endpoint: v1/entitlements/features

  """
  (stripe-request :post (str "v1/entitlements/features") params))

(defn post-test-helpers-treasury-inbound-transfers-id-succeed [id params]
  """
  Test mode: Succeed an InboundTransfer

  HTTP Method: POST
  Endpoint: v1/test_helpers/treasury/inbound_transfers/{id}/succeed

  Path Parameters:
    - id: 

  """
  (stripe-request :post (str "v1/test_helpers/treasury/inbound_transfers/" id "/succeed") params))

(defn get-billing-credit-grants [params params]
  """
  List credit grants

  HTTP Method: GET
  Endpoint: v1/billing/credit_grants

  Query Parameters:
    - customer: Only return credit grants for this customer.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/billing/credit_grants") params))

(defn post-billing-credit-grants [params params]
  """
  Create a credit grant

  HTTP Method: POST
  Endpoint: v1/billing/credit_grants

  """
  (stripe-request :post (str "v1/billing/credit_grants") params))

(defn get-treasury-outbound-transfers [params params]
  """
  List all OutboundTransfers

  HTTP Method: GET
  Endpoint: v1/treasury/outbound_transfers

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - financial_account: Returns objects associated with this FinancialAccount.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return OutboundTransfers that have the given status: `processing`, `canceled`, `failed`, `posted`, or `returned`.

  """
  (stripe-request :get (str "v1/treasury/outbound_transfers") params))

(defn post-treasury-outbound-transfers [params params]
  """
  Create an OutboundTransfer

  HTTP Method: POST
  Endpoint: v1/treasury/outbound_transfers

  """
  (stripe-request :post (str "v1/treasury/outbound_transfers") params))

(defn get-webhook-endpoints [params params]
  """
  List all webhook endpoints

  HTTP Method: GET
  Endpoint: v1/webhook_endpoints

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/webhook_endpoints") params))

(defn post-webhook-endpoints [params params]
  """
  Create a webhook endpoint

  HTTP Method: POST
  Endpoint: v1/webhook_endpoints

  """
  (stripe-request :post (str "v1/webhook_endpoints") params))

(defn post-issuing-disputes-dispute-submit [dispute params]
  """
  Submit a dispute

  HTTP Method: POST
  Endpoint: v1/issuing/disputes/{dispute}/submit

  Path Parameters:
    - dispute: 

  """
  (stripe-request :post (str "v1/issuing/disputes/" dispute "/submit") params))

(defn get-financial-connections-accounts-account [account params]
  """
  Retrieve an Account

  HTTP Method: GET
  Endpoint: v1/financial_connections/accounts/{account}

  Path Parameters:
    - account: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/financial_connections/accounts/" account "") params))

(defn get-quotes-quote-line-items [quote params]
  """
  Retrieve a quote's line items

  HTTP Method: GET
  Endpoint: v1/quotes/{quote}/line_items

  Path Parameters:
    - quote: 

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/quotes/" quote "/line_items") params))

(defn post-identity-verification-sessions-session-cancel [session params]
  """
  Cancel a VerificationSession

  HTTP Method: POST
  Endpoint: v1/identity/verification_sessions/{session}/cancel

  Path Parameters:
    - session: 

  """
  (stripe-request :post (str "v1/identity/verification_sessions/" session "/cancel") params))

(defn get-balance-transactions-id [id params]
  """
  Retrieve a balance transaction

  HTTP Method: GET
  Endpoint: v1/balance_transactions/{id}

  Path Parameters:
    - id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/balance_transactions/" id "") params))

(defn get-customers-search [params params]
  """
  Search customers

  HTTP Method: GET
  Endpoint: v1/customers/search

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - page: A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results.
    - query: The search query string. See [search query language](https://stripe.com/docs/search#search-query-language) and the list of supported [query fields for customers](https://stripe.com/docs/search#query-fields-for-customers).

  """
  (stripe-request :get (str "v1/customers/search") params))

(defn get-exchange-rates-rate-id [rate_id params]
  """
  Retrieve an exchange rate

  HTTP Method: GET
  Endpoint: v1/exchange_rates/{rate_id}

  Path Parameters:
    - rate_id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/exchange_rates/" rate_id "") params))

(defn get-credit-notes-preview-lines [params params]
  """
  Retrieve a credit note preview's line items

  HTTP Method: GET
  Endpoint: v1/credit_notes/preview/lines

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
  (stripe-request :get (str "v1/credit_notes/preview/lines") params))

(defn get-events-id [id params]
  """
  Retrieve an event

  HTTP Method: GET
  Endpoint: v1/events/{id}

  Path Parameters:
    - id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/events/" id "") params))

(defn delete-subscription-items-item [item params]
  """
  Delete a subscription item

  HTTP Method: DELETE
  Endpoint: v1/subscription_items/{item}

  Path Parameters:
    - item: 

  """
  (stripe-request :delete (str "v1/subscription_items/" item "") params))

(defn get-subscription-items-item [item params]
  """
  Retrieve a subscription item

  HTTP Method: GET
  Endpoint: v1/subscription_items/{item}

  Path Parameters:
    - item: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/subscription_items/" item "") params))

(defn post-subscription-items-item [item params]
  """
  Update a subscription item

  HTTP Method: POST
  Endpoint: v1/subscription_items/{item}

  Path Parameters:
    - item: 

  """
  (stripe-request :post (str "v1/subscription_items/" item "") params))

(defn get-prices-price [price params]
  """
  Retrieve a price

  HTTP Method: GET
  Endpoint: v1/prices/{price}

  Path Parameters:
    - price: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/prices/" price "") params))

(defn post-prices-price [price params]
  """
  Update a price

  HTTP Method: POST
  Endpoint: v1/prices/{price}

  Path Parameters:
    - price: 

  """
  (stripe-request :post (str "v1/prices/" price "") params))

(defn get-reporting-report-runs [params params]
  """
  List all Report Runs

  HTTP Method: GET
  Endpoint: v1/reporting/report_runs

  Query Parameters:
    - created: Only return Report Runs that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/reporting/report_runs") params))

(defn post-reporting-report-runs [params params]
  """
  Create a Report Run

  HTTP Method: POST
  Endpoint: v1/reporting/report_runs

  """
  (stripe-request :post (str "v1/reporting/report_runs") params))

(defn get-charges [params params]
  """
  List all charges

  HTTP Method: GET
  Endpoint: v1/charges

  Query Parameters:
    - created: Only return charges that were created during the given date interval.
    - customer: Only return charges for the customer specified by this customer ID.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - payment_intent: Only return charges that were created by the PaymentIntent specified by this PaymentIntent ID.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - transfer_group: Only return charges for this transfer group, limited to 100.

  """
  (stripe-request :get (str "v1/charges") params))

(defn post-charges [params params]
  """
  No description available.

  HTTP Method: POST
  Endpoint: v1/charges

  """
  (stripe-request :post (str "v1/charges") params))

(defn get-payment-method-domains-payment-method-domain [payment_method_domain params]
  """
  Retrieve a payment method domain

  HTTP Method: GET
  Endpoint: v1/payment_method_domains/{payment_method_domain}

  Path Parameters:
    - payment_method_domain: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/payment_method_domains/" payment_method_domain "") params))

(defn post-payment-method-domains-payment-method-domain [payment_method_domain params]
  """
  Update a payment method domain

  HTTP Method: POST
  Endpoint: v1/payment_method_domains/{payment_method_domain}

  Path Parameters:
    - payment_method_domain: 

  """
  (stripe-request :post (str "v1/payment_method_domains/" payment_method_domain "") params))

(defn get-customers-customer-cards [customer params]
  """
  List all cards

  HTTP Method: GET
  Endpoint: v1/customers/{customer}/cards

  Path Parameters:
    - customer: 

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/customers/" customer "/cards") params))

(defn post-customers-customer-cards [customer params]
  """
  Create a card

  HTTP Method: POST
  Endpoint: v1/customers/{customer}/cards

  Path Parameters:
    - customer: 

  """
  (stripe-request :post (str "v1/customers/" customer "/cards") params))

(defn post-accounts-account-login-links [account params]
  """
  Create a login link

  HTTP Method: POST
  Endpoint: v1/accounts/{account}/login_links

  Path Parameters:
    - account: 

  """
  (stripe-request :post (str "v1/accounts/" account "/login_links") params))

(defn get-treasury-transaction-entries [params params]
  """
  List all TransactionEntries

  HTTP Method: GET
  Endpoint: v1/treasury/transaction_entries

  Query Parameters:
    - created: Only return TransactionEntries that were created during the given date interval.
    - effective_at: 
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - financial_account: Returns objects associated with this FinancialAccount.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - order_by: The results are in reverse chronological order by `created` or `effective_at`. The default is `created`.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - transaction: Only return TransactionEntries associated with this Transaction.

  """
  (stripe-request :get (str "v1/treasury/transaction_entries") params))

(defn post-test-helpers-issuing-personalization-designs-personalization-design-reject [personalization_design params]
  """
  Reject a testmode personalization design

  HTTP Method: POST
  Endpoint: v1/test_helpers/issuing/personalization_designs/{personalization_design}/reject

  Path Parameters:
    - personalization_design: 

  """
  (stripe-request :post (str "v1/test_helpers/issuing/personalization_designs/" personalization_design "/reject") params))

(defn get-credit-notes-credit-note-lines [credit_note params]
  """
  Retrieve a credit note's line items

  HTTP Method: GET
  Endpoint: v1/credit_notes/{credit_note}/lines

  Path Parameters:
    - credit_note: 

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/credit_notes/" credit_note "/lines") params))

(defn get-issuing-tokens [params params]
  """
  List all issuing tokens for card

  HTTP Method: GET
  Endpoint: v1/issuing/tokens

  Query Parameters:
    - card: The Issuing card identifier to list tokens for.
    - created: Only return Issuing tokens that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Select Issuing tokens with the given status.

  """
  (stripe-request :get (str "v1/issuing/tokens") params))

(defn get-billing-meters-id-event-summaries [id params]
  """
  List billing meter event summaries

  HTTP Method: GET
  Endpoint: v1/billing/meters/{id}/event_summaries

  Path Parameters:
    - id: Unique identifier for the object.

  Query Parameters:
    - customer: The customer for which to fetch event summaries.
    - end_time: The timestamp from when to stop aggregating meter events (exclusive). Must be aligned with minute boundaries.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - start_time: The timestamp from when to start aggregating meter events (inclusive). Must be aligned with minute boundaries.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - value_grouping_window: Specifies what granularity to use when generating event summaries. If not specified, a single event summary would be returned for the specified time range. For hourly granularity, start and end times must align with hour boundaries (e.g., 00:00, 01:00, ..., 23:00). For daily granularity, start and end times must align with UTC day boundaries (00:00 UTC).

  """
  (stripe-request :get (str "v1/billing/meters/" id "/event_summaries") params))

(defn post-billing-meter-event-adjustments [params params]
  """
  Create a billing meter event adjustment

  HTTP Method: POST
  Endpoint: v1/billing/meter_event_adjustments

  """
  (stripe-request :post (str "v1/billing/meter_event_adjustments") params))

(defn post-test-helpers-issuing-authorizations-authorization-reverse [authorization params]
  """
  Reverse a test-mode authorization

  HTTP Method: POST
  Endpoint: v1/test_helpers/issuing/authorizations/{authorization}/reverse

  Path Parameters:
    - authorization: 

  """
  (stripe-request :post (str "v1/test_helpers/issuing/authorizations/" authorization "/reverse") params))

(defn get-plans [params params]
  """
  List all plans

  HTTP Method: GET
  Endpoint: v1/plans

  Query Parameters:
    - active: Only return plans that are active or inactive (e.g., pass `false` to list all inactive plans).
    - created: A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - product: Only return plans for the given product.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/plans") params))

(defn post-plans [params params]
  """
  Create a plan

  HTTP Method: POST
  Endpoint: v1/plans

  """
  (stripe-request :post (str "v1/plans") params))

(defn delete-accounts-account-persons-person [account person params]
  """
  Delete a person

  HTTP Method: DELETE
  Endpoint: v1/accounts/{account}/persons/{person}

  Path Parameters:
    - account: 
    - person: 

  """
  (stripe-request :delete (str "v1/accounts/" account "/persons/" person "") params))

(defn get-accounts-account-persons-person [account person params]
  """
  Retrieve a person

  HTTP Method: GET
  Endpoint: v1/accounts/{account}/persons/{person}

  Path Parameters:
    - account: 
    - person: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/accounts/" account "/persons/" person "") params))

(defn post-accounts-account-persons-person [account person params]
  """
  Update a person

  HTTP Method: POST
  Endpoint: v1/accounts/{account}/persons/{person}

  Path Parameters:
    - account: 
    - person: 

  """
  (stripe-request :post (str "v1/accounts/" account "/persons/" person "") params))

(defn get-climate-orders [params params]
  """
  List orders

  HTTP Method: GET
  Endpoint: v1/climate/orders

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/climate/orders") params))

(defn post-climate-orders [params params]
  """
  Create an order

  HTTP Method: POST
  Endpoint: v1/climate/orders

  """
  (stripe-request :post (str "v1/climate/orders") params))

(defn get-treasury-credit-reversals-credit-reversal [credit_reversal params]
  """
  Retrieve a CreditReversal

  HTTP Method: GET
  Endpoint: v1/treasury/credit_reversals/{credit_reversal}

  Path Parameters:
    - credit_reversal: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/treasury/credit_reversals/" credit_reversal "") params))

(defn post-test-helpers-treasury-outbound-payments-id-return [id params]
  """
  Test mode: Return an OutboundPayment

  HTTP Method: POST
  Endpoint: v1/test_helpers/treasury/outbound_payments/{id}/return

  Path Parameters:
    - id: 

  """
  (stripe-request :post (str "v1/test_helpers/treasury/outbound_payments/" id "/return") params))

(defn get-payment-intents-intent [intent params]
  """
  Retrieve a PaymentIntent

  HTTP Method: GET
  Endpoint: v1/payment_intents/{intent}

  Path Parameters:
    - intent: 

  Query Parameters:
    - client_secret: The client secret of the PaymentIntent. We require it if you use a publishable key to retrieve the source.
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/payment_intents/" intent "") params))

(defn post-payment-intents-intent [intent params]
  """
  Update a PaymentIntent

  HTTP Method: POST
  Endpoint: v1/payment_intents/{intent}

  Path Parameters:
    - intent: 

  """
  (stripe-request :post (str "v1/payment_intents/" intent "") params))

(defn get-country-specs-country [country params]
  """
  Retrieve a Country Spec

  HTTP Method: GET
  Endpoint: v1/country_specs/{country}

  Path Parameters:
    - country: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/country_specs/" country "") params))

(defn get-tokens-token [token params]
  """
  Retrieve a token

  HTTP Method: GET
  Endpoint: v1/tokens/{token}

  Path Parameters:
    - token: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/tokens/" token "") params))

(defn post-test-helpers-treasury-inbound-transfers-id-fail [id params]
  """
  Test mode: Fail an InboundTransfer

  HTTP Method: POST
  Endpoint: v1/test_helpers/treasury/inbound_transfers/{id}/fail

  Path Parameters:
    - id: 

  """
  (stripe-request :post (str "v1/test_helpers/treasury/inbound_transfers/" id "/fail") params))

(defn post-test-helpers-treasury-received-credits [params params]
  """
  Test mode: Create a ReceivedCredit

  HTTP Method: POST
  Endpoint: v1/test_helpers/treasury/received_credits

  """
  (stripe-request :post (str "v1/test_helpers/treasury/received_credits") params))

(defn post-billing-alerts-id-deactivate [id params]
  """
  Deactivate a billing alert

  HTTP Method: POST
  Endpoint: v1/billing/alerts/{id}/deactivate

  Path Parameters:
    - id: 

  """
  (stripe-request :post (str "v1/billing/alerts/" id "/deactivate") params))

(defn get-transfers-transfer-reversals-id [transfer id params]
  """
  Retrieve a reversal

  HTTP Method: GET
  Endpoint: v1/transfers/{transfer}/reversals/{id}

  Path Parameters:
    - id: 
    - transfer: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/transfers/" transfer "/reversals/" id "") params))

(defn post-transfers-transfer-reversals-id [transfer id params]
  """
  Update a reversal

  HTTP Method: POST
  Endpoint: v1/transfers/{transfer}/reversals/{id}

  Path Parameters:
    - id: 
    - transfer: 

  """
  (stripe-request :post (str "v1/transfers/" transfer "/reversals/" id "") params))

(defn get-invoices-invoice-lines [invoice params]
  """
  Retrieve an invoice's line items

  HTTP Method: GET
  Endpoint: v1/invoices/{invoice}/lines

  Path Parameters:
    - invoice: 

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/invoices/" invoice "/lines") params))

(defn get-linked-accounts-account-owners [account params]
  """
  List Account Owners

  HTTP Method: GET
  Endpoint: v1/linked_accounts/{account}/owners

  Path Parameters:
    - account: 

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - ownership: The ID of the ownership object to fetch owners from.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/linked_accounts/" account "/owners") params))

(defn post-quotes-quote-finalize [quote params]
  """
  Finalize a quote

  HTTP Method: POST
  Endpoint: v1/quotes/{quote}/finalize

  Path Parameters:
    - quote: 

  """
  (stripe-request :post (str "v1/quotes/" quote "/finalize") params))

(defn get-customers-customer-cash-balance-transactions [customer params]
  """
  List cash balance transactions

  HTTP Method: GET
  Endpoint: v1/customers/{customer}/cash_balance_transactions

  Path Parameters:
    - customer: 

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/customers/" customer "/cash_balance_transactions") params))

(defn get-sigma-scheduled-query-runs [params params]
  """
  List all scheduled query runs

  HTTP Method: GET
  Endpoint: v1/sigma/scheduled_query_runs

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/sigma/scheduled_query_runs") params))

(defn get-disputes [params params]
  """
  List all disputes

  HTTP Method: GET
  Endpoint: v1/disputes

  Query Parameters:
    - charge: Only return disputes associated to the charge specified by this charge ID.
    - created: Only return disputes that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - payment_intent: Only return disputes associated to the PaymentIntent specified by this PaymentIntent ID.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/disputes") params))

(defn get-issuing-personalization-designs-personalization-design [personalization_design params]
  """
  Retrieve a personalization design

  HTTP Method: GET
  Endpoint: v1/issuing/personalization_designs/{personalization_design}

  Path Parameters:
    - personalization_design: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/issuing/personalization_designs/" personalization_design "") params))

(defn post-issuing-personalization-designs-personalization-design [personalization_design params]
  """
  Update a personalization design

  HTTP Method: POST
  Endpoint: v1/issuing/personalization_designs/{personalization_design}

  Path Parameters:
    - personalization_design: 

  """
  (stripe-request :post (str "v1/issuing/personalization_designs/" personalization_design "") params))

(defn get-treasury-financial-accounts-financial-account-features [financial_account params]
  """
  Retrieve FinancialAccount Features

  HTTP Method: GET
  Endpoint: v1/treasury/financial_accounts/{financial_account}/features

  Path Parameters:
    - financial_account: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/treasury/financial_accounts/" financial_account "/features") params))

(defn post-treasury-financial-accounts-financial-account-features [financial_account params]
  """
  Update FinancialAccount Features

  HTTP Method: POST
  Endpoint: v1/treasury/financial_accounts/{financial_account}/features

  Path Parameters:
    - financial_account: 

  """
  (stripe-request :post (str "v1/treasury/financial_accounts/" financial_account "/features") params))

(defn get-transfers [params params]
  """
  List all transfers

  HTTP Method: GET
  Endpoint: v1/transfers

  Query Parameters:
    - created: Only return transfers that were created during the given date interval.
    - destination: Only return transfers for the destination specified by this account ID.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - transfer_group: Only return transfers with the specified transfer group.

  """
  (stripe-request :get (str "v1/transfers") params))

(defn post-transfers [params params]
  """
  Create a transfer

  HTTP Method: POST
  Endpoint: v1/transfers

  """
  (stripe-request :post (str "v1/transfers") params))

(defn post-invoices-invoice-update-lines [invoice params]
  """
  Bulk update invoice line items

  HTTP Method: POST
  Endpoint: v1/invoices/{invoice}/update_lines

  Path Parameters:
    - invoice: 

  """
  (stripe-request :post (str "v1/invoices/" invoice "/update_lines") params))

(defn post-billing-credit-grants-id-expire [id params]
  """
  Expire a credit grant

  HTTP Method: POST
  Endpoint: v1/billing/credit_grants/{id}/expire

  Path Parameters:
    - id: Unique identifier for the object.

  """
  (stripe-request :post (str "v1/billing/credit_grants/" id "/expire") params))

(defn get-products-search [params params]
  """
  Search products

  HTTP Method: GET
  Endpoint: v1/products/search

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - page: A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results.
    - query: The search query string. See [search query language](https://stripe.com/docs/search#search-query-language) and the list of supported [query fields for products](https://stripe.com/docs/search#query-fields-for-products).

  """
  (stripe-request :get (str "v1/products/search") params))

(defn delete-tax-ids-id [id params]
  """
  Delete a tax ID

  HTTP Method: DELETE
  Endpoint: v1/tax_ids/{id}

  Path Parameters:
    - id: 

  """
  (stripe-request :delete (str "v1/tax_ids/" id "") params))

(defn get-tax-ids-id [id params]
  """
  Retrieve a tax ID

  HTTP Method: GET
  Endpoint: v1/tax_ids/{id}

  Path Parameters:
    - id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/tax_ids/" id "") params))

(defn post-linked-accounts-account-refresh [account params]
  """
  Refresh Account data

  HTTP Method: POST
  Endpoint: v1/linked_accounts/{account}/refresh

  Path Parameters:
    - account: 

  """
  (stripe-request :post (str "v1/linked_accounts/" account "/refresh") params))

(defn get-checkout-sessions [params params]
  """
  List all Checkout Sessions

  HTTP Method: GET
  Endpoint: v1/checkout/sessions

  Query Parameters:
    - created: Only return Checkout Sessions that were created during the given date interval.
    - customer: Only return the Checkout Sessions for the Customer specified.
    - customer_details: Only return the Checkout Sessions for the Customer details specified.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - payment_intent: Only return the Checkout Session for the PaymentIntent specified.
    - payment_link: Only return the Checkout Sessions for the Payment Link specified.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return the Checkout Sessions matching the given status.
    - subscription: Only return the Checkout Session for the subscription specified.

  """
  (stripe-request :get (str "v1/checkout/sessions") params))

(defn post-checkout-sessions [params params]
  """
  Create a Session

  HTTP Method: POST
  Endpoint: v1/checkout/sessions

  """
  (stripe-request :post (str "v1/checkout/sessions") params))

(defn delete-customers-customer-subscriptions-subscription-exposed-id-discount [customer subscription_exposed_id params]
  """
  Delete a customer discount

  HTTP Method: DELETE
  Endpoint: v1/customers/{customer}/subscriptions/{subscription_exposed_id}/discount

  Path Parameters:
    - customer: 
    - subscription_exposed_id: 

  """
  (stripe-request :delete (str "v1/customers/" customer "/subscriptions/" subscription_exposed_id "/discount") params))

(defn get-customers-customer-subscriptions-subscription-exposed-id-discount [customer subscription_exposed_id params]
  """
  No description available.

  HTTP Method: GET
  Endpoint: v1/customers/{customer}/subscriptions/{subscription_exposed_id}/discount

  Path Parameters:
    - customer: 
    - subscription_exposed_id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/customers/" customer "/subscriptions/" subscription_exposed_id "/discount") params))

(defn get-application-fees-id-refunds [id params]
  """
  List all application fee refunds

  HTTP Method: GET
  Endpoint: v1/application_fees/{id}/refunds

  Path Parameters:
    - id: 

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/application_fees/" id "/refunds") params))

(defn post-application-fees-id-refunds [id params]
  """
  Create an application fee refund

  HTTP Method: POST
  Endpoint: v1/application_fees/{id}/refunds

  Path Parameters:
    - id: 

  """
  (stripe-request :post (str "v1/application_fees/" id "/refunds") params))

(defn get-issuing-cardholders [params params]
  """
  List all cardholders

  HTTP Method: GET
  Endpoint: v1/issuing/cardholders

  Query Parameters:
    - created: Only return cardholders that were created during the given date interval.
    - email: Only return cardholders that have the given email address.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - phone_number: Only return cardholders that have the given phone number.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return cardholders that have the given status. One of `active`, `inactive`, or `blocked`.
    - type: Only return cardholders that have the given type. One of `individual` or `company`.

  """
  (stripe-request :get (str "v1/issuing/cardholders") params))

(defn post-issuing-cardholders [params params]
  """
  Create a cardholder

  HTTP Method: POST
  Endpoint: v1/issuing/cardholders

  """
  (stripe-request :post (str "v1/issuing/cardholders") params))

(defn get-customers-customer-tax-ids [customer params]
  """
  List all Customer tax IDs

  HTTP Method: GET
  Endpoint: v1/customers/{customer}/tax_ids

  Path Parameters:
    - customer: 

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/customers/" customer "/tax_ids") params))

(defn post-customers-customer-tax-ids [customer params]
  """
  Create a Customer tax ID

  HTTP Method: POST
  Endpoint: v1/customers/{customer}/tax_ids

  Path Parameters:
    - customer: 

  """
  (stripe-request :post (str "v1/customers/" customer "/tax_ids") params))

(defn post-financial-connections-accounts-account-refresh [account params]
  """
  Refresh Account data

  HTTP Method: POST
  Endpoint: v1/financial_connections/accounts/{account}/refresh

  Path Parameters:
    - account: 

  """
  (stripe-request :post (str "v1/financial_connections/accounts/" account "/refresh") params))

(defn post-financial-connections-accounts-account-unsubscribe [account params]
  """
  Unsubscribe from data refreshes for an Account

  HTTP Method: POST
  Endpoint: v1/financial_connections/accounts/{account}/unsubscribe

  Path Parameters:
    - account: 

  """
  (stripe-request :post (str "v1/financial_connections/accounts/" account "/unsubscribe") params))

(defn post-billing-meters-id-deactivate [id params]
  """
  Deactivate a billing meter

  HTTP Method: POST
  Endpoint: v1/billing/meters/{id}/deactivate

  Path Parameters:
    - id: Unique identifier for the object.

  """
  (stripe-request :post (str "v1/billing/meters/" id "/deactivate") params))

(defn get-subscription-items [params params]
  """
  List all subscription items

  HTTP Method: GET
  Endpoint: v1/subscription_items

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - subscription: The ID of the subscription whose items will be retrieved.

  """
  (stripe-request :get (str "v1/subscription_items") params))

(defn post-subscription-items [params params]
  """
  Create a subscription item

  HTTP Method: POST
  Endpoint: v1/subscription_items

  """
  (stripe-request :post (str "v1/subscription_items") params))

(defn delete-apple-pay-domains-domain [domain params]
  """
  No description available.

  HTTP Method: DELETE
  Endpoint: v1/apple_pay/domains/{domain}

  Path Parameters:
    - domain: 

  """
  (stripe-request :delete (str "v1/apple_pay/domains/" domain "") params))

(defn get-apple-pay-domains-domain [domain params]
  """
  No description available.

  HTTP Method: GET
  Endpoint: v1/apple_pay/domains/{domain}

  Path Parameters:
    - domain: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/apple_pay/domains/" domain "") params))

(defn delete-accounts-account-bank-accounts-id [account id params]
  """
  Delete an external account

  HTTP Method: DELETE
  Endpoint: v1/accounts/{account}/bank_accounts/{id}

  Path Parameters:
    - account: 
    - id: 

  """
  (stripe-request :delete (str "v1/accounts/" account "/bank_accounts/" id "") params))

(defn get-accounts-account-bank-accounts-id [account id params]
  """
  Retrieve an external account

  HTTP Method: GET
  Endpoint: v1/accounts/{account}/bank_accounts/{id}

  Path Parameters:
    - account: 
    - id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/accounts/" account "/bank_accounts/" id "") params))

(defn post-accounts-account-bank-accounts-id [account id params]
  """
  No description available.

  HTTP Method: POST
  Endpoint: v1/accounts/{account}/bank_accounts/{id}

  Path Parameters:
    - account: 
    - id: 

  """
  (stripe-request :post (str "v1/accounts/" account "/bank_accounts/" id "") params))

(defn post-financial-connections-accounts-account-disconnect [account params]
  """
  Disconnect an Account

  HTTP Method: POST
  Endpoint: v1/financial_connections/accounts/{account}/disconnect

  Path Parameters:
    - account: 

  """
  (stripe-request :post (str "v1/financial_connections/accounts/" account "/disconnect") params))

(defn get-reporting-report-types-report-type [report_type params]
  """
  Retrieve a Report Type

  HTTP Method: GET
  Endpoint: v1/reporting/report_types/{report_type}

  Path Parameters:
    - report_type: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/reporting/report_types/" report_type "") params))

(defn get-apps-secrets [params params]
  """
  List secrets

  HTTP Method: GET
  Endpoint: v1/apps/secrets

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - scope: Specifies the scoping of the secret. Requests originating from UI extensions can only access account-scoped secrets or secrets scoped to their own user.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/apps/secrets") params))

(defn post-apps-secrets [params params]
  """
  Set a Secret

  HTTP Method: POST
  Endpoint: v1/apps/secrets

  """
  (stripe-request :post (str "v1/apps/secrets") params))

(defn get-confirmation-tokens-confirmation-token [confirmation_token params]
  """
  Retrieve a ConfirmationToken

  HTTP Method: GET
  Endpoint: v1/confirmation_tokens/{confirmation_token}

  Path Parameters:
    - confirmation_token: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/confirmation_tokens/" confirmation_token "") params))

(defn get-treasury-inbound-transfers-id [id params]
  """
  Retrieve an InboundTransfer

  HTTP Method: GET
  Endpoint: v1/treasury/inbound_transfers/{id}

  Path Parameters:
    - id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/treasury/inbound_transfers/" id "") params))

(defn post-invoices-invoice-add-lines [invoice params]
  """
  Bulk add invoice line items

  HTTP Method: POST
  Endpoint: v1/invoices/{invoice}/add_lines

  Path Parameters:
    - invoice: 

  """
  (stripe-request :post (str "v1/invoices/" invoice "/add_lines") params))

(defn get-treasury-financial-accounts [params params]
  """
  List all FinancialAccounts

  HTTP Method: GET
  Endpoint: v1/treasury/financial_accounts

  Query Parameters:
    - created: Only return FinancialAccounts that were created during the given date interval.
    - ending_before: An object ID cursor for use in pagination.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit ranging from 1 to 100 (defaults to 10).
    - starting_after: An object ID cursor for use in pagination.

  """
  (stripe-request :get (str "v1/treasury/financial_accounts") params))

(defn post-treasury-financial-accounts [params params]
  """
  Create a FinancialAccount

  HTTP Method: POST
  Endpoint: v1/treasury/financial_accounts

  """
  (stripe-request :post (str "v1/treasury/financial_accounts") params))

(defn post-terminal-readers-reader-refund-payment [reader params]
  """
  Refund a Charge or a PaymentIntent in-person

  HTTP Method: POST
  Endpoint: v1/terminal/readers/{reader}/refund_payment

  Path Parameters:
    - reader: 

  """
  (stripe-request :post (str "v1/terminal/readers/" reader "/refund_payment") params))

(defn delete-plans-plan [plan params]
  """
  Delete a plan

  HTTP Method: DELETE
  Endpoint: v1/plans/{plan}

  Path Parameters:
    - plan: 

  """
  (stripe-request :delete (str "v1/plans/" plan "") params))

(defn get-plans-plan [plan params]
  """
  Retrieve a plan

  HTTP Method: GET
  Endpoint: v1/plans/{plan}

  Path Parameters:
    - plan: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/plans/" plan "") params))

(defn post-plans-plan [plan params]
  """
  Update a plan

  HTTP Method: POST
  Endpoint: v1/plans/{plan}

  Path Parameters:
    - plan: 

  """
  (stripe-request :post (str "v1/plans/" plan "") params))

(defn delete-subscriptions-subscription-exposed-id-discount [subscription_exposed_id params]
  """
  Delete a subscription discount

  HTTP Method: DELETE
  Endpoint: v1/subscriptions/{subscription_exposed_id}/discount

  Path Parameters:
    - subscription_exposed_id: 

  """
  (stripe-request :delete (str "v1/subscriptions/" subscription_exposed_id "/discount") params))

(defn post-treasury-inbound-transfers-inbound-transfer-cancel [inbound_transfer params]
  """
  Cancel an InboundTransfer

  HTTP Method: POST
  Endpoint: v1/treasury/inbound_transfers/{inbound_transfer}/cancel

  Path Parameters:
    - inbound_transfer: 

  """
  (stripe-request :post (str "v1/treasury/inbound_transfers/" inbound_transfer "/cancel") params))

(defn post-reviews-review-approve [review params]
  """
  Approve a review

  HTTP Method: POST
  Endpoint: v1/reviews/{review}/approve

  Path Parameters:
    - review: 

  """
  (stripe-request :post (str "v1/reviews/" review "/approve") params))

(defn get-identity-verification-reports [params params]
  """
  List VerificationReports

  HTTP Method: GET
  Endpoint: v1/identity/verification_reports

  Query Parameters:
    - client_reference_id: A string to reference this user. This can be a customer ID, a session ID, or similar, and can be used to reconcile this verification with your internal systems.
    - created: Only return VerificationReports that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - type: Only return VerificationReports of this type
    - verification_session: Only return VerificationReports created by this VerificationSession ID. It is allowed to provide a VerificationIntent ID.

  """
  (stripe-request :get (str "v1/identity/verification_reports") params))

(defn get-billing-alerts [params params]
  """
  List billing alerts

  HTTP Method: GET
  Endpoint: v1/billing/alerts

  Query Parameters:
    - alert_type: Filter results to only include this type of alert.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - meter: Filter results to only include alerts with the given meter.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/billing/alerts") params))

(defn post-billing-alerts [params params]
  """
  Create a billing alert

  HTTP Method: POST
  Endpoint: v1/billing/alerts

  """
  (stripe-request :post (str "v1/billing/alerts") params))

(defn get-billing-portal-configurations [params params]
  """
  List portal configurations

  HTTP Method: GET
  Endpoint: v1/billing_portal/configurations

  Query Parameters:
    - active: Only return configurations that are active or inactive (e.g., pass `true` to only list active configurations).
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - is_default: Only return the default or non-default configurations (e.g., pass `true` to only list the default configuration).
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/billing_portal/configurations") params))

(defn post-billing-portal-configurations [params params]
  """
  Create a portal configuration

  HTTP Method: POST
  Endpoint: v1/billing_portal/configurations

  """
  (stripe-request :post (str "v1/billing_portal/configurations") params))

(defn post-billing-alerts-id-activate [id params]
  """
  Activate a billing alert

  HTTP Method: POST
  Endpoint: v1/billing/alerts/{id}/activate

  Path Parameters:
    - id: 

  """
  (stripe-request :post (str "v1/billing/alerts/" id "/activate") params))

(defn get-entitlements-features-id [id params]
  """
  Retrieve a feature

  HTTP Method: GET
  Endpoint: v1/entitlements/features/{id}

  Path Parameters:
    - id: The ID of the feature.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/entitlements/features/" id "") params))

(defn post-entitlements-features-id [id params]
  """
  Updates a feature

  HTTP Method: POST
  Endpoint: v1/entitlements/features/{id}

  Path Parameters:
    - id: 

  """
  (stripe-request :post (str "v1/entitlements/features/" id "") params))

(defn get-subscription-items-subscription-item-usage-record-summaries [subscription_item params]
  """
  List all subscription item period summaries

  HTTP Method: GET
  Endpoint: v1/subscription_items/{subscription_item}/usage_record_summaries

  Path Parameters:
    - subscription_item: 

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/subscription_items/" subscription_item "/usage_record_summaries") params))

(defn get-billing-credit-balance-transactions-id [id params]
  """
  Retrieve a credit balance transaction

  HTTP Method: GET
  Endpoint: v1/billing/credit_balance_transactions/{id}

  Path Parameters:
    - id: Unique identifier for the object.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/billing/credit_balance_transactions/" id "") params))

(defn get-treasury-received-debits-id [id params]
  """
  Retrieve a ReceivedDebit

  HTTP Method: GET
  Endpoint: v1/treasury/received_debits/{id}

  Path Parameters:
    - id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/treasury/received_debits/" id "") params))

(defn get-charges-charge-refunds [charge params]
  """
  List all refunds

  HTTP Method: GET
  Endpoint: v1/charges/{charge}/refunds

  Path Parameters:
    - charge: 

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/charges/" charge "/refunds") params))

(defn post-charges-charge-refunds [charge params]
  """
  Create customer balance refund

  HTTP Method: POST
  Endpoint: v1/charges/{charge}/refunds

  Path Parameters:
    - charge: The identifier of the charge to refund.

  """
  (stripe-request :post (str "v1/charges/" charge "/refunds") params))

(defn get-customers-customer-sources [customer params]
  """
  No description available.

  HTTP Method: GET
  Endpoint: v1/customers/{customer}/sources

  Path Parameters:
    - customer: 

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - object: Filter sources according to a particular object type.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/customers/" customer "/sources") params))

(defn post-customers-customer-sources [customer params]
  """
  Create a card

  HTTP Method: POST
  Endpoint: v1/customers/{customer}/sources

  Path Parameters:
    - customer: 

  """
  (stripe-request :post (str "v1/customers/" customer "/sources") params))

(defn get-setup-intents-intent [intent params]
  """
  Retrieve a SetupIntent

  HTTP Method: GET
  Endpoint: v1/setup_intents/{intent}

  Path Parameters:
    - intent: 

  Query Parameters:
    - client_secret: The client secret of the SetupIntent. We require this string if you use a publishable key to retrieve the SetupIntent.
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/setup_intents/" intent "") params))

(defn post-setup-intents-intent [intent params]
  """
  Update a SetupIntent

  HTTP Method: POST
  Endpoint: v1/setup_intents/{intent}

  Path Parameters:
    - intent: 

  """
  (stripe-request :post (str "v1/setup_intents/" intent "") params))

(defn delete-customers-customer-bank-accounts-id [customer id params]
  """
  Delete a customer source

  HTTP Method: DELETE
  Endpoint: v1/customers/{customer}/bank_accounts/{id}

  Path Parameters:
    - customer: 
    - id: 

  """
  (stripe-request :delete (str "v1/customers/" customer "/bank_accounts/" id "") params))

(defn get-customers-customer-bank-accounts-id [customer id params]
  """
  Retrieve a bank account

  HTTP Method: GET
  Endpoint: v1/customers/{customer}/bank_accounts/{id}

  Path Parameters:
    - customer: 
    - id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/customers/" customer "/bank_accounts/" id "") params))

(defn post-customers-customer-bank-accounts-id [customer id params]
  """
  No description available.

  HTTP Method: POST
  Endpoint: v1/customers/{customer}/bank_accounts/{id}

  Path Parameters:
    - customer: 
    - id: 

  """
  (stripe-request :post (str "v1/customers/" customer "/bank_accounts/" id "") params))

(defn post-treasury-outbound-payments-id-cancel [id params]
  """
  Cancel an OutboundPayment

  HTTP Method: POST
  Endpoint: v1/treasury/outbound_payments/{id}/cancel

  Path Parameters:
    - id: 

  """
  (stripe-request :post (str "v1/treasury/outbound_payments/" id "/cancel") params))

(defn get-reviews-review [review params]
  """
  Retrieve a review

  HTTP Method: GET
  Endpoint: v1/reviews/{review}

  Path Parameters:
    - review: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/reviews/" review "") params))

(defn get-financial-connections-transactions [params params]
  """
  List Transactions

  HTTP Method: GET
  Endpoint: v1/financial_connections/transactions

  Query Parameters:
    - account: The ID of the Financial Connections Account whose transactions will be retrieved.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - transacted_at: A filter on the list based on the object `transacted_at` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with the following options:
    - transaction_refresh: A filter on the list based on the object `transaction_refresh` field. The value can be a dictionary with the following options:

  """
  (stripe-request :get (str "v1/financial_connections/transactions") params))

(defn post-tax-transactions-create-from-calculation [params params]
  """
  Create a transaction from a calculation

  HTTP Method: POST
  Endpoint: v1/tax/transactions/create_from_calculation

  """
  (stripe-request :post (str "v1/tax/transactions/create_from_calculation") params))

(defn post-customer-sessions [params params]
  """
  Create a Customer Session

  HTTP Method: POST
  Endpoint: v1/customer_sessions

  """
  (stripe-request :post (str "v1/customer_sessions") params))

(defn get-billing-meters [params params]
  """
  List billing meters

  HTTP Method: GET
  Endpoint: v1/billing/meters

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Filter results to only include meters with the given status.

  """
  (stripe-request :get (str "v1/billing/meters") params))

(defn post-billing-meters [params params]
  """
  Create a billing meter

  HTTP Method: POST
  Endpoint: v1/billing/meters

  """
  (stripe-request :post (str "v1/billing/meters") params))

(defn post-issuing-authorizations-authorization-decline [authorization params]
  """
  Decline an authorization

  HTTP Method: POST
  Endpoint: v1/issuing/authorizations/{authorization}/decline

  Path Parameters:
    - authorization: 

  """
  (stripe-request :post (str "v1/issuing/authorizations/" authorization "/decline") params))

(defn get-issuing-authorizations-authorization [authorization params]
  """
  Retrieve an authorization

  HTTP Method: GET
  Endpoint: v1/issuing/authorizations/{authorization}

  Path Parameters:
    - authorization: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/issuing/authorizations/" authorization "") params))

(defn post-issuing-authorizations-authorization [authorization params]
  """
  Update an authorization

  HTTP Method: POST
  Endpoint: v1/issuing/authorizations/{authorization}

  Path Parameters:
    - authorization: 

  """
  (stripe-request :post (str "v1/issuing/authorizations/" authorization "") params))

(defn get-billing-credit-balance-summary [params params]
  """
  Retrieve the credit balance summary for a customer

  HTTP Method: GET
  Endpoint: v1/billing/credit_balance_summary

  Query Parameters:
    - customer: The customer for which to fetch credit balance summary.
    - expand: Specifies which fields in the response should be expanded.
    - filter: The filter criteria for the credit balance summary.

  """
  (stripe-request :get (str "v1/billing/credit_balance_summary") params))

(defn post-disputes-dispute-close [dispute params]
  """
  Close a dispute

  HTTP Method: POST
  Endpoint: v1/disputes/{dispute}/close

  Path Parameters:
    - dispute: 

  """
  (stripe-request :post (str "v1/disputes/" dispute "/close") params))

(defn post-test-helpers-issuing-cards-card-shipping-return [card params]
  """
  Return a testmode card

  HTTP Method: POST
  Endpoint: v1/test_helpers/issuing/cards/{card}/shipping/return

  Path Parameters:
    - card: 

  """
  (stripe-request :post (str "v1/test_helpers/issuing/cards/" card "/shipping/return") params))

(defn post-link-account-sessions [params params]
  """
  Create a Session

  HTTP Method: POST
  Endpoint: v1/link_account_sessions

  """
  (stripe-request :post (str "v1/link_account_sessions") params))

(defn get-financial-connections-accounts-account-owners [account params]
  """
  List Account Owners

  HTTP Method: GET
  Endpoint: v1/financial_connections/accounts/{account}/owners

  Path Parameters:
    - account: 

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - ownership: The ID of the ownership object to fetch owners from.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/financial_connections/accounts/" account "/owners") params))

(defn post-payment-intents-intent-increment-authorization [intent params]
  """
  Increment an authorization

  HTTP Method: POST
  Endpoint: v1/payment_intents/{intent}/increment_authorization

  Path Parameters:
    - intent: 

  """
  (stripe-request :post (str "v1/payment_intents/" intent "/increment_authorization") params))

(defn delete-radar-value-list-items-item [item params]
  """
  Delete a value list item

  HTTP Method: DELETE
  Endpoint: v1/radar/value_list_items/{item}

  Path Parameters:
    - item: 

  """
  (stripe-request :delete (str "v1/radar/value_list_items/" item "") params))

(defn get-radar-value-list-items-item [item params]
  """
  Retrieve a value list item

  HTTP Method: GET
  Endpoint: v1/radar/value_list_items/{item}

  Path Parameters:
    - item: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/radar/value_list_items/" item "") params))

(defn post-customers-customer-bank-accounts-id-verify [customer id params]
  """
  Verify a bank account

  HTTP Method: POST
  Endpoint: v1/customers/{customer}/bank_accounts/{id}/verify

  Path Parameters:
    - customer: 
    - id: 

  """
  (stripe-request :post (str "v1/customers/" customer "/bank_accounts/" id "/verify") params))

(defn post-subscription-schedules-schedule-release [schedule params]
  """
  Release a schedule

  HTTP Method: POST
  Endpoint: v1/subscription_schedules/{schedule}/release

  Path Parameters:
    - schedule: 

  """
  (stripe-request :post (str "v1/subscription_schedules/" schedule "/release") params))

(defn get-issuing-authorizations [params params]
  """
  List all authorizations

  HTTP Method: GET
  Endpoint: v1/issuing/authorizations

  Query Parameters:
    - card: Only return authorizations that belong to the given card.
    - cardholder: Only return authorizations that belong to the given cardholder.
    - created: Only return authorizations that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return authorizations with the given status. One of `pending`, `closed`, or `reversed`.

  """
  (stripe-request :get (str "v1/issuing/authorizations") params))

(defn delete-radar-value-lists-value-list [value_list params]
  """
  Delete a value list

  HTTP Method: DELETE
  Endpoint: v1/radar/value_lists/{value_list}

  Path Parameters:
    - value_list: 

  """
  (stripe-request :delete (str "v1/radar/value_lists/" value_list "") params))

(defn get-radar-value-lists-value-list [value_list params]
  """
  Retrieve a value list

  HTTP Method: GET
  Endpoint: v1/radar/value_lists/{value_list}

  Path Parameters:
    - value_list: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/radar/value_lists/" value_list "") params))

(defn post-radar-value-lists-value-list [value_list params]
  """
  Update a value list

  HTTP Method: POST
  Endpoint: v1/radar/value_lists/{value_list}

  Path Parameters:
    - value_list: 

  """
  (stripe-request :post (str "v1/radar/value_lists/" value_list "") params))

(defn get-forwarding-requests [params params]
  """
  List all ForwardingRequests

  HTTP Method: GET
  Endpoint: v1/forwarding/requests

  Query Parameters:
    - created: Similar to other List endpoints, filters results based on created timestamp. You can pass gt, gte, lt, and lte timestamp values.
    - ending_before: A pagination cursor to fetch the previous page of the list. The value must be a ForwardingRequest ID.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A pagination cursor to fetch the next page of the list. The value must be a ForwardingRequest ID.

  """
  (stripe-request :get (str "v1/forwarding/requests") params))

(defn post-forwarding-requests [params params]
  """
  Create a ForwardingRequest

  HTTP Method: POST
  Endpoint: v1/forwarding/requests

  """
  (stripe-request :post (str "v1/forwarding/requests") params))

(defn post-test-helpers-issuing-personalization-designs-personalization-design-deactivate [personalization_design params]
  """
  Deactivate a testmode personalization design

  HTTP Method: POST
  Endpoint: v1/test_helpers/issuing/personalization_designs/{personalization_design}/deactivate

  Path Parameters:
    - personalization_design: 

  """
  (stripe-request :post (str "v1/test_helpers/issuing/personalization_designs/" personalization_design "/deactivate") params))

(defn get-reporting-report-runs-report-run [report_run params]
  """
  Retrieve a Report Run

  HTTP Method: GET
  Endpoint: v1/reporting/report_runs/{report_run}

  Path Parameters:
    - report_run: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/reporting/report_runs/" report_run "") params))

(defn get-treasury-outbound-payments [params params]
  """
  List all OutboundPayments

  HTTP Method: GET
  Endpoint: v1/treasury/outbound_payments

  Query Parameters:
    - created: Only return OutboundPayments that were created during the given date interval.
    - customer: Only return OutboundPayments sent to this customer.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - financial_account: Returns objects associated with this FinancialAccount.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return OutboundPayments that have the given status: `processing`, `failed`, `posted`, `returned`, or `canceled`.

  """
  (stripe-request :get (str "v1/treasury/outbound_payments") params))

(defn post-treasury-outbound-payments [params params]
  """
  Create an OutboundPayment

  HTTP Method: POST
  Endpoint: v1/treasury/outbound_payments

  """
  (stripe-request :post (str "v1/treasury/outbound_payments") params))

(defn post-tokens [params params]
  """
  Create a CVC update token

  HTTP Method: POST
  Endpoint: v1/tokens

  """
  (stripe-request :post (str "v1/tokens") params))

(defn post-test-helpers-treasury-outbound-transfers-outbound-transfer-fail [outbound_transfer params]
  """
  Test mode: Fail an OutboundTransfer

  HTTP Method: POST
  Endpoint: v1/test_helpers/treasury/outbound_transfers/{outbound_transfer}/fail

  Path Parameters:
    - outbound_transfer: 

  """
  (stripe-request :post (str "v1/test_helpers/treasury/outbound_transfers/" outbound_transfer "/fail") params))

(defn get-tax-calculations-calculation-line-items [calculation params]
  """
  Retrieve a calculation's line items

  HTTP Method: GET
  Endpoint: v1/tax/calculations/{calculation}/line_items

  Path Parameters:
    - calculation: 

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/tax/calculations/" calculation "/line_items") params))

(defn get-application-fees [params params]
  """
  List all application fees

  HTTP Method: GET
  Endpoint: v1/application_fees

  Query Parameters:
    - charge: Only return application fees for the charge specified by this charge ID.
    - created: Only return applications fees that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/application_fees") params))

(defn get-invoice-rendering-templates-template [template params]
  """
  Retrieve an invoice rendering template

  HTTP Method: GET
  Endpoint: v1/invoice_rendering_templates/{template}

  Path Parameters:
    - template: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.
    - version: 

  """
  (stripe-request :get (str "v1/invoice_rendering_templates/" template "") params))

(defn post-charges-charge-dispute-close [charge params]
  """
  No description available.

  HTTP Method: POST
  Endpoint: v1/charges/{charge}/dispute/close

  Path Parameters:
    - charge: 

  """
  (stripe-request :post (str "v1/charges/" charge "/dispute/close") params))

(defn post-test-helpers-confirmation-tokens [params params]
  """
  Create a test Confirmation Token

  HTTP Method: POST
  Endpoint: v1/test_helpers/confirmation_tokens

  """
  (stripe-request :post (str "v1/test_helpers/confirmation_tokens") params))

(defn get-promotion-codes [params params]
  """
  List all promotion codes

  HTTP Method: GET
  Endpoint: v1/promotion_codes

  Query Parameters:
    - active: Filter promotion codes by whether they are active.
    - code: Only return promotion codes that have this case-insensitive code.
    - coupon: Only return promotion codes for this coupon.
    - created: A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options.
    - customer: Only return promotion codes that are restricted to this customer.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/promotion_codes") params))

(defn post-promotion-codes [params params]
  """
  Create a promotion code

  HTTP Method: POST
  Endpoint: v1/promotion_codes

  """
  (stripe-request :post (str "v1/promotion_codes") params))

(defn post-topups-topup-cancel [topup params]
  """
  Cancel a top-up

  HTTP Method: POST
  Endpoint: v1/topups/{topup}/cancel

  Path Parameters:
    - topup: 

  """
  (stripe-request :post (str "v1/topups/" topup "/cancel") params))

(defn delete-accounts-account-people-person [account person params]
  """
  Delete a person

  HTTP Method: DELETE
  Endpoint: v1/accounts/{account}/people/{person}

  Path Parameters:
    - account: 
    - person: 

  """
  (stripe-request :delete (str "v1/accounts/" account "/people/" person "") params))

(defn get-accounts-account-people-person [account person params]
  """
  Retrieve a person

  HTTP Method: GET
  Endpoint: v1/accounts/{account}/people/{person}

  Path Parameters:
    - account: 
    - person: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/accounts/" account "/people/" person "") params))

(defn post-accounts-account-people-person [account person params]
  """
  Update a person

  HTTP Method: POST
  Endpoint: v1/accounts/{account}/people/{person}

  Path Parameters:
    - account: 
    - person: 

  """
  (stripe-request :post (str "v1/accounts/" account "/people/" person "") params))

(defn get-sources-source [source params]
  """
  Retrieve a source

  HTTP Method: GET
  Endpoint: v1/sources/{source}

  Path Parameters:
    - source: 

  Query Parameters:
    - client_secret: The client secret of the source. Required if a publishable key is used to retrieve the source.
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/sources/" source "") params))

(defn post-sources-source [source params]
  """
  Update a source

  HTTP Method: POST
  Endpoint: v1/sources/{source}

  Path Parameters:
    - source: 

  """
  (stripe-request :post (str "v1/sources/" source "") params))

(defn post-invoices-invoice-send [invoice params]
  """
  Send an invoice for manual payment

  HTTP Method: POST
  Endpoint: v1/invoices/{invoice}/send

  Path Parameters:
    - invoice: 

  """
  (stripe-request :post (str "v1/invoices/" invoice "/send") params))

(defn get-coupons [params params]
  """
  List all coupons

  HTTP Method: GET
  Endpoint: v1/coupons

  Query Parameters:
    - created: A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/coupons") params))

(defn post-coupons [params params]
  """
  Create a coupon

  HTTP Method: POST
  Endpoint: v1/coupons

  """
  (stripe-request :post (str "v1/coupons") params))

(defn get-issuing-cards [params params]
  """
  List all cards

  HTTP Method: GET
  Endpoint: v1/issuing/cards

  Query Parameters:
    - cardholder: Only return cards belonging to the Cardholder with the provided ID.
    - created: Only return cards that were issued during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - exp_month: Only return cards that have the given expiration month.
    - exp_year: Only return cards that have the given expiration year.
    - expand: Specifies which fields in the response should be expanded.
    - last4: Only return cards that have the given last four digits.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - personalization_design: 
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return cards that have the given status. One of `active`, `inactive`, or `canceled`.
    - type: Only return cards that have the given type. One of `virtual` or `physical`.

  """
  (stripe-request :get (str "v1/issuing/cards") params))

(defn post-issuing-cards [params params]
  """
  Create a card

  HTTP Method: POST
  Endpoint: v1/issuing/cards

  """
  (stripe-request :post (str "v1/issuing/cards") params))

(defn post-treasury-outbound-transfers-outbound-transfer-cancel [outbound_transfer params]
  """
  Cancel an OutboundTransfer

  HTTP Method: POST
  Endpoint: v1/treasury/outbound_transfers/{outbound_transfer}/cancel

  Path Parameters:
    - outbound_transfer: 

  """
  (stripe-request :post (str "v1/treasury/outbound_transfers/" outbound_transfer "/cancel") params))

(defn get-balance [params params]
  """
  Retrieve balance

  HTTP Method: GET
  Endpoint: v1/balance

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/balance") params))

(defn delete-terminal-readers-reader [reader params]
  """
  Delete a Reader

  HTTP Method: DELETE
  Endpoint: v1/terminal/readers/{reader}

  Path Parameters:
    - reader: 

  """
  (stripe-request :delete (str "v1/terminal/readers/" reader "") params))

(defn get-terminal-readers-reader [reader params]
  """
  Retrieve a Reader

  HTTP Method: GET
  Endpoint: v1/terminal/readers/{reader}

  Path Parameters:
    - reader: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/terminal/readers/" reader "") params))

(defn post-terminal-readers-reader [reader params]
  """
  Update a Reader

  HTTP Method: POST
  Endpoint: v1/terminal/readers/{reader}

  Path Parameters:
    - reader: 

  """
  (stripe-request :post (str "v1/terminal/readers/" reader "") params))

(defn get-tax-settings [params params]
  """
  Retrieve settings

  HTTP Method: GET
  Endpoint: v1/tax/settings

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/tax/settings") params))

(defn post-tax-settings [params params]
  """
  Update settings

  HTTP Method: POST
  Endpoint: v1/tax/settings

  """
  (stripe-request :post (str "v1/tax/settings") params))

(defn get-treasury-received-debits [params params]
  """
  List all ReceivedDebits

  HTTP Method: GET
  Endpoint: v1/treasury/received_debits

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - financial_account: The FinancialAccount that funds were pulled from.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return ReceivedDebits that have the given status: `succeeded` or `failed`.

  """
  (stripe-request :get (str "v1/treasury/received_debits") params))

(defn post-payment-method-domains-payment-method-domain-validate [payment_method_domain params]
  """
  Validate an existing payment method domain

  HTTP Method: POST
  Endpoint: v1/payment_method_domains/{payment_method_domain}/validate

  Path Parameters:
    - payment_method_domain: 

  """
  (stripe-request :post (str "v1/payment_method_domains/" payment_method_domain "/validate") params))

(defn post-invoices-invoice-mark-uncollectible [invoice params]
  """
  Mark an invoice as uncollectible

  HTTP Method: POST
  Endpoint: v1/invoices/{invoice}/mark_uncollectible

  Path Parameters:
    - invoice: 

  """
  (stripe-request :post (str "v1/invoices/" invoice "/mark_uncollectible") params))

(defn get-payouts-payout [payout params]
  """
  Retrieve a payout

  HTTP Method: GET
  Endpoint: v1/payouts/{payout}

  Path Parameters:
    - payout: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/payouts/" payout "") params))

(defn post-payouts-payout [payout params]
  """
  Update a payout

  HTTP Method: POST
  Endpoint: v1/payouts/{payout}

  Path Parameters:
    - payout: 

  """
  (stripe-request :post (str "v1/payouts/" payout "") params))

(defn post-charges-charge-capture [charge params]
  """
  Capture a payment

  HTTP Method: POST
  Endpoint: v1/charges/{charge}/capture

  Path Parameters:
    - charge: 

  """
  (stripe-request :post (str "v1/charges/" charge "/capture") params))

(defn get-files-file [file params]
  """
  Retrieve a file

  HTTP Method: GET
  Endpoint: v1/files/{file}

  Path Parameters:
    - file: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/files/" file "") params))

(defn post-linked-accounts-account-disconnect [account params]
  """
  Disconnect an Account

  HTTP Method: POST
  Endpoint: v1/linked_accounts/{account}/disconnect

  Path Parameters:
    - account: 

  """
  (stripe-request :post (str "v1/linked_accounts/" account "/disconnect") params))

(defn get-radar-value-lists [params params]
  """
  List all value lists

  HTTP Method: GET
  Endpoint: v1/radar/value_lists

  Query Parameters:
    - alias: The alias used to reference the value list when writing rules.
    - contains: A value contained within a value list - returns all value lists containing this value.
    - created: Only return value lists that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/radar/value_lists") params))

(defn post-radar-value-lists [params params]
  """
  Create a value list

  HTTP Method: POST
  Endpoint: v1/radar/value_lists

  """
  (stripe-request :post (str "v1/radar/value_lists") params))

(defn post-apps-secrets-delete [params params]
  """
  Delete a Secret

  HTTP Method: POST
  Endpoint: v1/apps/secrets/delete

  """
  (stripe-request :post (str "v1/apps/secrets/delete") params))

(defn get-issuing-transactions-transaction [transaction params]
  """
  Retrieve a transaction

  HTTP Method: GET
  Endpoint: v1/issuing/transactions/{transaction}

  Path Parameters:
    - transaction: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/issuing/transactions/" transaction "") params))

(defn post-issuing-transactions-transaction [transaction params]
  """
  Update a transaction

  HTTP Method: POST
  Endpoint: v1/issuing/transactions/{transaction}

  Path Parameters:
    - transaction: 

  """
  (stripe-request :post (str "v1/issuing/transactions/" transaction "") params))

(defn delete-test-helpers-test-clocks-test-clock [test_clock params]
  """
  Delete a test clock

  HTTP Method: DELETE
  Endpoint: v1/test_helpers/test_clocks/{test_clock}

  Path Parameters:
    - test_clock: 

  """
  (stripe-request :delete (str "v1/test_helpers/test_clocks/" test_clock "") params))

(defn get-test-helpers-test-clocks-test-clock [test_clock params]
  """
  Retrieve a test clock

  HTTP Method: GET
  Endpoint: v1/test_helpers/test_clocks/{test_clock}

  Path Parameters:
    - test_clock: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/test_helpers/test_clocks/" test_clock "") params))

(defn get-sources-source-mandate-notifications-mandate-notification [source mandate_notification params]
  """
  Retrieve a Source MandateNotification

  HTTP Method: GET
  Endpoint: v1/sources/{source}/mandate_notifications/{mandate_notification}

  Path Parameters:
    - mandate_notification: 
    - source: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/sources/" source "/mandate_notifications/" mandate_notification "") params))

(defn get-treasury-debit-reversals-debit-reversal [debit_reversal params]
  """
  Retrieve a DebitReversal

  HTTP Method: GET
  Endpoint: v1/treasury/debit_reversals/{debit_reversal}

  Path Parameters:
    - debit_reversal: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/treasury/debit_reversals/" debit_reversal "") params))

(defn get-radar-value-list-items [params params]
  """
  List all value list items

  HTTP Method: GET
  Endpoint: v1/radar/value_list_items

  Query Parameters:
    - created: Only return items that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - value: Return items belonging to the parent list whose value matches the specified value (using an "is like" match).
    - value_list: Identifier for the parent value list this item belongs to.

  """
  (stripe-request :get (str "v1/radar/value_list_items") params))

(defn post-radar-value-list-items [params params]
  """
  Create a value list item

  HTTP Method: POST
  Endpoint: v1/radar/value_list_items

  """
  (stripe-request :post (str "v1/radar/value_list_items") params))

(defn post-payment-methods-payment-method-detach [payment_method params]
  """
  Detach a PaymentMethod from a Customer

  HTTP Method: POST
  Endpoint: v1/payment_methods/{payment_method}/detach

  Path Parameters:
    - payment_method: 

  """
  (stripe-request :post (str "v1/payment_methods/" payment_method "/detach") params))

(defn post-test-helpers-refunds-refund-expire [refund params]
  """
  Expire a pending refund.

  HTTP Method: POST
  Endpoint: v1/test_helpers/refunds/{refund}/expire

  Path Parameters:
    - refund: 

  """
  (stripe-request :post (str "v1/test_helpers/refunds/" refund "/expire") params))

(defn get-treasury-received-credits-id [id params]
  """
  Retrieve a ReceivedCredit

  HTTP Method: GET
  Endpoint: v1/treasury/received_credits/{id}

  Path Parameters:
    - id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/treasury/received_credits/" id "") params))

(defn post-customers-customer-funding-instructions [customer params]
  """
  Create or retrieve funding instructions for a customer cash balance

  HTTP Method: POST
  Endpoint: v1/customers/{customer}/funding_instructions

  Path Parameters:
    - customer: 

  """
  (stripe-request :post (str "v1/customers/" customer "/funding_instructions") params))

(defn get-accounts-account-people [account params]
  """
  List all persons

  HTTP Method: GET
  Endpoint: v1/accounts/{account}/people

  Path Parameters:
    - account: 

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - relationship: Filters on the list of people returned based on the person's relationship to the account's company.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/accounts/" account "/people") params))

(defn post-accounts-account-people [account params]
  """
  Create a person

  HTTP Method: POST
  Endpoint: v1/accounts/{account}/people

  Path Parameters:
    - account: 

  """
  (stripe-request :post (str "v1/accounts/" account "/people") params))

(defn get-identity-verification-reports-report [report params]
  """
  Retrieve a VerificationReport

  HTTP Method: GET
  Endpoint: v1/identity/verification_reports/{report}

  Path Parameters:
    - report: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/identity/verification_reports/" report "") params))

(defn get-quotes [params params]
  """
  List all quotes

  HTTP Method: GET
  Endpoint: v1/quotes

  Query Parameters:
    - customer: The ID of the customer whose quotes will be retrieved.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: The status of the quote.
    - test_clock: Provides a list of quotes that are associated with the specified test clock. The response will not include quotes with test clocks if this and the customer parameter is not set.

  """
  (stripe-request :get (str "v1/quotes") params))

(defn post-quotes [params params]
  """
  Create a quote

  HTTP Method: POST
  Endpoint: v1/quotes

  """
  (stripe-request :post (str "v1/quotes") params))

(defn post-test-helpers-issuing-cards-card-shipping-fail [card params]
  """
  Fail a testmode card

  HTTP Method: POST
  Endpoint: v1/test_helpers/issuing/cards/{card}/shipping/fail

  Path Parameters:
    - card: 

  """
  (stripe-request :post (str "v1/test_helpers/issuing/cards/" card "/shipping/fail") params))

(defn post-payment-intents-intent-verify-microdeposits [intent params]
  """
  Verify microdeposits on a PaymentIntent

  HTTP Method: POST
  Endpoint: v1/payment_intents/{intent}/verify_microdeposits

  Path Parameters:
    - intent: 

  """
  (stripe-request :post (str "v1/payment_intents/" intent "/verify_microdeposits") params))

(defn delete-coupons-coupon [coupon params]
  """
  Delete a coupon

  HTTP Method: DELETE
  Endpoint: v1/coupons/{coupon}

  Path Parameters:
    - coupon: 

  """
  (stripe-request :delete (str "v1/coupons/" coupon "") params))

(defn get-coupons-coupon [coupon params]
  """
  Retrieve a coupon

  HTTP Method: GET
  Endpoint: v1/coupons/{coupon}

  Path Parameters:
    - coupon: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/coupons/" coupon "") params))

(defn post-coupons-coupon [coupon params]
  """
  Update a coupon

  HTTP Method: POST
  Endpoint: v1/coupons/{coupon}

  Path Parameters:
    - coupon: 

  """
  (stripe-request :post (str "v1/coupons/" coupon "") params))

(defn post-test-helpers-issuing-authorizations-authorization-capture [authorization params]
  """
  Capture a test-mode authorization

  HTTP Method: POST
  Endpoint: v1/test_helpers/issuing/authorizations/{authorization}/capture

  Path Parameters:
    - authorization: 

  """
  (stripe-request :post (str "v1/test_helpers/issuing/authorizations/" authorization "/capture") params))

(defn get-entitlements-active-entitlements-id [id params]
  """
  Retrieve an active entitlement

  HTTP Method: GET
  Endpoint: v1/entitlements/active_entitlements/{id}

  Path Parameters:
    - id: The ID of the entitlement.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/entitlements/active_entitlements/" id "") params))

(defn get-application-fees-fee-refunds-id [fee id params]
  """
  Retrieve an application fee refund

  HTTP Method: GET
  Endpoint: v1/application_fees/{fee}/refunds/{id}

  Path Parameters:
    - fee: 
    - id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/application_fees/" fee "/refunds/" id "") params))

(defn post-application-fees-fee-refunds-id [fee id params]
  """
  Update an application fee refund

  HTTP Method: POST
  Endpoint: v1/application_fees/{fee}/refunds/{id}

  Path Parameters:
    - fee: 
    - id: 

  """
  (stripe-request :post (str "v1/application_fees/" fee "/refunds/" id "") params))

(defn post-identity-verification-sessions-session-redact [session params]
  """
  Redact a VerificationSession

  HTTP Method: POST
  Endpoint: v1/identity/verification_sessions/{session}/redact

  Path Parameters:
    - session: 

  """
  (stripe-request :post (str "v1/identity/verification_sessions/" session "/redact") params))

(defn post-test-helpers-treasury-outbound-payments-id-post [id params]
  """
  Test mode: Post an OutboundPayment

  HTTP Method: POST
  Endpoint: v1/test_helpers/treasury/outbound_payments/{id}/post

  Path Parameters:
    - id: 

  """
  (stripe-request :post (str "v1/test_helpers/treasury/outbound_payments/" id "/post") params))

(defn get-application-fees-id [id params]
  """
  Retrieve an application fee

  HTTP Method: GET
  Endpoint: v1/application_fees/{id}

  Path Parameters:
    - id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/application_fees/" id "") params))

(defn get-financial-connections-transactions-transaction [transaction params]
  """
  Retrieve a Transaction

  HTTP Method: GET
  Endpoint: v1/financial_connections/transactions/{transaction}

  Path Parameters:
    - transaction: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/financial_connections/transactions/" transaction "") params))

(defn post-test-helpers-treasury-outbound-transfers-outbound-transfer-return [outbound_transfer params]
  """
  Test mode: Return an OutboundTransfer

  HTTP Method: POST
  Endpoint: v1/test_helpers/treasury/outbound_transfers/{outbound_transfer}/return

  Path Parameters:
    - outbound_transfer: 

  """
  (stripe-request :post (str "v1/test_helpers/treasury/outbound_transfers/" outbound_transfer "/return") params))

(defn delete-terminal-locations-location [location params]
  """
  Delete a Location

  HTTP Method: DELETE
  Endpoint: v1/terminal/locations/{location}

  Path Parameters:
    - location: 

  """
  (stripe-request :delete (str "v1/terminal/locations/" location "") params))

(defn get-terminal-locations-location [location params]
  """
  Retrieve a Location

  HTTP Method: GET
  Endpoint: v1/terminal/locations/{location}

  Path Parameters:
    - location: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/terminal/locations/" location "") params))

(defn post-terminal-locations-location [location params]
  """
  Update a Location

  HTTP Method: POST
  Endpoint: v1/terminal/locations/{location}

  Path Parameters:
    - location: 

  """
  (stripe-request :post (str "v1/terminal/locations/" location "") params))

(defn get-checkout-sessions-session-line-items [session params]
  """
  Retrieve a Checkout Session's line items

  HTTP Method: GET
  Endpoint: v1/checkout/sessions/{session}/line_items

  Path Parameters:
    - session: 

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/checkout/sessions/" session "/line_items") params))

(defn get-credit-notes [params params]
  """
  List all credit notes

  HTTP Method: GET
  Endpoint: v1/credit_notes

  Query Parameters:
    - created: Only return credit notes that were created during the given date interval.
    - customer: Only return credit notes for the customer specified by this customer ID.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - invoice: Only return credit notes for the invoice specified by this invoice ID.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/credit_notes") params))

(defn post-credit-notes [params params]
  """
  Create a credit note

  HTTP Method: POST
  Endpoint: v1/credit_notes

  """
  (stripe-request :post (str "v1/credit_notes") params))

(defn get-shipping-rates-shipping-rate-token [shipping_rate_token params]
  """
  Retrieve a shipping rate

  HTTP Method: GET
  Endpoint: v1/shipping_rates/{shipping_rate_token}

  Path Parameters:
    - shipping_rate_token: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/shipping_rates/" shipping_rate_token "") params))

(defn post-shipping-rates-shipping-rate-token [shipping_rate_token params]
  """
  Update a shipping rate

  HTTP Method: POST
  Endpoint: v1/shipping_rates/{shipping_rate_token}

  Path Parameters:
    - shipping_rate_token: 

  """
  (stripe-request :post (str "v1/shipping_rates/" shipping_rate_token "") params))

(defn post-test-helpers-issuing-authorizations-authorization-fraud-challenges-respond [authorization params]
  """
  Respond to fraud challenge

  HTTP Method: POST
  Endpoint: v1/test_helpers/issuing/authorizations/{authorization}/fraud_challenges/respond

  Path Parameters:
    - authorization: 

  """
  (stripe-request :post (str "v1/test_helpers/issuing/authorizations/" authorization "/fraud_challenges/respond") params))

(defn get-payment-method-configurations [params params]
  """
  List payment method configurations

  HTTP Method: GET
  Endpoint: v1/payment_method_configurations

  Query Parameters:
    - application: The Connect application to filter by.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/payment_method_configurations") params))

(defn post-payment-method-configurations [params params]
  """
  Create a payment method configuration

  HTTP Method: POST
  Endpoint: v1/payment_method_configurations

  """
  (stripe-request :post (str "v1/payment_method_configurations") params))

(defn get-prices-search [params params]
  """
  Search prices

  HTTP Method: GET
  Endpoint: v1/prices/search

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - page: A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results.
    - query: The search query string. See [search query language](https://stripe.com/docs/search#search-query-language) and the list of supported [query fields for prices](https://stripe.com/docs/search#query-fields-for-prices).

  """
  (stripe-request :get (str "v1/prices/search") params))

(defn post-billing-meters-id-reactivate [id params]
  """
  Reactivate a billing meter

  HTTP Method: POST
  Endpoint: v1/billing/meters/{id}/reactivate

  Path Parameters:
    - id: Unique identifier for the object.

  """
  (stripe-request :post (str "v1/billing/meters/" id "/reactivate") params))

(defn get-billing-portal-configurations-configuration [configuration params]
  """
  Retrieve a portal configuration

  HTTP Method: GET
  Endpoint: v1/billing_portal/configurations/{configuration}

  Path Parameters:
    - configuration: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/billing_portal/configurations/" configuration "") params))

(defn post-billing-portal-configurations-configuration [configuration params]
  """
  Update a portal configuration

  HTTP Method: POST
  Endpoint: v1/billing_portal/configurations/{configuration}

  Path Parameters:
    - configuration: 

  """
  (stripe-request :post (str "v1/billing_portal/configurations/" configuration "") params))

(defn get-payment-method-configurations-configuration [configuration params]
  """
  Retrieve payment method configuration

  HTTP Method: GET
  Endpoint: v1/payment_method_configurations/{configuration}

  Path Parameters:
    - configuration: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/payment_method_configurations/" configuration "") params))

(defn post-payment-method-configurations-configuration [configuration params]
  """
  Update payment method configuration

  HTTP Method: POST
  Endpoint: v1/payment_method_configurations/{configuration}

  Path Parameters:
    - configuration: 

  """
  (stripe-request :post (str "v1/payment_method_configurations/" configuration "") params))

(defn get-entitlements-active-entitlements [params params]
  """
  List all active entitlements

  HTTP Method: GET
  Endpoint: v1/entitlements/active_entitlements

  Query Parameters:
    - customer: The ID of the customer.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/entitlements/active_entitlements") params))

(defn delete-accounts-account [account params]
  """
  Delete an account

  HTTP Method: DELETE
  Endpoint: v1/accounts/{account}

  Path Parameters:
    - account: 

  """
  (stripe-request :delete (str "v1/accounts/" account "") params))

(defn get-accounts-account [account params]
  """
  Retrieve account

  HTTP Method: GET
  Endpoint: v1/accounts/{account}

  Path Parameters:
    - account: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/accounts/" account "") params))

(defn post-accounts-account [account params]
  """
  Update an account

  HTTP Method: POST
  Endpoint: v1/accounts/{account}

  Path Parameters:
    - account: 

  """
  (stripe-request :post (str "v1/accounts/" account "") params))

(defn get-exchange-rates [params params]
  """
  List all exchange rates

  HTTP Method: GET
  Endpoint: v1/exchange_rates

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is the currency that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with the exchange rate for currency X your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and total number of supported payout currencies, and the default is the max.
    - starting_after: A cursor for use in pagination. `starting_after` is the currency that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with the exchange rate for currency X, your subsequent call can include `starting_after=X` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/exchange_rates") params))

(defn get-tax-rates-tax-rate [tax_rate params]
  """
  Retrieve a tax rate

  HTTP Method: GET
  Endpoint: v1/tax_rates/{tax_rate}

  Path Parameters:
    - tax_rate: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/tax_rates/" tax_rate "") params))

(defn post-tax-rates-tax-rate [tax_rate params]
  """
  Update a tax rate

  HTTP Method: POST
  Endpoint: v1/tax_rates/{tax_rate}

  Path Parameters:
    - tax_rate: 

  """
  (stripe-request :post (str "v1/tax_rates/" tax_rate "") params))

(defn get-tax-registrations [params params]
  """
  List registrations

  HTTP Method: GET
  Endpoint: v1/tax/registrations

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: The status of the Tax Registration.

  """
  (stripe-request :get (str "v1/tax/registrations") params))

(defn post-tax-registrations [params params]
  """
  Create a registration

  HTTP Method: POST
  Endpoint: v1/tax/registrations

  """
  (stripe-request :post (str "v1/tax/registrations") params))

(defn post-terminal-readers-reader-process-setup-intent [reader params]
  """
  Hand-off a SetupIntent to a Reader

  HTTP Method: POST
  Endpoint: v1/terminal/readers/{reader}/process_setup_intent

  Path Parameters:
    - reader: 

  """
  (stripe-request :post (str "v1/terminal/readers/" reader "/process_setup_intent") params))

(defn post-tax-calculations [params params]
  """
  Create a Tax Calculation

  HTTP Method: POST
  Endpoint: v1/tax/calculations

  """
  (stripe-request :post (str "v1/tax/calculations") params))

(defn get-customers-customer-subscriptions [customer params]
  """
  List active subscriptions

  HTTP Method: GET
  Endpoint: v1/customers/{customer}/subscriptions

  Path Parameters:
    - customer: 

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/customers/" customer "/subscriptions") params))

(defn post-customers-customer-subscriptions [customer params]
  """
  Create a subscription

  HTTP Method: POST
  Endpoint: v1/customers/{customer}/subscriptions

  Path Parameters:
    - customer: 

  """
  (stripe-request :post (str "v1/customers/" customer "/subscriptions") params))

(defn get-quotes-quote-computed-upfront-line-items [quote params]
  """
  Retrieve a quote's upfront line items

  HTTP Method: GET
  Endpoint: v1/quotes/{quote}/computed_upfront_line_items

  Path Parameters:
    - quote: 

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/quotes/" quote "/computed_upfront_line_items") params))

(defn post-invoices-invoice-finalize [invoice params]
  """
  Finalize an invoice

  HTTP Method: POST
  Endpoint: v1/invoices/{invoice}/finalize

  Path Parameters:
    - invoice: 

  """
  (stripe-request :post (str "v1/invoices/" invoice "/finalize") params))

(defn post-account-sessions [params params]
  """
  Create an Account Session

  HTTP Method: POST
  Endpoint: v1/account_sessions

  """
  (stripe-request :post (str "v1/account_sessions") params))

(defn get-charges-search [params params]
  """
  Search charges

  HTTP Method: GET
  Endpoint: v1/charges/search

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - page: A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results.
    - query: The search query string. See [search query language](https://stripe.com/docs/search#search-query-language) and the list of supported [query fields for charges](https://stripe.com/docs/search#query-fields-for-charges).

  """
  (stripe-request :get (str "v1/charges/search") params))

(defn get-climate-orders-order [order params]
  """
  Retrieve an order

  HTTP Method: GET
  Endpoint: v1/climate/orders/{order}

  Path Parameters:
    - order: Unique identifier of the order.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/climate/orders/" order "") params))

(defn post-climate-orders-order [order params]
  """
  Update an order

  HTTP Method: POST
  Endpoint: v1/climate/orders/{order}

  Path Parameters:
    - order: Unique identifier of the order.

  """
  (stripe-request :post (str "v1/climate/orders/" order "") params))

(defn get-linked-accounts [params params]
  """
  List Accounts

  HTTP Method: GET
  Endpoint: v1/linked_accounts

  Query Parameters:
    - account_holder: If present, only return accounts that belong to the specified account holder. `account_holder[customer]` and `account_holder[account]` are mutually exclusive.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - session: If present, only return accounts that were collected as part of the given session.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/linked_accounts") params))

(defn get-forwarding-requests-id [id params]
  """
  Retrieve a ForwardingRequest

  HTTP Method: GET
  Endpoint: v1/forwarding/requests/{id}

  Path Parameters:
    - id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/forwarding/requests/" id "") params))

(defn delete-customers-customer-sources-id [customer id params]
  """
  Delete a customer source

  HTTP Method: DELETE
  Endpoint: v1/customers/{customer}/sources/{id}

  Path Parameters:
    - customer: 
    - id: 

  """
  (stripe-request :delete (str "v1/customers/" customer "/sources/" id "") params))

(defn get-customers-customer-sources-id [customer id params]
  """
  No description available.

  HTTP Method: GET
  Endpoint: v1/customers/{customer}/sources/{id}

  Path Parameters:
    - customer: 
    - id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/customers/" customer "/sources/" id "") params))

(defn post-customers-customer-sources-id [customer id params]
  """
  No description available.

  HTTP Method: POST
  Endpoint: v1/customers/{customer}/sources/{id}

  Path Parameters:
    - customer: 
    - id: 

  """
  (stripe-request :post (str "v1/customers/" customer "/sources/" id "") params))

(defn get-charges-charge-dispute [charge params]
  """
  No description available.

  HTTP Method: GET
  Endpoint: v1/charges/{charge}/dispute

  Path Parameters:
    - charge: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/charges/" charge "/dispute") params))

(defn post-charges-charge-dispute [charge params]
  """
  No description available.

  HTTP Method: POST
  Endpoint: v1/charges/{charge}/dispute

  Path Parameters:
    - charge: 

  """
  (stripe-request :post (str "v1/charges/" charge "/dispute") params))

(defn post-test-helpers-issuing-authorizations-authorization-expire [authorization params]
  """
  Expire a test-mode authorization

  HTTP Method: POST
  Endpoint: v1/test_helpers/issuing/authorizations/{authorization}/expire

  Path Parameters:
    - authorization: 

  """
  (stripe-request :post (str "v1/test_helpers/issuing/authorizations/" authorization "/expire") params))

(defn post-payment-intents-intent-capture [intent params]
  """
  Capture a PaymentIntent

  HTTP Method: POST
  Endpoint: v1/payment_intents/{intent}/capture

  Path Parameters:
    - intent: 

  """
  (stripe-request :post (str "v1/payment_intents/" intent "/capture") params))

(defn get-reviews [params params]
  """
  List all open reviews

  HTTP Method: GET
  Endpoint: v1/reviews

  Query Parameters:
    - created: Only return reviews that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/reviews") params))

(defn get-credit-notes-id [id params]
  """
  Retrieve a credit note

  HTTP Method: GET
  Endpoint: v1/credit_notes/{id}

  Path Parameters:
    - id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/credit_notes/" id "") params))

(defn post-credit-notes-id [id params]
  """
  Update a credit note

  HTTP Method: POST
  Endpoint: v1/credit_notes/{id}

  Path Parameters:
    - id: 

  """
  (stripe-request :post (str "v1/credit_notes/" id "") params))

(defn post-invoices-invoice-lines-line-item-id [invoice line_item_id params]
  """
  Update an invoice's line item

  HTTP Method: POST
  Endpoint: v1/invoices/{invoice}/lines/{line_item_id}

  Path Parameters:
    - invoice: Invoice ID of line item
    - line_item_id: Invoice line item ID

  """
  (stripe-request :post (str "v1/invoices/" invoice "/lines/" line_item_id "") params))

(defn get-link-account-sessions-session [session params]
  """
  Retrieve a Session

  HTTP Method: GET
  Endpoint: v1/link_account_sessions/{session}

  Path Parameters:
    - session: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/link_account_sessions/" session "") params))

(defn post-test-helpers-customers-customer-fund-cash-balance [customer params]
  """
  Fund a test mode cash balance

  HTTP Method: POST
  Endpoint: v1/test_helpers/customers/{customer}/fund_cash_balance

  Path Parameters:
    - customer: 

  """
  (stripe-request :post (str "v1/test_helpers/customers/" customer "/fund_cash_balance") params))

(defn get-disputes-dispute [dispute params]
  """
  Retrieve a dispute

  HTTP Method: GET
  Endpoint: v1/disputes/{dispute}

  Path Parameters:
    - dispute: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/disputes/" dispute "") params))

(defn post-disputes-dispute [dispute params]
  """
  Update a dispute

  HTTP Method: POST
  Endpoint: v1/disputes/{dispute}

  Path Parameters:
    - dispute: 

  """
  (stripe-request :post (str "v1/disputes/" dispute "") params))

(defn get-customers-customer-balance-transactions-transaction [customer transaction params]
  """
  Retrieve a customer balance transaction

  HTTP Method: GET
  Endpoint: v1/customers/{customer}/balance_transactions/{transaction}

  Path Parameters:
    - customer: 
    - transaction: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/customers/" customer "/balance_transactions/" transaction "") params))

(defn post-customers-customer-balance-transactions-transaction [customer transaction params]
  """
  Update a customer credit balance transaction

  HTTP Method: POST
  Endpoint: v1/customers/{customer}/balance_transactions/{transaction}

  Path Parameters:
    - customer: 
    - transaction: 

  """
  (stripe-request :post (str "v1/customers/" customer "/balance_transactions/" transaction "") params))

(defn get-accounts-account-persons [account params]
  """
  List all persons

  HTTP Method: GET
  Endpoint: v1/accounts/{account}/persons

  Path Parameters:
    - account: 

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - relationship: Filters on the list of people returned based on the person's relationship to the account's company.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/accounts/" account "/persons") params))

(defn post-accounts-account-persons [account params]
  """
  Create a person

  HTTP Method: POST
  Endpoint: v1/accounts/{account}/persons

  Path Parameters:
    - account: 

  """
  (stripe-request :post (str "v1/accounts/" account "/persons") params))

(defn get-tax-transactions-transaction-line-items [transaction params]
  """
  Retrieve a transaction's line items

  HTTP Method: GET
  Endpoint: v1/tax/transactions/{transaction}/line_items

  Path Parameters:
    - transaction: 

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/tax/transactions/" transaction "/line_items") params))

(defn get-subscription-schedules-schedule [schedule params]
  """
  Retrieve a schedule

  HTTP Method: GET
  Endpoint: v1/subscription_schedules/{schedule}

  Path Parameters:
    - schedule: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/subscription_schedules/" schedule "") params))

(defn post-subscription-schedules-schedule [schedule params]
  """
  Update a schedule

  HTTP Method: POST
  Endpoint: v1/subscription_schedules/{schedule}

  Path Parameters:
    - schedule: 

  """
  (stripe-request :post (str "v1/subscription_schedules/" schedule "") params))

(defn get-payment-methods [params params]
  """
  List PaymentMethods

  HTTP Method: GET
  Endpoint: v1/payment_methods

  Query Parameters:
    - customer: The ID of the customer whose PaymentMethods will be retrieved.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - type: An optional filter on the list, based on the object `type` field. Without the filter, the list includes all current and future payment method types. If your integration expects only one type of payment method in the response, make sure to provide a type value in the request.

  """
  (stripe-request :get (str "v1/payment_methods") params))

(defn post-payment-methods [params params]
  """
  Shares a PaymentMethod

  HTTP Method: POST
  Endpoint: v1/payment_methods

  """
  (stripe-request :post (str "v1/payment_methods") params))

(defn get-customers-customer-cash-balance [customer params]
  """
  Retrieve a cash balance

  HTTP Method: GET
  Endpoint: v1/customers/{customer}/cash_balance

  Path Parameters:
    - customer: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/customers/" customer "/cash_balance") params))

(defn post-customers-customer-cash-balance [customer params]
  """
  Update a cash balance's settings

  HTTP Method: POST
  Endpoint: v1/customers/{customer}/cash_balance

  Path Parameters:
    - customer: 

  """
  (stripe-request :post (str "v1/customers/" customer "/cash_balance") params))

(defn delete-customers-customer-tax-ids-id [customer id params]
  """
  Delete a Customer tax ID

  HTTP Method: DELETE
  Endpoint: v1/customers/{customer}/tax_ids/{id}

  Path Parameters:
    - customer: 
    - id: 

  """
  (stripe-request :delete (str "v1/customers/" customer "/tax_ids/" id "") params))

(defn get-customers-customer-tax-ids-id [customer id params]
  """
  Retrieve a Customer tax ID

  HTTP Method: GET
  Endpoint: v1/customers/{customer}/tax_ids/{id}

  Path Parameters:
    - customer: 
    - id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/customers/" customer "/tax_ids/" id "") params))

(defn get-sources-source-source-transactions [source params]
  """
  No description available.

  HTTP Method: GET
  Endpoint: v1/sources/{source}/source_transactions

  Path Parameters:
    - source: 

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/sources/" source "/source_transactions") params))

(defn get-financial-connections-sessions-session [session params]
  """
  Retrieve a Session

  HTTP Method: GET
  Endpoint: v1/financial_connections/sessions/{session}

  Path Parameters:
    - session: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/financial_connections/sessions/" session "") params))

(defn delete-invoiceitems-invoiceitem [invoiceitem params]
  """
  Delete an invoice item

  HTTP Method: DELETE
  Endpoint: v1/invoiceitems/{invoiceitem}

  Path Parameters:
    - invoiceitem: 

  """
  (stripe-request :delete (str "v1/invoiceitems/" invoiceitem "") params))

(defn get-invoiceitems-invoiceitem [invoiceitem params]
  """
  Retrieve an invoice item

  HTTP Method: GET
  Endpoint: v1/invoiceitems/{invoiceitem}

  Path Parameters:
    - invoiceitem: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/invoiceitems/" invoiceitem "") params))

(defn post-invoiceitems-invoiceitem [invoiceitem params]
  """
  Update an invoice item

  HTTP Method: POST
  Endpoint: v1/invoiceitems/{invoiceitem}

  Path Parameters:
    - invoiceitem: 

  """
  (stripe-request :post (str "v1/invoiceitems/" invoiceitem "") params))

(defn post-terminal-readers-reader-cancel-action [reader params]
  """
  Cancel the current reader action

  HTTP Method: POST
  Endpoint: v1/terminal/readers/{reader}/cancel_action

  Path Parameters:
    - reader: 

  """
  (stripe-request :post (str "v1/terminal/readers/" reader "/cancel_action") params))

(defn get-invoices [params params]
  """
  List all invoices

  HTTP Method: GET
  Endpoint: v1/invoices

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
  (stripe-request :get (str "v1/invoices") params))

(defn post-invoices [params params]
  """
  Create an invoice

  HTTP Method: POST
  Endpoint: v1/invoices

  """
  (stripe-request :post (str "v1/invoices") params))

(defn get-accounts-account-capabilities-capability [account capability params]
  """
  Retrieve an Account Capability

  HTTP Method: GET
  Endpoint: v1/accounts/{account}/capabilities/{capability}

  Path Parameters:
    - account: 
    - capability: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/accounts/" account "/capabilities/" capability "") params))

(defn post-accounts-account-capabilities-capability [account capability params]
  """
  Update an Account Capability

  HTTP Method: POST
  Endpoint: v1/accounts/{account}/capabilities/{capability}

  Path Parameters:
    - account: 
    - capability: 

  """
  (stripe-request :post (str "v1/accounts/" account "/capabilities/" capability "") params))

(defn post-test-helpers-test-clocks-test-clock-advance [test_clock params]
  """
  Advance a test clock

  HTTP Method: POST
  Endpoint: v1/test_helpers/test_clocks/{test_clock}/advance

  Path Parameters:
    - test_clock: 

  """
  (stripe-request :post (str "v1/test_helpers/test_clocks/" test_clock "/advance") params))

(defn get-accounts-account-capabilities [account params]
  """
  List all account capabilities

  HTTP Method: GET
  Endpoint: v1/accounts/{account}/capabilities

  Path Parameters:
    - account: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/accounts/" account "/capabilities") params))

(defn post-billing-credit-grants-id-void [id params]
  """
  Void a credit grant

  HTTP Method: POST
  Endpoint: v1/billing/credit_grants/{id}/void

  Path Parameters:
    - id: Unique identifier for the object.

  """
  (stripe-request :post (str "v1/billing/credit_grants/" id "/void") params))

(defn get-sigma-scheduled-query-runs-scheduled-query-run [scheduled_query_run params]
  """
  Retrieve a scheduled query run

  HTTP Method: GET
  Endpoint: v1/sigma/scheduled_query_runs/{scheduled_query_run}

  Path Parameters:
    - scheduled_query_run: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/sigma/scheduled_query_runs/" scheduled_query_run "") params))

(defn get-topups-topup [topup params]
  """
  Retrieve a top-up

  HTTP Method: GET
  Endpoint: v1/topups/{topup}

  Path Parameters:
    - topup: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/topups/" topup "") params))

(defn post-topups-topup [topup params]
  """
  Update a top-up

  HTTP Method: POST
  Endpoint: v1/topups/{topup}

  Path Parameters:
    - topup: 

  """
  (stripe-request :post (str "v1/topups/" topup "") params))

(defn post-test-helpers-treasury-inbound-transfers-id-return [id params]
  """
  Test mode: Return an InboundTransfer

  HTTP Method: POST
  Endpoint: v1/test_helpers/treasury/inbound_transfers/{id}/return

  Path Parameters:
    - id: 

  """
  (stripe-request :post (str "v1/test_helpers/treasury/inbound_transfers/" id "/return") params))

(defn get-treasury-received-credits [params params]
  """
  List all ReceivedCredits

  HTTP Method: GET
  Endpoint: v1/treasury/received_credits

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - financial_account: The FinancialAccount that received the funds.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - linked_flows: Only return ReceivedCredits described by the flow.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return ReceivedCredits that have the given status: `succeeded` or `failed`.

  """
  (stripe-request :get (str "v1/treasury/received_credits") params))

(defn get-tax-calculations-calculation [calculation params]
  """
  Retrieve a Tax Calculation

  HTTP Method: GET
  Endpoint: v1/tax/calculations/{calculation}

  Path Parameters:
    - calculation: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/tax/calculations/" calculation "") params))

(defn post-quotes-quote-cancel [quote params]
  """
  Cancel a quote

  HTTP Method: POST
  Endpoint: v1/quotes/{quote}/cancel

  Path Parameters:
    - quote: 

  """
  (stripe-request :post (str "v1/quotes/" quote "/cancel") params))

(defn get-issuing-physical-bundles [params params]
  """
  List all physical bundles

  HTTP Method: GET
  Endpoint: v1/issuing/physical_bundles

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return physical bundles with the given status.
    - type: Only return physical bundles with the given type.

  """
  (stripe-request :get (str "v1/issuing/physical_bundles") params))

(defn post-test-helpers-treasury-outbound-transfers-outbound-transfer [outbound_transfer params]
  """
  Test mode: Update an OutboundTransfer

  HTTP Method: POST
  Endpoint: v1/test_helpers/treasury/outbound_transfers/{outbound_transfer}

  Path Parameters:
    - outbound_transfer: 

  """
  (stripe-request :post (str "v1/test_helpers/treasury/outbound_transfers/" outbound_transfer "") params))

(defn post-subscription-items-subscription-item-usage-records [subscription_item params]
  """
  Create a usage record

  HTTP Method: POST
  Endpoint: v1/subscription_items/{subscription_item}/usage_records

  Path Parameters:
    - subscription_item: 

  """
  (stripe-request :post (str "v1/subscription_items/" subscription_item "/usage_records") params))

(defn post-test-helpers-issuing-personalization-designs-personalization-design-activate [personalization_design params]
  """
  Activate a testmode personalization design

  HTTP Method: POST
  Endpoint: v1/test_helpers/issuing/personalization_designs/{personalization_design}/activate

  Path Parameters:
    - personalization_design: 

  """
  (stripe-request :post (str "v1/test_helpers/issuing/personalization_designs/" personalization_design "/activate") params))

(defn delete-ephemeral-keys-key [key params]
  """
  Immediately invalidate an ephemeral key

  HTTP Method: DELETE
  Endpoint: v1/ephemeral_keys/{key}

  Path Parameters:
    - key: 

  """
  (stripe-request :delete (str "v1/ephemeral_keys/" key "") params))

(defn get-quotes-quote [quote params]
  """
  Retrieve a quote

  HTTP Method: GET
  Endpoint: v1/quotes/{quote}

  Path Parameters:
    - quote: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/quotes/" quote "") params))

(defn post-quotes-quote [quote params]
  """
  Update a quote

  HTTP Method: POST
  Endpoint: v1/quotes/{quote}

  Path Parameters:
    - quote: 

  """
  (stripe-request :post (str "v1/quotes/" quote "") params))

(defn get-subscriptions-search [params params]
  """
  Search subscriptions

  HTTP Method: GET
  Endpoint: v1/subscriptions/search

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - page: A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results.
    - query: The search query string. See [search query language](https://stripe.com/docs/search#search-query-language) and the list of supported [query fields for subscriptions](https://stripe.com/docs/search#query-fields-for-subscriptions).

  """
  (stripe-request :get (str "v1/subscriptions/search") params))

(defn post-financial-connections-accounts-account-subscribe [account params]
  """
  Subscribe to data refreshes for an Account

  HTTP Method: POST
  Endpoint: v1/financial_connections/accounts/{account}/subscribe

  Path Parameters:
    - account: 

  """
  (stripe-request :post (str "v1/financial_connections/accounts/" account "/subscribe") params))

(defn post-payment-intents-intent-cancel [intent params]
  """
  Cancel a PaymentIntent

  HTTP Method: POST
  Endpoint: v1/payment_intents/{intent}/cancel

  Path Parameters:
    - intent: 

  """
  (stripe-request :post (str "v1/payment_intents/" intent "/cancel") params))

(defn get-account [params params]
  """
  Retrieve account

  HTTP Method: GET
  Endpoint: v1/account

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/account") params))

(defn get-payment-links-payment-link-line-items [payment_link params]
  """
  Retrieve a payment link's line items

  HTTP Method: GET
  Endpoint: v1/payment_links/{payment_link}/line_items

  Path Parameters:
    - payment_link: 

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/payment_links/" payment_link "/line_items") params))

(defn get-treasury-inbound-transfers [params params]
  """
  List all InboundTransfers

  HTTP Method: GET
  Endpoint: v1/treasury/inbound_transfers

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - financial_account: Returns objects associated with this FinancialAccount.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return InboundTransfers that have the given status: `processing`, `succeeded`, `failed` or `canceled`.

  """
  (stripe-request :get (str "v1/treasury/inbound_transfers") params))

(defn post-treasury-inbound-transfers [params params]
  """
  Create an InboundTransfer

  HTTP Method: POST
  Endpoint: v1/treasury/inbound_transfers

  """
  (stripe-request :post (str "v1/treasury/inbound_transfers") params))

(defn get-transfers-transfer [transfer params]
  """
  Retrieve a transfer

  HTTP Method: GET
  Endpoint: v1/transfers/{transfer}

  Path Parameters:
    - transfer: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/transfers/" transfer "") params))

(defn post-transfers-transfer [transfer params]
  """
  Update a transfer

  HTTP Method: POST
  Endpoint: v1/transfers/{transfer}

  Path Parameters:
    - transfer: 

  """
  (stripe-request :post (str "v1/transfers/" transfer "") params))

(defn get-payment-intents-search [params params]
  """
  Search PaymentIntents

  HTTP Method: GET
  Endpoint: v1/payment_intents/search

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - page: A cursor for pagination across multiple pages of results. Don't include this parameter on the first call. Use the next_page value returned in a previous response to request subsequent results.
    - query: The search query string. See [search query language](https://stripe.com/docs/search#search-query-language) and the list of supported [query fields for payment intents](https://stripe.com/docs/search#query-fields-for-payment-intents).

  """
  (stripe-request :get (str "v1/payment_intents/search") params))

(defn get-billing-credit-grants-id [id params]
  """
  Retrieve a credit grant

  HTTP Method: GET
  Endpoint: v1/billing/credit_grants/{id}

  Path Parameters:
    - id: Unique identifier for the object.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/billing/credit_grants/" id "") params))

(defn post-billing-credit-grants-id [id params]
  """
  Update a credit grant

  HTTP Method: POST
  Endpoint: v1/billing/credit_grants/{id}

  Path Parameters:
    - id: Unique identifier for the object.

  """
  (stripe-request :post (str "v1/billing/credit_grants/" id "") params))

(defn post-setup-intents-intent-confirm [intent params]
  """
  Confirm a SetupIntent

  HTTP Method: POST
  Endpoint: v1/setup_intents/{intent}/confirm

  Path Parameters:
    - intent: 

  """
  (stripe-request :post (str "v1/setup_intents/" intent "/confirm") params))

(defn delete-customers-customer [customer params]
  """
  Delete a customer

  HTTP Method: DELETE
  Endpoint: v1/customers/{customer}

  Path Parameters:
    - customer: 

  """
  (stripe-request :delete (str "v1/customers/" customer "") params))

(defn get-customers-customer [customer params]
  """
  Retrieve a customer

  HTTP Method: GET
  Endpoint: v1/customers/{customer}

  Path Parameters:
    - customer: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/customers/" customer "") params))

(defn post-customers-customer [customer params]
  """
  Update a customer

  HTTP Method: POST
  Endpoint: v1/customers/{customer}

  Path Parameters:
    - customer: 

  """
  (stripe-request :post (str "v1/customers/" customer "") params))

(defn get-charges-charge [charge params]
  """
  Retrieve a charge

  HTTP Method: GET
  Endpoint: v1/charges/{charge}

  Path Parameters:
    - charge: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/charges/" charge "") params))

(defn post-charges-charge [charge params]
  """
  Update a charge

  HTTP Method: POST
  Endpoint: v1/charges/{charge}

  Path Parameters:
    - charge: 

  """
  (stripe-request :post (str "v1/charges/" charge "") params))

(defn delete-products-product-features-id [product id params]
  """
  Remove a feature from a product

  HTTP Method: DELETE
  Endpoint: v1/products/{product}/features/{id}

  Path Parameters:
    - id: 
    - product: 

  """
  (stripe-request :delete (str "v1/products/" product "/features/" id "") params))

(defn get-products-product-features-id [product id params]
  """
  Retrieve a product_feature

  HTTP Method: GET
  Endpoint: v1/products/{product}/features/{id}

  Path Parameters:
    - id: The ID of the product_feature.
    - product: The ID of the product.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/products/" product "/features/" id "") params))

(defn delete-webhook-endpoints-webhook-endpoint [webhook_endpoint params]
  """
  Delete a webhook endpoint

  HTTP Method: DELETE
  Endpoint: v1/webhook_endpoints/{webhook_endpoint}

  Path Parameters:
    - webhook_endpoint: 

  """
  (stripe-request :delete (str "v1/webhook_endpoints/" webhook_endpoint "") params))

(defn get-webhook-endpoints-webhook-endpoint [webhook_endpoint params]
  """
  Retrieve a webhook endpoint

  HTTP Method: GET
  Endpoint: v1/webhook_endpoints/{webhook_endpoint}

  Path Parameters:
    - webhook_endpoint: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/webhook_endpoints/" webhook_endpoint "") params))

(defn post-webhook-endpoints-webhook-endpoint [webhook_endpoint params]
  """
  Update a webhook endpoint

  HTTP Method: POST
  Endpoint: v1/webhook_endpoints/{webhook_endpoint}

  Path Parameters:
    - webhook_endpoint: 

  """
  (stripe-request :post (str "v1/webhook_endpoints/" webhook_endpoint "") params))

(defn get-file-links-link [link params]
  """
  Retrieve a file link

  HTTP Method: GET
  Endpoint: v1/file_links/{link}

  Path Parameters:
    - link: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/file_links/" link "") params))

(defn post-file-links-link [link params]
  """
  Update a file link

  HTTP Method: POST
  Endpoint: v1/file_links/{link}

  Path Parameters:
    - link: 

  """
  (stripe-request :post (str "v1/file_links/" link "") params))

(defn post-payouts-payout-reverse [payout params]
  """
  Reverse a payout

  HTTP Method: POST
  Endpoint: v1/payouts/{payout}/reverse

  Path Parameters:
    - payout: 

  """
  (stripe-request :post (str "v1/payouts/" payout "/reverse") params))

(defn get-credit-notes-preview [params params]
  """
  Preview a credit note

  HTTP Method: GET
  Endpoint: v1/credit_notes/preview

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
  (stripe-request :get (str "v1/credit_notes/preview") params))

(defn post-payment-methods-payment-method-attach [payment_method params]
  """
  Attach a PaymentMethod to a Customer

  HTTP Method: POST
  Endpoint: v1/payment_methods/{payment_method}/attach

  Path Parameters:
    - payment_method: 

  """
  (stripe-request :post (str "v1/payment_methods/" payment_method "/attach") params))

(defn delete-customers-customer-cards-id [customer id params]
  """
  Delete a customer source

  HTTP Method: DELETE
  Endpoint: v1/customers/{customer}/cards/{id}

  Path Parameters:
    - customer: 
    - id: 

  """
  (stripe-request :delete (str "v1/customers/" customer "/cards/" id "") params))

(defn get-customers-customer-cards-id [customer id params]
  """
  Retrieve a card

  HTTP Method: GET
  Endpoint: v1/customers/{customer}/cards/{id}

  Path Parameters:
    - customer: 
    - id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/customers/" customer "/cards/" id "") params))

(defn post-customers-customer-cards-id [customer id params]
  """
  No description available.

  HTTP Method: POST
  Endpoint: v1/customers/{customer}/cards/{id}

  Path Parameters:
    - customer: 
    - id: 

  """
  (stripe-request :post (str "v1/customers/" customer "/cards/" id "") params))

(defn get-invoiceitems [params params]
  """
  List all invoice items

  HTTP Method: GET
  Endpoint: v1/invoiceitems

  Query Parameters:
    - created: Only return invoice items that were created during the given date interval.
    - customer: The identifier of the customer whose invoice items to return. If none is provided, all invoice items will be returned.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - invoice: Only return invoice items belonging to this invoice. If none is provided, all invoice items will be returned. If specifying an invoice, no customer identifier is needed.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - pending: Set to `true` to only show pending invoice items, which are not yet attached to any invoices. Set to `false` to only show invoice items already attached to invoices. If unspecified, no filter is applied.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/invoiceitems") params))

(defn post-invoiceitems [params params]
  """
  Create an invoice item

  HTTP Method: POST
  Endpoint: v1/invoiceitems

  """
  (stripe-request :post (str "v1/invoiceitems") params))

(defn post-test-helpers-issuing-settlements [params params]
  """
  Create a test-mode settleemnt

  HTTP Method: POST
  Endpoint: v1/test_helpers/issuing/settlements

  """
  (stripe-request :post (str "v1/test_helpers/issuing/settlements") params))

(defn get-payment-links [params params]
  """
  List all payment links

  HTTP Method: GET
  Endpoint: v1/payment_links

  Query Parameters:
    - active: Only return payment links that are active or inactive (e.g., pass `false` to list all inactive payment links).
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/payment_links") params))

(defn post-payment-links [params params]
  """
  Create a payment link

  HTTP Method: POST
  Endpoint: v1/payment_links

  """
  (stripe-request :post (str "v1/payment_links") params))

(defn post-test-helpers-issuing-transactions-create-unlinked-refund [params params]
  """
  Create a test-mode unlinked refund

  HTTP Method: POST
  Endpoint: v1/test_helpers/issuing/transactions/create_unlinked_refund

  """
  (stripe-request :post (str "v1/test_helpers/issuing/transactions/create_unlinked_refund") params))

(defn post-test-helpers-issuing-authorizations-authorization-increment [authorization params]
  """
  Increment a test-mode authorization

  HTTP Method: POST
  Endpoint: v1/test_helpers/issuing/authorizations/{authorization}/increment

  Path Parameters:
    - authorization: 

  """
  (stripe-request :post (str "v1/test_helpers/issuing/authorizations/" authorization "/increment") params))

(defn post-test-helpers-issuing-cards-card-shipping-ship [card params]
  """
  Ship a testmode card

  HTTP Method: POST
  Endpoint: v1/test_helpers/issuing/cards/{card}/shipping/ship

  Path Parameters:
    - card: 

  """
  (stripe-request :post (str "v1/test_helpers/issuing/cards/" card "/shipping/ship") params))

(defn post-invoices-invoice-remove-lines [invoice params]
  """
  Bulk remove invoice line items

  HTTP Method: POST
  Endpoint: v1/invoices/{invoice}/remove_lines

  Path Parameters:
    - invoice: 

  """
  (stripe-request :post (str "v1/invoices/" invoice "/remove_lines") params))

(defn post-test-helpers-issuing-cards-card-shipping-deliver [card params]
  """
  Deliver a testmode card

  HTTP Method: POST
  Endpoint: v1/test_helpers/issuing/cards/{card}/shipping/deliver

  Path Parameters:
    - card: 

  """
  (stripe-request :post (str "v1/test_helpers/issuing/cards/" card "/shipping/deliver") params))

(defn get-issuing-cards-card [card params]
  """
  Retrieve a card

  HTTP Method: GET
  Endpoint: v1/issuing/cards/{card}

  Path Parameters:
    - card: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/issuing/cards/" card "") params))

(defn post-issuing-cards-card [card params]
  """
  Update a card

  HTTP Method: POST
  Endpoint: v1/issuing/cards/{card}

  Path Parameters:
    - card: 

  """
  (stripe-request :post (str "v1/issuing/cards/" card "") params))

(defn post-customers-customer-sources-id-verify [customer id params]
  """
  Verify a bank account

  HTTP Method: POST
  Endpoint: v1/customers/{customer}/sources/{id}/verify

  Path Parameters:
    - customer: 
    - id: 

  """
  (stripe-request :post (str "v1/customers/" customer "/sources/" id "/verify") params))

(defn post-subscriptions-subscription-resume [subscription params]
  """
  Resume a subscription

  HTTP Method: POST
  Endpoint: v1/subscriptions/{subscription}/resume

  Path Parameters:
    - subscription: 

  """
  (stripe-request :post (str "v1/subscriptions/" subscription "/resume") params))

(defn post-accounts-account-bank-accounts [account params]
  """
  Create an external account

  HTTP Method: POST
  Endpoint: v1/accounts/{account}/bank_accounts

  Path Parameters:
    - account: 

  """
  (stripe-request :post (str "v1/accounts/" account "/bank_accounts") params))

(defn get-issuing-transactions [params params]
  """
  List all transactions

  HTTP Method: GET
  Endpoint: v1/issuing/transactions

  Query Parameters:
    - card: Only return transactions that belong to the given card.
    - cardholder: Only return transactions that belong to the given cardholder.
    - created: Only return transactions that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - type: Only return transactions that have the given type. One of `capture` or `refund`.

  """
  (stripe-request :get (str "v1/issuing/transactions") params))

(defn post-test-helpers-terminal-readers-reader-present-payment-method [reader params]
  """
  Simulate presenting a payment method

  HTTP Method: POST
  Endpoint: v1/test_helpers/terminal/readers/{reader}/present_payment_method

  Path Parameters:
    - reader: 

  """
  (stripe-request :post (str "v1/test_helpers/terminal/readers/" reader "/present_payment_method") params))

(defn get-treasury-credit-reversals [params params]
  """
  List all CreditReversals

  HTTP Method: GET
  Endpoint: v1/treasury/credit_reversals

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - financial_account: Returns objects associated with this FinancialAccount.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - received_credit: Only return CreditReversals for the ReceivedCredit ID.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return CreditReversals for a given status.

  """
  (stripe-request :get (str "v1/treasury/credit_reversals") params))

(defn post-treasury-credit-reversals [params params]
  """
  Create a CreditReversal

  HTTP Method: POST
  Endpoint: v1/treasury/credit_reversals

  """
  (stripe-request :post (str "v1/treasury/credit_reversals") params))

(defn get-issuing-personalization-designs [params params]
  """
  List all personalization designs

  HTTP Method: GET
  Endpoint: v1/issuing/personalization_designs

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - lookup_keys: Only return personalization designs with the given lookup keys.
    - preferences: Only return personalization designs with the given preferences.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return personalization designs with the given status.

  """
  (stripe-request :get (str "v1/issuing/personalization_designs") params))

(defn post-issuing-personalization-designs [params params]
  """
  Create a personalization design

  HTTP Method: POST
  Endpoint: v1/issuing/personalization_designs

  """
  (stripe-request :post (str "v1/issuing/personalization_designs") params))

(defn get-terminal-readers [params params]
  """
  List all Readers

  HTTP Method: GET
  Endpoint: v1/terminal/readers

  Query Parameters:
    - device_type: Filters readers by device type
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - location: A location ID to filter the response list to only readers at the specific location
    - serial_number: Filters readers by serial number
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: A status filter to filter readers to only offline or online readers

  """
  (stripe-request :get (str "v1/terminal/readers") params))

(defn post-terminal-readers [params params]
  """
  Create a Reader

  HTTP Method: POST
  Endpoint: v1/terminal/readers

  """
  (stripe-request :post (str "v1/terminal/readers") params))

(defn get-apple-pay-domains [params params]
  """
  No description available.

  HTTP Method: GET
  Endpoint: v1/apple_pay/domains

  Query Parameters:
    - domain_name: 
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/apple_pay/domains") params))

(defn post-apple-pay-domains [params params]
  """
  No description available.

  HTTP Method: POST
  Endpoint: v1/apple_pay/domains

  """
  (stripe-request :post (str "v1/apple_pay/domains") params))

(defn get-tax-codes-id [id params]
  """
  Retrieve a tax code

  HTTP Method: GET
  Endpoint: v1/tax_codes/{id}

  Path Parameters:
    - id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/tax_codes/" id "") params))

(defn get-billing-credit-balance-transactions [params params]
  """
  List credit balance transactions

  HTTP Method: GET
  Endpoint: v1/billing/credit_balance_transactions

  Query Parameters:
    - credit_grant: The credit grant for which to fetch credit balance transactions.
    - customer: The customer for which to fetch credit balance transactions.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/billing/credit_balance_transactions") params))

(defn post-charges-charge-refund [charge params]
  """
  Create a refund

  HTTP Method: POST
  Endpoint: v1/charges/{charge}/refund

  Path Parameters:
    - charge: The identifier of the charge to refund.

  """
  (stripe-request :post (str "v1/charges/" charge "/refund") params))

(defn get-issuing-physical-bundles-physical-bundle [physical_bundle params]
  """
  Retrieve a physical bundle

  HTTP Method: GET
  Endpoint: v1/issuing/physical_bundles/{physical_bundle}

  Path Parameters:
    - physical_bundle: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/issuing/physical_bundles/" physical_bundle "") params))

(defn get-treasury-transactions-id [id params]
  """
  Retrieve a Transaction

  HTTP Method: GET
  Endpoint: v1/treasury/transactions/{id}

  Path Parameters:
    - id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/treasury/transactions/" id "") params))

(defn get-customers-customer-payment-methods [customer params]
  """
  List a Customer's PaymentMethods

  HTTP Method: GET
  Endpoint: v1/customers/{customer}/payment_methods

  Path Parameters:
    - customer: 

  Query Parameters:
    - allow_redisplay: This field indicates whether this payment method can be shown again to its customer in a checkout flow. Stripe products such as Checkout and Elements use this field to determine whether a payment method can be shown as a saved payment method in a checkout flow. The field defaults to `unspecified`.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - type: An optional filter on the list, based on the object `type` field. Without the filter, the list includes all current and future payment method types. If your integration expects only one type of payment method in the response, make sure to provide a type value in the request.

  """
  (stripe-request :get (str "v1/customers/" customer "/payment_methods") params))

(defn get-customers [params params]
  """
  List all customers

  HTTP Method: GET
  Endpoint: v1/customers

  Query Parameters:
    - created: Only return customers that were created during the given date interval.
    - email: A case-sensitive filter on the list based on the customer's `email` field. The value must be a string.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - test_clock: Provides a list of customers that are associated with the specified test clock. The response will not include customers with test clocks if this parameter is not set.

  """
  (stripe-request :get (str "v1/customers") params))

(defn post-customers [params params]
  """
  Create a customer

  HTTP Method: POST
  Endpoint: v1/customers

  """
  (stripe-request :post (str "v1/customers") params))

(defn post-setup-intents-intent-verify-microdeposits [intent params]
  """
  Verify microdeposits on a SetupIntent

  HTTP Method: POST
  Endpoint: v1/setup_intents/{intent}/verify_microdeposits

  Path Parameters:
    - intent: 

  """
  (stripe-request :post (str "v1/setup_intents/" intent "/verify_microdeposits") params))

(defn get-financial-connections-accounts [params params]
  """
  List Accounts

  HTTP Method: GET
  Endpoint: v1/financial_connections/accounts

  Query Parameters:
    - account_holder: If present, only return accounts that belong to the specified account holder. `account_holder[customer]` and `account_holder[account]` are mutually exclusive.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - session: If present, only return accounts that were collected as part of the given session.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/financial_connections/accounts") params))

(defn get-country-specs [params params]
  """
  List Country Specs

  HTTP Method: GET
  Endpoint: v1/country_specs

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/country_specs") params))

(defn get-charges-charge-refunds-refund [charge refund params]
  """
  No description available.

  HTTP Method: GET
  Endpoint: v1/charges/{charge}/refunds/{refund}

  Path Parameters:
    - charge: 
    - refund: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/charges/" charge "/refunds/" refund "") params))

(defn post-charges-charge-refunds-refund [charge refund params]
  """
  No description available.

  HTTP Method: POST
  Endpoint: v1/charges/{charge}/refunds/{refund}

  Path Parameters:
    - charge: 
    - refund: 

  """
  (stripe-request :post (str "v1/charges/" charge "/refunds/" refund "") params))

(defn delete-customers-customer-discount [customer params]
  """
  Delete a customer discount

  HTTP Method: DELETE
  Endpoint: v1/customers/{customer}/discount

  Path Parameters:
    - customer: 

  """
  (stripe-request :delete (str "v1/customers/" customer "/discount") params))

(defn get-customers-customer-discount [customer params]
  """
  No description available.

  HTTP Method: GET
  Endpoint: v1/customers/{customer}/discount

  Path Parameters:
    - customer: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/customers/" customer "/discount") params))

(defn get-payment-methods-payment-method [payment_method params]
  """
  Retrieve a PaymentMethod

  HTTP Method: GET
  Endpoint: v1/payment_methods/{payment_method}

  Path Parameters:
    - payment_method: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/payment_methods/" payment_method "") params))

(defn post-payment-methods-payment-method [payment_method params]
  """
  Update a PaymentMethod

  HTTP Method: POST
  Endpoint: v1/payment_methods/{payment_method}

  Path Parameters:
    - payment_method: 

  """
  (stripe-request :post (str "v1/payment_methods/" payment_method "") params))

(defn get-accounts-account-external-accounts [account params]
  """
  List all external accounts

  HTTP Method: GET
  Endpoint: v1/accounts/{account}/external_accounts

  Path Parameters:
    - account: 

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - object: Filter external accounts according to a particular object type.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/accounts/" account "/external_accounts") params))

(defn post-accounts-account-external-accounts [account params]
  """
  Create an external account

  HTTP Method: POST
  Endpoint: v1/accounts/{account}/external_accounts

  Path Parameters:
    - account: 

  """
  (stripe-request :post (str "v1/accounts/" account "/external_accounts") params))

(defn get-apps-secrets-find [params params]
  """
  Find a Secret

  HTTP Method: GET
  Endpoint: v1/apps/secrets/find

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.
    - name: A name for the secret that's unique within the scope.
    - scope: Specifies the scoping of the secret. Requests originating from UI extensions can only access account-scoped secrets or secrets scoped to their own user.

  """
  (stripe-request :get (str "v1/apps/secrets/find") params))

(defn get-products-product-features [product params]
  """
  List all features attached to a product

  HTTP Method: GET
  Endpoint: v1/products/{product}/features

  Path Parameters:
    - product: 

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/products/" product "/features") params))

(defn post-products-product-features [product params]
  """
  Attach a feature to a product

  HTTP Method: POST
  Endpoint: v1/products/{product}/features

  Path Parameters:
    - product: 

  """
  (stripe-request :post (str "v1/products/" product "/features") params))

(defn post-invoice-rendering-templates-template-unarchive [template params]
  """
  Unarchive an invoice rendering template

  HTTP Method: POST
  Endpoint: v1/invoice_rendering_templates/{template}/unarchive

  Path Parameters:
    - template: 

  """
  (stripe-request :post (str "v1/invoice_rendering_templates/" template "/unarchive") params))

(defn post-payment-intents-intent-confirm [intent params]
  """
  Confirm a PaymentIntent

  HTTP Method: POST
  Endpoint: v1/payment_intents/{intent}/confirm

  Path Parameters:
    - intent: 

  """
  (stripe-request :post (str "v1/payment_intents/" intent "/confirm") params))

(defn post-ephemeral-keys [params params]
  """
  Create an ephemeral key

  HTTP Method: POST
  Endpoint: v1/ephemeral_keys

  """
  (stripe-request :post (str "v1/ephemeral_keys") params))

(defn get-treasury-financial-accounts-financial-account [financial_account params]
  """
  Retrieve a FinancialAccount

  HTTP Method: GET
  Endpoint: v1/treasury/financial_accounts/{financial_account}

  Path Parameters:
    - financial_account: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/treasury/financial_accounts/" financial_account "") params))

(defn post-treasury-financial-accounts-financial-account [financial_account params]
  """
  Update a FinancialAccount

  HTTP Method: POST
  Endpoint: v1/treasury/financial_accounts/{financial_account}

  Path Parameters:
    - financial_account: 

  """
  (stripe-request :post (str "v1/treasury/financial_accounts/" financial_account "") params))

(defn post-payment-intents-intent-apply-customer-balance [intent params]
  """
  Reconcile a customer_balance PaymentIntent

  HTTP Method: POST
  Endpoint: v1/payment_intents/{intent}/apply_customer_balance

  Path Parameters:
    - intent: 

  """
  (stripe-request :post (str "v1/payment_intents/" intent "/apply_customer_balance") params))

(defn get-invoices-upcoming [params params]
  """
  Retrieve an upcoming invoice

  HTTP Method: GET
  Endpoint: v1/invoices/upcoming

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
  (stripe-request :get (str "v1/invoices/upcoming") params))

(defn get-terminal-locations [params params]
  """
  List all Locations

  HTTP Method: GET
  Endpoint: v1/terminal/locations

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/terminal/locations") params))

(defn post-terminal-locations [params params]
  """
  Create a Location

  HTTP Method: POST
  Endpoint: v1/terminal/locations

  """
  (stripe-request :post (str "v1/terminal/locations") params))

(defn get-issuing-cardholders-cardholder [cardholder params]
  """
  Retrieve a cardholder

  HTTP Method: GET
  Endpoint: v1/issuing/cardholders/{cardholder}

  Path Parameters:
    - cardholder: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/issuing/cardholders/" cardholder "") params))

(defn post-issuing-cardholders-cardholder [cardholder params]
  """
  Update a cardholder

  HTTP Method: POST
  Endpoint: v1/issuing/cardholders/{cardholder}

  Path Parameters:
    - cardholder: 

  """
  (stripe-request :post (str "v1/issuing/cardholders/" cardholder "") params))

(defn get-billing-meters-id [id params]
  """
  Retrieve a billing meter

  HTTP Method: GET
  Endpoint: v1/billing/meters/{id}

  Path Parameters:
    - id: Unique identifier for the object.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/billing/meters/" id "") params))

(defn post-billing-meters-id [id params]
  """
  Update a billing meter

  HTTP Method: POST
  Endpoint: v1/billing/meters/{id}

  Path Parameters:
    - id: Unique identifier for the object.

  """
  (stripe-request :post (str "v1/billing/meters/" id "") params))

(defn get-payouts [params params]
  """
  List all payouts

  HTTP Method: GET
  Endpoint: v1/payouts

  Query Parameters:
    - arrival_date: Only return payouts that are expected to arrive during the given date interval.
    - created: Only return payouts that were created during the given date interval.
    - destination: The ID of an external account - only return payouts sent to this external account.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return payouts that have the given status: `pending`, `paid`, `failed`, or `canceled`.

  """
  (stripe-request :get (str "v1/payouts") params))

(defn post-payouts [params params]
  """
  Create a payout

  HTTP Method: POST
  Endpoint: v1/payouts

  """
  (stripe-request :post (str "v1/payouts") params))

(defn get-treasury-debit-reversals [params params]
  """
  List all DebitReversals

  HTTP Method: GET
  Endpoint: v1/treasury/debit_reversals

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - financial_account: Returns objects associated with this FinancialAccount.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - received_debit: Only return DebitReversals for the ReceivedDebit ID.
    - resolution: Only return DebitReversals for a given resolution.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return DebitReversals for a given status.

  """
  (stripe-request :get (str "v1/treasury/debit_reversals") params))

(defn post-treasury-debit-reversals [params params]
  """
  Create a DebitReversal

  HTTP Method: POST
  Endpoint: v1/treasury/debit_reversals

  """
  (stripe-request :post (str "v1/treasury/debit_reversals") params))

(defn get-quotes-quote-pdf [quote params]
  """
  Download quote PDF

  HTTP Method: GET
  Endpoint: v1/quotes/{quote}/pdf

  Path Parameters:
    - quote: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/quotes/" quote "/pdf") params))

(defn get-setup-intents [params params]
  """
  List all SetupIntents

  HTTP Method: GET
  Endpoint: v1/setup_intents

  Query Parameters:
    - attach_to_self: If present, the SetupIntent's payment method will be attached to the in-context Stripe Account.

It can only be used for this Stripe Account’s own money movement flows like InboundTransfer and OutboundTransfers. It cannot be set to true when setting up a PaymentMethod for a Customer, and defaults to false when attaching a PaymentMethod to a Customer.
    - created: A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options.
    - customer: Only return SetupIntents for the customer specified by this customer ID.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - payment_method: Only return SetupIntents that associate with the specified payment method.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/setup_intents") params))

(defn post-setup-intents [params params]
  """
  Create a SetupIntent

  HTTP Method: POST
  Endpoint: v1/setup_intents

  """
  (stripe-request :post (str "v1/setup_intents") params))

(defn get-identity-verification-sessions-session [session params]
  """
  Retrieve a VerificationSession

  HTTP Method: GET
  Endpoint: v1/identity/verification_sessions/{session}

  Path Parameters:
    - session: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/identity/verification_sessions/" session "") params))

(defn post-identity-verification-sessions-session [session params]
  """
  Update a VerificationSession

  HTTP Method: POST
  Endpoint: v1/identity/verification_sessions/{session}

  Path Parameters:
    - session: 

  """
  (stripe-request :post (str "v1/identity/verification_sessions/" session "") params))

(defn post-checkout-sessions-session-expire [session params]
  """
  Expire a Session

  HTTP Method: POST
  Endpoint: v1/checkout/sessions/{session}/expire

  Path Parameters:
    - session: 

  """
  (stripe-request :post (str "v1/checkout/sessions/" session "/expire") params))

(defn get-payment-intents [params params]
  """
  List all PaymentIntents

  HTTP Method: GET
  Endpoint: v1/payment_intents

  Query Parameters:
    - created: A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp or a dictionary with a number of different query options.
    - customer: Only return PaymentIntents for the customer that this customer ID specifies.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/payment_intents") params))

(defn post-payment-intents [params params]
  """
  Create a PaymentIntent

  HTTP Method: POST
  Endpoint: v1/payment_intents

  """
  (stripe-request :post (str "v1/payment_intents") params))

(defn post-application-fees-id-refund [id params]
  """
  No description available.

  HTTP Method: POST
  Endpoint: v1/application_fees/{id}/refund

  Path Parameters:
    - id: 

  """
  (stripe-request :post (str "v1/application_fees/" id "/refund") params))

(defn delete-accounts-account-external-accounts-id [account id params]
  """
  Delete an external account

  HTTP Method: DELETE
  Endpoint: v1/accounts/{account}/external_accounts/{id}

  Path Parameters:
    - account: 
    - id: 

  """
  (stripe-request :delete (str "v1/accounts/" account "/external_accounts/" id "") params))

(defn get-accounts-account-external-accounts-id [account id params]
  """
  Retrieve an external account

  HTTP Method: GET
  Endpoint: v1/accounts/{account}/external_accounts/{id}

  Path Parameters:
    - account: 
    - id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/accounts/" account "/external_accounts/" id "") params))

(defn post-accounts-account-external-accounts-id [account id params]
  """
  No description available.

  HTTP Method: POST
  Endpoint: v1/accounts/{account}/external_accounts/{id}

  Path Parameters:
    - account: 
    - id: 

  """
  (stripe-request :post (str "v1/accounts/" account "/external_accounts/" id "") params))

(defn delete-invoices-invoice [invoice params]
  """
  Delete a draft invoice

  HTTP Method: DELETE
  Endpoint: v1/invoices/{invoice}

  Path Parameters:
    - invoice: 

  """
  (stripe-request :delete (str "v1/invoices/" invoice "") params))

(defn get-invoices-invoice [invoice params]
  """
  Retrieve an invoice

  HTTP Method: GET
  Endpoint: v1/invoices/{invoice}

  Path Parameters:
    - invoice: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/invoices/" invoice "") params))

(defn post-invoices-invoice [invoice params]
  """
  Update an invoice

  HTTP Method: POST
  Endpoint: v1/invoices/{invoice}

  Path Parameters:
    - invoice: 

  """
  (stripe-request :post (str "v1/invoices/" invoice "") params))

(defn get-test-helpers-test-clocks [params params]
  """
  List all test clocks

  HTTP Method: GET
  Endpoint: v1/test_helpers/test_clocks

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/test_helpers/test_clocks") params))

(defn post-test-helpers-test-clocks [params params]
  """
  Create a test clock

  HTTP Method: POST
  Endpoint: v1/test_helpers/test_clocks

  """
  (stripe-request :post (str "v1/test_helpers/test_clocks") params))

(defn post-test-helpers-issuing-transactions-create-force-capture [params params]
  """
  Create a test-mode force capture

  HTTP Method: POST
  Endpoint: v1/test_helpers/issuing/transactions/create_force_capture

  """
  (stripe-request :post (str "v1/test_helpers/issuing/transactions/create_force_capture") params))

(defn post-test-helpers-treasury-outbound-payments-id [id params]
  """
  Test mode: Update an OutboundPayment

  HTTP Method: POST
  Endpoint: v1/test_helpers/treasury/outbound_payments/{id}

  Path Parameters:
    - id: 

  """
  (stripe-request :post (str "v1/test_helpers/treasury/outbound_payments/" id "") params))

(defn post-issuing-authorizations-authorization-approve [authorization params]
  """
  Approve an authorization

  HTTP Method: POST
  Endpoint: v1/issuing/authorizations/{authorization}/approve

  Path Parameters:
    - authorization: 

  """
  (stripe-request :post (str "v1/issuing/authorizations/" authorization "/approve") params))

(defn post-invoices-invoice-pay [invoice params]
  """
  Pay an invoice

  HTTP Method: POST
  Endpoint: v1/invoices/{invoice}/pay

  Path Parameters:
    - invoice: 

  """
  (stripe-request :post (str "v1/invoices/" invoice "/pay") params))

(defn get-climate-suppliers-supplier [supplier params]
  """
  Retrieve a supplier

  HTTP Method: GET
  Endpoint: v1/climate/suppliers/{supplier}

  Path Parameters:
    - supplier: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/climate/suppliers/" supplier "") params))

(defn get-issuing-settlements-settlement [settlement params]
  """
  Retrieve a settlement

  HTTP Method: GET
  Endpoint: v1/issuing/settlements/{settlement}

  Path Parameters:
    - settlement: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/issuing/settlements/" settlement "") params))

(defn post-issuing-settlements-settlement [settlement params]
  """
  Update a settlement

  HTTP Method: POST
  Endpoint: v1/issuing/settlements/{settlement}

  Path Parameters:
    - settlement: 

  """
  (stripe-request :post (str "v1/issuing/settlements/" settlement "") params))

(defn get-refunds [params params]
  """
  List all refunds

  HTTP Method: GET
  Endpoint: v1/refunds

  Query Parameters:
    - charge: Only return refunds for the charge specified by this charge ID.
    - created: Only return refunds that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - payment_intent: Only return refunds for the PaymentIntent specified by this ID.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/refunds") params))

(defn post-refunds [params params]
  """
  Create customer balance refund

  HTTP Method: POST
  Endpoint: v1/refunds

  """
  (stripe-request :post (str "v1/refunds") params))

(defn post-billing-meter-events [params params]
  """
  Create a billing meter event

  HTTP Method: POST
  Endpoint: v1/billing/meter_events

  """
  (stripe-request :post (str "v1/billing/meter_events") params))

(defn get-subscriptions [params params]
  """
  List subscriptions

  HTTP Method: GET
  Endpoint: v1/subscriptions

  Query Parameters:
    - automatic_tax: Filter subscriptions by their automatic tax settings.
    - collection_method: The collection method of the subscriptions to retrieve. Either `charge_automatically` or `send_invoice`.
    - created: Only return subscriptions that were created during the given date interval.
    - current_period_end: Only return subscriptions whose current_period_end falls within the given date interval.
    - current_period_start: Only return subscriptions whose current_period_start falls within the given date interval.
    - customer: The ID of the customer whose subscriptions will be retrieved.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - price: Filter for subscriptions that contain this recurring price ID.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: The status of the subscriptions to retrieve. Passing in a value of `canceled` will return all canceled subscriptions, including those belonging to deleted customers. Pass `ended` to find subscriptions that are canceled and subscriptions that are expired due to [incomplete payment](https://stripe.com/docs/billing/subscriptions/overview#subscription-statuses). Passing in a value of `all` will return subscriptions of all statuses. If no value is supplied, all subscriptions that have not been canceled are returned.
    - test_clock: Filter for subscriptions that are associated with the specified test clock. The response will not include subscriptions with test clocks if this and the customer parameter is not set.

  """
  (stripe-request :get (str "v1/subscriptions") params))

(defn post-subscriptions [params params]
  """
  Create a subscription

  HTTP Method: POST
  Endpoint: v1/subscriptions

  """
  (stripe-request :post (str "v1/subscriptions") params))

(defn delete-products-id [id params]
  """
  Delete a product

  HTTP Method: DELETE
  Endpoint: v1/products/{id}

  Path Parameters:
    - id: 

  """
  (stripe-request :delete (str "v1/products/" id "") params))

(defn get-products-id [id params]
  """
  Retrieve a product

  HTTP Method: GET
  Endpoint: v1/products/{id}

  Path Parameters:
    - id: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/products/" id "") params))

(defn post-products-id [id params]
  """
  Update a product

  HTTP Method: POST
  Endpoint: v1/products/{id}

  Path Parameters:
    - id: 

  """
  (stripe-request :post (str "v1/products/" id "") params))

(defn get-issuing-tokens-token [token params]
  """
  Retrieve an issuing token

  HTTP Method: GET
  Endpoint: v1/issuing/tokens/{token}

  Path Parameters:
    - token: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/issuing/tokens/" token "") params))

(defn post-issuing-tokens-token [token params]
  """
  Update a token status

  HTTP Method: POST
  Endpoint: v1/issuing/tokens/{token}

  Path Parameters:
    - token: 

  """
  (stripe-request :post (str "v1/issuing/tokens/" token "") params))

(defn get-shipping-rates [params params]
  """
  List all shipping rates

  HTTP Method: GET
  Endpoint: v1/shipping_rates

  Query Parameters:
    - active: Only return shipping rates that are active or inactive.
    - created: A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options.
    - currency: Only return shipping rates for the given currency.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/shipping_rates") params))

(defn post-shipping-rates [params params]
  """
  Create a shipping rate

  HTTP Method: POST
  Endpoint: v1/shipping_rates

  """
  (stripe-request :post (str "v1/shipping_rates") params))

(defn post-test-helpers-issuing-cards-card-shipping-submit [card params]
  """
  Submit a testmode card

  HTTP Method: POST
  Endpoint: v1/test_helpers/issuing/cards/{card}/shipping/submit

  Path Parameters:
    - card: 

  """
  (stripe-request :post (str "v1/test_helpers/issuing/cards/" card "/shipping/submit") params))

(defn post-accounts-account-reject [account params]
  """
  Reject an account

  HTTP Method: POST
  Endpoint: v1/accounts/{account}/reject

  Path Parameters:
    - account: 

  """
  (stripe-request :post (str "v1/accounts/" account "/reject") params))

(defn get-file-links [params params]
  """
  List all file links

  HTTP Method: GET
  Endpoint: v1/file_links

  Query Parameters:
    - created: Only return links that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - expired: Filter links by their expiration status. By default, Stripe returns all links.
    - file: Only return links for the given file.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/file_links") params))

(defn post-file-links [params params]
  """
  Create a file link

  HTTP Method: POST
  Endpoint: v1/file_links

  """
  (stripe-request :post (str "v1/file_links") params))

(defn get-tax-rates [params params]
  """
  List all tax rates

  HTTP Method: GET
  Endpoint: v1/tax_rates

  Query Parameters:
    - active: Optional flag to filter by tax rates that are either active or inactive (archived).
    - created: Optional range for filtering created date.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - inclusive: Optional flag to filter by tax rates that are inclusive (or those that are not inclusive).
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "v1/tax_rates") params))

(defn post-tax-rates [params params]
  """
  Create a tax rate

  HTTP Method: POST
  Endpoint: v1/tax_rates

  """
  (stripe-request :post (str "v1/tax_rates") params))

(defn post-subscription-schedules-schedule-cancel [schedule params]
  """
  Cancel a schedule

  HTTP Method: POST
  Endpoint: v1/subscription_schedules/{schedule}/cancel

  Path Parameters:
    - schedule: 

  """
  (stripe-request :post (str "v1/subscription_schedules/" schedule "/cancel") params))

(defn get-radar-early-fraud-warnings-early-fraud-warning [early_fraud_warning params]
  """
  Retrieve an early fraud warning

  HTTP Method: GET
  Endpoint: v1/radar/early_fraud_warnings/{early_fraud_warning}

  Path Parameters:
    - early_fraud_warning: 

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "v1/radar/early_fraud_warnings/" early_fraud_warning "") params))

(defn post-sources [params params]
  """
  Shares a source

  HTTP Method: POST
  Endpoint: v1/sources

  """
  (stripe-request :post (str "v1/sources") params))

(defn post-terminal-connection-tokens [params params]
  """
  Create a Connection Token

  HTTP Method: POST
  Endpoint: v1/terminal/connection_tokens

  """
  (stripe-request :post (str "v1/terminal/connection_tokens") params))