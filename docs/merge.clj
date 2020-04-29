(defn merge-sort
  [xs]
  (let [pairs
        (fn pairs
          [xs]
          (if (empty? xs) xs
              (cons (take 2 xs)
                    (pairs (drop 2 xs)))))]
    (loop [lists (map list xs)]
      (if (> 1 (length lists))
        (recur (map
                (fn merge
                  [xs ys zs]
                  (let [other-list (if (empty? ys) xs (if (empty? xs) ys) nil)]
                    (if (null? empty-list)
                      (let [x (first xs)
                            y (first ys)]
                        (if (<= x y)
                          (merge (rest xs) ys        (cons x zs))
                          (merge xs        (rest ys) (cons y zs)))))
                    (concat other-list zs))) (pairs lists)))
        (first lists)))))
