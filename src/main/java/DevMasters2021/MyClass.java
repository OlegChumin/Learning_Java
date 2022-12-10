package DevMasters2021;

public class MyClass {
    private String str;
    MyClass(String s) {
        str = s;
    }

    private MyClass() {
        str = null;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
    }
}
