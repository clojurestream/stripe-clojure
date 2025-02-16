(ns stream.clojure.stripe.api.terminal
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn delete-configurations-configuration
  "Delete a Configuration

  HTTP Method: DELETE
  Endpoint: /v1/terminal/configurations/{configuration-id}

  Path Parameters:
    - configuration-id (String): The configuration-id parameter. (required)

  Example Usage:
    (delete-configurations-configuration {:configuration-id example-configuration-id})"
  [{:keys [configuration-id]}]
  (stripe-request :delete {:endpoint "/v1/terminal/configurations/{configuration-id}" :path-params {:configuration-id configuration-id}}))

(defn retrieve-configurations-configuration
  "Retrieve a Configuration

  HTTP Method: GET
  Endpoint: /v1/terminal/configurations/{configuration-id}

  Path Parameters:
    - configuration-id (String): The configuration-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-configurations-configuration {:configuration-id example-configuration-id :query-params {:limit 10}})"
  [{:keys [configuration-id query-params]}]
  (stripe-request :get {:endpoint "/v1/terminal/configurations/{configuration-id}" :path-params {:configuration-id configuration-id} :query-params query-params}))

(defn update-configurations-configuration
  "Update a Configuration

  HTTP Method: POST
  Endpoint: /v1/terminal/configurations/{configuration-id}

  Path Parameters:
    - configuration-id (String): The configuration-id parameter. (required)

  Example Usage:
    (update-configurations-configuration {:configuration-id example-configuration-id})"
  [{:keys [configuration-id]}]
  (stripe-request :post {:endpoint "/v1/terminal/configurations/{configuration-id}" :path-params {:configuration-id configuration-id}}))

(defn list-all-configurations
  "List all Configurations

  HTTP Method: GET
  Endpoint: /v1/terminal/configurations

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - is-account-default (Boolean): if present, only return the account default or non-default configurations.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-configurations {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/terminal/configurations" :query-params query-params}))

(defn create-configurations
  "Create a Configuration

  HTTP Method: POST
  Endpoint: /v1/terminal/configurations

  Example Usage:
    (create-configurations {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/terminal/configurations"}))

(defn post-readers-reader-process-payment-intent
  "Hand-off a PaymentIntent to a Reader

  HTTP Method: POST
  Endpoint: /v1/terminal/readers/{reader-id}/process_payment_intent

  Path Parameters:
    - reader-id (String): The reader-id parameter. (required)

  Example Usage:
    (post-readers-reader-process-payment-intent {:reader-id example-reader-id})"
  [{:keys [reader-id]}]
  (stripe-request :post {:endpoint "/v1/terminal/readers/{reader-id}/process_payment_intent" :path-params {:reader-id reader-id}}))

(defn post-readers-reader-set-reader-display
  "Set reader display

  HTTP Method: POST
  Endpoint: /v1/terminal/readers/{reader-id}/set_reader_display

  Path Parameters:
    - reader-id (String): The reader-id parameter. (required)

  Example Usage:
    (post-readers-reader-set-reader-display {:reader-id example-reader-id})"
  [{:keys [reader-id]}]
  (stripe-request :post {:endpoint "/v1/terminal/readers/{reader-id}/set_reader_display" :path-params {:reader-id reader-id}}))

(defn post-readers-reader-refund-payment
  "Refund a Charge or a PaymentIntent in-person

  HTTP Method: POST
  Endpoint: /v1/terminal/readers/{reader-id}/refund_payment

  Path Parameters:
    - reader-id (String): The reader-id parameter. (required)

  Example Usage:
    (post-readers-reader-refund-payment {:reader-id example-reader-id})"
  [{:keys [reader-id]}]
  (stripe-request :post {:endpoint "/v1/terminal/readers/{reader-id}/refund_payment" :path-params {:reader-id reader-id}}))

(defn delete-readers-reader
  "Delete a Reader

  HTTP Method: DELETE
  Endpoint: /v1/terminal/readers/{reader-id}

  Path Parameters:
    - reader-id (String): The reader-id parameter. (required)

  Example Usage:
    (delete-readers-reader {:reader-id example-reader-id})"
  [{:keys [reader-id]}]
  (stripe-request :delete {:endpoint "/v1/terminal/readers/{reader-id}" :path-params {:reader-id reader-id}}))

(defn retrieve-readers-reader
  "Retrieve a Reader

  HTTP Method: GET
  Endpoint: /v1/terminal/readers/{reader-id}

  Path Parameters:
    - reader-id (String): The reader-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-readers-reader {:reader-id example-reader-id :query-params {:limit 10}})"
  [{:keys [reader-id query-params]}]
  (stripe-request :get {:endpoint "/v1/terminal/readers/{reader-id}" :path-params {:reader-id reader-id} :query-params query-params}))

(defn update-readers-reader
  "Update a Reader

  HTTP Method: POST
  Endpoint: /v1/terminal/readers/{reader-id}

  Path Parameters:
    - reader-id (String): The reader-id parameter. (required)

  Example Usage:
    (update-readers-reader {:reader-id example-reader-id})"
  [{:keys [reader-id]}]
  (stripe-request :post {:endpoint "/v1/terminal/readers/{reader-id}" :path-params {:reader-id reader-id}}))

(defn delete-locations-location
  "Delete a Location

  HTTP Method: DELETE
  Endpoint: /v1/terminal/locations/{location-id}

  Path Parameters:
    - location-id (String): The location-id parameter. (required)

  Example Usage:
    (delete-locations-location {:location-id example-location-id})"
  [{:keys [location-id]}]
  (stripe-request :delete {:endpoint "/v1/terminal/locations/{location-id}" :path-params {:location-id location-id}}))

(defn retrieve-locations-location
  "Retrieve a Location

  HTTP Method: GET
  Endpoint: /v1/terminal/locations/{location-id}

  Path Parameters:
    - location-id (String): The location-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-locations-location {:location-id example-location-id :query-params {:limit 10}})"
  [{:keys [location-id query-params]}]
  (stripe-request :get {:endpoint "/v1/terminal/locations/{location-id}" :path-params {:location-id location-id} :query-params query-params}))

(defn update-locations-location
  "Update a Location

  HTTP Method: POST
  Endpoint: /v1/terminal/locations/{location-id}

  Path Parameters:
    - location-id (String): The location-id parameter. (required)

  Example Usage:
    (update-locations-location {:location-id example-location-id})"
  [{:keys [location-id]}]
  (stripe-request :post {:endpoint "/v1/terminal/locations/{location-id}" :path-params {:location-id location-id}}))

(defn post-readers-reader-process-setup-intent
  "Hand-off a SetupIntent to a Reader

  HTTP Method: POST
  Endpoint: /v1/terminal/readers/{reader-id}/process_setup_intent

  Path Parameters:
    - reader-id (String): The reader-id parameter. (required)

  Example Usage:
    (post-readers-reader-process-setup-intent {:reader-id example-reader-id})"
  [{:keys [reader-id]}]
  (stripe-request :post {:endpoint "/v1/terminal/readers/{reader-id}/process_setup_intent" :path-params {:reader-id reader-id}}))

(defn post-readers-reader-cancel-action
  "Cancel the current reader action

  HTTP Method: POST
  Endpoint: /v1/terminal/readers/{reader-id}/cancel_action

  Path Parameters:
    - reader-id (String): The reader-id parameter. (required)

  Example Usage:
    (post-readers-reader-cancel-action {:reader-id example-reader-id})"
  [{:keys [reader-id]}]
  (stripe-request :post {:endpoint "/v1/terminal/readers/{reader-id}/cancel_action" :path-params {:reader-id reader-id}}))

(defn list-all-readers
  "List all Readers

  HTTP Method: GET
  Endpoint: /v1/terminal/readers

  Query Parameters:
    - device-type (String): Filters readers by device type
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - location (String): A location ID to filter the response list to only readers at the specific location
    - serial-number (String): Filters readers by serial number
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): A status filter to filter readers to only offline or online readers

  Example Usage:
    (list-all-readers {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/terminal/readers" :query-params query-params}))

(defn create-readers
  "Create a Reader

  HTTP Method: POST
  Endpoint: /v1/terminal/readers

  Example Usage:
    (create-readers {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/terminal/readers"}))

(defn list-all-locations
  "List all Locations

  HTTP Method: GET
  Endpoint: /v1/terminal/locations

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-locations {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/terminal/locations" :query-params query-params}))

(defn create-locations
  "Create a Location

  HTTP Method: POST
  Endpoint: /v1/terminal/locations

  Example Usage:
    (create-locations {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/terminal/locations"}))

(defn create-connection-tokens
  "Create a Connection Token

  HTTP Method: POST
  Endpoint: /v1/terminal/connection_tokens

  Example Usage:
    (create-connection-tokens {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/terminal/connection_tokens"}))