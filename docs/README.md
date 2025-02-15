# Stripe Clojure SDK

The Stripe Clojure (JVM) library provides convenient access to the Stripe API from applications written in the Clojure language. It provides a seamless and idiomatic way for Clojure developers to integrate with Stripe's powerful payment and financial services. It abstracts the complexities of Stripe's API into a well-structured, functional interface, making it easier to process payments, manage subscriptions, and interact with Stripe’s extensive feature set.

This library is automatically generated using Stripe's OpenAPI specification, ensuring up-to-date compatibility with the latest Stripe API features.

> [!CAUTION]
> Alpha (α) : This library is in an early-stage development phase. Names, structures, and functionalities may change as the project evolves. Expect breaking changes before a stable release.

## Rationale 

While Stripe provides a Java SDK, it is designed for object-oriented workflows, requiring developers to write wrappers and modify objects constantly to fit Clojure’s functional programming paradigm. This leads to:

- Unnecessary Complexity – The Java SDK enforces mutability and builder patterns, which are at odds with idiomatic Clojure development.

- Verbose Interop Code – Constant conversions between Java objects and Clojure data structures slow down development and introduce boilerplate.

- Inefficient Workflows – The imperative style of Java SDKs makes composition and data transformation harder in Clojure.

- Missed Opportunities for Idiomatic Clojure Design – A native Clojure SDK allows for seamless integration.

This library follows a similar approach to [Cognitect’s AWS API](https://github.com/cognitect-labs/aws-api), in that it is automatically generated from Stripe’s OpenAPI specification. This ensures that it stays up to date with Stripe’s evolving API, reduces maintenance overhead, and provides a dynamic, data-driven interface for developers.

## Getting Started

This SDK is an auto-generated Clojure library for interacting with the Stripe API. It organizes functions by resource (e.g. customers, coupons, subscriptions, bank accounts, etc.) so you can work with a high-level, idiomatic API without worrying about low-level HTTP calls.

### Installation

Add the dependency to your `deps.edn` (or your preferred build tool) once the artifact is published to Clojars. For example:

```clojure
{:deps {io.github.clojurestream/stripe-clojure {:git/tag "TAG" :git/sha "SHA"}}}
```

### Configuring Your API Key

The SDK uses a dynamic var to hold your Stripe API key. To avoid having to wrap every call in `binding`, you can set the API key globally at startup using the provided `set-api-key` function.

In your project, require the `api` namespace and call `set-api-key`:

```clojure
(ns playground
  (:require [stream.clojure.stripe.api :as stripe]))

;; Set the API key once at startup:
(stripe/set-api-key "sk_live_your_production_key")
```

This ensures that all subsequent calls to the SDK will automatically use your configured API key.

### Example Usage

The SDK organizes functions into resource-specific namespaces. Each function accepts a single map argument using destructuring for required path and query parameters. For example, to work with customers:

```clojure
(ns playground
  (:require
    [stream.clojure.stripe.api :as stripe]
    [stream.clojure.stripe.api.customers :as customers]
    ))

;; Set your API key globally (you can do this in your main entry point)
(stripe/set-api-key "sk_live_your_production_key")

;; List all cards for a customer:
(customers/list-all-customer-cards 
  {:customer-id example-customer-id 
   :query-params {:limit 10}})

;; List all customers:
(customers/list-all
  {:query-params {:limit 10}})
```

Similarly, to work with coupons, subscriptions, or bank accounts, require the respective namespace and call the functions with a map containing the necessary parameters.

## Versioning

Our versioning scheme is designed to clearly communicate both the underlying Stripe API version and the version of our Clojure SDK. Each published artifact is named using the following pattern:

```
stripe-YYYY-MM-DD.<codename>/clojure-sdk-X.Y.Z
```

For example, consider the artifact:

```
stripe-2025-02-24.acacia/clojure-sdk-0.0.6
```

This breaks down as follows:

- **Stripe API Version:**  
  `stripe-2025-02-24.acacia`
  - `2025-02-24` indicates the date/version of the Stripe API used to generate the SDK.
  - `acacia` is a codename that can help identify significant releases or milestones.
    
  Learn more about [Stripe Versioning](https://stripe.com/blog/introducing-stripes-new-api-release-process)


- **SDK Version:**  
  `clj-sdk-0.0.6`
  - This follows standard semantic versioning (X.Y.Z) for our Clojure SDK.
  - Changes to this version reflect updates, bug fixes, or potential breaking changes in our client library, independent of the underlying API.

## Roadmap:

### Phase 1: Prototype
Establish the core architecture and foundational components for API interaction.
- [x] Adopt OpenAPI Specification – Automatically generate API functions to keep up with Stripe’s evolving features.
- [x] Base HTTP Client Implementation – Moved from clj-http.client to Java 11's HttpClient for reliability.

### Phase 2: Alpha (Current Stage)
- [x] Standardized Function Naming – Ensured consistency and idiomatic Clojure practices.
- [x] Improve Developer Experience – Add comprehensive docstrings and REPL-friendly usage guidance.
- [x] Split Functions by Resource - Add ns fod different resource for easier exploration.
- [ ] Error Handling & Logging – Provide structured logging and clear error messages for debugging.
- [x] Configuration - Centralized client configuration that holds :api-key etc.
- [x] Versioning - ensures targeting the correct version of the Stripe API while also tracking the evolution of the Clojure SDK

### Phase 3: Beta 
Feature-complete but may contain bugs; users can provide feedback.
- [ ] Automated Testing & CI/CD Pipelines – Ensure continuous validation of API functionality.
- [ ] Automated Deployment & Distribution – Set up Clojars, GitHub releases, and workflow automation.

#### Early Adopter Phase (Pre-1.0)
The project remains publicly available on GitHub, but this phase marks:
- [ ] A **wider call for contributors** to test and improve the library.
- [ ] **Encouraging community feedback** on API design and usability.
- [ ] The first **stable API draft**, though still subject to refinement.
- [ ] Parameter validation with clojure.spec

#### Release Candidate (RC)
A stable version with a clear versioning scheme to align with Stripe for ease of use.

### Phase 4: Production & Maintenance
- [ ] **General Availability (GA)** – Fully stable, recommended for production use. Continuous monitoring and incremental improvements.

## Contributing

As this project is still in flux, we are currently focusing on improving the design, usability, and overall developer experience of the library. At this time, we welcome your suggestions, ideas, and discussions regarding:

- **API Design & Usability:**  
  How intuitive are the resource-specific namespaces and function signatures? Do the naming conventions (e.g. using operation IDs, converting from camelCase to kebab-case) make sense? What improvements would help your experience using the SDK?

- **Configuration & Versioning:**  
  Are the approaches to configuring the API key (via dynamic vars) and capturing the Stripe API version clear and convenient? How could we improve this aspect?

- **Documentation:**  
  Is the provided documentation (including docstrings with example usages) sufficient? What additional information or examples would help you integrate the SDK into your projects?

At this stage, we're primarily interested in design feedback and suggestions on how to improve the developer experience rather than direct code contributions. Please feel free to open issues or join our discussion on GitHub to share your thoughts.

Before submitting any code contributions, we kindly ask that you discuss your ideas via an issue or a design discussion so that we can align on the project direction.

Thanks!

---