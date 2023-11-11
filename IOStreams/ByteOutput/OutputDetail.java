package IOStreams.ByteOutput;

import java.io.*;

public class OutputDetail {
    public static void main(String[] args) throws IOException {
        //  换行写

        //  创建对象
        FileOutputStream fos = new FileOutputStream("D:\\protjct\\test.txt");
        //  写出数据
        String str = "WoShiDa\r\nShaBi";
        //  Windows : \r\n
        //  Linux : \n
        //  但是 Java 会把 \r\n 优化，Windows 也可以只写 \n , 但是我们尽量写 \r\n
        byte[] bytes = str.getBytes();
        fos.write(bytes);
        fos.close();

        //  续写
        //  在创建 FileOutputStream 对象时，我们有第二个参数，续写开关  false 关闭续写，清空文件，默认 false
        String str2 = "HaHaHaHaHa";
        FileOutputStream fos2 = new FileOutputStream("D:\\protjct\\test.txt", true);
        fos2.write(str2.getBytes());
        fos2.close();


    }
}
