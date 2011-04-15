(ns euler.level1.problem001)

(defn divides? [dividend divisor] 
  (zero? (rem dividend divisor)))

(defn divides-any? [& divisors]
  (fn [n] (some #(divides? n %) divisors)))  

(defn euler-1 [upper-bound]
  (reduce + (filter (divides-any? 3 5) (range 1 upper-bound))))

