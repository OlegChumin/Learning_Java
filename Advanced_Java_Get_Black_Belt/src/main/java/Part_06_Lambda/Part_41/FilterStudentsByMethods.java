package Part_06_Lambda.Part_41;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterStudentsByMethods {
    void printStudentOverGrade(ArrayList<Student> al, double grade) {
        System.out.println("Students, filtered by average Grade > " + grade);
        for (Student element : al) {
            if (element.averageGrade > grade) {
                System.out.println(element);
            }
        }
        printEndLine();
    }

    void printStudentUnderAge(ArrayList<Student> al, int age) {
        System.out.println("Students, filtered by age < " + age);
        for (Student element : al) {
            if (element.age < age) {
                System.out.println(element);
            }
        }
        printEndLine();
    }

    void printStudentMixConditions(ArrayList<Student> al, int age, double grade, char sex) {
        System.out.println("Students, filtered by age > " + age + "AND by everage Grade < "
                + grade + " AND by maleFemale ==" + sex);
        for (Student element : al) {
            if (element.age > age && element.averageGrade < grade && element.maleFemale == sex) {
                System.out.println(element);
            }
        }
        printEndLine();
    }

    void printAnyListCollectionByElement(List<Student> list) {
        for (Student element : list) {
            System.out.println(element);
        }
        printEndLine();
    }

    void testStudents(ArrayList<Student> al, StudentChecks sc) {
        System.out.println("Students, filtered using check() from interface StudentCheck");
        for (Student element: al) {
            if(sc.check(element)) {
                System.out.println(element);
            }
        }
        printEndLine();
    }

    void testStudentsUsingPredicate(ArrayList<Student> al, Predicate<Student> predicate) {
        System.out.println("Students, filtered using test() from Predicate <T> T");
        for (Student element: al) {
            if(predicate.test(element)) {
                System.out.println(element);
            }
        }
        printEndLine();
    }

    void printEndLine() {
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println();
    }
}
