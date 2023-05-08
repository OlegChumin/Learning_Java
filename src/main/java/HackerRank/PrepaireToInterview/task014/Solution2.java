package HackerRank.PrepaireToInterview.task014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution2 {

    private static final String REGEX = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.)){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

    public static void main(String[] args) {
        String IPtoCheck = null;
        try {
            IPtoCheck = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (IPtoCheck != null) {
            System.out.println(IPtoCheck.matches(REGEX));
        }
    }
}