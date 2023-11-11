package IOStreams.OtherIOStream;

import java.io.*;
import java.nio.charset.Charset;

public class Transform_StreamDemo5 {
    public static void main(String[] args) throws IOException {
        //  将本地 GBK文件 转换成 UTF-8

        //  JDK11 以前的方案
       /* InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\protjct\\aaa\\111.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\protjct\\aaa\\222.txt"));  // 默认UTF-8
        int b;
        while((b = isr.read()) != -1){
            osw.write(b);
        }
        osw.close();
        isr.close();*/


        //  JDK11 的代替方案
        FileReader fr = new FileReader("D:\\protjct\\aaa\\111.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("D:\\protjct\\aaa\\222.txt");        //  idea 默认UTF-8
        int b;
        while((b = fr.read()) != -1){
            fw.write(b);
        }
        fw.close();
        fr.close();

    }
}
