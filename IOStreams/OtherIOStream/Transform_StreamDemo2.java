package IOStreams.OtherIOStream;

import java.io.*;
import java.nio.charset.Charset;

public class Transform_StreamDemo2 {
    public static void main(String[] args) throws IOException{
        File f = new File("D:\\protjct\\aaa\\111.txt");
        //  Demo1 的代替方案
        //  在 JDK11 以后可用 ↓
        //  使用新的构造方法
        FileReader fr = new FileReader(f, Charset.forName("GBK"));
        //  2.读取数据
        int ch;
        while((ch = fr.read()) != -1){
            System.out.print((char)ch);
        }
        //  3.释放资源
        fr.close();

    }
}
