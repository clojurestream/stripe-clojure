(ns stream.clojure.stripe.api.mandates
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-mandates [mandate params]
  """
  Retrieve a Mandate

  HTTP Method: GET
  Endpoint: /v1/mandates/{mandate}

  Path Parameters:
    - mandate: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/mandates/" mandate "") params))