package Advanced_Java.Part_04_RegExp;

import java.util.Arrays;

public class Lesson_032 {
    public static void main(String[] args) {
        String str = "Hello there hey";
        String regex = " ";
        String[] words = str.split(regex);
        System.out.println(Arrays.toString(words));

        String str2 = "Hello.there.hey";
        String regex2 = "\\.";
        String[] words2 = str2.split(regex2);
        System.out.println(Arrays.toString(words2));

        String str3 = "Hello453415345345there54626463456hey4562646hey";
        String regex3 = "\\d+";
        String[] words3 = str3.split(regex3);
        System.out.println(Arrays.toString(words3));

        String str4 = new String("Hello there hey");
        String fromStr4 = str4.replace(" ", ".");
        System.out.println(fromStr4);
        String fromStr4_2 = str4.replace(" ", "::");
        System.out.println(fromStr4_2);

        String fromStr3 = str3.replaceAll("\\d+", " ");
        System.out.println(fromStr3);
        String fromStr3_2 = str3.replaceFirst("\\d+", " ");
        System.out.println(fromStr3_2);
    }
}
