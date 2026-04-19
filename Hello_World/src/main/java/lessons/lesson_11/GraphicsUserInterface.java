package lessons.lesson_11;

import materials.lesson_11.graphic_mp3_player.Mp3Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GraphicsUserInterface extends JFrame { // Наследуем класс от JFrame для создания оконного приложения
    private final Mp3Player MP3_PLAYER; // Объявляем переменную для работы с mp3 плеером

    public GraphicsUserInterface() { // Конструктор класса
        super("Mp3 Graphics Music Player"); // Вызываем конструктор базового класса JFrame, устанавливая заголовок окна
        MP3_PLAYER = new Mp3Player("src/main/resources/Dj Power - Popcorn.mp3");
        initializeUI();
    }

    private void initializeUI() {
        setSize(400, 100);
        setLocationRelativeTo(null); // установка онка плеера в центре экрана
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton playButton = new JButton("PLAY");
        JButton rewindButton = new JButton("REWIND");
        JButton stopButton = new JButton("STOP"); //

        playButton.addMouseListener( // Добавляем слушателя событий мыши к кнопке "Play"
                new MouseAdapter() { // implements MouseListener
                    public void mouseEntered(MouseEvent event) { // Метод вызывается при наведении курсора на кнопку
                        playButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Меняем курсор на руку
                    }
                }
        );

        rewindButton.addMouseListener( // Добавляем слушателя событий мыши к кнопке "REWIND"
                new MouseAdapter() { // implements MouseListener
                    public void mouseEntered(MouseEvent event) { // Метод вызывается при наведении курсора на кнопку
                        rewindButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Меняем курсор на руку
                    }
                }
        );

        stopButton.addMouseListener( // Добавляем слушателя событий мыши к кнопке "Stop"
                new MouseAdapter() { // implements MouseListener
                    public void mouseEntered(MouseEvent event) { // Метод вызывается при наведении курсора на кнопку
                        stopButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Меняем курсор на руку
                    }
                }
        );

        playButton.addActionListener(e -> MP3_PLAYER.play()); // Добавляем слушателя нажатий на кнопку "Play"
        rewindButton.addActionListener(e -> MP3_PLAYER.stop()); // Добавляем слушателя нажатий на кнопку "REWIND"
        stopButton.addActionListener(e -> MP3_PLAYER.stop()); // Добавляем слушателя нажатий на кнопку "Stop"

        JPanel jPanel = new JPanel();
        jPanel.add(playButton);
        jPanel.add(rewindButton);
        jPanel.add(stopButton);

        add(jPanel);
        setResizable(false);
        setVisible(true);
    }
}
