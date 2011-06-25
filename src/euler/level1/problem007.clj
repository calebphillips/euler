(ns euler.level1.problem007
  (:use [clojure.contrib.lazy-seqs :only [primes]]))

(defn euler-7 [n]
  (first 
    (drop (dec n) primes)))
