(ns stream.clojure.stripe.api
  "WARNING: This file is auto-generated from Stripe's OpenAPI spec.
  DO NOT MODIFY THIS FILE MANUALLY. Any changes will be overwritten.
  ALPHA: Work-in-progress - expect breaking changes before the stable release."
 (:require [stream.clojure.stripe.request :refer [stripe-request]]))

(defn PostBillingAlertsIdArchive [id params]
  (stripe-request :post (str "v1/billing/alerts/" id "/archive") params))

(defn PostClimateOrdersOrderCancel [order params]
  (stripe-request :post (str "v1/climate/orders/" order "/cancel") params))

(defn GetSubscriptionSchedules [ params]
  (stripe-request :get (str "v1/subscription_schedules") params))

(defn PostSubscriptionSchedules [ params]
  (stripe-request :post (str "v1/subscription_schedules") params))

(defn GetRadarEarlyFraudWarnings [ params]
  (stripe-request :get (str "v1/radar/early_fraud_warnings") params))

(defn GetTreasuryTransactionEntriesId [id params]
  (stripe-request :get (str "v1/treasury/transaction_entries/" id "") params))

(defn PostTestHelpersTreasuryOutboundPaymentsIdFail [id params]
  (stripe-request :post (str "v1/test_helpers/treasury/outbound_payments/" id "/fail") params))

(defn GetTaxIds [ params]
  (stripe-request :get (str "v1/tax_ids") params))

(defn PostTaxIds [ params]
  (stripe-request :post (str "v1/tax_ids") params))

(defn GetClimateSuppliers [ params]
  (stripe-request :get (str "v1/climate/suppliers") params))

(defn GetLinkedAccountsAccount [account params]
  (stripe-request :get (str "v1/linked_accounts/" account "") params))

(defn GetTaxRegistrationsId [id params]
  (stripe-request :get (str "v1/tax/registrations/" id "") params))

(defn PostTaxRegistrationsId [id params]
  (stripe-request :post (str "v1/tax/registrations/" id "") params))

(defn GetBalanceHistory [ params]
  (stripe-request :get (str "v1/balance/history") params))

(defn GetPromotionCodesPromotionCode [promotion_code params]
  (stripe-request :get (str "v1/promotion_codes/" promotion_code "") params))

(defn PostPromotionCodesPromotionCode [promotion_code params]
  (stripe-request :post (str "v1/promotion_codes/" promotion_code "") params))

(defn GetCustomersCustomerCashBalanceTransactionsTransaction [customer transaction params]
  (stripe-request :get (str "v1/customers/" customer "/cash_balance_transactions/" transaction "") params))

(defn GetTopups [ params]
  (stripe-request :get (str "v1/topups") params))

(defn PostTopups [ params]
  (stripe-request :post (str "v1/topups") params))

(defn GetPaymentLinksPaymentLink [payment_link params]
  (stripe-request :get (str "v1/payment_links/" payment_link "") params))

(defn PostPaymentLinksPaymentLink [payment_link params]
  (stripe-request :post (str "v1/payment_links/" payment_link "") params))

(defn GetPaymentMethodDomains [ params]
  (stripe-request :get (str "v1/payment_method_domains") params))

(defn PostPaymentMethodDomains [ params]
  (stripe-request :post (str "v1/payment_method_domains") params))

(defn PostBillingPortalSessions [ params]
  (stripe-request :post (str "v1/billing_portal/sessions") params))

(defn PostAccountLinks [ params]
  (stripe-request :post (str "v1/account_links") params))

(defn GetSourcesSourceSourceTransactionsSourceTransaction [source source_transaction params]
  (stripe-request :get (str "v1/sources/" source "/source_transactions/" source_transaction "") params))

(defn GetInvoicesUpcomingLines [ params]
  (stripe-request :get (str "v1/invoices/upcoming/lines") params))

(defn GetIssuingDisputesDispute [dispute params]
  (stripe-request :get (str "v1/issuing/disputes/" dispute "") params))

(defn PostIssuingDisputesDispute [dispute params]
  (stripe-request :post (str "v1/issuing/disputes/" dispute "") params))

(defn GetClimateProducts [ params]
  (stripe-request :get (str "v1/climate/products") params))

(defn PostRefundsRefundCancel [refund params]
  (stripe-request :post (str "v1/refunds/" refund "/cancel") params))

(defn PostTaxTransactionsCreateReversal [ params]
  (stripe-request :post (str "v1/tax/transactions/create_reversal") params))

(defn DeleteTerminalConfigurationsConfiguration [configuration params]
  (stripe-request :delete (str "v1/terminal/configurations/" configuration "") params))

(defn GetTerminalConfigurationsConfiguration [configuration params]
  (stripe-request :get (str "v1/terminal/configurations/" configuration "") params))

(defn PostTerminalConfigurationsConfiguration [configuration params]
  (stripe-request :post (str "v1/terminal/configurations/" configuration "") params))

(defn GetMandatesMandate [mandate params]
  (stripe-request :get (str "v1/mandates/" mandate "") params))

(defn GetPrices [ params]
  (stripe-request :get (str "v1/prices") params))

(defn PostPrices [ params]
  (stripe-request :post (str "v1/prices") params))

(defn PostSetupIntentsIntentCancel [intent params]
  (stripe-request :post (str "v1/setup_intents/" intent "/cancel") params))

(defn GetIdentityVerificationSessions [ params]
  (stripe-request :get (str "v1/identity/verification_sessions") params))

(defn PostIdentityVerificationSessions [ params]
  (stripe-request :post (str "v1/identity/verification_sessions") params))

(defn GetTreasuryOutboundPaymentsId [id params]
  (stripe-request :get (str "v1/treasury/outbound_payments/" id "") params))

(defn PostTestHelpersTreasuryOutboundTransfersOutboundTransferPost [outbound_transfer params]
  (stripe-request :post (str "v1/test_helpers/treasury/outbound_transfers/" outbound_transfer "/post") params))

(defn PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmount [authorization params]
  (stripe-request :post (str "v1/test_helpers/issuing/authorizations/" authorization "/finalize_amount") params))

(defn PostSourcesSourceVerify [source params]
  (stripe-request :post (str "v1/sources/" source "/verify") params))

(defn GetTreasuryTransactions [ params]
  (stripe-request :get (str "v1/treasury/transactions") params))

(defn GetCheckoutSessionsSession [session params]
  (stripe-request :get (str "v1/checkout/sessions/" session "") params))

(defn PostCheckoutSessionsSession [session params]
  (stripe-request :post (str "v1/checkout/sessions/" session "") params))

(defn GetClimateProductsProduct [product params]
  (stripe-request :get (str "v1/climate/products/" product "") params))

(defn PostFinancialConnectionsSessions [ params]
  (stripe-request :post (str "v1/financial_connections/sessions") params))

(defn PostInvoiceRenderingTemplatesTemplateArchive [template params]
  (stripe-request :post (str "v1/invoice_rendering_templates/" template "/archive") params))

(defn PostTestHelpersIssuingTransactionsTransactionRefund [transaction params]
  (stripe-request :post (str "v1/test_helpers/issuing/transactions/" transaction "/refund") params))

(defn PostInvoicesCreatePreview [ params]
  (stripe-request :post (str "v1/invoices/create_preview") params))

(defn GetCustomersCustomerBalanceTransactions [customer params]
  (stripe-request :get (str "v1/customers/" customer "/balance_transactions") params))

(defn PostCustomersCustomerBalanceTransactions [customer params]
  (stripe-request :post (str "v1/customers/" customer "/balance_transactions") params))

(defn PostCreditNotesIdVoid [id params]
  (stripe-request :post (str "v1/credit_notes/" id "/void") params))

(defn GetBalanceTransactions [ params]
  (stripe-request :get (str "v1/balance_transactions") params))

(defn GetTerminalConfigurations [ params]
  (stripe-request :get (str "v1/terminal/configurations") params))

(defn PostTerminalConfigurations [ params]
  (stripe-request :post (str "v1/terminal/configurations") params))

(defn GetCustomersCustomerPaymentMethodsPaymentMethod [customer payment_method params]
  (stripe-request :get (str "v1/customers/" customer "/payment_methods/" payment_method "") params))

(defn PostPayoutsPayoutCancel [payout params]
  (stripe-request :post (str "v1/payouts/" payout "/cancel") params))

(defn PostTerminalReadersReaderProcessPaymentIntent [reader params]
  (stripe-request :post (str "v1/terminal/readers/" reader "/process_payment_intent") params))

(defn GetFiles [ params]
  (stripe-request :get (str "v1/files") params))

(defn PostFiles [ params]
  (stripe-request :post (str "v1/files") params))

(defn PostTestHelpersIssuingAuthorizations [ params]
  (stripe-request :post (str "v1/test_helpers/issuing/authorizations") params))

(defn GetInvoiceRenderingTemplates [ params]
  (stripe-request :get (str "v1/invoice_rendering_templates") params))

(defn GetReportingReportTypes [ params]
  (stripe-request :get (str "v1/reporting/report_types") params))

(defn GetIssuingDisputes [ params]
  (stripe-request :get (str "v1/issuing/disputes") params))

(defn PostIssuingDisputes [ params]
  (stripe-request :post (str "v1/issuing/disputes") params))

(defn GetBillingAlertsId [id params]
  (stripe-request :get (str "v1/billing/alerts/" id "") params))

(defn GetTransfersIdReversals [id params]
  (stripe-request :get (str "v1/transfers/" id "/reversals") params))

(defn PostTransfersIdReversals [id params]
  (stripe-request :post (str "v1/transfers/" id "/reversals") params))

(defn GetProducts [ params]
  (stripe-request :get (str "v1/products") params))

(defn PostProducts [ params]
  (stripe-request :post (str "v1/products") params))

(defn DeleteCustomersCustomerSubscriptionsSubscriptionExposedId [customer subscription_exposed_id params]
  (stripe-request :delete (str "v1/customers/" customer "/subscriptions/" subscription_exposed_id "") params))

(defn GetCustomersCustomerSubscriptionsSubscriptionExposedId [customer subscription_exposed_id params]
  (stripe-request :get (str "v1/customers/" customer "/subscriptions/" subscription_exposed_id "") params))

(defn PostCustomersCustomerSubscriptionsSubscriptionExposedId [customer subscription_exposed_id params]
  (stripe-request :post (str "v1/customers/" customer "/subscriptions/" subscription_exposed_id "") params))

(defn GetInvoicesSearch [ params]
  (stripe-request :get (str "v1/invoices/search") params))

(defn PostTestHelpersTreasuryReceivedDebits [ params]
  (stripe-request :post (str "v1/test_helpers/treasury/received_debits") params))

(defn GetTreasuryOutboundTransfersOutboundTransfer [outbound_transfer params]
  (stripe-request :get (str "v1/treasury/outbound_transfers/" outbound_transfer "") params))

(defn GetCustomersCustomerBankAccounts [customer params]
  (stripe-request :get (str "v1/customers/" customer "/bank_accounts") params))

(defn PostCustomersCustomerBankAccounts [customer params]
  (stripe-request :post (str "v1/customers/" customer "/bank_accounts") params))

(defn DeleteSubscriptionsSubscriptionExposedId [subscription_exposed_id params]
  (stripe-request :delete (str "v1/subscriptions/" subscription_exposed_id "") params))

(defn GetSubscriptionsSubscriptionExposedId [subscription_exposed_id params]
  (stripe-request :get (str "v1/subscriptions/" subscription_exposed_id "") params))

(defn PostSubscriptionsSubscriptionExposedId [subscription_exposed_id params]
  (stripe-request :post (str "v1/subscriptions/" subscription_exposed_id "") params))

(defn GetEvents [ params]
  (stripe-request :get (str "v1/events") params))

(defn GetAccounts [ params]
  (stripe-request :get (str "v1/accounts") params))

(defn PostAccounts [ params]
  (stripe-request :post (str "v1/accounts") params))

(defn PostTerminalReadersReaderSetReaderDisplay [reader params]
  (stripe-request :post (str "v1/terminal/readers/" reader "/set_reader_display") params))

(defn GetTaxCodes [ params]
  (stripe-request :get (str "v1/tax_codes") params))

(defn GetTaxTransactionsTransaction [transaction params]
  (stripe-request :get (str "v1/tax/transactions/" transaction "") params))

(defn PostInvoicesInvoiceVoid [invoice params]
  (stripe-request :post (str "v1/invoices/" invoice "/void") params))

(defn GetRefundsRefund [refund params]
  (stripe-request :get (str "v1/refunds/" refund "") params))

(defn PostRefundsRefund [refund params]
  (stripe-request :post (str "v1/refunds/" refund "") params))

(defn GetBalanceHistoryId [id params]
  (stripe-request :get (str "v1/balance/history/" id "") params))

(defn GetSetupAttempts [ params]
  (stripe-request :get (str "v1/setup_attempts") params))

(defn PostTreasuryFinancialAccountsFinancialAccountClose [financial_account params]
  (stripe-request :post (str "v1/treasury/financial_accounts/" financial_account "/close") params))

(defn PostQuotesQuoteAccept [quote params]
  (stripe-request :post (str "v1/quotes/" quote "/accept") params))

(defn GetEntitlementsFeatures [ params]
  (stripe-request :get (str "v1/entitlements/features") params))

(defn PostEntitlementsFeatures [ params]
  (stripe-request :post (str "v1/entitlements/features") params))

(defn PostTestHelpersTreasuryInboundTransfersIdSucceed [id params]
  (stripe-request :post (str "v1/test_helpers/treasury/inbound_transfers/" id "/succeed") params))

(defn GetBillingCreditGrants [ params]
  (stripe-request :get (str "v1/billing/credit_grants") params))

(defn PostBillingCreditGrants [ params]
  (stripe-request :post (str "v1/billing/credit_grants") params))

(defn GetTreasuryOutboundTransfers [ params]
  (stripe-request :get (str "v1/treasury/outbound_transfers") params))

(defn PostTreasuryOutboundTransfers [ params]
  (stripe-request :post (str "v1/treasury/outbound_transfers") params))

(defn GetWebhookEndpoints [ params]
  (stripe-request :get (str "v1/webhook_endpoints") params))

(defn PostWebhookEndpoints [ params]
  (stripe-request :post (str "v1/webhook_endpoints") params))

(defn PostIssuingDisputesDisputeSubmit [dispute params]
  (stripe-request :post (str "v1/issuing/disputes/" dispute "/submit") params))

(defn GetFinancialConnectionsAccountsAccount [account params]
  (stripe-request :get (str "v1/financial_connections/accounts/" account "") params))

(defn GetQuotesQuoteLineItems [quote params]
  (stripe-request :get (str "v1/quotes/" quote "/line_items") params))

(defn PostIdentityVerificationSessionsSessionCancel [session params]
  (stripe-request :post (str "v1/identity/verification_sessions/" session "/cancel") params))

(defn GetBalanceTransactionsId [id params]
  (stripe-request :get (str "v1/balance_transactions/" id "") params))

(defn GetCustomersSearch [ params]
  (stripe-request :get (str "v1/customers/search") params))

(defn GetExchangeRatesRateId [rate_id params]
  (stripe-request :get (str "v1/exchange_rates/" rate_id "") params))

(defn GetCreditNotesPreviewLines [ params]
  (stripe-request :get (str "v1/credit_notes/preview/lines") params))

(defn GetEventsId [id params]
  (stripe-request :get (str "v1/events/" id "") params))

(defn DeleteSubscriptionItemsItem [item params]
  (stripe-request :delete (str "v1/subscription_items/" item "") params))

(defn GetSubscriptionItemsItem [item params]
  (stripe-request :get (str "v1/subscription_items/" item "") params))

(defn PostSubscriptionItemsItem [item params]
  (stripe-request :post (str "v1/subscription_items/" item "") params))

(defn GetPricesPrice [price params]
  (stripe-request :get (str "v1/prices/" price "") params))

(defn PostPricesPrice [price params]
  (stripe-request :post (str "v1/prices/" price "") params))

(defn GetReportingReportRuns [ params]
  (stripe-request :get (str "v1/reporting/report_runs") params))

(defn PostReportingReportRuns [ params]
  (stripe-request :post (str "v1/reporting/report_runs") params))

(defn GetCharges [ params]
  (stripe-request :get (str "v1/charges") params))

(defn PostCharges [ params]
  (stripe-request :post (str "v1/charges") params))

(defn GetPaymentMethodDomainsPaymentMethodDomain [payment_method_domain params]
  (stripe-request :get (str "v1/payment_method_domains/" payment_method_domain "") params))

(defn PostPaymentMethodDomainsPaymentMethodDomain [payment_method_domain params]
  (stripe-request :post (str "v1/payment_method_domains/" payment_method_domain "") params))

(defn GetCustomersCustomerCards [customer params]
  (stripe-request :get (str "v1/customers/" customer "/cards") params))

(defn PostCustomersCustomerCards [customer params]
  (stripe-request :post (str "v1/customers/" customer "/cards") params))

(defn PostAccountsAccountLoginLinks [account params]
  (stripe-request :post (str "v1/accounts/" account "/login_links") params))

(defn GetTreasuryTransactionEntries [ params]
  (stripe-request :get (str "v1/treasury/transaction_entries") params))

(defn PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignReject [personalization_design params]
  (stripe-request :post (str "v1/test_helpers/issuing/personalization_designs/" personalization_design "/reject") params))

(defn GetCreditNotesCreditNoteLines [credit_note params]
  (stripe-request :get (str "v1/credit_notes/" credit_note "/lines") params))

(defn GetIssuingTokens [ params]
  (stripe-request :get (str "v1/issuing/tokens") params))

(defn GetBillingMetersIdEventSummaries [id params]
  (stripe-request :get (str "v1/billing/meters/" id "/event_summaries") params))

(defn PostBillingMeterEventAdjustments [ params]
  (stripe-request :post (str "v1/billing/meter_event_adjustments") params))

(defn PostTestHelpersIssuingAuthorizationsAuthorizationReverse [authorization params]
  (stripe-request :post (str "v1/test_helpers/issuing/authorizations/" authorization "/reverse") params))

(defn GetPlans [ params]
  (stripe-request :get (str "v1/plans") params))

(defn PostPlans [ params]
  (stripe-request :post (str "v1/plans") params))

(defn DeleteAccountsAccountPersonsPerson [account person params]
  (stripe-request :delete (str "v1/accounts/" account "/persons/" person "") params))

(defn GetAccountsAccountPersonsPerson [account person params]
  (stripe-request :get (str "v1/accounts/" account "/persons/" person "") params))

(defn PostAccountsAccountPersonsPerson [account person params]
  (stripe-request :post (str "v1/accounts/" account "/persons/" person "") params))

(defn GetClimateOrders [ params]
  (stripe-request :get (str "v1/climate/orders") params))

(defn PostClimateOrders [ params]
  (stripe-request :post (str "v1/climate/orders") params))

(defn GetTreasuryCreditReversalsCreditReversal [credit_reversal params]
  (stripe-request :get (str "v1/treasury/credit_reversals/" credit_reversal "") params))

(defn PostTestHelpersTreasuryOutboundPaymentsIdReturn [id params]
  (stripe-request :post (str "v1/test_helpers/treasury/outbound_payments/" id "/return") params))

(defn GetPaymentIntentsIntent [intent params]
  (stripe-request :get (str "v1/payment_intents/" intent "") params))

(defn PostPaymentIntentsIntent [intent params]
  (stripe-request :post (str "v1/payment_intents/" intent "") params))

(defn GetCountrySpecsCountry [country params]
  (stripe-request :get (str "v1/country_specs/" country "") params))

(defn GetTokensToken [token params]
  (stripe-request :get (str "v1/tokens/" token "") params))

(defn PostTestHelpersTreasuryInboundTransfersIdFail [id params]
  (stripe-request :post (str "v1/test_helpers/treasury/inbound_transfers/" id "/fail") params))

(defn PostTestHelpersTreasuryReceivedCredits [ params]
  (stripe-request :post (str "v1/test_helpers/treasury/received_credits") params))

(defn PostBillingAlertsIdDeactivate [id params]
  (stripe-request :post (str "v1/billing/alerts/" id "/deactivate") params))

(defn GetTransfersTransferReversalsId [transfer id params]
  (stripe-request :get (str "v1/transfers/" transfer "/reversals/" id "") params))

(defn PostTransfersTransferReversalsId [transfer id params]
  (stripe-request :post (str "v1/transfers/" transfer "/reversals/" id "") params))

(defn GetInvoicesInvoiceLines [invoice params]
  (stripe-request :get (str "v1/invoices/" invoice "/lines") params))

(defn GetLinkedAccountsAccountOwners [account params]
  (stripe-request :get (str "v1/linked_accounts/" account "/owners") params))

(defn PostQuotesQuoteFinalize [quote params]
  (stripe-request :post (str "v1/quotes/" quote "/finalize") params))

(defn GetCustomersCustomerCashBalanceTransactions [customer params]
  (stripe-request :get (str "v1/customers/" customer "/cash_balance_transactions") params))

(defn GetSigmaScheduledQueryRuns [ params]
  (stripe-request :get (str "v1/sigma/scheduled_query_runs") params))

(defn GetDisputes [ params]
  (stripe-request :get (str "v1/disputes") params))

(defn GetIssuingPersonalizationDesignsPersonalizationDesign [personalization_design params]
  (stripe-request :get (str "v1/issuing/personalization_designs/" personalization_design "") params))

(defn PostIssuingPersonalizationDesignsPersonalizationDesign [personalization_design params]
  (stripe-request :post (str "v1/issuing/personalization_designs/" personalization_design "") params))

(defn GetTreasuryFinancialAccountsFinancialAccountFeatures [financial_account params]
  (stripe-request :get (str "v1/treasury/financial_accounts/" financial_account "/features") params))

(defn PostTreasuryFinancialAccountsFinancialAccountFeatures [financial_account params]
  (stripe-request :post (str "v1/treasury/financial_accounts/" financial_account "/features") params))

(defn GetTransfers [ params]
  (stripe-request :get (str "v1/transfers") params))

(defn PostTransfers [ params]
  (stripe-request :post (str "v1/transfers") params))

(defn PostInvoicesInvoiceUpdateLines [invoice params]
  (stripe-request :post (str "v1/invoices/" invoice "/update_lines") params))

(defn PostBillingCreditGrantsIdExpire [id params]
  (stripe-request :post (str "v1/billing/credit_grants/" id "/expire") params))

(defn GetProductsSearch [ params]
  (stripe-request :get (str "v1/products/search") params))

(defn DeleteTaxIdsId [id params]
  (stripe-request :delete (str "v1/tax_ids/" id "") params))

(defn GetTaxIdsId [id params]
  (stripe-request :get (str "v1/tax_ids/" id "") params))

(defn PostLinkedAccountsAccountRefresh [account params]
  (stripe-request :post (str "v1/linked_accounts/" account "/refresh") params))

(defn GetCheckoutSessions [ params]
  (stripe-request :get (str "v1/checkout/sessions") params))

(defn PostCheckoutSessions [ params]
  (stripe-request :post (str "v1/checkout/sessions") params))

(defn DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscount [customer subscription_exposed_id params]
  (stripe-request :delete (str "v1/customers/" customer "/subscriptions/" subscription_exposed_id "/discount") params))

(defn GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscount [customer subscription_exposed_id params]
  (stripe-request :get (str "v1/customers/" customer "/subscriptions/" subscription_exposed_id "/discount") params))

(defn GetApplicationFeesIdRefunds [id params]
  (stripe-request :get (str "v1/application_fees/" id "/refunds") params))

(defn PostApplicationFeesIdRefunds [id params]
  (stripe-request :post (str "v1/application_fees/" id "/refunds") params))

(defn GetIssuingCardholders [ params]
  (stripe-request :get (str "v1/issuing/cardholders") params))

(defn PostIssuingCardholders [ params]
  (stripe-request :post (str "v1/issuing/cardholders") params))

(defn GetCustomersCustomerTaxIds [customer params]
  (stripe-request :get (str "v1/customers/" customer "/tax_ids") params))

(defn PostCustomersCustomerTaxIds [customer params]
  (stripe-request :post (str "v1/customers/" customer "/tax_ids") params))

(defn PostFinancialConnectionsAccountsAccountRefresh [account params]
  (stripe-request :post (str "v1/financial_connections/accounts/" account "/refresh") params))

(defn PostFinancialConnectionsAccountsAccountUnsubscribe [account params]
  (stripe-request :post (str "v1/financial_connections/accounts/" account "/unsubscribe") params))

(defn PostBillingMetersIdDeactivate [id params]
  (stripe-request :post (str "v1/billing/meters/" id "/deactivate") params))

(defn GetSubscriptionItems [ params]
  (stripe-request :get (str "v1/subscription_items") params))

(defn PostSubscriptionItems [ params]
  (stripe-request :post (str "v1/subscription_items") params))

(defn DeleteApplePayDomainsDomain [domain params]
  (stripe-request :delete (str "v1/apple_pay/domains/" domain "") params))

(defn GetApplePayDomainsDomain [domain params]
  (stripe-request :get (str "v1/apple_pay/domains/" domain "") params))

(defn DeleteAccountsAccountBankAccountsId [account id params]
  (stripe-request :delete (str "v1/accounts/" account "/bank_accounts/" id "") params))

(defn GetAccountsAccountBankAccountsId [account id params]
  (stripe-request :get (str "v1/accounts/" account "/bank_accounts/" id "") params))

(defn PostAccountsAccountBankAccountsId [account id params]
  (stripe-request :post (str "v1/accounts/" account "/bank_accounts/" id "") params))

(defn PostFinancialConnectionsAccountsAccountDisconnect [account params]
  (stripe-request :post (str "v1/financial_connections/accounts/" account "/disconnect") params))

(defn GetReportingReportTypesReportType [report_type params]
  (stripe-request :get (str "v1/reporting/report_types/" report_type "") params))

(defn GetAppsSecrets [ params]
  (stripe-request :get (str "v1/apps/secrets") params))

(defn PostAppsSecrets [ params]
  (stripe-request :post (str "v1/apps/secrets") params))

(defn GetConfirmationTokensConfirmationToken [confirmation_token params]
  (stripe-request :get (str "v1/confirmation_tokens/" confirmation_token "") params))

(defn GetTreasuryInboundTransfersId [id params]
  (stripe-request :get (str "v1/treasury/inbound_transfers/" id "") params))

(defn PostInvoicesInvoiceAddLines [invoice params]
  (stripe-request :post (str "v1/invoices/" invoice "/add_lines") params))

(defn GetTreasuryFinancialAccounts [ params]
  (stripe-request :get (str "v1/treasury/financial_accounts") params))

(defn PostTreasuryFinancialAccounts [ params]
  (stripe-request :post (str "v1/treasury/financial_accounts") params))

(defn PostTerminalReadersReaderRefundPayment [reader params]
  (stripe-request :post (str "v1/terminal/readers/" reader "/refund_payment") params))

(defn DeletePlansPlan [plan params]
  (stripe-request :delete (str "v1/plans/" plan "") params))

(defn GetPlansPlan [plan params]
  (stripe-request :get (str "v1/plans/" plan "") params))

(defn PostPlansPlan [plan params]
  (stripe-request :post (str "v1/plans/" plan "") params))

(defn DeleteSubscriptionsSubscriptionExposedIdDiscount [subscription_exposed_id params]
  (stripe-request :delete (str "v1/subscriptions/" subscription_exposed_id "/discount") params))

(defn PostTreasuryInboundTransfersInboundTransferCancel [inbound_transfer params]
  (stripe-request :post (str "v1/treasury/inbound_transfers/" inbound_transfer "/cancel") params))

(defn PostReviewsReviewApprove [review params]
  (stripe-request :post (str "v1/reviews/" review "/approve") params))

(defn GetIdentityVerificationReports [ params]
  (stripe-request :get (str "v1/identity/verification_reports") params))

(defn GetBillingAlerts [ params]
  (stripe-request :get (str "v1/billing/alerts") params))

(defn PostBillingAlerts [ params]
  (stripe-request :post (str "v1/billing/alerts") params))

(defn GetBillingPortalConfigurations [ params]
  (stripe-request :get (str "v1/billing_portal/configurations") params))

(defn PostBillingPortalConfigurations [ params]
  (stripe-request :post (str "v1/billing_portal/configurations") params))

(defn PostBillingAlertsIdActivate [id params]
  (stripe-request :post (str "v1/billing/alerts/" id "/activate") params))

(defn GetEntitlementsFeaturesId [id params]
  (stripe-request :get (str "v1/entitlements/features/" id "") params))

(defn PostEntitlementsFeaturesId [id params]
  (stripe-request :post (str "v1/entitlements/features/" id "") params))

(defn GetSubscriptionItemsSubscriptionItemUsageRecordSummaries [subscription_item params]
  (stripe-request :get (str "v1/subscription_items/" subscription_item "/usage_record_summaries") params))

(defn GetBillingCreditBalanceTransactionsId [id params]
  (stripe-request :get (str "v1/billing/credit_balance_transactions/" id "") params))

(defn GetTreasuryReceivedDebitsId [id params]
  (stripe-request :get (str "v1/treasury/received_debits/" id "") params))

(defn GetChargesChargeRefunds [charge params]
  (stripe-request :get (str "v1/charges/" charge "/refunds") params))

(defn PostChargesChargeRefunds [charge params]
  (stripe-request :post (str "v1/charges/" charge "/refunds") params))

(defn GetCustomersCustomerSources [customer params]
  (stripe-request :get (str "v1/customers/" customer "/sources") params))

(defn PostCustomersCustomerSources [customer params]
  (stripe-request :post (str "v1/customers/" customer "/sources") params))

(defn GetSetupIntentsIntent [intent params]
  (stripe-request :get (str "v1/setup_intents/" intent "") params))

(defn PostSetupIntentsIntent [intent params]
  (stripe-request :post (str "v1/setup_intents/" intent "") params))

(defn DeleteCustomersCustomerBankAccountsId [customer id params]
  (stripe-request :delete (str "v1/customers/" customer "/bank_accounts/" id "") params))

(defn GetCustomersCustomerBankAccountsId [customer id params]
  (stripe-request :get (str "v1/customers/" customer "/bank_accounts/" id "") params))

(defn PostCustomersCustomerBankAccountsId [customer id params]
  (stripe-request :post (str "v1/customers/" customer "/bank_accounts/" id "") params))

(defn PostTreasuryOutboundPaymentsIdCancel [id params]
  (stripe-request :post (str "v1/treasury/outbound_payments/" id "/cancel") params))

(defn GetReviewsReview [review params]
  (stripe-request :get (str "v1/reviews/" review "") params))

(defn GetFinancialConnectionsTransactions [ params]
  (stripe-request :get (str "v1/financial_connections/transactions") params))

(defn PostTaxTransactionsCreateFromCalculation [ params]
  (stripe-request :post (str "v1/tax/transactions/create_from_calculation") params))

(defn PostCustomerSessions [ params]
  (stripe-request :post (str "v1/customer_sessions") params))

(defn GetBillingMeters [ params]
  (stripe-request :get (str "v1/billing/meters") params))

(defn PostBillingMeters [ params]
  (stripe-request :post (str "v1/billing/meters") params))

(defn PostIssuingAuthorizationsAuthorizationDecline [authorization params]
  (stripe-request :post (str "v1/issuing/authorizations/" authorization "/decline") params))

(defn GetIssuingAuthorizationsAuthorization [authorization params]
  (stripe-request :get (str "v1/issuing/authorizations/" authorization "") params))

(defn PostIssuingAuthorizationsAuthorization [authorization params]
  (stripe-request :post (str "v1/issuing/authorizations/" authorization "") params))

(defn GetBillingCreditBalanceSummary [ params]
  (stripe-request :get (str "v1/billing/credit_balance_summary") params))

(defn PostDisputesDisputeClose [dispute params]
  (stripe-request :post (str "v1/disputes/" dispute "/close") params))

(defn PostTestHelpersIssuingCardsCardShippingReturn [card params]
  (stripe-request :post (str "v1/test_helpers/issuing/cards/" card "/shipping/return") params))

(defn PostLinkAccountSessions [ params]
  (stripe-request :post (str "v1/link_account_sessions") params))

(defn GetFinancialConnectionsAccountsAccountOwners [account params]
  (stripe-request :get (str "v1/financial_connections/accounts/" account "/owners") params))

(defn PostPaymentIntentsIntentIncrementAuthorization [intent params]
  (stripe-request :post (str "v1/payment_intents/" intent "/increment_authorization") params))

(defn DeleteRadarValueListItemsItem [item params]
  (stripe-request :delete (str "v1/radar/value_list_items/" item "") params))

(defn GetRadarValueListItemsItem [item params]
  (stripe-request :get (str "v1/radar/value_list_items/" item "") params))

(defn PostCustomersCustomerBankAccountsIdVerify [customer id params]
  (stripe-request :post (str "v1/customers/" customer "/bank_accounts/" id "/verify") params))

(defn PostSubscriptionSchedulesScheduleRelease [schedule params]
  (stripe-request :post (str "v1/subscription_schedules/" schedule "/release") params))

(defn GetIssuingAuthorizations [ params]
  (stripe-request :get (str "v1/issuing/authorizations") params))

(defn DeleteRadarValueListsValueList [value_list params]
  (stripe-request :delete (str "v1/radar/value_lists/" value_list "") params))

(defn GetRadarValueListsValueList [value_list params]
  (stripe-request :get (str "v1/radar/value_lists/" value_list "") params))

(defn PostRadarValueListsValueList [value_list params]
  (stripe-request :post (str "v1/radar/value_lists/" value_list "") params))

(defn GetForwardingRequests [ params]
  (stripe-request :get (str "v1/forwarding/requests") params))

(defn PostForwardingRequests [ params]
  (stripe-request :post (str "v1/forwarding/requests") params))

(defn PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivate [personalization_design params]
  (stripe-request :post (str "v1/test_helpers/issuing/personalization_designs/" personalization_design "/deactivate") params))

(defn GetReportingReportRunsReportRun [report_run params]
  (stripe-request :get (str "v1/reporting/report_runs/" report_run "") params))

(defn GetTreasuryOutboundPayments [ params]
  (stripe-request :get (str "v1/treasury/outbound_payments") params))

(defn PostTreasuryOutboundPayments [ params]
  (stripe-request :post (str "v1/treasury/outbound_payments") params))

(defn PostTokens [ params]
  (stripe-request :post (str "v1/tokens") params))

(defn PostTestHelpersTreasuryOutboundTransfersOutboundTransferFail [outbound_transfer params]
  (stripe-request :post (str "v1/test_helpers/treasury/outbound_transfers/" outbound_transfer "/fail") params))

(defn GetTaxCalculationsCalculationLineItems [calculation params]
  (stripe-request :get (str "v1/tax/calculations/" calculation "/line_items") params))

(defn GetApplicationFees [ params]
  (stripe-request :get (str "v1/application_fees") params))

(defn GetInvoiceRenderingTemplatesTemplate [template params]
  (stripe-request :get (str "v1/invoice_rendering_templates/" template "") params))

(defn PostChargesChargeDisputeClose [charge params]
  (stripe-request :post (str "v1/charges/" charge "/dispute/close") params))

(defn PostTestHelpersConfirmationTokens [ params]
  (stripe-request :post (str "v1/test_helpers/confirmation_tokens") params))

(defn GetPromotionCodes [ params]
  (stripe-request :get (str "v1/promotion_codes") params))

(defn PostPromotionCodes [ params]
  (stripe-request :post (str "v1/promotion_codes") params))

(defn PostTopupsTopupCancel [topup params]
  (stripe-request :post (str "v1/topups/" topup "/cancel") params))

(defn DeleteAccountsAccountPeoplePerson [account person params]
  (stripe-request :delete (str "v1/accounts/" account "/people/" person "") params))

(defn GetAccountsAccountPeoplePerson [account person params]
  (stripe-request :get (str "v1/accounts/" account "/people/" person "") params))

(defn PostAccountsAccountPeoplePerson [account person params]
  (stripe-request :post (str "v1/accounts/" account "/people/" person "") params))

(defn GetSourcesSource [source params]
  (stripe-request :get (str "v1/sources/" source "") params))

(defn PostSourcesSource [source params]
  (stripe-request :post (str "v1/sources/" source "") params))

(defn PostInvoicesInvoiceSend [invoice params]
  (stripe-request :post (str "v1/invoices/" invoice "/send") params))

(defn GetCoupons [ params]
  (stripe-request :get (str "v1/coupons") params))

(defn PostCoupons [ params]
  (stripe-request :post (str "v1/coupons") params))

(defn GetIssuingCards [ params]
  (stripe-request :get (str "v1/issuing/cards") params))

(defn PostIssuingCards [ params]
  (stripe-request :post (str "v1/issuing/cards") params))

(defn PostTreasuryOutboundTransfersOutboundTransferCancel [outbound_transfer params]
  (stripe-request :post (str "v1/treasury/outbound_transfers/" outbound_transfer "/cancel") params))

(defn GetBalance [ params]
  (stripe-request :get (str "v1/balance") params))

(defn DeleteTerminalReadersReader [reader params]
  (stripe-request :delete (str "v1/terminal/readers/" reader "") params))

(defn GetTerminalReadersReader [reader params]
  (stripe-request :get (str "v1/terminal/readers/" reader "") params))

(defn PostTerminalReadersReader [reader params]
  (stripe-request :post (str "v1/terminal/readers/" reader "") params))

(defn GetTaxSettings [ params]
  (stripe-request :get (str "v1/tax/settings") params))

(defn PostTaxSettings [ params]
  (stripe-request :post (str "v1/tax/settings") params))

(defn GetTreasuryReceivedDebits [ params]
  (stripe-request :get (str "v1/treasury/received_debits") params))

(defn PostPaymentMethodDomainsPaymentMethodDomainValidate [payment_method_domain params]
  (stripe-request :post (str "v1/payment_method_domains/" payment_method_domain "/validate") params))

(defn PostInvoicesInvoiceMarkUncollectible [invoice params]
  (stripe-request :post (str "v1/invoices/" invoice "/mark_uncollectible") params))

(defn GetPayoutsPayout [payout params]
  (stripe-request :get (str "v1/payouts/" payout "") params))

(defn PostPayoutsPayout [payout params]
  (stripe-request :post (str "v1/payouts/" payout "") params))

(defn PostChargesChargeCapture [charge params]
  (stripe-request :post (str "v1/charges/" charge "/capture") params))

(defn GetFilesFile [file params]
  (stripe-request :get (str "v1/files/" file "") params))

(defn PostLinkedAccountsAccountDisconnect [account params]
  (stripe-request :post (str "v1/linked_accounts/" account "/disconnect") params))

(defn GetRadarValueLists [ params]
  (stripe-request :get (str "v1/radar/value_lists") params))

(defn PostRadarValueLists [ params]
  (stripe-request :post (str "v1/radar/value_lists") params))

(defn PostAppsSecretsDelete [ params]
  (stripe-request :post (str "v1/apps/secrets/delete") params))

(defn GetIssuingTransactionsTransaction [transaction params]
  (stripe-request :get (str "v1/issuing/transactions/" transaction "") params))

(defn PostIssuingTransactionsTransaction [transaction params]
  (stripe-request :post (str "v1/issuing/transactions/" transaction "") params))

(defn DeleteTestHelpersTestClocksTestClock [test_clock params]
  (stripe-request :delete (str "v1/test_helpers/test_clocks/" test_clock "") params))

(defn GetTestHelpersTestClocksTestClock [test_clock params]
  (stripe-request :get (str "v1/test_helpers/test_clocks/" test_clock "") params))

(defn GetSourcesSourceMandateNotificationsMandateNotification [source mandate_notification params]
  (stripe-request :get (str "v1/sources/" source "/mandate_notifications/" mandate_notification "") params))

(defn GetTreasuryDebitReversalsDebitReversal [debit_reversal params]
  (stripe-request :get (str "v1/treasury/debit_reversals/" debit_reversal "") params))

(defn GetRadarValueListItems [ params]
  (stripe-request :get (str "v1/radar/value_list_items") params))

(defn PostRadarValueListItems [ params]
  (stripe-request :post (str "v1/radar/value_list_items") params))

(defn PostPaymentMethodsPaymentMethodDetach [payment_method params]
  (stripe-request :post (str "v1/payment_methods/" payment_method "/detach") params))

(defn PostTestHelpersRefundsRefundExpire [refund params]
  (stripe-request :post (str "v1/test_helpers/refunds/" refund "/expire") params))

(defn GetTreasuryReceivedCreditsId [id params]
  (stripe-request :get (str "v1/treasury/received_credits/" id "") params))

(defn PostCustomersCustomerFundingInstructions [customer params]
  (stripe-request :post (str "v1/customers/" customer "/funding_instructions") params))

(defn GetAccountsAccountPeople [account params]
  (stripe-request :get (str "v1/accounts/" account "/people") params))

(defn PostAccountsAccountPeople [account params]
  (stripe-request :post (str "v1/accounts/" account "/people") params))

(defn GetIdentityVerificationReportsReport [report params]
  (stripe-request :get (str "v1/identity/verification_reports/" report "") params))

(defn GetQuotes [ params]
  (stripe-request :get (str "v1/quotes") params))

(defn PostQuotes [ params]
  (stripe-request :post (str "v1/quotes") params))

(defn PostTestHelpersIssuingCardsCardShippingFail [card params]
  (stripe-request :post (str "v1/test_helpers/issuing/cards/" card "/shipping/fail") params))

(defn PostPaymentIntentsIntentVerifyMicrodeposits [intent params]
  (stripe-request :post (str "v1/payment_intents/" intent "/verify_microdeposits") params))

(defn DeleteCouponsCoupon [coupon params]
  (stripe-request :delete (str "v1/coupons/" coupon "") params))

(defn GetCouponsCoupon [coupon params]
  (stripe-request :get (str "v1/coupons/" coupon "") params))

(defn PostCouponsCoupon [coupon params]
  (stripe-request :post (str "v1/coupons/" coupon "") params))

(defn PostTestHelpersIssuingAuthorizationsAuthorizationCapture [authorization params]
  (stripe-request :post (str "v1/test_helpers/issuing/authorizations/" authorization "/capture") params))

(defn GetEntitlementsActiveEntitlementsId [id params]
  (stripe-request :get (str "v1/entitlements/active_entitlements/" id "") params))

(defn GetApplicationFeesFeeRefundsId [fee id params]
  (stripe-request :get (str "v1/application_fees/" fee "/refunds/" id "") params))

(defn PostApplicationFeesFeeRefundsId [fee id params]
  (stripe-request :post (str "v1/application_fees/" fee "/refunds/" id "") params))

(defn PostIdentityVerificationSessionsSessionRedact [session params]
  (stripe-request :post (str "v1/identity/verification_sessions/" session "/redact") params))

(defn PostTestHelpersTreasuryOutboundPaymentsIdPost [id params]
  (stripe-request :post (str "v1/test_helpers/treasury/outbound_payments/" id "/post") params))

(defn GetApplicationFeesId [id params]
  (stripe-request :get (str "v1/application_fees/" id "") params))

(defn GetFinancialConnectionsTransactionsTransaction [transaction params]
  (stripe-request :get (str "v1/financial_connections/transactions/" transaction "") params))

(defn PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturn [outbound_transfer params]
  (stripe-request :post (str "v1/test_helpers/treasury/outbound_transfers/" outbound_transfer "/return") params))

(defn DeleteTerminalLocationsLocation [location params]
  (stripe-request :delete (str "v1/terminal/locations/" location "") params))

(defn GetTerminalLocationsLocation [location params]
  (stripe-request :get (str "v1/terminal/locations/" location "") params))

(defn PostTerminalLocationsLocation [location params]
  (stripe-request :post (str "v1/terminal/locations/" location "") params))

(defn GetCheckoutSessionsSessionLineItems [session params]
  (stripe-request :get (str "v1/checkout/sessions/" session "/line_items") params))

(defn GetCreditNotes [ params]
  (stripe-request :get (str "v1/credit_notes") params))

(defn PostCreditNotes [ params]
  (stripe-request :post (str "v1/credit_notes") params))

(defn GetShippingRatesShippingRateToken [shipping_rate_token params]
  (stripe-request :get (str "v1/shipping_rates/" shipping_rate_token "") params))

(defn PostShippingRatesShippingRateToken [shipping_rate_token params]
  (stripe-request :post (str "v1/shipping_rates/" shipping_rate_token "") params))

(defn PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespond [authorization params]
  (stripe-request :post (str "v1/test_helpers/issuing/authorizations/" authorization "/fraud_challenges/respond") params))

(defn GetPaymentMethodConfigurations [ params]
  (stripe-request :get (str "v1/payment_method_configurations") params))

(defn PostPaymentMethodConfigurations [ params]
  (stripe-request :post (str "v1/payment_method_configurations") params))

(defn GetPricesSearch [ params]
  (stripe-request :get (str "v1/prices/search") params))

(defn PostBillingMetersIdReactivate [id params]
  (stripe-request :post (str "v1/billing/meters/" id "/reactivate") params))

(defn GetBillingPortalConfigurationsConfiguration [configuration params]
  (stripe-request :get (str "v1/billing_portal/configurations/" configuration "") params))

(defn PostBillingPortalConfigurationsConfiguration [configuration params]
  (stripe-request :post (str "v1/billing_portal/configurations/" configuration "") params))

(defn GetPaymentMethodConfigurationsConfiguration [configuration params]
  (stripe-request :get (str "v1/payment_method_configurations/" configuration "") params))

(defn PostPaymentMethodConfigurationsConfiguration [configuration params]
  (stripe-request :post (str "v1/payment_method_configurations/" configuration "") params))

(defn GetEntitlementsActiveEntitlements [ params]
  (stripe-request :get (str "v1/entitlements/active_entitlements") params))

(defn DeleteAccountsAccount [account params]
  (stripe-request :delete (str "v1/accounts/" account "") params))

(defn GetAccountsAccount [account params]
  (stripe-request :get (str "v1/accounts/" account "") params))

(defn PostAccountsAccount [account params]
  (stripe-request :post (str "v1/accounts/" account "") params))

(defn GetExchangeRates [ params]
  (stripe-request :get (str "v1/exchange_rates") params))

(defn GetTaxRatesTaxRate [tax_rate params]
  (stripe-request :get (str "v1/tax_rates/" tax_rate "") params))

(defn PostTaxRatesTaxRate [tax_rate params]
  (stripe-request :post (str "v1/tax_rates/" tax_rate "") params))

(defn GetTaxRegistrations [ params]
  (stripe-request :get (str "v1/tax/registrations") params))

(defn PostTaxRegistrations [ params]
  (stripe-request :post (str "v1/tax/registrations") params))

(defn PostTerminalReadersReaderProcessSetupIntent [reader params]
  (stripe-request :post (str "v1/terminal/readers/" reader "/process_setup_intent") params))

(defn PostTaxCalculations [ params]
  (stripe-request :post (str "v1/tax/calculations") params))

(defn GetCustomersCustomerSubscriptions [customer params]
  (stripe-request :get (str "v1/customers/" customer "/subscriptions") params))

(defn PostCustomersCustomerSubscriptions [customer params]
  (stripe-request :post (str "v1/customers/" customer "/subscriptions") params))

(defn GetQuotesQuoteComputedUpfrontLineItems [quote params]
  (stripe-request :get (str "v1/quotes/" quote "/computed_upfront_line_items") params))

(defn PostInvoicesInvoiceFinalize [invoice params]
  (stripe-request :post (str "v1/invoices/" invoice "/finalize") params))

(defn PostAccountSessions [ params]
  (stripe-request :post (str "v1/account_sessions") params))

(defn GetChargesSearch [ params]
  (stripe-request :get (str "v1/charges/search") params))

(defn GetClimateOrdersOrder [order params]
  (stripe-request :get (str "v1/climate/orders/" order "") params))

(defn PostClimateOrdersOrder [order params]
  (stripe-request :post (str "v1/climate/orders/" order "") params))

(defn GetLinkedAccounts [ params]
  (stripe-request :get (str "v1/linked_accounts") params))

(defn GetForwardingRequestsId [id params]
  (stripe-request :get (str "v1/forwarding/requests/" id "") params))

(defn DeleteCustomersCustomerSourcesId [customer id params]
  (stripe-request :delete (str "v1/customers/" customer "/sources/" id "") params))

(defn GetCustomersCustomerSourcesId [customer id params]
  (stripe-request :get (str "v1/customers/" customer "/sources/" id "") params))

(defn PostCustomersCustomerSourcesId [customer id params]
  (stripe-request :post (str "v1/customers/" customer "/sources/" id "") params))

(defn GetChargesChargeDispute [charge params]
  (stripe-request :get (str "v1/charges/" charge "/dispute") params))

(defn PostChargesChargeDispute [charge params]
  (stripe-request :post (str "v1/charges/" charge "/dispute") params))

(defn PostTestHelpersIssuingAuthorizationsAuthorizationExpire [authorization params]
  (stripe-request :post (str "v1/test_helpers/issuing/authorizations/" authorization "/expire") params))

(defn PostPaymentIntentsIntentCapture [intent params]
  (stripe-request :post (str "v1/payment_intents/" intent "/capture") params))

(defn GetReviews [ params]
  (stripe-request :get (str "v1/reviews") params))

(defn GetCreditNotesId [id params]
  (stripe-request :get (str "v1/credit_notes/" id "") params))

(defn PostCreditNotesId [id params]
  (stripe-request :post (str "v1/credit_notes/" id "") params))

(defn PostInvoicesInvoiceLinesLineItemId [invoice line_item_id params]
  (stripe-request :post (str "v1/invoices/" invoice "/lines/" line_item_id "") params))

(defn GetLinkAccountSessionsSession [session params]
  (stripe-request :get (str "v1/link_account_sessions/" session "") params))

(defn PostTestHelpersCustomersCustomerFundCashBalance [customer params]
  (stripe-request :post (str "v1/test_helpers/customers/" customer "/fund_cash_balance") params))

(defn GetDisputesDispute [dispute params]
  (stripe-request :get (str "v1/disputes/" dispute "") params))

(defn PostDisputesDispute [dispute params]
  (stripe-request :post (str "v1/disputes/" dispute "") params))

(defn GetCustomersCustomerBalanceTransactionsTransaction [customer transaction params]
  (stripe-request :get (str "v1/customers/" customer "/balance_transactions/" transaction "") params))

(defn PostCustomersCustomerBalanceTransactionsTransaction [customer transaction params]
  (stripe-request :post (str "v1/customers/" customer "/balance_transactions/" transaction "") params))

(defn GetAccountsAccountPersons [account params]
  (stripe-request :get (str "v1/accounts/" account "/persons") params))

(defn PostAccountsAccountPersons [account params]
  (stripe-request :post (str "v1/accounts/" account "/persons") params))

(defn GetTaxTransactionsTransactionLineItems [transaction params]
  (stripe-request :get (str "v1/tax/transactions/" transaction "/line_items") params))

(defn GetSubscriptionSchedulesSchedule [schedule params]
  (stripe-request :get (str "v1/subscription_schedules/" schedule "") params))

(defn PostSubscriptionSchedulesSchedule [schedule params]
  (stripe-request :post (str "v1/subscription_schedules/" schedule "") params))

(defn GetPaymentMethods [ params]
  (stripe-request :get (str "v1/payment_methods") params))

(defn PostPaymentMethods [ params]
  (stripe-request :post (str "v1/payment_methods") params))

(defn GetCustomersCustomerCashBalance [customer params]
  (stripe-request :get (str "v1/customers/" customer "/cash_balance") params))

(defn PostCustomersCustomerCashBalance [customer params]
  (stripe-request :post (str "v1/customers/" customer "/cash_balance") params))

(defn DeleteCustomersCustomerTaxIdsId [customer id params]
  (stripe-request :delete (str "v1/customers/" customer "/tax_ids/" id "") params))

(defn GetCustomersCustomerTaxIdsId [customer id params]
  (stripe-request :get (str "v1/customers/" customer "/tax_ids/" id "") params))

(defn GetSourcesSourceSourceTransactions [source params]
  (stripe-request :get (str "v1/sources/" source "/source_transactions") params))

(defn GetFinancialConnectionsSessionsSession [session params]
  (stripe-request :get (str "v1/financial_connections/sessions/" session "") params))

(defn DeleteInvoiceitemsInvoiceitem [invoiceitem params]
  (stripe-request :delete (str "v1/invoiceitems/" invoiceitem "") params))

(defn GetInvoiceitemsInvoiceitem [invoiceitem params]
  (stripe-request :get (str "v1/invoiceitems/" invoiceitem "") params))

(defn PostInvoiceitemsInvoiceitem [invoiceitem params]
  (stripe-request :post (str "v1/invoiceitems/" invoiceitem "") params))

(defn PostTerminalReadersReaderCancelAction [reader params]
  (stripe-request :post (str "v1/terminal/readers/" reader "/cancel_action") params))

(defn GetInvoices [ params]
  (stripe-request :get (str "v1/invoices") params))

(defn PostInvoices [ params]
  (stripe-request :post (str "v1/invoices") params))

(defn GetAccountsAccountCapabilitiesCapability [account capability params]
  (stripe-request :get (str "v1/accounts/" account "/capabilities/" capability "") params))

(defn PostAccountsAccountCapabilitiesCapability [account capability params]
  (stripe-request :post (str "v1/accounts/" account "/capabilities/" capability "") params))

(defn PostTestHelpersTestClocksTestClockAdvance [test_clock params]
  (stripe-request :post (str "v1/test_helpers/test_clocks/" test_clock "/advance") params))

(defn GetAccountsAccountCapabilities [account params]
  (stripe-request :get (str "v1/accounts/" account "/capabilities") params))

(defn PostBillingCreditGrantsIdVoid [id params]
  (stripe-request :post (str "v1/billing/credit_grants/" id "/void") params))

(defn GetSigmaScheduledQueryRunsScheduledQueryRun [scheduled_query_run params]
  (stripe-request :get (str "v1/sigma/scheduled_query_runs/" scheduled_query_run "") params))

(defn GetTopupsTopup [topup params]
  (stripe-request :get (str "v1/topups/" topup "") params))

(defn PostTopupsTopup [topup params]
  (stripe-request :post (str "v1/topups/" topup "") params))

(defn PostTestHelpersTreasuryInboundTransfersIdReturn [id params]
  (stripe-request :post (str "v1/test_helpers/treasury/inbound_transfers/" id "/return") params))

(defn GetTreasuryReceivedCredits [ params]
  (stripe-request :get (str "v1/treasury/received_credits") params))

(defn GetTaxCalculationsCalculation [calculation params]
  (stripe-request :get (str "v1/tax/calculations/" calculation "") params))

(defn PostQuotesQuoteCancel [quote params]
  (stripe-request :post (str "v1/quotes/" quote "/cancel") params))

(defn GetIssuingPhysicalBundles [ params]
  (stripe-request :get (str "v1/issuing/physical_bundles") params))

(defn PostTestHelpersTreasuryOutboundTransfersOutboundTransfer [outbound_transfer params]
  (stripe-request :post (str "v1/test_helpers/treasury/outbound_transfers/" outbound_transfer "") params))

(defn PostSubscriptionItemsSubscriptionItemUsageRecords [subscription_item params]
  (stripe-request :post (str "v1/subscription_items/" subscription_item "/usage_records") params))

(defn PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivate [personalization_design params]
  (stripe-request :post (str "v1/test_helpers/issuing/personalization_designs/" personalization_design "/activate") params))

(defn DeleteEphemeralKeysKey [key params]
  (stripe-request :delete (str "v1/ephemeral_keys/" key "") params))

(defn GetQuotesQuote [quote params]
  (stripe-request :get (str "v1/quotes/" quote "") params))

(defn PostQuotesQuote [quote params]
  (stripe-request :post (str "v1/quotes/" quote "") params))

(defn GetSubscriptionsSearch [ params]
  (stripe-request :get (str "v1/subscriptions/search") params))

(defn PostFinancialConnectionsAccountsAccountSubscribe [account params]
  (stripe-request :post (str "v1/financial_connections/accounts/" account "/subscribe") params))

(defn PostPaymentIntentsIntentCancel [intent params]
  (stripe-request :post (str "v1/payment_intents/" intent "/cancel") params))

(defn GetAccount [ params]
  (stripe-request :get (str "v1/account") params))

(defn GetPaymentLinksPaymentLinkLineItems [payment_link params]
  (stripe-request :get (str "v1/payment_links/" payment_link "/line_items") params))

(defn GetTreasuryInboundTransfers [ params]
  (stripe-request :get (str "v1/treasury/inbound_transfers") params))

(defn PostTreasuryInboundTransfers [ params]
  (stripe-request :post (str "v1/treasury/inbound_transfers") params))

(defn GetTransfersTransfer [transfer params]
  (stripe-request :get (str "v1/transfers/" transfer "") params))

(defn PostTransfersTransfer [transfer params]
  (stripe-request :post (str "v1/transfers/" transfer "") params))

(defn GetPaymentIntentsSearch [ params]
  (stripe-request :get (str "v1/payment_intents/search") params))

(defn GetBillingCreditGrantsId [id params]
  (stripe-request :get (str "v1/billing/credit_grants/" id "") params))

(defn PostBillingCreditGrantsId [id params]
  (stripe-request :post (str "v1/billing/credit_grants/" id "") params))

(defn PostSetupIntentsIntentConfirm [intent params]
  (stripe-request :post (str "v1/setup_intents/" intent "/confirm") params))

(defn DeleteCustomersCustomer [customer params]
  (stripe-request :delete (str "v1/customers/" customer "") params))

(defn GetCustomersCustomer [customer params]
  (stripe-request :get (str "v1/customers/" customer "") params))

(defn PostCustomersCustomer [customer params]
  (stripe-request :post (str "v1/customers/" customer "") params))

(defn GetChargesCharge [charge params]
  (stripe-request :get (str "v1/charges/" charge "") params))

(defn PostChargesCharge [charge params]
  (stripe-request :post (str "v1/charges/" charge "") params))

(defn DeleteProductsProductFeaturesId [product id params]
  (stripe-request :delete (str "v1/products/" product "/features/" id "") params))

(defn GetProductsProductFeaturesId [product id params]
  (stripe-request :get (str "v1/products/" product "/features/" id "") params))

(defn DeleteWebhookEndpointsWebhookEndpoint [webhook_endpoint params]
  (stripe-request :delete (str "v1/webhook_endpoints/" webhook_endpoint "") params))

(defn GetWebhookEndpointsWebhookEndpoint [webhook_endpoint params]
  (stripe-request :get (str "v1/webhook_endpoints/" webhook_endpoint "") params))

(defn PostWebhookEndpointsWebhookEndpoint [webhook_endpoint params]
  (stripe-request :post (str "v1/webhook_endpoints/" webhook_endpoint "") params))

(defn GetFileLinksLink [link params]
  (stripe-request :get (str "v1/file_links/" link "") params))

(defn PostFileLinksLink [link params]
  (stripe-request :post (str "v1/file_links/" link "") params))

(defn PostPayoutsPayoutReverse [payout params]
  (stripe-request :post (str "v1/payouts/" payout "/reverse") params))

(defn GetCreditNotesPreview [ params]
  (stripe-request :get (str "v1/credit_notes/preview") params))

(defn PostPaymentMethodsPaymentMethodAttach [payment_method params]
  (stripe-request :post (str "v1/payment_methods/" payment_method "/attach") params))

(defn DeleteCustomersCustomerCardsId [customer id params]
  (stripe-request :delete (str "v1/customers/" customer "/cards/" id "") params))

(defn GetCustomersCustomerCardsId [customer id params]
  (stripe-request :get (str "v1/customers/" customer "/cards/" id "") params))

(defn PostCustomersCustomerCardsId [customer id params]
  (stripe-request :post (str "v1/customers/" customer "/cards/" id "") params))

(defn GetInvoiceitems [ params]
  (stripe-request :get (str "v1/invoiceitems") params))

(defn PostInvoiceitems [ params]
  (stripe-request :post (str "v1/invoiceitems") params))

(defn PostTestHelpersIssuingSettlements [ params]
  (stripe-request :post (str "v1/test_helpers/issuing/settlements") params))

(defn GetPaymentLinks [ params]
  (stripe-request :get (str "v1/payment_links") params))

(defn PostPaymentLinks [ params]
  (stripe-request :post (str "v1/payment_links") params))

(defn PostTestHelpersIssuingTransactionsCreateUnlinkedRefund [ params]
  (stripe-request :post (str "v1/test_helpers/issuing/transactions/create_unlinked_refund") params))

(defn PostTestHelpersIssuingAuthorizationsAuthorizationIncrement [authorization params]
  (stripe-request :post (str "v1/test_helpers/issuing/authorizations/" authorization "/increment") params))

(defn PostTestHelpersIssuingCardsCardShippingShip [card params]
  (stripe-request :post (str "v1/test_helpers/issuing/cards/" card "/shipping/ship") params))

(defn PostInvoicesInvoiceRemoveLines [invoice params]
  (stripe-request :post (str "v1/invoices/" invoice "/remove_lines") params))

(defn PostTestHelpersIssuingCardsCardShippingDeliver [card params]
  (stripe-request :post (str "v1/test_helpers/issuing/cards/" card "/shipping/deliver") params))

(defn GetIssuingCardsCard [card params]
  (stripe-request :get (str "v1/issuing/cards/" card "") params))

(defn PostIssuingCardsCard [card params]
  (stripe-request :post (str "v1/issuing/cards/" card "") params))

(defn PostCustomersCustomerSourcesIdVerify [customer id params]
  (stripe-request :post (str "v1/customers/" customer "/sources/" id "/verify") params))

(defn PostSubscriptionsSubscriptionResume [subscription params]
  (stripe-request :post (str "v1/subscriptions/" subscription "/resume") params))

(defn PostAccountsAccountBankAccounts [account params]
  (stripe-request :post (str "v1/accounts/" account "/bank_accounts") params))

(defn GetIssuingTransactions [ params]
  (stripe-request :get (str "v1/issuing/transactions") params))

(defn PostTestHelpersTerminalReadersReaderPresentPaymentMethod [reader params]
  (stripe-request :post (str "v1/test_helpers/terminal/readers/" reader "/present_payment_method") params))

(defn GetTreasuryCreditReversals [ params]
  (stripe-request :get (str "v1/treasury/credit_reversals") params))

(defn PostTreasuryCreditReversals [ params]
  (stripe-request :post (str "v1/treasury/credit_reversals") params))

(defn GetIssuingPersonalizationDesigns [ params]
  (stripe-request :get (str "v1/issuing/personalization_designs") params))

(defn PostIssuingPersonalizationDesigns [ params]
  (stripe-request :post (str "v1/issuing/personalization_designs") params))

(defn GetTerminalReaders [ params]
  (stripe-request :get (str "v1/terminal/readers") params))

(defn PostTerminalReaders [ params]
  (stripe-request :post (str "v1/terminal/readers") params))

(defn GetApplePayDomains [ params]
  (stripe-request :get (str "v1/apple_pay/domains") params))

(defn PostApplePayDomains [ params]
  (stripe-request :post (str "v1/apple_pay/domains") params))

(defn GetTaxCodesId [id params]
  (stripe-request :get (str "v1/tax_codes/" id "") params))

(defn GetBillingCreditBalanceTransactions [ params]
  (stripe-request :get (str "v1/billing/credit_balance_transactions") params))

(defn PostChargesChargeRefund [charge params]
  (stripe-request :post (str "v1/charges/" charge "/refund") params))

(defn GetIssuingPhysicalBundlesPhysicalBundle [physical_bundle params]
  (stripe-request :get (str "v1/issuing/physical_bundles/" physical_bundle "") params))

(defn GetTreasuryTransactionsId [id params]
  (stripe-request :get (str "v1/treasury/transactions/" id "") params))

(defn GetCustomersCustomerPaymentMethods [customer params]
  (stripe-request :get (str "v1/customers/" customer "/payment_methods") params))

(defn GetCustomers [ params]
  (stripe-request :get (str "v1/customers") params))

(defn PostCustomers [ params]
  (stripe-request :post (str "v1/customers") params))

(defn PostSetupIntentsIntentVerifyMicrodeposits [intent params]
  (stripe-request :post (str "v1/setup_intents/" intent "/verify_microdeposits") params))

(defn GetFinancialConnectionsAccounts [ params]
  (stripe-request :get (str "v1/financial_connections/accounts") params))

(defn GetCountrySpecs [ params]
  (stripe-request :get (str "v1/country_specs") params))

(defn GetChargesChargeRefundsRefund [charge refund params]
  (stripe-request :get (str "v1/charges/" charge "/refunds/" refund "") params))

(defn PostChargesChargeRefundsRefund [charge refund params]
  (stripe-request :post (str "v1/charges/" charge "/refunds/" refund "") params))

(defn DeleteCustomersCustomerDiscount [customer params]
  (stripe-request :delete (str "v1/customers/" customer "/discount") params))

(defn GetCustomersCustomerDiscount [customer params]
  (stripe-request :get (str "v1/customers/" customer "/discount") params))

(defn GetPaymentMethodsPaymentMethod [payment_method params]
  (stripe-request :get (str "v1/payment_methods/" payment_method "") params))

(defn PostPaymentMethodsPaymentMethod [payment_method params]
  (stripe-request :post (str "v1/payment_methods/" payment_method "") params))

(defn GetAccountsAccountExternalAccounts [account params]
  (stripe-request :get (str "v1/accounts/" account "/external_accounts") params))

(defn PostAccountsAccountExternalAccounts [account params]
  (stripe-request :post (str "v1/accounts/" account "/external_accounts") params))

(defn GetAppsSecretsFind [ params]
  (stripe-request :get (str "v1/apps/secrets/find") params))

(defn GetProductsProductFeatures [product params]
  (stripe-request :get (str "v1/products/" product "/features") params))

(defn PostProductsProductFeatures [product params]
  (stripe-request :post (str "v1/products/" product "/features") params))

(defn PostInvoiceRenderingTemplatesTemplateUnarchive [template params]
  (stripe-request :post (str "v1/invoice_rendering_templates/" template "/unarchive") params))

(defn PostPaymentIntentsIntentConfirm [intent params]
  (stripe-request :post (str "v1/payment_intents/" intent "/confirm") params))

(defn PostEphemeralKeys [ params]
  (stripe-request :post (str "v1/ephemeral_keys") params))

(defn GetTreasuryFinancialAccountsFinancialAccount [financial_account params]
  (stripe-request :get (str "v1/treasury/financial_accounts/" financial_account "") params))

(defn PostTreasuryFinancialAccountsFinancialAccount [financial_account params]
  (stripe-request :post (str "v1/treasury/financial_accounts/" financial_account "") params))

(defn PostPaymentIntentsIntentApplyCustomerBalance [intent params]
  (stripe-request :post (str "v1/payment_intents/" intent "/apply_customer_balance") params))

(defn GetInvoicesUpcoming [ params]
  (stripe-request :get (str "v1/invoices/upcoming") params))

(defn GetTerminalLocations [ params]
  (stripe-request :get (str "v1/terminal/locations") params))

(defn PostTerminalLocations [ params]
  (stripe-request :post (str "v1/terminal/locations") params))

(defn GetIssuingCardholdersCardholder [cardholder params]
  (stripe-request :get (str "v1/issuing/cardholders/" cardholder "") params))

(defn PostIssuingCardholdersCardholder [cardholder params]
  (stripe-request :post (str "v1/issuing/cardholders/" cardholder "") params))

(defn GetBillingMetersId [id params]
  (stripe-request :get (str "v1/billing/meters/" id "") params))

(defn PostBillingMetersId [id params]
  (stripe-request :post (str "v1/billing/meters/" id "") params))

(defn GetPayouts [ params]
  (stripe-request :get (str "v1/payouts") params))

(defn PostPayouts [ params]
  (stripe-request :post (str "v1/payouts") params))

(defn GetTreasuryDebitReversals [ params]
  (stripe-request :get (str "v1/treasury/debit_reversals") params))

(defn PostTreasuryDebitReversals [ params]
  (stripe-request :post (str "v1/treasury/debit_reversals") params))

(defn GetQuotesQuotePdf [quote params]
  (stripe-request :get (str "v1/quotes/" quote "/pdf") params))

(defn GetSetupIntents [ params]
  (stripe-request :get (str "v1/setup_intents") params))

(defn PostSetupIntents [ params]
  (stripe-request :post (str "v1/setup_intents") params))

(defn GetIdentityVerificationSessionsSession [session params]
  (stripe-request :get (str "v1/identity/verification_sessions/" session "") params))

(defn PostIdentityVerificationSessionsSession [session params]
  (stripe-request :post (str "v1/identity/verification_sessions/" session "") params))

(defn PostCheckoutSessionsSessionExpire [session params]
  (stripe-request :post (str "v1/checkout/sessions/" session "/expire") params))

(defn GetPaymentIntents [ params]
  (stripe-request :get (str "v1/payment_intents") params))

(defn PostPaymentIntents [ params]
  (stripe-request :post (str "v1/payment_intents") params))

(defn PostApplicationFeesIdRefund [id params]
  (stripe-request :post (str "v1/application_fees/" id "/refund") params))

(defn DeleteAccountsAccountExternalAccountsId [account id params]
  (stripe-request :delete (str "v1/accounts/" account "/external_accounts/" id "") params))

(defn GetAccountsAccountExternalAccountsId [account id params]
  (stripe-request :get (str "v1/accounts/" account "/external_accounts/" id "") params))

(defn PostAccountsAccountExternalAccountsId [account id params]
  (stripe-request :post (str "v1/accounts/" account "/external_accounts/" id "") params))

(defn DeleteInvoicesInvoice [invoice params]
  (stripe-request :delete (str "v1/invoices/" invoice "") params))

(defn GetInvoicesInvoice [invoice params]
  (stripe-request :get (str "v1/invoices/" invoice "") params))

(defn PostInvoicesInvoice [invoice params]
  (stripe-request :post (str "v1/invoices/" invoice "") params))

(defn GetTestHelpersTestClocks [ params]
  (stripe-request :get (str "v1/test_helpers/test_clocks") params))

(defn PostTestHelpersTestClocks [ params]
  (stripe-request :post (str "v1/test_helpers/test_clocks") params))

(defn PostTestHelpersIssuingTransactionsCreateForceCapture [ params]
  (stripe-request :post (str "v1/test_helpers/issuing/transactions/create_force_capture") params))

(defn PostTestHelpersTreasuryOutboundPaymentsId [id params]
  (stripe-request :post (str "v1/test_helpers/treasury/outbound_payments/" id "") params))

(defn PostIssuingAuthorizationsAuthorizationApprove [authorization params]
  (stripe-request :post (str "v1/issuing/authorizations/" authorization "/approve") params))

(defn PostInvoicesInvoicePay [invoice params]
  (stripe-request :post (str "v1/invoices/" invoice "/pay") params))

(defn GetClimateSuppliersSupplier [supplier params]
  (stripe-request :get (str "v1/climate/suppliers/" supplier "") params))

(defn GetIssuingSettlementsSettlement [settlement params]
  (stripe-request :get (str "v1/issuing/settlements/" settlement "") params))

(defn PostIssuingSettlementsSettlement [settlement params]
  (stripe-request :post (str "v1/issuing/settlements/" settlement "") params))

(defn GetRefunds [ params]
  (stripe-request :get (str "v1/refunds") params))

(defn PostRefunds [ params]
  (stripe-request :post (str "v1/refunds") params))

(defn PostBillingMeterEvents [ params]
  (stripe-request :post (str "v1/billing/meter_events") params))

(defn GetSubscriptions [ params]
  (stripe-request :get (str "v1/subscriptions") params))

(defn PostSubscriptions [ params]
  (stripe-request :post (str "v1/subscriptions") params))

(defn DeleteProductsId [id params]
  (stripe-request :delete (str "v1/products/" id "") params))

(defn GetProductsId [id params]
  (stripe-request :get (str "v1/products/" id "") params))

(defn PostProductsId [id params]
  (stripe-request :post (str "v1/products/" id "") params))

(defn GetIssuingTokensToken [token params]
  (stripe-request :get (str "v1/issuing/tokens/" token "") params))

(defn PostIssuingTokensToken [token params]
  (stripe-request :post (str "v1/issuing/tokens/" token "") params))

(defn GetShippingRates [ params]
  (stripe-request :get (str "v1/shipping_rates") params))

(defn PostShippingRates [ params]
  (stripe-request :post (str "v1/shipping_rates") params))

(defn PostTestHelpersIssuingCardsCardShippingSubmit [card params]
  (stripe-request :post (str "v1/test_helpers/issuing/cards/" card "/shipping/submit") params))

(defn PostAccountsAccountReject [account params]
  (stripe-request :post (str "v1/accounts/" account "/reject") params))

(defn GetFileLinks [ params]
  (stripe-request :get (str "v1/file_links") params))

(defn PostFileLinks [ params]
  (stripe-request :post (str "v1/file_links") params))

(defn GetTaxRates [ params]
  (stripe-request :get (str "v1/tax_rates") params))

(defn PostTaxRates [ params]
  (stripe-request :post (str "v1/tax_rates") params))

(defn PostSubscriptionSchedulesScheduleCancel [schedule params]
  (stripe-request :post (str "v1/subscription_schedules/" schedule "/cancel") params))

(defn GetRadarEarlyFraudWarningsEarlyFraudWarning [early_fraud_warning params]
  (stripe-request :get (str "v1/radar/early_fraud_warnings/" early_fraud_warning "") params))

(defn PostSources [ params]
  (stripe-request :post (str "v1/sources") params))

(defn PostTerminalConnectionTokens [ params]
  (stripe-request :post (str "v1/terminal/connection_tokens") params))