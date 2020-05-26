(ns clj.new.cljs-project
  (:require [clj.new.templates :refer [renderer project-data ->files]]))

(defn cljs-project
  "FIXME: write documentation"
  [name]
  (let [render (renderer "cljs-project")
        data   (project-data name)]
    (println "Generating cljs project:" name)
    (->files data
             ["deps.edn" (render "deps.edn" data)]
             ["package.json" (render "package.json" data)]
             ["shadow-cljs.edn" (render "shadow-cljs.edn" data)]
             ["tailwind.config.js" (render "tailwind.config.js" data)]
             ["public/index.html" (render "index.html" data)]
             ["src/{{nested-dirs}}/app.cljs" (render "app.cljs" data)]
             ["src/styles.css" (render "styles.css" data)])))
