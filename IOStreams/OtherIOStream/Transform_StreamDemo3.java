package IOStreams.OtherIOStream;

import java.io.*;

public class Transform_StreamDemo3 {
    public static void main(String[] args) throws IOException {
        //  利用转换流按照指定字符编码输出

        File f = new File("D:\\protjct\\aaa\\111.txt");
        //  1.创建转换流
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(f),"GBK");     //  淘汰
        //  2.写出数据
        osw.write("我爱你呀梦子！");
        //  3.关闭文件
        osw.close();


    }
}
