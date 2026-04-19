package Part_06_Lambda.Part_43;

import java.util.ArrayList;
import java.util.function.Predicate;

public class SampleOfRemoveIf {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Hallo");
        stringArrayList.add(" Leo");
        stringArrayList.add(" Be ");
        stringArrayList.add("ready to ");
        stringArrayList.add(" Java ");
        stringArrayList.add(" interview!");
        stringArrayList.add(" interview!");

        System.out.println(stringArrayList);
        System.out.println();
//        stringArrayList.removeIf(element -> element.length() < 5);
        Predicate<String> predicate = element -> element.length() < 5;
        System.out.println(stringArrayList);

    }
}
