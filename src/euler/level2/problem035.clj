(ns euler.level2.problem035
  (:use [clojure.contrib.lazy-seqs :only [primes]]
        [clojure.contrib.math :only [sqrt]]
        [euler.common :only [to-digits divides?]] ))

(defn rotate [s]
  (apply str 
         (flatten (cons (rest s) 
                        (list (first s))))))

(defn rotations [s]
  (loop [all-rots [s]
         current-rot s
         rots-remaining (dec (count s))]
    (if (zero? rots-remaining)
      all-rots
      (let [this-rot (rotate current-rot)]
        (recur 
          (conj all-rots this-rot)
          this-rot
          (dec rots-remaining))))))


(defn prime? [n]
    (= n 
       (first (drop-while #(< % n) primes))))


(defn circular? [n]
  (every? prime? (map #(Integer/parseInt %)
                      (rotations (str n)))))

(defn euler-35 [n]
  (count
    (take-while #(< % n)
                (filter circular? primes)))
  )
