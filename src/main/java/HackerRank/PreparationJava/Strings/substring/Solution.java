package HackerRank.PreparationJava.Strings.substring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    private static final int INDEX_ZERO = 0;
    private static final int INDEX_ONE = 1;

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int startIndex;
        int endIndex;
        try {
            str = bufferedReader.readLine();
            String[] indicesStr = bufferedReader.readLine().split(" ");
            startIndex = Integer.parseInt(indicesStr[INDEX_ZERO]);
            endIndex = Integer.parseInt(indicesStr[INDEX_ONE]);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String result = str.substring(startIndex, endIndex);
        System.out.println(result);

        try {
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
