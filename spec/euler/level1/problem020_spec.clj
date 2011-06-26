(ns euler.level1.problem020-spec
  (:use
    [speclj.core]
    [euler.level1.problem020]))

; http://projecteuler.net/index.php?section=problems&id=20

(describe 
  "Euler Problem #20"

  (it "Solves #20"
    (should= 27 (euler-20 10)))
  
  (it "computes the factorial"
      (should= 1 (factorial 1))
      (should= 2 (factorial 2))
      (should= 6 (factorial 3))
      (should= 24 (factorial 4))
      (should= 3628800 (factorial 10)))
  )


(run-specs)
