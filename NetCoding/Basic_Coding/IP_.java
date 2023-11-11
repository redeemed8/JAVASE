package NetCoding.Basic_Coding;

public class IP_ {
    public static void main(String[] args) {
        //  IP
        //  全称 ：Internet Protocol , 是互联网协议地址，也称 IP 地址
        //  是分配给上网设备的数字标签

        //  上网设备在网络中的地址，是唯一的

        //  常见的 IP 分类为      IPv4  IPv6

        //  IPv4    Internet Protocol version 4   互联网通信协议第四版        ---  最早发布版
        //  采用 32 位地址长度，分为四组    每组一个字节
        //  后来采用 点分十进制表示法  ---  把四组转换为 10 进制 (每组取值范围 0 ~ 255)
        //  比如 ： 192.168.1.66               ，，一共不到 43 亿

        //  为了解决 IP 不够用的问题，出版了 IPv6     (Internet Protocol version 6)
        //  采用 128 位地址长度，分为 8 组
        //  一共就有 2的128次方 个IP,可以为地球上的每一粒沙子都设定 Ip
        //  采用 冒分十六进制表示法
        //  如 ： 2001 : 0DB8 : 0000 : 0023 : 0008 : 0800 : 200C : 417A
        //  为了方便可以把前面的 0 省略     2001 : DB8 : 0 : 23 : 8 : 800 : 200C : 417A

        //  特殊情况 ： 如果计算出的 16 进制表示形式中间有多个连续的 0
        //  就可以使用 0位压缩表示法
        //  比如：FF01:0:0:0:0:0:0:1101       ----->       FF01::1101



    }
}