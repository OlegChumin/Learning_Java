package Java_405_lessons.Patterns.Pattern_16_Prototype.Step_04;

/** Deep cloning*/
public class PrototypePatternLesson {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("Leo", 25, new Address("street", 23));
        Person person2 = person.clone();
        System.out.println("person2 != person : " + (person2 != person));
        System.out.println("person2.name == person.name : " + (person2.name == person.name));
        System.out.println("person2.age == person2.age : " + (person2.age == person2.age));
        System.out.println("--------------------------------------------------------------");
        System.out.println("person2.address.street == person2.address.street : " +
                (person2.address.street == person2.address.street));
        System.out.println("person2.address.houseNumber == person2.address.houseNumber : " +
                (person2.address.houseNumber == person2.address.houseNumber));
        System.out.println("--------------------------------------------------------------");

        person.name = "Ilia";
        System.out.println("person.name = " + person.name);
        System.out.println("person2.name = " + person2.name);
        System.out.println("--------------------------------------------------------------");

        person.address.street = "SomeNewStreet";
        System.out.println("person.address.street = " + person.address.street); //non deep cloning
        System.out.println("person2.address.street = " + person2.address.street); //surface cloning
        System.out.println("--------------------------------------------------------------");
    }
}

class Address implements Cloneable{
    String street;
    int houseNumber;

    public Address(String street, int houseNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    @Override
    protected Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }
}

class Person implements Cloneable {
    String name;
    int age;
    Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        person.address = this.address.clone();
        return person;
    }
}
