package HackerRank.PrepaireToInterview.task009;

import java.io.*;

public class Solution {
    private static final BufferedReader BUFFERED_READER = new BufferedReader(new InputStreamReader(System.in));
    private static final String MESSAGE = "java.lang.Exception: Breadth and height must be positive";

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            int breadth = Integer.parseInt(BUFFERED_READER.readLine());
            int height = Integer.parseInt(BUFFERED_READER.readLine());
            if (breadth <= 0 || height <= 0) {
                throw new NumberFormatException();
            }
            System.out.println(breadth * height);
        } catch (IOException | NumberFormatException e) {
            System.out.println(MESSAGE);
        }
    }
}