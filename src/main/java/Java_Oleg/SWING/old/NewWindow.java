package Java_Oleg.SWING.old;

import javax.swing.*;

/**
 * SWING для создания desktop приложений
 * AWT (нативное отображение через ОС) -> SWING (собственная прорисовка)
 * */
public class NewWindow extends JFrame{

    public NewWindow(){
        setTitle("This is my Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640,495);
        setLocation(320, 240);
        add(new MainApplication());
        setVisible(true); // делаем окно видимым
    }

    public static void main(String[] args) {
        NewWindow newWindow = new NewWindow();
    }
}
