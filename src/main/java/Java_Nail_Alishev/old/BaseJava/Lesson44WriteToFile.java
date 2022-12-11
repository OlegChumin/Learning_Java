package Java_Nail_Alishev.old.BaseJava;

import java.io.*;

public class Lesson44WriteToFile {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String path = reader.readLine();

        File file = new File("test.txt");
        PrintWriter pw = new PrintWriter(file);  // только для записи текстовых данных
        pw.println("Test fist string to be written in file text.txt");
        pw.println("Test second string to be written in file text.txt");
        pw.close();
    }
}


//class ReadFile {
//    public void readFile(String path) throws FileNotFoundException {
//        File file = new File("test.txt");
//        Scanner scanner = new Scanner(file);
//        while (scanner.hasNextLine()) {
//            System.out.println(scanner.nextLine());
//        }
//        scanner.close();
//    }
//}
