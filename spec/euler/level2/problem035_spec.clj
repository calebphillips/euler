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

  (it "detects primes"
      (let [expected-primes [2 3 5 7 11 13 17 19 23 29 
                             104677 104681 104683 104693 104701 
                             104707 104711 104717 104723 104729]]
        (should= expected-primes (filter prime? expected-primes)))
      (should= [] (filter prime? [4 6 8 9 10 12 15 100 99 104728])))

  (it "generates correct rotations"
      (should= ["1"] (rotations "1"))
      (should= ["12" "21"] (rotations "12"))
      (should= ["1234" "2341" "3412" "4123"] (rotations "1234"))
      (should= ["197" "971" "719"] (rotations "197"))
      )
  )
(run-specs)
