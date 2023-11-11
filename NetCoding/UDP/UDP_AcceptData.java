package NetCoding.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDP_AcceptData {
    public static void main(String[] args) throws IOException {
        //  ① 找快递公司   ---   创建接受端的 DatagramSocket 对象
        //  细节：接收数据时，创建 DatagramSocket 一定要 绑定端口
        //  而且绑定的端口，一定要跟发送的端口保持一致
        DatagramSocket ds = new DatagramSocket(10086);

        //  ② 接收箱子   ---   接受打包好的数据
        //  自己准备个箱子，用来接受数据
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);        //  第二个参数代表你想用这个数组多大的空间去接收数据

        //  ↓ 该方法是阻塞的
        //  会在这里死等
        //  等发送端发送消息
        ds.receive(dp);

        //  ③ 从箱子里面获取礼物   ---   解析数据包
        byte[] data = dp.getData();         //  获取数据，就是获取上面的字节数组
        int len = dp.getLength();           //  获取到多少个字节的数据
        InetAddress address = dp.getAddress();          //  从哪个电脑发过来的
        int port = dp.getPort();            //  从哪个端口发过来的

        System.out.println("接收到数据 --- " + new String(data,0,len));
        System.out.println("该数据是从" + address + "这台电脑的" + port + "这个端口发出的");

        //  ④ 签收走人   ---   释放资源
        ds.close();

        //  运行
        //  先运行接收端，在运行发送端
    }
}
