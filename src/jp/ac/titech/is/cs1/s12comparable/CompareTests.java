package jp.ac.titech.is.cs1.s12comparable;

import static jp.ac.titech.is.cs1.s12comparable.Compare.compare;
import static jp.ac.titech.is.cs1.s12comparable.Compare.compare1;
import static jp.ac.titech.is.cs1.s12comparable.Compare.compare2;
import static jp.ac.titech.is.cs1.s12comparable.Compare.compareHack;

import org.junit.Assert;
import org.junit.Test;

public class CompareTests {

    @Test
    public void byteTest() {
        Assert.assertTrue(compare((byte) 0, (byte) 5) < 0);
        Assert.assertEquals(0, compare((byte) 0, (byte) 0));
        Assert.assertTrue(compare((byte) 0, (byte) -5) > 0);
        Assert.assertTrue(compare(Byte.MAX_VALUE, (byte)1) > 0);
        Assert.assertTrue(compare(Byte.MAX_VALUE, (byte)0) > 0);
        Assert.assertTrue(compare(Byte.MAX_VALUE, (byte)-1) > 0);
        Assert.assertTrue(compare(Byte.MIN_VALUE, (byte)1) < 0);
        Assert.assertTrue(compare(Byte.MIN_VALUE, (byte)0) < 0);
        Assert.assertTrue(compare(Byte.MIN_VALUE, (byte)-1) < 0);
    }
    
    @Test
    public void charTest() {
        Assert.assertTrue(compare('A', 'Z') < 0);
        Assert.assertEquals(0, compare('K', 'K'));
        Assert.assertTrue(compare('Z', 'A') > 0);
        Assert.assertTrue(compare(Character.MAX_VALUE, (char)1) > 0);
        Assert.assertTrue(compare(Character.MAX_VALUE, (char)0) > 0);
        Assert.assertTrue(compare(Character.MIN_VALUE, (char)1) < 0);
        Assert.assertEquals(0, compare(Character.MIN_VALUE, (char)0));
        Assert.assertTrue(compare(Character.MIN_VALUE, (char)-1) < 0);
    }
    @Test
    public void charBUGTest1() {
        Assert.assertTrue(compare(Character.MAX_VALUE, (char)-1) > 0);
    }
    
    @Test
    public void shortTest() {
        Assert.assertTrue(compare((short) 0, (short) 5) < 0);
        Assert.assertEquals(0, compare((short) 0, (short) 0));
        Assert.assertTrue(compare((short) 0, (short) -5) > 0);
        Assert.assertTrue(compare(Short.MAX_VALUE, (short)1) > 0);
        Assert.assertTrue(compare(Short.MAX_VALUE, (short)0) > 0);
        Assert.assertTrue(compare(Short.MAX_VALUE, (short)-1) > 0);
        Assert.assertTrue(compare(Short.MIN_VALUE, (short)1) < 0);
        Assert.assertTrue(compare(Short.MIN_VALUE, (short)0) < 0);
        Assert.assertTrue(compare(Short.MIN_VALUE, (short)-1) < 0);
    }
    
    @Test
    public void intHackTest() {
        Assert.assertTrue(compareHack(0, (short) 5) < 0);
        Assert.assertEquals(0, compareHack(0, 0));
        Assert.assertTrue(compareHack(0, -5) > 0);
    }
    @Test
    public void intHackTest1() { Assert.assertTrue(compareHack(Integer.MAX_VALUE, 1) > 0); }
    @Test
    public void intHackTest2() { Assert.assertTrue(compareHack(Integer.MAX_VALUE, 0) > 0); }
    @Test
    public void intHackBugTest3() { Assert.assertTrue(compareHack(Integer.MAX_VALUE, -1) > 0); }
    @Test
    public void intHackBugTest4() { Assert.assertTrue(compareHack(Integer.MIN_VALUE, 1) < 0); }
    @Test
    public void intHackTest5() { Assert.assertTrue(compareHack(Integer.MIN_VALUE, 0) < 0); }
    @Test
    public void intHackTest6() { Assert.assertTrue(compareHack(Integer.MIN_VALUE, -1) < 0); }
    
    @Test
    public void int1Test() {
        Assert.assertTrue(compare1(0, 5) < 0);
        Assert.assertEquals(0, compare1(0, 0));
        Assert.assertTrue(compare1(0, -5) > 0);
        Assert.assertTrue(compare1(Integer.MAX_VALUE, 1) > 0);
        Assert.assertTrue(compare1(Integer.MAX_VALUE, 0) > 0);
        Assert.assertTrue(compare1(Integer.MAX_VALUE, -1) > 0);
        Assert.assertTrue(compare1(Integer.MIN_VALUE, 1) < 0);
        Assert.assertTrue(compare1(Integer.MIN_VALUE, 0) < 0);
        Assert.assertTrue(compare1(Integer.MIN_VALUE, -1) < 0);
    }
    
    @Test
    public void int2Test() {
        Assert.assertTrue(compare2(0, 5) < 0);
        Assert.assertEquals(0, compare2(0, 0));
        Assert.assertTrue(compare2(0, -5) > 0);
        Assert.assertTrue(compare2(Integer.MAX_VALUE, 1) > 0);
        Assert.assertTrue(compare2(Integer.MAX_VALUE, 0) > 0);
        Assert.assertTrue(compare2(Integer.MAX_VALUE, -1) > 0);
        Assert.assertTrue(compare2(Integer.MIN_VALUE, 1) < 0);
        Assert.assertTrue(compare2(Integer.MIN_VALUE, 0) < 0);
        Assert.assertTrue(compare2(Integer.MIN_VALUE, -1) < 0);
    }
    
    @Test
    public void longHackTest() {
        Assert.assertTrue(compareHack(0, (short) 5) < 0);
        Assert.assertEquals(0, compareHack(0, 0));
        Assert.assertTrue(compareHack(0, -5) > 0);
    }
    @Test
    public void longHackTest1() { Assert.assertTrue(compareHack(Long.MAX_VALUE, 1L) > 0); }
    @Test
    public void longHackTest2() { Assert.assertTrue(compareHack(Long.MAX_VALUE, 0L) > 0); }
    @Test
    public void longHackBugTest3() { Assert.assertTrue(compareHack(Long.MAX_VALUE, -1L) > 0); }
    @Test
    public void longHackBugTest4() { Assert.assertTrue(compareHack(Long.MIN_VALUE, 1L) < 0); }
    @Test
    public void longHackTest5() { Assert.assertTrue(compareHack(Long.MIN_VALUE, 0L) < 0); }
    @Test
    public void longHackTest6() { Assert.assertTrue(compareHack(Long.MIN_VALUE, -1L) < 0); }
    
    @Test
    public void long1Test() {
        Assert.assertTrue(compare1(0L, 5L) < 0);
        Assert.assertEquals(0, compare1(0L, 0L));
        Assert.assertTrue(compare1(0L, -5L) > 0);
        Assert.assertTrue(compare1(Long.MAX_VALUE, 1L) > 0);
        Assert.assertTrue(compare1(Long.MAX_VALUE, 0L) > 0);
        Assert.assertTrue(compare1(Long.MAX_VALUE, -1L) > 0);
        Assert.assertTrue(compare1(Long.MIN_VALUE, 1L) < 0);
        Assert.assertTrue(compare1(Long.MIN_VALUE, 0L) < 0);
        Assert.assertTrue(compare1(Long.MIN_VALUE, -1L) < 0);
    }
    
    @Test
    public void floatTest() {
        Assert.assertTrue(compare(0F, 5F) < 0);
        Assert.assertEquals(0, compare(0F, 0F));
        Assert.assertTrue(compare(0F, -5F) > 0);
        Assert.assertTrue(compare(Float.MAX_VALUE, 1F) > 0);
        Assert.assertTrue(compare(Float.MAX_VALUE, 0F) > 0);
        Assert.assertTrue(compare(Float.MAX_VALUE, -1F) > 0);
        Assert.assertTrue(compare(Float.MIN_VALUE, 1F) < 0);
        Assert.assertTrue(compare(Float.MIN_VALUE, 0F) > 0);
        Assert.assertTrue(compare(Float.NEGATIVE_INFINITY, 0F) < 0);
    }
    
    @Test
    public void doubleTest() {
        Assert.assertTrue(compare(0.0, 5.0) < 0);
        Assert.assertEquals(0, compare(0.0, 0.0));
        Assert.assertTrue(compare(0.0, -5.0) > 0);
        Assert.assertTrue(compare(Float.MAX_VALUE, 1.0) > 0);
        Assert.assertTrue(compare(Float.MAX_VALUE, 0.0) > 0);
        Assert.assertTrue(compare(Float.MAX_VALUE, -1.0) > 0);
        Assert.assertTrue(compare(Float.MIN_VALUE, 1.0) < 0);
        Assert.assertTrue(compare(Float.MIN_VALUE, 0.0) > 0);
        Assert.assertTrue(compare(Float.NEGATIVE_INFINITY, -0.0) < 0);
    }
    
    @Test
    public void stringTest() {
        Assert.assertTrue(compare("おめでとう", "おめでとうございます") < 0);
        Assert.assertEquals(0, compare("おめでとう", "おめでとう"));
        Assert.assertTrue(compare("おめでとうございます", "おめでとう") > 0);
    }

    @Test
    public void booleanTest() {
        Assert.assertEquals(0, compare(false, false));
        Assert.assertEquals(0, compare(true, true));
        Assert.assertTrue(compare(false, true) < 0);
        Assert.assertTrue(compare(true, false) > 0);
    }
}
