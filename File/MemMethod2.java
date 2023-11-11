package File;

import java.io.File;

public class MemMethod2 {
    public static void main(String[] args) {
        File f1 = new File("D:\\protjct\\test.txt");

        //  细节：只能获取文件的大小，不能是文件夹
        //  如果想要 M，G 做单位，要自己除以 1024
        System.out.println(f1.length());                        //  返回文件大小（字节数量）
        System.out.println("-------------------------------");

        //  返回文件的绝对路径
        String path1 = f1.getAbsolutePath();
        System.out.println(path1);
        File f2 = new File("b.txt");
        System.out.println(f2.getAbsolutePath());
        System.out.println("-------------------------------");

        //  返回文件的相对路径
        String path2 = f1.getPath();
        System.out.println(path2);
        String path3 = f2.getPath();
        System.out.println(path3);
        System.out.println("-------------------------------");

        //  获取文件名
        String fName = f1.getName();
        System.out.println(fName);          // a.txt        a为文件名  txt为后缀名，扩展名
        File f3 = new File("D:\\protjct");
        System.out.println(f3.getName());
        System.out.println("-------------------------------");

        //  返回文件的最后修改时间（时间的毫秒值）
        long time = f1.lastModified();
        System.out.println(time);
    }
}
