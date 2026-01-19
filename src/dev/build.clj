(ns build
  (:refer-clojure :exclude [compile])
  (:require
    [clojure.tools.build.api :as b]
    [deps-deploy.deps-deploy :as dd]
    [versions :as v]))

(def lib 'stream.clojure/stripe-clojure)
(def class-dir "target/classes")

(defn- version-string
  "Generates version string. If :version is provided, uses it directly.
   Otherwise generates from Stripe API version and git commit count."
  [opts]
  (or (:version opts)
      (format "stripe-%s/clojure-sdk-0.0.%s-alpha"
              v/stripe-api-version
              (b/git-count-revs nil))))

(defn- jar-file [version]
  (format "target/%s-%s.jar" (name lib) version))

(def basis (delay (b/create-basis {:project "deps.edn"})))

(defn clean
  "Delete the target directory."
  [_]
  (b/delete {:path "target"}))

(defn compile
  "Compile Clojure source files."
  [_]
  (b/copy-dir {:src-dirs ["src/main"]
               :target-dir class-dir}))

(defn jar
  "Build the JAR file.
   Options:
     :version - Version string (optional, auto-generated if not provided)"
  [opts]
  (clean nil)
  (let [version (version-string opts)
        jar-path (jar-file version)]
    (compile nil)
    (b/write-pom {:class-dir class-dir
                  :lib lib
                  :version version
                  :basis @basis
                  :src-dirs ["src/main"]
                  :scm {:url "https://github.com/clojurestream/stripe-clojure"
                        :connection "scm:git:git://github.com/clojurestream/stripe-clojure.git"
                        :developerConnection "scm:git:ssh://git@github.com/clojurestream/stripe-clojure.git"
                        :tag (str "v" version)}
                  :pom-data [[:description "Clojure SDK for the Stripe API"]
                             [:url "https://github.com/clojurestream/stripe-clojure"]
                             [:licenses
                              [:license
                               [:name "MIT License"]
                               [:url "https://opensource.org/licenses/MIT"]]]]})
    (b/copy-dir {:src-dirs ["src/main"]
                 :target-dir class-dir})
    (b/jar {:class-dir class-dir
            :jar-file jar-path})
    (println "Built JAR:" jar-path)
    {:jar-file jar-path :version version}))

(defn deploy
  "Deploy to Clojars.
   Options:
     :version - Version string (optional, auto-generated if not provided)

   Requires CLOJARS_USERNAME and CLOJARS_PASSWORD environment variables."
  [opts]
  (let [{:keys [jar-file version]} (jar opts)]
    (dd/deploy {:installer :remote
                :artifact (b/resolve-path jar-file)
                :pom-file (b/pom-path {:lib lib :class-dir class-dir})})
    (println "Deployed to Clojars:" lib version)))
