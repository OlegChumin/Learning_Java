package Alishev.BaseJava;

public class Lesson20ConstructorCallConstructor {
    public static void main(String[] args) {

    }
}

class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {    // конструктор
        petalCount = petals;  // petals - лепестки
        System.out.println("Конструктор с парметром int, petalCount = " + petalCount);
    }

    Flower(String ss) {
        s = ss;
        System.out.println("Конструктор с параметром String, s =  " + ss);
    }

    Flower(String s, int petals) {
        this(petals); //вызов другого конструктора должен идти первым
        this.s = s;
    }
}
