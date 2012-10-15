(defproject clj-todoist "1.0.0"
  :description "A quick api to interact with todoist"
  :dev-dependencies [
   [midje "1.4.0"]
   [com.stuartsierra/lazytest "1.2.3"]]
  :repositories {"stuart" "http://stuartsierra.com/maven2"}
  :dependencies [
   [clj-http "0.5.5"]
   [cheshire "4.0.3"]
   [org.clojure/clojure "1.4.0"]
  ])


; Inspiring resources

; http://todoist.com/API/help
; https://github.com/dakrone/clj-http
; https://github.com/dakrone/cheshire
; http://stackoverflow.com/questions/678867/how-to-defn-a-function-from-string-in-clojure?rq=1