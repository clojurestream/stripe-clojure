(ns stream.clojure.stripe.api.country-specs
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-country-specs-country
  "Retrieve a Country Spec

  HTTP Method: GET
  Endpoint: /v1/country_specs/{country-spec-id}

  Path Parameters:
    - country-spec-id (String): The country-spec-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-country-specs-country {:country-spec-id example-country-spec-id :query-params {:limit 10}})"
  [{:keys [country-spec-id query-params]}]
  (stripe-request :get {:endpoint "/v1/country_specs/{country-spec-id}" :path-params {:country-spec-id country-spec-id} :query-params query-params}))

(defn list-all-country-specs
  "List Country Specs

  HTTP Method: GET
  Endpoint: /v1/country_specs

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-country-specs {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/country_specs" :query-params query-params}))