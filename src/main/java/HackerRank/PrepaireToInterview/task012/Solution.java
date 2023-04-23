package HackerRank.PrepaireToInterview.task012;

import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Создаем объекты NumberFormat для разных локаций
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US); /**
         В этой строке кода создается экземпляр класса NumberFormat, специализированный для форматирования чисел в виде
         валюты для локали Locale.US. Это означает, что при форматировании чисел, используя этот экземпляр, числа будут
         отображаться в формате денежных единиц для США, также известном как доллары США. Метод getCurrencyInstance -
         это статический метод класса NumberFormat, который возвращает экземпляр NumberFormat, оптимизированный для
         форматирования валюты.*/
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        /**
         * В этой строке создается экземпляр класса NumberFormat, который также специализирован для форматирования чисел
         * в виде валюты, но уже для локали en_IN - это индийская локаль с языком на английском языке. Вместо
         * использования константы Locale.US, как в случае с США, мы создаем новый экземпляр Locale, который использует
         * язык на английском ("en") и код страны для Индии ("IN"). Это означает, что при форматировании чисел,
         * используя этот экземпляр, числа будут отображаться в формате денежных единиц для Индии, также известном как
         * индийские рупии.
         * */
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        // Форматируем сумму для каждой локации
        String us = usFormat.format(payment);
        String india = indiaFormat.format(payment);
        String china = chinaFormat.format(payment);
        String france = franceFormat.format(payment);

        // Выводим отформатированные значения
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
