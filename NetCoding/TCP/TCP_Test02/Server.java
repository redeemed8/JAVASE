package NetCoding.TCP.TCP_Test02;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //  创建 ServerSocket
        ServerSocket ss = new ServerSocket(10965);

        //  等待客户端连接
        Socket socket = ss.accept();

        //  socket中获取输入流读取数据
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        int b;
        //  细节
        //  read会从连接通道中读取数据
        //  但是，需要有一个结束标记，此处的循环才会停止
        //  否则，程序就会一直停在read方法这里，等待读取下面的数据
        while((b = isr.read()) != -1){
            System.out.print((char)b);
        }

        //  回写数据
        String s = "尼玛？";
        OutputStream os = socket.getOutputStream();
        os.write(s.getBytes());

        //  释放资源
        socket.close();
        ss.close();
    }
}
