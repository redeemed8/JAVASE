package NetCoding.TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //  客户端，输出流

        //  ① 创建客户端的 Socket 对象与指定服务端连接
        //  细节：在创建对象的同时会连接服务端
        //       如果连接不上，会报错
        Socket socket = new Socket("127.0.0.1",10653);

        //  ② 获取输入流，写数据
        //  从连接通道中获取输出流
        OutputStream os = socket.getOutputStream();
        //  写出数据
        os.write("你好你好".getBytes());    //  默认 UTF-8

        //  ③ 释放资源
        os.close();
        socket.close();

    }
}
