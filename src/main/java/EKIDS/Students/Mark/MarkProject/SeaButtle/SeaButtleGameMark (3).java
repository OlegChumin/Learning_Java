package EKIDS.Students.Mark.MarkProject.SeaButtle;//package Java.Students.Mark.MarkProject.SeaButtle;
//
//import Progects.SnakeGame.GameField;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
///**
// * Поле - два поля Игрок1 Игрок2 (бот)
// * Разрешение экрана (
// * Корабли ...... описание
// * <p>
// * игра для двух участников, в которой игроки по очереди называют координаты на неизвестной им карте соперника.
// * Если у соперника по этим координатам имеется корабль (координаты заняты), то корабль или его часть «топится»
// * , а попавший получает право сделать ещё один ход. Цель игрока — первым потопить все корабли противника.
// * <p>
// * <p>
// * *  *  1. Задание для Марка:
// * *  1.1. Проверить, что новый создаваемый корабль не пересекается с уже созданными (циклы for + массивы) "ГОТОВО"
// * *  2.1. Для ввода данных надо создать меню. Подумать какие элементы меню требуются. (Кнопки, поля ввода)
// * *  2.2. Нарисовать спрайты для кнопок. Подумать о размерах кнопок.  (212х95)    "ГОТОВО"
// * *  2.3. Написать два блока оператора switch для перевода координат по оси A, B ... J в координаты по X (0, 1, 2...9)
// * *  и координат по по оси Y 1,2...10  в Y(0,1...9)
// * *  2.4. Дописать сценарий. "ГОТОВО"
// */
//
//public class SeaButtleGameMark extends JFrame implements ActionListener {
//    public SeaButtleGameMark() {
//        JFrame seaButtle = new JFrame();
//        setTitle("Игра морской бой"); // создаём заголовок окна игры
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // отработали закрытие окна
//        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        Dimension dimension = toolkit.getScreenSize();
//        add(new SeaButtleField()); // Здесь добавляется наша игра
//        setSize(1352, 665);
//        setLocation(250, 250);
//        JPanel pnl = new JPanel();
//        add(pnl);
//
//        pnl.add(StartButton);
//        pnl.add(EasyModeButton);
//        pnl.add(NormalModeButton);
//        pnl.add(ExtremeModeButton);
//        setVisible(true);
//    }
//
//
//    // кнопка, которая начинает игру
//    ImageIcon startButtonSprite = new ImageIcon("C:\\Users\\krasn_rhd70wh\\IdeaProjects\\Mark\\src\\Progects\\SeaButtle\\StartButtonSprite.png");
//    JButton StartButton = new JButton(startButtonSprite);
//
//    // кнопки, отвечающие за сложность игры
//    ImageIcon easyModeButtonSprite = new ImageIcon("C:\\Users\\krasn_rhd70wh\\IdeaProjects\\Mark\\src\\Progects\\SeaButtle\\EasyModeButtonSprite.png");
//    JButton EasyModeButton = new JButton(easyModeButtonSprite);
//    ImageIcon NormalModeButtonSprite = new ImageIcon("C:\\Users\\krasn_rhd70wh\\IdeaProjects\\Mark\\src\\Progects\\SeaButtle\\NormalModeButtonSprite.png");
//    JButton NormalModeButton = new JButton(NormalModeButtonSprite);
//    ImageIcon ExtremeModeButtonSprite = new ImageIcon("C:\\Users\\krasn_rhd70wh\\IdeaProjects\\Mark\\src\\Progects\\SeaButtle\\ExstremeModeButtonSprite.png");
//    JButton ExtremeModeButton = new JButton(ExtremeModeButtonSprite);
//
//
//    ImageIcon centralLine = new ImageIcon("centralLineSprite");
//
//
//    public boolean normalMode = true;
//    public boolean easyMode = false;
//    public boolean extremeMode = false;
//
//
//    // метод, отвечающий за начало игры
//    @Override
//    public void actionPerformed(ActionEvent event) {
//        if (event.getSource() == EasyModeButton) {
//            EasyModeButton.setEnabled(false);
//            NormalModeButton.setEnabled(true);
//            ExtremeModeButton.setEnabled(true);
//            StartButton.setEnabled(true);
//            boolean normalMode = false;
//            boolean easyMode = true;
//            boolean extremeMode = false;
//        }
//
//        if (event.getSource() == NormalModeButton) {
//            EasyModeButton.setEnabled(true);
//            NormalModeButton.setEnabled(false);
//            ExtremeModeButton.setEnabled(true);
//            StartButton.setEnabled(true);
//            boolean normalMode = true;
//            boolean easyMode = false;
//            boolean extremeMode = false;
//        }
//
//
//        if (event.getSource() == ExtremeModeButton) {
//            EasyModeButton.setEnabled(true);
//            NormalModeButton.setEnabled(true);
//            ExtremeModeButton.setEnabled(false);
//            StartButton.setEnabled(true);
//            boolean normalMode = false;
//            boolean easyMode = false;
//            boolean extremeMode = true;
//        }
//
//
//        if (event.getSource() == StartButton) {
//            if (event.getSource() == EasyModeButton) {
//                EasyModeButton.setEnabled(false);
//                NormalModeButton.setEnabled(true);
//                ExtremeModeButton.setEnabled(true);
//                StartButton.setEnabled(true);
//                boolean normalMode = false;
//                boolean easyMode = true;
//                boolean extremeMode = false;
//            }
//
//            if (event.getSource() == NormalModeButton) {
//                EasyModeButton.setEnabled(true);
//                NormalModeButton.setEnabled(false);
//                ExtremeModeButton.setEnabled(true);
//                StartButton.setEnabled(true);
//                boolean normalMode = true;
//                boolean easyMode = false;
//                boolean extremeMode = false;
//            }
//
//
//            if (event.getSource() == ExtremeModeButton) {
//                EasyModeButton.setEnabled(true);
//                NormalModeButton.setEnabled(true);
//                ExtremeModeButton.setEnabled(false);
//                StartButton.setEnabled(true);
//                boolean normalMode = false;
//                boolean easyMode = false;
//                boolean extremeMode = true;
//            }
//
//            if (normalMode == true) {
//                normalModeGame();
//            }
//
//            if (easyMode == true) {
//                easyModeGame();
//            }
//
//            if (extremeMode == true) {
//                extremeModeGame();
//            }
//        }
//    }
//
//
//    // метод, отвечающий за игру нормальной сложности
//    public void normalModeGame() {
//
//    }
//
//    // метод, отвечающий за игру лёгкой сложности
//    public void easyModeGame() {
//
//    }
//
//    // метод, отвечающий за игру экстримальной сложности сложности (хардкор)
//    public void extremeModeGame() {
//
//    }
//
//
//}
//
