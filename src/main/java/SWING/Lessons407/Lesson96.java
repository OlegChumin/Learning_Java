package SWING.Lessons407;

import javax.swing.*;

public class Lesson96 {
    public static void main(String[] args) {
        // AWT использовала нативный интерфейс операционной системы, но были проблемы
        // написано один раз, работает везде
        // SWING не использует нативные элементы, а прорисовывает сама
        JFrame jFrame = new JFrame(); // создаем экземпляр (новый объект) типа класса JFrame
        jFrame.setTitle("This is new Title"); // переписываем текст в заголовке окна, можно при создании объекта
        // передать в конструкторе тоже
        jFrame.setVisible(true); // включаем видимость окна
        jFrame.setLocation(500, 400); // устанавливаем начальное положение левого верхнего угла нашего окна
        jFrame.setSize(500, 300); // задаем размер окна в пикселах
        jFrame.setResizable(false); // запрещаем изменять размер окна
//        jFrame.setIconImage(new Image(""));  // добавить новую иконку вместо иконки Дюка
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // устанавливаем default операция при закрытии окна
    }
}
