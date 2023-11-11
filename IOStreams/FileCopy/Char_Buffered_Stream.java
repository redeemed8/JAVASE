package IOStreams.FileCopy;

import java.io.*;

public class Char_Buffered_Stream {
    public static void main(String[] args) throws IOException {
        //  字符缓冲流

        //  这个的效率其实没快多少，因为它本身已经有缓冲区了，但是他的成员方法很好用

        //  String readLine()       一次读一行数据，读不到了返回 null
        //  void newLine()          跨平台的换行  就是说他会根据你的操作系统来为你自动选择相应的换行符

        //  创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("D:\\protjct\\test.txt"));
        //  读取数据
        String line = br.readLine();        //  读到回车换行就停止，但是不会把回车换行读到结果里
        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }

        //  关闭文件
        br.close();

        //  创建字符缓冲输出流的对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\protjct\\teat99.txt"));

        bw.write("我爱你");
        bw.newLine();
        bw.write("我真的爱你");
        bw.newLine();

        bw.close();
    }
}
