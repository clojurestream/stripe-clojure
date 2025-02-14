(ns stream.clojure.stripe.api.setup-attempts
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-setup-attempts [params]
  """
  List all SetupAttempts

  HTTP Method: GET
  Endpoint: /v1/setup_attempts

  Query Parameters:
    - created: A filter on the list, based on the object `created` field. The value
can be a string with an integer Unix timestamp or a
dictionary with a number of different query options.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - setup_intent: Only return SetupAttempts created by the SetupIntent specified by
this ID.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  """
  (stripe-request :get (str "/v1/setup_attempts") params))