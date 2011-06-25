(ns euler.common-spec
  (:use
    [speclj.core]
    [euler.common]))

(describe 
  "divides?"
  (it "works"
      (should (divides? 9 3))
      (should (divides? 333 3))
      (should-not (divides? 4 3))
      (should (divides? 25 5))
      (should-not (divides? 973 5))))

(describe 
  "prime?"
  (it "handles primes"
      (should= [] (remove prime? [1 2 3 5 7 11 13 17 19 23])))

  (it "handles non-primes"
      (should= [] (filter prime? [4 6 100 4000]))))
