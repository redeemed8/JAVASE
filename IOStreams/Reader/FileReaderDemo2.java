package IOStreams.Reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {
    public static void main(String[] args) throws IOException {
        //  使用有参的 read 方法
        FileReader fr = new FileReader("D:\\protjct\\ChineseTest.txt");

        //  读取
        char[] chars = new char[2];
        int len;
        while ((len = fr.read(chars)) != -1) {
            System.out.print(new String(chars, 0, len));
        }
        //  细节：
        //  有参的 read 是将 读取数据，解码，强转三步合并了，把强转之后的字符放到数组中

        //  关闭文件
        fr.close();

    }
}
