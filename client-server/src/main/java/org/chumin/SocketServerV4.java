package org.chumin;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Простой TCP-сервер на Java, использующий {@link ServerSocket}.
 * <p>
 * Сервер слушает порт 8000, принимает одно входящее соединение,
 * отправляет клиенту последовательность печатаемых ASCII-символов (от {@code 32} до {@code 90}) и завершает работу.
 * Это демонстрация базовой работы с сокетами в Java без HTTP-протокола.
 *
 * <p><b>Как протестировать:</b><br>
 * 1. Включи Telnet-клиент, если он ещё не активирован:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Открой терминал от имени администратора и выполни:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;<code>dism /online /Enable-Feature /FeatureName:TelnetClient</code><br>
 * 2. Запусти этот сервер.
 * 3. В обычном терминале подключись к серверу командой:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;<code>telnet 127.0.0.1 8000</code><br>
 * 4. В окне Telnet отобразится строка символов от пробела до {@code Z}, после чего соединение будет закрыто сервером.
 */
public class SocketServerV4 {

    /**
     * Точка входа. Создаёт серверный сокет на порту 8000, принимает одно соединение,
     * отправляет клиенту символы ASCII от {@code 32} (пробел) до {@code 90} ('Z') и закрывает соединение.
     *
     * @param args не используются
     * @throws IOException если произошла ошибка при работе с сокетами
     */
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8000)) {
            Socket clientSocket = serverSocket.accept(); // ждём подключение клиента
            for (int i = 32; i <= 90; i++) {
                clientSocket.getOutputStream().write(i); // отправляем печатаемые ASCII-символы
            }
            clientSocket.close(); // закрываем соединение
        }
    }
}
