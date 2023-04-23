package HackerRank.PrepaireToInterview.task004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaTask004 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int intNumber = Integer.parseInt(reader.readLine());
        double doubleNumber = Double.parseDouble(reader.readLine());
        String string = reader.readLine();
        reader.close();

        System.out.println("String: " + string);
        System.out.println("Double: " + doubleNumber);
        System.out.println("Int: " + intNumber);

    }
}
