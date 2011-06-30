(ns euler.level1.problem025-spec
  (:use
    [speclj.core]
    [euler.level1.problem025]))

; http://projecteuler.net/index.php?section=problems&id=25

(describe 
  "Euler Problem #25"
  (it "Solves #25"
      (should= 12 (euler-25 3))
      (should= 17 (euler-25 4))
      (should= 21 (euler-25 5))
      ))

(run-specs)
