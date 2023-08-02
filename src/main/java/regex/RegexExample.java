package regex;

import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";

        // Компилируем регулярное выражение для поиска слова "quick"
        Pattern pattern = Pattern.compile("\\bquick\\b");
        Matcher matcher = pattern.matcher(text);

        // Поиск соответствия регулярному выражению
        if (matcher.find()) {
            System.out.println("Found match: " + matcher.group());
        } else {
            System.out.println("No match found.");
        }
    }
}
