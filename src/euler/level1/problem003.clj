(ns euler.level1.problem003
  (:use [clojure.contrib.math :only [sqrt]]
        [euler.common :only [prime? divides? upto-sqrt]]))

(defn factors [n]
  (filter #(divides? n %) (upto-sqrt n)))

(defn euler-3 [n]
  (reduce max (filter prime? (factors n))))
