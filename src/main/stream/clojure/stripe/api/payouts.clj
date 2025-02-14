(ns stream.clojure.stripe.api.payouts
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-payouts-payout-cancel [payout params]
  """
  Cancel a payout

  HTTP Method: POST
  Endpoint: /v1/payouts/{payout}/cancel

  Path Parameters:
    - payout: Path parameter.

  """
  (stripe-request :post "/v1/payouts/" payout "/cancel" params))

(defn get-payouts-payout [payout params]
  """
  Retrieve a payout

  HTTP Method: GET
  Endpoint: /v1/payouts/{payout}

  Path Parameters:
    - payout: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/payouts/" payout "" params))

(defn post-payouts-payout [payout params]
  """
  Update a payout

  HTTP Method: POST
  Endpoint: /v1/payouts/{payout}

  Path Parameters:
    - payout: Path parameter.

  """
  (stripe-request :post "/v1/payouts/" payout "" params))

(defn post-payouts-payout-reverse [payout params]
  """
  Reverse a payout

  HTTP Method: POST
  Endpoint: /v1/payouts/{payout}/reverse

  Path Parameters:
    - payout: Path parameter.

  """
  (stripe-request :post "/v1/payouts/" payout "/reverse" params))

(defn get-payouts [params]
  """
  List all payouts

  HTTP Method: GET
  Endpoint: /v1/payouts

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
  (stripe-request :get "/v1/payouts" params))

(defn post-payouts [params]
  """
  Create a payout

  HTTP Method: POST
  Endpoint: /v1/payouts

  """
  (stripe-request :post "/v1/payouts" params))