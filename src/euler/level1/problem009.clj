(ns euler.level1.problem009)

(defn sq [x] (* x x))

(defn euler-9 [n]
  (let [r (range 1 n)]
    (for [a r b r c r :when (and
                              (= n (+ a b c))
                              (= (+ (sq a) (sq b)) (sq c)))]
      (* a b c))))
