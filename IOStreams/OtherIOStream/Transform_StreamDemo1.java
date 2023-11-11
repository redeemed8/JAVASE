package IOStreams.OtherIOStream;

import java.io.*;

public class Transform_StreamDemo1 {
    public static void main(String[] args) throws IOException{
        //  转换流     属于字符流(高级流)
        //  InputStreamReader    和     OutputStreamWriter
        //  是 字符流 和 字节流 之间的桥梁
        //  InputStreamReader 可以将 字节流 转换为 字符流           数据源 -> 内存
        //  OutputStreamWriter 可以将 字符流 转换为 字节流           内存 -> 目的地

        //  比如字节流想要使用字符流中的方法，就可以转换一下

        //  利用字节流读取文件中的数据，每次读一整行，而且不能出现乱码

        File f = new File("D:\\protjct\\aaa\\111.txt");
        //  1.创建对象并且指定字符编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream(f),"GBK");    //  这个方式被淘汰了
        //  2.读取数据
        int ch;
        while((ch = isr.read()) != -1){
            System.out.print((char)ch);
        }
        //  3.释放资源
        isr.close();


    }
}
