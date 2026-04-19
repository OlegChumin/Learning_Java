package materials.lesson_11.graphic_mp3_player;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Mp3Player {
    private String filePath;
    private Player player;
    private Thread playerThread;

    public Mp3Player(String filePath) {
        this.filePath = filePath;
    }

    public void play() {
        if (playerThread == null || !playerThread.isAlive()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(filePath);
                player = new Player(fileInputStream);
                playerThread = new Thread(() -> {
                    try {
                        player.play();
                    } catch (JavaLayerException e) {
                        e.printStackTrace();
                    }
                });
                playerThread.start();
            } catch (FileNotFoundException | JavaLayerException e) {
                e.printStackTrace();
            }
        }
    }

    public void stop() {
        if (player != null) {
            player.close();
            if (playerThread != null && playerThread.isAlive()) {
                playerThread.interrupt();
            }
        }
    }
}
