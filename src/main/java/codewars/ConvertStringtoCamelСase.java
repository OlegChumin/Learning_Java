package codewars;
/**
 * Convert string to camel case
 * Complete the method/function so that it converts dash/underscore delimited words into camel casing.
 * The first word within the output should be capitalized only if the original word was capitalized
 * (known as Upper Camel Case, also often referred to as Pascal case).
 * Завершите метод / функцию, чтобы он преобразовывал слова, разделенные тире / подчеркиванием, в верблюжий регистр.
 * Первое слово в выводе должно быть с заглавной буквы, только если исходное слово было с заглавной буквы.
 * известный как верхний регистр верблюда, также часто называемый регистром Паскаля).
 * Examples
 * "the-stealth-warrior" gets converted to "theStealthWarrior"
 * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
 * */
public class ConvertStringtoCamelСase {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("the-stealth-warrior");
        char[] strArray = "the-stealth-warrior".toCharArray();
        for(char element : strArray) {
            System.out.print(element);
        }
//        stringBuilder.replace
    }
}

class Solution {
    static String toCamelCase(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] strArray = s.toCharArray();
        for(char element : strArray) {
            System.out.println(element);
        }
        stringBuilder.append(s);

//        stringBuilder.replace("-", "-", "");
        return stringBuilder.toString();
    }
}