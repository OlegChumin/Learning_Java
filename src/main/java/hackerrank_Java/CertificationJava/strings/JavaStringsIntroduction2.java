package hackerrank_Java.CertificationJava.strings;

import java.util.Scanner;

/*
* Given a string, , and two indices,  and , print a substring consisting of all characters in the inclusive range from  to . You'll find the String class' substring method helpful in completing this challenge.

Input Format

The first line contains a single string denoting .
The second line contains two space-separated integers denoting the respective values of  and .

Constraints

String  consists of English alphabetic letters (i.e., ) only.
Output Format

Print the substring in the inclusive range from  to .

Sample Input

Helloworld
3 7
Sample Output

lowo
Explanation

In the diagram below, the substring is highlighted in green:

substring.png*/
public class JavaStringsIntroduction2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strS = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println(strS.substring(start, end));
    }

}
