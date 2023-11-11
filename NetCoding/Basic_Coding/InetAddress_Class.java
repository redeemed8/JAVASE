package NetCoding.Basic_Coding;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_Class {
    public static void main(String[] args) throws UnknownHostException {
        //  InetAddress 类
        //  先检查你用的是 4版本的 还是 6版本的
        //  是 IPv4 创建 Inet4Address
        //  是 IPv6 创建 Inet6Address

        //  这类没有构造方法，所以只能使用静态方法

        //  获取对象
        //  InetAddress getByName(String host)   获取主机名称的Ip地址，主机名称可以是机器名称，也可以是 IP 地址
        //  IP的对象，一台电脑对象
        InetAddress address = InetAddress.getByName("192.168.1.87");
        System.out.println(address);
        InetAddress address2 = InetAddress.getByName("LAPTOP-1P7D6721");
        System.out.println(address2);

        //  String getHostName()       获取此 IP 地址的主机名
        //  我的主机名 -- LAPTOP-1P7D6721
        String name = address.getHostName();
        System.out.println(name);
        //  细节：如果网络不好或者是局域网中压根没有这个主机，他不会返回名字，会返回 它的 IP

        //  String getHostAddress()  返回文本显示中的IP地址字符串
        String ip = address.getHostAddress();
        System.out.println(ip);
    }
}
