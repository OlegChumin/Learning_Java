package Java_Zaur_Tregulov.Part_1_Base_Java;

//solving polindrom cases
public class StringsMethods {
    public static void main(String[] args) {
        String str1 = "kazak";  //polindrom
        boolean flag = false;

        for (int i = 0; i < str1.length() / 2; i++) {
            if (str1.charAt(i) == str1.charAt(str1.length() - 1)) {
                flag = true;
            }
        }
        System.out.println(flag);


        String str2 = "KazAk";  //polindrom
        flag = false;

        String str3 = str2.toLowerCase();
        for (int i = 0; i < str3.length() / 2; i++) {
            if (str3.charAt(i) == str3.charAt(str1.length() - 1)) {
                flag = true;
            }
        }

        System.out.println(flag);
    }
}
