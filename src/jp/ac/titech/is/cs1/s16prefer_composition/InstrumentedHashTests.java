package jp.ac.titech.is.cs1.s16prefer_composition;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

public class InstrumentedHashTests {
    private static List<String> campusList = Arrays.asList("大岡山", "すずかけ台", "田町");
    
    
    private void testA(InstrumentedSet<String> campuses) {
        for (String campus : campusList) campuses.add(campus);
        Assert.assertEquals(campuses.size(), campuses.getCount());
    }
    
    private void testB(InstrumentedSet<String> campuses) {
        campuses.addAll(campusList);
        Assert.assertEquals(campuses.size(), campuses.getCount());
    }
    
    @Test
    public void hashSet1a() {
        testA(new InstrumentedHashSet1<String>());
    }
    
    @Test
    public void hashSet1b() {
        testB(new InstrumentedHashSet1<String>());
    }

    @Test
    public void hashSet2a() {
        testA(new InstrumentedHashSet2<String>());
    }

    @Test
    public void hashSet2b() {
        testB(new InstrumentedHashSet2<String>());
    }

    @Test
    public void set1a() {
        testA(new InstrumentedSet1<String>());
    }

    @Test
    public void set1b() {
        testB(new InstrumentedSet1<String>());
    }

    @Test
    public void set2a() {
        testA(new InstrumentedSet2<String>());
    }

    @Test
    public void set2b() {
        testB(new InstrumentedSet2<String>());
    }
}
