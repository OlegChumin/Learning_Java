package Part_06_Lambda.Part_41;

public class LambdaSample {
    //method with interface reference as parameter
    static void newSomeMethod(SomeInterface someInterfaceEntity) {
        System.out.println(someInterfaceEntity.someMethod("Hi")); // calling method from interface as a class
    }

    public static void main(String[] args) {
        newSomeMethod((String str) -> {return str.length();}); // lambda for the same as above method
    }

    SomeInterface someInterface =  new SomeInterface() { // anonymous class for the same as above
        @Override
        public int someMethod(String str) {
            return str.length();
        }
    };

    SomeInterface someInterface2 = str -> str.length(); // anonymous class replaced by lambda

    SomeInterface someInterface3 = String::length; // lambda replaced by reference on the method

}

interface SomeInterface {
    int someMethod(String str);
}
