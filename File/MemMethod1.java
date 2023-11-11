package File;

import java.io.File;

public class MemMethod1 {
    public static void main(String[] args) {
        // "D:\\protjct\\test.txt"

        //  1. 对一个文件路径进行判断
        File f1 = new File("D:\\protjct\\test.txt");
        System.out.println(f1.isDirectory());           //  判断 f1 是不是文件夹
        System.out.println(f1.isFile());                //  判断是不是文件
        System.out.println(f1.exists());                //  判断是否存在

        System.out.println("----------------");

        //  2. 对一个文件夹路径进行判断
        File f2 = new File("D:\\protjct");
        System.out.println(f2.isDirectory());           //  判断 f1 是不是文件夹
        System.out.println(f2.isFile());                //  判断是不是文件
        System.out.println(f2.exists());                //  判断是否存在

        System.out.println("----------------");

        //  3. 返回文件大小
        long length1 = f1.length();
        System.out.println(length1);
        long length2 = f2.length();
        System.out.println(length2);


    }
}
