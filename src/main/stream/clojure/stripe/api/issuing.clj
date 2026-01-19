(ns stream.clojure.stripe.api.issuing
  "Info: This ns is auto-generated from the Stripe OpenAPI spec."
  (:require [stream.clojure.stripe.request :refer [stripe-request]]))


(defn retrieve-disputes-dispute
  "Retrieve a dispute

  HTTP Method: GET
  Endpoint: /v1/issuing/disputes/{dispute-id}

  Path Parameters:
    - dispute-id (String): The dispute-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-disputes-dispute {:dispute-id example-dispute-id :query-params {:limit 10}})"
  [{:keys [dispute-id query-params]}]
  (stripe-request :get {:endpoint "/v1/issuing/disputes/{dispute-id}" :path-params {:dispute-id dispute-id} :query-params query-params}))

(defn update-disputes-dispute
  "Update a dispute

  HTTP Method: POST
  Endpoint: /v1/issuing/disputes/{dispute-id}

  Path Parameters:
    - dispute-id (String): The dispute-id parameter. (required)

  Example Usage:
    (update-disputes-dispute {:dispute-id example-dispute-id})"
  [{:keys [dispute-id body]}]
  (stripe-request :post {:endpoint "/v1/issuing/disputes/{dispute-id}" :path-params {:dispute-id dispute-id} :body body}))

(defn list-all-disputes
  "List all disputes

  HTTP Method: GET
  Endpoint: /v1/issuing/disputes

  Query Parameters:
    - created (Unknown): Only return Issuing disputes that were created during the given date interval.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): Select Issuing disputes with the given status.
    - transaction (String): Select the Issuing dispute for the given transaction.

  Example Usage:
    (list-all-disputes {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/issuing/disputes" :query-params query-params}))

(defn create-disputes
  "Create a dispute

  HTTP Method: POST
  Endpoint: /v1/issuing/disputes

  Example Usage:
    (create-disputes {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/issuing/disputes" :body body}))

(defn post-disputes-dispute-submit
  "Submit a dispute

  HTTP Method: POST
  Endpoint: /v1/issuing/disputes/{dispute-id}/submit

  Path Parameters:
    - dispute-id (String): The dispute-id parameter. (required)

  Example Usage:
    (post-disputes-dispute-submit {:dispute-id example-dispute-id})"
  [{:keys [dispute-id body]}]
  (stripe-request :post {:endpoint "/v1/issuing/disputes/{dispute-id}/submit" :path-params {:dispute-id dispute-id} :body body}))

(defn list-all-tokens
  "List all issuing tokens for card

  HTTP Method: GET
  Endpoint: /v1/issuing/tokens

  Query Parameters:
    - card (String): The Issuing card identifier to list tokens for. (required)
    - created (Unknown): Only return Issuing tokens that were created during the given date interval.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): Select Issuing tokens with the given status.

  Example Usage:
    (list-all-tokens {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/issuing/tokens" :query-params query-params}))

(defn retrieve-personalization-designs-personalization-design
  "Retrieve a personalization design

  HTTP Method: GET
  Endpoint: /v1/issuing/personalization_designs/{personalization-design-id}

  Path Parameters:
    - personalization-design-id (String): The personalization-design-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-personalization-designs-personalization-design {:personalization-design-id example-personalization-design-id :query-params {:limit 10}})"
  [{:keys [personalization-design-id query-params]}]
  (stripe-request :get {:endpoint "/v1/issuing/personalization_designs/{personalization-design-id}" :path-params {:personalization-design-id personalization-design-id} :query-params query-params}))

(defn update-personalization-designs-personalization-design
  "Update a personalization design

  HTTP Method: POST
  Endpoint: /v1/issuing/personalization_designs/{personalization-design-id}

  Path Parameters:
    - personalization-design-id (String): The personalization-design-id parameter. (required)

  Example Usage:
    (update-personalization-designs-personalization-design {:personalization-design-id example-personalization-design-id})"
  [{:keys [personalization-design-id body]}]
  (stripe-request :post {:endpoint "/v1/issuing/personalization_designs/{personalization-design-id}" :path-params {:personalization-design-id personalization-design-id} :body body}))

(defn list-all-cardholders
  "List all cardholders

  HTTP Method: GET
  Endpoint: /v1/issuing/cardholders

  Query Parameters:
    - created (Unknown): Only return cardholders that were created during the given date interval.
    - email (String): Only return cardholders that have the given email address.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - phone-number (String): Only return cardholders that have the given phone number.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): Only return cardholders that have the given status. One of `active`, `inactive`, or `blocked`.
    - type (String): Only return cardholders that have the given type. One of `individual` or `company`.

  Example Usage:
    (list-all-cardholders {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/issuing/cardholders" :query-params query-params}))

(defn create-cardholders
  "Create a cardholder

  HTTP Method: POST
  Endpoint: /v1/issuing/cardholders

  Example Usage:
    (create-cardholders {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/issuing/cardholders" :body body}))

(defn post-authorizations-authorization-decline
  "Decline an authorization

  HTTP Method: POST
  Endpoint: /v1/issuing/authorizations/{authorization-id}/decline

  Path Parameters:
    - authorization-id (String): The authorization-id parameter. (required)

  Example Usage:
    (post-authorizations-authorization-decline {:authorization-id example-authorization-id})"
  [{:keys [authorization-id body]}]
  (stripe-request :post {:endpoint "/v1/issuing/authorizations/{authorization-id}/decline" :path-params {:authorization-id authorization-id} :body body}))

(defn retrieve-authorizations-authorization
  "Retrieve an authorization

  HTTP Method: GET
  Endpoint: /v1/issuing/authorizations/{authorization-id}

  Path Parameters:
    - authorization-id (String): The authorization-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-authorizations-authorization {:authorization-id example-authorization-id :query-params {:limit 10}})"
  [{:keys [authorization-id query-params]}]
  (stripe-request :get {:endpoint "/v1/issuing/authorizations/{authorization-id}" :path-params {:authorization-id authorization-id} :query-params query-params}))

(defn update-authorizations-authorization
  "Update an authorization

  HTTP Method: POST
  Endpoint: /v1/issuing/authorizations/{authorization-id}

  Path Parameters:
    - authorization-id (String): The authorization-id parameter. (required)

  Example Usage:
    (update-authorizations-authorization {:authorization-id example-authorization-id})"
  [{:keys [authorization-id body]}]
  (stripe-request :post {:endpoint "/v1/issuing/authorizations/{authorization-id}" :path-params {:authorization-id authorization-id} :body body}))

(defn list-all-authorizations
  "List all authorizations

  HTTP Method: GET
  Endpoint: /v1/issuing/authorizations

  Query Parameters:
    - card (String): Only return authorizations that belong to the given card.
    - cardholder (String): Only return authorizations that belong to the given cardholder.
    - created (Unknown): Only return authorizations that were created during the given date interval.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): Only return authorizations with the given status. One of `pending`, `closed`, or `reversed`.

  Example Usage:
    (list-all-authorizations {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/issuing/authorizations" :query-params query-params}))

(defn list-all-cards
  "List all cards

  HTTP Method: GET
  Endpoint: /v1/issuing/cards

  Query Parameters:
    - cardholder (String): Only return cards belonging to the Cardholder with the provided ID.
    - created (Unknown): Only return cards that were issued during the given date interval.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - exp-month (Integer): Only return cards that have the given expiration month.
    - exp-year (Integer): Only return cards that have the given expiration year.
    - expand (Array): Specifies which fields in the response should be expanded.
    - last4 (String): Only return cards that have the given last four digits.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - personalization-design (String): The personalization-design parameter.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): Only return cards that have the given status. One of `active`, `inactive`, or `canceled`.
    - type (String): Only return cards that have the given type. One of `virtual` or `physical`.

  Example Usage:
    (list-all-cards {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/issuing/cards" :query-params query-params}))

(defn create-cards
  "Create a card

  HTTP Method: POST
  Endpoint: /v1/issuing/cards

  Example Usage:
    (create-cards {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/issuing/cards" :body body}))

(defn retrieve-transactions-transaction
  "Retrieve a transaction

  HTTP Method: GET
  Endpoint: /v1/issuing/transactions/{transaction-id}

  Path Parameters:
    - transaction-id (String): The transaction-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-transactions-transaction {:transaction-id example-transaction-id :query-params {:limit 10}})"
  [{:keys [transaction-id query-params]}]
  (stripe-request :get {:endpoint "/v1/issuing/transactions/{transaction-id}" :path-params {:transaction-id transaction-id} :query-params query-params}))

(defn update-transactions-transaction
  "Update a transaction

  HTTP Method: POST
  Endpoint: /v1/issuing/transactions/{transaction-id}

  Path Parameters:
    - transaction-id (String): The transaction-id parameter. (required)

  Example Usage:
    (update-transactions-transaction {:transaction-id example-transaction-id})"
  [{:keys [transaction-id body]}]
  (stripe-request :post {:endpoint "/v1/issuing/transactions/{transaction-id}" :path-params {:transaction-id transaction-id} :body body}))

(defn list-all-physical-bundles
  "List all physical bundles

  HTTP Method: GET
  Endpoint: /v1/issuing/physical_bundles

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): Only return physical bundles with the given status.
    - type (String): Only return physical bundles with the given type.

  Example Usage:
    (list-all-physical-bundles {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/issuing/physical_bundles" :query-params query-params}))

(defn retrieve-cards-card
  "Retrieve a card

  HTTP Method: GET
  Endpoint: /v1/issuing/cards/{card-id}

  Path Parameters:
    - card-id (String): The card-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-cards-card {:card-id example-card-id :query-params {:limit 10}})"
  [{:keys [card-id query-params]}]
  (stripe-request :get {:endpoint "/v1/issuing/cards/{card-id}" :path-params {:card-id card-id} :query-params query-params}))

(defn update-cards-card
  "Update a card

  HTTP Method: POST
  Endpoint: /v1/issuing/cards/{card-id}

  Path Parameters:
    - card-id (String): The card-id parameter. (required)

  Example Usage:
    (update-cards-card {:card-id example-card-id})"
  [{:keys [card-id body]}]
  (stripe-request :post {:endpoint "/v1/issuing/cards/{card-id}" :path-params {:card-id card-id} :body body}))

(defn list-all-transactions
  "List all transactions

  HTTP Method: GET
  Endpoint: /v1/issuing/transactions

  Query Parameters:
    - card (String): Only return transactions that belong to the given card.
    - cardholder (String): Only return transactions that belong to the given cardholder.
    - created (Unknown): Only return transactions that were created during the given date interval.
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - type (String): Only return transactions that have the given type. One of `capture` or `refund`.

  Example Usage:
    (list-all-transactions {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/issuing/transactions" :query-params query-params}))

(defn list-all-personalization-designs
  "List all personalization designs

  HTTP Method: GET
  Endpoint: /v1/issuing/personalization_designs

  Query Parameters:
    - ending-before (String): A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
    - expand (Array): Specifies which fields in the response should be expanded.
    - limit (Integer): A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    - lookup-keys (Array): Only return personalization designs with the given lookup keys.
    - preferences (Object): Only return personalization designs with the given preferences.
    - starting-after (String): A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
    - status (String): Only return personalization designs with the given status.

  Example Usage:
    (list-all-personalization-designs {:query-params {:limit 10}})"
  [{:keys [query-params]}]
  (stripe-request :get {:endpoint "/v1/issuing/personalization_designs" :query-params query-params}))

(defn create-personalization-designs
  "Create a personalization design

  HTTP Method: POST
  Endpoint: /v1/issuing/personalization_designs

  Example Usage:
    (create-personalization-designs {})"
  [{:keys [body]}]
  (stripe-request :post {:endpoint "/v1/issuing/personalization_designs" :body body}))

(defn retrieve-physical-bundles-physical-bundle
  "Retrieve a physical bundle

  HTTP Method: GET
  Endpoint: /v1/issuing/physical_bundles/{physical-bundle-id}

  Path Parameters:
    - physical-bundle-id (String): The physical-bundle-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-physical-bundles-physical-bundle {:physical-bundle-id example-physical-bundle-id :query-params {:limit 10}})"
  [{:keys [physical-bundle-id query-params]}]
  (stripe-request :get {:endpoint "/v1/issuing/physical_bundles/{physical-bundle-id}" :path-params {:physical-bundle-id physical-bundle-id} :query-params query-params}))

(defn retrieve-cardholders-cardholder
  "Retrieve a cardholder

  HTTP Method: GET
  Endpoint: /v1/issuing/cardholders/{cardholder-id}

  Path Parameters:
    - cardholder-id (String): The cardholder-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-cardholders-cardholder {:cardholder-id example-cardholder-id :query-params {:limit 10}})"
  [{:keys [cardholder-id query-params]}]
  (stripe-request :get {:endpoint "/v1/issuing/cardholders/{cardholder-id}" :path-params {:cardholder-id cardholder-id} :query-params query-params}))

(defn update-cardholders-cardholder
  "Update a cardholder

  HTTP Method: POST
  Endpoint: /v1/issuing/cardholders/{cardholder-id}

  Path Parameters:
    - cardholder-id (String): The cardholder-id parameter. (required)

  Example Usage:
    (update-cardholders-cardholder {:cardholder-id example-cardholder-id})"
  [{:keys [cardholder-id body]}]
  (stripe-request :post {:endpoint "/v1/issuing/cardholders/{cardholder-id}" :path-params {:cardholder-id cardholder-id} :body body}))

(defn post-authorizations-authorization-approve
  "Approve an authorization

  HTTP Method: POST
  Endpoint: /v1/issuing/authorizations/{authorization-id}/approve

  Path Parameters:
    - authorization-id (String): The authorization-id parameter. (required)

  Example Usage:
    (post-authorizations-authorization-approve {:authorization-id example-authorization-id})"
  [{:keys [authorization-id body]}]
  (stripe-request :post {:endpoint "/v1/issuing/authorizations/{authorization-id}/approve" :path-params {:authorization-id authorization-id} :body body}))

(defn retrieve-settlements-settlement
  "Retrieve a settlement

  HTTP Method: GET
  Endpoint: /v1/issuing/settlements/{settlement-id}

  Path Parameters:
    - settlement-id (String): The settlement-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-settlements-settlement {:settlement-id example-settlement-id :query-params {:limit 10}})"
  [{:keys [settlement-id query-params]}]
  (stripe-request :get {:endpoint "/v1/issuing/settlements/{settlement-id}" :path-params {:settlement-id settlement-id} :query-params query-params}))

(defn update-settlements-settlement
  "Update a settlement

  HTTP Method: POST
  Endpoint: /v1/issuing/settlements/{settlement-id}

  Path Parameters:
    - settlement-id (String): The settlement-id parameter. (required)

  Example Usage:
    (update-settlements-settlement {:settlement-id example-settlement-id})"
  [{:keys [settlement-id body]}]
  (stripe-request :post {:endpoint "/v1/issuing/settlements/{settlement-id}" :path-params {:settlement-id settlement-id} :body body}))

(defn retrieve-tokens-token
  "Retrieve an issuing token

  HTTP Method: GET
  Endpoint: /v1/issuing/tokens/{token-id}

  Path Parameters:
    - token-id (String): The token-id parameter. (required)

  Query Parameters:
    - expand (Array): Specifies which fields in the response should be expanded.

  Example Usage:
    (retrieve-tokens-token {:token-id example-token-id :query-params {:limit 10}})"
  [{:keys [token-id query-params]}]
  (stripe-request :get {:endpoint "/v1/issuing/tokens/{token-id}" :path-params {:token-id token-id} :query-params query-params}))

(defn update-tokens-token
  "Update a token status

  HTTP Method: POST
  Endpoint: /v1/issuing/tokens/{token-id}

  Path Parameters:
    - token-id (String): The token-id parameter. (required)

  Example Usage:
    (update-tokens-token {:token-id example-token-id})"
  [{:keys [token-id body]}]
  (stripe-request :post {:endpoint "/v1/issuing/tokens/{token-id}" :path-params {:token-id token-id} :body body}))