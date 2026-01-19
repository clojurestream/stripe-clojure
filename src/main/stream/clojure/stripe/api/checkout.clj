(ns stream.clojure.stripe.api.checkout
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-sessions-session
  "Retrieve a Checkout Session

  HTTP Method: GET
  Endpoint: /v1/checkout/sessions/{session-id}

  Path Parameters:
    - session-id (String): The session-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-sessions-session {:session-id example-session-id :query-params {:limit 10}})"
  [{:keys [session-id query-params]}]
  (stripe-request :get {:endpoint "/v1/checkout/sessions/{session-id}" :path-params {:session-id session-id} :query-params query-params}))

(defn update-sessions-session
  "Update a Checkout Session

  HTTP Method: POST
  Endpoint: /v1/checkout/sessions/{session-id}

  Path Parameters:
    - session-id (String): The session-id parameter. (required)

  Example Usage:
    (update-sessions-session {:session-id example-session-id})"
  [{:keys [session-id]}]
  (stripe-request :post {:endpoint "/v1/checkout/sessions/{session-id}" :path-params {:session-id session-id}}))

(defn list-all-sessions
  "List all Checkout Sessions

  HTTP Method: GET
  Endpoint: /v1/checkout/sessions

  Query Parameters:
    - created (Unknown): Only return Checkout Sessions that were created during the given date interval.
    - customer (String): Only return the Checkout Sessions for the Customer specified.
    - customer-account (String): Only return the Checkout Sessions for the Account specified.
    - customer-details (Object): Only return the Checkout Sessions for the Customer details specified.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - payment-intent (String): Only return the Checkout Session for the PaymentIntent specified.
    - payment-link (String): Only return the Checkout Sessions for the Payment Link specified.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): Only return the Checkout Sessions matching the given status.
    - subscription (String): Only return the Checkout Session for the subscription specified.

  Example Usage:
    (list-all-sessions {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/checkout/sessions" :query-params query-params}))

(defn create-sessions
  "Create a Checkout Session

  HTTP Method: POST
  Endpoint: /v1/checkout/sessions

  Example Usage:
    (create-sessions {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/checkout/sessions"}))

(defn list-all-sessions-session-line-items
  "Retrieve a Checkout Session's line items

  HTTP Method: GET
  Endpoint: /v1/checkout/sessions/{session-id}/line_items

  Path Parameters:
    - session-id (String): The session-id parameter. (required)

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-sessions-session-line-items {:session-id example-session-id :query-params {:limit 10}})"
  [{:keys [session-id query-params]}]
  (stripe-request :get {:endpoint "/v1/checkout/sessions/{session-id}/line_items" :path-params {:session-id session-id} :query-params query-params}))

(defn post-sessions-session-expire
  "Expire a Checkout Session

  HTTP Method: POST
  Endpoint: /v1/checkout/sessions/{session-id}/expire

  Path Parameters:
    - session-id (String): The session-id parameter. (required)

  Example Usage:
    (post-sessions-session-expire {:session-id example-session-id})"
  [{:keys [session-id]}]
  (stripe-request :post {:endpoint "/v1/checkout/sessions/{session-id}/expire" :path-params {:session-id session-id}}))