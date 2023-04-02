package HackerRank.exam;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        String dataType = input[0];
        int n = Integer.parseInt(input[1]);
        if (dataType.equals("Integer")) {
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(reader.readLine());
            }
            System.out.println(Arithmetic.sum(arr));
        } else if (dataType.equals("String")) {
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = reader.readLine();
            }
            System.out.println(Arithmetic.sum(arr));
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