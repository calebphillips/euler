(ns euler.level1.problem014-spec
  (:use
    [speclj.core]
    [euler.level1.problem014]))

; http://projecteuler.net/index.php?section=problems&id=14

(describe 
  "Euler Problem #14"

  (it "Solves #14"
      ; These numbers have no special meaning.  They are just here 
      ; so that I can have fast tests for refactoring
      (should= 871 (euler-14 1000))
      (should= 97 (euler-14 100))
      (should= 327 (euler-14 345))
      ; (should= 837799 (euler-14 1000000))
      )


  (it "generates the sequence"
      (should= [13 40 20 10 5 16 8 4 2 1] (the-seq 13))
      )
  )

(run-specs)
