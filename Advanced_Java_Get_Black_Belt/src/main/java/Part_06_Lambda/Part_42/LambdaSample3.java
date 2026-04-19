package Part_06_Lambda.Part_42;

public class LambdaSample3 {
    public static void main(String[] args) {
        lambdaMethod(h -> h.length());
        lambdaMethod((h) -> h.length());
        lambdaMethod((String str) -> str.length());
//        System.out.println(str);
        lambdaMethod(str->str.length());
        /**
         * lambdaMethod((String str1, String str2)-> {return str1.length()+ str2.length});
         * Error: def(x -> {x.length();} )  missed return
         * Error: def(x -> {return x.length() }); missed ";"
         * Erorr: def( x, y -> x.length + y.length);
         * */
        lambdaMethod(String::length);
        gLambdaMethod((int x, int y) -> {return x + y;});

        int i = 10; // effectively final
//        i = 15;
        lambdaMethod((String s) -> s.length() + i);
//        i = 15;
    }

    static void lambdaMethod(SomeInterface_H h) {
        System.out.println(h.methodH("Hi"));
    }

    static void gLambdaMethod(SomeNew_G g) {
        System.out.println(g.method(10, 18));
    }
}

@FunctionalInterface
interface SomeInterface_H {
    int methodH(String str);
}

interface  SomeNew_G {
    int method(int x, int y);
}

