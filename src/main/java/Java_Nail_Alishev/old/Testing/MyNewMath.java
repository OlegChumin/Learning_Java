package Java_Nail_Alishev.old.Testing;

public class MyNewMath {
    public static double divide(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("a cannot be divided on b = 0!");
        }
        return a / b;
    }
}
