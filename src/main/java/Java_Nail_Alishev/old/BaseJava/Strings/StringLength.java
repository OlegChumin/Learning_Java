package Java_Nail_Alishev.old.BaseJava.Strings;

public class StringLength {
    public static void main(String[] args) {
        System.out.println("Augsburg".length());
        String str1 = "Augsburg";
        System.out.println(str1.substring(str1.length() - 4, str1.length()));

        String str = "Jav";
        str = (str + str.charAt(1)).toLowerCase();
        System.out.println(str);
    }
}
