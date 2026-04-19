package Part_07_Streams.Part_51;

import Part_06_Lambda.Part_41.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentInfo {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student student2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student student3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student student4 = new Student("Petr", 'm', 35, 4, 7);
        Student student5 = new Student("Maria", 'f', 23, 3, 9.1);
        Student student6 = new Student("Oleg", 'm', 47, 3, 10.0);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);


        System.out.println(students);
        students = (ArrayList<Student>) students.stream().sorted((x, y) -> x.name.compareTo(y.name)).collect(Collectors.toList());
//        students = (ArrayList<Student>) students.stream().sorted((x, y) -> x.name.compareTo(y.name)).collect(Collectors.toList());
        System.out.println(students);
    }
}
