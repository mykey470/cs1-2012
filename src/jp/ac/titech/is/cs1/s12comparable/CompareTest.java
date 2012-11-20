package jp.ac.titech.is.cs1.s12comparable;

import static jp.ac.titech.is.cs1.lib.U.out;

public class CompareTest {
    int compare(byte a, byte b) {
        int comp = a - b;  // byte 型に対する減算の結果は int 型になることを思い出して
        out.printf("a = %d, b = %d,\tcompare = (a - b) = %d\n",
                a, b, comp);
        return comp;
    }
    
    int compare(short a, short b) {
        int comp = a - b;  // byte 型に対する減算の結果は int 型になることを思い出して
        out.printf("a = %d, b = %d,\tcompare = (a - b) = %d\n",
                a, b, comp);
        return comp;
    }
    
    int compare(char a, char b) {
        int comp = a - b;  // byte 型に対する減算の結果は int 型になることを思い出して
        out.printf("a = %c, b = %c,\tcompare = (a - b) = %d\n",
                a, b, comp);
        return comp;
    }
    
    int compareHack(int a, int b) {
        int comp = a - b;
        out.printf("a = %d, b = %d,\tcompare = (a - b) = %d\n",
                a, b, comp);
        return comp;
    }
    
    int compare(int a, int b) {
        int comp = (a == b) ? 0 : a < b ? -1 : 1;
        out.printf("a = %d, b = %d,\tcompare = ... = %d\n",
                a, b, comp);
        return comp;
    }
    
    int compare2(int a, int b) {
        int comp = compare((long)a, (long)b);
        out.printf("a = %d, b = %d,\tcompare = compare(long, long) = %d\n",
                a, b, comp);
        return comp;
    }
    
    int compareHack(long a, long b) {
        int comp = Long.signum(a - b);  // long 型の場合は、減算の結果が long 型なので、その符号を int 型で得る。
        out.printf("a = %d, b = %d,\tcompare = Long.signum(a - b) = %d\n",
                a, b, comp);
        return comp;
    }
    
    int compare(long a, long b) {
        int comp = a == b ? 0 : a > b ? 1 : 0;
        out.printf("a = %d, b = %d,\tcompare = ... = %d\n",
                a, b, comp);
        return comp;
    }
    
    int compare(float a, float b) {
        int comp = Float.compare(a, b);
        out.printf("a = %f, b = %f,\tcompare = Float.compare(a, b) = %d\n",
                a, b, comp);
        return comp;
    }
    
    int compare(double a, double b) {
        int comp = Double.compare(a, b);
        out.printf("a = %f, b = %f,\tcompare = Double.compare(a, b) = %d\n",
                a, b, comp);
        return comp;
    }
    
    int compare(String a, String b) {
        int comp = a.compareTo(b);
        out.printf("a = %s, b = %s,\tcompare = a.compareTo(b) = %d\n",
                a, b, comp);
        return comp;
    }
    
    int compare(boolean a, boolean b) {
        int comp;
        if (a == b) comp = 0;
        else comp = a ? 1 : -1;
        out.printf("a = %b, b = %b,\tcompare = %d (%d)\n",
                a, b, comp, new Boolean(a).compareTo(b));
        return comp;
    }
    
    private void run() {
        out.println("さまざまな基本型に対して compareTo を実装する方法を学びましょう。");
        
        out.println("\nbyte に対する比較演算の実装には減算を用いる。つまり、単に b - a。");
        compare((byte)0, (byte)5);
        compare((byte)0, (byte)0);
        compare((byte)0, (byte)-5);

        out.println("\nchar型の場合：");
        compare('A', 'B');
        compare('A', 'A');
        compare('A', '@');
        
        out.println("\nshort型の場合：");
        compare((short)0, (short)5);
        compare((short)0, (short)0);
        compare((short)0, (short)-5);

        out.println("\nint 型についても同様。。。");
        compareHack(0, 5); compareHack(0, 0); compareHack(0, -5);
        out.println("\n同様にできそうだが、減算が overflow する場合も想定しなくてはいけない。");
        out.println("以下の例ではいずれも正の値が期待されるが。。。");
        compareHack(Integer.MAX_VALUE, 1);
        compareHack(Integer.MAX_VALUE, 0);
        compareHack(Integer.MAX_VALUE, -1);
        out.println("以下の例ではいずれも負の値が期待されるが。。。");
        compareHack(Integer.MIN_VALUE, -1);
        compareHack(Integer.MIN_VALUE, 0);
        compareHack(Integer.MIN_VALUE, 1);

        out.println("\n効率はやや劣るものの overflow の問題を生じない実装を使うと。。。");
        compare(Integer.MAX_VALUE, 1);
        compare(Integer.MAX_VALUE, 0);
        compare(Integer.MAX_VALUE, -1);
        out.println();
        compare(Integer.MIN_VALUE, -1);
        compare(Integer.MIN_VALUE, 0);
        compare(Integer.MIN_VALUE, 1);

        out.println("\nlong の減算結果は long 型になるので、それを int 型にするために符号を取得する。(Long.signum(b-a))");
        compareHack(0L, 5L); compareHack(0L, 0L); compareHack(0L, -5L);
        
        out.println("\nfloat の場合は Float クラスが提供する compare メソッドを用いる。(Float.compare(a, b)");
        compare(0F, 5F); compare(0F, 0F); compare(0F, -5F);
        
        out.println("\ndouble の場合は Double クラスが提供する compare メソッドを用いる。(Double.compare(a, b)");
        compare(0.0, 5.0); compare(0.0, 0.0); compare(0.0, -5.0);
        
        out.println("\n文字列の場合は、それを実装する String クラスが Comparable インタフェイスを実装しているので、素直に compareTo メソッドを使えばよい。");
        compare("おめでとう", "おめでとうございます");
        compare("おめでとう", "おめでとう");
        compare("おめでとう", "おめでと");
        
        out.println("\nboolean型の場合は、適宜、順序関係を設定して実装する。ここでは false < true という順序関係を設定し Java の Boolean.compareTo の実装とあわせた。");
        compare(false, false); compare(false, true); compare(true, false); compare(true, true);
    }
    
    public static void main(String[] _) {
        new CompareTest().run();
    }
}
