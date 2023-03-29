package HackerRank.PreparationJava.Java_s_System_out_printf;

import java.util.Scanner;
/**
 В Java, %-15s%03d%n - это форматированная строка, используемая в методе System.out.printf() для вывода данных с
 определенным форматированием. Разберем каждую часть данной строки:

 % - символ, указывающий начало описания формата.
 - - указывает, что строка должна быть выровнена по левому краю.
 15 - число, определяющее ширину поля вывода (в данном случае, 15 символов).
 s - указывает, что данные имеют тип String.
 % - символ, указывающий начало описания следующего формата.
 0 - указывает, что число должно быть дополнено ведущими нулями.
 3 - число, определяющее количество цифр в числе (в данном случае, 3 цифры).
 d - указывает, что данные имеют тип int (целое число).
 % - символ, указывающий начало описания следующего формата.
 n - указывает на символ новой строки, который соответствует системному разделителю строк (\n для Unix-систем или \r\n
 для Windows).
 Таким образом, форматированная строка %-15s%03d%n используется для вывода строки, выровненной по левому краю и
 анимающей ровно 15 символов, затем целого числа, дополненного ведущими нулями и состоящего из ровно 3 цифр, и, наконец,
 символа новой строки.
 * */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

    }
}
