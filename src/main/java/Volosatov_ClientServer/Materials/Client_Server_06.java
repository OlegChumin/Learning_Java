package Volosatov_ClientServer.Materials;


import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Client_Server_06 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000); // создаем сервер на указанном порту
        Socket clientSocket = serverSocket.accept(); // создаем сокет клиента
        OutputStreamWriter writer = new OutputStreamWriter(clientSocket.getOutputStream()); // кэширует
        writer.write("<h1>Java</h1>");
        writer.flush(); // промыть, внезапно -> исполняет то что в буфере без ожидания наполнения
        writer.close();
        /*
        <h1>Спецификация HTML</h1>
        <h2>Раздел 1 Введение</h2>
        <h3>Раздел 1.1 Происхождение языка</h3>
        */
        clientSocket.close(); // закрытие клиентского сокета после обработки
        serverSocket.close(); // закрытие сокета после подключения и обработки клиента
        //http://127.0.0.1:8000/ в браузере
        // через выполнить cmd telnet 127.0.0.1 8000
        // powershell telnet 127.0.0.1 8000
    }
}
