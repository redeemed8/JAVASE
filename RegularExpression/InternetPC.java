package RegularExpression;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InternetPC {
    public static void main(String[] args) throws IOException {
        //创建一个网址对象
        URL url = new URL("http://www.cnzuowen.cn/a/202004/10543214858.htm");
        //连接网址
        URLConnection conn = url.openConnection();
        //创建一个对象去读取网络中的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"GBK"));
        String line;
        //获取正则表达式的对象
        //  String ret = "[1-9][0-9]\\w\\w";
        String newline = "[(\u4e00-\u9fa5)|\\，|\\。]";
        String ret = ".";
        Pattern pattren = Pattern.compile(newline);
        boolean b = false;
        //在读取的时候每次读一整行
        while((line = br.readLine()) != null){
            //用文本匹配器处理
            Matcher matcher = pattren.matcher(line);
            b = false;
            while(matcher.find()){
                //打印获取的小串
                System.out.print(matcher.group());
                b = true;
            }
            if(b){
                System.out.println();
            }
        }

        br.close();
    }
}
