(ns euler.level1.problem016
  (:use [euler.common :only [to-digits]]))

(defn two-to-the [n] 
  (first (drop (dec n) (iterate #(* % 2) 2))))

(defn euler-16 [n]
  (reduce + (to-digits (two-to-the n))))
  
