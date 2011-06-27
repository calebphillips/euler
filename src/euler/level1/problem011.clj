(ns euler.level1.problem011
  (:use [clojure.contrib.math :only [sqrt]]))

(defn from-coords [grid x y]
  (grid (+ x (* (sqrt (count grid)) y))))

(defn find-adj [grid coords deltas]
  (map #(apply from-coords grid %)
       (filter (fn [new-yx] 
                 (every? #(< -1 % (sqrt (count grid))) new-yx))
               (map #(map + coords %) 
                    deltas))))

(defn horizontal-from [grid & coords]
  (find-adj grid coords [[0 0] [1 0] [2 0] [3 0]]))

(defn vertical-from [grid & coords]
  (find-adj grid coords [[0 0] [0 1] [0 2] [0 3]]))

(defn l-to-r-diagonal-from [grid & coords]
  (find-adj grid coords [[0 0] [1 1] [2 2] [3 3]]))

(defn r-to-l-diagonal-from [grid & coords]
  (find-adj grid coords [[0 0] [-1 1] [-2 2] [-3 3]]))
  
(defn euler-11 [grid]
  (apply max
  (map #(reduce * %)
       (filter #(= 4 (count %))
               (concat
                 (for [x (range 0 20) y (range 0 20)]
                   (horizontal-from grid x y))
                 (for [x (range 0 20) y (range 0 20)]
                   (vertical-from grid x y))
                 (for [x (range 0 20) y (range 0 20)]
                   (l-to-r-diagonal-from grid x y))
                 (for [x (range 0 20) y (range 0 20)]
                   (r-to-l-diagonal-from grid x y))
                 )
               )
       )
    )
  )
