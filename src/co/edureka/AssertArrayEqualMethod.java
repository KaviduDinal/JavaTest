package co.edureka;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class AssertArrayEqualMethod {

    @Test
    public void checkArray() {
        int[] arithmeticArray1 = {1, 2, 3};
        int[] arithmeticArray2 = {1, 2, 3};


        assertArrayEquals(arithmeticArray1, arithmeticArray2);
    }
}
