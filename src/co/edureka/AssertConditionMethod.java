package co.edureka;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AssertConditionMethod {

    @Test
    public void test() {
        int val1 = 5;
        int val2 = 6;

        // Check condition
        assertTrue(val1 < val2);
        System.out.println("Test passed because val1 is less than val2");
    }
}
