package Java_Nail_Alishev.old.avancedjava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson32Regex {
    public static void main(String[] args) {
        //два класса для дополнительных возможностей помимо методов класса String
        //Patter и Matcher
        //Pattern - само регулярное выражение
        //Matcher - для операций над текстом, строкой

        String text = "Hello to All! I send my E-mail address tschumin.oleg@gmail.com, \n" +
                "so we can keep in touch.\n" +
                "Thanks, Oleg. That's good/ I'm sending you my address: \n" +
                "darknetxakep@gmail.com/ Let's stay in touch.";
        //Pattern и Matches чаще используются для поиска включений в текстах
        Pattern email = Pattern.compile("(\\w+\\d*\\.?\\w+)@(gmail|yandex)\\.((com)|ru)");  // объекты класса Pattern создавать нельзя у Pattern конструктор private
        //это и есть паттерн проектирования Factory, который статическим методом выдает новый объект класса
        Matcher matcher = email.matcher(text); //создается объект matcher на основе паттерна email

        while(matcher.find()) { //find() ищет очередное соответствие паттерну
            System.out.println(matcher.group()); //метод group() получает все совпадения методом find()
            //group() = без аргументов получает полностью всю подстроку
            //group((1)(2)(3))  group(1((2)(3))), group((1(2)), (3))
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
            System.out.println(matcher.group(4));
        }

    }
}
