package from_https_t_me_Aldrson;

public class Main implements MyInterface{
    public static void main(String[] args) {
        testByte();
//        MyInterface m = "8" -> Integer.parseInt(s);
    }

    public static void testByte() {
        byte a = 127;
        a++;
        System.out.println(a);
    }

    @Override
    public int myMethod(String s) {
        return Integer.parseInt(s);
    }
}

interface MyInterface {
    int myMethod(String s);
}

