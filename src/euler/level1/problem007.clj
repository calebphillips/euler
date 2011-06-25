(ns euler.level1.problem007
  (:use [euler.common :only [prime?]]))

(defn euler-7 [n]
  (first 
    (drop (dec n) 
          (filter prime? (iterate inc 2)))))
