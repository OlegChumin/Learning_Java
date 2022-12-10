package Alishev.BaseJava.Exceptions;

public class TestException {
    public static void main(String[] args) {
        try {
            int x = 5 / 0;
        } catch (Exception e) {
            System.out.println("Exception ");
//        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException ");
        }
        System.out.println("Lst Line");
    }
}
