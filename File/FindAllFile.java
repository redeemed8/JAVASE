package File;

import java.io.File;

public class FindAllFile {
    public static void main(String[] args) {
        File src = new File("D:\\protjct\\aaa");
        findFile(src);
    }

    public static void findFile(File src) {
        File[] files = src.listFiles();
        if(files == null){
            return;
        }
        for (File file : files) {
            //  如果是文件
            if (file.isFile() && file.getName().endsWith(".txt")) {
                System.out.println(file);
            } else {
                //如果是文件夹，要递归
                findFile(file);
            }
        }

    }

}
