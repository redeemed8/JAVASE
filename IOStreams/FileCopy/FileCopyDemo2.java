package IOStreams.FileCopy;

import java.io.*;

public class FileCopyDemo2 {
    public static void main(String[] args) throws IOException {
        //  刚才文件拷贝的弊端
        //  在拷贝大文件的时候，太太太满了，因为一次只能读取一个字节
        //  所以
        //  一次读取多个字节

        //  创建数组时，数组的长度一般为 1024 的整数倍，可以设置 1024 * 1024 * 5  （ 5 MB ）

        //  创建对象
        FileInputStream fis = new FileInputStream("D:\\protjct\\BigTest.txt");
        //  读取数据
        byte[] bytes = new byte[2];         // 2 表示一次读取两个字节
        //  一次读取多个字节，和数组长度有关，
        //  返回值： 本次读取到了多少个字节数据
        int len = fis.read(bytes);
        System.out.println(len);

        String str = new String(bytes);
        System.out.print(str);

        //  释放资源
        fis.close();

    }
}
