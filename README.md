# clj-todoist

5 minutes Clojure wrapper for the todoist API

All the methods defined in that page can be used:
[http://todoist.com/API/help]

## Usage

In your project.clj:
```clojure
[clj-todoist "1.0.0"]
```

Then in your code:
```clojure
(ns clj2.core
 (:require [clj-todoist.core :as todo]))

(todo/login {:email "nico@cloudstudio.co.jp" :password "12345"})

(todo/getProjects {})

(todo/addItem {:project_id 123 :content "test item"})
```

## License

Copyright (C) 2012 Nicolas Modrzyk

Distributed under the Eclipse Public License, the same as Clojure.
