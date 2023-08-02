package regex;

import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog"; //строка с регулярным выражением

        // Компилируем регулярное выражение для поиска слова "quick"
        Pattern pattern = Pattern.compile("\\bquick\\b"); // Создает объект Pattern, представляющий
        // скомпилированное регулярное выражение.

        Matcher matcher = pattern.matcher(text); //Создает объект Matcher, который будет использоваться для поиска
        // соответствий регулярному выражению в input. input может быть строкой или другим объектом, реализующим
        // интерфейс CharSequence, например, String, StringBuffer, или StringBuilder.

        // Поиск соответствия регулярному выражению
        if (matcher.find()) {
            System.out.println("Found match: " + matcher.group());
        } else {
            System.out.println("No match found.");
        }
    }
}
