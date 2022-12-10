package UdemyZaur.GetBlackBelt.Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod2 {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student student2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student student3 = new Student("Elena", 'm', 22, 1, 8.9);
        Student student4 = new Student("Petr", 'm', 22, 4, 7);
        Student student5 = new Student("Maria", 'm', 22, 3, 7.4);

        List<Student> studentsList = new ArrayList<Student>();
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);
        studentsList.add(student5);

        System.out.println(studentsList);
        Student student6 = new Student("Petr", 'm', 22, 4, 7);
        studentsList.remove(student6); // не будет удалено поскольку не добавляли student6 и equals == не переопределен
        System.out.println(studentsList); //Petr удален ибо после переопределения теперь сравнение по полям сработало
    }
}
