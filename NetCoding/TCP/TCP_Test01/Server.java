package NetCoding.TCP.TCP_Test01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //  创建对象绑定 10965 端口
        ServerSocket ss = new ServerSocket(10965);

        //  等待客户端来连接
        Socket socket = ss.accept();

        //  读取数据
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        int b;
        while((b = isr.read()) != -1){
                System.out.print((char)b);
        }
        System.out.println();

        //  释放资源
        socket.close();
        ss.close();

    }
}
