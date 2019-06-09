(ns multiset-partition.core)

(defn- powerset [acc xs]
  (if (seq xs)
    (let [[h & t] xs]
      (concat (powerset acc t) (powerset (cons h acc) t)))
    (list acc)))

(defn part [xs]
  (let [sum  (reduce + xs)
        half (quot sum 2)]
    (when (zero? (rem sum 2))
      (some #(when (= half (reduce + 0 %)) %) (powerset '() xs)))))
