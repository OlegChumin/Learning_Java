package OOP;

class Dog extends AnimalNew{

    @Override
    void sleep() {
        System.out.println("Dog can sleep");
    }

    public void canBark(){
        System.out.println("Dog can bark");
    }
}