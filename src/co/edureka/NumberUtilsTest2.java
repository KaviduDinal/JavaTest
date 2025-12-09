package co.edureka;
import org.junit.Test;
import static org.junit.Assert.*;

public class NumberUtilsTest2 {

    @Test
    public void testIsEven() {
        NumberUtils nu = new NumberUtils();

        // Test even number
        assertTrue("10 should be even", nu.isEven(10));

        // Test odd number
        assertFalse("7 should be odd", nu.isEven(7));
    }
}
