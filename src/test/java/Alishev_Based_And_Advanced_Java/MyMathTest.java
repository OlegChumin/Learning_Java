package Alishev_Based_And_Advanced_Java;

import Alishev_Based_And_Advanced_Java.Advanced_Java.Part_07_TestingWithJUnit_037_039.MyMath;
import org.junit.Test;

public class MyMathTest {
    @Test(expected = ArithmeticException.class)
    public void zeroDenominatorShouldThrowException() {
        MyMath.divide(1, 0);
    }
}
