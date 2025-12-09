package co.edureka;
import static org.junit.Assert.assertEquals;
import org.junit.Test;  // <-- this line was missing

public class AssertEqualsMethod {

    @Test
    public void checkStringsAreEqual() {
        String string1 = "Hello Kavidu";
        String string2 = "Hello Dinal";

        assertEquals(string1, string2);
    }
}

