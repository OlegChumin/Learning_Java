package HackerRank.PrepaireToInterview.task014;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));

        }

    }
}

class MyRegex {
    String pattern = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.)){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

                        //0..199   or
     String pattern2 = "[0-2][0-5][0-5]"; //each 000 <= 255

//    Pattern IP = Pattern.compile(regex);
//
//    String inputString = "0.0.0.0";
//
//    static boolean isIP(String inputString) {
//        return inputString.matches(new MyRegex().inputString);
//    }
}
