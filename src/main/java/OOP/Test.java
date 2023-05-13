package OOP;

import Java_Nail_Alishev.old.BaseJava.interfaces.Animal;
import org.apache.logging.log4j.core.util.DummyNanoClock;

import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String animalName = getStringFromConsole();
        setAnimal(animalName);
        System.out.printf("%s - animal name", animalName);
    }

    public static void setAnimal(String animalName) {
        AnimalNew animal = new AnimalNew();
        switch (animalName) {
            case "Dog": {
                Dog dog = new Dog();
                dog.sleep();
                dog.canBark();
            }
            break;
            case "Cat": {
                Cat cat = new Cat();
                cat.sleep();
            }
            break;
            case "Duck": {
                AnimalNew duck = new Duck();
                break;
            }
            default:
                System.out.println("No such animal");
        }
    }

    static String getStringFromConsole() {
        return scanner.next();
    }
}
