package HackerRank.PreparationJava.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringOperations {

    private static final int INDEX_ZERO = 0;
    private static final int INDEX_ONE = 1;
    private static final int ZERO = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str1 = reader.readLine();
        String str2 = reader.readLine();

        int sumLength = str1.length() + str2.length();
        System.out.println(sumLength);

        if (str1.compareTo(str2) > ZERO) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


        reader.close();
    }

    private static char firstCharToUpperCase(String str) {
        return Character.toUpperCase(str.charAt(INDEX_ZERO));
    }

    private static String changeFirstCharInStringToUpperCase(char firstCharInUpperCase, String str) {
        return firstCharInUpperCase + str.substring(INDEX_ONE);
    }
}
