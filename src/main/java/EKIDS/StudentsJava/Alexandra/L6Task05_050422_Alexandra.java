package EKIDS.StudentsJava.Alexandra;

public class L6Task05_050422_Alexandra {
    public static void main(String[] args) {
        System.out.println(UnionStrings.unionStrings("Всем","привет","ребята" ));
    }
}

class UnionStrings {                                                     /** класс Объединение строк  */
    public static String unionStrings (String a, String b, String c) {   /** метод объединение строк, который ссумирует три строки */
         return a + " " + b + " " + c;                                   /** Возврат */
        }

}

