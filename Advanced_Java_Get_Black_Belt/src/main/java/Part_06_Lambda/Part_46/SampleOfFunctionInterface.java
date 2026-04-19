package Part_06_Lambda.Part_46;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class SampleOfFunctionInterface {
    public static void main(String[] args) {
        MAI_Students student1 = new MAI_Students("Ivan", 'm', 22, 3, 8.3);
        MAI_Students student2 = new MAI_Students("Nikolay", 'm', 28, 2, 6.4);
        MAI_Students student3 = new MAI_Students("Elena", 'f', 19, 1, 8.9);
        MAI_Students student4 = new MAI_Students("Petr", 'm', 35, 4, 7);
        MAI_Students student5 = new MAI_Students("Maria", 'f', 23, 3, 9.1);
        MAI_Students student6 = new MAI_Students("Oleg", 'm', 47, 3, 10.0);

        ArrayList<MAI_Students> mai_students = new ArrayList<>();
        mai_students.add(student1);
        mai_students.add(student2);
        mai_students.add(student3);
        mai_students.add(student4);
        mai_students.add(student5);
        mai_students.add(student6);

//        Function<MAI_Students, Double> function = maiStudent -> 4.14; //sample
        double averageGrade = avrOfSmth(mai_students, student -> student.averageGrade);
        System.out.println(averageGrade);

        double averageAge = avrOfSmth(mai_students, student -> (double) student.age);
        System.out.println(averageAge);
    }

    private static double avrOfSmth(List<MAI_Students> list, Function<MAI_Students, Double> function) {
        double result = 0;
        for (MAI_Students element: list) {
            result += function.apply(element);
        }
        return result / list.size();
    }
}
