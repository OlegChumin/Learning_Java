package OOP;

public class Cats {
    public static void main(String[] args) {
        Mancoon mancoon = (Mancoon) new Animals();
        mancoon.canGo();
        mancoon.canMeow();
    }
}

class Animals {
    void printName(){
    }

    void canGo() {
    }
}

class Cat extends  Animals {
    void canMeow() {

    }

}

class Mancoon extends Cat{

}