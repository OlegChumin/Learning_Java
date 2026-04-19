package lesson_06;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GreedyAlgorithms {
    public static void main(String[] args) {
        int[] digits = {1, 3, 7, 9, 9, 5};
        System.out.println(maxNumberFromDigits(digits));
        System.out.println();
        System.out.println(maxNumberFromDigitsViaStreams(digits));
    }

    public static String maxNumberFromDigits(int[] digits) {
        Arrays.sort(digits); // {1, 3, 7, 9, 9, 5} -> {1, 3, 5, 7, 9, 9} O(n log(n)) сортировка слиянием
        //O(n log(n))
        //O(n)
        String result = "";
        for (int i = digits.length - 1; i >= 0; i--) {
            result += digits[i];
        }
        return result;
    }

    public static String maxNumberFromDigitsViaStreams(int[] digits) {
        return String.join("", Arrays.stream(digits).boxed()
                .sorted(Collections.reverseOrder())
                .map(String::valueOf)
                .toArray(String[]::new));
    }
}
