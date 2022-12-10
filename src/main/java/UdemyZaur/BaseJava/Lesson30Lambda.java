package UdemyZaur.BaseJava;//package ru.learning.UdemyZaur.BaseJava;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Lesson30Lambda {
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
//
//        studentInfo.printStudentsOverGrade(list, 4.);
//        System.out.println("--------------------------------------------------------------");
//        studentInfo.printStudentAgeMF(list, 4.2, 35, 'M');
//        System.out.println("--------------------------------------------------------------");
//        studentInfo.printStudentMF(list, 'F');
//        System.out.println("--------------------------------------------------------------");
//        studentInfo.printStudentMF(list, 'M');
//        studentInfo.printStudentsUnderGrade(list, 4);
//        System.out.println("--------------------------------------------------------------");
//        studentInfo.printStudentsOverAge(list, 40);
//        System.out.println("--------------------------------------------------------------");
//        studentInfo.printStudentAgeMF(list, 4.0, 30, 'F');
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
//    void printStudentsOverGrade(List<Student> allStudents, double averageGrade) { // ArrayList содержащий всех студентов
//        for (Student element : allStudents) {
//            if (element.averageGrade >= averageGrade)
//                printStudent(element);
//        }
//    }
//
//    void printStudentsUnderGrade(List<Student> allStudents, double averageGrade) { // ArrayList содержащий всех студентов
//        for (Student element : allStudents) {
//            if (element.averageGrade < averageGrade)
//                printStudent(element);
//        }
//    }
//
//    void printStudentsOverAge(List<Student> allStudents, int age) { // ArrayList содержащий всех студентов
//        for (Student element : allStudents) {
//            if (element.age >= age)
//                printStudent(element);
//        }
//    }
//
//    void printStudentUnderAge(List<Student> allStudents, int age) { // ArrayList содержащий всех студентов
//        for (Student element : allStudents) {
//            if (element.age < age)
//                printStudent(element);
//        }
//    }
//
//    void printStudentMF(List<Student> allStudents, char malefemale) { // ArrayList содержащий всех студентов
//        for (Student element : allStudents) {
//            if (element.malefemale == malefemale)
//                printStudent(element);
//        }
//    }
//
//    void printStudentAgeMF(List<Student> allStudents, double averageGrade, int age, char malefemale) {
//        for (Student element : allStudents) {
//            if (element.averageGrade > averageGrade && element.age < age && element.malefemale == malefemale)
//                printStudent(element);
//        }
//    }
//
//}
