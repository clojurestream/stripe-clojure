(ns stream.clojure.stripe.api.identity
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn get-identity-verification-sessions [params]
  """
  List VerificationSessions

  HTTP Method: GET
  Endpoint: /v1/identity/verification_sessions

  Query Parameters:
    - client_reference_id: A string to reference this user. This can be a customer ID, a session ID, or similar, and can be used to reconcile this verification with your internal systems.
    - created: Only return VerificationSessions that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - related_customer: 
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status: Only return VerificationSessions with this status. [Learn more about the lifecycle of sessions](https://stripe.com/docs/identity/how-sessions-work).

  """
  (stripe-request :get "/v1/identity/verification_sessions" params))

(defn post-identity-verification-sessions [params]
  """
  Create a VerificationSession

  HTTP Method: POST
  Endpoint: /v1/identity/verification_sessions

  """
  (stripe-request :post "/v1/identity/verification_sessions" params))

(defn post-identity-verification-sessions-session-cancel [session params]
  """
  Cancel a VerificationSession

  HTTP Method: POST
  Endpoint: /v1/identity/verification_sessions/{session}/cancel

  Path Parameters:
    - session: Path parameter.

  """
  (stripe-request :post "/v1/identity/verification_sessions/" session "/cancel" params))

(defn get-identity-verification-reports [params]
  """
  List VerificationReports

  HTTP Method: GET
  Endpoint: /v1/identity/verification_reports

  Query Parameters:
    - client_reference_id: A string to reference this user. This can be a customer ID, a session ID, or similar, and can be used to reconcile this verification with your internal systems.
    - created: Only return VerificationReports that were created during the given date interval.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - type: Only return VerificationReports of this type
    - verification_session: Only return VerificationReports created by this VerificationSession ID. It is allowed to provide a VerificationIntent ID.

  """
  (stripe-request :get "/v1/identity/verification_reports" params))

(defn get-identity-verification-reports-report [report params]
  """
  Retrieve a VerificationReport

  HTTP Method: GET
  Endpoint: /v1/identity/verification_reports/{report}

  Path Parameters:
    - report: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/identity/verification_reports/" report "" params))

(defn post-identity-verification-sessions-session-redact [session params]
  """
  Redact a VerificationSession

  HTTP Method: POST
  Endpoint: /v1/identity/verification_sessions/{session}/redact

  Path Parameters:
    - session: Path parameter.

  """
  (stripe-request :post "/v1/identity/verification_sessions/" session "/redact" params))

(defn get-identity-verification-sessions-session [session params]
  """
  Retrieve a VerificationSession

  HTTP Method: GET
  Endpoint: /v1/identity/verification_sessions/{session}

  Path Parameters:
    - session: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get "/v1/identity/verification_sessions/" session "" params))

(defn post-identity-verification-sessions-session [session params]
  """
  Update a VerificationSession

  HTTP Method: POST
  Endpoint: /v1/identity/verification_sessions/{session}

  Path Parameters:
    - session: Path parameter.

  """
  (stripe-request :post "/v1/identity/verification_sessions/" session "" params))