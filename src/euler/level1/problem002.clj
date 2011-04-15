(ns euler.level1.problem002)


(defn fib []
  (map first (iterate (fn [[a b]] [b (+ b a)]) [0 1])))

(defn euler-2 [n]
  (reduce + (filter even? (take-while #(< % n) (fib))))
  )
