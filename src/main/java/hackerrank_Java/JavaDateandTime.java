package hackerrank_Java;
/**
 * The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.
 *
 * You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
 *
 * Example
 *
 *
 *
 * The method should return  as the day on that date.
 *
 * image
 * Function Description
 *
 * Complete the findDay function in the editor below.
 *
 * findDay has the following parameters:
 *
 * int: month
 * int: day
 * int: year
 * Returns
 *
 * string: the day of the week in capital letters
 * Input Format
 *
 * A single line of input containing the space separated month, day and year, respectively, in    format.
 *
 * Constraints
 *
 * Sample Input
 *
 * 08 05 2015
 * Sample Output
 *
 * WEDNESDAY
 * Explanation
 *
 * The day on August th  was WEDNESDAY.*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaDateandTime {
    public static void main(String[] args) {
        System.out.println(ResultDate.findDay(05, 11, 2021));
    }
}

class ResultDate {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar calendar = new GregorianCalendar(year, month, day);
        int numDate = calendar.get(Calendar.DAY_OF_WEEK);
        String result = String.valueOf(numDate);
        return result;
    }

}

//class SolutionDate {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int month = Integer.parseInt(firstMultipleInput[0]);
//
//        int day = Integer.parseInt(firstMultipleInput[1]);
//
//        int year = Integer.parseInt(firstMultipleInput[2]);
//
//        String res = ResultDate.findDay(month, day, year);
//
//        bufferedWriter.write(res);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}


