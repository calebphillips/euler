(ns euler.level1.problem007-spec
  (:use
    [speclj.core]
    [euler.level1.problem007]))

; http://projecteuler.net/index.php?section=problems&id=7

(describe "Euler Problem #7"

  (it "Solves #7"
    (should= -1 (euler-7 -1)))
  )

(run-specs)
