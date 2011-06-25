(ns euler.level1.problem005-spec
  (:use
    [speclj.core]
    [euler.level1.problem005]))

; http://projecteuler.net/index.php?section=problems&id=5

(describe 
  "Euler Problem #5"
  (it "Solves #5"
      (should= 2 (euler-5 2))
      (should= 6 (euler-5 3))
      (should= 12 (euler-5 4))
      (should= 60 (euler-5 5))
      (should= 60 (euler-5 6))
      (should= 420 (euler-5 7))
      (should= 840 (euler-5 8))
      (should= 2520 (euler-5 9))
      (should= 2520 (euler-5 10))
      ; (should= 232792560 (euler-5 20)
               ))


(run-specs)
