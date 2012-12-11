package jp.ac.titech.is.cs1.s22static_member_class;

import static java.lang.System.out;

import javax.swing.JFrame;

public class AnonymousClassAsProcessExample extends JFrame {
    private void run() {
        final long start = System.currentTimeMillis();
        
        new Thread() {
            public void run() {
                while (true) {
                    long t = System.currentTimeMillis() - start;
                    out.printf("%06d: 生地をこね終ったよ！\n", t);
                    try { sleep(1900); } catch (InterruptedException e) {}
                }
            }
        }.start();
        
        new Thread() {
            public void run() {
                while (true) {
                    long t = System.currentTimeMillis() - start;
                    out.printf("%06d: パンが焼けたよ！\n", t);
                    try { sleep(2900); } catch (InterruptedException e) {}
                }
            }
        }.start();
        
        new Thread() {
            public void run() {
                while (true) {
                    long t = System.currentTimeMillis() - start;
                    out.printf("%06d: パンを届けてきたよ！\n", t);
                    try { sleep(3700); } catch (InterruptedException e) {}
                }
            }
        }.start();
    }
    
    public static void main(String[] _) {
        new AnonymousClassAsProcessExample().run();
    }
}
