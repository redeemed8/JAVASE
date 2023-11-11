package IOStreams.OtherIOStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Unzip_StreamDemo1 {
    public static void main(String[] args) throws IOException {
        //  解压缩流    属于输入流
        //  解压的压缩包，需要是zip结尾的

        //  创建一个File 表示要解压的压缩包
        File f1 = new File("D:\\protjct\\aaa\\ha.zip");

        //  创建一个File 表示解压的目的地
        File f2 = new File("D:\\protjct\\aaa\\");

        unzip(f1,f2);

    }

    //  定义一个方法用来解压
    public static void unzip(File src,File dest) throws IOException {
        //  解压的本质：把压缩包里的每一个文件或者文件夹读取出来，按照层级顺序拷贝到目的地当中

        //  创建一个解压缩流用来读取压缩包中的数据
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
        //  要先获取到压缩包中的每一个 zipentry 对象

        //  表示当前在压缩包中获取到的文件或者文件夹
        ZipEntry entry;
        while((entry = zip.getNextEntry()) != null){
            if(entry.isDirectory()){
                //  文件夹：需要在目的地dest出创建一个同样的文件夹
                File file = new File(dest,entry.toString());
                file.mkdirs();          //   创建多级文件夹
            }else{
                //  文件：需要读取到压缩包文件，并把它存放到目的地dest文件夹中(按照层级目录进行存放)
                FileOutputStream fos = new FileOutputStream(new File(dest,entry.toString()));
                int b;
                while((b = zip.read()) != -1){
                    fos.write(b);                   //  一个一个字节拷贝
                }
                fos.close();
                //  表示在压缩包中的一个文件处理完毕了
                zip.closeEntry();
            }
        }
        zip.close();
    }
}
