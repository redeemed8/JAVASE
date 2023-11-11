package IOStreams.FileCopy;

import java.io.*;

public class Byte_Buffered_Stream_Copy2 {
    public static void main(String[] args) throws IOException {
        //  一次读取多个字节

        //  创建缓冲流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\protjct\\test.txt"));
        //  ↓  第二个参数是缓冲区大小，默认 8192个 字节 8KB
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\protjct\\test9.txt"));

        //  拷贝
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        //  关闭文件
        bos.close();
        bis.close();

    }
}
