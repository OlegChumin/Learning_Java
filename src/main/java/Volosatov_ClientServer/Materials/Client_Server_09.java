package Volosatov_ClientServer.Materials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Client_Server_09 {
    public static void main(String[] args) throws IOException {
        int count = 0; // счетчик обращений к серверу
        ServerSocket serverSocket = new ServerSocket(8000);
        System.out.println("New socket server started on address 127.0.0.1; port 8000; link: http://127.0.0.1:8000/");

        while(true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Обращение к серверу №: " + (++count));

            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(clientSocket.getOutputStream());
            outputStreamWriter.write("HTTP/1.0 200 OK\r\n" +
                    "Content-type: text/html\r\n" +
                    "\r\n" +
                    "<h1>Hallo Magic Java</h1>\r\n" +
                    "<h2>Java Magic intensive course!</h2>\r\n" + (count - 1));
            outputStreamWriter.flush();
            outputStreamWriter.close();
            clientSocket.close();
        }
//        serverSocket.close();
    }
}

class Client_01 {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("127.0.0.1", 8000); // при создании socket клиента не с серверного
        System.out.println(clientSocket.getInputStream().read()); // читает только один байт - символ
        clientSocket.close();
    }
}

class Client_02 {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("127.0.0.1", 8000); // при создании socket клиента не с серверного
        byte[] arrayOfByteSymbols = new byte[256];
        System.out.println(clientSocket.getInputStream().read(arrayOfByteSymbols)); // читает только один байт - символ
        System.out.println(Arrays.toString(arrayOfByteSymbols));
        System.out.println(new String(arrayOfByteSymbols));
        clientSocket.close();
    }
}

class Client_03 {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("127.0.0.1", 8000); // при создании socket клиента не с серверного
        InputStreamReader inputStreamReader = new InputStreamReader(clientSocket.getInputStream());
        String message = String.valueOf(inputStreamReader.read()); //-> читает по-прежднему по одному символу
        inputStreamReader.close();
    }
}

class Client_04 {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("127.0.0.1", 8000); // при создании socket клиента не с серверного
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String message = bufferedReader.readLine();
        System.out.println(message);
        bufferedReader.close();
    }
}

class Client_05 {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("127.0.0.1", 8000); // при создании socket клиента не с серверного

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(clientSocket.getOutputStream());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));


        outputStreamWriter.write("GET me some information");
        outputStreamWriter.flush();


        String message = bufferedReader.readLine();
        System.out.println(message);

        outputStreamWriter.close();
        bufferedReader.close();
        clientSocket.close();
    }
}

