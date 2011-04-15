(ns euler.level1.problem001)

(defn divides? [dividend divisor] 
  (zero? (rem dividend divisor)))

(defn divides-any? [& divisors]
  (fn [n] (some #(divides? n %) divisors)))  

(defn euler-1 [upper-bound]
  (let [divisible? (divides-any? 3 5)]
    (loop [sum 0 n 1]
      (if (= upper-bound n)
        sum
        (recur (if (divisible? n) (+ sum n) sum) (inc n)))))
  )
