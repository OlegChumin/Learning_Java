package hackerrank_Java.PrepaireToInterview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaTask006 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        reader.close();

        for (int i = 1; i < 11; i++) {
            System.out.println(N+" x "+i+" = "+(N * i));
        }
    }

}
