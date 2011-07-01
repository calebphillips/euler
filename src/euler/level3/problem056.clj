(ns euler.level3.problem056
  (:use [clojure.contrib.math :only [expt]]
        [euler.common :only [to-digits]]))

(defn euler-56 [n]
  (let [r (range 1 n)]
    (reduce max
            (map #(reduce + %)
                 (for [a r b r]
                   (to-digits (expt a b)))))))
