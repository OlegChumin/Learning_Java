package Alishev.BaseJava;

import java.util.ArrayList;
import java.util.List;

public class Lesson33Generics {
    public static void main(String[] args) {
        //// Till Java 5
        WildAnimal wildAnimal = new WildAnimal();

        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(wildAnimal);

        String animal = (String) animals.get(1); //ArrayList хранит объекты класса Object
        System.out.println(animal);

        //// From Java 5
        List<String> animals2 = new ArrayList<String>();
        animals2.add("dog");
        animals2.add("frog");
        animals2.add("cat");

        String animal2 = animals2.get(2); //ArrayList

        //From Java 7
        List<String> animals3 = new ArrayList<>();

    }
}

class WildAnimal {

}
