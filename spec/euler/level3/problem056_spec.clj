(ns euler.level3.problem056-spec
  (:use
    [speclj.core]
    [euler.level3.problem056]))

; http://projecteuler.net/index.php?section=problems&id=56

(describe "Euler Problem #56"

  (it "Solves #56"
    (should= 45 (euler-56 10))
    (should= 281 (euler-56 37))))

(run-specs)
