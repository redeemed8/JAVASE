package IOStreams.OtherIOStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Print_StreamDemo1 {
    public static void main(String[] args) throws IOException {
        //  打印流，只能写到文件中，不能读文件
        //  分为 字节打印流 和 字符打印流
        //  有三个特点：
        //  1.打印流只能操作文件目的地，不能操作数据源
        //  2.可以实现数据原样写出，你写97，到文件中就是97，不会转换成 a
        //  3.可以实现自动刷新，自动换行
        //    打印一次数据 = 写出 + 换行 + 刷新

        //  在构造方法中，有自动刷新的开关，但是字节流底层没有缓冲区，所以开不开自动刷新都一样

        //  字节打印流
        //  write 和以前一样
        //  println     打印任意数据，自动刷新，自动换行
        //  print       打印任意数据，不换行
        //  printf      带有占位符的打印语句，不换行
        //  %s  %n(\n)  %c  %b(布尔类型)

        //  创建字节打印流对象
        PrintStream ps = new PrintStream(new FileOutputStream("D:\\protjct\\aaa\\555.txt",true));
        //  写出数据
        ps.write(97);
        ps.println(97);
        ps.print(true);
        ps.printf("%n%s爱上了%s","阿珍","阿强");
        ps.printf("%c",'a');


        //  释放资源
        ps.close();


    }
}
