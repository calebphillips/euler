(ns euler.common-spec
  (:use
    [speclj.core]
    [euler.common]))

(describe
  "to-digits"
  (it "turns an integer into a sequence of 1-digits integers"
      (should= [1 2 3 4 5] (to-digits 12345))
      (should= [9 8 9 8 1 1 1 5] (to-digits 98981115))))

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
