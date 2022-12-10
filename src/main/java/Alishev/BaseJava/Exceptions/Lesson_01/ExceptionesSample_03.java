package Alishev.BaseJava.Exceptions.Lesson_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionesSample_03 {
    public static void main(String[] args) { //обработка ошибки в случае если файл не найден
        String pathToFile = "src/main/java/Java/Alishev/Exceptions/testingFile.txt";
        File file = new File(pathToFile);
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //Exception -> FileNotFoundException (наследник)

    }
}
