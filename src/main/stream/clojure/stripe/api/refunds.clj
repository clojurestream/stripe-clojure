(ns stream.clojure.stripe.api.refunds
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-refund-cancel
  "Cancel a refund

  HTTP Method: POST
  Endpoint: /v1/refunds/{refund-id}/cancel

  Path Parameters:
    - refund-id (String): The refund-id parameter. (required)

  Example Usage:
    (post-refund-cancel {:refund-id example-refund-id})"
  [{:keys [refund-id body]}]
  (stripe-request :post {:endpoint "/v1/refunds/{refund-id}/cancel" :path-params {:refund-id refund-id} :body body}))

(defn retrieve-refund
  "Retrieve a refund

  HTTP Method: GET
  Endpoint: /v1/refunds/{refund-id}

  Path Parameters:
    - refund-id (String): The refund-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-refund {:refund-id example-refund-id :query-params {:limit 10}})"
  [{:keys [refund-id query-params]}]
  (stripe-request :get {:endpoint "/v1/refunds/{refund-id}" :path-params {:refund-id refund-id} :query-params query-params}))

(defn update-refund
  "Update a refund

  HTTP Method: POST
  Endpoint: /v1/refunds/{refund-id}

  Path Parameters:
    - refund-id (String): The refund-id parameter. (required)

  Example Usage:
    (update-refund {:refund-id example-refund-id})"
  [{:keys [refund-id body]}]
  (stripe-request :post {:endpoint "/v1/refunds/{refund-id}" :path-params {:refund-id refund-id} :body body}))

(defn list-all
  "List all refunds

  HTTP Method: GET
  Endpoint: /v1/refunds

  Query Parameters:
    - charge (String): Only return refunds for the charge specified by this charge ID.
    - created (Unknown): Only return refunds that were created during the given date interval.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - payment-intent (String): Only return refunds for the PaymentIntent specified by this ID.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/refunds" :query-params query-params}))

(defn create
  "Create customer balance refund

  HTTP Method: POST
  Endpoint: /v1/refunds

  Example Usage:
    (create {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/refunds" :body body}))