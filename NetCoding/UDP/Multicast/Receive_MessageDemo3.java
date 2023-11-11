package NetCoding.UDP.Multicast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Receive_MessageDemo3 {
    public static void main(String[] args) throws IOException {
        //  创建 MulticastSocket 对象
        MulticastSocket ms = new MulticastSocket(10000);

        //  将当前本机，添加到 224.0.0.1 的这一组当中
        InetAddress address = InetAddress.getByName("224.0.0.2");       //  IP 不同接收不到数据
        ms.joinGroup(address);

        //  创建 DatagramPacket 数据包对象
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        //  接收数据
        ms.receive(dp);

        //  解析数据
        byte[] data = dp.getData();
        int len = dp.getLength();
        String ip = dp.getAddress().getHostAddress();
        String name = dp.getAddress().getHostName();
        System.out.println("ip为：" + ip + "，主机名为：" + name + "的人，发送了数据：" + new String(data, 0, len));

        //  释放资源
        ms.close();


    }
}
