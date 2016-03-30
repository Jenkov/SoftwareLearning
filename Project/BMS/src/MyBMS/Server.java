package MyBMS;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {  
    final int RECEIVE_PORT = 4321; // �÷������Ķ˿ں�  
  
    // receiveServer�Ĺ�����  
    public Server() {  
        ServerSocket rServer = null; // ServerSocket��ʵ��  
        Socket request = null; // �û�������׽���  
        Thread receiveThread = null;  
        try {  
            rServer = new ServerSocket(RECEIVE_PORT); // ��ʼ��ServerSocket  
            System.out.println("Welcome to the server!");  
            System.out.println(new Date());  
            System.out.println("The server is ready!");  
            System.out.println("Port: " + RECEIVE_PORT);  
            while (true) { // �ȴ��û�����  
                request = rServer.accept(); // ��������
                receiveThread = new ServerThread(request); // ����serverThread��ʵ��  
                receiveThread.start();// ����serverThread�߳�  
            }  
        } catch (IOException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
  
    public static void main(String args[]) {  
        new Server();  
    } // end of main  
  
}

