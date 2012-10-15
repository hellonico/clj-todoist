# clj-todoist

5 minutes Clojure wrapper for the todoist API

## Usage

```lisp
(ns clj2.core
 (:require [clj-todoist.core :as todo]))

(todo/login {:email "nico@cloudstudio.co.jp" :password "12345"})
```

## License

Copyright (C) 2012 Nicolas Modrzyk

Distributed under the Eclipse Public License, the same as Clojure.
