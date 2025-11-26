// File: ArrayUtilsTest.java
package co.edureka;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayUtilsTest {

    @Test
    public void testSortArray() {
        ArrayUtils utils = new ArrayUtils();

        int[] input = {5, 3, 8, 1};
        int[] expected = {1, 3, 5, 8};


        // Verify that the sorted array matches the expected array
        assertArrayEquals("The arrays should be equal after sorting", expected, utils.sortArray(input));
    }

    @Test
    public void testEmptyArray() {
        ArrayUtils utils = new ArrayUtils();

        int[] input = {};
        int[] expected = {};

        assertArrayEquals("Empty arrays should match", expected, utils.sortArray(input));
    }

    @Test
    public void testSingleElementArray() {
        ArrayUtils utils = new ArrayUtils();

        int[] input = {42};
        int[] expected = {42};

        assertArrayEquals("Single element arrays should match", expected, utils.sortArray(input));
    }
}
