package Part_06_Lambda.Part_42;

public class Part_42_02_SampleOfFinalAndEffectivelyFinal {

    static void printStringFromMethodDoSomething(SampleInterface sampleInterface) {
        System.out.println(sampleInterface.methodDoSomething("Hallo Java"));
    }


    public static void main(String[] args) {
        int a = 10; // effectively final
        final int b = 15;
//        a = 20;
        printStringFromMethodDoSomething(new SampleInterface() {
            @Override
            public int methodDoSomething(String str) {
                return str.length();
            }
        });

        printStringFromMethodDoSomething((String str) -> {
            System.out.println(a);
            return str.length();
        });

        printStringFromMethodDoSomething(String::length);

    }
}

interface SampleInterface {
    int methodDoSomething(String str);
}
