(ns euler.level1.problem003
  (:use [euler.common :only [prime-factorization]]))

(defn euler-3 [n]
  (first (last (prime-factorization n))))
