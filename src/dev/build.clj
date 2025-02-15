(ns build
  (:refer-clojure :exclude [compile])
  (:require
    [clojure.tools.build.api :as b]
    [versions :as v]))

(def lib 'stream.clojure/stripe-clojure)
(def version (format "stripe-%s/clojure-sdk-0.0.%s-alpha" v/stripe-api-version (b/git-count-revs nil)))
(def class-dir "target/classes")
(def jar-file (format "target/%s-%s.jar" (name lib) version))

(def basis (delay (b/create-basis {:project "deps.edn"})))

(defn write-version-file []
  (let [version-file "docs/VERSION"]
    (spit version-file version)
    (println "Wrote version to" version-file)))

(defn clean [_]
  (b/delete {:path "target"}))

(defn compile [_]
  (clean nil)
  (b/copy-dir {:src-dirs ["src"]
               :target-dir class-dir})
  (b/compile-clj {:basis @basis
                  :src-dirs ["src/main"]
                  :class-dir class-dir}))

(defn jar-pom-and-copy []
  (b/write-pom {:class-dir class-dir
                :lib lib
                :version version
                :basis @basis
                :src-dirs ["src/main"]})
  (b/copy-dir {:src-dirs ["src/main"]
               :target-dir class-dir}))

(defn jar [_]
  (compile nil)
  (jar-pom-and-copy)
  (b/jar {:class-dir class-dir
          :jar-file jar-file})
  (write-version-file)
  (println "Built jar:" jar-file))

#_(defn deploy [_]
  (jar nil)
  (let [username (System/getenv "CLOJARS_USERNAME")
        password (System/getenv "CLOJARS_PASSWORD")
        deploy-url "https://clojars.org/repo/"
        response (http/post deploy-url
                   {:multipart [{:name "artifact"
                                 :file jar-file
                                 :mime-type "application/java-archive"}
                                {:name "pom"
                                 :file pom-file
                                 :mime-type "text/xml"}]
                    :basic-auth [username password]
                    :throw-exceptions false})]
    (println "Deploy response:" response)
    (println "Deployed version:" version)))