package UdemyZaur.BaseJava;//package ru.learning.UdemyZaur.BaseJava;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Lesson30II {
//    public static void main(String[] args) {
//        List<Student> list = new ArrayList<>();
//        Student student1 = new Student("Oleg", 'M', 45, 1, 5);
//        Student student2 = new Student("Nikolay", 'M', 40, 2, 4.2);
//        Student student3 = new Student("Irina", 'F', 35, 1, 5);
//        Student student4 = new Student("Ivan", 'M', 40, 3, 3.7);
//        Student student5 = new Student("Maria", 'F', 35, 5, 4.5);
//
//        list.add(student1);
//        list.add(student2);
//        list.add(student3);
//        list.add(student4);
//        list.add(student5);
//
//        StudentInfo studentInfo = new StudentInfo();
//        FindStudentOverGrade findStudentOverGrade = new FindStudentOverGrade();
//        studentInfo.testStudent(list, findStudentOverGrade);
//
//
//    }
//}
//
//class Student {
//    String name;
//    char malefemale;
//    int age;
//    int course;
//    double averageGrade;
//
//    public Student(String name, char malefemale, int age, int course, double averageGrade) {
//        this.name = name;       // присвоение имени полученного с параметров текущему объекту this
//        this.malefemale = malefemale;
//        this.age = age;
//        this.course = course;
//        this.averageGrade = averageGrade;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", malefemale=" + malefemale +
//                ", age=" + age +
//                ", course=" + course +
//                ", averageGrade=" + averageGrade +
//                '}';
//    }
//}
//
//class StudentInfo {
//    static void printStudent(Student student) {
//        System.out.println(student.toString());
//    }
//
//    void testStudent(List<Student> students, StudentChecks sc) {
//        for(Student element : students) {
//            if (sc.testStudent(element)) printStudent(element);
//        }
//    }
//}
//
//interface StudentChecks{
//    boolean testStudent(Student student);
//}
//
//class FindStudentOverGrade implements StudentChecks {
//
//    @Override
//    public boolean testStudent(Student student) {
//        return student.averageGrade > 4.2;
//    }
//}