package lesson_03.patterns.decorator;

import org.w3c.dom.ls.LSOutput;

public class DecoratorSample {
    public static void main(String[] args) {
        Pizza cheesePizza = new CheesePizza(new DoughPizza());
        System.out.println(cheesePizza.makePizza());
        Pizza pepperoniChessePizza = new PepperoniCheesePizza(new DoughPizza());
        System.out.println(pepperoniChessePizza.makePizza());
        Pizza pepperoniChessePizza2 = new PepperoniPizza(new CheesePizza(new DoughPizza()));
        System.out.println(pepperoniChessePizza2.makePizza());
    }
}

interface Pizza {
    String makePizza();
}

class DoughPizza implements Pizza {

    @Override
    public String makePizza() {
        return "Pizza with ";
    }
}

class CheesePizza implements Pizza {
    Pizza pizza;

    public CheesePizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + "cheese";
    }
}

class PepperoniPizza implements Pizza {
    Pizza pizza;

    public PepperoniPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + "pepperoni";
    }
}

class PepperoniCheesePizza implements Pizza {
    Pizza pizza;

    public PepperoniCheesePizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + "pepperoni" + "cheese";
    }
}

//class PepperoniPizza implements Pizza {
//
//    @Override
//    public void makePizza() {
//        System.out.println("Pizza with Pepperoni");
//    }
//}
//
//
//class CheesePizza implements Pizza {
//
//    @Override
//    public void makePizza() {
//        System.out.println("Pizza with Cheese");
//    }
//}
//
//class CheesePepperoniPizza implements Pizza {
//
//    @Override
//    public void makePizza() {
//        System.out.println("Pizza with Cheese and Pepperoni");
//    }
//}
//
//class TomatoWithCheesPizza implements Pizza{
//
//    @Override
//    public void makePizza() {
//        System.out.println("Pizza with Cheese and Tomato");
//    }
//}
//
//class MakePizza implements Pizza {
//    boolean pepperoni;
//    boolean cheese;
//    boolean tomato;
//    boolean cheesePepperoni;
//
//
//    @Override
//    public void makePizza() {
//        System.out.println(
//                "Pizza with"
//                + (pepperoni ? "peperoni" : "")
//                + (cheese ? "cheese" : "")
//                + (tomato ? "tomato" : "")
//                + (cheesePepperoni ? "Cheese and Pepperoni" : "")
//        );
//    }
//}
