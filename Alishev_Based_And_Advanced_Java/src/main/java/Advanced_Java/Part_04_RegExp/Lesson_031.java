package Advanced_Java.Part_04_RegExp;

public class Lesson_031 {
    public static void main(String[] args) {
        String a = "1234";
        String b = new String("1234"); //true
        System.out.println(a.matches(b));

        String c = new String("12345"); //false
        System.out.println(a.matches(c));

        /**
         \\d - одна цифра
         \\w - одна буква
         "\s" - соответствует любому символу пробела, включая пробелы, табуляции и переводы строк
         "\" - соответствует символу обратной косой черты например \\$
         + -> 1 или более
         * -> 0 или более
         ? -> 0 или 1 символов до (может быть, а может и не быть)
         (x|y|z) -> одна строка из множества строк
         [a-zA-Z] - все английские буквы строчные и прописные (заглавные)
         [abc] == (a|b|c)
         [cdef] == (c|d|e|f)
         [0-9] == \\d  - одна цифра, любая из 0..9

         [^abc] - ^ означает отрицание символы фис не должны быть в конечнмо множестве, т.е.
         все символы проме а, b и c

         . -> любой символ

         {2} - два символа до "\d{2}"
         {2, } - два или более символов
         {2, ?} -> некорректно, {2, .} -> некорректно {2, *}
         {2, 4} - от 2 до четырех символов квантификатор должен указаывтаь на количество символов
         Символ "^" (каретка) в регулярных выражениях означает начало строки, а символ "$" - конец строки. Если эти
         символы используются в регулярном выражении, они указывают, что совпадение должно начинаться в начале строки и
         заканчиваться в конце строки.
         * */

        String str1 = "1";
        String str2 = new String("\\d"); //true
        System.out.println("str1=" + str1 + " matches(str2=" + str2 + ") == " + str1.matches(str2));
        System.out.println();

        String str3 = "113453454";
        String str4 = new String("\\d+"); //true "\\d+" -> 1 или более цифр
        System.out.println("str3=" + str3 + " matches(str5=" + str4 + ") == " + str3.matches(str4));
        System.out.println();

        String str5 = "-41241";
        String str6 = new String("-\\d*"); //true "\\d*" -> 0 или более цифр
        System.out.println("str5=" + str5 + " matches(str6=" + str6 + ") == " + str5.matches(str6));
        System.out.println();

        String str7 = "41241";
        String str8 = new String("-?\\d*"); //true "-?\\d*" -> знак - может быть или нет, d* -> от 0 цифр
        System.out.println("str7=" + str7 + " matches(str8=" + str8 + ") == " + str7.matches(str8));
        System.out.println();

        String str9 = "+41241";
        String str10 = new String("-?\\d*"); //false "-?\\d*" -> знак +, d* -> от 0 цифр
        System.out.println("str9=" + str9 + " matches(str10=" + str10 + ") == " + str9.matches(str10));
        System.out.println();

        String str11 = "+41241";
        String str12 = new String("-?\\d*"); //false "-?\\d*" -> знак +, d* -> от 0 цифр
        System.out.println("str11=" + str11 + " matches(str12=" + str12 + ") == " + str11.matches(str12));
        System.out.println();

        String str13 = "41241";
        String str14 = "-41241";
        String str15 = "+41241";
        String regex3 = new String("(-|\\+|)?\\d+");
        System.out.println("str13=" + str13 + " matches(regex3=" + regex3 + ") == " + str13.matches(regex3)); //true
        System.out.println("str14=" + str14 + " matches(regex3=" + regex3 + ") == " + str14.matches(regex3)); //true
        System.out.println("str15=" + str15 + " matches(regex3=" + regex3 + ") == " + str15.matches(regex3)); //true
        System.out.println();

        String str16 = "g1354251"; // вариант (a|b|c|d....) - неудобно
        String regex4 = "[a-zA-Z]\\d+";
        System.out.println("str16=" + str16 + " matches(regex4=" + regex4 + ") == " + str16.matches(regex4)); //true
        System.out.println();

        String str17 = "RsdfTg1354251"; //
        String regex5 = "[a-zA-Z]+\\d+";
        System.out.println("str17=" + str17 + " matches(regex5=" + regex5 + ") == " + str17.matches(regex5)); //true
        System.out.println();

        String str18 = "333Rsd3311133111fTg1354251"; //
        String regex6 = "[a-zA-Z31]+\\d+";
        System.out.println("str18=" + str18 + " matches(regex6=" + regex6 + ") == " + str18.matches(regex6)); //true
        System.out.println();

        String str19 = "hello"; //
        String regex7 = "[^abc]*"; // означает все символы 0 или более, но кроме a b и с
        System.out.println("str19=" + str19 + " matches(regex7=" + regex7 + ") == " + str19.matches(regex7)); //true
        System.out.println();

        String url = "https://www.google.tr"; //проверка на соответствие адреса URL
        String regexURL = "htt(p|ps)://www\\..+\\.(com|ru|de|tr|au|net|io)"; // либо http|https + //www.имя сайта. домен
        System.out.println("url=" + url + " matches(regexURL" + regexURL + ") == " + url.matches(regexURL)); //true
        System.out.println();

        String strTest = "123";
        String regex = "\\d{2,}";
        System.out.println("strTest=" + strTest + " matches(regex" + regex + ") == " + strTest.matches(regex)); //true

        String strHashtag = "#hasgtag/";
        String regexHashtag = "^#.{1,64}/$"; // строка начинается с # далее любые символы от 1 до 64 и заканчивается /
        System.out.println("strHashtag=" + strHashtag + " matches(regex" + regexHashtag + ") == " + strHashtag.matches(regexHashtag)); //true

        String regex1 = "^\\$.+/$";
        String input1 = "$Hello, world!/";
        String input2 = "$Hello, world!";
        System.out.println(input1.matches(regex1)); // true есть ода символа $ в начале строки и / в конце
        System.out.println(input2.matches(regex1)); // false нет символа /
    }
}
