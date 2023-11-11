package IOStreams.ByteOutput;

import java.io.*;

public class OutputWriteDemo {
    public static void main(String[] args) throws IOException {

        //  创建对象
        FileOutputStream fos = new FileOutputStream("D:\\protjct\\test.txt");

        //  一次写一个数据
        fos.write(97);
        fos.write(98);
        fos.write(99);

        //  一次写一个字节数组的数据
        byte[] bytes = {65, 66, 67, 66, 65};
        fos.write(bytes);

        //  一次写一个字节数组的部分数据
        //  write(byte[] b, int off, int len)       形参： 开头索引，写几个
        byte[] bytes1 = {70, 71, 72, 71, 70};
        fos.write(bytes1, 1, 3);

        fos.close();

    }
}
