(ns stream.clojure.stripe.api.events
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all
  "List all events

  HTTP Method: GET
  Endpoint: /v1/events

  Query Parameters:
    - created (Unknown): Only return events that were created during the given date interval.
    - delivery-success (Boolean): Filter events by whether all webhooks were successfully delivered. If false, events which are still pending or have failed all delivery attempts to a webhook endpoint will be returned.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - type (String): A string containing a specific event name, or group of events using * as a wildcard. The list will be filtered to include only events with a matching event property.
    - types (Array): An array of up to 20 strings containing specific event names. The list will be filtered to include only events with a matching event property. You may pass either `type` or `types`, but not both.

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/events" :query-params query-params}))

(defn retrieve-id
  "Retrieve an event

  HTTP Method: GET
  Endpoint: /v1/events/{event-id}

  Path Parameters:
    - event-id (String): The event-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-id {:event-id example-event-id :query-params {:limit 10}})"
  [{:keys [event-id query-params]}]
  (stripe-request :get {:endpoint "/v1/events/{event-id}" :path-params {:event-id event-id} :query-params query-params}))