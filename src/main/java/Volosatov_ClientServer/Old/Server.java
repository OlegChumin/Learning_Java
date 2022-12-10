package Volosatov_ClientServer.Old;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        int count = 0;
        ServerSocket serverSocket = new ServerSocket(8000); // создаем сокет сервера

        while (true) {
            Socket clientSocket = serverSocket.accept(); // начинаем слушать порт 8000 до подключения клиента
            System.out.println("Client accepted " + (count++));
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(clientSocket.getOutputStream());
            outputStreamWriter.write("HTTP/1.0 200 OK\r\n" +
                    "Content-type: text/html\r\n" +
                    "\r\n" +
                    "<h1>Java " + count + "</h1>");
            outputStreamWriter.flush();
            outputStreamWriter.close();
            clientSocket.close();
        }
    }
}
