package Java_Nail_Alishev.old.BaseJava.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson39CheckedUnсhecked {
    public static void main(String[] args) {
        //Cheked Exception (Compile time exception) исключительные случаи в работе программы
        //Unchecked Exceptions (Runtime exception) ошибка в работе программы

        File file = new File("test.txt");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        int a = 1 / 0;    //ArithmeticException
        String name = null;
//        name.length();   //NullPointerException
        try {
            int[] array = new int[2];
            System.out.println(array[2]);   //ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException a) {
            a.printStackTrace();
        }


    }
}
