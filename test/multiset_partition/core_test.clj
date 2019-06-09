(ns multiset-partition.core-test
  (:require [clojure.test :refer :all]
            [multiset-partition.core :refer :all]))

(deftest part-test
  (is (= 55 (reduce + 0 (part '(15 5 20 10 35 15 10)))))
  (is (nil? (part '(15 5 20 10 35)))))
