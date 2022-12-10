package MagicJava;

public class Vector3D {
    private int x;
    private int y;
    private int z;

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

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double vectorLength() { // длина вектора равна корню из квадрата катетов
        return Math.sqrt(x * x + y * y + z * z);
//        return 1; // ввели специально ошибку
    }
}
