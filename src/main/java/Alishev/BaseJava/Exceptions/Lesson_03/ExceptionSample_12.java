package Alishev.BaseJava.Exceptions.Lesson_03;

import java.io.FileNotFoundException;

public class ExceptionSample_12 {
    public static void main(String[] args) throws FileNotFoundException { // checked -> Compile time exception
        String name = null;
        name.length(); //RunTimeException -> NullPointerException

    }
}
