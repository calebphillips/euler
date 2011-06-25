(ns euler.level1.problem010-spec
  (:use
    [speclj.core]
    [euler.level1.problem010]))

; http://projecteuler.net/index.php?section=problems&id=10

(describe "Euler Problem #10"

  (it "Solves #10"
    (should= 17 (euler-10 10)))
  )

(run-specs)
