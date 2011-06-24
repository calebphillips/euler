(ns euler.level1.problem004)

(def products-of-3-digit-numbers
  (for [x (range 100 1000) y (range 100 1000)]
    (* x y)))

(defn palindrome? [n]
  (let [as-str (.toString n)]
    (= as-str (apply str (reverse as-str)))))

(defn euler-4 [n]
  (apply max (filter palindrome? products-of-3-digit-numbers)))
