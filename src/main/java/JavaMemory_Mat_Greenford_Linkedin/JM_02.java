package JavaMemory_Mat_Greenford_Linkedin;

import java.util.ArrayList;
import java.util.List;

public class JM_02 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("One");
        myList.add("Two");
        myList.add("Three");
        printList(myList);
    }

    public static void printList(List<String> data) {
        data.forEach(System.out::println);
    }
}
