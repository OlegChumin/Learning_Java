package String.StringBuilder;

// https://blogs.oracle.com/javamagazine/post/quiz-yourself-manipulate-data-with-stringbuilder-intermediate
public class TestStringBuildeer {

    public static void main(String[] args) {
        StringBuilder originalText =
                new StringBuilder("ABC"); // создаем переменную и присваиваем ей значение
        StringBuilder text = originalText; // присваиваем значение созданной переменной новой переменной
        // сейчас обе переменные originalText и text ссылаются на один и тот же объект
        System.out.println("originalText = " + originalText);
        System.out.println("text = " + text);
        System.out.println();
        originalText.append("DEF"); // добавляем в первую переменную еще текст
        System.out.println("originalText = " + originalText);
        System.out.println("text = " + text); // во второй переменной тоже будет тот же текст
        System.out.println();
        originalText = edit(text); // вызов метода ниже, изменяющего строку
        System.out.println("originalText = " + originalText);
        System.out.println("text = " + text); // во второй переменной тоже будет тот же текст
        System.out.println();

        originalText = text.append("XYZ"); // добавляем во вторую переменную текст
        System.out.println("originalText = " + originalText);
        System.out.println("text = " + text); // во второй переменной тоже будет тот же текст
        System.out.println();

        System.out.print(originalText);
    }

    // удаляет все в строке с поз 2 до 3
    static StringBuilder edit(StringBuilder originalText) {
        return originalText.delete(2, 3);
    }
}
