(ns stream.clojure.stripe.api.payment-method-domains
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-payment-method-domains [params]
  """
  List payment method domains

  HTTP Method: GET
  Endpoint: /v1/payment_method_domains

  Query Parameters:
    - domain_name: The domain name that this payment method domain object represents.
    - enabled: Whether this payment method domain is enabled. If the domain is not enabled, payment methods will not appear in Elements
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/payment_method_domains") params))

(defn create-payment-method-domains [params]
  """
  Create a payment method domain

  HTTP Method: POST
  Endpoint: /v1/payment_method_domains

  """
  (stripe-request :post (str "/v1/payment_method_domains") params))

(defn retrieve-payment-method-domains [payment_method_domain params]
  """
  Retrieve a payment method domain

  HTTP Method: GET
  Endpoint: /v1/payment_method_domains/{payment_method_domain}

  Path Parameters:
    - payment_method_domain: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/payment_method_domains/" payment_method_domain "") params))

(defn create-payment-method-domains [payment_method_domain params]
  """
  Update a payment method domain

  HTTP Method: POST
  Endpoint: /v1/payment_method_domains/{payment_method_domain}

  Path Parameters:
    - payment_method_domain: Path parameter.

  """
  (stripe-request :post (str "/v1/payment_method_domains/" payment_method_domain "") params))

(defn create-payment-method-domains [payment_method_domain params]
  """
  Validate an existing payment method domain

  HTTP Method: POST
  Endpoint: /v1/payment_method_domains/{payment_method_domain}/validate

  Path Parameters:
    - payment_method_domain: Path parameter.

  """
  (stripe-request :post (str "/v1/payment_method_domains/" payment_method_domain "/validate") params))