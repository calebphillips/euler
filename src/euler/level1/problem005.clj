(ns euler.level1.problem005
  (:use [euler.common :only [divides?]]))

(defn divisible-by-every-number-upto [n max-divisor]
  (every? 
    #(divides? n %) 
    (range 2 (inc max-divisor))))

(defn euler-5 [n]
  (first 
    (filter 
      #(divisible-by-every-number-upto % n)
      (iterate #(+ n %) n))
    ))
