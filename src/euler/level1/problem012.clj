(ns euler.level1.problem012
  (:use [euler.common :only [count-factors]]))

(def tri-nums
  (map second
       (iterate (fn [[n sum]] [(inc n) (+ sum (inc n))]) [1 1])))

(defn euler-12 [num-factors]
  (ffirst
    (filter #(> (second %) num-factors)
            (map (fn [t] [t (count-factors t)]) tri-nums)))
  )
