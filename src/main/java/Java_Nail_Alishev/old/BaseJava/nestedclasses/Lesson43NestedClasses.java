package Java_Nail_Alishev.old.BaseJava.nestedclasses;

public class Lesson43NestedClasses {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar(1);
        electrocar.start();

        Electrocar.Battery battery = new Electrocar.Battery();
    }
}


