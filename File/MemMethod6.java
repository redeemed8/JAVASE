package File;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class MemMethod6 {
    public static void main(String[] args) {
        File f = new File("D:\\protjct\\aaa");              //  冒号必须是英文的

        //  listFiles()    取出所有的文件和文件夹         //  重点
        File[] arr = f.listFiles();
        for (File file : arr) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                System.out.println(file);
            }
        }
        System.out.println("-------------------------");

        //  运用过滤器
        File[] arr2 = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr2));
        System.out.println("-------------------------");

        //  拆分式过滤器
        String[] arr3 = f.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
                return src.isFile() && name.endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr3));


    }
}
