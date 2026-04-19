package org.chumin;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Простой TCP-сервер на Java, использующий {@link ServerSocket}.
 * <p>
 * Сервер слушает порт 8000, принимает одно входящее соединение, отправляет клиенту байт со значением 64 (символ {@code @}) и завершает работу.
 * Это демонстрация базовой работы с сокетами в Java без HTTP-протокола.
 *
 * <p><b>Как протестировать:</b><br>
 * 1. Включи Telnet-клиент, если он ещё не активирован:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Открой терминал от имени администратора и выполни:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;<code>dism /online /Enable-Feature /FeatureName:TelnetClient</code><br>
 * 2. Запусти этот сервер.
 * 3. В обычном терминале подключись к серверу командой:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;<code>telnet 127.0.0.1 8000</code><br>
 * 4. В окне Telnet отобразится символ {@code @}, после чего соединение будет закрыто сервером.
 */
public class SocketServerV3 {

    /**
     * Точка входа. Создаёт серверный сокет на порту 8000, принимает одно соединение,
     * отправляет байт {@code 64} (символ {@code @}) и завершает соединение.
     *
     * @param args не используются
     * @throws IOException если произошла ошибка при работе с сокетами
     */
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8000)) {
            Socket clientSocket = serverSocket.accept(); // ждём подключение клиента
            clientSocket.getOutputStream().write(64);   // отправляем байт @
            clientSocket.close();                       // закрываем соединение
        }
    }
}
