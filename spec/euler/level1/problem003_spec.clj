(ns euler.level1.problem003-spec
  (:use
    [speclj.core]
    [euler.level1.problem003]))

; http://projecteuler.net/index.php?section=problems&id=3

(describe "Euler Problem #3"

  (it "Solves #3"
    (should= 29 (euler-3 13195))
    (should= 6857 (euler-3 600851475143))
    )
  )

(describe "is prime"
          (it "handles primes"
              (should= [] (remove prime? [1 2 3 5 7 11 13 17 19 23])))

          (it "handles non-primes"
              (should= [] (filter prime? [4 6 100 4000]))))

(run-specs)
