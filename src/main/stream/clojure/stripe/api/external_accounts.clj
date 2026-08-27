(ns stream.clojure.stripe.api.external-accounts
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn update-external-accounts-id
  "Update a bank account

  HTTP Method: POST
  Endpoint: /v1/external_accounts/{external-account-id}

  Path Parameters:
    - external-account-id (String): The external-account-id parameter. (required)

  Example Usage:
    (update-external-accounts-id {:external-account-id example-external-account-id})"
  [{:keys [external-account-id body]}]
  (stripe-request :post {:endpoint "/v1/external_accounts/{external-account-id}" :path-params {:external-account-id external-account-id} :body body}))