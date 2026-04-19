package lesson_05.deprecated;

public class Calculator {

    @Deprecated
    public void div(int a, int b) {
        System.out.println( a / b);
    }

    public void newDiv(int a, int b) {
        if ( b == 0) {
            System.out.println("Деление на 0!");
            return;
        }
        System.out.println( a / b);
    }
}
