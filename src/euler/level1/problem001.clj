(ns euler.level1.problem001
  (:use [euler.common :only [divides?]]))

(defn divides-any? [& divisors]
  (fn [n] (some #(divides? n %) divisors)))  

(defn euler-1 [upper-bound]
  (reduce + (filter (divides-any? 3 5) (range 1 upper-bound))))

