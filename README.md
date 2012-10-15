# clj-todoist

5 minutes Clojure wrapper for the todoist API

## Usage

```clojure
(ns clj2.core
 (:require [clj-todoist.core :as todo]))

(todo/login {:email "nico@cloudstudio.co.jp" :password "12345"})

(todo/getProjects {})

(addItem {:project_id 123 :content "test item"})
```

## License

Copyright (C) 2012 Nicolas Modrzyk

Distributed under the Eclipse Public License, the same as Clojure.
