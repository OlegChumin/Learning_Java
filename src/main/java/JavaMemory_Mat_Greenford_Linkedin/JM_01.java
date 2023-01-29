package JavaMemory_Mat_Greenford_Linkedin;

public class JM_01 {
    public static void main(String[] args) {
        int value = 7;
        value = calculate(value);
    }

    public static int calculate(int data) {
        int tempValue = data + 3;
        int newValue = tempValue * 2;
        return newValue;
    }
}
