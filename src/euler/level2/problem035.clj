(ns euler.level2.problem035
  (:use [clojure.contrib.lazy-seqs :only [primes]]
        [euler.common :only [prime?]] ))

(defn rotate [[h & t]]
  (apply str (concat t [h])))

(defn rotations [s]
  (take (count s) (iterate rotate s)))

(defn circular? [n]
  (every? prime? (map #(Integer/parseInt %)
                      (rotations (str n)))))

(defn euler-35 [n]
  (count
    (filter circular? 
            (take-while #(< % n) primes))))
