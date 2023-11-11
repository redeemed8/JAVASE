package IOStreams.Reader;

import java.io.*;

public class FileReaderDemo1 {
    public static void main(String[] args) throws IOException {
        //  使用 FileReader空参方法 读取数据

        //  创建字符输入流对象
        FileReader fr = new FileReader("D:\\protjct\\test.txt");

        //  读取数据 read()
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char)ch);         //  这套流程中英文通用
        }
        //  细节：
        //  空参的read方法默认一个一个字节的读，遇到汉字一次读多个
        //  读取后，方法底层会进行解码并转成十进制
        //  把这个十进制作为返回值
        //  这个十进制的数据也表示在字符集上的数字
        //  如果我想看到具体的内容，直接把十进制数据强转为 char 就可以了

        //  释放资源
        fr.close();


    }
}
