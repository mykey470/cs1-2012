このパッケージでは、二つの実験を行います。

(1) InstrumentedSet

通常の集合に加えて、集合の要素数を保持するデータ型の実装

InstrumentedHashSet1 は、継承を用いて実装した例。コードは一見、ちゃんとしてそうだが、動かしてみると変。
InstrumentedHashSet2 は、前述の問題を避けるための場当たり的な対処。

InstrumentedSet1 は Composition を用いて実装し直した例。前述のバグはないがコードが煩雑。
InstrumentedSet2 は SetAdaptor を利用することで、簡素なコードとなった。

(2) Properties

Properties "are not" Hashtable なのに、Java API の実装で Properties extends Hashtable となっているために起きる悲喜劇

 - PropertiesTest1
 - PropertiesTest2
  