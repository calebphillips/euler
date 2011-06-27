(ns euler.level1.problem011
  (:use [clojure.contrib.math :only [sqrt]]))

(defn sq-size [grid]
  (sqrt (count grid)))

(defn from-coords [grid x y]
  (grid (+ x (* (sq-size grid) y))))

(defn apply-deltas-to-point [deltas point]
  (map #(map + point %) deltas))

(defn find-adj [deltas grid & point]
  (let [size (sq-size grid)
        valid-pt (fn [p] (every? #(< -1 % size) p))]
    (map #(apply from-coords grid %)
         (filter valid-pt 
                 (apply-deltas-to-point deltas point)))))

(def horizontal (partial find-adj [[0 0] [1 0] [2 0] [3 0]]))
(def vertical   (partial find-adj [[0 0] [0 1] [0 2] [0 3]]))
(def l-to-r     (partial find-adj [[0 0] [1 1] [2 2] [3 3]]))
(def r-to-l     (partial find-adj [[0 0] [-1 1] [-2 2] [-3 3]]))

(defn euler-11 [grid]
  (apply max
         (map #(reduce * %)
              (filter #(= 4 (count %))
                      (mapcat #(for [x (range 0 20) y (range 0 20)] (% grid x y))
                              [horizontal vertical l-to-r r-to-l])))))

