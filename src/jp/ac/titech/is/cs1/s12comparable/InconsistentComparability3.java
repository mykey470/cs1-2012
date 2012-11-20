package jp.ac.titech.is.cs1.s12comparable;

import static jp.ac.titech.is.cs1.lib.U.*;

import java.util.Set;

// 同値性(equals)と全順序関係(compareTo)の定義の統一性が崩れている場合の問題点について学ぼう

public class InconsistentComparability3 {
    class MyString implements Comparable<MyString> {
        private final String s;
        
        public MyString(String s) { this.s = s; }
        
        public boolean equals(Object x) {
            if (x == this) return true;
            if (x instanceof MyString) {
                MyString s = (MyString)x;
                return this.s.equalsIgnoreCase(s.s);
            }
            return false;
        }
        
        public int compareTo(MyString s1) {
            return this.s.compareToIgnoreCase(s1.s);
        }
        
        public String toString() { return s; }
    }
    
    private void run() {
        Set<MyString> treeset = treeSet(), hashset = hashSet();
        MyString[] happy = new MyString[] { new MyString("happy!"), new MyString("HAPPY!") };
        
        out.printf("equals?: %b, compareTo?: %d\n", happy[0].equals(happy[1]), happy[0].compareTo(happy[1]));
        
        for (MyString s : happy) {
            treeset.add(s);
            hashset.add(s);
        }
        
        out.println("\nTree set の要素たちを列挙すると");
        for (MyString s : treeset) out.println(" - " + s);
        
        out.println("\nHash set の要素たちを列挙すると");
        for (MyString s : hashset) out.println(" - " + s);
    }
    
    public static void main(String[] _) {
        new InconsistentComparability3().run();
    }
}
