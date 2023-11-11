package IOStreams.CharIOStream;

import java.io.*;

/* GBK 是 GB2312 扩展的意思 */
public class ASCII_GBK {
    public static void main(String[] args) throws IOException {
        /* 在使用字节流逐个读取中文时，会出现乱码 */
        FileInputStream fis = new FileInputStream("D:\\protjct\\ChineseTest.txt");
        int len;
        byte[] bytes = new byte[6];             //  一次读取3个字节 或者是 3的 整数倍
        while ((len = fis.read(bytes)) != -1) {
            System.out.print(new String(bytes, 0, len));
        }
        fis.close();            //  不会乱码

        System.out.println("\n---------------------");

        FileInputStream fis1 = new FileInputStream("D:\\protjct\\ChineseTest.txt");
        int b;
        while ((b = fis1.read()) != -1) {
            System.out.print((char)b);              //  或者你在拷贝文本文件时，不写强转的char，就不会乱码
        }
        fis1.close();           //  会乱码     //  因为一次只能读一个字节，而汉字在UTF-8下是3个字节，一次读不完一个汉字

        //  在 GBk 中一个中文汉字两个字节，二进制的第一位是 1

        //  中文编码后转换为10进制是负数
        //  英文是正数
    }
}
