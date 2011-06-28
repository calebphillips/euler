(ns euler.common-spec
  (:use [speclj.core]
        [euler.common]))

(describe 
  "finding prime factorization"
  (it "returns the factors and their exponents"
      (should= [[2 2] [3 1]] (prime-factorization 12))
      (should= [[3 1] [7 2]] (prime-factorization 147))
      (should= [[17 1]] (prime-factorization 17))
      ))

(describe 
  "counting factors"
  (it "returns the number of factors"
      (should= 2 (count-factors 3))
      (should= 4 (count-factors 6))
      (should= 4 (count-factors 21))
      (should= 6 (count-factors 28))
      (should= 12 (count-factors 108))
      ))

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
