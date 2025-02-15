(ns stream.clojure.stripe.api.accounts
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all [{:keys [query-params]}]
  "List all connected accounts

  HTTP Method: GET
  Endpoint: /v1/accounts

  Query Parameters:
    - created: Only return connected accounts that were created during the given date interval. [type: unknown]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/accounts" :query-params query-params}))

(defn post [{:keys []}]
  "No description available.

  HTTP Method: POST
  Endpoint: /v1/accounts

  Example Usage:
    (post {})"
  (stripe-request :post {:endpoint "/v1/accounts"}))

(defn create-account-login-links [{:keys [account-id]}]
  "Create a login link

  HTTP Method: POST
  Endpoint: /v1/accounts/{account-id}/login_links

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]

  Example Usage:
    (create-account-login-links {:account-id example-account-id})"
  (stripe-request :post {:endpoint "/v1/accounts/{account-id}/login_links" :path-params {:account-id account-id}}))

(defn delete-account-persons-person [{:keys [account-id person-id]}]
  "Delete a person

  HTTP Method: DELETE
  Endpoint: /v1/accounts/{account-id}/persons/{person-id}

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]
    - person-id: The person-id parameter. (required) [type: string]

  Example Usage:
    (delete-account-persons-person {:account-id example-account-id :person-id example-person-id})"
  (stripe-request :delete {:endpoint "/v1/accounts/{account-id}/persons/{person-id}" :path-params {:account-id account-id :person-id person-id}}))

(defn retrieve-account-persons-person [{:keys [account-id person-id query-params]}]
  "Retrieve a person

  HTTP Method: GET
  Endpoint: /v1/accounts/{account-id}/persons/{person-id}

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]
    - person-id: The person-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-account-persons-person {:account-id example-account-id :person-id example-person-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/accounts/{account-id}/persons/{person-id}" :path-params {:account-id account-id :person-id person-id} :query-params query-params}))

(defn update-account-persons-person [{:keys [account-id person-id]}]
  "Update a person

  HTTP Method: POST
  Endpoint: /v1/accounts/{account-id}/persons/{person-id}

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]
    - person-id: The person-id parameter. (required) [type: string]

  Example Usage:
    (update-account-persons-person {:account-id example-account-id :person-id example-person-id})"
  (stripe-request :post {:endpoint "/v1/accounts/{account-id}/persons/{person-id}" :path-params {:account-id account-id :person-id person-id}}))

(defn delete-account-bank-id [{:keys [account-id bank-account-id]}]
  "Delete an external account

  HTTP Method: DELETE
  Endpoint: /v1/accounts/{account-id}/bank_accounts/{bank-account-id}

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]
    - bank-account-id: The bank-account-id parameter. (required) [type: string]

  Example Usage:
    (delete-account-bank-id {:account-id example-account-id :bank-account-id example-bank-account-id})"
  (stripe-request :delete {:endpoint "/v1/accounts/{account-id}/bank_accounts/{bank-account-id}" :path-params {:account-id account-id :bank-account-id bank-account-id}}))

(defn retrieve-account-bank-id [{:keys [account-id bank-account-id query-params]}]
  "Retrieve an external account

  HTTP Method: GET
  Endpoint: /v1/accounts/{account-id}/bank_accounts/{bank-account-id}

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]
    - bank-account-id: The bank-account-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-account-bank-id {:account-id example-account-id :bank-account-id example-bank-account-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/accounts/{account-id}/bank_accounts/{bank-account-id}" :path-params {:account-id account-id :bank-account-id bank-account-id} :query-params query-params}))

(defn post-account-bank-id [{:keys [account-id bank-account-id]}]
  "No description available.

  HTTP Method: POST
  Endpoint: /v1/accounts/{account-id}/bank_accounts/{bank-account-id}

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]
    - bank-account-id: The bank-account-id parameter. (required) [type: string]

  Example Usage:
    (post-account-bank-id {:account-id example-account-id :bank-account-id example-bank-account-id})"
  (stripe-request :post {:endpoint "/v1/accounts/{account-id}/bank_accounts/{bank-account-id}" :path-params {:account-id account-id :bank-account-id bank-account-id}}))

(defn delete-account-people-person [{:keys [account-id people-id]}]
  "Delete a person

  HTTP Method: DELETE
  Endpoint: /v1/accounts/{account-id}/people/{people-id}

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]
    - people-id: The people-id parameter. (required) [type: string]

  Example Usage:
    (delete-account-people-person {:account-id example-account-id :people-id example-people-id})"
  (stripe-request :delete {:endpoint "/v1/accounts/{account-id}/people/{people-id}" :path-params {:account-id account-id :people-id people-id}}))

(defn retrieve-account-people-person [{:keys [account-id people-id query-params]}]
  "Retrieve a person

  HTTP Method: GET
  Endpoint: /v1/accounts/{account-id}/people/{people-id}

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]
    - people-id: The people-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-account-people-person {:account-id example-account-id :people-id example-people-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/accounts/{account-id}/people/{people-id}" :path-params {:account-id account-id :people-id people-id} :query-params query-params}))

(defn update-account-people-person [{:keys [account-id people-id]}]
  "Update a person

  HTTP Method: POST
  Endpoint: /v1/accounts/{account-id}/people/{people-id}

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]
    - people-id: The people-id parameter. (required) [type: string]

  Example Usage:
    (update-account-people-person {:account-id example-account-id :people-id example-people-id})"
  (stripe-request :post {:endpoint "/v1/accounts/{account-id}/people/{people-id}" :path-params {:account-id account-id :people-id people-id}}))

(defn list-all-account-people [{:keys [account-id query-params]}]
  "List all persons

  HTTP Method: GET
  Endpoint: /v1/accounts/{account-id}/people

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - relationship: Filters on the list of people returned based on the person's relationship to the account's company. [type: object]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-account-people {:account-id example-account-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/accounts/{account-id}/people" :path-params {:account-id account-id} :query-params query-params}))

(defn create-account-people [{:keys [account-id]}]
  "Create a person

  HTTP Method: POST
  Endpoint: /v1/accounts/{account-id}/people

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]

  Example Usage:
    (create-account-people {:account-id example-account-id})"
  (stripe-request :post {:endpoint "/v1/accounts/{account-id}/people" :path-params {:account-id account-id}}))

(defn delete-account [{:keys [account-id]}]
  "Delete an account

  HTTP Method: DELETE
  Endpoint: /v1/accounts/{account-id}

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]

  Example Usage:
    (delete-account {:account-id example-account-id})"
  (stripe-request :delete {:endpoint "/v1/accounts/{account-id}" :path-params {:account-id account-id}}))

(defn retrieve-account [{:keys [account-id query-params]}]
  "Retrieve account

  HTTP Method: GET
  Endpoint: /v1/accounts/{account-id}

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-account {:account-id example-account-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/accounts/{account-id}" :path-params {:account-id account-id} :query-params query-params}))

(defn update-account [{:keys [account-id]}]
  "Update an account

  HTTP Method: POST
  Endpoint: /v1/accounts/{account-id}

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]

  Example Usage:
    (update-account {:account-id example-account-id})"
  (stripe-request :post {:endpoint "/v1/accounts/{account-id}" :path-params {:account-id account-id}}))

(defn list-all-account-persons [{:keys [account-id query-params]}]
  "List all persons

  HTTP Method: GET
  Endpoint: /v1/accounts/{account-id}/persons

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - relationship: Filters on the list of people returned based on the person's relationship to the account's company. [type: object]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-account-persons {:account-id example-account-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/accounts/{account-id}/persons" :path-params {:account-id account-id} :query-params query-params}))

(defn create-account-persons [{:keys [account-id]}]
  "Create a person

  HTTP Method: POST
  Endpoint: /v1/accounts/{account-id}/persons

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]

  Example Usage:
    (create-account-persons {:account-id example-account-id})"
  (stripe-request :post {:endpoint "/v1/accounts/{account-id}/persons" :path-params {:account-id account-id}}))

(defn retrieve-account-capabilities-capability [{:keys [account-id capabilitie-id query-params]}]
  "Retrieve an Account Capability

  HTTP Method: GET
  Endpoint: /v1/accounts/{account-id}/capabilities/{capabilitie-id}

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]
    - capabilitie-id: The capabilitie-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-account-capabilities-capability {:account-id example-account-id :capabilitie-id example-capabilitie-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/accounts/{account-id}/capabilities/{capabilitie-id}" :path-params {:account-id account-id :capabilitie-id capabilitie-id} :query-params query-params}))

(defn update-account-capabilities-capability [{:keys [account-id capabilitie-id]}]
  "Update an Account Capability

  HTTP Method: POST
  Endpoint: /v1/accounts/{account-id}/capabilities/{capabilitie-id}

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]
    - capabilitie-id: The capabilitie-id parameter. (required) [type: string]

  Example Usage:
    (update-account-capabilities-capability {:account-id example-account-id :capabilitie-id example-capabilitie-id})"
  (stripe-request :post {:endpoint "/v1/accounts/{account-id}/capabilities/{capabilitie-id}" :path-params {:account-id account-id :capabilitie-id capabilitie-id}}))

(defn list-all-account-capabilities [{:keys [account-id query-params]}]
  "List all account capabilities

  HTTP Method: GET
  Endpoint: /v1/accounts/{account-id}/capabilities

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (list-all-account-capabilities {:account-id example-account-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/accounts/{account-id}/capabilities" :path-params {:account-id account-id} :query-params query-params}))

(defn create-account-bank [{:keys [account-id]}]
  "Create an external account

  HTTP Method: POST
  Endpoint: /v1/accounts/{account-id}/bank_accounts

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]

  Example Usage:
    (create-account-bank {:account-id example-account-id})"
  (stripe-request :post {:endpoint "/v1/accounts/{account-id}/bank_accounts" :path-params {:account-id account-id}}))

(defn list-all-account-external [{:keys [account-id query-params]}]
  "List all external accounts

  HTTP Method: GET
  Endpoint: /v1/accounts/{account-id}/external_accounts

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - object: Filter external accounts according to a particular object type. [type: string]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]

  Example Usage:
    (list-all-account-external {:account-id example-account-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/accounts/{account-id}/external_accounts" :path-params {:account-id account-id} :query-params query-params}))

(defn create-account-external [{:keys [account-id]}]
  "Create an external account

  HTTP Method: POST
  Endpoint: /v1/accounts/{account-id}/external_accounts

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]

  Example Usage:
    (create-account-external {:account-id example-account-id})"
  (stripe-request :post {:endpoint "/v1/accounts/{account-id}/external_accounts" :path-params {:account-id account-id}}))

(defn delete-account-external-id [{:keys [account-id external-account-id]}]
  "Delete an external account

  HTTP Method: DELETE
  Endpoint: /v1/accounts/{account-id}/external_accounts/{external-account-id}

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]
    - external-account-id: The external-account-id parameter. (required) [type: string]

  Example Usage:
    (delete-account-external-id {:account-id example-account-id :external-account-id example-external-account-id})"
  (stripe-request :delete {:endpoint "/v1/accounts/{account-id}/external_accounts/{external-account-id}" :path-params {:account-id account-id :external-account-id external-account-id}}))

(defn retrieve-account-external-id [{:keys [account-id external-account-id query-params]}]
  "Retrieve an external account

  HTTP Method: GET
  Endpoint: /v1/accounts/{account-id}/external_accounts/{external-account-id}

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]
    - external-account-id: The external-account-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-account-external-id {:account-id example-account-id :external-account-id example-external-account-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/accounts/{account-id}/external_accounts/{external-account-id}" :path-params {:account-id account-id :external-account-id external-account-id} :query-params query-params}))

(defn post-account-external-id [{:keys [account-id external-account-id]}]
  "No description available.

  HTTP Method: POST
  Endpoint: /v1/accounts/{account-id}/external_accounts/{external-account-id}

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]
    - external-account-id: The external-account-id parameter. (required) [type: string]

  Example Usage:
    (post-account-external-id {:account-id example-account-id :external-account-id example-external-account-id})"
  (stripe-request :post {:endpoint "/v1/accounts/{account-id}/external_accounts/{external-account-id}" :path-params {:account-id account-id :external-account-id external-account-id}}))

(defn post-account-reject [{:keys [account-id]}]
  "Reject an account

  HTTP Method: POST
  Endpoint: /v1/accounts/{account-id}/reject

  Path Parameters:
    - account-id: The account-id parameter. (required) [type: string]

  Example Usage:
    (post-account-reject {:account-id example-account-id})"
  (stripe-request :post {:endpoint "/v1/accounts/{account-id}/reject" :path-params {:account-id account-id}}))