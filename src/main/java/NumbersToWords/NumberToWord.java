package NumbersToWords;

import java.util.Scanner;

public class NumberToWord {
    // Массив с наименованиями для чисел от 0 до 19
    private static final String[] units = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    // Массив с наименованиями для чисел десятков от 20 до 90
    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    // Функция для преобразования числа в его письменное наименование
    private static String numberToWord(int number) {
        if (number < 20) {
            return units[number];
        } else if (number < 100) {
            int unit = number % 10;
            int ten = number / 10;
            if (unit != 0) {
                return tens[ten] + "-" + units[unit];
            } else {
                return tens[ten];
            }
        } else {
            return "Invalid number!";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем число от пользователя
        System.out.print("Введите цифру (от 0 до 99): ");
        int number = scanner.nextInt();

        // Получаем письменное наименование числа и выводим его
        String word = numberToWord(number);
        System.out.println("Письменное представление введенного числа: " + word);
    }
}
