package materials.lesson_02_05.JavaDoc;

/**
 * <p>Таблица обозначений для форматированного вывода:</p>
 *
 * <table border="1">
 *     <caption>Обозначения</caption>
 *     <tr>
 *         <th>Тип</th>
 *         <th>Обозначение</th>
 *         <th>Пример</th>
 *         <th>Описание</th>
 *     </tr>
 *     <tr>
 *         <td>Целые числа</td>
 *         <td>{@code %d}</td>
 *         <td>{@code "%d"}</td>
 *         <td>Форматирование целых чисел.</td>
 *     </tr>
 *     <tr>
 *         <td>Дробные числа</td>
 *         <td>{@code %f}</td>
 *         <td>{@code "%f"}</td>
 *         <td>Форматирование чисел с плавающей точкой.</td>
 *     </tr>
 *     <tr>
 *         <td>Строки</td>
 *         <td>{@code %s}</td>
 *         <td>{@code "%s"}</td>
 *         <td>Форматирование строк.</td>
 *     </tr>
 *     <tr>
 *         <td>Символы</td>
 *         <td>{@code %c}</td>
 *         <td>{@code "%c"}</td>
 *         <td>Форматирование символов.</td>
 *     </tr>
 *     <tr>
 *         <td>Ширина поля</td>
 *         <td>{@code %n$}</td>
 *         <td>{@code "%1$d"}</td>
 *         <td>Определение номера аргумента.</td>
 *     </tr>
 *     <tr>
 *         <td>Выравнивание</td>
 *         <td>{@code %n$-m}</td>
 *         <td>{@code "%1$-10s"}</td>
 *         <td>Выравнивание по левому краю.</td>
 *     </tr>
 *     <tr>
 *         <td>Десятичные</td>
 *         <td>{@code %n$.2f}</td>
 *         <td>{@code "%1$.2f"}</td>
 *         <td>Форматирование с фиксированным количеством десятичных знаков.</td>
 *     </tr>
 *     <tr>
 *         <td>Шестнадцатеричные</td>
 *         <td>{@code %n$x}</td>
 *         <td>{@code "%1$x"}</td>
 *         <td>Форматирование шестнадцатеричных чисел.</td>
 *     </tr>
 * </table>
 */


public class FormattedOutputExampleFull {
    public static void main(String[] args) {
        int intValue = 42;
        double doubleValue = 3.14159;
        String stringValue = "Hello";
        char charValue = 'A';

        // Пример форматированного вывода
        String formattedOutput = String.format("Целое число: %d, Дробное число: %.2f, Строка: %s, Символ: %c",
                intValue, doubleValue, stringValue, charValue);

        System.out.println(formattedOutput);

        // Дополнительные примеры
        System.out.printf("Выравнивание по левому краю: %-10s\n", stringValue);
        System.out.printf("Форматирование числа с фиксированным количеством десятичных знаков: %.2f\n", doubleValue);
        System.out.printf("Форматирование шестнадцатеричного числа: %x\n", intValue);
    }
}
