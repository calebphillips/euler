(ns euler.common)

(defn divides? [dividend divisor] 
  (zero? (rem dividend divisor)))

