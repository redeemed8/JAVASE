package File;

import java.io.File;

public class ConstructorMethod {
    public static void main(String[] args) {
        //  File(String pathname)
        //  File(String parent, String child)           //  父路径名 和 子路径名
        //  File(File parent, String child)             //  根据父路径对应文件和子路径名字符串创建文件对象

        //  1. 根据字符串表示的路径，变成 File 对象
        String str = "c:\\User\\王俊逸\\Desktop\\a.txt";
        File f1 = new File(str);
        System.out.println(f1);

        //  2. 父级路径和子级路径
        String parent = "c:\\User\\王俊逸\\Desktop";
        String child = "a.txt";
        File f2 = new File(parent, child);
        System.out.println(f2);

        //  3. 父级路径和子级字符串
        File parent2 = new File("c:\\User\\王俊逸\\Desktop");
        String child2 = "a.txt";
        File f3 = new File(parent2,child2);
        System.out.println(f3);

    }
}
