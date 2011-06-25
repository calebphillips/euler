(ns euler.level1.problem016)

(defn two-to-the [n] 
  (first (drop (dec n) (iterate #(* % 2) 2))))


(defn euler-16 [n]
  (reduce + 
          (map #(Integer/parseInt (str %)) 
               (.toString (two-to-the n))))
  )
