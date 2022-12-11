package Java_Nail_Alishev.old.BaseJava;

public class Lesson20contructor {
    NewHuman newHuman = new NewHuman();

    // для создания объекта из класса с определенными параметрами применяется конструктор
}

class NewHuman {

    public NewHuman() {
    } // конструктор, это метод, не имеющий возвращаемого типа даже void, название как у класса
    // данный конструктор по умолчанию

    public NewHuman(String name, int age) { // конструктор с параметрами
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

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
}
