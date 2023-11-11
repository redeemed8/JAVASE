package File;

import java.io.File;

public class MemMethod4 {
    public static void main(String[] args) {
        //  获取并遍历

        //  获取当前路径下的所有内容

        //  1. 创建 File 对象
        File f = new File("D:\\protjct\\aaa");
        //  2. listFiles 方法
        //  作用：获取aaa文件夹里面的所有内容，把所有的内容放到数组中返回
        File[] files = f.listFiles();
        for(File file : files){
            //  file 依次表示aaa文件夹里面的每一个文件和文件夹
            System.out.println(file);
        }

        //  当调用者 File 表示的路径不存在时，返回 null
        //  当调用者 File 表示的路径是文件时，返回 null
        //  当调用者 File 表示的路径是一个空文件夹时，返回一个长度为 0 的数组
        //  当调用者 File 表示的路径是一个有内容的文件夹时，将里面所有的文件和文件夹的路径放在 File 数组中返回
        //  当调用者 File 表示的路径是一个有隐藏文件的文件夹时，将里面所有文件和文件夹的路径放在 File 数组中返回，包括隐藏文件
        //  当调用者 File 表示的路径是需要权限才能访问的文件夹时，返回 100

    }
}
