package Java_Nail_Alishev.old.BaseJava;

public class Lesson17ParamMethods {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        car1.type = "Mercedes";
        car2.type = "Ford";
        car3.setType("Audi");

    }
}

class Car {
    String type;
    int data;

    public void setType(String type) {
        this.type = type;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
