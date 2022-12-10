package Volosatov_ClientServer.Materials;

import java.io.IOException;
import java.net.ServerSocket;

public class Client_Server_01 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000); // создаем сервер на указанном порту
        serverSocket.accept(); // начинаем слушать порт, команда будет ждать бесконечно до подключения клиента
        serverSocket.close(); // закрытие сокета после подключения и обработки клиента
        //http://127.0.0.1:8000/ в браузере
        // через выполнить cmd telnet 127.0.0.1 8000
    }
}
