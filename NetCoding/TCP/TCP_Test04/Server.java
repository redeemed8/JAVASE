package NetCoding.TCP.TCP_Test04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        //  创建对象并且绑定端口
        ServerSocket ss = new ServerSocket(10965);

        //  等待客户端连接
        Socket socket = ss.accept();

        //  读取数据并且保存到本地文件中
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        String name = UUID.randomUUID().toString().replace("-","");
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("D:\\protjct\\jjj\\Server\\src\\NetCoding\\TCP\\TCP_Test04\\"+ name +".jpg"));
        int len;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bos.flush();                //  !~!!!!!!!!!!!!!!!!

        //  回写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("上传成功！~");
        bw.newLine();
        bw.flush();                 //  !~!!!!!!!!!!!!!!!!

        //  释放资源
        socket.close();
        ss.close();

    }
}
