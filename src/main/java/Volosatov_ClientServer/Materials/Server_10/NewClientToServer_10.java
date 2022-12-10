package Volosatov_ClientServer.Materials.Server_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class NewClientToServer_10 {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("127.0.0.1", 8000); // при создании socket клиента не с серверного
        //BufferedWriter
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(clientSocket.getOutputStream());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        outputStreamWriter.write("GET me some information\n"); // убрать \n
//        outputStreamWriter.newLine();
        outputStreamWriter.flush();

        String response = bufferedReader.readLine(); //ждем ответное сообщение и выводим его на экран
        System.out.println(response);

        outputStreamWriter.close();
        bufferedReader.close();
        clientSocket.close();
    }
}
