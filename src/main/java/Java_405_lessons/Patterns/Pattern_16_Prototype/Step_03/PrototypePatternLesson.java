package Java_405_lessons.Patterns.Pattern_16_Prototype.Step_03;

/** Deep and non-deep cloning*/
public class PrototypePatternLesson {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("Leo", 25);
        Person person2 = person.clone();
        System.out.println("person2 != person : " + (person2 != person));
        System.out.println("person2.name == person.name : " + (person2.name == person.name));
        System.out.println("person2.age == person2.age : " + (person2.age == person2.age));
        System.out.println("---------------------------------------------");
    }
}

class Person implements Cloneable {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }


    //    public Person copy(Person person) {
//        return new Person(person.name, person.age); //copy all fields
//    }
}
