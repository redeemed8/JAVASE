package NetCoding.TCP.TCP_Test05;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        //  创建对象并且绑定端口
        ServerSocket ss = new ServerSocket(10965);

        while (true) {
            //  等待客户端连接
            Socket socket = ss.accept();

            //  开启一条线程
            //  一个用户就对应服务端的一条线程
            new Thread(new MyRunnable(socket)).start();
        }

        //ss.close();
    }
}
