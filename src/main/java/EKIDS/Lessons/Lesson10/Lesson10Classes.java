package EKIDS.Lessons.Lesson10;

public class Lesson10Classes {
    public static void main(String[] args) {
        Cat cat0 = new Cat("Барсик", 8);
        Cat cat = new Cat(3, "Мурзик");
//        Cat catNemo = new Cat();
//        cat.age = 3;
//        cat.name = "Барсик";
        System.out.println(cat0);
        System.out.println(cat);


//        Cat cat2 = new Cat();
//        cat2.age = -1000;
//        cat2.name = " ";
    }
}

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
