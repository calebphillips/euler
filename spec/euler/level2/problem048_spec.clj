(ns euler.level2.problem048-spec
  (:use
    [speclj.core]
    [euler.level2.problem048]))

; http://projecteuler.net/index.php?section=problems&id=48

(describe "Euler Problem #48"

  (it "Solves #48"
    (should= "71317" (euler-48 10 5))
    (should= "71317" (euler-48 1000 10))
      )
  )

(run-specs)
