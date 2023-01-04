package Java_405_lessons.Patterns.Pattern_01_Factory;
/**
 * Избавляет класс от привязки к конкретным классам продуктов. Выделяет код производства продуктов в одно место, упрощая
 * поддержку кода. Упрощает добавление новых продуктов в программу. Реализует принцип открытости/закрытости.*/

public class FactoryLesson {
    public static void main(String[] args) {
        Factory factory =  new Factory();
        Car toyota =  factory.create("Toyota");
        toyota.drive();
        Car audi = factory.create("Audi");
        audi.drive();

        FactoryUseEnum factoryUseEnum = new FactoryUseEnum();
        Car toyotaNew = factoryUseEnum.create(CarBrands.TOYOTA);
        toyotaNew.drive();
        Car audiNew = factoryUseEnum.create(CarBrands.AUDI);
        audiNew.drive();
    }
}

interface Car{
    void drive();
}

class Toyota implements Car{
    @Override
    public void drive() {
        System.out.println("Drive Toyota");
    }
}

class Audi implements Car{
    @Override
    public void drive() {
        System.out.println("Drive Audi");
    }
}
class Factory{
    public Car create(String typeOfCar) {
        switch(typeOfCar) {
            case("Toyota"): return new Toyota();
            case("Audi"): return new Audi();
            default: return null;
        }
    }
}

/**
 * Мы могли бы использовать вместо ENUM строку String с названием, но тогда ошибок гораздо сложнее избежать.
 * Если исключить опечатки, то пришлось бы запоминать, в каком формате вводить строку - "Toyota", "TOYOTA"?
 * В общем, все эти проблемы нам не нужны, поэтому мы создали ENUM.*/
class FactoryUseEnum{
    public Car create(CarBrands carbrands) {
        switch(carbrands) {
            case TOYOTA: return new Toyota();
            case AUDI: return new Audi();
            default: return null;
        }
    }
}

enum CarBrands {
    MERCEDES, AUDI, TOYOTA, FORD
}
