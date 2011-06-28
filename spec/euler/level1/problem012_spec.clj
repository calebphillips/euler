(ns euler.level1.problem012-spec
  (:use
    [speclj.core]
    [euler.level1.problem012]))

; http://projecteuler.net/index.php?section=problems&id=12

(describe 
  "Euler Problem #12"

  (it "Solves #12"
    (should= 3   (euler-12 1))
    (should= 6   (euler-12 2))
    (should= 6   (euler-12 3))
    (should= 28  (euler-12 4))
    (should= 28  (euler-12 5))
    (should= 36  (euler-12 6))
    (should= 36  (euler-12 7))
    (should= 36  (euler-12 8))
    (should= 120 (euler-12 9))
    (should= 120 (euler-12 10))
    (should= 120 (euler-12 11))
    (should= 120 (euler-12 12))
    (should= 120 (euler-12 13))
    (should= 120 (euler-12 14))
    (should= 120 (euler-12 15))
    (should= 300 (euler-12 16))
    (should= 300 (euler-12 17))
    (should= 528 (euler-12 18))
    (should= 528 (euler-12 19))
    (should= 630 (euler-12 20))
    (should= 25200 (euler-12 75))
      )

  (it "generates the sequence of triangle numbers"
    (should= 1 (first tri-nums))
    (should= 3 (first (drop 1 tri-nums)))
      )
  )

(run-specs)
