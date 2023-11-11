package IOStreams.OtherIOStream;

import java.io.*;
import java.util.zip.*;

public class Zip_StreamDemo1 {
    public static void main(String[] args) throws IOException {
        //  压缩流
        //  压缩单个文件

        //  创建一个File 表示要压缩的文件
        File src = new File("D:\\protjct\\test.txt");
        //  创建一个File 表示压缩包的位置
        File dest = new File("D:\\protjct\\");
        //  调用方法用来压缩
        toZip(src,dest);
    }

    public static void toZip(File src,File dest) throws IOException {
        //  创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest,"test.zip")));
        //  创建 ZipEntry 对象，表示压缩包里面的每一个文件和文件夹
        ZipEntry entry = new ZipEntry("test.txt");  //  参数：压缩包里的路径 (可自动创建多级文件夹)
        //  把 ZipEntry 对象放到压缩包中
        zos.putNextEntry(entry);
        //  把src文件中的数据写道压缩包中
        FileInputStream fis = new FileInputStream(src);
        int b;
        while((b = fis.read()) != -1){
            zos.write(b);
        }
        zos.closeEntry();
        zos.close();
    }
}
