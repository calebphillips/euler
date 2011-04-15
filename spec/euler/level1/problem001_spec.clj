(ns euler.level1.problem001-spec
  (:use
    [speclj.core]
    [euler.level1.problem001]))

; http://projecteuler.net/index.php?section=problems&id=1

(describe "divides?"
    (it "works"
        (should (divides? 9 3))
        (should (divides? 333 3))
        (should-not (divides? 4 3))
        (should (divides? 25 5))
        (should-not (divides? 973 5))))

(describe "divides-any?"
          (it "works"
              (should ((divides-any? 3 5) 9))
              (should ((divides-any? 3 5) 10))
              (should-not ((divides-any? 3 5) 16))))


(describe "Euler Problem #1"
  (it "Solves #1"
    (should= 23 (euler-1 10))
    (should= 78 (euler-1 20))
    (should= 233168 (euler-1 1000)))
  )

(run-specs)
