package IOStreams.FileCopy;

import java.io.*;

public class DirectoryCopy {
    public static void main(String[] args) throws IOException {
        //  拷贝多级文件夹

        //  创建对象表示数据源
        File src = new File("D:\\protjct\\aaa");            //  源地址
        //  创建对象表示目的地
        File dest = new File("D:\\protjct\\DirCopy");
        //  调用方法开始拷贝
        copyDir(src, dest);

    }

    private static void copyDir(File src, File dest) throws IOException {
        //  如果不存在，直接创建
        dest.mkdir();
        //  先进入数据源
        File[] files = src.listFiles();
        if(files == null)   return;
        //  遍历数组
        for (File file : files) {
            if (file.isFile()) {
                //  判断文件，拷贝
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest,file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fis.read(bytes)) != -1) {
                    fos.write(bytes, 0, len);
                }
                fos.close();
                fis.close();
            } else {
                //  判断文件夹，递归
                copyDir(file,new File(dest,file.getName()));
            }
        }
    }
}
