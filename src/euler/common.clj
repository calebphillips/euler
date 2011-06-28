(ns euler.common
  (:use [clojure.contrib.math :only [sqrt]]
        [clojure.contrib.lazy-seqs :only [primes]]))

(defn divides? [dividend divisor] 
  (zero? (rem dividend divisor)))

(defn upto-sqrt [n]
  (range 2 (inc (sqrt n))))

(defn prime? [n]
  (if (= n 2)
    true
    (not-any? #(divides? n %) (upto-sqrt n))))

(defn to-digits [n]
  (map #(Integer/parseInt (str %)) 
       (.toString n)))

(defn prime-factorization [n]
  (map (fn [c] [(first c) (count c)])
       (partition-by identity
                     (loop [n n 
                            factors []
                            this-prime 2
                            primes-left (rest primes)]
                       (if (= n 1)
                         factors
                         (if (divides? n this-prime)
                           (recur (quot n this-prime) (conj factors this-prime) this-prime primes-left)
                           (recur n factors (first primes-left) (rest primes-left))))
                       )
                     )))

(defn count-factors [n]
  (reduce * (map #(inc (second %)) (prime-factorization n))))
