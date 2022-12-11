package Java_Nail_Alishev.old.BaseJava.Exceptions.Lesson_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionesSample_01 {
    public static void main(String[] args) throws FileNotFoundException { //обработка ошибки в случае если файл не найден
        String pathToFile = "src/main/java/Java/Alishev/Exceptions/testingFile.txt";
        File file = new File(pathToFile);
        Scanner scanner = new Scanner(file);
        //Exception -> FileNotFoundException (наследник)

    }
}
