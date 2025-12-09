import org.junit.*; // Import JUnit classes

public class ExampleTest {

    @BeforeClass
    public static void setupBeforeAll() {
        System.out.println("Before all tests");
    }

    @AfterClass
    public static void tearDownAfterAll() {
        System.out.println("After all tests");
    }

    @Before
    public void setupBeforeEach() {
        System.out.println("Before each test");
    }

    @After
    public void tearDownAfterEach() {
        System.out.println("After each test");
    }

    @Test
    public void testOne() {
        System.out.println("Running testOne");
        Assert.assertEquals(10, 5 + 5);
    }

    @Test
    public void testTwo() {
        System.out.println("Running testTwo");
        Assert.assertTrue(10 > 5);
    }
}
