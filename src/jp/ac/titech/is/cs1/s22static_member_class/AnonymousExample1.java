package jp.ac.titech.is.cs1.s22static_member_class;

import static java.lang.System.out;

public class AnonymousExample1 {
    private void run() {
        Object[] objects = new Object[] {
                new Object(),
                new Object() {
                    public String toString() { return ""; }
                },
                new Object() {
                    public String toString() { return "我輩はオブジェクトである。名前はまだない。"; }
                }
        };
        for (Object o : objects) out.println("o = " + o);
    }
    
    public static void main(String[] _) {
        new AnonymousExample1().run();
    }
}
