package NetCoding.TCP.TCP_Test02;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        //  创建
        Socket socket = new Socket("127.0.0.1", 10965);

        //  写出
        String str = "啊哈哈哈哈哈哈哈";
        OutputStream os = socket.getOutputStream();
        os.write(str.getBytes());

        //  写出一个结束标记
        socket.shutdownOutput();

        //  接收服务端回写的数据
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        int b;
        while((b = isr.read()) != -1){
            System.out.print((char)b);
        }


        //  释放
        socket.close();

    }
}
