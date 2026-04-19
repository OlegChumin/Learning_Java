import Advanced_Java.Part_07_TestingWithJUnit_037_039.Vector2D;
import org.junit.*;

public class Vector2DТNewTest {
    private final double EPS = 1e-9;
    private static Vector2D vector2D;

//    @BeforeClass
//    public static void createVector() {
//        vector2D = new Vector2D();
//    }

    @Before
    public void createVector() {
        vector2D = new Vector2D();
    }

    @Test
    public void newVectorShouldHaveZeroLength() {
        //assertion
        Assert.assertEquals(0, vector2D.length(), EPS); //1e-9 = 0.000 000 001
    }

    @Ignore
    @Test
    public void newVectorShouldHaveZeroCheckLength() {
        //assertion
        Assert.assertEquals(0, vector2D.checkLength(), EPS); //1e-9 = 0.000 000 001
    }

    @Test
    public void newVectorShouldHaveZeroX() {
        Assert.assertEquals(0, vector2D.getX(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroY() {
        Vector2D vector2D =  new Vector2D();
        Assert.assertEquals(0, vector2D.getY(), 1e-9);
    }
}
