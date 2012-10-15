(ns clj-todoist.test.core
  (:use [clj-todoist.core])
  (:use midje.sweet)
  (:use [clojure.test]))

(def creds {:email "nico@cloudstudio.co.jp" :password "12345"})

(fact "I-can-login"  (login creds) => truthy)
(fact "can get list of projects" (getProjects {}) => truthy)

(def lastp (last (getProjects {})))
(fact "can list uncompleted items" (getUncompletedItems {:project_id (lastp :id)}) => truthy)
(fact "can add item" (addItem {:project_id (lastp :id) :content "test item"}) => truthy)