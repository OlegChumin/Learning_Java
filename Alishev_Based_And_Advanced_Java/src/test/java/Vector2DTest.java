import Advanced_Java.Part_07_TestingWithJUnit_037_039.Vector2D;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Vector2DTest {
    @Test
    public void newVectorShouldHaveZeroLength() {
        Vector2D vector2D = new Vector2D(); // Action
        //assertion
        Assert.assertEquals(0, vector2D.length(), 1e-9); //1e-9 = 0.000 000 001
    }

    @Ignore
    @Test
    public void newVectorShouldHaveZeroCheckLength() {
        Vector2D vector2D = new Vector2D(); // Action
        //assertion
        Assert.assertEquals(0, vector2D.checkLength(), 1e-9); //1e-9 = 0.000 000 001
    }

    @Test
    public void newVectorShouldHaveZeroX() {
        Vector2D vector2D =  new Vector2D();
        Assert.assertEquals(0, vector2D.getX(), 1e-9);
    }

    @Test
    public void newVectorShouldHaveZeroY() {
        Vector2D vector2D =  new Vector2D();
        Assert.assertEquals(0, vector2D.getY(), 1e-9);
    }
}
