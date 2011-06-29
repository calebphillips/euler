(ns euler.level1.problem025
  (:use [euler.common :only [fib]]
        [clojure.contrib.math :only [expt]]))

(defn euler-25 [n]
  (let [at-least (expt 10 (dec n))]
    (ffirst (drop-while #(< (second %) at-least) 
                     (map vector (iterate inc 1) fib))))
  )
