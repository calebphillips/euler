(ns euler.level2.problem048
  (:use [clojure.contrib.math :only [expt]]
        [euler.common :only [to-digits]]))

(defn euler-48 [limit num-digits]
  (apply str
         (take-last num-digits
                    (to-digits
                      (reduce +
                              (for [x (range 1 (inc limit))]
                                (expt x x))))))
  )
