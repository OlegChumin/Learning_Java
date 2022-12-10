package Volosatov_ClientServer.Old;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerForOneTime {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000); // создаем сокет сервера
        Socket clientSocket = serverSocket.accept(); // начинаем слушать порт 8000 до подключения клиента
//        clientSocket.getOutputStream().write(64); // получим символ @
//        for (int i = 48; i < 58; i++) {
//            clientSocket.getOutputStream().write(i); // все символы 0123456789
//        }
        // в браузере  http://127.0.0.1:8000/
        // в telnet: telnet 127.0.0.1 8000
        //IP-адрес 127.0.0.1 известен как адрес обратной связи, но вы можете увидеть его под именем localhost.
        // Когда ты указываешь браузеру на 127.0.0.1, он пытается подключиться к компьютеру, который ты используешь
        // прямо сейчас. Это удобно, когда ты хочешь подключиться к серверу на своем компьютере.

//        clientSocket.getOutputStream().write("<h2>Hello</h2>".getBytes());

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(clientSocket.getOutputStream());
        outputStreamWriter.write("<h1>Java</h1>");
        outputStreamWriter.flush();

        outputStreamWriter.close();
        clientSocket.close();
        serverSocket.close(); // закрываем сокет после окончания работы
    }
}
