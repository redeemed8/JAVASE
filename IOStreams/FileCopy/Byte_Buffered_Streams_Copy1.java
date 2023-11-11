package IOStreams.FileCopy;

import java.io.*;

public class Byte_Buffered_Streams_Copy1 {
    public static void main(String[] args) throws IOException{
        //  字节缓冲流
        //  一次读写一个字节

        //  创建缓冲流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\protjct\\test.txt"));
        //  ↓  第二个参数是缓冲区大小，默认 8192个 字节 8KB
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\protjct\\test9.txt"));

        //  循环读取并写到目的地
        int b;
        while((b = bis.read()) != -1){
            bos.write(b);
        }

        //  关闭文件
        bos.close();
        bis.close();

    }
}
