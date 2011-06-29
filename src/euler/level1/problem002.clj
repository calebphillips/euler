(ns euler.level1.problem002
  (:use [euler.common :only [fib]]))

(defn euler-2 [n]
  (reduce + (filter even? (take-while #(< % n) fib))))
