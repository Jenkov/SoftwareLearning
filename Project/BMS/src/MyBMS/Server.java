package MyBMS;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {  
    final int RECEIVE_PORT = 4321; // 该服务器的端口号  
  
    // receiveServer的构造器  
    public Server() {  
        ServerSocket rServer = null; // ServerSocket的实例  
        Socket request = null; // 用户请求的套接字  
        Thread receiveThread = null;  
        try {  
            rServer = new ServerSocket(RECEIVE_PORT); // 初始化ServerSocket  
            System.out.println("Welcome to the server!");  
            System.out.println(new Date());  
            System.out.println("The server is ready!");  
            System.out.println("Port: " + RECEIVE_PORT);  
            while (true) { // 等待用户请求  
                request = rServer.accept(); // 侦听连接
                receiveThread = new ServerThread(request); // 生成serverThread的实例  
                receiveThread.start();// 启动serverThread线程  
            }  
        } catch (IOException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
  
    public static void main(String args[]) {  
        new Server();  
    } // end of main  
  
}

