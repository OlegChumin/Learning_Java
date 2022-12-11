package HackerRank.PrepaireToInterview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInttoString {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String s = n + "";
        if (s instanceof String) System.out.println("Good job");
        else System.out.println("Wrong answer");
    }


}
