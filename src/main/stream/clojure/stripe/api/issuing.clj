(ns stream.clojure.stripe.api.issuing
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:refer-clojure :exclude [list get update])
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-disputes-dispute [{:keys [dispute-id query-params]}]
  "Retrieve a dispute

  HTTP Method: GET
  Endpoint: /v1/issuing/disputes/{dispute-id}

  Path Parameters:
    - dispute-id: The dispute-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-disputes-dispute {:dispute-id example-dispute-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/issuing/disputes/{dispute-id}" :path-params {:dispute-id dispute-id} :query-params query-params}))

(defn update-disputes-dispute [{:keys [dispute-id]}]
  "Update a dispute

  HTTP Method: POST
  Endpoint: /v1/issuing/disputes/{dispute-id}

  Path Parameters:
    - dispute-id: The dispute-id parameter. (required) [type: string]

  Example Usage:
    (update-disputes-dispute {:dispute-id example-dispute-id})"
  (stripe-request :post {:endpoint "/v1/issuing/disputes/{dispute-id}" :path-params {:dispute-id dispute-id}}))

(defn list-all-disputes [{:keys [query-params]}]
  "List all disputes

  HTTP Method: GET
  Endpoint: /v1/issuing/disputes

  Query Parameters:
    - created: Only return Issuing disputes that were created during the given date interval. [type: unknown]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - status: Select Issuing disputes with the given status. [type: string]
    - transaction: Select the Issuing dispute for the given transaction. [type: string]

  Example Usage:
    (list-all-disputes {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/issuing/disputes" :query-params query-params}))

(defn create-disputes [{:keys []}]
  "Create a dispute

  HTTP Method: POST
  Endpoint: /v1/issuing/disputes

  Example Usage:
    (create-disputes {})"
  (stripe-request :post {:endpoint "/v1/issuing/disputes"}))

(defn post-disputes-dispute-submit [{:keys [dispute-id]}]
  "Submit a dispute

  HTTP Method: POST
  Endpoint: /v1/issuing/disputes/{dispute-id}/submit

  Path Parameters:
    - dispute-id: The dispute-id parameter. (required) [type: string]

  Example Usage:
    (post-disputes-dispute-submit {:dispute-id example-dispute-id})"
  (stripe-request :post {:endpoint "/v1/issuing/disputes/{dispute-id}/submit" :path-params {:dispute-id dispute-id}}))

(defn list-all-tokens [{:keys [query-params]}]
  "List all issuing tokens for card

  HTTP Method: GET
  Endpoint: /v1/issuing/tokens

  Query Parameters:
    - card: The Issuing card identifier to list tokens for. (required) [type: string]
    - created: Only return Issuing tokens that were created during the given date interval. [type: unknown]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - status: Select Issuing tokens with the given status. [type: string]

  Example Usage:
    (list-all-tokens {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/issuing/tokens" :query-params query-params}))

(defn retrieve-personalization-designs-personalization-design [{:keys [personalization-design-id query-params]}]
  "Retrieve a personalization design

  HTTP Method: GET
  Endpoint: /v1/issuing/personalization_designs/{personalization-design-id}

  Path Parameters:
    - personalization-design-id: The personalization-design-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-personalization-designs-personalization-design {:personalization-design-id example-personalization-design-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/issuing/personalization_designs/{personalization-design-id}" :path-params {:personalization-design-id personalization-design-id} :query-params query-params}))

(defn update-personalization-designs-personalization-design [{:keys [personalization-design-id]}]
  "Update a personalization design

  HTTP Method: POST
  Endpoint: /v1/issuing/personalization_designs/{personalization-design-id}

  Path Parameters:
    - personalization-design-id: The personalization-design-id parameter. (required) [type: string]

  Example Usage:
    (update-personalization-designs-personalization-design {:personalization-design-id example-personalization-design-id})"
  (stripe-request :post {:endpoint "/v1/issuing/personalization_designs/{personalization-design-id}" :path-params {:personalization-design-id personalization-design-id}}))

(defn list-all-cardholders [{:keys [query-params]}]
  "List all cardholders

  HTTP Method: GET
  Endpoint: /v1/issuing/cardholders

  Query Parameters:
    - created: Only return cardholders that were created during the given date interval. [type: unknown]
    - email: Only return cardholders that have the given email address. [type: string]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - phone-number: Only return cardholders that have the given phone number. [type: string]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - status: Only return cardholders that have the given status. One of `active`, `inactive`, or `blocked`. [type: string]
    - type: Only return cardholders that have the given type. One of `individual` or `company`. [type: string]

  Example Usage:
    (list-all-cardholders {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/issuing/cardholders" :query-params query-params}))

(defn create-cardholders [{:keys []}]
  "Create a cardholder

  HTTP Method: POST
  Endpoint: /v1/issuing/cardholders

  Example Usage:
    (create-cardholders {})"
  (stripe-request :post {:endpoint "/v1/issuing/cardholders"}))

(defn post-authorizations-authorization-decline [{:keys [authorization-id]}]
  "Decline an authorization

  HTTP Method: POST
  Endpoint: /v1/issuing/authorizations/{authorization-id}/decline

  Path Parameters:
    - authorization-id: The authorization-id parameter. (required) [type: string]

  Example Usage:
    (post-authorizations-authorization-decline {:authorization-id example-authorization-id})"
  (stripe-request :post {:endpoint "/v1/issuing/authorizations/{authorization-id}/decline" :path-params {:authorization-id authorization-id}}))

(defn retrieve-authorizations-authorization [{:keys [authorization-id query-params]}]
  "Retrieve an authorization

  HTTP Method: GET
  Endpoint: /v1/issuing/authorizations/{authorization-id}

  Path Parameters:
    - authorization-id: The authorization-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-authorizations-authorization {:authorization-id example-authorization-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/issuing/authorizations/{authorization-id}" :path-params {:authorization-id authorization-id} :query-params query-params}))

(defn update-authorizations-authorization [{:keys [authorization-id]}]
  "Update an authorization

  HTTP Method: POST
  Endpoint: /v1/issuing/authorizations/{authorization-id}

  Path Parameters:
    - authorization-id: The authorization-id parameter. (required) [type: string]

  Example Usage:
    (update-authorizations-authorization {:authorization-id example-authorization-id})"
  (stripe-request :post {:endpoint "/v1/issuing/authorizations/{authorization-id}" :path-params {:authorization-id authorization-id}}))

(defn list-all-authorizations [{:keys [query-params]}]
  "List all authorizations

  HTTP Method: GET
  Endpoint: /v1/issuing/authorizations

  Query Parameters:
    - card: Only return authorizations that belong to the given card. [type: string]
    - cardholder: Only return authorizations that belong to the given cardholder. [type: string]
    - created: Only return authorizations that were created during the given date interval. [type: unknown]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - status: Only return authorizations with the given status. One of `pending`, `closed`, or `reversed`. [type: string]

  Example Usage:
    (list-all-authorizations {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/issuing/authorizations" :query-params query-params}))

(defn list-all-cards [{:keys [query-params]}]
  "List all cards

  HTTP Method: GET
  Endpoint: /v1/issuing/cards

  Query Parameters:
    - cardholder: Only return cards belonging to the Cardholder with the provided ID. [type: string]
    - created: Only return cards that were issued during the given date interval. [type: unknown]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - exp-month: Only return cards that have the given expiration month. [type: integer]
    - exp-year: Only return cards that have the given expiration year. [type: integer]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - last4: Only return cards that have the given last four digits. [type: string]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - personalization-design: The personalization-design parameter. [type: string]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - status: Only return cards that have the given status. One of `active`, `inactive`, or `canceled`. [type: string]
    - type: Only return cards that have the given type. One of `virtual` or `physical`. [type: string]

  Example Usage:
    (list-all-cards {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/issuing/cards" :query-params query-params}))

(defn create-cards [{:keys []}]
  "Create a card

  HTTP Method: POST
  Endpoint: /v1/issuing/cards

  Example Usage:
    (create-cards {})"
  (stripe-request :post {:endpoint "/v1/issuing/cards"}))

(defn retrieve-transactions-transaction [{:keys [transaction-id query-params]}]
  "Retrieve a transaction

  HTTP Method: GET
  Endpoint: /v1/issuing/transactions/{transaction-id}

  Path Parameters:
    - transaction-id: The transaction-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-transactions-transaction {:transaction-id example-transaction-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/issuing/transactions/{transaction-id}" :path-params {:transaction-id transaction-id} :query-params query-params}))

(defn update-transactions-transaction [{:keys [transaction-id]}]
  "Update a transaction

  HTTP Method: POST
  Endpoint: /v1/issuing/transactions/{transaction-id}

  Path Parameters:
    - transaction-id: The transaction-id parameter. (required) [type: string]

  Example Usage:
    (update-transactions-transaction {:transaction-id example-transaction-id})"
  (stripe-request :post {:endpoint "/v1/issuing/transactions/{transaction-id}" :path-params {:transaction-id transaction-id}}))

(defn list-all-physical-bundles [{:keys [query-params]}]
  "List all physical bundles

  HTTP Method: GET
  Endpoint: /v1/issuing/physical_bundles

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - status: Only return physical bundles with the given status. [type: string]
    - type: Only return physical bundles with the given type. [type: string]

  Example Usage:
    (list-all-physical-bundles {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/issuing/physical_bundles" :query-params query-params}))

(defn retrieve-cards-card [{:keys [card-id query-params]}]
  "Retrieve a card

  HTTP Method: GET
  Endpoint: /v1/issuing/cards/{card-id}

  Path Parameters:
    - card-id: The card-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-cards-card {:card-id example-card-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/issuing/cards/{card-id}" :path-params {:card-id card-id} :query-params query-params}))

(defn update-cards-card [{:keys [card-id]}]
  "Update a card

  HTTP Method: POST
  Endpoint: /v1/issuing/cards/{card-id}

  Path Parameters:
    - card-id: The card-id parameter. (required) [type: string]

  Example Usage:
    (update-cards-card {:card-id example-card-id})"
  (stripe-request :post {:endpoint "/v1/issuing/cards/{card-id}" :path-params {:card-id card-id}}))

(defn list-all-transactions [{:keys [query-params]}]
  "List all transactions

  HTTP Method: GET
  Endpoint: /v1/issuing/transactions

  Query Parameters:
    - card: Only return transactions that belong to the given card. [type: string]
    - cardholder: Only return transactions that belong to the given cardholder. [type: string]
    - created: Only return transactions that were created during the given date interval. [type: unknown]
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - type: Only return transactions that have the given type. One of `capture` or `refund`. [type: string]

  Example Usage:
    (list-all-transactions {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/issuing/transactions" :query-params query-params}))

(defn list-all-personalization-designs [{:keys [query-params]}]
  "List all personalization designs

  HTTP Method: GET
  Endpoint: /v1/issuing/personalization_designs

  Query Parameters:
    - ending-before: A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list. [type: string]
    - expand: Specifies which fields in the response should be expanded. [type: array]
    - limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10. [type: integer]
    - lookup-keys: Only return personalization designs with the given lookup keys. [type: array]
    - preferences: Only return personalization designs with the given preferences. [type: object]
    - starting-after: A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list. [type: string]
    - status: Only return personalization designs with the given status. [type: string]

  Example Usage:
    (list-all-personalization-designs {:query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/issuing/personalization_designs" :query-params query-params}))

(defn create-personalization-designs [{:keys []}]
  "Create a personalization design

  HTTP Method: POST
  Endpoint: /v1/issuing/personalization_designs

  Example Usage:
    (create-personalization-designs {})"
  (stripe-request :post {:endpoint "/v1/issuing/personalization_designs"}))

(defn retrieve-physical-bundles-physical-bundle [{:keys [physical-bundle-id query-params]}]
  "Retrieve a physical bundle

  HTTP Method: GET
  Endpoint: /v1/issuing/physical_bundles/{physical-bundle-id}

  Path Parameters:
    - physical-bundle-id: The physical-bundle-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-physical-bundles-physical-bundle {:physical-bundle-id example-physical-bundle-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/issuing/physical_bundles/{physical-bundle-id}" :path-params {:physical-bundle-id physical-bundle-id} :query-params query-params}))

(defn retrieve-cardholders-cardholder [{:keys [cardholder-id query-params]}]
  "Retrieve a cardholder

  HTTP Method: GET
  Endpoint: /v1/issuing/cardholders/{cardholder-id}

  Path Parameters:
    - cardholder-id: The cardholder-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-cardholders-cardholder {:cardholder-id example-cardholder-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/issuing/cardholders/{cardholder-id}" :path-params {:cardholder-id cardholder-id} :query-params query-params}))

(defn update-cardholders-cardholder [{:keys [cardholder-id]}]
  "Update a cardholder

  HTTP Method: POST
  Endpoint: /v1/issuing/cardholders/{cardholder-id}

  Path Parameters:
    - cardholder-id: The cardholder-id parameter. (required) [type: string]

  Example Usage:
    (update-cardholders-cardholder {:cardholder-id example-cardholder-id})"
  (stripe-request :post {:endpoint "/v1/issuing/cardholders/{cardholder-id}" :path-params {:cardholder-id cardholder-id}}))

(defn post-authorizations-authorization-approve [{:keys [authorization-id]}]
  "Approve an authorization

  HTTP Method: POST
  Endpoint: /v1/issuing/authorizations/{authorization-id}/approve

  Path Parameters:
    - authorization-id: The authorization-id parameter. (required) [type: string]

  Example Usage:
    (post-authorizations-authorization-approve {:authorization-id example-authorization-id})"
  (stripe-request :post {:endpoint "/v1/issuing/authorizations/{authorization-id}/approve" :path-params {:authorization-id authorization-id}}))

(defn retrieve-settlements-settlement [{:keys [settlement-id query-params]}]
  "Retrieve a settlement

  HTTP Method: GET
  Endpoint: /v1/issuing/settlements/{settlement-id}

  Path Parameters:
    - settlement-id: The settlement-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-settlements-settlement {:settlement-id example-settlement-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/issuing/settlements/{settlement-id}" :path-params {:settlement-id settlement-id} :query-params query-params}))

(defn update-settlements-settlement [{:keys [settlement-id]}]
  "Update a settlement

  HTTP Method: POST
  Endpoint: /v1/issuing/settlements/{settlement-id}

  Path Parameters:
    - settlement-id: The settlement-id parameter. (required) [type: string]

  Example Usage:
    (update-settlements-settlement {:settlement-id example-settlement-id})"
  (stripe-request :post {:endpoint "/v1/issuing/settlements/{settlement-id}" :path-params {:settlement-id settlement-id}}))

(defn retrieve-tokens-token [{:keys [token-id query-params]}]
  "Retrieve an issuing token

  HTTP Method: GET
  Endpoint: /v1/issuing/tokens/{token-id}

  Path Parameters:
    - token-id: The token-id parameter. (required) [type: string]

  Query Parameters:
    - expand: Specifies which fields in the response should be expanded. [type: array]

  Example Usage:
    (retrieve-tokens-token {:token-id example-token-id :query-params {:limit 10}})"
  (stripe-request :get {:endpoint "/v1/issuing/tokens/{token-id}" :path-params {:token-id token-id} :query-params query-params}))

(defn update-tokens-token [{:keys [token-id]}]
  "Update a token status

  HTTP Method: POST
  Endpoint: /v1/issuing/tokens/{token-id}

  Path Parameters:
    - token-id: The token-id parameter. (required) [type: string]

  Example Usage:
    (update-tokens-token {:token-id example-token-id})"
  (stripe-request :post {:endpoint "/v1/issuing/tokens/{token-id}" :path-params {:token-id token-id}}))