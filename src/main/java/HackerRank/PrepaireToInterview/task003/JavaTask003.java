package HackerRank.PrepaireToInterview.task003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaTask003 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        reader.close(); //close reader
        String line = "Weird";
        if (n % 2 != 0) {
            System.out.println(line);
        } else if (n % 2 == 0 && n >= 2 && n <= 5) {
            System.out.println("Not " + line);
        } else if (n % 2 == 0 && n >= 6 && n <= 20) {
            System.out.println(line);
        } else if (n % 2 == 0 && n > 20) {
            System.out.println("Not " + line);
        }
    }
}