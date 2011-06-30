(ns euler.level2.problem048
  (:use [clojure.contrib.math :only [expt]]
        [euler.common :only [to-digits]]))

(defn euler-48 
  "Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000"
  [n last-n]
  (apply str
         (take-last last-n
                    (to-digits
                      (reduce +
                              (map #(expt % %) (range 1 (inc n)))))))
  )
