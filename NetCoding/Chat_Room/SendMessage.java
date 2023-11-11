package NetCoding.Chat_Room;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class SendMessage {
    //  本类采取可运行多个实例，右上角类名处设置
    public static void main(String[] args) throws IOException {

        //  快递公司
        DatagramSocket ds = new DatagramSocket();           //  随机端口发出

        //  打包数据
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请bb : ");
            String str = sc.nextLine();
            if("886".equals(str)){
                //  发送 886 截止
                break;
            }
            byte[] bytes = str.getBytes();

            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port = 10086;
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

            //  让快递公司发送
            ds.send(dp);
        }

        //  交钱走人
        ds.close();

    }
}
