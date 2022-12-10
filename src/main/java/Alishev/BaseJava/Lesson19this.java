package Alishev.BaseJava;

public class Lesson19this {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(45);
        human1.setName("Oleg Chumin");
        human1.getInfo();

    }
}

class Human {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;  // обращение this идет к объекту это в контектсе getter setter
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getInfo() {
        System.out.println(name+" , " + age);
    }
}
