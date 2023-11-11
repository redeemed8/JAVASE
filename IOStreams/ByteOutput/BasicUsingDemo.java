package IOStreams.ByteOutput;

import java.io.*;

public class BasicUsingDemo {      //  抛出的这个异常就是让你检查一下本地文件中 有没有你写的这个文件
    public static void main(String[] args) throws IOException {
        //  字节流中有  字节输入流，字节输出流

        //  操作本地文件的字节输入流        FileInputStream
        //  操作本地文件的字节输出流        FileOutputStream

        //  书写步骤
        //  ① 创建字节输出流对象
        //  ② 写数据
        //  ③ 释放资源

        //  ① 创建对象
        //  细节：参数可以是 字符串 或者 文件对象
        //       如果文件不存在，它会帮你创建一个文件，但是该文件的父级文件必须存在
        FileOutputStream fos = new FileOutputStream("D:\\protjct\\test.txt");
        //  ② 写出数据
        //  细节：重写会覆盖，参数是整数，表示 ASCII 值
        fos.write(97);              //  97 是 ASCII 值
        //  ③ 释放资源
        //  细节:
        fos.close();                    //  关闭文件

    }
}
