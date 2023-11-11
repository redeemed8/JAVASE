package IOStreams.OtherIOStream;

import java.io.*;
import java.util.zip.*;

public class Zip_StreamDemo2 {
    public static void main(String[] args) throws IOException {
        //  压缩文件夹

        //  ①要压缩文件的路径
        File src = new File("D:\\protjct\\aaa");
        //  ②压缩包父级路径(压缩包放在哪里)
        File destParent = src.getParentFile();
        //  ③压缩包路径
        File dest = new File(destParent, src.getName() + ".zip");
        //  ④创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        //  ⑤获取src里面的每一个文件，变成ZipEntry对象，放入到压缩包当中
        toZip(src, zos, src.getName());
        //  ⑥释放资源
        zos.close();

    }

    /*
     * 作用：获取src里面的每一个文件，变成ZipEntry对象，放入到压缩包当中
     * 参数一：数据源
     * 参数二：已关联压缩包的压缩流
     * 参数三：压缩包内部的路径
     * */
    public static void toZip(File src, ZipOutputStream zos, String name) throws IOException {
        //  进入 src 文件夹
        File[] files = src.listFiles();
        //  遍历数组
        for (File file : files) {
            if (file.isFile()) {
                //  如果是文件，变成 ZipEntry 对象，放入到压缩包当中
                ZipEntry entry = new ZipEntry(name + "\\" + file.getName());
                zos.putNextEntry(entry);
                //  读取文件中的数据，写到压缩包里
                FileInputStream fis = new FileInputStream(file);
                int b;
                while((b = fis.read()) != -1){
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();
            } else {
                //  如果是文件夹，递归
                toZip(file,zos,name + "\\" + file.getName());
            }
        }
    }

}
