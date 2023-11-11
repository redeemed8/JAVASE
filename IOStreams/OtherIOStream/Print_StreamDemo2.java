package IOStreams.OtherIOStream;

import java.io.*;

public class Print_StreamDemo2 {
    public static void main(String[] args) throws IOException {
        //  字符打印流
        //  底层有缓冲区,构造函数有自动刷新开关,效率也高

        //  创建字节打印流对象
        PrintWriter pw  = new PrintWriter(new FileWriter("D:\\protjct\\aaa\\666.txt",true),true);
        //  写出数据
        pw.write(97);
        pw.println(97);
        pw.print(true);
        pw.printf("%n%s爱上了%s","阿珍","阿强");
        pw.printf("%c",'a');


        //  释放资源
        pw.close();

        //  获取打印流对象，此打印流在虚拟机启动时，由虚拟机创建，默认指向控制台
        //  特殊的打印流，系统中的标准输出流
        PrintStream ps = System.out;
        ps.println(123);
        //  不能关闭这个流，不然以后下面的输出语句就不能输出了

        ps.close();
        System.out.println(123456789);

    }
}
