package DevMasters2021;

public class Parent {
    public void call() {
        System.out.println("Parent");
    }

    public void printStr() {
    }
}

class Child extends Parent {
    public  void call() {
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Parent obj = new Child();
        obj.call();
    }
}
