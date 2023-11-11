package NetCoding.Basic_Coding;

public class Protocols_Introduce {
    public static void main(String[] args) {
        //  协议  连接和通信的规则---网络通信协议

        //  UDP --- 用户数据报协议
        /*
         UDP是 面向无连接 的通信协议
         面向无连接：不检查网络是否畅通，直接发送数据，能接收就接受，不接拉倒
         速度快，有大小限制一次最多发送 64 K，数据不安全，易丢失数据
         比如 网络会议，语音通话，在线视频 等
        */

        //  TCP --- 传输控制协议
        /*
         TCP是 面向连接 的通信协议
         面向连接：先检查网络是否畅通，畅通才会发送数据
         速度慢，没有大小限制，数据安全
         比如 下载软件，文字聊天，发送邮件 等
        */

    }
}
