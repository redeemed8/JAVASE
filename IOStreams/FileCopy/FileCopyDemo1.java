package IOStreams.FileCopy;

import java.io.*;

public class FileCopyDemo1 {
    public static void main(String[] args) throws IOException {
        //  文件拷贝
        //  暂时先拷贝一个比较小的文件

        //  1. 创建对象
        FileInputStream fis = new FileInputStream("D:\\protjct\\test.txt");
        FileOutputStream fos = new FileOutputStream("D:\\protjct\\aaa\\test.txt");

        //  2. 拷贝
        //  核心思想： 边读边写
        int b;
        while((b = fis.read()) != -1){
            fos.write(b);
        }

        //  3. 释放资源
        //  规则： 先打开的文件最后关闭
        fos.close();
        fis.close();

    }
}
