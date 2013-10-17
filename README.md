# nippy-lz4
[![Build Status](https://secure.travis-ci.org/mpenet/nippy-lz4.png?branch=master)](http://travis-ci.org/mpenet/nippy-lz4)

Plugable [LZ4](https://github.com/jpountz/lz4-java) compression for [Nippy](https://github.com/ptaoussanis/nippy).

## Documentation


It's quite straightforward, add `qbits.nippy-lz4` to your dependencies,
then import `qbits.nippy-lz4` namespace and pass the compressor you want
to use to nippy.

The available compressors are

* `qbits.nippy-lz4/lz4-compressor`: the fastest default compressor
* `qbits.nippy-lz4/lz4hc-compressor`: the high compression compressor

Ex:
```clj
(use 'taoensso.nippy)
(require '[qbits.nippy-lz4 :refer [lz4-compressor lz4hc-compressor]])

(def compressed-data (freeze {:foo :bar} {:compressor lz4hc-compressor}))

(prn (thaw compressed-data {:compressor lz4hc-compressor}))

>> {:foo :bar}
```

## Installation

nippy-lz4 is [available on Clojars](https://clojars.org/cc.qbits/nippy-lz4).

Add this to your dependencies:

```clojure
[cc.qbits/nippy-lz4 "0.1.0"]
```

Please check the
[Changelog](https://github.com/mpenet/nippy-lz4/blob/master/CHANGELOG.md)
if you are upgrading.

## License

Copyright © 2013 [Max Penet](http://twitter.com/mpenet)

Distributed under the
[Eclipse Public License](http://www.eclipse.org/legal/epl-v10.html),
the same as Clojure.
