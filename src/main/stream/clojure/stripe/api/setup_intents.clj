(ns stream.clojure.stripe.api.setup-intents
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-setup-intents-intent-cancel
  "Cancel a SetupIntent

  HTTP Method: POST
  Endpoint: /v1/setup_intents/{setup-intent-id}/cancel

  Path Parameters:
    - setup-intent-id (String): The setup-intent-id parameter. (required)

  Example Usage:
    (post-setup-intents-intent-cancel {:setup-intent-id example-setup-intent-id})"
  [{:keys [setup-intent-id]}]
  (stripe-request :post {:endpoint "/v1/setup_intents/{setup-intent-id}/cancel" :path-params {:setup-intent-id setup-intent-id}}))

(defn retrieve-setup-intents-intent
  "Retrieve a SetupIntent

  HTTP Method: GET
  Endpoint: /v1/setup_intents/{setup-intent-id}

  Path Parameters:
    - setup-intent-id (String): The setup-intent-id parameter. (required)

  Query Parameters:
    - client-secret (String): The client secret of the SetupIntent. We require this string if you use a publishable key to retrieve the SetupIntent.
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-setup-intents-intent {:setup-intent-id example-setup-intent-id :query-params {:limit 10}})"
  [{:keys [setup-intent-id query-params]}]
  (stripe-request :get {:endpoint "/v1/setup_intents/{setup-intent-id}" :path-params {:setup-intent-id setup-intent-id} :query-params query-params}))

(defn update-setup-intents-intent
  "Update a SetupIntent

  HTTP Method: POST
  Endpoint: /v1/setup_intents/{setup-intent-id}

  Path Parameters:
    - setup-intent-id (String): The setup-intent-id parameter. (required)

  Example Usage:
    (update-setup-intents-intent {:setup-intent-id example-setup-intent-id})"
  [{:keys [setup-intent-id]}]
  (stripe-request :post {:endpoint "/v1/setup_intents/{setup-intent-id}" :path-params {:setup-intent-id setup-intent-id}}))

(defn post-setup-intents-intent-confirm
  "Confirm a SetupIntent

  HTTP Method: POST
  Endpoint: /v1/setup_intents/{setup-intent-id}/confirm

  Path Parameters:
    - setup-intent-id (String): The setup-intent-id parameter. (required)

  Example Usage:
    (post-setup-intents-intent-confirm {:setup-intent-id example-setup-intent-id})"
  [{:keys [setup-intent-id]}]
  (stripe-request :post {:endpoint "/v1/setup_intents/{setup-intent-id}/confirm" :path-params {:setup-intent-id setup-intent-id}}))

(defn post-setup-intents-intent-verify-microdeposits
  "Verify microdeposits on a SetupIntent

  HTTP Method: POST
  Endpoint: /v1/setup_intents/{setup-intent-id}/verify_microdeposits

  Path Parameters:
    - setup-intent-id (String): The setup-intent-id parameter. (required)

  Example Usage:
    (post-setup-intents-intent-verify-microdeposits {:setup-intent-id example-setup-intent-id})"
  [{:keys [setup-intent-id]}]
  (stripe-request :post {:endpoint "/v1/setup_intents/{setup-intent-id}/verify_microdeposits" :path-params {:setup-intent-id setup-intent-id}}))

(defn list-all-setup-intents
  "List all SetupIntents

  HTTP Method: GET
  Endpoint: /v1/setup_intents

  Query Parameters:
    - attach-to-self (Boolean): If present, the SetupIntent's payment method will be attached to the in-context Stripe Account.

It can only be used for this Stripe Account’s own money movement flows like InboundTransfer and OutboundTransfers. It cannot be set to true when setting up a PaymentMethod for a Customer, and defaults to false when attaching a PaymentMethod to a Customer.
    - created (Unknown): A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options.
    - customer (String): Only return SetupIntents for the customer specified by this customer ID.
    - customer-account (String): Only return SetupIntents for the account specified by this customer ID.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - payment-method (String): Only return SetupIntents that associate with the specified payment method.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-setup-intents {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/setup_intents" :query-params query-params}))

(defn create-setup-intents
  "Create a SetupIntent

  HTTP Method: POST
  Endpoint: /v1/setup_intents

  Example Usage:
    (create-setup-intents {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/setup_intents"}))