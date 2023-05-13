package String;

public class SubstringSample {
    public static void main(String[] args) {
        String one = "abcd";
        String two = "abc";
        String three = one.substring(0,one.length());
        String four = one.substring(0,one.length()-1);
        System.out.print((one == three) +"-"+ (two == four));
    }
}
