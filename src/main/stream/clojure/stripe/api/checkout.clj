(ns stream.clojure.stripe.api.checkout
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-sessions-session [{:keys [session-id query-params]}]
  "Retrieve a Session

  HTTP Method: GET
  Endpoint: /v1/checkout/sessions/{session-id}

  Path Parameters:
    - session-id: The session-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-sessions-session {:session-id example-session-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/checkout/sessions/{session-id}" :path-params {:session-id session-id} :query-params query-params}))

(defn update-sessions-session [{:keys [session-id]}]
  "Update a Session

  HTTP Method: POST
  Endpoint: /v1/checkout/sessions/{session-id}

  Path Parameters:
    - session-id: The session-id parameter. (required) [type: string]

  Example Usage:
    (update-sessions-session {:session-id example-session-id})"
  (stripe-request :post {:endpoint "/v1/checkout/sessions/{session-id}" :path-params {:session-id session-id}}))

(defn list-all-sessions [{:keys [query-params]}]
  "List all Checkout Sessions

  HTTP Method: GET
  Endpoint: /v1/checkout/sessions

  Query Parameters:
    - created: Only return Checkout Sessions that were created during the given date interval. [type: unknown]
    - customer: Only return the Checkout Sessions for the Customer specified. [type: string]
    - customer-details: Only return the Checkout Sessions for the Customer details specified. [type: object]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - payment-intent: Only return the Checkout Session for the PaymentIntent specified. [type: string]
    - payment-link: Only return the Checkout Sessions for the Payment Link specified. [type: string]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - status: Only return the Checkout Sessions matching the given status. [type: string]
    - subscription: Only return the Checkout Session for the subscription specified. [type: string]

  Example Usage:
    (list-all-sessions {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/checkout/sessions" :query-params query-params}))

(defn create-sessions [{:keys []}]
  "Create a Session

  HTTP Method: POST
  Endpoint: /v1/checkout/sessions

  Example Usage:
    (create-sessions {})"
  (stripe-request :post {:endpoint "/v1/checkout/sessions"}))

(defn list-all-sessions-session-line-items [{:keys [session-id query-params]}]
  "Retrieve a Checkout Session's line items

  HTTP Method: GET
  Endpoint: /v1/checkout/sessions/{session-id}/line_items

  Path Parameters:
    - session-id: The session-id parameter. (required) [type: string]

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-sessions-session-line-items {:session-id example-session-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/checkout/sessions/{session-id}/line_items" :path-params {:session-id session-id} :query-params query-params}))

(defn post-sessions-session-expire [{:keys [session-id]}]
  "Expire a Session

  HTTP Method: POST
  Endpoint: /v1/checkout/sessions/{session-id}/expire

  Path Parameters:
    - session-id: The session-id parameter. (required) [type: string]

  Example Usage:
    (post-sessions-session-expire {:session-id example-session-id})"
  (stripe-request :post {:endpoint "/v1/checkout/sessions/{session-id}/expire" :path-params {:session-id session-id}}))