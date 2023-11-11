package NetCoding.UDP;

import java.io.IOException;
import java.net.*;

public class UDP_SendData {
    public static void main(String[] args) throws IOException {
        //  ①  找快递公司 --- 创建发送端的 DatagramSocket 对象
        //  细节：
        //  绑定端口：以后我们就是通过这个端口往外发送
        //  空参：所有可用的端口中随机一个进行使用
        //  有参：指定端口号进行绑定
        //  从哪里发的无所谓，你只要知道我要发到 10086 这个端口，并且从 10086 这个端口接收就行了
        DatagramSocket ds = new DatagramSocket();

        //  ②  打包礼物 --- 数据打包 ( DatagramPacket )
        String str = "我是你爹！！";                              //  要发送的字符串
        byte[] bytes = str.getBytes();                          //  转换成字节数组
        InetAddress address = InetAddress.getByName("127.0.0.1");       //  指定电脑，给本机发
        int port = 10086;               //  要发送的端口号
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

        //  ③  快递公司发送包裹 --- 发送数据
        ds.send(dp);

        //  ④  付钱走人 --- 释放资源
        ds.close();
    }
}
