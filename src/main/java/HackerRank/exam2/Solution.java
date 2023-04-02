package HackerRank.exam2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");

        if (isNumeric(input[0])) {
            Integer[] arr = new Integer[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }
            System.out.println(Arithmetic.sum(arr));
        } else {
            System.out.println(Arithmetic.sum(input));
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

class Arithmetic {
    public static int sum(Integer[] arr) {
        int sum = 0;
        for (Integer num : arr) {
            sum += num;
        }
        return sum;
    }

    public static String sum(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();
    }
}
