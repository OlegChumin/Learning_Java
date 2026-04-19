package Part_06_Lambda.Part_41;

public class Student {
    String name;
    char maleFemale;
    int age;
    int course;
    double averageGrade;

    public Student(String name, char maleFemale, int age, int course, double averageGrade) {
        this.name = name;
        this.maleFemale = maleFemale;
        this.age = age;
        this.course = course;
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", maleFemale=" + maleFemale +
                ", age=" + age +
                ", course=" + course +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
