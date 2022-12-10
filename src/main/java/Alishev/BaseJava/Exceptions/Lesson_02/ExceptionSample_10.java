package Alishev.BaseJava.Exceptions.Lesson_02;

import java.util.Scanner;

public class ExceptionSample_10 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        ArithmeticException arithmeticException = new ArithmeticException();
        RuntimeException runtimeException = new ArithmeticException();
        Exception exception = new ArithmeticException();
        Throwable throwable = new ArithmeticException();

        try {
            divide(a, b);
        } catch (Exception e) {
            throw exception;
        }


        try {
            divide(a, b); //Может быть ситуация, когда исключение захвачено несколькими блоками.
            // В этом случае оно будет захвачено блоком catch, который идет раньше (ближе к блоку try).
        } catch (ArithmeticException ae) {
            throw arithmeticException;
        } catch (RuntimeException re) {
            throw runtimeException;
        } catch (Exception e) {
            try {
                throw exception;
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        } catch (Throwable thr) {
            try {
                throw throwable;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            } //Чтобы не было неожиданностей, лучше всего блоки catch, которые могут захватить почти все исключения,
            // размещать ближе к концу списка блоков catch.
            // Тип Throwable вообще способен перехватывать все возможные исключения в Java, если его разместить в первом
            // блоке catch - код не скомпилируется, так как компилятор понимает, что в коде есть недосягаемые блоки кода.
        }
    }


    public static int divide(int a, int b) {
        return a / b;
    }
}
