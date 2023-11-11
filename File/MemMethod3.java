package File;

import java.io.File;
import java.io.IOException;

public class MemMethod3 {
    public static void main(String[] args) throws IOException {

        //  创建一个新的空的文件夹
        //  成功创建返回 true
        //  如果父级路径不存在，会有异常 IOException
        File f1 = new File("D:\\protjct\\a.txt");
        boolean b1 = f1.createNewFile();
        System.out.println(b1);

        //  创建单级文件夹（也叫目录）
        File f2 = new File("D:\\protjct\\javatest");
        boolean b2 = f2.mkdir();
        System.out.println(b2);

        //  创建多级文件夹
        File f3 = new File("D:\\protjct\\aaa\\bbb\\ccc");
        boolean b3 = f3.mkdirs();
        System.out.println(f3);

        //  删除文件、空文件夹
        //  只能删除空的文件夹
        boolean b4 = f1.delete();
        System.out.println(b4);
        boolean b5 = f3.delete();
        System.out.println(b5);


    }
}
