package NetCoding.Chat_Room;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveMessage {
    public static void main(String[] args) throws IOException {

        //   找快递公司
        DatagramSocket ds = new DatagramSocket(10086);

        //  接收数据包
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        //  接收数据
        while (true) {
            ds.receive(dp);

            //  解析数据包
            byte[] data = dp.getData();
            int len = dp.getLength();
            String ip = dp.getAddress().getHostAddress();
            String name = dp.getAddress().getHostName();

            //  打印数据
            System.out.println("ip为：" + ip + "，主机名为：" + name + "的人，发送了数据：" + new String(data, 0, len));
        }


    }
}
