package materials.lesson_02_05.strings;
// C:\Users\Oleg\.jdks\corretto-1.8.0_392\bin\javadoc.exe -protected -splitindex -d C:\Users\Oleg\IdeaProjects\Hello_World\target\Docs -encoding UTF-8 C:\Users\Oleg\IdeaProjects\Hello_World\src\main\java\materials\lesson_02\strings\StringOperationsExample.java


/**
 * Этот код демонстрирует различные операции работы со строками в Java, такие как конкатенация, получение подстроки,
 * преобразование регистра, замена символов, проверка наличия подстроки, сравнение строк и удаление начальных и
 * конечных пробелов. Вы можете скопировать и выполнить этот код в своей среде разработки для изучения результатов.
 */

public class StringOperationsExample {
    public static void main(String[] args) {
        // Создание строк
        String str1 = "Hello";
        String str2 = new String(" World");

        // Объединение строк (конкатенация)
        String result1 = str1 + str2;
        System.out.println("Concatenation Result 1: " + result1);

        // Использование метода concat()
        String result2 = str1.concat(str2);
        System.out.println("Concatenation Result 2: " + result2);

        // Получение длины строки
        int length = result1.length();
        System.out.println("Length of Result 1: " + length);

        // Получение подстроки
        String substring = result1.substring(6);
        System.out.println("Substring of Result 1: " + substring);

        // Преобразование к верхнему/нижнему регистру
        String upperCase = result1.toUpperCase();
        String lowerCase = result1.toLowerCase();
        System.out.println("Uppercase Result 1: " + upperCase);
        System.out.println("Lowercase Result 1: " + lowerCase);

        // Замена символов
        String replaced = result1.replace('o', 'X');
        System.out.println("Replacement Result 1: " + replaced);

        // Проверка наличия подстроки
        boolean contains = result1.contains("World");
        System.out.println("Contains 'World' in Result 1: " + contains);

        // Сравнение строк
        boolean equals = str1.equals("Hello");
        boolean equalsIgnoreCase = str1.equalsIgnoreCase("hello");
        System.out.println("Equals 'Hello': " + equals);
        System.out.println("EqualsIgnoreCase 'hello': " + equalsIgnoreCase);

        // Удаление начальных и конечных пробелов
        String stringWithSpaces = "  Trim me  ";
        String trimmed = stringWithSpaces.trim();
        System.out.println("Trimmed Result: '" + trimmed + "'");
    }
}
