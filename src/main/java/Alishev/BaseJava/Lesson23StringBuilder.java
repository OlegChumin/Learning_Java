package Alishev.BaseJava;

import java.util.Locale;

public class Lesson23StringBuilder {
    public static void main(String[] args) {
        String str = new String("Oleg Chumin"); //immutable
        String str2 = " Valerieviсh 1975"; //immutable
        str.toUpperCase(); //not changing immutable object str
        System.out.println(str);
        str = str.toUpperCase(); // reconsider new date for immutable str
        System.out.println(str);
        str2 = str2.toUpperCase();
        System.out.println(str+str2);

        StringBuilder stringBuilder = new StringBuilder("Hello ");
        System.out.println(stringBuilder.toString());
        stringBuilder.append(" my");
        stringBuilder.append(" friends!");
        System.out.println(stringBuilder.toString());
        stringBuilder.append(" Glad to ").append("hear You! ");
        System.out.println(stringBuilder.toString());

        System.out.println();
        System.out.print("23 lesson proceeding..");
        System.out.print("  Hi");
        System.out.printf("This is a string, %s, %d", " NICE ", 45);
        System.out.printf("\nString %10d", 532);
        System.out.printf("\nString %10d", 5);
        System.out.printf("\nString %10d", 1000000030);
        System.out.printf("\nString %-10d", 532);
        System.out.printf("\nString %-10d", 5);
        System.out.printf("\nString %-10d", 1000000030);

        System.out.println();
        System.out.printf("String %.2f\n", 45.23422342);
        System.out.printf("String %.2f\n", 43.23534542);
        System.out.printf("String %.2f\n", 47.2373452342);
        System.out.printf("String %.2f\n", 49.26443342);
    }
}
