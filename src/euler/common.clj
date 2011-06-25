(ns euler.common
  (:use [clojure.contrib.math :only [sqrt]]))

(defn divides? [dividend divisor] 
  (zero? (rem dividend divisor)))

(defn upto-sqrt [n]
  (range 2 (inc (sqrt n))))

(defn prime? [n]
  (if (= n 2)
    true
    (not-any? #(divides? n %) (upto-sqrt n))))

