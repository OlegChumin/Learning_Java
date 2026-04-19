package org.chumin;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Простой TCP-сервер на Java, использующий {@link ServerSocket}.
 * <p>
 * Сервер слушает порт 8000, принимает одно входящее соединение и сразу завершает работу.
 * Это демонстрация базовой работы с сокетами в Java.
 *
 * <p><b>Как протестировать:</b><br>
 * После запуска сервера можно отправить HTTP-запрос или просто подключиться через браузер или curl:<br>
 * - Браузер: открой <a href="http://127.0.0.1:8000/">http://127.0.0.1:8000/</a><br>
 * - curl: <code>curl http://127.0.0.1:8000/</code><br>
 * <p>
 * После первого входящего соединения сервер завершит свою работу.
 */
public class SocketServerV2 {

    /**
     * Точка входа. Создаёт серверный сокет на порту 8000, принимает одно соединение и закрывает сокет.
     *
     * @param args не используются
     * @throws IOException если произошла ошибка при работе с сокетами
     */
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8000)) {
            serverSocket.accept(); // блокируется до подключения клиента (например, через curl или браузер)
        }
    }

}
