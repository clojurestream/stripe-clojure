(ns stream.clojure.stripe.api.exchange-rates
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-exchange-rates-rate-id [{:keys [exchange-rate-id query-params]}]
  "Retrieve an exchange rate

  HTTP Method: GET
  Endpoint: /v1/exchange_rates/{exchange-rate-id}

  Path Parameters:
    - exchange-rate-id: The exchange-rate-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-exchange-rates-rate-id {:exchange-rate-id example-exchange-rate-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/exchange_rates/{exchange-rate-id}" :path-params {:exchange-rate-id exchange-rate-id} :query-params query-params}))

(defn list-all-exchange-rates [{:keys [query-params]}]
  "List all exchange rates

  HTTP Method: GET
  Endpoint: /v1/exchange_rates

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is the currency that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with the exchange rate for currency X your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and total number of supported payout currencies, and the default is the max. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is the currency that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with the exchange rate for currency X, your subsequent call can include `starting_after=X` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-exchange-rates {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/exchange_rates" :query-params query-params}))