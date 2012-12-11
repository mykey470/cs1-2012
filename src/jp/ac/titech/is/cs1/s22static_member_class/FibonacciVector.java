package jp.ac.titech.is.cs1.s22static_member_class;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

//ベクトルの Iterator を inner class を用いて実装した例
//iterator は、ベクトル (v) をアクセスするため static inner class として定義できない
class FibonacciVector implements Iterable<Integer> {
    List<Integer> v = new Vector<Integer>();

    public boolean add(int x) { return v.add(x); }
    public void clear() { v.clear(); }
    public int get(int x) { return v.get(x); }
    public int indexOf(int x) { return v.indexOf(x); }
    public boolean isEmpty() { return v.isEmpty(); }
    public int size() { return v.size(); }
    public Iterator<Integer> iterator() { return new SkipIterator(); }

    private class SkipIterator implements Iterator<Integer> {
        int i = 1, j = 1;
        public boolean hasNext() { return i < v.size(); }
        public Integer next() {
            int result = v.get(i);
            int t = i; i = i + j; j = t;
            return result;
        }
        public void remove() {}
    }
}
