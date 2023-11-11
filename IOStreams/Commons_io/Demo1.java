package IOStreams.Commons_io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\protjct\\test.txt");
        File dest = new File("D:\\protjct\\test0909.txt");
        FileUtils.copyFile(src, dest);
        /*
         * FileUtils 类
         *   static void copyFile(File src,File dest)                              复制文件
         *   static void copyDirectory(File srcDir, File destDir)                  复制文件夹   将src文件夹里的数据拷贝到dest里面
         *   static void copyDirectoryToDirectory(File srcDir,File destDir)        复制文件夹   将src文件夹拷贝到dest里面
         *   static void deleteDirectory(File directory)                           删除文件夹   全部删除
         *   static void cleanDirectory(File directory)                            清空文件夹
         *   static void write(File file, CharSequence data, String encoding)      写出数据
         *   static String readFileToString(File file, Charset encoding)           读取文件中的数据变成成字符串
         * */

        /*
         * IOUtils 类
         * public static int copy(InputStream input, OutputStream output)          复制文件
         * public static int copyLarge(Reader input, Writer output)                复制大文件
         * public static string readLines(Reader input)                            读取数据
         * public static void write(string data, OutputStream output)              写出数据
         * */


    }
}
