(ns stream.clojure.stripe.api.identity
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all-verification-sessions [{:keys [query-params]}]
  "List VerificationSessions

  HTTP Method: GET
  Endpoint: /v1/identity/verification_sessions

  Query Parameters:
    - client-reference-id: A string to reference this user. This can be a customer ID, a session ID, or similar, and can be used to reconcile this verification with your internal systems. [type: string]
    - created: Only return VerificationSessions that were created during the given date interval. [type: unknown]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - related-customer: The related-customer parameter. [type: string]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - status: Only return VerificationSessions with this status. [Learn more about the lifecycle of sessions](https://stripe.com/docs/identity/how-sessions-work). [type: string]

  Example Usage:
    (list-all-verification-sessions {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/identity/verification_sessions" :query-params query-params}))

(defn create-verification-sessions [{:keys []}]
  "Create a VerificationSession

  HTTP Method: POST
  Endpoint: /v1/identity/verification_sessions

  Example Usage:
    (create-verification-sessions {})"
  (stripe-request :post {:endpoint "/v1/identity/verification_sessions"}))

(defn post-verification-sessions-session-cancel [{:keys [verification-session-id]}]
  "Cancel a VerificationSession

  HTTP Method: POST
  Endpoint: /v1/identity/verification_sessions/{verification-session-id}/cancel

  Path Parameters:
    - verification-session-id: The verification-session-id parameter. (required) [type: string]

  Example Usage:
    (post-verification-sessions-session-cancel {:verification-session-id example-verification-session-id})"
  (stripe-request :post {:endpoint "/v1/identity/verification_sessions/{verification-session-id}/cancel" :path-params {:verification-session-id verification-session-id}}))

(defn list-all-verification-reports [{:keys [query-params]}]
  "List VerificationReports

  HTTP Method: GET
  Endpoint: /v1/identity/verification_reports

  Query Parameters:
    - client-reference-id: A string to reference this user. This can be a customer ID, a session ID, or similar, and can be used to reconcile this verification with your internal systems. [type: string]
    - created: Only return VerificationReports that were created during the given date interval. [type: unknown]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - type: Only return VerificationReports of this type [type: string]
    - verification-session: Only return VerificationReports created by this VerificationSession ID. It is allowed to provide a VerificationIntent ID. [type: string]

  Example Usage:
    (list-all-verification-reports {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/identity/verification_reports" :query-params query-params}))

(defn retrieve-verification-reports-report [{:keys [verification-report-id query-params]}]
  "Retrieve a VerificationReport

  HTTP Method: GET
  Endpoint: /v1/identity/verification_reports/{verification-report-id}

  Path Parameters:
    - verification-report-id: The verification-report-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-verification-reports-report {:verification-report-id example-verification-report-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/identity/verification_reports/{verification-report-id}" :path-params {:verification-report-id verification-report-id} :query-params query-params}))

(defn post-verification-sessions-session-redact [{:keys [verification-session-id]}]
  "Redact a VerificationSession

  HTTP Method: POST
  Endpoint: /v1/identity/verification_sessions/{verification-session-id}/redact

  Path Parameters:
    - verification-session-id: The verification-session-id parameter. (required) [type: string]

  Example Usage:
    (post-verification-sessions-session-redact {:verification-session-id example-verification-session-id})"
  (stripe-request :post {:endpoint "/v1/identity/verification_sessions/{verification-session-id}/redact" :path-params {:verification-session-id verification-session-id}}))

(defn retrieve-verification-sessions-session [{:keys [verification-session-id query-params]}]
  "Retrieve a VerificationSession

  HTTP Method: GET
  Endpoint: /v1/identity/verification_sessions/{verification-session-id}

  Path Parameters:
    - verification-session-id: The verification-session-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-verification-sessions-session {:verification-session-id example-verification-session-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/identity/verification_sessions/{verification-session-id}" :path-params {:verification-session-id verification-session-id} :query-params query-params}))

(defn update-verification-sessions-session [{:keys [verification-session-id]}]
  "Update a VerificationSession

  HTTP Method: POST
  Endpoint: /v1/identity/verification_sessions/{verification-session-id}

  Path Parameters:
    - verification-session-id: The verification-session-id parameter. (required) [type: string]

  Example Usage:
    (update-verification-sessions-session {:verification-session-id example-verification-session-id})"
  (stripe-request :post {:endpoint "/v1/identity/verification_sessions/{verification-session-id}" :path-params {:verification-session-id verification-session-id}}))