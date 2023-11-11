package URL.Senior;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class SendMessage {
    public static void main(String[] args) throws IOException {
        //  短信 API
        //  API 地址：httsp://itdage.com/kkb/kkbsms
        //  参数列表：
        //  key     密钥：值为xzk
        //  number  接收号码的手机号
        //  code    A-Za-z0-9的验证码内容

        //  但是我的短信API还没开通，所以不能运行，如果想要发送，CSDN 学习开通~~

        //  第一步，创建一个URL对象
        URL url = new URL("https://itdage.com/kkb/kkbsms?key=xzk&number=15840965288&code=666666");

        //  第二步，通过URL，打开链接
        URLConnection conn = url.openConnection();

        //  第三步，通过链接对象conn，来获取链接的流
        InputStream is = conn.getInputStream();

        //  第四步，将is，转换为字符缓流br
        BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));

        //  第五步，获取服务器给到的结果,并打印
        String ret = br.readLine();
        System.out.println(ret);
    }
}
