(ns stream.clojure.stripe.api.shipping-rates
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-shipping-rates-shipping-rate-token
  "Retrieve a shipping rate

  HTTP Method: GET
  Endpoint: /v1/shipping_rates/{shipping-rate-id}

  Path Parameters:
    - shipping-rate-id (String): The shipping-rate-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-shipping-rates-shipping-rate-token {:shipping-rate-id example-shipping-rate-id :query-params {:limit 10}})"
  [{:keys [shipping-rate-id query-params]}]
  (stripe-request :get {:endpoint "/v1/shipping_rates/{shipping-rate-id}" :path-params {:shipping-rate-id shipping-rate-id} :query-params query-params}))

(defn update-shipping-rates-shipping-rate-token
  "Update a shipping rate

  HTTP Method: POST
  Endpoint: /v1/shipping_rates/{shipping-rate-id}

  Path Parameters:
    - shipping-rate-id (String): The shipping-rate-id parameter. (required)

  Example Usage:
    (update-shipping-rates-shipping-rate-token {:shipping-rate-id example-shipping-rate-id})"
  [{:keys [shipping-rate-id body]}]
  (stripe-request :post {:endpoint "/v1/shipping_rates/{shipping-rate-id}" :path-params {:shipping-rate-id shipping-rate-id} :body body}))

(defn list-all-shipping-rates
  "List all shipping rates

  HTTP Method: GET
  Endpoint: /v1/shipping_rates

  Query Parameters:
    - active (Boolean): Only return shipping rates that are active or inactive.
    - created (Unknown): A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options.
    - currency (String): Only return shipping rates for the given currency.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-shipping-rates {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/shipping_rates" :query-params query-params}))

(defn create-shipping-rates
  "Create a shipping rate

  HTTP Method: POST
  Endpoint: /v1/shipping_rates

  Example Usage:
    (create-shipping-rates {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/shipping_rates" :body body}))