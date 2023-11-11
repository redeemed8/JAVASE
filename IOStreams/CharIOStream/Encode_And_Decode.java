package IOStreams.CharIOStream;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Encode_And_Decode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //  编码和解码

        //  字符流 = 字节流 + 字符集

        //  编码
        String str1 = "我是大傻逼";
        byte[] bytes1 = str1.getBytes();            //  idea 默认使用 UTF-8
        System.out.println(Arrays.toString(bytes1));        //  一个中文3个字节
        System.out.println(bytes1.length);              //  15

        //  指定其他编码方式 （如 GBK ）
        byte[] bytes2 = str1.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));            //  一个中文两个字节
        System.out.println(bytes2.length);

        //  解码
        String str2 = new String(bytes1);           //  第二个参数默认为 UTF-8
        System.out.println(str2);

        str2 = new String(bytes2,"GBK");
        System.out.println(str2);


    }
}
