package jp.ac.titech.is.cs1.lib;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class U {
    public static final InputStream in = System.in;
    public static final PrintStream out = System.out, err = System.err;

    public static <V> List<V> arrayList() {
        return new ArrayList<V>();
    }

    public static <V> Set<V> treeSet() {
        return new TreeSet<V>();
    }

    public static <V> Set<V> hashSet() {
        return new HashSet<V>();
    }

    public static <K, V> Map<K, V> hashMap() {
        return new HashMap<K, V>();
    }

    public static <K, V> Map<K, V> treeMap() {
        return new TreeMap<K, V>();
    }
    
    private static long timerT;
    public static void timerStart() {
        timerT = System.currentTimeMillis(); 
    }
    
    public static long timerStop() {
        return System.currentTimeMillis() - timerT;
    }

    private U() {
    }
}
