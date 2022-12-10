package hackerrank_Java.ProblemSolving;
/**
 * Given an array of integers, find the sum of its elements.
 * <p>
 * For example, if the array , , so return .
 * <p>
 * Function Description
 * <p>
 * Complete the simpleArraySum function in the editor below. It must return the sum of the array elements as an integer.
 * <p>
 * simpleArraySum has the following parameter(s):
 * <p>
 * ar: an array of integers
 * Input Format
 * <p>
 * The first line contains an integer, , denoting the size of the array.
 * The second line contains  space-separated integers representing the array's elements.
 * <p>
 * Constraints
 * <p>
 * <p>
 * Output Format
 * <p>
 * Print the sum of the array's elements as a single integer.
 * <p>
 * Sample Input
 * <p>
 * 6
 * 1 2 3 4 10 11
 * Sample Output
 * <p>
 * 31
 * Explanation
 * <p>
 * We print the sum of the array's elements: .
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class SimpleArraySum {
}

class Result {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum = 0;
        for (Integer element : ar) {
            sum = sum + element;
        }
        return sum;
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

