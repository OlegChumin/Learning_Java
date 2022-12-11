package HackerRank.PrepaireToInterview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coding2certification {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sentence = bufferedReader.readLine();

        Result.typeCounter(sentence);

        bufferedReader.close();
    }
}

class Result {

    /*
     * Complete the 'typeCounter' function below.
     *
     * The function accepts STRING sentence as parameter.
     */

    public static void typeCounter(String sentence) {
        int strCounter = 0;
        int intCounter = 0;
        int doubleCounter = 0;
        String[] splitted = sentence.split(" ");
        for (String element : splitted) {
            if (element.matches("[-+]?\\d+")) {
                intCounter++;
            }
            if (element.matches("((-|\\\\+)?[0-9]+(\\\\.[0-9]+)?)+")) {
                doubleCounter++;
            } else strCounter++;
        }
        System.out.println("string " + strCounter);
        System.out.println("integer " + intCounter);
        System.out.println("double " + doubleCounter);
    }

}
