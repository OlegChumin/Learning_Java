package Java_405_lessons.Patterns.Pattern_16_Prototype.Step_06;

/**
 * Deep cloning
 */
public class PrototypePatternLesson {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("Leo", 25, new Address("street", 23));
//        Person person2 = person.clone();
        Person person2 = new Person(person);
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

class Address implements Cloneable {
    String street;
    int houseNumber;

    public Address(String street, int houseNumber) {
        System.out.println("Some code in Address constructor "); //will not be called on cloning! -> constructor for cloning
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public Address(Address address) { //<--
        this.street = address.street;
        this.houseNumber = address.houseNumber;
    }

    @Override
    protected Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }
}

class Person implements Cloneable {
    String name;
    int age;
    final Address address; //final -> constructor for cloning

    public Person(String name, int age, Address address) {
        System.out.println("Contructor with name, age, address");
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(Person person) { //<--
        System.out.println("Constructor with person");
        this.name = person.name;
        this.age = person.age;
        this.address = new Address(person.address); //<--
    }

//    @Override
//    protected Person clone() throws CloneNotSupportedException {
//        Person person = (Person) super.clone();
//        person.address = this.address.clone();
//        return person;
//    }
}
