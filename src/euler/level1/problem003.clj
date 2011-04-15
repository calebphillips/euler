(ns euler.level1.problem003
  (:use [clojure.contrib.math :only [sqrt]]))

(defn upto-half [n]
  (range 2 (inc (sqrt n))))

(defn divisible-by? [n]
  (fn [d] 
    (zero? (mod n d))))

(defn prime? [n]
  (if (= n 2)
    true
    (not-any? (divisible-by? n) (upto-half n))))

(defn factors [n]
  (filter (divisible-by? n) (upto-half n)))

(defn euler-3 [n]
  (reduce max (filter prime? (factors n))))
