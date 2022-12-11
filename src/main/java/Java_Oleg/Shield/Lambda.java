package Java_Oleg.Shield;

public class Lambda {
    MyValue myValue = () -> 98.6;

    public static void main(String[] args) {
        MyValue newValue;
        newValue = () -> 100.;
    }

//    double Calc() {
//        return 98.6;
//    }

//    () -> 98.6;
}

interface MyValue {
    double getValue();
}
