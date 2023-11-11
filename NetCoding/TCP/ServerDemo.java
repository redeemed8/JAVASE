package NetCoding.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//  先运行服务端！！

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //  服务器，输入流

        //  ① 创建服务器端的 Socket 对象(ServerSocket)
        ServerSocket ss = new ServerSocket(10653);

        //  ② 监听客户端连接，返回一个 Socket 对象
        //  会死等
        Socket socket = ss.accept();

        //  ③ 获取输入流，读数据，并把数据显示在控制台
        InputStream is = socket.getInputStream();
        int len;
        byte[] bytes = new byte[6];
        //  因为字节流单个读取中文会有乱码
        //  所以要么转换成字符流
        //  要么就创建 大小为 6 的倍数的数组去读取
        while ((len = is.read(bytes)) != -1) {
            System.out.print(new String(bytes, 0, len));
        }
        System.out.println();
        //  ④ 释放资源
        socket.close();     //  断开与客户端之间的连接
        ss.close();       //  关闭服务器

    }
}
