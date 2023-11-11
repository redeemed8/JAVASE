package IOStreams.OtherIOStream;

import java.io.*;

public class Transform_StreamDemo6 {
    public static void main(String[] args) throws IOException {
        /*
        利用字节流读取文件中的数据，每次读一整行，而且不能乱码

        1.字节流在读取中文的时候，会出现乱码，但是字符流不会
        2.字节流里没有一次读一整行的方法，所以要使用到字符缓冲流
        */
        //FileInputStream fis = new FileInputStream("D:\\protjct\\aaa\\111.txt");
        //InputStreamReader isr = new InputStreamReader(fis);         //  将字节流转换为字符流
        //BufferedReader br = new BufferedReader(isr);                //  再将字符流做成高级缓冲流

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\protjct\\aaa\\111.txt"),"GBK"));
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();     //   都只需要关闭一个流即可，前面的流自动关闭

    }
}
