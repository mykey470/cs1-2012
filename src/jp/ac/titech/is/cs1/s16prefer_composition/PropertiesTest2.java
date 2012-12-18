package jp.ac.titech.is.cs1.s16prefer_composition;

import java.util.Properties;

public class PropertiesTest2 {
    class Onigiri {
        public String toString() { return "おにぎり"; }
    }

    private void run() {
        Properties gombei = new Properties();
        
        gombei.setProperty("なまえ", "名無しのごんべ");
        gombei.put("にもつ", new Onigiri());
        
        System.out.println(gombei);
        System.out.printf("なまえ: %s\n", gombei.getProperty("なまえ"));
        System.out.printf("にもつ: %s\n", gombei.getProperty("にもつ"));
        System.out.printf("にもつ: %s\n", gombei.get("にもつ"));
    }

    public static void main(String[] _) {
        new PropertiesTest2().run();
    }
}
