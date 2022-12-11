package Java_Nail_Alishev.old.BaseJava.Exceptions.Lesson_03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionSample_11 {
    public static void main(String[] args) throws FileNotFoundException { // checked -> Compile time exception
        String pathToFile = "src/main/java/Java/Alishev/Exceptions/Lesson_01/testingFile.txt";
        File file = new File(pathToFile);
        Scanner scanner = new Scanner(file);

        int a = 1 / 0; /* Unchecked (Runtime exception) */
    }
}
