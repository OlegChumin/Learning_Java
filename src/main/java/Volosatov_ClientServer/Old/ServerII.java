package Volosatov_ClientServer.Old;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerII {
        public static void main(String[] args) throws IOException {
            ServerSocket serverSocket = new ServerSocket(8000); // создаем сокет сервера
            int count = 0;
            while(true) {
                Socket clientSocket = serverSocket.accept(); // начинаем слушать порт 8000 до подключения клиента
                System.out.println("Clients accepted " + (++count));
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(clientSocket.getOutputStream());
                outputStreamWriter.write("You are client # " + count + "\n");
                outputStreamWriter.flush();
                outputStreamWriter.close();
                clientSocket.close();
            }
        }
}
