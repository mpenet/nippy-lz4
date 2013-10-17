(ns qbits.nippy-lz4.test.core-test
  (:use clojure.test)
  (:require
   [taoensso.nippy :refer :all]
   [qbits.nippy-lz4
    :as nippy-lz4
    :refer [lz4-compressor lz4hc-compressor]]))

(def test-data (dissoc stress-data :bytes))

(deftest test-compress
  (is (= test-data (thaw (freeze test-data
                                 {:compressor lz4-compressor})
                         {:compressor lz4-compressor}))))
