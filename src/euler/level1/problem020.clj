(ns euler.level1.problem020
  (:use [euler.common :only [to-digits]]))

(defn factorial [n]
  (loop [n n acc 1]
    (if (= n 1)
      acc
      (recur (dec n) (* acc n)))))

(defn euler-20 
  "Returns the sum of the digits in the number 100!"
  [n]
  (reduce + (to-digits (factorial n))))
