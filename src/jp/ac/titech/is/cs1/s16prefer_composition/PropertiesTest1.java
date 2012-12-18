package jp.ac.titech.is.cs1.s16prefer_composition;

import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest1 {
    private void run() {
        Properties typicalTitechStudent = new Properties();
        typicalTitechStudent.setProperty("大学", "東工大");
        typicalTitechStudent.setProperty("性別", "男性");

        Set<Properties> students = new HashSet<Properties>();
        for (int i = 1; i <= 5; i++) {
            Properties boy = new Properties(typicalTitechStudent);
            boy.setProperty("なまえ", "太郎" + i);
            students.add(boy);
        }

        for (int i = 1; i <= 2; i++) {
            Properties girl = new Properties(typicalTitechStudent);
            girl.setProperty("性別", "女性");
            girl.setProperty("なまえ", "花子" + i);
            students.add(girl);
        }

        Properties ocha = new Properties(typicalTitechStudent);
        ocha.setProperty("大学", "お茶大");
        ocha.setProperty("性別", "女性");
        ocha.setProperty("なまえ", "お嬢");
        students.add(ocha);

        System.out.println("s.getProperty(...) の結果");
        for (Properties s : students) {
            System.out.printf("大学: %s, 性別: %s, 名前: %s\n", s.getProperty("大学"),
                    s.getProperty("性別"), s.getProperty("なまえ"));
        }
        System.out.println("\ns.get(...) の結果");
        for (Properties s : students) {
            System.out.printf("大学: %s, 性別: %s, 名前: %s\n", s.get("大学"),
                    s.get("性別"), s.get("なまえ"));
        }
    }

    public static void main(String[] _) {
        new PropertiesTest1().run();
    }
}
