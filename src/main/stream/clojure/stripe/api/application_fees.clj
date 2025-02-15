(ns stream.clojure.stripe.api.application-fees
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-application-fees-id-refunds [{:keys [application-fee-id query-params]}]
  "List all application fee refunds

  HTTP Method: GET
  Endpoint: /v1/application_fees/{application-fee-id}/refunds

  Path Parameters:
    - application-fee-id: The application-fee-id parameter. (required) [type: string]

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-application-fees-id-refunds {:application-fee-id example-application-fee-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/application_fees/{application-fee-id}/refunds" :path-params {:application-fee-id application-fee-id} :query-params query-params}))

(defn create-application-fees-id-refunds [{:keys [application-fee-id]}]
  "Create an application fee refund

  HTTP Method: POST
  Endpoint: /v1/application_fees/{application-fee-id}/refunds

  Path Parameters:
    - application-fee-id: The application-fee-id parameter. (required) [type: string]

  Example Usage:
    (create-application-fees-id-refunds {:application-fee-id example-application-fee-id})"
  (stripe-request :post {:endpoint "/v1/application_fees/{application-fee-id}/refunds" :path-params {:application-fee-id application-fee-id}}))

(defn list-all-application-fees [{:keys [query-params]}]
  "List all application fees

  HTTP Method: GET
  Endpoint: /v1/application_fees

  Query Parameters:
    - charge: Only return application fees for the charge specified by this charge ID. [type: string]
    - created: Only return applications fees that were created during the given date interval. [type: unknown]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-application-fees {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/application_fees" :query-params query-params}))

(defn retrieve-application-fees-fee-refunds-id [{:keys [application-fee-id refund-id query-params]}]
  "Retrieve an application fee refund

  HTTP Method: GET
  Endpoint: /v1/application_fees/{application-fee-id}/refunds/{refund-id}

  Path Parameters:
    - application-fee-id: The application-fee-id parameter. (required) [type: string]
    - refund-id: The refund-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-application-fees-fee-refunds-id {:application-fee-id example-application-fee-id :refund-id example-refund-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/application_fees/{application-fee-id}/refunds/{refund-id}" :path-params {:application-fee-id application-fee-id :refund-id refund-id} :query-params query-params}))

(defn update-application-fees-fee-refunds-id [{:keys [application-fee-id refund-id]}]
  "Update an application fee refund

  HTTP Method: POST
  Endpoint: /v1/application_fees/{application-fee-id}/refunds/{refund-id}

  Path Parameters:
    - application-fee-id: The application-fee-id parameter. (required) [type: string]
    - refund-id: The refund-id parameter. (required) [type: string]

  Example Usage:
    (update-application-fees-fee-refunds-id {:application-fee-id example-application-fee-id :refund-id example-refund-id})"
  (stripe-request :post {:endpoint "/v1/application_fees/{application-fee-id}/refunds/{refund-id}" :path-params {:application-fee-id application-fee-id :refund-id refund-id}}))

(defn retrieve-application-fees-id [{:keys [application-fee-id query-params]}]
  "Retrieve an application fee

  HTTP Method: GET
  Endpoint: /v1/application_fees/{application-fee-id}

  Path Parameters:
    - application-fee-id: The application-fee-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-application-fees-id {:application-fee-id example-application-fee-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/application_fees/{application-fee-id}" :path-params {:application-fee-id application-fee-id} :query-params query-params}))

(defn post-application-fees-id-refund [{:keys [application-fee-id]}]
  "No description available.

  HTTP Method: POST
  Endpoint: /v1/application_fees/{application-fee-id}/refund

  Path Parameters:
    - application-fee-id: The application-fee-id parameter. (required) [type: string]

  Example Usage:
    (post-application-fees-id-refund {:application-fee-id example-application-fee-id})"
  (stripe-request :post {:endpoint "/v1/application_fees/{application-fee-id}/refund" :path-params {:application-fee-id application-fee-id}}))