package hackerrank_Java.PrepaireToInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        List<String> arrayListofStrings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String str = "";
        int i = 1;
        while (!str.contains("end-of-file")) {
            str = scanner.nextLine();
            arrayListofStrings.add("" + i + " " + str);
            i++;
        }
        for (String element : arrayListofStrings) {
            System.out.println(element);
        }
    }
}
