(ns euler.common-spec
  (:use
    [speclj.core]
    [euler.common]))

(describe "divides?"
    (it "works"
        (should (divides? 9 3))
        (should (divides? 333 3))
        (should-not (divides? 4 3))
        (should (divides? 25 5))
        (should-not (divides? 973 5))))

