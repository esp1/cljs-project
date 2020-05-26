(ns {{namespace}}.app
  (:require [helix.core :refer [defnc $]]
            [helix.dom :as d]
            ["react-dom" :as rdom]))

(defnc app []
  (d/div {:class ["h-screen"
                  "flex"
                  "justify-center"
                  "items-center"
                  "text-6xl"]}
         "{{namespace}}"))

(defn render []
  (rdom/render ($ app) (js/document.getElementById "root")))

(defn init! []
  (println "init!")
  (render))

(defn ^:dev/before-load stop []
  (println "stop"))

(defn ^:dev/after-load start []
  (println "start")
  (render))