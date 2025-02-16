(ns stream.clojure.stripe.api.accounts
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn list-all
  "List all connected accounts

  HTTP Method: GET
  Endpoint: /v1/accounts

  Query Parameters:
    - created (Unknown): Only return connected accounts that were created during the given date interval.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/accounts" :query-params query-params}))

(defn post
  "No description available.

  HTTP Method: POST
  Endpoint: /v1/accounts

  Example Usage:
    (post {})"
  [{:keys []}]
  (stripe-request :post {:endpoint "/v1/accounts"}))

(defn create-account-login-links
  "Create a login link

  HTTP Method: POST
  Endpoint: /v1/accounts/{account-id}/login_links

  Path Parameters:
    - account-id (String): The account-id parameter. (required)

  Example Usage:
    (create-account-login-links {:account-id example-account-id})"
  [{:keys [account-id]}]
  (stripe-request :post {:endpoint "/v1/accounts/{account-id}/login_links" :path-params {:account-id account-id}}))

(defn delete-account-persons-person
  "Delete a person

  HTTP Method: DELETE
  Endpoint: /v1/accounts/{account-id}/persons/{person-id}

  Path Parameters:
    - account-id (String): The account-id parameter. (required)
    - person-id (String): The person-id parameter. (required)

  Example Usage:
    (delete-account-persons-person {:account-id example-account-id :person-id example-person-id})"
  [{:keys [account-id person-id]}]
  (stripe-request :delete {:endpoint "/v1/accounts/{account-id}/persons/{person-id}" :path-params {:account-id account-id :person-id person-id}}))

(defn retrieve-account-persons-person
  "Retrieve a person

  HTTP Method: GET
  Endpoint: /v1/accounts/{account-id}/persons/{person-id}

  Path Parameters:
    - account-id (String): The account-id parameter. (required)
    - person-id (String): The person-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-account-persons-person {:account-id example-account-id :person-id example-person-id :query-params {:limit 10}})"
  [{:keys [account-id person-id query-params]}]
  (stripe-request :get {:endpoint "/v1/accounts/{account-id}/persons/{person-id}" :path-params {:account-id account-id :person-id person-id} :query-params query-params}))

(defn update-account-persons-person
  "Update a person

  HTTP Method: POST
  Endpoint: /v1/accounts/{account-id}/persons/{person-id}

  Path Parameters:
    - account-id (String): The account-id parameter. (required)
    - person-id (String): The person-id parameter. (required)

  Example Usage:
    (update-account-persons-person {:account-id example-account-id :person-id example-person-id})"
  [{:keys [account-id person-id]}]
  (stripe-request :post {:endpoint "/v1/accounts/{account-id}/persons/{person-id}" :path-params {:account-id account-id :person-id person-id}}))

(defn delete-account-bank-id
  "Delete an external account

  HTTP Method: DELETE
  Endpoint: /v1/accounts/{account-id}/bank_accounts/{bank-account-id}

  Path Parameters:
    - account-id (String): The account-id parameter. (required)
    - bank-account-id (String): The bank-account-id parameter. (required)

  Example Usage:
    (delete-account-bank-id {:account-id example-account-id :bank-account-id example-bank-account-id})"
  [{:keys [account-id bank-account-id]}]
  (stripe-request :delete {:endpoint "/v1/accounts/{account-id}/bank_accounts/{bank-account-id}" :path-params {:account-id account-id :bank-account-id bank-account-id}}))

(defn retrieve-account-bank-id
  "Retrieve an external account

  HTTP Method: GET
  Endpoint: /v1/accounts/{account-id}/bank_accounts/{bank-account-id}

  Path Parameters:
    - account-id (String): The account-id parameter. (required)
    - bank-account-id (String): The bank-account-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-account-bank-id {:account-id example-account-id :bank-account-id example-bank-account-id :query-params {:limit 10}})"
  [{:keys [account-id bank-account-id query-params]}]
  (stripe-request :get {:endpoint "/v1/accounts/{account-id}/bank_accounts/{bank-account-id}" :path-params {:account-id account-id :bank-account-id bank-account-id} :query-params query-params}))

(defn post-account-bank-id
  "No description available.

  HTTP Method: POST
  Endpoint: /v1/accounts/{account-id}/bank_accounts/{bank-account-id}

  Path Parameters:
    - account-id (String): The account-id parameter. (required)
    - bank-account-id (String): The bank-account-id parameter. (required)

  Example Usage:
    (post-account-bank-id {:account-id example-account-id :bank-account-id example-bank-account-id})"
  [{:keys [account-id bank-account-id]}]
  (stripe-request :post {:endpoint "/v1/accounts/{account-id}/bank_accounts/{bank-account-id}" :path-params {:account-id account-id :bank-account-id bank-account-id}}))

(defn delete-account-people-person
  "Delete a person

  HTTP Method: DELETE
  Endpoint: /v1/accounts/{account-id}/people/{people-id}

  Path Parameters:
    - account-id (String): The account-id parameter. (required)
    - people-id (String): The people-id parameter. (required)

  Example Usage:
    (delete-account-people-person {:account-id example-account-id :people-id example-people-id})"
  [{:keys [account-id people-id]}]
  (stripe-request :delete {:endpoint "/v1/accounts/{account-id}/people/{people-id}" :path-params {:account-id account-id :people-id people-id}}))

(defn retrieve-account-people-person
  "Retrieve a person

  HTTP Method: GET
  Endpoint: /v1/accounts/{account-id}/people/{people-id}

  Path Parameters:
    - account-id (String): The account-id parameter. (required)
    - people-id (String): The people-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-account-people-person {:account-id example-account-id :people-id example-people-id :query-params {:limit 10}})"
  [{:keys [account-id people-id query-params]}]
  (stripe-request :get {:endpoint "/v1/accounts/{account-id}/people/{people-id}" :path-params {:account-id account-id :people-id people-id} :query-params query-params}))

(defn update-account-people-person
  "Update a person

  HTTP Method: POST
  Endpoint: /v1/accounts/{account-id}/people/{people-id}

  Path Parameters:
    - account-id (String): The account-id parameter. (required)
    - people-id (String): The people-id parameter. (required)

  Example Usage:
    (update-account-people-person {:account-id example-account-id :people-id example-people-id})"
  [{:keys [account-id people-id]}]
  (stripe-request :post {:endpoint "/v1/accounts/{account-id}/people/{people-id}" :path-params {:account-id account-id :people-id people-id}}))

(defn list-all-account-people
  "List all persons

  HTTP Method: GET
  Endpoint: /v1/accounts/{account-id}/people

  Path Parameters:
    - account-id (String): The account-id parameter. (required)

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - relationship (Object): Filters on the list of people returned based on the person's relationship to the account's company.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-account-people {:account-id example-account-id :query-params {:limit 10}})"
  [{:keys [account-id query-params]}]
  (stripe-request :get {:endpoint "/v1/accounts/{account-id}/people" :path-params {:account-id account-id} :query-params query-params}))

(defn create-account-people
  "Create a person

  HTTP Method: POST
  Endpoint: /v1/accounts/{account-id}/people

  Path Parameters:
    - account-id (String): The account-id parameter. (required)

  Example Usage:
    (create-account-people {:account-id example-account-id})"
  [{:keys [account-id]}]
  (stripe-request :post {:endpoint "/v1/accounts/{account-id}/people" :path-params {:account-id account-id}}))

(defn delete-account
  "Delete an account

  HTTP Method: DELETE
  Endpoint: /v1/accounts/{account-id}

  Path Parameters:
    - account-id (String): The account-id parameter. (required)

  Example Usage:
    (delete-account {:account-id example-account-id})"
  [{:keys [account-id]}]
  (stripe-request :delete {:endpoint "/v1/accounts/{account-id}" :path-params {:account-id account-id}}))

(defn retrieve-account
  "Retrieve account

  HTTP Method: GET
  Endpoint: /v1/accounts/{account-id}

  Path Parameters:
    - account-id (String): The account-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-account {:account-id example-account-id :query-params {:limit 10}})"
  [{:keys [account-id query-params]}]
  (stripe-request :get {:endpoint "/v1/accounts/{account-id}" :path-params {:account-id account-id} :query-params query-params}))

(defn update-account
  "Update an account

  HTTP Method: POST
  Endpoint: /v1/accounts/{account-id}

  Path Parameters:
    - account-id (String): The account-id parameter. (required)

  Example Usage:
    (update-account {:account-id example-account-id})"
  [{:keys [account-id]}]
  (stripe-request :post {:endpoint "/v1/accounts/{account-id}" :path-params {:account-id account-id}}))

(defn list-all-account-persons
  "List all persons

  HTTP Method: GET
  Endpoint: /v1/accounts/{account-id}/persons

  Path Parameters:
    - account-id (String): The account-id parameter. (required)

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - relationship (Object): Filters on the list of people returned based on the person's relationship to the account's company.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-account-persons {:account-id example-account-id :query-params {:limit 10}})"
  [{:keys [account-id query-params]}]
  (stripe-request :get {:endpoint "/v1/accounts/{account-id}/persons" :path-params {:account-id account-id} :query-params query-params}))

(defn create-account-persons
  "Create a person

  HTTP Method: POST
  Endpoint: /v1/accounts/{account-id}/persons

  Path Parameters:
    - account-id (String): The account-id parameter. (required)

  Example Usage:
    (create-account-persons {:account-id example-account-id})"
  [{:keys [account-id]}]
  (stripe-request :post {:endpoint "/v1/accounts/{account-id}/persons" :path-params {:account-id account-id}}))

(defn retrieve-account-capabilities-capability
  "Retrieve an Account Capability

  HTTP Method: GET
  Endpoint: /v1/accounts/{account-id}/capabilities/{capabilitie-id}

  Path Parameters:
    - account-id (String): The account-id parameter. (required)
    - capabilitie-id (String): The capabilitie-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-account-capabilities-capability {:account-id example-account-id :capabilitie-id example-capabilitie-id :query-params {:limit 10}})"
  [{:keys [account-id capabilitie-id query-params]}]
  (stripe-request :get {:endpoint "/v1/accounts/{account-id}/capabilities/{capabilitie-id}" :path-params {:account-id account-id :capabilitie-id capabilitie-id} :query-params query-params}))

(defn update-account-capabilities-capability
  "Update an Account Capability

  HTTP Method: POST
  Endpoint: /v1/accounts/{account-id}/capabilities/{capabilitie-id}

  Path Parameters:
    - account-id (String): The account-id parameter. (required)
    - capabilitie-id (String): The capabilitie-id parameter. (required)

  Example Usage:
    (update-account-capabilities-capability {:account-id example-account-id :capabilitie-id example-capabilitie-id})"
  [{:keys [account-id capabilitie-id]}]
  (stripe-request :post {:endpoint "/v1/accounts/{account-id}/capabilities/{capabilitie-id}" :path-params {:account-id account-id :capabilitie-id capabilitie-id}}))

(defn list-all-account-capabilities
  "List all account capabilities

  HTTP Method: GET
  Endpoint: /v1/accounts/{account-id}/capabilities

  Path Parameters:
    - account-id (String): The account-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (list-all-account-capabilities {:account-id example-account-id :query-params {:limit 10}})"
  [{:keys [account-id query-params]}]
  (stripe-request :get {:endpoint "/v1/accounts/{account-id}/capabilities" :path-params {:account-id account-id} :query-params query-params}))

(defn create-account-bank
  "Create an external account

  HTTP Method: POST
  Endpoint: /v1/accounts/{account-id}/bank_accounts

  Path Parameters:
    - account-id (String): The account-id parameter. (required)

  Example Usage:
    (create-account-bank {:account-id example-account-id})"
  [{:keys [account-id]}]
  (stripe-request :post {:endpoint "/v1/accounts/{account-id}/bank_accounts" :path-params {:account-id account-id}}))

(defn list-all-account-external
  "List all external accounts

  HTTP Method: GET
  Endpoint: /v1/accounts/{account-id}/external_accounts

  Path Parameters:
    - account-id (String): The account-id parameter. (required)

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - object (String): Filter external accounts according to a particular object type.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.

  Example Usage:
    (list-all-account-external {:account-id example-account-id :query-params {:limit 10}})"
  [{:keys [account-id query-params]}]
  (stripe-request :get {:endpoint "/v1/accounts/{account-id}/external_accounts" :path-params {:account-id account-id} :query-params query-params}))

(defn create-account-external
  "Create an external account

  HTTP Method: POST
  Endpoint: /v1/accounts/{account-id}/external_accounts

  Path Parameters:
    - account-id (String): The account-id parameter. (required)

  Example Usage:
    (create-account-external {:account-id example-account-id})"
  [{:keys [account-id]}]
  (stripe-request :post {:endpoint "/v1/accounts/{account-id}/external_accounts" :path-params {:account-id account-id}}))

(defn delete-account-external-id
  "Delete an external account

  HTTP Method: DELETE
  Endpoint: /v1/accounts/{account-id}/external_accounts/{external-account-id}

  Path Parameters:
    - account-id (String): The account-id parameter. (required)
    - external-account-id (String): The external-account-id parameter. (required)

  Example Usage:
    (delete-account-external-id {:account-id example-account-id :external-account-id example-external-account-id})"
  [{:keys [account-id external-account-id]}]
  (stripe-request :delete {:endpoint "/v1/accounts/{account-id}/external_accounts/{external-account-id}" :path-params {:account-id account-id :external-account-id external-account-id}}))

(defn retrieve-account-external-id
  "Retrieve an external account

  HTTP Method: GET
  Endpoint: /v1/accounts/{account-id}/external_accounts/{external-account-id}

  Path Parameters:
    - account-id (String): The account-id parameter. (required)
    - external-account-id (String): The external-account-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-account-external-id {:account-id example-account-id :external-account-id example-external-account-id :query-params {:limit 10}})"
  [{:keys [account-id external-account-id query-params]}]
  (stripe-request :get {:endpoint "/v1/accounts/{account-id}/external_accounts/{external-account-id}" :path-params {:account-id account-id :external-account-id external-account-id} :query-params query-params}))

(defn post-account-external-id
  "No description available.

  HTTP Method: POST
  Endpoint: /v1/accounts/{account-id}/external_accounts/{external-account-id}

  Path Parameters:
    - account-id (String): The account-id parameter. (required)
    - external-account-id (String): The external-account-id parameter. (required)

  Example Usage:
    (post-account-external-id {:account-id example-account-id :external-account-id example-external-account-id})"
  [{:keys [account-id external-account-id]}]
  (stripe-request :post {:endpoint "/v1/accounts/{account-id}/external_accounts/{external-account-id}" :path-params {:account-id account-id :external-account-id external-account-id}}))

(defn post-account-reject
  "Reject an account

  HTTP Method: POST
  Endpoint: /v1/accounts/{account-id}/reject

  Path Parameters:
    - account-id (String): The account-id parameter. (required)

  Example Usage:
    (post-account-reject {:account-id example-account-id})"
  [{:keys [account-id]}]
  (stripe-request :post {:endpoint "/v1/accounts/{account-id}/reject" :path-params {:account-id account-id}}))