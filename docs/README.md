# Stripe Clojure Library

The Stripe Clojure (JVM) library provides convenient access to the Stripe API from applications written in the Clojure language. It provides a seamless and idiomatic way for Clojure developers to integrate with Stripe's powerful payment and financial services. It abstracts the complexities of Stripe's API into a well-structured, functional interface, making it easier to process payments, manage subscriptions, and interact with Stripe’s extensive feature set.

This library is automatically generated using Stripe's OpenAPI specification, ensuring up-to-date compatibility with the latest Stripe API features.

> ⚠️ ALPHA : This library is in an early-stage development phase. Names, structures, and functionalities may change as the project evolves. Expect breaking changes before a stable release.

## Rationale 

While Stripe provides a Java SDK, it is designed for object-oriented workflows, requiring developers to write wrappers and modify objects constantly to fit Clojure’s functional programming paradigm. This leads to:

- Unnecessary Complexity – The Java SDK enforces mutability and builder patterns, which are at odds with idiomatic Clojure development.

- Verbose Interop Code – Constant conversions between Java objects and Clojure data structures slow down development and introduce boilerplate.

- Inefficient Workflows – The imperative style of Java SDKs makes composition and data transformation harder in Clojure.

- Missed Opportunities for Idiomatic Clojure Design – A native Clojure SDK allows for seamless integration.

This library follows a similar approach to [Cognitect’s AWS API](https://github.com/cognitect-labs/aws-api), in that it is automatically generated from Stripe’s OpenAPI specification. This ensures that it stays up to date with Stripe’s evolving API, reduces maintenance overhead, and provides a dynamic, data-driven interface for developers.
## Roadmap:

### Phase 1: Prototype
Establish the core architecture and foundational components for API interaction.
- [x] Adopt OpenAPI Specification – Automatically generate API functions to keep up with Stripe’s evolving features.
- [x] Base HTTP Client Implementation – Moved from clj-http.client to Java 11's HttpClient for reliability.

### Phase 2: Beta (Current Stage)
Feature-complete but may contain bugs; users can provide feedback.
- [x] Standardized Function Naming – Ensured consistency and idiomatic Clojure practices.
- [x] Improve Developer Experience – Add comprehensive docstrings and REPL-friendly usage guidance.
- [x] Split Functions by Resource - Add ns fod different resource for easier exploration.
- [ ] Error Handling & Logging – Provide structured logging and clear error messages for debugging.
- [ ] Automated Testing & CI/CD Pipelines – Ensure continuous validation of API functionality.
- [ ] Automated Deployment & Distribution – Set up Clojars, GitHub releases, and workflow automation.

#### Early Adopter Phase (Pre-1.0)
The project remains publicly available on GitHub, but this phase marks:
- [ ] A **wider call for contributors** to test and improve the library.
- [ ] **Encouraging community feedback** on API design and usability.
- [ ] The first **stable API draft**, though still subject to refinement.

#### Release Candidate (RC)
A stable version with a clear versioning scheme to align with Stripe for ease of use.

### Phase 3: Production & Maintenance
- [ ] **General Availability (GA)** – Fully stable, recommended for production use. Continuous monitoring and incremental improvements.
- [ ] **Long-Term Support (LTS)** – Establish a maintenance strategy with security updates, Stripe API alignment, and clear deprecation policies.
- [ ] **Community Engagement** – Encourage contributions, provide issue resolution, and evolve the library based on real-world usage.
