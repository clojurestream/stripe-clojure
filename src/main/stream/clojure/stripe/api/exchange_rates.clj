(ns stream.clojure.stripe.api.exchange-rates
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-exchange-rates [rate_id params]
  """
  Retrieve an exchange rate

  HTTP Method: GET
  Endpoint: /v1/exchange_rates/{rate_id}

  Path Parameters:
    - rate_id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/exchange_rates/" rate_id "") params))

(defn retrieve-exchange-rates [params]
  """
  List all exchange rates

  HTTP Method: GET
  Endpoint: /v1/exchange_rates

  Query Parameters:
    - ending_before: A cursor for use in pagination. `ending_before` is the currency that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with the exchange rate for currency X your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and total number of supported payout currencies, and the default is the max.
    - starting_after: A cursor for use in pagination. `starting_after` is the currency that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with the exchange rate for currency X, your subsequent call can include `starting_after=X` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/exchange_rates") params))