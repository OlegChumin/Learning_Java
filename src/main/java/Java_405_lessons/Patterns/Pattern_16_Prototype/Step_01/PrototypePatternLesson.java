package Java_405_lessons.Patterns.Pattern_16_Prototype.Step_01;

public class PrototypePatternLesson {
    public static void main(String[] args) {
        // taking some element from database and if the element required more times
        //so copy of available object is the core of prototyping
        Person person = new Person("Leo", 25);
//        Object object = new Object(); -> Clonable
//        @HotSpotIntrinsicCandidate
//        protected native Object clone() throws CloneNotSupportedException;
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person copy(Person person) {
        return new Person(person.name, person.age); //copy all fields
    }
}
