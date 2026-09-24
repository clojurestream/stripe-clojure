(ns stream.clojure.stripe.api.product-catalog
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-product-catalog-trial-offers-id
  "Retrieve a trial offer

  HTTP Method: GET
  Endpoint: /v1/product_catalog/trial_offers/{trial-offer-id}

  Path Parameters:
    - trial-offer-id (String): The trial-offer-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-product-catalog-trial-offers-id {:trial-offer-id example-trial-offer-id :query-params {:limit 10}})"
  [{:keys [trial-offer-id query-params]}]
  (stripe-request :get {:endpoint "/v1/product_catalog/trial_offers/{trial-offer-id}" :path-params {:trial-offer-id trial-offer-id} :query-params query-params}))

(defn update-product-catalog-trial-offers-id
  "Update a trial offer

  HTTP Method: POST
  Endpoint: /v1/product_catalog/trial_offers/{trial-offer-id}

  Path Parameters:
    - trial-offer-id (String): The trial-offer-id parameter. (required)

  Example Usage:
    (update-product-catalog-trial-offers-id {:trial-offer-id example-trial-offer-id})"
  [{:keys [trial-offer-id body]}]
  (stripe-request :post {:endpoint "/v1/product_catalog/trial_offers/{trial-offer-id}" :path-params {:trial-offer-id trial-offer-id} :body body}))

(defn list-all-product-catalog-trial-offers
  "List trial offers

  HTTP Method: GET
  Endpoint: /v1/product_catalog/trial_offers

  Query Parameters:
    - active (Boolean): Only return trial offers that are active (`true`) or archived (`false`). If omitted, both active and archived trial offers are returned.
    - created (Unknown): Only return trial offers that were created during the given date interval.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - prices (Array): Only return trial offers that reference these prices (during the trial period).
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-product-catalog-trial-offers {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/product_catalog/trial_offers" :query-params query-params}))

(defn create-product-catalog-trial-offers
  "Create a trial offer

  HTTP Method: POST
  Endpoint: /v1/product_catalog/trial_offers

  Example Usage:
    (create-product-catalog-trial-offers {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/product_catalog/trial_offers" :body body}))