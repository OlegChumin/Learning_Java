package HackerRank.ProblemSolving;
/**
 * In this challenge, you are required to calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.
 * <p>
 * Function Description
 * <p>
 * Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.
 * <p>
 * aVeryBigSum has the following parameter(s):
 * <p>
 * int ar[n]: an array of integers .
 * Return
 * <p>
 * long: the sum of all array elements
 * Input Format
 * <p>
 * The first line of the input consists of an integer .
 * The next line contains  space-separated integers contained in the array.
 * <p>
 * Output Format
 * <p>
 * Return the integer sum of the elements in the array.
 * <p>
 * Constraints
 * <p>
 * <p>
 * Sample Input
 * <p>
 * 5
 * 1000000001 1000000002 1000000003 1000000004 1000000005
 * Output
 * <p>
 * 5000000015
 * Note:
 * <p>
 * The range of the 32-bit integer is .
 * When we add several integer values, the resulting sum might exceed the above range. You might need to use long int C/C++/Java to store such sums.
 */

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class AVeryBigSum {
}

class Result2 {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long sum = 0;
        for (Long element : ar) {
            sum += element;
        }
        return sum;
    }

}

class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Long> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Long::parseLong)
                .collect(toList());

        long result = Result2.aVeryBigSum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
