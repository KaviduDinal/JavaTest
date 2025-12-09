// File: CalculatorTest.java
package co.edureka;

import static org.junit.Assert.*;   // Importing assertion methods
import org.junit.Test;              // Importing JUnit 4 @Test annotation

/**
 * Test class for Calculator using JUnit 4
 */
public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAddition() {
        assertEquals("6 + 4 should be 10", 10, calc.add(6, 4), 0.0001);
    }

    @Test
    public void testSubtraction() {
        assertEquals("6 - 4 should be 2", 2, calc.subtract(6, 4), 0.0001);
    }

    @Test
    public void testMultiplication() {
        assertEquals("6 * 4 should be 24", 24, calc.multiply(6, 4), 0.0001);
    }

    @Test
    public void testDivision() {
        assertEquals("6 / 4 should be 1.5", 1.5, calc.divide(6, 4), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        calc.divide(5, 0);  // This should throw an exception
    }
}
