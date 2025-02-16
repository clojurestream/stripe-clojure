(ns stream.clojure.stripe.api.application-fees
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-application-fees-id-refunds
  "List all application fee refunds

  HTTP Method: GET
  Endpoint: /v1/application_fees/{application-fee-id}/refunds

  Path Parameters:
    - application-fee-id (String): The application-fee-id parameter. (required)

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-application-fees-id-refunds {:application-fee-id example-application-fee-id :query-params {:limit 10}})"
  [{:keys [application-fee-id query-params]}]
  (stripe-request :get {:endpoint "/v1/application_fees/{application-fee-id}/refunds" :path-params {:application-fee-id application-fee-id} :query-params query-params}))

(defn create-application-fees-id-refunds
  "Create an application fee refund

  HTTP Method: POST
  Endpoint: /v1/application_fees/{application-fee-id}/refunds

  Path Parameters:
    - application-fee-id (String): The application-fee-id parameter. (required)

  Example Usage:
    (create-application-fees-id-refunds {:application-fee-id example-application-fee-id})"
  [{:keys [application-fee-id]}]
  (stripe-request :post {:endpoint "/v1/application_fees/{application-fee-id}/refunds" :path-params {:application-fee-id application-fee-id}}))

(defn list-all-application-fees
  "List all application fees

  HTTP Method: GET
  Endpoint: /v1/application_fees

  Query Parameters:
    - charge (String): Only return application fees for the charge specified by this charge ID.
    - created (Unknown): Only return applications fees that were created during the given date interval.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-application-fees {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/application_fees" :query-params query-params}))

(defn retrieve-application-fees-fee-refunds-id
  "Retrieve an application fee refund

  HTTP Method: GET
  Endpoint: /v1/application_fees/{application-fee-id}/refunds/{refund-id}

  Path Parameters:
    - application-fee-id (String): The application-fee-id parameter. (required)
    - refund-id (String): The refund-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-application-fees-fee-refunds-id {:application-fee-id example-application-fee-id :refund-id example-refund-id :query-params {:limit 10}})"
  [{:keys [application-fee-id refund-id query-params]}]
  (stripe-request :get {:endpoint "/v1/application_fees/{application-fee-id}/refunds/{refund-id}" :path-params {:application-fee-id application-fee-id :refund-id refund-id} :query-params query-params}))

(defn update-application-fees-fee-refunds-id
  "Update an application fee refund

  HTTP Method: POST
  Endpoint: /v1/application_fees/{application-fee-id}/refunds/{refund-id}

  Path Parameters:
    - application-fee-id (String): The application-fee-id parameter. (required)
    - refund-id (String): The refund-id parameter. (required)

  Example Usage:
    (update-application-fees-fee-refunds-id {:application-fee-id example-application-fee-id :refund-id example-refund-id})"
  [{:keys [application-fee-id refund-id]}]
  (stripe-request :post {:endpoint "/v1/application_fees/{application-fee-id}/refunds/{refund-id}" :path-params {:application-fee-id application-fee-id :refund-id refund-id}}))

(defn retrieve-application-fees-id
  "Retrieve an application fee

  HTTP Method: GET
  Endpoint: /v1/application_fees/{application-fee-id}

  Path Parameters:
    - application-fee-id (String): The application-fee-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-application-fees-id {:application-fee-id example-application-fee-id :query-params {:limit 10}})"
  [{:keys [application-fee-id query-params]}]
  (stripe-request :get {:endpoint "/v1/application_fees/{application-fee-id}" :path-params {:application-fee-id application-fee-id} :query-params query-params}))

(defn post-application-fees-id-refund
  "No description available.

  HTTP Method: POST
  Endpoint: /v1/application_fees/{application-fee-id}/refund

  Path Parameters:
    - application-fee-id (String): The application-fee-id parameter. (required)

  Example Usage:
    (post-application-fees-id-refund {:application-fee-id example-application-fee-id})"
  [{:keys [application-fee-id]}]
  (stripe-request :post {:endpoint "/v1/application_fees/{application-fee-id}/refund" :path-params {:application-fee-id application-fee-id}}))