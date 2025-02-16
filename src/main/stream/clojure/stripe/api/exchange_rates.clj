(ns stream.clojure.stripe.api.exchange-rates
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-exchange-rates-rate-id
  "Retrieve an exchange rate

  HTTP Method: GET
  Endpoint: /v1/exchange_rates/{exchange-rate-id}

  Path Parameters:
    - exchange-rate-id (String): The exchange-rate-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-exchange-rates-rate-id {:exchange-rate-id example-exchange-rate-id :query-params {:limit 10}})"
  [{:keys [exchange-rate-id query-params]}]
  (stripe-request :get {:endpoint "/v1/exchange_rates/{exchange-rate-id}" :path-params {:exchange-rate-id exchange-rate-id} :query-params query-params}))

(defn list-all-exchange-rates
  "List all exchange rates

  HTTP Method: GET
  Endpoint: /v1/exchange_rates

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is the currency that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with the exchange rate for currency X your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and total number of supported payout currencies, and the default is the max.
    - starting-after (String): A cursor for use in pagination. `starting_after` is the currency that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with the exchange rate for currency X, your subsequent call can include `starting_after=X` in order to fetch the next page of the list.

  Example Usage:
    (list-all-exchange-rates {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/exchange_rates" :query-params query-params}))