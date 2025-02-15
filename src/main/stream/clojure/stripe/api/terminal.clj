(ns stream.clojure.stripe.api.terminal
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn delete-configurations-configuration [{:keys [configuration-id]}]
  "Delete a Configuration

  HTTP Method: DELETE
  Endpoint: /v1/terminal/configurations/{configuration-id}

  Path Parameters:
    - configuration-id: The configuration-id parameter. (required) [type: string]

  Example Usage:
    (delete-configurations-configuration {:configuration-id example-configuration-id})"
  (stripe-request :delete {:endpoint "/v1/terminal/configurations/{configuration-id}" :path-params {:configuration-id configuration-id}}))

(defn retrieve-configurations-configuration [{:keys [configuration-id query-params]}]
  "Retrieve a Configuration

  HTTP Method: GET
  Endpoint: /v1/terminal/configurations/{configuration-id}

  Path Parameters:
    - configuration-id: The configuration-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-configurations-configuration {:configuration-id example-configuration-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/terminal/configurations/{configuration-id}" :path-params {:configuration-id configuration-id} :query-params query-params}))

(defn update-configurations-configuration [{:keys [configuration-id]}]
  "Update a Configuration

  HTTP Method: POST
  Endpoint: /v1/terminal/configurations/{configuration-id}

  Path Parameters:
    - configuration-id: The configuration-id parameter. (required) [type: string]

  Example Usage:
    (update-configurations-configuration {:configuration-id example-configuration-id})"
  (stripe-request :post {:endpoint "/v1/terminal/configurations/{configuration-id}" :path-params {:configuration-id configuration-id}}))

(defn list-all-configurations [{:keys [query-params]}]
  "List all Configurations

  HTTP Method: GET
  Endpoint: /v1/terminal/configurations

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - is-account-default: if present, only return the account default or non-default configurations. [type: boolean]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-configurations {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/terminal/configurations" :query-params query-params}))

(defn create-configurations [{:keys []}]
  "Create a Configuration

  HTTP Method: POST
  Endpoint: /v1/terminal/configurations

  Example Usage:
    (create-configurations {})"
  (stripe-request :post {:endpoint "/v1/terminal/configurations"}))

(defn post-readers-reader-process-payment-intent [{:keys [reader-id]}]
  "Hand-off a PaymentIntent to a Reader

  HTTP Method: POST
  Endpoint: /v1/terminal/readers/{reader-id}/process_payment_intent

  Path Parameters:
    - reader-id: The reader-id parameter. (required) [type: string]

  Example Usage:
    (post-readers-reader-process-payment-intent {:reader-id example-reader-id})"
  (stripe-request :post {:endpoint "/v1/terminal/readers/{reader-id}/process_payment_intent" :path-params {:reader-id reader-id}}))

(defn post-readers-reader-set-reader-display [{:keys [reader-id]}]
  "Set reader display

  HTTP Method: POST
  Endpoint: /v1/terminal/readers/{reader-id}/set_reader_display

  Path Parameters:
    - reader-id: The reader-id parameter. (required) [type: string]

  Example Usage:
    (post-readers-reader-set-reader-display {:reader-id example-reader-id})"
  (stripe-request :post {:endpoint "/v1/terminal/readers/{reader-id}/set_reader_display" :path-params {:reader-id reader-id}}))

(defn post-readers-reader-refund-payment [{:keys [reader-id]}]
  "Refund a Charge or a PaymentIntent in-person

  HTTP Method: POST
  Endpoint: /v1/terminal/readers/{reader-id}/refund_payment

  Path Parameters:
    - reader-id: The reader-id parameter. (required) [type: string]

  Example Usage:
    (post-readers-reader-refund-payment {:reader-id example-reader-id})"
  (stripe-request :post {:endpoint "/v1/terminal/readers/{reader-id}/refund_payment" :path-params {:reader-id reader-id}}))

(defn delete-readers-reader [{:keys [reader-id]}]
  "Delete a Reader

  HTTP Method: DELETE
  Endpoint: /v1/terminal/readers/{reader-id}

  Path Parameters:
    - reader-id: The reader-id parameter. (required) [type: string]

  Example Usage:
    (delete-readers-reader {:reader-id example-reader-id})"
  (stripe-request :delete {:endpoint "/v1/terminal/readers/{reader-id}" :path-params {:reader-id reader-id}}))

(defn retrieve-readers-reader [{:keys [reader-id query-params]}]
  "Retrieve a Reader

  HTTP Method: GET
  Endpoint: /v1/terminal/readers/{reader-id}

  Path Parameters:
    - reader-id: The reader-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-readers-reader {:reader-id example-reader-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/terminal/readers/{reader-id}" :path-params {:reader-id reader-id} :query-params query-params}))

(defn update-readers-reader [{:keys [reader-id]}]
  "Update a Reader

  HTTP Method: POST
  Endpoint: /v1/terminal/readers/{reader-id}

  Path Parameters:
    - reader-id: The reader-id parameter. (required) [type: string]

  Example Usage:
    (update-readers-reader {:reader-id example-reader-id})"
  (stripe-request :post {:endpoint "/v1/terminal/readers/{reader-id}" :path-params {:reader-id reader-id}}))

(defn delete-locations-location [{:keys [location-id]}]
  "Delete a Location

  HTTP Method: DELETE
  Endpoint: /v1/terminal/locations/{location-id}

  Path Parameters:
    - location-id: The location-id parameter. (required) [type: string]

  Example Usage:
    (delete-locations-location {:location-id example-location-id})"
  (stripe-request :delete {:endpoint "/v1/terminal/locations/{location-id}" :path-params {:location-id location-id}}))

(defn retrieve-locations-location [{:keys [location-id query-params]}]
  "Retrieve a Location

  HTTP Method: GET
  Endpoint: /v1/terminal/locations/{location-id}

  Path Parameters:
    - location-id: The location-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-locations-location {:location-id example-location-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/terminal/locations/{location-id}" :path-params {:location-id location-id} :query-params query-params}))

(defn update-locations-location [{:keys [location-id]}]
  "Update a Location

  HTTP Method: POST
  Endpoint: /v1/terminal/locations/{location-id}

  Path Parameters:
    - location-id: The location-id parameter. (required) [type: string]

  Example Usage:
    (update-locations-location {:location-id example-location-id})"
  (stripe-request :post {:endpoint "/v1/terminal/locations/{location-id}" :path-params {:location-id location-id}}))

(defn post-readers-reader-process-setup-intent [{:keys [reader-id]}]
  "Hand-off a SetupIntent to a Reader

  HTTP Method: POST
  Endpoint: /v1/terminal/readers/{reader-id}/process_setup_intent

  Path Parameters:
    - reader-id: The reader-id parameter. (required) [type: string]

  Example Usage:
    (post-readers-reader-process-setup-intent {:reader-id example-reader-id})"
  (stripe-request :post {:endpoint "/v1/terminal/readers/{reader-id}/process_setup_intent" :path-params {:reader-id reader-id}}))

(defn post-readers-reader-cancel-action [{:keys [reader-id]}]
  "Cancel the current reader action

  HTTP Method: POST
  Endpoint: /v1/terminal/readers/{reader-id}/cancel_action

  Path Parameters:
    - reader-id: The reader-id parameter. (required) [type: string]

  Example Usage:
    (post-readers-reader-cancel-action {:reader-id example-reader-id})"
  (stripe-request :post {:endpoint "/v1/terminal/readers/{reader-id}/cancel_action" :path-params {:reader-id reader-id}}))

(defn list-all-readers [{:keys [query-params]}]
  "List all Readers

  HTTP Method: GET
  Endpoint: /v1/terminal/readers

  Query Parameters:
    - device-type: Filters readers by device type [type: string]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - location: A location ID to filter the response list to only readers at the specific location [type: string]
    - serial-number: Filters readers by serial number [type: string]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - status: A status filter to filter readers to only offline or online readers [type: string]

  Example Usage:
    (list-all-readers {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/terminal/readers" :query-params query-params}))

(defn create-readers [{:keys []}]
  "Create a Reader

  HTTP Method: POST
  Endpoint: /v1/terminal/readers

  Example Usage:
    (create-readers {})"
  (stripe-request :post {:endpoint "/v1/terminal/readers"}))

(defn list-all-locations [{:keys [query-params]}]
  "List all Locations

  HTTP Method: GET
  Endpoint: /v1/terminal/locations

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-locations {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/terminal/locations" :query-params query-params}))

(defn create-locations [{:keys []}]
  "Create a Location

  HTTP Method: POST
  Endpoint: /v1/terminal/locations

  Example Usage:
    (create-locations {})"
  (stripe-request :post {:endpoint "/v1/terminal/locations"}))

(defn create-connection-tokens [{:keys []}]
  "Create a Connection Token

  HTTP Method: POST
  Endpoint: /v1/terminal/connection_tokens

  Example Usage:
    (create-connection-tokens {})"
  (stripe-request :post {:endpoint "/v1/terminal/connection_tokens"}))