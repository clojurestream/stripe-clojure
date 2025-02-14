(ns stream.clojure.stripe.api.events
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-events [params]
  """
  List all events

  HTTP Method: GET
  Endpoint: /v1/events

  Query Parameters:
    - created: Only return events that were created during the given date interval.
    - delivery_success: Filter events by whether all webhooks were successfully delivered. If false, events which are still pending or have failed all delivery attempts to a webhook endpoint will be returned.
    - ending_before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand: Specifies which fields in the response should be expanded.
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting_after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - type: A string containing a specific event name, or group of events using * as a wildcard. The list will be filtered to include only events with a matching event property.
    - types: An array of up to 20 strings containing specific event names. The list will be filtered to include only events with a matching event property. You may pass either `type` or `types`, but not both.

  """
  (stripe-request :get (str "/v1/events") params))

(defn retrieve-events [id params]
  """
  Retrieve an event

  HTTP Method: GET
  Endpoint: /v1/events/{id}

  Path Parameters:
    - id: Path parameter.

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded.

  """
  (stripe-request :get (str "/v1/events/" id "") params))