(ns euler.level2.problem048
  (:use [clojure.contrib.math :only [expt]]
        [euler.common :only [to-digits]]))

(defn euler-48 [n last-n]
  (apply str
         (take-last last-n
                    (to-digits
                      (reduce +
                              (for [x (range 1 (inc n))]
                                (expt x x))))))
  )
