package NetCoding.UDP.Multicast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Send_MessageDemo1 {
    public static void main(String[] args) throws IOException {
        //  组播发送端

        //  创建 MulticastSocket 对象
        MulticastSocket ms = new MulticastSocket();

        //  创建 DatagramPacket 对象
        String s = "你好，你好!";
        byte[] bytes = s.getBytes();
        InetAddress address = InetAddress.getByName("224.0.0.1");       //  要制定组播地址
        int port = 10000;

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

        //  调用 MulticastSocket 中的方法 发送数据
        ms.send(dp);

        //  释放资源
        ms.close();

    }
}
