package co.edureka;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class AssertNotNullMethod {

    @Test
    public void test() {
        Integer val1 = 0; // must be an object, not primitive int

        assertNotNull(val1);
        System.out.println("Test passed because val1 is not null");
    }
}
