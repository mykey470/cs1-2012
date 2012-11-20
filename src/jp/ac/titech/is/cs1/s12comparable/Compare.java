package jp.ac.titech.is.cs1.s12comparable;

public class Compare {
    static int compare(byte a, byte b) {
        return a - b;  // byte 型に対する減算の結果は int 型になることを思い出して
    }
    
    static int compare(short a, short b) {
        return a - b;  // byte 型に対する減算の結果は int 型になることを思い出して
    }
    
    static int compare(char a, char b) {
        return a - b;  // byte 型に対する減算の結果は int 型になることを思い出して
    }
    
    static int compareHack(int a, int b) {
        return a - b;
    }
    
    static int compare1(int a, int b) {
        return (a == b) ? 0 : a > b ? 1 : -1;
    }
    
    static int compare2(int a, int b) {
        return compare1((long)a, (long)b);
    }
    
    static int compare3(int a, int b) {
        return compareHack((long)a, (long)b);
    }
    
    static int compareHack(long a, long b) {
        return Long.signum(a - b);  // long 型の場合は、減算の結果が long 型なので、その符号を int 型で得る。
    }
    
    static int compare1(long a, long b) {
        return a == b ? 0 : a > b ? 1 : -1;
    }
    
    static int compare(float a, float b) {
        return Float.compare(a, b);
    }
    
    static int compare(double a, double b) {
        return Double.compare(a, b);
    }
    
    static int compare(String a, String b) {
        return a.compareTo(b);
    }
    
    static int compare(boolean a, boolean b) {
        return a == b ? 0 : a ? 1 : -1;
    }
}
