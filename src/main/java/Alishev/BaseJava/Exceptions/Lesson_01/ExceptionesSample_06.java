package Alishev.BaseJava.Exceptions.Lesson_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionesSample_06 {
    public static void main(String[] args) { //обработка ошибки в случае если файл не найден
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Process exception in main method");
            throw new RuntimeException(e);
        }
        System.out.println("After try-catch block code running next..");
        System.out.println("Program running...");
    }

    public static void readFile() throws FileNotFoundException { //обработка ошибки в случае если файл не найден
        String pathToFile = "src/main/java/Java/Alishev/Exceptions/testingFile.txt";
        File file = new File(pathToFile);
            Scanner scanner = new Scanner(file);
        //Exception -> FileNotFoundException (наследник)
    }
}
