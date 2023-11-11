package File;

import java.io.*;

public class DelMultilevelFile {
    public static void main(String[] args) throws IOException {
        //  创建实验要删除的东西
        /*
                ----JavaTest
                        ----Array_Basic
                                ----string_Detail
                                        ----5.txt
                                ----3.txt
                        ----test02
                                ----4.txt
                        ----1.txt
                        ----2.txt
        */
        File startF = new File("D:\\protjct\\JavaTest");
        boolean b = startF.mkdir();
        File f1 = new File(startF, "1.txt");
        File f2 = new File(startF, "2.txt");
        b = f1.createNewFile();
        b = f2.createNewFile();
        File newF1 = new File(startF, "Array_Basic");
        File newF2 = new File(startF, "test02");
        b = newF1.mkdir();
        b = newF2.mkdir();
        File inF1 = new File(newF1, "3.txt");
        File inF2 = new File(newF2, "4.txt");
        b = inF1.createNewFile();
        b = inF2.createNewFile();
        File newF3 = new File(newF1, "string_Detail");
        b = newF3.mkdir();
        File inF3 = new File(newF3, "5.txt");
        b = inF3.createNewFile();

        //  进行删除
        //delFile(startF);
    }

    public static void delFile(File src) {       //  删除 src 文件夹
        //  先进入 src 中
        File[] files = src.listFiles();
        if(files == null)               return;
        //  遍历
        for (File file : files) {
            //  判断，如果是文件，删除
            if(file.isFile()){
                file.delete();
            }else{
                //  如果是文件夹，递归
                delFile(file);
            }
        }
        src.delete();
    }

}
