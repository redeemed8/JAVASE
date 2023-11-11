package NetCoding.TCP.TCP_Test04;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //  创建 Socket 对象，连接服务器
        Socket socket = new Socket("127.0.0.1", 10965);

        //  读取本地文件中的数据，并写到服务器中
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\protjct\\ServerTestFile\\photo.png"));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bos.flush();                        //  !~!!!!!!!!!!!!!!!!

        //  往服务器写出结束标记
        socket.shutdownOutput();            //  !~!!!!!!!!!!!!!!!!

        //  接收服务器的回写数据
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = br.readLine();
        System.out.println(line);

        //  释放资源
        socket.close();

    }
}
