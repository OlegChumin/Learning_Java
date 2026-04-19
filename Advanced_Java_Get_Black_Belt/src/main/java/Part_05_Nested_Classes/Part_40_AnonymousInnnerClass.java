package Part_05_Nested_Classes;

public class Part_40_AnonymousInnnerClass {
    public static void main(String[] args) {
        class Summ implements MathOperations{
            @Override
            public int doSomeOperation(int a, int b) {
                return  a + b;
            }
        }
        Summ summ = new Summ();
        System.out.println(summ.doSomeOperation(5, 3));

        class Substr implements  MathOperations {

            @Override
            public int doSomeOperation(int a, int b) {
                return  a - b;
            }
        }
        Substr substr = new Substr();
        System.out.println(substr.doSomeOperation(5, 3));
    }

    //anonymous class for creating object
    MathOperations mathDividing = new MathOperations() { // no constructor, no anonymous interfaces
        @Override
        public int doSomeOperation(int a, int b) {
            return a / b;
        }
    };
}

@FunctionalInterface
interface MathOperations{
    int doSomeOperation(int a, int b);
}


