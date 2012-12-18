package jp.ac.titech.is.cs1.s22static_member_class;

import static java.lang.System.out;

import org.junit.Test;

public class FibonacciListTest {

    @Test
    public void fibonacci() {
        FibonacciList v = new FibonacciList();
        for (int i = 0; i < 1000; i++) v.add(i);
        
        for (int i = 0; i < v.size() && i < 10; i ++)
            out.printf("%sv[%d] = %d", i > 0 ? ", " : "", i, v.get(i));
        out.println();
        
        boolean head = true;
        for (int n : v) {
            System.out.printf("%s%d", head ? "" : ", ", n);
            head = false;
        }
        out.println();
    }
}


