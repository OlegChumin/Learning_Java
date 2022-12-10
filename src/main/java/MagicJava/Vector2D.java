package MagicJava;

public class Vector2D {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double vectorLength() { // длина вектора равна корню из квадрата катетов
        return Math.sqrt(x * x + y * y);
//        return 1; // ввели специально ошибку
    }
}
