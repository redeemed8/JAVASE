package File;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class MemMethod5 {
    public static void main(String[] args) {
        File f = new File("D:\\protjct\\aaa");
        //  1. listRoots     获取系统中所有的盘符
        File[] arr = File.listRoots();
        System.out.println(Arrays.toString(arr));           //  C:\, D:\
        System.out.println("----------------");

        //  2. list()   获取当前该路径下所有内容(文件名)
        String[] arr2 = f.list();
        for (String s : arr2) {
            System.out.println(s);
        }
        System.out.println("----------------");

        //  3. list(FilenameFilter filter)  (文件名过滤器)    利用文件名过滤器获取当前路径下的所有内容
        //  获取 f 中的所有 txt 文件
        //  accept 方法形参一为父级路径，二为子集路径
        //  返回true代表当前路径保留，false表示当前路径舍弃不要
        String[] arr3 = f.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir,name);
                return src.isFile() && name.endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr3));
        System.out.println("----------------");



    }
}
