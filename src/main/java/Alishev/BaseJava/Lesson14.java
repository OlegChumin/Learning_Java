package Alishev.BaseJava;

//в одном файле может быть бесконечное количество классов но public может быть только один!
//класс это шаблон по которому будет создаваться объект

public class Lesson14 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.firstName = "Олег"; //так не принято обращаться к полям класса, надо через private + get and set
        person1.surName = "Чумин";
        person1.age = 45;
        person1.profession = "программист JAVA";
        System.out.println("Меня зовут " + person1.firstName + " " + person1.surName + "," + " мне " + person1.age + "лет" +
                " я по профессии: " + person1.profession);

        Person person2 = new Person();
        person2.firstName = "Otto";
        person2.surName = "Haendler";
        person2.age = 45;
        person2.profession = "JAVA developer";
        System.out.println("Меня зовут " + person2.firstName + " " + person2.surName + "," + " мне " + person2.age + "лет" +
                " я по профессии: " + person2.profession);

    }

}

class Person {
    // у класса могут быть данные (поля), действия (методы)
    String firstName, surName;
    int age;
    String profession;

}

class Test1 {
}

class Test2 {
}

class Test3 {
}

class Test4 {
}

class Test5 {
}
