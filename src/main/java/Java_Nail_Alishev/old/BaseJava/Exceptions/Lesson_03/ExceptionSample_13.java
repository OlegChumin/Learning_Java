package Java_Nail_Alishev.old.BaseJava.Exceptions.Lesson_03;

import java.io.FileNotFoundException;

public class ExceptionSample_13 {
    public static void main(String[] args) throws FileNotFoundException { // checked -> Compile time exception
        int[] array = new int[12];
        try {
            System.out.println(array[13]); //ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("выход за пределы массива " + e);
        }
    }
}