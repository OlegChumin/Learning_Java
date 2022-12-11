package Java_Nail_Alishev.old.BaseJava.lesson34wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Pet> petList = new ArrayList<>();
        petList.add(new Pet(1));
        petList.add(new Pet(2));

        List<Cats> catsList = new ArrayList<>();
        catsList.add(new Cats());
        catsList.add(new Cats());

        test(petList);
        test(catsList);
    }

    private static void test(List<? extends Pet> list){
        for(Pet element : list) {
            System.out.println(element);
        }
    }

}