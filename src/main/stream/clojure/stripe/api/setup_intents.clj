(ns stream.clojure.stripe.api.setup-intents
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-setup-intents-intent-cancel [{:keys [setup-intent-id]}]
  "Cancel a SetupIntent

  HTTP Method: POST
  Endpoint: /v1/setup_intents/{setup-intent-id}/cancel

  Path Parameters:
    - setup-intent-id: The setup-intent-id parameter. (required) [type: string]

  Example Usage:
    (post-setup-intents-intent-cancel {:setup-intent-id example-setup-intent-id})"
  (stripe-request :post {:endpoint "/v1/setup_intents/{setup-intent-id}/cancel" :path-params {:setup-intent-id setup-intent-id}}))

(defn retrieve-setup-intents-intent [{:keys [setup-intent-id query-params]}]
  "Retrieve a SetupIntent

  HTTP Method: GET
  Endpoint: /v1/setup_intents/{setup-intent-id}

  Path Parameters:
    - setup-intent-id: The setup-intent-id parameter. (required) [type: string]

  Query Parameters:
    - client-secret: The client secret of the SetupIntent. We require this string if you use a publishable key to retrieve the SetupIntent. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-setup-intents-intent {:setup-intent-id example-setup-intent-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/setup_intents/{setup-intent-id}" :path-params {:setup-intent-id setup-intent-id} :query-params query-params}))

(defn update-setup-intents-intent [{:keys [setup-intent-id]}]
  "Update a SetupIntent

  HTTP Method: POST
  Endpoint: /v1/setup_intents/{setup-intent-id}

  Path Parameters:
    - setup-intent-id: The setup-intent-id parameter. (required) [type: string]

  Example Usage:
    (update-setup-intents-intent {:setup-intent-id example-setup-intent-id})"
  (stripe-request :post {:endpoint "/v1/setup_intents/{setup-intent-id}" :path-params {:setup-intent-id setup-intent-id}}))

(defn post-setup-intents-intent-confirm [{:keys [setup-intent-id]}]
  "Confirm a SetupIntent

  HTTP Method: POST
  Endpoint: /v1/setup_intents/{setup-intent-id}/confirm

  Path Parameters:
    - setup-intent-id: The setup-intent-id parameter. (required) [type: string]

  Example Usage:
    (post-setup-intents-intent-confirm {:setup-intent-id example-setup-intent-id})"
  (stripe-request :post {:endpoint "/v1/setup_intents/{setup-intent-id}/confirm" :path-params {:setup-intent-id setup-intent-id}}))

(defn post-setup-intents-intent-verify-microdeposits [{:keys [setup-intent-id]}]
  "Verify microdeposits on a SetupIntent

  HTTP Method: POST
  Endpoint: /v1/setup_intents/{setup-intent-id}/verify_microdeposits

  Path Parameters:
    - setup-intent-id: The setup-intent-id parameter. (required) [type: string]

  Example Usage:
    (post-setup-intents-intent-verify-microdeposits {:setup-intent-id example-setup-intent-id})"
  (stripe-request :post {:endpoint "/v1/setup_intents/{setup-intent-id}/verify_microdeposits" :path-params {:setup-intent-id setup-intent-id}}))

(defn list-all-setup-intents [{:keys [query-params]}]
  "List all SetupIntents

  HTTP Method: GET
  Endpoint: /v1/setup_intents

  Query Parameters:
    - attach-to-self: If present, the SetupIntent's payment method will be attached to the in-context Stripe Account.

It can only be used for this Stripe Account’s own money movement flows like InboundTransfer and OutboundTransfers. It cannot be set to true when setting up a PaymentMethod for a Customer, and defaults to false when attaching a PaymentMethod to a Customer. [type: boolean]
    - created: A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options. [type: unknown]
    - customer: Only return SetupIntents for the customer specified by this customer ID. [type: string]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - payment-method: Only return SetupIntents that associate with the specified payment method. [type: string]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-setup-intents {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/setup_intents" :query-params query-params}))

(defn create-setup-intents [{:keys []}]
  "Create a SetupIntent

  HTTP Method: POST
  Endpoint: /v1/setup_intents

  Example Usage:
    (create-setup-intents {})"
  (stripe-request :post {:endpoint "/v1/setup_intents"}))