package EKIDS.Students.Mark.MakGrat;

import javax.swing.*;

class LabelsOleg extends JFrame
{
    JPanel pnl = new JPanel();

    ClassLoader ldr = this.getClass().getClassLoader(); //загрузка всех ресурсов (изображений и пр.) для компиляции в один файл
    ImageIcon duke = new ImageIcon("C:\\Users\\Oleg_Chumin\\IdeaProjects\\EKIDS\\src\\Java\\Students" +
            "\\Mark\\MakGrat\\duke.png"); //объект типа ImageIcon для изображения duke.png
    ImageIcon markImage = new ImageIcon("C:\\Users\\Oleg_Chumin\\IdeaProjects\\EKIDS\\src\\Java\\Students" +
            "\\Mark\\MakGrat\\hello.png");
    JLabel labelOneImage = new JLabel(duke); // вывод изображения
    JLabel label4Image = new JLabel(markImage); // вывод изображения Марка
    JLabel labelTwoText = new JLabel("Дюк - талисман технологий Java."); // вывод текста
    JLabel labelThree = new JLabel("Дюк", duke, JLabel.CENTER); // вывод текста и изображения


    public LabelsOleg()
    {
        super("sample Swing");
        setSize( 800,200 ); // устанавливаем размер окна
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        add(pnl);// добавляем JPanel в окно

        labelTwoText.setHorizontalTextPosition(JLabel.CENTER); // установка выравнивания текста по горизонту (по центру)
        labelThree.setVerticalTextPosition(JLabel.BOTTOM); // установка выравнивания текста по вертикали (по низу)
        labelOneImage.setToolTipText("Дюк - талисман Java"); // оператор, создающий подсказку для метки labelOneImage
        label4Image.setToolTipText("Рисунок Марка"); // оператор, создающий подсказку для метки label4Image

        pnl.add(labelOneImage); // добавляем компоненты JLabel на контейнер JPanel
        pnl.add(labelTwoText); // добавляем компоненты JLabel на контейнер JPanel
        pnl.add(labelThree); // добавляем компоненты JLabel на контейнер JPanel
        pnl.add(label4Image); // добавляем компоненты JLabel на контейнер JPanel

        setVisible( true ); // включаем флаг видимости окна
    }

    public static void main ( String[] args )
    {
        LabelsOleg gui = new LabelsOleg();
    } // создаем объект класса Labels
}

