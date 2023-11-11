package NetCoding.Chat_Room_Senior;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Properties;

public class Server {

    static ArrayList<Socket> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10001);

        //1.把本地文件中正确的用户名和密码获取到
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("D:\\protjct\\Chat_Room.txt");
        prop.load(fis);
        fis.close();

        //2.只要来了一个客户端，就开一条线程处理
        while (true) {
            Socket socket = ss.accept();
            System.out.println("有客户端来链接");
            new Thread(new MyRunnable(socket, prop)).start();
        }
    }
}



