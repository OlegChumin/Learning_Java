package Volosatov_ClientServer.Materials;

// answering machine -> доработаем, при подключении клиента, будет выдаваться сообщение
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Client_Server_02 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000); // создаем сервер на указанном порту
        Socket clientSocket = serverSocket.accept(); // создаем сокет клиента
        clientSocket.getOutputStream().write(64); // "@"создаем поток вывода у клиента для отправки и отправляем 1 байт
        clientSocket.close(); // закрытие клиентского сокета после обработки
        serverSocket.close(); // закрытие сокета после подключения и обработки клиента
        //http://127.0.0.1:8000/ в браузере
        // через выполнить cmd telnet 127.0.0.1 8000
        // powershell telnet telnet 127.0.0.1 8000
    }
}
