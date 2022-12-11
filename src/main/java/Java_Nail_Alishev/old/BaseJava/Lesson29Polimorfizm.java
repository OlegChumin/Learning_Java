package Java_Nail_Alishev.old.BaseJava;

public class Lesson29Polimorfizm {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        DogNew dogNew = new DogNew();
//        CanNew catNew = new CanNew();
////        animal.eat();
////        dogNew.eat();
//        Animal newAnimal = new DogNew();  // UpCasting одна из сторон полиморфизма обращение
//        // к объекту наследнику через переменную родительского класса
//        newAnimal.eat(); // доступ к методу Animal есть но вызывается метод переопределенный в DogNew
////        это называется корень связывания
////        newAnimal.bark   доступа к методам DogNew нет
//
//        test(animal);
//        test(dogNew);
//        test(catNew);
//
//        Animal animal2 = dogNew; //UpCasting
//
//        //DownCasting
//        DogNew dogNew2 = (DogNew) animal;
//        dogNew2.bark();

        Animal animal3 = new Animal();
        DogNew dogNew3 = (DogNew) animal3;
        dogNew3.bark();


    }

    public static void test(Animal animal) {
        animal.eat();
    }
}

class Animal {
    public void eat() {
        System.out.println("I am eating");
    }
}

class DogNew extends Animal {
    public void bark() {
        System.out.println("Dog is barking..");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating..");
    }
}

class CanNew extends Animal{

}