package EKIDS.Lessons.Lesson7;

import java.util.Arrays;

public class Animals {


    void go() {
        System.out.println("Can walk");
    }

    void sleep() {

    }
}

class Dog extends Animals {
    void gavGav() {
        System.out.println("Gav Gav");
    }
    void run() {
        System.out.println("Can run");
    }


}

class Duck extends Animals {
   void swim() {
       System.out.println("Can swim");
   }

   void fly() {
       System.out.println("Can fly");
   }

}
