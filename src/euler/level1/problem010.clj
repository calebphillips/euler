(ns euler.level1.problem010
  (:use [clojure.contrib.lazy-seqs :only [primes]]))

(defn euler-10 [n]
  (reduce + 
          (take-while #(< % n) primes)))
