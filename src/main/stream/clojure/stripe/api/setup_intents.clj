(ns stream.clojure.stripe.api.setup-intents
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn post-setup-intents-intent-cancel [intent params]
  """
  Cancel a SetupIntent

  HTTP Method: POST
  Endpoint: /v1/setup_intents/{intent}/cancel

  Path Parameters:
    - intent: Path parameter.

  """
  (stripe-request :post "/v1/setup_intents/" intent "/cancel" params))

(defn get-setup-intents-intent [intent params]
  """
  Retrieve a SetupIntent

  HTTP Method: GET
  Endpoint: /v1/setup_intents/{intent}

  Path Parameters:
    - intent: Path parameter.

  Query Parameters:
    - client_secret: The client secret of the SetupIntent. We require this string if you use a publishable key to retrieve the SetupIntent.
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/setup_intents/" intent "" params))

(defn post-setup-intents-intent [intent params]
  """
  Update a SetupIntent

  HTTP Method: POST
  Endpoint: /v1/setup_intents/{intent}

  Path Parameters:
    - intent: Path parameter.

  """
  (stripe-request :post "/v1/setup_intents/" intent "" params))

(defn post-setup-intents-intent-confirm [intent params]
  """
  Confirm a SetupIntent

  HTTP Method: POST
  Endpoint: /v1/setup_intents/{intent}/confirm

  Path Parameters:
    - intent: Path parameter.

  """
  (stripe-request :post "/v1/setup_intents/" intent "/confirm" params))

(defn post-setup-intents-intent-verify-microdeposits [intent params]
  """
  Verify microdeposits on a SetupIntent

  HTTP Method: POST
  Endpoint: /v1/setup_intents/{intent}/verify_microdeposits

  Path Parameters:
    - intent: Path parameter.

  """
  (stripe-request :post "/v1/setup_intents/" intent "/verify_microdeposits" params))

(defn get-setup-intents [params]
  """
  List all SetupIntents

  HTTP Method: GET
  Endpoint: /v1/setup_intents

  Query Parameters:
    - attach_to_self: If present, the SetupIntent's payment method will be attached to the in-context Stripe Account.

It can only be used for this Stripe Account’s own money movement flows like InboundTransfer and OutboundTransfers. It cannot be set to true when setting up a PaymentMethod for a Customer, and defaults to false when attaching a PaymentMethod to a Customer.
    - created: A filter on the list, based on the object `created` field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options.
    - customer: Only return SetupIntents for the customer specified by this customer ID.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - payment_method: Only return SetupIntents that associate with the specified payment method.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get "/v1/setup_intents" params))

(defn post-setup-intents [params]
  """
  Create a SetupIntent

  HTTP Method: POST
  Endpoint: /v1/setup_intents

  """
  (stripe-request :post "/v1/setup_intents" params))