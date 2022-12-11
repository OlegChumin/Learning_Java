package Java_Nail_Alishev.old.BaseJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson36ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String sep = File.separator;
        File file = new File("D:" + sep + "Downloaded" + sep + "todownload.txt");

        Scanner scanner = new Scanner(file);
        String input = scanner.nextLine();
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();

    }

}
