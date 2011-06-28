(ns euler.level1.problem014)

(defn the-seq [n]
  (loop [n n s []]
    (let [s (conj s n)
          next-term #(if (even? n)
                       (/ n 2)
                       (+ 1 (* 3 n)))]
      (if (= n 1)
        s
        (recur (next-term) s)))))

(defn euler-14 [n]
  (first
    (reduce (fn [a b] (if (> (second b) (second a)) b a)) 
            (for [x (range 1 n)] 
              [x (count (the-seq x))])))
  )
