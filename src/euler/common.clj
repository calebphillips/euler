(ns euler.common
  (:use [clojure.contrib.math :only [sqrt]]
        [clojure.contrib.lazy-seqs :only [primes]]))

(defn divides? [dividend divisor] 
  (zero? (rem dividend divisor)))

(defn to-digits [n]
  (map #(Integer/parseInt (str %)) 
       (.toString n)))

(defn- prime-factors-with-exponents [n]
  (loop [n n 
         factors []
         this-prime (first primes)
         primes-left (rest primes)]
    (if (= n 1)
      factors
      (if (divides? n this-prime)
        (recur (quot n this-prime) 
               (conj factors this-prime) 
               this-prime 
               primes-left)
        (recur n 
               factors 
               (first primes-left) 
               (rest primes-left))))))

(defn prime-factorization [n]
  (map (fn [c] [(first c) (count c)])
       (partition-by identity
                     (prime-factors-with-exponents n))))

; http://mathforum.org/library/drmath/view/57151.html
(defn count-factors [n]
  (reduce * (map #(inc (second %)) (prime-factorization n))))
