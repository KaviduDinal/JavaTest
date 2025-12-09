// File: ArrayUtils.java
package co.edureka;

public class ArrayUtils {

    // Method that returns an array sorted in ascending order
    public int[] sortArray(int[] arr) {
        int[] sorted = arr.clone(); // clone original array to avoid modifying it
        java.util.Arrays.sort(sorted);
        return sorted;
    }
}
