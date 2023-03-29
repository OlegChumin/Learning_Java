//package HackerRank.New30daysCoding;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//
///**
// * Objective
// * Today we will expand our knowledge of strings, combining it with what we have already learned about loops.
// * Check out the Tutorial tab for learning materials and an instructional video.
// * <p>
// * Task
// * Given a string, , of length  that is indexed from  to , print its even-indexed and odd-indexed characters as
// * space-separated strings on a single line (see the Sample below for more detail).
// * <p>
// * Note:  is considered to be an even index.
// * <p>
// * Example
// * <p>
// * <p>
// * Print abc def
// * <p>
// * Input Format
// * <p>
// * The first line contains an integer,  (the number of test cases).
// * Each line  of the  subsequent lines contain a string, .
// * <p>
// * Constraints
// * <p>
// * Output Format
// * <p>
// * For each String  (where ), print 's even-indexed characters, followed by a space, followed by 's odd-indexed
// * characters.
// * <p>
// * Sample Input
// * <p>
// * 2
// * Hacker
// * Rank
// * Sample Output
// * <p>
// * Hce akr
// * Rn ak
// * Explanation
// * <p>
// * Test Case 0:
// * <p>
// * <p>
// * The even indices are , , and , and the odd indices are , , and . We then print a single line of  space-separated
// * strings; the first string contains the ordered characters from 's even indices (), and the second string contains
// * the ordered characters from 's odd indices ().
// * <p>
// * Test Case 1:
// * <p>
// * <p>
// * <p>
// * <p>
// * The even indices are  and , and the odd indices are  and . We then print a single line of  space-separated strings;
// * the first string contains the ordered characters from 's even indices (), and the second string contains the ordered
// * characters from 's odd indices ().
// */
//
//public class String001 {
//
//    public static void main(String[] args) {
//        int t = readT();
//        String[] arrayStr = new String[t];
//        System.out.println(Arrays.toString(arrayStr));
//        arrayStr[0] = readStr();
//
//        //String[] arrayStr = readStr(t);
//        //System.out.println(Arrays.toString(arrayStr));
////        readStr(t);
////        Arrays.toString(arrayStr);
//    }
//
//    public static int readT() {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int t = 1;
//        try {
//            t = Integer.parseInt(reader.readLine());
//            reader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return t;
//    }
//
//    public static String readStr() {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String str = "";
//        try {
//            str = (String) reader.readLine();
//            reader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return str;
//    }
//
//    public static void printEvenAndOddChars(String str) {
//        String evenStr = "" + str.charAt(0);
//        String oddStr = "";
//
//        for (int i = 1; i < str.length(); i++) {
//            if (i % 2 != 0) {
//                oddStr += str.charAt(i);
//            } else {
//                evenStr += str.charAt(i);
//            }
//        }
//        System.out.println(evenStr + " " + oddStr);
//    }
//
//}
