package lesson_02;

import java.util.ArrayList;
import java.util.List;

public class SampleOfMetgodAndInterface {
    public static void main(String[] args) {

        List<? super Number> list = new ArrayList<Object>();
    }
}

interface I1 {

}

interface I2 {

}

class X {
}


class Method {
    public static <T extends Number&I1&I2> T getSomeElement(List<T> list) {
        return list.get(3);
    }
}