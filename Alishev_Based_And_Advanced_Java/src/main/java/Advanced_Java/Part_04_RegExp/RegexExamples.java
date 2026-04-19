package Advanced_Java.Part_04_RegExp;

public class RegexExamples {
    public static void main(String[] args) {
        // .
        String regex1 = ".";
        String str1 = "a";
        boolean result1 = str1.matches(regex1); // true
        
        // []
        String regex2 = "[abc]";
        String str2 = "a";
        boolean result2 = str2.matches(regex2); // true
        
        // [^]
        String regex3 = "[^abc]";
        String str3 = "d";
        boolean result3 = str3.matches(regex3); // true
        
        // *
        String regex4 = "ab*";
        String str4 = "a";
        boolean result4 = str4.matches(regex4); // true
        
        // +
        String regex5 = "ab+";
        String str5 = "abbb";
        boolean result5 = str5.matches(regex5); // true
        
        // ?
        String regex6 = "ab?";
        String str6 = "a";
        boolean result6 = str6.matches(regex6); // true
        
        // {n}
        String regex7 = "ab{3}";
        String str7 = "abbb";
        boolean result7 = str7.matches(regex7); // true
        
        // {n,}
        String regex8 = "ab{3,}";
        String str8 = "abbbbbb";
        boolean result8 = str8.matches(regex8); // true
        
        // {n,m}
        String regex9 = "ab{3,5}";
        String str9_1 = "abbb";
        String str9_2 = "abbbbb";
        String str9_3 = "ab";
        boolean result9_1 = str9_1.matches(regex9); // true
        boolean result9_2 = str9_2.matches(regex9); // true
        boolean result9_3 = str9_3.matches(regex9); // false
        
        // |
        String regex10 = "a|b";
        String str10_1 = "a";
        String str10_2 = "b";
        String str10_3 = "c";
        boolean result10_1 = str10_1.matches(regex10); // true
        boolean result10_2 = str10_2.matches(regex10); // true
        boolean result10_3 = str10_3.matches(regex10); // false
    }
}
