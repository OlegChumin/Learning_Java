package Java_Nail_Alishev.old.BaseJava;

public class Lesson25extends {
    public static void main(String[] args) {
        NewAnimal newAnimal = new NewAnimal("Animal");
        newAnimal.eat();
        newAnimal.sleep();
        NewDog dog = new NewDog("MAX");
        dog.canBark();
        dog.eat();
        dog.sleep();
        dog.showName();
        System.out.println();
        NewCat cat = new NewCat("PYTHON");
        cat.canMay();
        cat.eat();
        cat.sleep();
        cat.showName();
    }
}

class NewAnimal {
    String name;

    public NewAnimal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("I am eating..");
    }

    public void sleep() {
        System.out.println("I am sleeping..");
    }

    public void showName() {
        System.out.println(name);
    }
}

class NewDog extends NewAnimal {

    public NewDog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating..");
    }

    public void canBark() {
        System.out.println("Gav gav..");
    }
}

class NewCat extends NewAnimal {
    public NewCat(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeping..");
    }

    public void canMay() {
        System.out.println("May may ..");
    }

}

