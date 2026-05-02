package Mp3Player.ru.chumin.mp3_player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GraphicsUserInterface extends JFrame { // Наследуем класс от JFrame для создания оконного приложения
    private final Mp3Player MP3_PLAYER; // Объявляем переменную для работы с mp3 плеером

    private final String FILE_PATH = "src/main/resources/Mp3Player/Dj Power - Popcorn.mp3";

    public GraphicsUserInterface() { // Конструктор класса
        super("Oleg Chumin - Mp3 Graphics Music Player"); // Вызываем конструктор базового класса JFrame, устанавливая заголовок окна
        MP3_PLAYER = new Mp3Player();
        initializeUI();
    }

    private void initializeUI() {
        setSize(450, 100);
        setLocationRelativeTo(null); // установка онка плеера в центре экрана
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton pauseButton = new JButton("PAUSE");
        JButton playButton = new JButton("PLAY");
        JButton fastForwardButton = new JButton("FF");
        JButton rewindButton = new JButton(" REWIND");
        JButton stopButton = new JButton("STOP");

        pauseButton.addMouseListener( // Добавляем слушателя событий мыши к кнопке "PAUSE"
                new MouseAdapter() { // implements MouseListener
                    public void mouseEntered(MouseEvent event) { // Метод вызывается при наведении курсора на кнопку
                        pauseButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Меняем курсор на руку
                    }
                }
        );

        playButton.addMouseListener( // Добавляем слушателя событий мыши к кнопке "PLAY"
                new MouseAdapter() { // implements MouseListener
                    public void mouseEntered(MouseEvent event) { // Метод вызывается при наведении курсора на кнопку
                        playButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Меняем курсор на руку
                    }
                }
        );

        fastForwardButton.addMouseListener( // Добавляем слушателя событий мыши к кнопке "FAST_FORWARD"
                new MouseAdapter() { // implements MouseListener
                    public void mouseEntered(MouseEvent event) { // Метод вызывается при наведении курсора на кнопку
                        fastForwardButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Меняем курсор на руку
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

        stopButton.addMouseListener( // Добавляем слушателя событий мыши к кнопке "STOP"
                new MouseAdapter() { // implements MouseListener
                    public void mouseEntered(MouseEvent event) { // Метод вызывается при наведении курсора на кнопку
                        stopButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Меняем курсор на руку
                    }
                }
        );

        pauseButton.addActionListener(e -> MP3_PLAYER.pause()); // Добавляем слушателя нажатий на кнопку "PAUSE"
        playButton.addActionListener(e -> MP3_PLAYER.play(FILE_PATH)); // Добавляем слушателя нажатий на кнопку "PLAY"
        fastForwardButton.addActionListener(e -> MP3_PLAYER.fastForward()); // Добавляем слушателя нажатий на кнопку "FAST_FORWARD"
        rewindButton.addActionListener(e -> MP3_PLAYER.rewind()); // Добавляем слушателя нажатий на кнопку "REWIND"
        stopButton.addActionListener(e -> MP3_PLAYER.stop()); // Добавляем слушателя нажатий на кнопку "STOP"

        JPanel jPanel = new JPanel();
        jPanel.add(pauseButton);
        jPanel.add(playButton);
        jPanel.add(fastForwardButton);
        jPanel.add(rewindButton);
        jPanel.add(stopButton);

        add(jPanel);
        setResizable(false);
        setVisible(true);
    }
}
