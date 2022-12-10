package TasksFromLeo.CathEmAll;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 1. Handle a call to a risky method in the main method in CathEmAll then can throw different types of exceptions.
 2. Please note that some types of exceptions should be handled, while other - wrapped and rethrown,
 while others - shouldn't.
 1. Обрабатывать вызов riskyMethod() в основном методе в CathEmAll, после чего можно генерировать различные типы исключений.
 2. Обратите внимание, что некоторые типы исключений должны обрабатываться, а другие - оборачиваться и
 перепробрасываться - thrown,а другие - не должны.
 */
public class CatchEmAll {
    static Exception exception = new FileNotFoundException();
    static Exception exceptionMissing = new IllegalArgumentException("Resource is missing");
    static Exception exceptionError = new IllegalArgumentException("Resource error");

    public static void riskyMethod() throws Exception {
        throw exception;
    }

    public static void main(String[] args) throws Exception {
        try {
            riskyMethod();
        } catch (Exception e) {
            try {
                throw exception;
            } catch (ArithmeticException | NumberFormatException ex) {
                ex.printStackTrace();
            } catch (FileNotFoundException fileEx) {
                throw exceptionMissing;
            } catch (IOException ioEx) {
                throw exceptionError;
            }
        }
    }
}
