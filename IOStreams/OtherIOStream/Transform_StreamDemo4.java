package IOStreams.OtherIOStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Transform_StreamDemo4 {
    public static void main(String[] args) throws IOException {
        //  替代品  JDK11 后
        File f = new File("D:\\protjct\\aaa\\111.txt");
        FileWriter fw = new FileWriter(f, Charset.forName("GBK"));
        //  2.写出数据
        fw.write("我爱你呀梦子！");
        //  3.关闭文件
        fw.close();


    }
}
