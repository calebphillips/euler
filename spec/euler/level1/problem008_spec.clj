(ns euler.level1.problem008-spec
  (:use
    [speclj.core]
    [euler.level1.problem008]))

; http://projecteuler.net/index.php?section=problems&id=8

(describe "Euler Problem #8"

  (it "Solves #8"
    (should= 40824 (euler-8))))

(run-specs)
