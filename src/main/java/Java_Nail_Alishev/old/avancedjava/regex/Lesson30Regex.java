package Java_Nail_Alishev.old.avancedjava.regex;

public class Lesson30Regex {
    public static void main(String[] args) {
        String a = "1234";
        System.out.println(a.matches("12345"));

        //  \\d - одна цифра [0..9]
        //  + --> 1 или более символов шаблона до бесконечности
        //  * --> 0 или более символов шаблона
        //  \\w - любая буква,   \\w+ 1 или более любых букв,   \\w* - 0 или более любых букв
        String b = "9";
        System.out.println(b.matches("\\d"));

        String с = "9788976876";
        System.out.println(с.matches("\\d+"));

        String d = "977878787887788";
        System.out.println(с.matches("\\d*"));
        String e = "";
        System.out.println(e.matches("\\d*"));

        String f1 = "-2342";
        String f2 = "2342";
        String f3 = "+2342";
        //  ? --> 0 или 1  символов перед знаком ?
        System.out.println(f1.matches("-\\d*"));
        System.out.println(f2.matches("-?\\d*"));
        System.out.println();
        // (a|b|c|...) --> в скобках прописываются варианты символов
        System.out.println(f1.matches("(-|\\+)?\\d*"));
        System.out.println(f2.matches("(-|\\+)?\\d*"));
        System.out.println(f3.matches("(-|\\+)?\\d*"));

        System.out.println();
        String g = "g231498234";
        // [a|b|c|d..|z] --> [a-zA-Z] - все английские буквы
        //  [abs] --> [a|b|s]
        System.out.println(g.matches("[a-zA-Z]?\\d+"));

        String g1 = "gwefefweEREGEER231498234";
        System.out.println(g.matches("[a-zA-Z]+\\d+"));

        String g2 = "gwef84844484efweEREGEER231498234";
        System.out.println(g.matches("[a-zA-Z84]+\\d+"));

        System.out.println();
        // если встроке нет символов [^abz] ^ - отрицание - нет символов a, b и z
        String h = "a34rf34fefvrz";
        System.out.println(h.matches("[^abz]*"));
        String h1 = "fdjvkjdfsdjknsdkn";
        System.out.println(h1.matches("[^abz]*"));

        //   "." --> любой символ
        String url = "http://www.sitename.com";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));

        String url2 = "http://www.yandex.ru";
        System.out.println(url2.matches("http://www\\.[a-zA-Z]+\\.(com|ru)"));

        String url3 = "http://www..ru";
        System.out.println(url3.matches("http://www\\.[a-zA-Z]+\\.(com|ru)"));

        System.out.println();
        // {2} ---> два символа до.. или {2, } или {2, 4}
        // {2, } --> два или более символа
        // {2, 4} --> от двух дол 4 символов
        String i = "123";
        System.out.println(i.matches("\\d{2}")); // - всего две цифры в строке
        System.out.println(i.matches("\\d{3}")); // - всего три цифры в строке
        System.out.println(i.matches("\\d{3,}")); // - три и более цифры в строке
        System.out.println(i.matches("\\d{1,3}")); // - от 1 до 3 цифр в строке

        //   \\w - символ 1 буква - любая буква из [a-zA-Z]
        // ^начало строк
        // $ конец строки

    }
}
