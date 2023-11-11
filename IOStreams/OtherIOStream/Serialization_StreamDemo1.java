package IOStreams.OtherIOStream;

import java.io.*;

public class Serialization_StreamDemo1 {
    public static void main(String[] args) throws IOException {
        //  序列化流    是一种字节流      ObjectOutputStream  也叫对象操作输出流
        //  可以把对象写到本地文件中
        //  但是写的东西，我们是看不懂的

        //  构造方法中写入基本流 OutputStream   将基本流变成高级流

        //  1.创建对象
        Animal an = new Animal("狗",12,"我是大傻逼");

        //  2.创建序列化流的对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\protjct\\aaa\\333.txt"));

        //  3.写出数据
        oos.writeObject(an);

        //  4。释放资源
        oos.close();


    }
}
