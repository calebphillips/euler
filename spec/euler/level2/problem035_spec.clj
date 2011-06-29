(ns euler.level2.problem035-spec
  (:use
    [speclj.core]
    [euler.level2.problem035]))

; http://projecteuler.net/index.php?section=problems&id=35

(describe 
  "Euler Problem #35"

  (it "Solves #35"
      (should= 13 (euler-35 100))
      (should= 25 (euler-35 1000))
      )

  (it "detects circular primes"
      (should (circular? 197))
      (should-not (circular? 487))
      (should-not (circular? 1000))
      )

  (it "generates correct rotations"
      (should= ["1"] (rotations "1"))
      (should= ["12" "21"] (rotations "12"))
      (should= ["1234" "2341" "3412" "4123"] (rotations "1234"))
      (should= ["197" "971" "719"] (rotations "197"))
      )
  )
(run-specs)
