// File: NumberUtilsTest.java
package co.edureka;

import static org.junit.Assert.*;   // for assertEquals, assertTrue, assertFalse
import org.junit.Test;              // JUnit 4 annotation

/**
 * Test class for NumberUtils
 */
public class NumberUtilsTest {

    NumberUtils utils = new NumberUtils();

    @Test
    public void testEvenNumber() {
        assertTrue("4 is an even number", utils.isEven(4));
    }

    @Test
    public void testOddNumber() {
        assertFalse("7 is an odd number", utils.isEven(7));
    }

    @Test
    public void testZero() {
        assertTrue("0 should be considered even", utils.isEven(0));
    }

    @Test
    public void testNegativeEvenNumber() {
        assertTrue("-8 is even", utils.isEven(-8));
    }

    @Test
    public void testNegativeOddNumber() {
        assertFalse("-3 is odd", utils.isEven(-3));
    }
}
