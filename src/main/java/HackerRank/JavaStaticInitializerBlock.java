package HackerRank;
/**
 * Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.
 * <p>
 * It's time to test your knowledge of Static initialization blocks. You can read about it here.
 * <p>
 * You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth  and height . You should read the variables from the standard input.
 * <p>
 * If  or  , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
 * <p>
 * Input Format
 * <p>
 * There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
 * <p>
 * Sample input 1
 * <p>
 * 1
 * 3
 * Sample output 1
 * <p>
 * 3
 * Sample input 2
 * <p>
 * -1
 * 2
 * Sample output 2
 * <p>
 * java.lang.Exception: Breadth and height must be positive
 */

import java.util.*;

public class JavaStaticInitializerBlock {

}

class Solution {
    static boolean flag;
    static int B, H;

    static {
        readData();
        if (B > 0 && H > 0) {
            flag = true;
        } else System.out.println("java.lang.Exception: Breadth and height must be positive");
    }

    public static void readData() {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }//end of main
}//end of class
