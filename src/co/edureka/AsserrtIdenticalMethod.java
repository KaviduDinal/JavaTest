package co.edureka;       // package name

import static org.junit.Assert.assertSame;  // import assertSame() method
import org.junit.Test;                      // import JUnit's @Test

public class AsserrtIdenticalMethod {

    @Test
    public void check() {
        String name1 = "Software Quality Assuarance";
        String name2 = "Software Quality Assuarance";

        assertSame(name1, name2);
    }
}
