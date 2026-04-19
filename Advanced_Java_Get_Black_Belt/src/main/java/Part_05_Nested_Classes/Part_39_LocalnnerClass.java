package Part_05_Nested_Classes;

public class Part_39_LocalnnerClass {
    public static void main(String[] args) {
        NewMath newMath = new NewMath();
        newMath.getResult();
    }
}

class NewMath {
    private int a = 10;
    public void getResult() {
        class Division { // cannot be static, now access outside method code block
            private int numerator;
            private int denominator;

            public int getNumerator() {
                return numerator;
            }

            public void setNumerator(int numerator) {
                this.numerator = numerator;
            }

            public int getDenominator() {
                return denominator;
            }

            public void setDenominator(int denominator) {
                this.denominator = denominator;
            }

            public int dividing() {
                return numerator / denominator;
            }

            public int restOfDividing() {
                System.out.println(a);
                return numerator % denominator;
            }
        }

        Division division = new Division();
        division.setNumerator(21);
        division.setDenominator(4);
        System.out.println("Numerator = " + division.getNumerator());
        System.out.println("Denominator = " + division.getDenominator());
        System.out.println("Dividing result = " + division.dividing());
        System.out.println("Dividing rest = " + division.restOfDividing());

    }
}


