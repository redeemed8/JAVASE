package IOStreams.FileCopy;

import java.io.*;
import java.util.Arrays;

public class FileCopyDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\protjct\\FileCopy.txt");
        int len;

        byte[] bytes = new byte[2];
        len = fis.read(bytes);
        System.out.print(len + " ------- ");
        System.out.println(new String(bytes));

        len = fis.read(bytes);
        System.out.print(len + " ------- ");
        System.out.println(new String(bytes));

        len = fis.read(bytes);
        System.out.print(len + " ------- " + "\n--------------------");
        System.out.println(new String(bytes));

        fis.close();

        //  这就是弊端，因为读取的时候，他想要尽量给数组装满，而且装一个就覆盖前一个，所以最后一次打印的是 -1
        //  所以我们可以改进
        //  在我们每次为 bytes 创建成字符串的时候，我们可以加一个索引范围
        //  new String(数组名, 开始下标, 转换几个)

        FileInputStream fis1 = new FileInputStream("D:\\protjct\\FileCopy.txt");
        int len1;
        len1 = fis1.read(bytes);
        System.out.print(len1 + " ------- ");
        System.out.println(new String(bytes, 0, len1));

        int len2;
        len2 = fis1.read(bytes);
        System.out.print(len2 + " ------- ");
        System.out.println(new String(bytes, 0, len2));

        int len3;
        len3 = fis1.read(bytes);
        System.out.print(len3 + " ------- ");
        System.out.println(new String(bytes, 0, len3));

        fis1.close();

    }
}
