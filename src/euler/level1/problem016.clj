(ns euler.level1.problem016
  (:use [euler.common :only [to-digits]]
        [clojure.contrib.math :only [expt]]))

(defn euler-16 [n]
  (reduce + (to-digits (expt 2 n))))
  
