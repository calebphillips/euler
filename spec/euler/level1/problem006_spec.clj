(ns euler.level1.problem006-spec
  (:use
    [speclj.core]
    [euler.level1.problem006]))

; http://projecteuler.net/index.php?section=problems&id=6

(describe "Euler Problem #6"

          (it "Solves #6"
              (should= 4 (euler-6 2))
              (should= 22 (euler-6 3))
              (should= 2640 (euler-6 10))
              )
          )

(run-specs)
