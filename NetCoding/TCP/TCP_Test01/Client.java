package NetCoding.TCP.TCP_Test01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //  创建 Socket 对象并连接服务器
        Socket socket = new Socket("127.0.0.1",10965);

        //  写出数据
        Scanner sc = new Scanner(System.in);
        OutputStream os = socket.getOutputStream();

        while (true) {
            System.out.println("请bb: ");
            String str = sc.nextLine();
            if("886".equals(str)){
                break;
            }
            os.write(str.getBytes());
        }

        //  释放资源
        socket.close();     //  socket关闭了 os 自动关闭


    }
}
