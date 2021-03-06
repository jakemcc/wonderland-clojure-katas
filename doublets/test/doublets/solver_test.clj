(ns doublets.solver-test
  (:require [clojure.test :refer :all]
            [doublets.solver :refer :all]))

(deftest solver-test
  (testing "with word links found"
    (is (= ["head" "heal" "teal" "tell" "tall" "tail"]
           (doublets "head" "tail")))

    (is (= ["door boor book look lock"]
           (doublets "door" "lock")))

    (is (= ["bank bonk book look loon loan"]
           (doublets "bank" "loan")))

    (is (= ["wheat cheat cheap creep breed bread"]
           (doublets "wheat" "bread"))))

  (testing "with no word links found"
    (is (= []
           (doublets "ye" "freezer")))))
