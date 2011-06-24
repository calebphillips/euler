(ns euler.level1.problem005)

(defn divides? [dividend divisor] 
  (zero? (rem dividend divisor)))

(defn euler-5 [n]
  (first 
    (filter 
      (fn [x] (every? #(divides? x %) [20 19 18 17 16 15 14 13 12 11])) 
      (iterate inc 2520))
    ))
