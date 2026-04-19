package materials.lesson_07_08.V_constructors;

class Box {
    int width;
    int height;
    int depth;

    // Конструктор по умолчанию
    Box() {
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    // Конструктор с одним параметром
    Box(int size) {
        this.width = size;
        this.height = size;
        this.depth = size;
    }

    // Конструктор с тремя параметрами
    Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}

class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(10);
        Box box3 = new Box(10, 20, 30);
    }
}
