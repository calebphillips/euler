(ns euler.level2.problem035
  (:use [clojure.contrib.lazy-seqs :only [primes]]
        [euler.common :only [prime? parse-int]] ))

(defn rotate [[h & t]]
  (apply str (concat t [h])))

(defn rotations [s]
  (take (count s) (iterate rotate s)))

(defn circular? [n]
  (every? prime? 
          (map parse-int
               (rotations (str n)))))

(defn euler-35 
  "Returns the number of circurlar primes less than n"
  [n]
  (count
    (filter circular? 
            (take-while #(< % n) primes))))
