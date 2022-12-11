package Java_Nail_Alishev.old.BaseJava;

public class Lesson21static {
    public static void main(String[] args) {
        Human1.description = "Nice";
        Human1.id = 101019;
        Human1.getDescription();
        Human1 human1 = new Human1("Bob");
        human1.printNumOfPeople();
        Human1 human12 = new Human1("Oleg", 45);
        System.out.println(human1.getName());
        human1.setName("Sam");
        human12.printNumOfPeople();
        System.out.println(human1.getName());
        System.out.println(human1.id + " " + human1.description);
        System.out.println(human12.id + " " + human12.description);

        Human1.description = "Bad";
        System.out.println(Human1.description);
        human12.description = "Not so bad"; // так не стоит делать
        System.out.println(Human1.description);
        System.out.println(human12.description); // так не стоит делать

        Human1.description = "GOOD";
        human1.getAllFields();
        human12.getAllFields();

    }
}

class Human1 {
    private String name;
    private int age;
    public static String description;
    public static int id;
    private static int count;


    public Human1(String name) {
        System.out.println("Сообщение из 1 конструктора");
        this.name = name;
        count++;
    }

    public Human1(String name, int age) {
        System.out.println("Сообщение из 2 конструктора");
        this.name = name;
        this.age = age;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void getDescription() {
        System.out.println(description);
    }

    public void getAllFields() {
        System.out.println(name+" , " + age + " , " + description);
    }

    public static void printAllFields() {
        System.out.println(description);
//        System.out.println(name); // к нестатической переменной из статического метода нельзя обратиться
    }

    public void printNumOfPeople() {
        System.out.println("Number of people: " + count);
    }
}
