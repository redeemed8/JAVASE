package IOStreams.ByteInput;

import java.io.*;

public class BasicUsingDemo {
    public static void main(String[] args) throws IOException {
        //  1. 创建对象
        FileInputStream fis = new FileInputStream("D:\\protjct\\test.txt");

        //  2. 读取数据
        int read = fis.read();
        System.out.print(read + " ---- ");           //  读出一个数据，转换为 ASCII,并且向后移动一次光标,也会读取 \r\n
        System.out.println((char)read);

        //  如果读取不到了，会返回 -1

        //  3. 释放资源
        fis.close();

    }
}
