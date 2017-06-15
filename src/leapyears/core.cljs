(ns leapyears.core
  (:require [clojure.browser.repl :as repl]
            [goog.dom :as dom]
            [goog.events :as events]
            [cljs.reader :refer (read-string)]))

(defonce conn
  (repl/connect "http://localhost:9000/repl"))

(enable-console-print!)

(def input (dom/getElement "year"))
(def result (dom/getElement "result"))

(defn leap? [year]
  (or (zero? (js-mod year 400))
      (and (pos? (js-mod year 100))
           (zero? (js-mod year 4)))))

(defn on-change [event]
  (let [target (.-target event)
        value (read-string (.-value target))]
    (if (leap? value)
      (set! (.-innerHTML result) "YES")
      (set! (.-innerHTML result) "NO"))))

(events/listen input "keyup" on-change)

(println "Hello world!")
