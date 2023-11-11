package URL.Senior;

//  URL 应用

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Linking_URL {
    public static void main(String[] args) throws IOException {
        //  第一步，创建一个URL对象
        URL url = new URL("http://www.4399.com/flash/8888.htm");

        //  第二步，通过URL，打开链接
        URLConnection conn = url.openConnection();

        //  第三步，通过链接对象conn，来获取链接的流
        InputStream is = conn.getInputStream();

        //  第四步，将is，转换为字符缓流br
        BufferedReader br = new BufferedReader(new InputStreamReader(is,"GBK"));

        //  第五步，获取服务器给到的结果,并打印
        String ret;
        while((ret = br.readLine()) != null){
            System.out.println(ret);
        }

    }
}
