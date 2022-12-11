package Java_Nail_Alishev.old.BaseJava.Exceptions.Lesson_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionesSample_04 {
    public static void main(String[] args) { //обработка ошибки в случае если файл не найден
        String pathToFile = "src/main/java/Java/Alishev/Exceptions/testingFile.txt";
        File file = new File(pathToFile);
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            System.err.println("File not found!");
        }
        //Exception -> FileNotFoundException (наследник)
        System.out.println("After try-catch block code running next..");
        System.out.println("Program running...");
    }

    public void readFile() {

    }
}
