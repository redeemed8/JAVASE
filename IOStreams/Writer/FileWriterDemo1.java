package IOStreams.Writer;

import java.io.*;

public class FileWriterDemo1 {
    public static void main(String[] args) throws IOException {
        //  FileWriter(FIle/String,续写开关)

        //  write 的 参数
        //  可以是一个字符（int），一个字符串，一个字符数组，或者是字符串和字符数组的一部分

        //  创建一个输出流对象
        FileWriter fw = new FileWriter("D:\\protjct\\Test2.txt");

        //  一个字符
        fw.write(25105);                //  我
        fw.write(97);                   //  a
        //  一个字符串
        fw.write("  我来了！  ");
        //  一个字符数组
        char[] chars = {'a','b','c'};
        fw.write(chars);


        //  关闭文件
        fw.close();
    }
}
