package collections;// CollectionDiagramWindow.java
import javax.swing.*;
import java.awt.*;

public class CollectionDiagramWindow extends JFrame {
    public CollectionDiagramWindow() {
        setTitle("Collection Diagram from Oleg Chumin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Добавляем компонент с диаграммой
        CollectionDiagramComponent diagramComponent = new CollectionDiagramComponent();
        add(diagramComponent);

        // Устанавливаем размер окна
        setSize(700, 200);

        // Располагаем окно по центру экрана
        setLocationRelativeTo(null);

        // Отображаем окно
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        new CollectionDiagramWindow();
    }
}
