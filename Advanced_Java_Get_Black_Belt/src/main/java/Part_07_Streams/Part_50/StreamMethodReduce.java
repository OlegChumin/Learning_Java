package Part_07_Streams.Part_50;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamMethodReduce {
    //reduce
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(8);
        integerList.add(2);
        integerList.add(4);
        integerList.add(3);

        System.out.println(integerList);
        int resultOfAllElementsMultiplication = integerList.stream().reduce((accumulator, element) -> accumulator * element).get(); //return Optional
        System.out.println(resultOfAllElementsMultiplication);

        //Optional wrap Integer, can have null

        List<Integer> list100 = new ArrayList<>();


        Optional<Integer> optional = list100.stream().reduce((accumulator, element) -> accumulator * element);
        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("Not present");
        }

        int resultOfAllElementsMultiplicationWithInitialValueOFAccumulator = integerList.stream().reduce(1, (accumulator, element) -> accumulator * element); //return Optional
        System.out.println(resultOfAllElementsMultiplicationWithInitialValueOFAccumulator);


        List<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Hallo");
        stringArrayList.add(" Leo!");
        stringArrayList.add(" Be ");
        stringArrayList.add("ready for ");
        stringArrayList.add(" Java ");
        stringArrayList.add(" interview!");

        String resultStringConcatenation = stringArrayList.stream().reduce((accu, el) -> accu + el).get();
        System.out.println(resultStringConcatenation);

        int result100 = list100.stream().reduce((accumulator, element) -> accumulator * element).get();
    }
}
