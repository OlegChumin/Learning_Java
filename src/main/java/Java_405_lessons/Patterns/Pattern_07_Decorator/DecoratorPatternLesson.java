package Java_405_lessons.Patterns.Pattern_07_Decorator;

public class DecoratorPatternLesson {
    public static void main(String[] args) {
        Pizza cheesePizza = new CheesePizza(new DoughPizza());
        System.out.println(cheesePizza.makePizza());
        Pizza cheesePepperoni = new PepperoniPizza(cheesePizza);
        System.out.println(cheesePepperoni.makePizza());
        Pizza meatPepperoniCheesePizza = new MeatPizza(cheesePepperoni);
        System.out.println(meatPepperoniCheesePizza.makePizza());
    }
}

interface Pizza{
//    void makePizza();
    String makePizza();
}

class DoughPizza implements Pizza{

    @Override
    public String makePizza() {
        return "with ";
    }
}

class CheesePizza implements Pizza{
    Pizza pizza;

    public CheesePizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + "cheese ";
    }
}

class PepperoniPizza implements Pizza{
    Pizza pizza;

    public PepperoniPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + "pepperoni ";
    }
}

class MeatPizza implements Pizza{
    Pizza pizza;

    public MeatPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + "meat ";
    }
}

//class pepperoniPizza implements Pizza{
//    @Override
//    public void makePizza() {
//        System.out.println("with pepperoni");
//    }
//}
//
//class CheesePizza implements  Pizza{
//
//    @Override
//    public void makePizza() {
//        System.out.println("with cheese");
//    }
//}
//
//class CheesePepperoniPizza implements Pizza{
//
//    @Override
//    public void makePizza() {
//        System.out.println("with cheese pepperoni");
//    }
//}
//
//class MakePizza implements Pizza{
//    boolean pepperoni;
//    boolean cheese;
//    boolean cheeseAndPepperoni;
//    @Override
//    public void makePizza() {
//        System.out.println("with " + (pepperoni ? "pepperoni" : "") + (cheese ? "cheese" : "") + (cheeseAndPepperoni ? "cheese pepperoni" : ""));
//    }
//}


