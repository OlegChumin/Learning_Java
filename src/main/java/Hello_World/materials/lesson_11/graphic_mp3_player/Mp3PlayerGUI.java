package Hello_World.materials.lesson_11.graphic_mp3_player;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mp3PlayerGUI extends JFrame { // Наследуем класс от JFrame для создания оконного приложения
    private Mp3Player mp3Player; // Объявляем переменную для работы с mp3 плеером

    public Mp3PlayerGUI() { // Конструктор класса
        super("MP3 Player"); // Вызываем конструктор базового класса JFrame, устанавливая заголовок окна
        mp3Player = new Mp3Player("src/main/resources/Hello_World/Dj Power - Popcorn.mp3"); // Инициализируем mp3 плеер, указывая путь к файлу
        initializeUI(); // Вызываем метод для инициализации пользовательского интерфейса
    }

    private void initializeUI() { // Метод для инициализации интерфейса
        setSize(300, 100); // Устанавливаем размер окна
        setLocationRelativeTo(null); // Центрируем окно на экране
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Указываем операцию, которая будет выполнена при закрытии окна


        JButton playButton = new JButton("Play"); // Создаем кнопку "Play"
        JButton stopButton = new JButton("Stop"); // Создаем кнопку "Stop"

        playButton.addMouseListener(new MouseAdapter() { // Добавляем слушателя событий мыши к кнопке "Play"
            public void mouseEntered(MouseEvent e) { // Метод вызывается при наведении курсора на кнопку
                playButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Меняем курсор на руку
            }
        });

        stopButton.addMouseListener(new MouseAdapter() { // Добавляем слушателя событий мыши к кнопке "Stop"
            public void mouseEntered(MouseEvent e) { // Метод вызывается при наведении курсора на кнопку
                stopButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Меняем курсор на руку
            }
        });

        playButton.addActionListener(e -> mp3Player.play()); // Добавляем слушателя нажатий на кнопку "Play"
        stopButton.addActionListener(e -> mp3Player.stop()); // Добавляем слушателя нажатий на кнопку "Stop"

        JPanel panel = new JPanel(); // Создаем панель для размещения элементов интерфейса
        panel.add(playButton); // Добавляем кнопку "Play" на панель
        panel.add(stopButton); // Добавляем кнопку "Stop" на панель
        add(panel); // Добавляем панель на главное окно

        setVisible(true); // Делаем окно видимым
    }
}
