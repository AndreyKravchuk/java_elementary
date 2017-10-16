package edu.hillel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Time;
import java.util.Date;

import static org.junit.Assert.assertTrue;

public class TestHillelMultiSet {
    HillelMultiSet hillelMultiSet;

    @Before
    public void setUp() throws Exception {
        hillelMultiSet = new HillelMultiSet();
    }

    @Test
    public void testHIllelMultiSet() {
        Date date = new Date();
        Object o1 = new StringBuffer("Hello");
        Object o2 = new StringBuffer("Hello World");
        Object o3 = new StringBuffer("Hello");
        Object o4 = new StringBuffer("Hello Sun");
        Object o5 = new StringBuffer("Hello");


        hillelMultiSet.add(o1);
        hillelMultiSet.add(o1);
        hillelMultiSet.add(o2);
        hillelMultiSet.add(o2);

        assertTrue(hillelMultiSet.size() == 4);
        assertTrue(hillelMultiSet.countElements(o2) == 2);
    }
}
