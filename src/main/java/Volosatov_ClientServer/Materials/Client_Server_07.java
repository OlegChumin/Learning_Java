package Volosatov_ClientServer.Materials;

// многоразовый сервер -> постоянный автоответчик
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Client_Server_07 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        ServerSocket serverSocket = new ServerSocket(8000); // команда выполняется один раз
        while(true) {
            Socket clientSocket = serverSocket.accept(); // создаем сокет клиента
            System.out.println("Client accepted " + count++);
            OutputStreamWriter writer = new OutputStreamWriter(clientSocket.getOutputStream()); // кэширует
            writer.write("<h1>Java</h1> " + (count - 1));
            writer.flush();
            writer.close();
            clientSocket.close(); // закрытие клиентского сокета после обработки
        }
//        serverSocket.close(); // закрытие сокета после подключения и обработки клиента не требуется, он в режиме ожидания
        //http://127.0.0.1:8000/ в браузере
        // через выполнить cmd telnet 127.0.0.1 8000
        // powershell telnet 127.0.0.1 8000
    }
}
