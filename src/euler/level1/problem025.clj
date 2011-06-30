(ns euler.level1.problem025
  (:use [euler.common :only [fib]]
        [clojure.contrib.math :only [expt]]))

(def indexed-fib (map vector (iterate inc 1) fib))

(defn euler-25 
  "Returns the first term in the fiobnacci sequence to contain n digits"
  [n]
  (let [first-with-n (expt 10 (dec n))
        fewer-than-n (fn [[_ val]] (< val first-with-n))]
    (ffirst (drop-while 
              fewer-than-n
              indexed-fib)))
  )
