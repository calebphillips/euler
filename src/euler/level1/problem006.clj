(ns euler.level1.problem006)

(defn square-of-sum [n]
  (let [sum (reduce + (range 1 (inc n)))]
    (* sum sum)))

(defn sum-of-squares [n]
  (reduce + (map #(* % %) (range 1 (inc n)))))

(defn euler-6 [n]
  (- (square-of-sum n) (sum-of-squares n)))
