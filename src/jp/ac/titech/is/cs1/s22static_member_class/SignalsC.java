package jp.ac.titech.is.cs1.s22static_member_class;

import static java.lang.System.*;

import java.awt.event.*;
import java.util.*;
import java.util.List;
import javax.swing.event.*;

// non-static member class のメモリ使用量を測定
public class SignalsC {
    public static List<MouseInputListener> listeners = new Vector<MouseInputListener>();

    private class ColorListener extends MouseInputAdapter {
        public void mouseClicked(MouseEvent e) { out.println('!'); }
    }

    private void run() {
        for (int i = 0; i < 10000; i++)
            listeners.add(new ColorListener());
        
        Runtime r = Runtime.getRuntime();
        r.gc();
        try { Thread.sleep(3000); } catch (InterruptedException e) {}
        out.printf("メモリ使用量: %d\n", r.totalMemory() - r.freeMemory());
    }

    public static void main(String[] _) {
        new SignalsC().run();
    }
}
