package MagicJava;

public class MyMath {
    public double divide(int number1, int number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Can't divide by zero");
        }
        return number1/number2;
    }
}
