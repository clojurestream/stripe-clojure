(ns stream.clojure.stripe.api
  "WARNING: This file is auto-generated from Stripe's OpenAPI spec.
  DO NOT MODIFY THIS FILE MANUALLY. Any changes will be overwritten.
  ALPHA: Work-in-progress - expect breaking changes before the stable release."
 (:require [stream.clojure.stripe.request :refer [stripe-request]]))

(defn post-billing-alerts-id-archive [id params]
  (stripe-request :post (str "v1/billing/alerts/" id "/archive") params))

(defn post-climate-orders-order-cancel [order params]
  (stripe-request :post (str "v1/climate/orders/" order "/cancel") params))

(defn get-subscription-schedules [params params]
  (stripe-request :get (str "v1/subscription_schedules") params))

(defn post-subscription-schedules [params params]
  (stripe-request :post (str "v1/subscription_schedules") params))

(defn get-radar-early-fraud-warnings [params params]
  (stripe-request :get (str "v1/radar/early_fraud_warnings") params))

(defn get-treasury-transaction-entries-id [id params]
  (stripe-request :get (str "v1/treasury/transaction_entries/" id "") params))

(defn post-test-helpers-treasury-outbound-payments-id-fail [id params]
  (stripe-request :post (str "v1/test_helpers/treasury/outbound_payments/" id "/fail") params))

(defn get-tax-ids [params params]
  (stripe-request :get (str "v1/tax_ids") params))

(defn post-tax-ids [params params]
  (stripe-request :post (str "v1/tax_ids") params))

(defn get-climate-suppliers [params params]
  (stripe-request :get (str "v1/climate/suppliers") params))

(defn get-linked-accounts-account [account params]
  (stripe-request :get (str "v1/linked_accounts/" account "") params))

(defn get-tax-registrations-id [id params]
  (stripe-request :get (str "v1/tax/registrations/" id "") params))

(defn post-tax-registrations-id [id params]
  (stripe-request :post (str "v1/tax/registrations/" id "") params))

(defn get-balance-history [params params]
  (stripe-request :get (str "v1/balance/history") params))

(defn get-promotion-codes-promotion-code [promotion_code params]
  (stripe-request :get (str "v1/promotion_codes/" promotion_code "") params))

(defn post-promotion-codes-promotion-code [promotion_code params]
  (stripe-request :post (str "v1/promotion_codes/" promotion_code "") params))

(defn get-customers-customer-cash-balance-transactions-transaction [customer transaction params]
  (stripe-request :get (str "v1/customers/" customer "/cash_balance_transactions/" transaction "") params))

(defn get-topups [params params]
  (stripe-request :get (str "v1/topups") params))

(defn post-topups [params params]
  (stripe-request :post (str "v1/topups") params))

(defn get-payment-links-payment-link [payment_link params]
  (stripe-request :get (str "v1/payment_links/" payment_link "") params))

(defn post-payment-links-payment-link [payment_link params]
  (stripe-request :post (str "v1/payment_links/" payment_link "") params))

(defn get-payment-method-domains [params params]
  (stripe-request :get (str "v1/payment_method_domains") params))

(defn post-payment-method-domains [params params]
  (stripe-request :post (str "v1/payment_method_domains") params))

(defn post-billing-portal-sessions [params params]
  (stripe-request :post (str "v1/billing_portal/sessions") params))

(defn post-account-links [params params]
  (stripe-request :post (str "v1/account_links") params))

(defn get-sources-source-source-transactions-source-transaction [source source_transaction params]
  (stripe-request :get (str "v1/sources/" source "/source_transactions/" source_transaction "") params))

(defn get-invoices-upcoming-lines [params params]
  (stripe-request :get (str "v1/invoices/upcoming/lines") params))

(defn get-issuing-disputes-dispute [dispute params]
  (stripe-request :get (str "v1/issuing/disputes/" dispute "") params))

(defn post-issuing-disputes-dispute [dispute params]
  (stripe-request :post (str "v1/issuing/disputes/" dispute "") params))

(defn get-climate-products [params params]
  (stripe-request :get (str "v1/climate/products") params))

(defn post-refunds-refund-cancel [refund params]
  (stripe-request :post (str "v1/refunds/" refund "/cancel") params))

(defn post-tax-transactions-create-reversal [params params]
  (stripe-request :post (str "v1/tax/transactions/create_reversal") params))

(defn delete-terminal-configurations-configuration [configuration params]
  (stripe-request :delete (str "v1/terminal/configurations/" configuration "") params))

(defn get-terminal-configurations-configuration [configuration params]
  (stripe-request :get (str "v1/terminal/configurations/" configuration "") params))

(defn post-terminal-configurations-configuration [configuration params]
  (stripe-request :post (str "v1/terminal/configurations/" configuration "") params))

(defn get-mandates-mandate [mandate params]
  (stripe-request :get (str "v1/mandates/" mandate "") params))

(defn get-prices [params params]
  (stripe-request :get (str "v1/prices") params))

(defn post-prices [params params]
  (stripe-request :post (str "v1/prices") params))

(defn post-setup-intents-intent-cancel [intent params]
  (stripe-request :post (str "v1/setup_intents/" intent "/cancel") params))

(defn get-identity-verification-sessions [params params]
  (stripe-request :get (str "v1/identity/verification_sessions") params))

(defn post-identity-verification-sessions [params params]
  (stripe-request :post (str "v1/identity/verification_sessions") params))

(defn get-treasury-outbound-payments-id [id params]
  (stripe-request :get (str "v1/treasury/outbound_payments/" id "") params))

(defn post-test-helpers-treasury-outbound-transfers-outbound-transfer-post [outbound_transfer params]
  (stripe-request :post (str "v1/test_helpers/treasury/outbound_transfers/" outbound_transfer "/post") params))

(defn post-test-helpers-issuing-authorizations-authorization-finalize-amount [authorization params]
  (stripe-request :post (str "v1/test_helpers/issuing/authorizations/" authorization "/finalize_amount") params))

(defn post-sources-source-verify [source params]
  (stripe-request :post (str "v1/sources/" source "/verify") params))

(defn get-treasury-transactions [params params]
  (stripe-request :get (str "v1/treasury/transactions") params))

(defn get-checkout-sessions-session [session params]
  (stripe-request :get (str "v1/checkout/sessions/" session "") params))

(defn post-checkout-sessions-session [session params]
  (stripe-request :post (str "v1/checkout/sessions/" session "") params))

(defn get-climate-products-product [product params]
  (stripe-request :get (str "v1/climate/products/" product "") params))

(defn post-financial-connections-sessions [params params]
  (stripe-request :post (str "v1/financial_connections/sessions") params))

(defn post-invoice-rendering-templates-template-archive [template params]
  (stripe-request :post (str "v1/invoice_rendering_templates/" template "/archive") params))

(defn post-test-helpers-issuing-transactions-transaction-refund [transaction params]
  (stripe-request :post (str "v1/test_helpers/issuing/transactions/" transaction "/refund") params))

(defn post-invoices-create-preview [params params]
  (stripe-request :post (str "v1/invoices/create_preview") params))

(defn get-customers-customer-balance-transactions [customer params]
  (stripe-request :get (str "v1/customers/" customer "/balance_transactions") params))

(defn post-customers-customer-balance-transactions [customer params]
  (stripe-request :post (str "v1/customers/" customer "/balance_transactions") params))

(defn post-credit-notes-id-void [id params]
  (stripe-request :post (str "v1/credit_notes/" id "/void") params))

(defn get-balance-transactions [params params]
  (stripe-request :get (str "v1/balance_transactions") params))

(defn get-terminal-configurations [params params]
  (stripe-request :get (str "v1/terminal/configurations") params))

(defn post-terminal-configurations [params params]
  (stripe-request :post (str "v1/terminal/configurations") params))

(defn get-customers-customer-payment-methods-payment-method [customer payment_method params]
  (stripe-request :get (str "v1/customers/" customer "/payment_methods/" payment_method "") params))

(defn post-payouts-payout-cancel [payout params]
  (stripe-request :post (str "v1/payouts/" payout "/cancel") params))

(defn post-terminal-readers-reader-process-payment-intent [reader params]
  (stripe-request :post (str "v1/terminal/readers/" reader "/process_payment_intent") params))

(defn get-files [params params]
  (stripe-request :get (str "v1/files") params))

(defn post-files [params params]
  (stripe-request :post (str "v1/files") params))

(defn post-test-helpers-issuing-authorizations [params params]
  (stripe-request :post (str "v1/test_helpers/issuing/authorizations") params))

(defn get-invoice-rendering-templates [params params]
  (stripe-request :get (str "v1/invoice_rendering_templates") params))

(defn get-reporting-report-types [params params]
  (stripe-request :get (str "v1/reporting/report_types") params))

(defn get-issuing-disputes [params params]
  (stripe-request :get (str "v1/issuing/disputes") params))

(defn post-issuing-disputes [params params]
  (stripe-request :post (str "v1/issuing/disputes") params))

(defn get-billing-alerts-id [id params]
  (stripe-request :get (str "v1/billing/alerts/" id "") params))

(defn get-transfers-id-reversals [id params]
  (stripe-request :get (str "v1/transfers/" id "/reversals") params))

(defn post-transfers-id-reversals [id params]
  (stripe-request :post (str "v1/transfers/" id "/reversals") params))

(defn get-products [params params]
  (stripe-request :get (str "v1/products") params))

(defn post-products [params params]
  (stripe-request :post (str "v1/products") params))

(defn delete-customers-customer-subscriptions-subscription-exposed-id [customer subscription_exposed_id params]
  (stripe-request :delete (str "v1/customers/" customer "/subscriptions/" subscription_exposed_id "") params))

(defn get-customers-customer-subscriptions-subscription-exposed-id [customer subscription_exposed_id params]
  (stripe-request :get (str "v1/customers/" customer "/subscriptions/" subscription_exposed_id "") params))

(defn post-customers-customer-subscriptions-subscription-exposed-id [customer subscription_exposed_id params]
  (stripe-request :post (str "v1/customers/" customer "/subscriptions/" subscription_exposed_id "") params))

(defn get-invoices-search [params params]
  (stripe-request :get (str "v1/invoices/search") params))

(defn post-test-helpers-treasury-received-debits [params params]
  (stripe-request :post (str "v1/test_helpers/treasury/received_debits") params))

(defn get-treasury-outbound-transfers-outbound-transfer [outbound_transfer params]
  (stripe-request :get (str "v1/treasury/outbound_transfers/" outbound_transfer "") params))

(defn get-customers-customer-bank-accounts [customer params]
  (stripe-request :get (str "v1/customers/" customer "/bank_accounts") params))

(defn post-customers-customer-bank-accounts [customer params]
  (stripe-request :post (str "v1/customers/" customer "/bank_accounts") params))

(defn delete-subscriptions-subscription-exposed-id [subscription_exposed_id params]
  (stripe-request :delete (str "v1/subscriptions/" subscription_exposed_id "") params))

(defn get-subscriptions-subscription-exposed-id [subscription_exposed_id params]
  (stripe-request :get (str "v1/subscriptions/" subscription_exposed_id "") params))

(defn post-subscriptions-subscription-exposed-id [subscription_exposed_id params]
  (stripe-request :post (str "v1/subscriptions/" subscription_exposed_id "") params))

(defn get-events [params params]
  (stripe-request :get (str "v1/events") params))

(defn get-accounts [params params]
  (stripe-request :get (str "v1/accounts") params))

(defn post-accounts [params params]
  (stripe-request :post (str "v1/accounts") params))

(defn post-terminal-readers-reader-set-reader-display [reader params]
  (stripe-request :post (str "v1/terminal/readers/" reader "/set_reader_display") params))

(defn get-tax-codes [params params]
  (stripe-request :get (str "v1/tax_codes") params))

(defn get-tax-transactions-transaction [transaction params]
  (stripe-request :get (str "v1/tax/transactions/" transaction "") params))

(defn post-invoices-invoice-void [invoice params]
  (stripe-request :post (str "v1/invoices/" invoice "/void") params))

(defn get-refunds-refund [refund params]
  (stripe-request :get (str "v1/refunds/" refund "") params))

(defn post-refunds-refund [refund params]
  (stripe-request :post (str "v1/refunds/" refund "") params))

(defn get-balance-history-id [id params]
  (stripe-request :get (str "v1/balance/history/" id "") params))

(defn get-setup-attempts [params params]
  (stripe-request :get (str "v1/setup_attempts") params))

(defn post-treasury-financial-accounts-financial-account-close [financial_account params]
  (stripe-request :post (str "v1/treasury/financial_accounts/" financial_account "/close") params))

(defn post-quotes-quote-accept [quote params]
  (stripe-request :post (str "v1/quotes/" quote "/accept") params))

(defn get-entitlements-features [params params]
  (stripe-request :get (str "v1/entitlements/features") params))

(defn post-entitlements-features [params params]
  (stripe-request :post (str "v1/entitlements/features") params))

(defn post-test-helpers-treasury-inbound-transfers-id-succeed [id params]
  (stripe-request :post (str "v1/test_helpers/treasury/inbound_transfers/" id "/succeed") params))

(defn get-billing-credit-grants [params params]
  (stripe-request :get (str "v1/billing/credit_grants") params))

(defn post-billing-credit-grants [params params]
  (stripe-request :post (str "v1/billing/credit_grants") params))

(defn get-treasury-outbound-transfers [params params]
  (stripe-request :get (str "v1/treasury/outbound_transfers") params))

(defn post-treasury-outbound-transfers [params params]
  (stripe-request :post (str "v1/treasury/outbound_transfers") params))

(defn get-webhook-endpoints [params params]
  (stripe-request :get (str "v1/webhook_endpoints") params))

(defn post-webhook-endpoints [params params]
  (stripe-request :post (str "v1/webhook_endpoints") params))

(defn post-issuing-disputes-dispute-submit [dispute params]
  (stripe-request :post (str "v1/issuing/disputes/" dispute "/submit") params))

(defn get-financial-connections-accounts-account [account params]
  (stripe-request :get (str "v1/financial_connections/accounts/" account "") params))

(defn get-quotes-quote-line-items [quote params]
  (stripe-request :get (str "v1/quotes/" quote "/line_items") params))

(defn post-identity-verification-sessions-session-cancel [session params]
  (stripe-request :post (str "v1/identity/verification_sessions/" session "/cancel") params))

(defn get-balance-transactions-id [id params]
  (stripe-request :get (str "v1/balance_transactions/" id "") params))

(defn get-customers-search [params params]
  (stripe-request :get (str "v1/customers/search") params))

(defn get-exchange-rates-rate-id [rate_id params]
  (stripe-request :get (str "v1/exchange_rates/" rate_id "") params))

(defn get-credit-notes-preview-lines [params params]
  (stripe-request :get (str "v1/credit_notes/preview/lines") params))

(defn get-events-id [id params]
  (stripe-request :get (str "v1/events/" id "") params))

(defn delete-subscription-items-item [item params]
  (stripe-request :delete (str "v1/subscription_items/" item "") params))

(defn get-subscription-items-item [item params]
  (stripe-request :get (str "v1/subscription_items/" item "") params))

(defn post-subscription-items-item [item params]
  (stripe-request :post (str "v1/subscription_items/" item "") params))

(defn get-prices-price [price params]
  (stripe-request :get (str "v1/prices/" price "") params))

(defn post-prices-price [price params]
  (stripe-request :post (str "v1/prices/" price "") params))

(defn get-reporting-report-runs [params params]
  (stripe-request :get (str "v1/reporting/report_runs") params))

(defn post-reporting-report-runs [params params]
  (stripe-request :post (str "v1/reporting/report_runs") params))

(defn get-charges [params params]
  (stripe-request :get (str "v1/charges") params))

(defn post-charges [params params]
  (stripe-request :post (str "v1/charges") params))

(defn get-payment-method-domains-payment-method-domain [payment_method_domain params]
  (stripe-request :get (str "v1/payment_method_domains/" payment_method_domain "") params))

(defn post-payment-method-domains-payment-method-domain [payment_method_domain params]
  (stripe-request :post (str "v1/payment_method_domains/" payment_method_domain "") params))

(defn get-customers-customer-cards [customer params]
  (stripe-request :get (str "v1/customers/" customer "/cards") params))

(defn post-customers-customer-cards [customer params]
  (stripe-request :post (str "v1/customers/" customer "/cards") params))

(defn post-accounts-account-login-links [account params]
  (stripe-request :post (str "v1/accounts/" account "/login_links") params))

(defn get-treasury-transaction-entries [params params]
  (stripe-request :get (str "v1/treasury/transaction_entries") params))

(defn post-test-helpers-issuing-personalization-designs-personalization-design-reject [personalization_design params]
  (stripe-request :post (str "v1/test_helpers/issuing/personalization_designs/" personalization_design "/reject") params))

(defn get-credit-notes-credit-note-lines [credit_note params]
  (stripe-request :get (str "v1/credit_notes/" credit_note "/lines") params))

(defn get-issuing-tokens [params params]
  (stripe-request :get (str "v1/issuing/tokens") params))

(defn get-billing-meters-id-event-summaries [id params]
  (stripe-request :get (str "v1/billing/meters/" id "/event_summaries") params))

(defn post-billing-meter-event-adjustments [params params]
  (stripe-request :post (str "v1/billing/meter_event_adjustments") params))

(defn post-test-helpers-issuing-authorizations-authorization-reverse [authorization params]
  (stripe-request :post (str "v1/test_helpers/issuing/authorizations/" authorization "/reverse") params))

(defn get-plans [params params]
  (stripe-request :get (str "v1/plans") params))

(defn post-plans [params params]
  (stripe-request :post (str "v1/plans") params))

(defn delete-accounts-account-persons-person [account person params]
  (stripe-request :delete (str "v1/accounts/" account "/persons/" person "") params))

(defn get-accounts-account-persons-person [account person params]
  (stripe-request :get (str "v1/accounts/" account "/persons/" person "") params))

(defn post-accounts-account-persons-person [account person params]
  (stripe-request :post (str "v1/accounts/" account "/persons/" person "") params))

(defn get-climate-orders [params params]
  (stripe-request :get (str "v1/climate/orders") params))

(defn post-climate-orders [params params]
  (stripe-request :post (str "v1/climate/orders") params))

(defn get-treasury-credit-reversals-credit-reversal [credit_reversal params]
  (stripe-request :get (str "v1/treasury/credit_reversals/" credit_reversal "") params))

(defn post-test-helpers-treasury-outbound-payments-id-return [id params]
  (stripe-request :post (str "v1/test_helpers/treasury/outbound_payments/" id "/return") params))

(defn get-payment-intents-intent [intent params]
  (stripe-request :get (str "v1/payment_intents/" intent "") params))

(defn post-payment-intents-intent [intent params]
  (stripe-request :post (str "v1/payment_intents/" intent "") params))

(defn get-country-specs-country [country params]
  (stripe-request :get (str "v1/country_specs/" country "") params))

(defn get-tokens-token [token params]
  (stripe-request :get (str "v1/tokens/" token "") params))

(defn post-test-helpers-treasury-inbound-transfers-id-fail [id params]
  (stripe-request :post (str "v1/test_helpers/treasury/inbound_transfers/" id "/fail") params))

(defn post-test-helpers-treasury-received-credits [params params]
  (stripe-request :post (str "v1/test_helpers/treasury/received_credits") params))

(defn post-billing-alerts-id-deactivate [id params]
  (stripe-request :post (str "v1/billing/alerts/" id "/deactivate") params))

(defn get-transfers-transfer-reversals-id [transfer id params]
  (stripe-request :get (str "v1/transfers/" transfer "/reversals/" id "") params))

(defn post-transfers-transfer-reversals-id [transfer id params]
  (stripe-request :post (str "v1/transfers/" transfer "/reversals/" id "") params))

(defn get-invoices-invoice-lines [invoice params]
  (stripe-request :get (str "v1/invoices/" invoice "/lines") params))

(defn get-linked-accounts-account-owners [account params]
  (stripe-request :get (str "v1/linked_accounts/" account "/owners") params))

(defn post-quotes-quote-finalize [quote params]
  (stripe-request :post (str "v1/quotes/" quote "/finalize") params))

(defn get-customers-customer-cash-balance-transactions [customer params]
  (stripe-request :get (str "v1/customers/" customer "/cash_balance_transactions") params))

(defn get-sigma-scheduled-query-runs [params params]
  (stripe-request :get (str "v1/sigma/scheduled_query_runs") params))

(defn get-disputes [params params]
  (stripe-request :get (str "v1/disputes") params))

(defn get-issuing-personalization-designs-personalization-design [personalization_design params]
  (stripe-request :get (str "v1/issuing/personalization_designs/" personalization_design "") params))

(defn post-issuing-personalization-designs-personalization-design [personalization_design params]
  (stripe-request :post (str "v1/issuing/personalization_designs/" personalization_design "") params))

(defn get-treasury-financial-accounts-financial-account-features [financial_account params]
  (stripe-request :get (str "v1/treasury/financial_accounts/" financial_account "/features") params))

(defn post-treasury-financial-accounts-financial-account-features [financial_account params]
  (stripe-request :post (str "v1/treasury/financial_accounts/" financial_account "/features") params))

(defn get-transfers [params params]
  (stripe-request :get (str "v1/transfers") params))

(defn post-transfers [params params]
  (stripe-request :post (str "v1/transfers") params))

(defn post-invoices-invoice-update-lines [invoice params]
  (stripe-request :post (str "v1/invoices/" invoice "/update_lines") params))

(defn post-billing-credit-grants-id-expire [id params]
  (stripe-request :post (str "v1/billing/credit_grants/" id "/expire") params))

(defn get-products-search [params params]
  (stripe-request :get (str "v1/products/search") params))

(defn delete-tax-ids-id [id params]
  (stripe-request :delete (str "v1/tax_ids/" id "") params))

(defn get-tax-ids-id [id params]
  (stripe-request :get (str "v1/tax_ids/" id "") params))

(defn post-linked-accounts-account-refresh [account params]
  (stripe-request :post (str "v1/linked_accounts/" account "/refresh") params))

(defn get-checkout-sessions [params params]
  (stripe-request :get (str "v1/checkout/sessions") params))

(defn post-checkout-sessions [params params]
  (stripe-request :post (str "v1/checkout/sessions") params))

(defn delete-customers-customer-subscriptions-subscription-exposed-id-discount [customer subscription_exposed_id params]
  (stripe-request :delete (str "v1/customers/" customer "/subscriptions/" subscription_exposed_id "/discount") params))

(defn get-customers-customer-subscriptions-subscription-exposed-id-discount [customer subscription_exposed_id params]
  (stripe-request :get (str "v1/customers/" customer "/subscriptions/" subscription_exposed_id "/discount") params))

(defn get-application-fees-id-refunds [id params]
  (stripe-request :get (str "v1/application_fees/" id "/refunds") params))

(defn post-application-fees-id-refunds [id params]
  (stripe-request :post (str "v1/application_fees/" id "/refunds") params))

(defn get-issuing-cardholders [params params]
  (stripe-request :get (str "v1/issuing/cardholders") params))

(defn post-issuing-cardholders [params params]
  (stripe-request :post (str "v1/issuing/cardholders") params))

(defn get-customers-customer-tax-ids [customer params]
  (stripe-request :get (str "v1/customers/" customer "/tax_ids") params))

(defn post-customers-customer-tax-ids [customer params]
  (stripe-request :post (str "v1/customers/" customer "/tax_ids") params))

(defn post-financial-connections-accounts-account-refresh [account params]
  (stripe-request :post (str "v1/financial_connections/accounts/" account "/refresh") params))

(defn post-financial-connections-accounts-account-unsubscribe [account params]
  (stripe-request :post (str "v1/financial_connections/accounts/" account "/unsubscribe") params))

(defn post-billing-meters-id-deactivate [id params]
  (stripe-request :post (str "v1/billing/meters/" id "/deactivate") params))

(defn get-subscription-items [params params]
  (stripe-request :get (str "v1/subscription_items") params))

(defn post-subscription-items [params params]
  (stripe-request :post (str "v1/subscription_items") params))

(defn delete-apple-pay-domains-domain [domain params]
  (stripe-request :delete (str "v1/apple_pay/domains/" domain "") params))

(defn get-apple-pay-domains-domain [domain params]
  (stripe-request :get (str "v1/apple_pay/domains/" domain "") params))

(defn delete-accounts-account-bank-accounts-id [account id params]
  (stripe-request :delete (str "v1/accounts/" account "/bank_accounts/" id "") params))

(defn get-accounts-account-bank-accounts-id [account id params]
  (stripe-request :get (str "v1/accounts/" account "/bank_accounts/" id "") params))

(defn post-accounts-account-bank-accounts-id [account id params]
  (stripe-request :post (str "v1/accounts/" account "/bank_accounts/" id "") params))

(defn post-financial-connections-accounts-account-disconnect [account params]
  (stripe-request :post (str "v1/financial_connections/accounts/" account "/disconnect") params))

(defn get-reporting-report-types-report-type [report_type params]
  (stripe-request :get (str "v1/reporting/report_types/" report_type "") params))

(defn get-apps-secrets [params params]
  (stripe-request :get (str "v1/apps/secrets") params))

(defn post-apps-secrets [params params]
  (stripe-request :post (str "v1/apps/secrets") params))

(defn get-confirmation-tokens-confirmation-token [confirmation_token params]
  (stripe-request :get (str "v1/confirmation_tokens/" confirmation_token "") params))

(defn get-treasury-inbound-transfers-id [id params]
  (stripe-request :get (str "v1/treasury/inbound_transfers/" id "") params))

(defn post-invoices-invoice-add-lines [invoice params]
  (stripe-request :post (str "v1/invoices/" invoice "/add_lines") params))

(defn get-treasury-financial-accounts [params params]
  (stripe-request :get (str "v1/treasury/financial_accounts") params))

(defn post-treasury-financial-accounts [params params]
  (stripe-request :post (str "v1/treasury/financial_accounts") params))

(defn post-terminal-readers-reader-refund-payment [reader params]
  (stripe-request :post (str "v1/terminal/readers/" reader "/refund_payment") params))

(defn delete-plans-plan [plan params]
  (stripe-request :delete (str "v1/plans/" plan "") params))

(defn get-plans-plan [plan params]
  (stripe-request :get (str "v1/plans/" plan "") params))

(defn post-plans-plan [plan params]
  (stripe-request :post (str "v1/plans/" plan "") params))

(defn delete-subscriptions-subscription-exposed-id-discount [subscription_exposed_id params]
  (stripe-request :delete (str "v1/subscriptions/" subscription_exposed_id "/discount") params))

(defn post-treasury-inbound-transfers-inbound-transfer-cancel [inbound_transfer params]
  (stripe-request :post (str "v1/treasury/inbound_transfers/" inbound_transfer "/cancel") params))

(defn post-reviews-review-approve [review params]
  (stripe-request :post (str "v1/reviews/" review "/approve") params))

(defn get-identity-verification-reports [params params]
  (stripe-request :get (str "v1/identity/verification_reports") params))

(defn get-billing-alerts [params params]
  (stripe-request :get (str "v1/billing/alerts") params))

(defn post-billing-alerts [params params]
  (stripe-request :post (str "v1/billing/alerts") params))

(defn get-billing-portal-configurations [params params]
  (stripe-request :get (str "v1/billing_portal/configurations") params))

(defn post-billing-portal-configurations [params params]
  (stripe-request :post (str "v1/billing_portal/configurations") params))

(defn post-billing-alerts-id-activate [id params]
  (stripe-request :post (str "v1/billing/alerts/" id "/activate") params))

(defn get-entitlements-features-id [id params]
  (stripe-request :get (str "v1/entitlements/features/" id "") params))

(defn post-entitlements-features-id [id params]
  (stripe-request :post (str "v1/entitlements/features/" id "") params))

(defn get-subscription-items-subscription-item-usage-record-summaries [subscription_item params]
  (stripe-request :get (str "v1/subscription_items/" subscription_item "/usage_record_summaries") params))

(defn get-billing-credit-balance-transactions-id [id params]
  (stripe-request :get (str "v1/billing/credit_balance_transactions/" id "") params))

(defn get-treasury-received-debits-id [id params]
  (stripe-request :get (str "v1/treasury/received_debits/" id "") params))

(defn get-charges-charge-refunds [charge params]
  (stripe-request :get (str "v1/charges/" charge "/refunds") params))

(defn post-charges-charge-refunds [charge params]
  (stripe-request :post (str "v1/charges/" charge "/refunds") params))

(defn get-customers-customer-sources [customer params]
  (stripe-request :get (str "v1/customers/" customer "/sources") params))

(defn post-customers-customer-sources [customer params]
  (stripe-request :post (str "v1/customers/" customer "/sources") params))

(defn get-setup-intents-intent [intent params]
  (stripe-request :get (str "v1/setup_intents/" intent "") params))

(defn post-setup-intents-intent [intent params]
  (stripe-request :post (str "v1/setup_intents/" intent "") params))

(defn delete-customers-customer-bank-accounts-id [customer id params]
  (stripe-request :delete (str "v1/customers/" customer "/bank_accounts/" id "") params))

(defn get-customers-customer-bank-accounts-id [customer id params]
  (stripe-request :get (str "v1/customers/" customer "/bank_accounts/" id "") params))

(defn post-customers-customer-bank-accounts-id [customer id params]
  (stripe-request :post (str "v1/customers/" customer "/bank_accounts/" id "") params))

(defn post-treasury-outbound-payments-id-cancel [id params]
  (stripe-request :post (str "v1/treasury/outbound_payments/" id "/cancel") params))

(defn get-reviews-review [review params]
  (stripe-request :get (str "v1/reviews/" review "") params))

(defn get-financial-connections-transactions [params params]
  (stripe-request :get (str "v1/financial_connections/transactions") params))

(defn post-tax-transactions-create-from-calculation [params params]
  (stripe-request :post (str "v1/tax/transactions/create_from_calculation") params))

(defn post-customer-sessions [params params]
  (stripe-request :post (str "v1/customer_sessions") params))

(defn get-billing-meters [params params]
  (stripe-request :get (str "v1/billing/meters") params))

(defn post-billing-meters [params params]
  (stripe-request :post (str "v1/billing/meters") params))

(defn post-issuing-authorizations-authorization-decline [authorization params]
  (stripe-request :post (str "v1/issuing/authorizations/" authorization "/decline") params))

(defn get-issuing-authorizations-authorization [authorization params]
  (stripe-request :get (str "v1/issuing/authorizations/" authorization "") params))

(defn post-issuing-authorizations-authorization [authorization params]
  (stripe-request :post (str "v1/issuing/authorizations/" authorization "") params))

(defn get-billing-credit-balance-summary [params params]
  (stripe-request :get (str "v1/billing/credit_balance_summary") params))

(defn post-disputes-dispute-close [dispute params]
  (stripe-request :post (str "v1/disputes/" dispute "/close") params))

(defn post-test-helpers-issuing-cards-card-shipping-return [card params]
  (stripe-request :post (str "v1/test_helpers/issuing/cards/" card "/shipping/return") params))

(defn post-link-account-sessions [params params]
  (stripe-request :post (str "v1/link_account_sessions") params))

(defn get-financial-connections-accounts-account-owners [account params]
  (stripe-request :get (str "v1/financial_connections/accounts/" account "/owners") params))

(defn post-payment-intents-intent-increment-authorization [intent params]
  (stripe-request :post (str "v1/payment_intents/" intent "/increment_authorization") params))

(defn delete-radar-value-list-items-item [item params]
  (stripe-request :delete (str "v1/radar/value_list_items/" item "") params))

(defn get-radar-value-list-items-item [item params]
  (stripe-request :get (str "v1/radar/value_list_items/" item "") params))

(defn post-customers-customer-bank-accounts-id-verify [customer id params]
  (stripe-request :post (str "v1/customers/" customer "/bank_accounts/" id "/verify") params))

(defn post-subscription-schedules-schedule-release [schedule params]
  (stripe-request :post (str "v1/subscription_schedules/" schedule "/release") params))

(defn get-issuing-authorizations [params params]
  (stripe-request :get (str "v1/issuing/authorizations") params))

(defn delete-radar-value-lists-value-list [value_list params]
  (stripe-request :delete (str "v1/radar/value_lists/" value_list "") params))

(defn get-radar-value-lists-value-list [value_list params]
  (stripe-request :get (str "v1/radar/value_lists/" value_list "") params))

(defn post-radar-value-lists-value-list [value_list params]
  (stripe-request :post (str "v1/radar/value_lists/" value_list "") params))

(defn get-forwarding-requests [params params]
  (stripe-request :get (str "v1/forwarding/requests") params))

(defn post-forwarding-requests [params params]
  (stripe-request :post (str "v1/forwarding/requests") params))

(defn post-test-helpers-issuing-personalization-designs-personalization-design-deactivate [personalization_design params]
  (stripe-request :post (str "v1/test_helpers/issuing/personalization_designs/" personalization_design "/deactivate") params))

(defn get-reporting-report-runs-report-run [report_run params]
  (stripe-request :get (str "v1/reporting/report_runs/" report_run "") params))

(defn get-treasury-outbound-payments [params params]
  (stripe-request :get (str "v1/treasury/outbound_payments") params))

(defn post-treasury-outbound-payments [params params]
  (stripe-request :post (str "v1/treasury/outbound_payments") params))

(defn post-tokens [params params]
  (stripe-request :post (str "v1/tokens") params))

(defn post-test-helpers-treasury-outbound-transfers-outbound-transfer-fail [outbound_transfer params]
  (stripe-request :post (str "v1/test_helpers/treasury/outbound_transfers/" outbound_transfer "/fail") params))

(defn get-tax-calculations-calculation-line-items [calculation params]
  (stripe-request :get (str "v1/tax/calculations/" calculation "/line_items") params))

(defn get-application-fees [params params]
  (stripe-request :get (str "v1/application_fees") params))

(defn get-invoice-rendering-templates-template [template params]
  (stripe-request :get (str "v1/invoice_rendering_templates/" template "") params))

(defn post-charges-charge-dispute-close [charge params]
  (stripe-request :post (str "v1/charges/" charge "/dispute/close") params))

(defn post-test-helpers-confirmation-tokens [params params]
  (stripe-request :post (str "v1/test_helpers/confirmation_tokens") params))

(defn get-promotion-codes [params params]
  (stripe-request :get (str "v1/promotion_codes") params))

(defn post-promotion-codes [params params]
  (stripe-request :post (str "v1/promotion_codes") params))

(defn post-topups-topup-cancel [topup params]
  (stripe-request :post (str "v1/topups/" topup "/cancel") params))

(defn delete-accounts-account-people-person [account person params]
  (stripe-request :delete (str "v1/accounts/" account "/people/" person "") params))

(defn get-accounts-account-people-person [account person params]
  (stripe-request :get (str "v1/accounts/" account "/people/" person "") params))

(defn post-accounts-account-people-person [account person params]
  (stripe-request :post (str "v1/accounts/" account "/people/" person "") params))

(defn get-sources-source [source params]
  (stripe-request :get (str "v1/sources/" source "") params))

(defn post-sources-source [source params]
  (stripe-request :post (str "v1/sources/" source "") params))

(defn post-invoices-invoice-send [invoice params]
  (stripe-request :post (str "v1/invoices/" invoice "/send") params))

(defn get-coupons [params params]
  (stripe-request :get (str "v1/coupons") params))

(defn post-coupons [params params]
  (stripe-request :post (str "v1/coupons") params))

(defn get-issuing-cards [params params]
  (stripe-request :get (str "v1/issuing/cards") params))

(defn post-issuing-cards [params params]
  (stripe-request :post (str "v1/issuing/cards") params))

(defn post-treasury-outbound-transfers-outbound-transfer-cancel [outbound_transfer params]
  (stripe-request :post (str "v1/treasury/outbound_transfers/" outbound_transfer "/cancel") params))

(defn get-balance [params params]
  (stripe-request :get (str "v1/balance") params))

(defn delete-terminal-readers-reader [reader params]
  (stripe-request :delete (str "v1/terminal/readers/" reader "") params))

(defn get-terminal-readers-reader [reader params]
  (stripe-request :get (str "v1/terminal/readers/" reader "") params))

(defn post-terminal-readers-reader [reader params]
  (stripe-request :post (str "v1/terminal/readers/" reader "") params))

(defn get-tax-settings [params params]
  (stripe-request :get (str "v1/tax/settings") params))

(defn post-tax-settings [params params]
  (stripe-request :post (str "v1/tax/settings") params))

(defn get-treasury-received-debits [params params]
  (stripe-request :get (str "v1/treasury/received_debits") params))

(defn post-payment-method-domains-payment-method-domain-validate [payment_method_domain params]
  (stripe-request :post (str "v1/payment_method_domains/" payment_method_domain "/validate") params))

(defn post-invoices-invoice-mark-uncollectible [invoice params]
  (stripe-request :post (str "v1/invoices/" invoice "/mark_uncollectible") params))

(defn get-payouts-payout [payout params]
  (stripe-request :get (str "v1/payouts/" payout "") params))

(defn post-payouts-payout [payout params]
  (stripe-request :post (str "v1/payouts/" payout "") params))

(defn post-charges-charge-capture [charge params]
  (stripe-request :post (str "v1/charges/" charge "/capture") params))

(defn get-files-file [file params]
  (stripe-request :get (str "v1/files/" file "") params))

(defn post-linked-accounts-account-disconnect [account params]
  (stripe-request :post (str "v1/linked_accounts/" account "/disconnect") params))

(defn get-radar-value-lists [params params]
  (stripe-request :get (str "v1/radar/value_lists") params))

(defn post-radar-value-lists [params params]
  (stripe-request :post (str "v1/radar/value_lists") params))

(defn post-apps-secrets-delete [params params]
  (stripe-request :post (str "v1/apps/secrets/delete") params))

(defn get-issuing-transactions-transaction [transaction params]
  (stripe-request :get (str "v1/issuing/transactions/" transaction "") params))

(defn post-issuing-transactions-transaction [transaction params]
  (stripe-request :post (str "v1/issuing/transactions/" transaction "") params))

(defn delete-test-helpers-test-clocks-test-clock [test_clock params]
  (stripe-request :delete (str "v1/test_helpers/test_clocks/" test_clock "") params))

(defn get-test-helpers-test-clocks-test-clock [test_clock params]
  (stripe-request :get (str "v1/test_helpers/test_clocks/" test_clock "") params))

(defn get-sources-source-mandate-notifications-mandate-notification [source mandate_notification params]
  (stripe-request :get (str "v1/sources/" source "/mandate_notifications/" mandate_notification "") params))

(defn get-treasury-debit-reversals-debit-reversal [debit_reversal params]
  (stripe-request :get (str "v1/treasury/debit_reversals/" debit_reversal "") params))

(defn get-radar-value-list-items [params params]
  (stripe-request :get (str "v1/radar/value_list_items") params))

(defn post-radar-value-list-items [params params]
  (stripe-request :post (str "v1/radar/value_list_items") params))

(defn post-payment-methods-payment-method-detach [payment_method params]
  (stripe-request :post (str "v1/payment_methods/" payment_method "/detach") params))

(defn post-test-helpers-refunds-refund-expire [refund params]
  (stripe-request :post (str "v1/test_helpers/refunds/" refund "/expire") params))

(defn get-treasury-received-credits-id [id params]
  (stripe-request :get (str "v1/treasury/received_credits/" id "") params))

(defn post-customers-customer-funding-instructions [customer params]
  (stripe-request :post (str "v1/customers/" customer "/funding_instructions") params))

(defn get-accounts-account-people [account params]
  (stripe-request :get (str "v1/accounts/" account "/people") params))

(defn post-accounts-account-people [account params]
  (stripe-request :post (str "v1/accounts/" account "/people") params))

(defn get-identity-verification-reports-report [report params]
  (stripe-request :get (str "v1/identity/verification_reports/" report "") params))

(defn get-quotes [params params]
  (stripe-request :get (str "v1/quotes") params))

(defn post-quotes [params params]
  (stripe-request :post (str "v1/quotes") params))

(defn post-test-helpers-issuing-cards-card-shipping-fail [card params]
  (stripe-request :post (str "v1/test_helpers/issuing/cards/" card "/shipping/fail") params))

(defn post-payment-intents-intent-verify-microdeposits [intent params]
  (stripe-request :post (str "v1/payment_intents/" intent "/verify_microdeposits") params))

(defn delete-coupons-coupon [coupon params]
  (stripe-request :delete (str "v1/coupons/" coupon "") params))

(defn get-coupons-coupon [coupon params]
  (stripe-request :get (str "v1/coupons/" coupon "") params))

(defn post-coupons-coupon [coupon params]
  (stripe-request :post (str "v1/coupons/" coupon "") params))

(defn post-test-helpers-issuing-authorizations-authorization-capture [authorization params]
  (stripe-request :post (str "v1/test_helpers/issuing/authorizations/" authorization "/capture") params))

(defn get-entitlements-active-entitlements-id [id params]
  (stripe-request :get (str "v1/entitlements/active_entitlements/" id "") params))

(defn get-application-fees-fee-refunds-id [fee id params]
  (stripe-request :get (str "v1/application_fees/" fee "/refunds/" id "") params))

(defn post-application-fees-fee-refunds-id [fee id params]
  (stripe-request :post (str "v1/application_fees/" fee "/refunds/" id "") params))

(defn post-identity-verification-sessions-session-redact [session params]
  (stripe-request :post (str "v1/identity/verification_sessions/" session "/redact") params))

(defn post-test-helpers-treasury-outbound-payments-id-post [id params]
  (stripe-request :post (str "v1/test_helpers/treasury/outbound_payments/" id "/post") params))

(defn get-application-fees-id [id params]
  (stripe-request :get (str "v1/application_fees/" id "") params))

(defn get-financial-connections-transactions-transaction [transaction params]
  (stripe-request :get (str "v1/financial_connections/transactions/" transaction "") params))

(defn post-test-helpers-treasury-outbound-transfers-outbound-transfer-return [outbound_transfer params]
  (stripe-request :post (str "v1/test_helpers/treasury/outbound_transfers/" outbound_transfer "/return") params))

(defn delete-terminal-locations-location [location params]
  (stripe-request :delete (str "v1/terminal/locations/" location "") params))

(defn get-terminal-locations-location [location params]
  (stripe-request :get (str "v1/terminal/locations/" location "") params))

(defn post-terminal-locations-location [location params]
  (stripe-request :post (str "v1/terminal/locations/" location "") params))

(defn get-checkout-sessions-session-line-items [session params]
  (stripe-request :get (str "v1/checkout/sessions/" session "/line_items") params))

(defn get-credit-notes [params params]
  (stripe-request :get (str "v1/credit_notes") params))

(defn post-credit-notes [params params]
  (stripe-request :post (str "v1/credit_notes") params))

(defn get-shipping-rates-shipping-rate-token [shipping_rate_token params]
  (stripe-request :get (str "v1/shipping_rates/" shipping_rate_token "") params))

(defn post-shipping-rates-shipping-rate-token [shipping_rate_token params]
  (stripe-request :post (str "v1/shipping_rates/" shipping_rate_token "") params))

(defn post-test-helpers-issuing-authorizations-authorization-fraud-challenges-respond [authorization params]
  (stripe-request :post (str "v1/test_helpers/issuing/authorizations/" authorization "/fraud_challenges/respond") params))

(defn get-payment-method-configurations [params params]
  (stripe-request :get (str "v1/payment_method_configurations") params))

(defn post-payment-method-configurations [params params]
  (stripe-request :post (str "v1/payment_method_configurations") params))

(defn get-prices-search [params params]
  (stripe-request :get (str "v1/prices/search") params))

(defn post-billing-meters-id-reactivate [id params]
  (stripe-request :post (str "v1/billing/meters/" id "/reactivate") params))

(defn get-billing-portal-configurations-configuration [configuration params]
  (stripe-request :get (str "v1/billing_portal/configurations/" configuration "") params))

(defn post-billing-portal-configurations-configuration [configuration params]
  (stripe-request :post (str "v1/billing_portal/configurations/" configuration "") params))

(defn get-payment-method-configurations-configuration [configuration params]
  (stripe-request :get (str "v1/payment_method_configurations/" configuration "") params))

(defn post-payment-method-configurations-configuration [configuration params]
  (stripe-request :post (str "v1/payment_method_configurations/" configuration "") params))

(defn get-entitlements-active-entitlements [params params]
  (stripe-request :get (str "v1/entitlements/active_entitlements") params))

(defn delete-accounts-account [account params]
  (stripe-request :delete (str "v1/accounts/" account "") params))

(defn get-accounts-account [account params]
  (stripe-request :get (str "v1/accounts/" account "") params))

(defn post-accounts-account [account params]
  (stripe-request :post (str "v1/accounts/" account "") params))

(defn get-exchange-rates [params params]
  (stripe-request :get (str "v1/exchange_rates") params))

(defn get-tax-rates-tax-rate [tax_rate params]
  (stripe-request :get (str "v1/tax_rates/" tax_rate "") params))

(defn post-tax-rates-tax-rate [tax_rate params]
  (stripe-request :post (str "v1/tax_rates/" tax_rate "") params))

(defn get-tax-registrations [params params]
  (stripe-request :get (str "v1/tax/registrations") params))

(defn post-tax-registrations [params params]
  (stripe-request :post (str "v1/tax/registrations") params))

(defn post-terminal-readers-reader-process-setup-intent [reader params]
  (stripe-request :post (str "v1/terminal/readers/" reader "/process_setup_intent") params))

(defn post-tax-calculations [params params]
  (stripe-request :post (str "v1/tax/calculations") params))

(defn get-customers-customer-subscriptions [customer params]
  (stripe-request :get (str "v1/customers/" customer "/subscriptions") params))

(defn post-customers-customer-subscriptions [customer params]
  (stripe-request :post (str "v1/customers/" customer "/subscriptions") params))

(defn get-quotes-quote-computed-upfront-line-items [quote params]
  (stripe-request :get (str "v1/quotes/" quote "/computed_upfront_line_items") params))

(defn post-invoices-invoice-finalize [invoice params]
  (stripe-request :post (str "v1/invoices/" invoice "/finalize") params))

(defn post-account-sessions [params params]
  (stripe-request :post (str "v1/account_sessions") params))

(defn get-charges-search [params params]
  (stripe-request :get (str "v1/charges/search") params))

(defn get-climate-orders-order [order params]
  (stripe-request :get (str "v1/climate/orders/" order "") params))

(defn post-climate-orders-order [order params]
  (stripe-request :post (str "v1/climate/orders/" order "") params))

(defn get-linked-accounts [params params]
  (stripe-request :get (str "v1/linked_accounts") params))

(defn get-forwarding-requests-id [id params]
  (stripe-request :get (str "v1/forwarding/requests/" id "") params))

(defn delete-customers-customer-sources-id [customer id params]
  (stripe-request :delete (str "v1/customers/" customer "/sources/" id "") params))

(defn get-customers-customer-sources-id [customer id params]
  (stripe-request :get (str "v1/customers/" customer "/sources/" id "") params))

(defn post-customers-customer-sources-id [customer id params]
  (stripe-request :post (str "v1/customers/" customer "/sources/" id "") params))

(defn get-charges-charge-dispute [charge params]
  (stripe-request :get (str "v1/charges/" charge "/dispute") params))

(defn post-charges-charge-dispute [charge params]
  (stripe-request :post (str "v1/charges/" charge "/dispute") params))

(defn post-test-helpers-issuing-authorizations-authorization-expire [authorization params]
  (stripe-request :post (str "v1/test_helpers/issuing/authorizations/" authorization "/expire") params))

(defn post-payment-intents-intent-capture [intent params]
  (stripe-request :post (str "v1/payment_intents/" intent "/capture") params))

(defn get-reviews [params params]
  (stripe-request :get (str "v1/reviews") params))

(defn get-credit-notes-id [id params]
  (stripe-request :get (str "v1/credit_notes/" id "") params))

(defn post-credit-notes-id [id params]
  (stripe-request :post (str "v1/credit_notes/" id "") params))

(defn post-invoices-invoice-lines-line-item-id [invoice line_item_id params]
  (stripe-request :post (str "v1/invoices/" invoice "/lines/" line_item_id "") params))

(defn get-link-account-sessions-session [session params]
  (stripe-request :get (str "v1/link_account_sessions/" session "") params))

(defn post-test-helpers-customers-customer-fund-cash-balance [customer params]
  (stripe-request :post (str "v1/test_helpers/customers/" customer "/fund_cash_balance") params))

(defn get-disputes-dispute [dispute params]
  (stripe-request :get (str "v1/disputes/" dispute "") params))

(defn post-disputes-dispute [dispute params]
  (stripe-request :post (str "v1/disputes/" dispute "") params))

(defn get-customers-customer-balance-transactions-transaction [customer transaction params]
  (stripe-request :get (str "v1/customers/" customer "/balance_transactions/" transaction "") params))

(defn post-customers-customer-balance-transactions-transaction [customer transaction params]
  (stripe-request :post (str "v1/customers/" customer "/balance_transactions/" transaction "") params))

(defn get-accounts-account-persons [account params]
  (stripe-request :get (str "v1/accounts/" account "/persons") params))

(defn post-accounts-account-persons [account params]
  (stripe-request :post (str "v1/accounts/" account "/persons") params))

(defn get-tax-transactions-transaction-line-items [transaction params]
  (stripe-request :get (str "v1/tax/transactions/" transaction "/line_items") params))

(defn get-subscription-schedules-schedule [schedule params]
  (stripe-request :get (str "v1/subscription_schedules/" schedule "") params))

(defn post-subscription-schedules-schedule [schedule params]
  (stripe-request :post (str "v1/subscription_schedules/" schedule "") params))

(defn get-payment-methods [params params]
  (stripe-request :get (str "v1/payment_methods") params))

(defn post-payment-methods [params params]
  (stripe-request :post (str "v1/payment_methods") params))

(defn get-customers-customer-cash-balance [customer params]
  (stripe-request :get (str "v1/customers/" customer "/cash_balance") params))

(defn post-customers-customer-cash-balance [customer params]
  (stripe-request :post (str "v1/customers/" customer "/cash_balance") params))

(defn delete-customers-customer-tax-ids-id [customer id params]
  (stripe-request :delete (str "v1/customers/" customer "/tax_ids/" id "") params))

(defn get-customers-customer-tax-ids-id [customer id params]
  (stripe-request :get (str "v1/customers/" customer "/tax_ids/" id "") params))

(defn get-sources-source-source-transactions [source params]
  (stripe-request :get (str "v1/sources/" source "/source_transactions") params))

(defn get-financial-connections-sessions-session [session params]
  (stripe-request :get (str "v1/financial_connections/sessions/" session "") params))

(defn delete-invoiceitems-invoiceitem [invoiceitem params]
  (stripe-request :delete (str "v1/invoiceitems/" invoiceitem "") params))

(defn get-invoiceitems-invoiceitem [invoiceitem params]
  (stripe-request :get (str "v1/invoiceitems/" invoiceitem "") params))

(defn post-invoiceitems-invoiceitem [invoiceitem params]
  (stripe-request :post (str "v1/invoiceitems/" invoiceitem "") params))

(defn post-terminal-readers-reader-cancel-action [reader params]
  (stripe-request :post (str "v1/terminal/readers/" reader "/cancel_action") params))

(defn get-invoices [params params]
  (stripe-request :get (str "v1/invoices") params))

(defn post-invoices [params params]
  (stripe-request :post (str "v1/invoices") params))

(defn get-accounts-account-capabilities-capability [account capability params]
  (stripe-request :get (str "v1/accounts/" account "/capabilities/" capability "") params))

(defn post-accounts-account-capabilities-capability [account capability params]
  (stripe-request :post (str "v1/accounts/" account "/capabilities/" capability "") params))

(defn post-test-helpers-test-clocks-test-clock-advance [test_clock params]
  (stripe-request :post (str "v1/test_helpers/test_clocks/" test_clock "/advance") params))

(defn get-accounts-account-capabilities [account params]
  (stripe-request :get (str "v1/accounts/" account "/capabilities") params))

(defn post-billing-credit-grants-id-void [id params]
  (stripe-request :post (str "v1/billing/credit_grants/" id "/void") params))

(defn get-sigma-scheduled-query-runs-scheduled-query-run [scheduled_query_run params]
  (stripe-request :get (str "v1/sigma/scheduled_query_runs/" scheduled_query_run "") params))

(defn get-topups-topup [topup params]
  (stripe-request :get (str "v1/topups/" topup "") params))

(defn post-topups-topup [topup params]
  (stripe-request :post (str "v1/topups/" topup "") params))

(defn post-test-helpers-treasury-inbound-transfers-id-return [id params]
  (stripe-request :post (str "v1/test_helpers/treasury/inbound_transfers/" id "/return") params))

(defn get-treasury-received-credits [params params]
  (stripe-request :get (str "v1/treasury/received_credits") params))

(defn get-tax-calculations-calculation [calculation params]
  (stripe-request :get (str "v1/tax/calculations/" calculation "") params))

(defn post-quotes-quote-cancel [quote params]
  (stripe-request :post (str "v1/quotes/" quote "/cancel") params))

(defn get-issuing-physical-bundles [params params]
  (stripe-request :get (str "v1/issuing/physical_bundles") params))

(defn post-test-helpers-treasury-outbound-transfers-outbound-transfer [outbound_transfer params]
  (stripe-request :post (str "v1/test_helpers/treasury/outbound_transfers/" outbound_transfer "") params))

(defn post-subscription-items-subscription-item-usage-records [subscription_item params]
  (stripe-request :post (str "v1/subscription_items/" subscription_item "/usage_records") params))

(defn post-test-helpers-issuing-personalization-designs-personalization-design-activate [personalization_design params]
  (stripe-request :post (str "v1/test_helpers/issuing/personalization_designs/" personalization_design "/activate") params))

(defn delete-ephemeral-keys-key [key params]
  (stripe-request :delete (str "v1/ephemeral_keys/" key "") params))

(defn get-quotes-quote [quote params]
  (stripe-request :get (str "v1/quotes/" quote "") params))

(defn post-quotes-quote [quote params]
  (stripe-request :post (str "v1/quotes/" quote "") params))

(defn get-subscriptions-search [params params]
  (stripe-request :get (str "v1/subscriptions/search") params))

(defn post-financial-connections-accounts-account-subscribe [account params]
  (stripe-request :post (str "v1/financial_connections/accounts/" account "/subscribe") params))

(defn post-payment-intents-intent-cancel [intent params]
  (stripe-request :post (str "v1/payment_intents/" intent "/cancel") params))

(defn get-account [params params]
  (stripe-request :get (str "v1/account") params))

(defn get-payment-links-payment-link-line-items [payment_link params]
  (stripe-request :get (str "v1/payment_links/" payment_link "/line_items") params))

(defn get-treasury-inbound-transfers [params params]
  (stripe-request :get (str "v1/treasury/inbound_transfers") params))

(defn post-treasury-inbound-transfers [params params]
  (stripe-request :post (str "v1/treasury/inbound_transfers") params))

(defn get-transfers-transfer [transfer params]
  (stripe-request :get (str "v1/transfers/" transfer "") params))

(defn post-transfers-transfer [transfer params]
  (stripe-request :post (str "v1/transfers/" transfer "") params))

(defn get-payment-intents-search [params params]
  (stripe-request :get (str "v1/payment_intents/search") params))

(defn get-billing-credit-grants-id [id params]
  (stripe-request :get (str "v1/billing/credit_grants/" id "") params))

(defn post-billing-credit-grants-id [id params]
  (stripe-request :post (str "v1/billing/credit_grants/" id "") params))

(defn post-setup-intents-intent-confirm [intent params]
  (stripe-request :post (str "v1/setup_intents/" intent "/confirm") params))

(defn delete-customers-customer [customer params]
  (stripe-request :delete (str "v1/customers/" customer "") params))

(defn get-customers-customer [customer params]
  (stripe-request :get (str "v1/customers/" customer "") params))

(defn post-customers-customer [customer params]
  (stripe-request :post (str "v1/customers/" customer "") params))

(defn get-charges-charge [charge params]
  (stripe-request :get (str "v1/charges/" charge "") params))

(defn post-charges-charge [charge params]
  (stripe-request :post (str "v1/charges/" charge "") params))

(defn delete-products-product-features-id [product id params]
  (stripe-request :delete (str "v1/products/" product "/features/" id "") params))

(defn get-products-product-features-id [product id params]
  (stripe-request :get (str "v1/products/" product "/features/" id "") params))

(defn delete-webhook-endpoints-webhook-endpoint [webhook_endpoint params]
  (stripe-request :delete (str "v1/webhook_endpoints/" webhook_endpoint "") params))

(defn get-webhook-endpoints-webhook-endpoint [webhook_endpoint params]
  (stripe-request :get (str "v1/webhook_endpoints/" webhook_endpoint "") params))

(defn post-webhook-endpoints-webhook-endpoint [webhook_endpoint params]
  (stripe-request :post (str "v1/webhook_endpoints/" webhook_endpoint "") params))

(defn get-file-links-link [link params]
  (stripe-request :get (str "v1/file_links/" link "") params))

(defn post-file-links-link [link params]
  (stripe-request :post (str "v1/file_links/" link "") params))

(defn post-payouts-payout-reverse [payout params]
  (stripe-request :post (str "v1/payouts/" payout "/reverse") params))

(defn get-credit-notes-preview [params params]
  (stripe-request :get (str "v1/credit_notes/preview") params))

(defn post-payment-methods-payment-method-attach [payment_method params]
  (stripe-request :post (str "v1/payment_methods/" payment_method "/attach") params))

(defn delete-customers-customer-cards-id [customer id params]
  (stripe-request :delete (str "v1/customers/" customer "/cards/" id "") params))

(defn get-customers-customer-cards-id [customer id params]
  (stripe-request :get (str "v1/customers/" customer "/cards/" id "") params))

(defn post-customers-customer-cards-id [customer id params]
  (stripe-request :post (str "v1/customers/" customer "/cards/" id "") params))

(defn get-invoiceitems [params params]
  (stripe-request :get (str "v1/invoiceitems") params))

(defn post-invoiceitems [params params]
  (stripe-request :post (str "v1/invoiceitems") params))

(defn post-test-helpers-issuing-settlements [params params]
  (stripe-request :post (str "v1/test_helpers/issuing/settlements") params))

(defn get-payment-links [params params]
  (stripe-request :get (str "v1/payment_links") params))

(defn post-payment-links [params params]
  (stripe-request :post (str "v1/payment_links") params))

(defn post-test-helpers-issuing-transactions-create-unlinked-refund [params params]
  (stripe-request :post (str "v1/test_helpers/issuing/transactions/create_unlinked_refund") params))

(defn post-test-helpers-issuing-authorizations-authorization-increment [authorization params]
  (stripe-request :post (str "v1/test_helpers/issuing/authorizations/" authorization "/increment") params))

(defn post-test-helpers-issuing-cards-card-shipping-ship [card params]
  (stripe-request :post (str "v1/test_helpers/issuing/cards/" card "/shipping/ship") params))

(defn post-invoices-invoice-remove-lines [invoice params]
  (stripe-request :post (str "v1/invoices/" invoice "/remove_lines") params))

(defn post-test-helpers-issuing-cards-card-shipping-deliver [card params]
  (stripe-request :post (str "v1/test_helpers/issuing/cards/" card "/shipping/deliver") params))

(defn get-issuing-cards-card [card params]
  (stripe-request :get (str "v1/issuing/cards/" card "") params))

(defn post-issuing-cards-card [card params]
  (stripe-request :post (str "v1/issuing/cards/" card "") params))

(defn post-customers-customer-sources-id-verify [customer id params]
  (stripe-request :post (str "v1/customers/" customer "/sources/" id "/verify") params))

(defn post-subscriptions-subscription-resume [subscription params]
  (stripe-request :post (str "v1/subscriptions/" subscription "/resume") params))

(defn post-accounts-account-bank-accounts [account params]
  (stripe-request :post (str "v1/accounts/" account "/bank_accounts") params))

(defn get-issuing-transactions [params params]
  (stripe-request :get (str "v1/issuing/transactions") params))

(defn post-test-helpers-terminal-readers-reader-present-payment-method [reader params]
  (stripe-request :post (str "v1/test_helpers/terminal/readers/" reader "/present_payment_method") params))

(defn get-treasury-credit-reversals [params params]
  (stripe-request :get (str "v1/treasury/credit_reversals") params))

(defn post-treasury-credit-reversals [params params]
  (stripe-request :post (str "v1/treasury/credit_reversals") params))

(defn get-issuing-personalization-designs [params params]
  (stripe-request :get (str "v1/issuing/personalization_designs") params))

(defn post-issuing-personalization-designs [params params]
  (stripe-request :post (str "v1/issuing/personalization_designs") params))

(defn get-terminal-readers [params params]
  (stripe-request :get (str "v1/terminal/readers") params))

(defn post-terminal-readers [params params]
  (stripe-request :post (str "v1/terminal/readers") params))

(defn get-apple-pay-domains [params params]
  (stripe-request :get (str "v1/apple_pay/domains") params))

(defn post-apple-pay-domains [params params]
  (stripe-request :post (str "v1/apple_pay/domains") params))

(defn get-tax-codes-id [id params]
  (stripe-request :get (str "v1/tax_codes/" id "") params))

(defn get-billing-credit-balance-transactions [params params]
  (stripe-request :get (str "v1/billing/credit_balance_transactions") params))

(defn post-charges-charge-refund [charge params]
  (stripe-request :post (str "v1/charges/" charge "/refund") params))

(defn get-issuing-physical-bundles-physical-bundle [physical_bundle params]
  (stripe-request :get (str "v1/issuing/physical_bundles/" physical_bundle "") params))

(defn get-treasury-transactions-id [id params]
  (stripe-request :get (str "v1/treasury/transactions/" id "") params))

(defn get-customers-customer-payment-methods [customer params]
  (stripe-request :get (str "v1/customers/" customer "/payment_methods") params))

(defn get-customers [params params]
  (stripe-request :get (str "v1/customers") params))

(defn post-customers [params params]
  (stripe-request :post (str "v1/customers") params))

(defn post-setup-intents-intent-verify-microdeposits [intent params]
  (stripe-request :post (str "v1/setup_intents/" intent "/verify_microdeposits") params))

(defn get-financial-connections-accounts [params params]
  (stripe-request :get (str "v1/financial_connections/accounts") params))

(defn get-country-specs [params params]
  (stripe-request :get (str "v1/country_specs") params))

(defn get-charges-charge-refunds-refund [charge refund params]
  (stripe-request :get (str "v1/charges/" charge "/refunds/" refund "") params))

(defn post-charges-charge-refunds-refund [charge refund params]
  (stripe-request :post (str "v1/charges/" charge "/refunds/" refund "") params))

(defn delete-customers-customer-discount [customer params]
  (stripe-request :delete (str "v1/customers/" customer "/discount") params))

(defn get-customers-customer-discount [customer params]
  (stripe-request :get (str "v1/customers/" customer "/discount") params))

(defn get-payment-methods-payment-method [payment_method params]
  (stripe-request :get (str "v1/payment_methods/" payment_method "") params))

(defn post-payment-methods-payment-method [payment_method params]
  (stripe-request :post (str "v1/payment_methods/" payment_method "") params))

(defn get-accounts-account-external-accounts [account params]
  (stripe-request :get (str "v1/accounts/" account "/external_accounts") params))

(defn post-accounts-account-external-accounts [account params]
  (stripe-request :post (str "v1/accounts/" account "/external_accounts") params))

(defn get-apps-secrets-find [params params]
  (stripe-request :get (str "v1/apps/secrets/find") params))

(defn get-products-product-features [product params]
  (stripe-request :get (str "v1/products/" product "/features") params))

(defn post-products-product-features [product params]
  (stripe-request :post (str "v1/products/" product "/features") params))

(defn post-invoice-rendering-templates-template-unarchive [template params]
  (stripe-request :post (str "v1/invoice_rendering_templates/" template "/unarchive") params))

(defn post-payment-intents-intent-confirm [intent params]
  (stripe-request :post (str "v1/payment_intents/" intent "/confirm") params))

(defn post-ephemeral-keys [params params]
  (stripe-request :post (str "v1/ephemeral_keys") params))

(defn get-treasury-financial-accounts-financial-account [financial_account params]
  (stripe-request :get (str "v1/treasury/financial_accounts/" financial_account "") params))

(defn post-treasury-financial-accounts-financial-account [financial_account params]
  (stripe-request :post (str "v1/treasury/financial_accounts/" financial_account "") params))

(defn post-payment-intents-intent-apply-customer-balance [intent params]
  (stripe-request :post (str "v1/payment_intents/" intent "/apply_customer_balance") params))

(defn get-invoices-upcoming [params params]
  (stripe-request :get (str "v1/invoices/upcoming") params))

(defn get-terminal-locations [params params]
  (stripe-request :get (str "v1/terminal/locations") params))

(defn post-terminal-locations [params params]
  (stripe-request :post (str "v1/terminal/locations") params))

(defn get-issuing-cardholders-cardholder [cardholder params]
  (stripe-request :get (str "v1/issuing/cardholders/" cardholder "") params))

(defn post-issuing-cardholders-cardholder [cardholder params]
  (stripe-request :post (str "v1/issuing/cardholders/" cardholder "") params))

(defn get-billing-meters-id [id params]
  (stripe-request :get (str "v1/billing/meters/" id "") params))

(defn post-billing-meters-id [id params]
  (stripe-request :post (str "v1/billing/meters/" id "") params))

(defn get-payouts [params params]
  (stripe-request :get (str "v1/payouts") params))

(defn post-payouts [params params]
  (stripe-request :post (str "v1/payouts") params))

(defn get-treasury-debit-reversals [params params]
  (stripe-request :get (str "v1/treasury/debit_reversals") params))

(defn post-treasury-debit-reversals [params params]
  (stripe-request :post (str "v1/treasury/debit_reversals") params))

(defn get-quotes-quote-pdf [quote params]
  (stripe-request :get (str "v1/quotes/" quote "/pdf") params))

(defn get-setup-intents [params params]
  (stripe-request :get (str "v1/setup_intents") params))

(defn post-setup-intents [params params]
  (stripe-request :post (str "v1/setup_intents") params))

(defn get-identity-verification-sessions-session [session params]
  (stripe-request :get (str "v1/identity/verification_sessions/" session "") params))

(defn post-identity-verification-sessions-session [session params]
  (stripe-request :post (str "v1/identity/verification_sessions/" session "") params))

(defn post-checkout-sessions-session-expire [session params]
  (stripe-request :post (str "v1/checkout/sessions/" session "/expire") params))

(defn get-payment-intents [params params]
  (stripe-request :get (str "v1/payment_intents") params))

(defn post-payment-intents [params params]
  (stripe-request :post (str "v1/payment_intents") params))

(defn post-application-fees-id-refund [id params]
  (stripe-request :post (str "v1/application_fees/" id "/refund") params))

(defn delete-accounts-account-external-accounts-id [account id params]
  (stripe-request :delete (str "v1/accounts/" account "/external_accounts/" id "") params))

(defn get-accounts-account-external-accounts-id [account id params]
  (stripe-request :get (str "v1/accounts/" account "/external_accounts/" id "") params))

(defn post-accounts-account-external-accounts-id [account id params]
  (stripe-request :post (str "v1/accounts/" account "/external_accounts/" id "") params))

(defn delete-invoices-invoice [invoice params]
  (stripe-request :delete (str "v1/invoices/" invoice "") params))

(defn get-invoices-invoice [invoice params]
  (stripe-request :get (str "v1/invoices/" invoice "") params))

(defn post-invoices-invoice [invoice params]
  (stripe-request :post (str "v1/invoices/" invoice "") params))

(defn get-test-helpers-test-clocks [params params]
  (stripe-request :get (str "v1/test_helpers/test_clocks") params))

(defn post-test-helpers-test-clocks [params params]
  (stripe-request :post (str "v1/test_helpers/test_clocks") params))

(defn post-test-helpers-issuing-transactions-create-force-capture [params params]
  (stripe-request :post (str "v1/test_helpers/issuing/transactions/create_force_capture") params))

(defn post-test-helpers-treasury-outbound-payments-id [id params]
  (stripe-request :post (str "v1/test_helpers/treasury/outbound_payments/" id "") params))

(defn post-issuing-authorizations-authorization-approve [authorization params]
  (stripe-request :post (str "v1/issuing/authorizations/" authorization "/approve") params))

(defn post-invoices-invoice-pay [invoice params]
  (stripe-request :post (str "v1/invoices/" invoice "/pay") params))

(defn get-climate-suppliers-supplier [supplier params]
  (stripe-request :get (str "v1/climate/suppliers/" supplier "") params))

(defn get-issuing-settlements-settlement [settlement params]
  (stripe-request :get (str "v1/issuing/settlements/" settlement "") params))

(defn post-issuing-settlements-settlement [settlement params]
  (stripe-request :post (str "v1/issuing/settlements/" settlement "") params))

(defn get-refunds [params params]
  (stripe-request :get (str "v1/refunds") params))

(defn post-refunds [params params]
  (stripe-request :post (str "v1/refunds") params))

(defn post-billing-meter-events [params params]
  (stripe-request :post (str "v1/billing/meter_events") params))

(defn get-subscriptions [params params]
  (stripe-request :get (str "v1/subscriptions") params))

(defn post-subscriptions [params params]
  (stripe-request :post (str "v1/subscriptions") params))

(defn delete-products-id [id params]
  (stripe-request :delete (str "v1/products/" id "") params))

(defn get-products-id [id params]
  (stripe-request :get (str "v1/products/" id "") params))

(defn post-products-id [id params]
  (stripe-request :post (str "v1/products/" id "") params))

(defn get-issuing-tokens-token [token params]
  (stripe-request :get (str "v1/issuing/tokens/" token "") params))

(defn post-issuing-tokens-token [token params]
  (stripe-request :post (str "v1/issuing/tokens/" token "") params))

(defn get-shipping-rates [params params]
  (stripe-request :get (str "v1/shipping_rates") params))

(defn post-shipping-rates [params params]
  (stripe-request :post (str "v1/shipping_rates") params))

(defn post-test-helpers-issuing-cards-card-shipping-submit [card params]
  (stripe-request :post (str "v1/test_helpers/issuing/cards/" card "/shipping/submit") params))

(defn post-accounts-account-reject [account params]
  (stripe-request :post (str "v1/accounts/" account "/reject") params))

(defn get-file-links [params params]
  (stripe-request :get (str "v1/file_links") params))

(defn post-file-links [params params]
  (stripe-request :post (str "v1/file_links") params))

(defn get-tax-rates [params params]
  (stripe-request :get (str "v1/tax_rates") params))

(defn post-tax-rates [params params]
  (stripe-request :post (str "v1/tax_rates") params))

(defn post-subscription-schedules-schedule-cancel [schedule params]
  (stripe-request :post (str "v1/subscription_schedules/" schedule "/cancel") params))

(defn get-radar-early-fraud-warnings-early-fraud-warning [early_fraud_warning params]
  (stripe-request :get (str "v1/radar/early_fraud_warnings/" early_fraud_warning "") params))

(defn post-sources [params params]
  (stripe-request :post (str "v1/sources") params))

(defn post-terminal-connection-tokens [params params]
  (stripe-request :post (str "v1/terminal/connection_tokens") params))