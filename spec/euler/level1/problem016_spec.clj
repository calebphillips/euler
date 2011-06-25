(ns euler.level1.problem016-spec
  (:use
    [speclj.core]
    [euler.level1.problem016]))

; http://projecteuler.net/index.php?section=problems&id=16

(describe "Euler Problem #16"

  (it "Solves #16"
    (should= 26 (euler-16 15))
    (should= 26 (euler-16 1000))
      )
  )

(run-specs)
