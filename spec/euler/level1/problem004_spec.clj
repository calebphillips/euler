(ns euler.level1.problem004-spec
  (:use
    [speclj.core]
    [euler.level1.problem004]))

; http://projecteuler.net/index.php?section=problems&id=4

(describe "Euler Problem #4"

  (it "Solves #4"
    (should= -1 (euler-4 -1)))
  )

(describe 
  "detecting palindromicality"

  (it "recognizes 2 digits palindromes"
      (should (palindrome? 99))
      (should (palindrome? 11))
      (should-not (palindrome? 23)))

  (it "recognizes 3 digiters"
      (should (palindrome? 303))
      (should (palindrome? 888))
      (should-not (palindrome? 123)))

  (it "recognizes big dogs"
      (should (palindrome? 12300774447700321)))
  )


(run-specs)
