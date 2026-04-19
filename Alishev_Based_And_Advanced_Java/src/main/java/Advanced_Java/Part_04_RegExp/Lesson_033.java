package Advanced_Java.Part_04_RegExp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Lesson_033 {
    public static void main(String[] args) {
        String text = "Привет!\n" +
                "\n" +
                "Мой адрес электронной почты: john@example.com.\n" +
                "Если у вас есть вопросы, пожалуйста, напишите мне.\n" +
                "\n" +
                "Еще один адрес электронной почты: sarah@mail.com.\n" +
                "Мы сможем обсудить все детали нашего проекта по электронной почте.\n" +
                "\n" +
                "И, наконец, последний адрес электронной почты: support@company.com.\n" +
                "Если у вас возникнут проблемы, не стесняйтесь обращаться к нашей службе поддержки.\n" +
                "\n" +
                "С наилучшими пожеланиями,\n" +
                "Ваш коллега";

        try {
            Pattern eMail = Pattern.compile("\\w+@\\w+\\.[a-z0-9]{2,3}"); //Factory method
            Matcher matcher = eMail.matcher(text);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } catch (PatternSyntaxException patternSyntaxException) {
            // обработка ошибки компиляции регулярного выражения
            patternSyntaxException.printStackTrace();
        } catch (IllegalStateException illegalStateException) {
            // обработка ошибки вызова метода find() в неправильном состоянии
            illegalStateException.printStackTrace(); //Вызов метода printStackTrace() выводит полную трассировку стека
            // исключения в консоль, что может помочь в диагностике ошибок и определении их причин.
        }

        /**
         * Выражение matcher.find() используется для поиска следующего вхождения регулярного выражения в тексте.
         * Метод find() ищет следующую последовательность символов, которая соответствует шаблону регулярного выражения,
         * начиная с позиции, на которой остановился предыдущий поиск. Если следующее вхождение найдено, то метод find()
         * вернет true, иначе - false.
         *
         * Метод matcher.group() возвращает строку, соответствующую последнему найденному вхождению регулярного
         * выражения. После вызова метода find(), текущее вхождение будет доступно через метод group(). Если find()
         * вернул true, то group() вернет строку, соответствующую найденному вхождению. Если find() вернул false, то
         * вызов group() приведет к исключению.
         *
         * Группа в регулярном выражении - это часть выражения, заключенная в круглые скобки. Группа позволяет выделить
         * определенную часть совпадения в регулярном выражении.
         *
         * Например, рассмотрим следующее регулярное выражение: (\d{3})-(\d{2})-(\d{4}). Здесь мы определили три группы
         * с помощью круглых скобок. Каждая группа содержит определенное количество цифр.
         *
         * Когда мы используем это выражение с помощью класса Matcher, мы можем вызвать метод group(n), чтобы получить
         * содержимое группы с номером n. Например, если мы найдем совпадение для строки "123-45-6789", мы можем
         * получить содержимое первой группы, вызвав метод group(1), который вернет "123". Аналогично, вызов метода
         * group(2) вернет "45", а вызов метода group(3) вернет "6789".
         *
         * В методе groupCount() возвращается количество групп, определенных в регулярном выражении. Если вы не
         * определяете группы в регулярном выражении, метод groupCount() всегда вернет 0.
         * */
        List<String> group_1 = new ArrayList<>();
        List<String> group_2 = new ArrayList<>();
        List<String> group_3 = new ArrayList<>();

        try {
            Pattern eMail2 = Pattern.compile("(\\w+)@(\\w+)\\.([a-z0-9]{2,3})"); //(group_1)@(group_2).(group_3)
            Matcher matcher = eMail2.matcher(text);
            while (matcher.find()) {
                group_1.add(matcher.group(1));
                group_2.add(matcher.group(2));
                group_3.add(matcher.group(3));
            }
        } catch (PatternSyntaxException patternSyntaxException) {
            // обработка ошибки компиляции регулярного выражения
            patternSyntaxException.printStackTrace();
        } catch (IllegalStateException illegalStateException) {
            // обработка ошибки вызова метода find() в неправильном состоянии
            illegalStateException.printStackTrace(); //Вызов метода printStackTrace() выводит полную трассировку стека
            // исключения в консоль, что может помочь в диагностике ошибок и определении их причин.
        }
        System.out.println(group_1);
        System.out.println(group_2);
        System.out.println(group_3);
    }
}