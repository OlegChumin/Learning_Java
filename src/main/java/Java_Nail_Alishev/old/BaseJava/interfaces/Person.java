package Java_Nail_Alishev.old.BaseJava.interfaces;

public class Person implements Info{
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHallo() {
        System.out.println("Hallo");
    }

    @Override
    public void showInfo() {
        System.out.println(name);
    }
}
