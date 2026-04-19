package Advanced_Java.Part_07_TestingWithJUnit_037_039;

public class MyMath {
    public static double  divide(int number1, int number2) {
        if(number2 == 0) {
            throw new ArithmeticException("Can't devide by zero");
        }
        return number1 / number2;
    }
}
