package Volosatov_ClientServer.Materials;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Client_Server_05 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000); // создаем сервер на указанном порту
        Socket clientSocket = serverSocket.accept(); // создаем сокет клиента
//        clientSocket.getOutputStream().write("<h1>HTML 2.0</h1>".getBytes());
        clientSocket.getOutputStream().write("<h2>Magic Java</h2>".getBytes()); //Кодирует эту строку в
                                                // последовательность байтов, используя кодировку платформы по умолчанию,
                                                // сохраняя результат в новый массив байтов.
            //преобразовываем сообщение в массив байтов
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
