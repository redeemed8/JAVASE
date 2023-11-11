package IOStreams.OtherIOStream;

import java.io.*;

public class Deserialization_StreamDemo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //  反序列化流，将文件中的对象数据读回来，readObject   但是返回值是Object

        //  创建反序列化流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\protjct\\aaa\\333.txt"));

        //  读取数据
        //Object o = ois.readObject();
        Animal an = (Animal) ois.readObject();

        //  打印对象
        System.out.println(an);

        //  释放资源
        ois.close();

        //  细节1：
        /*
        在 java 底层会根据你的成员变量，静态变量，成员方法，构造方法，来进行计算，从而确定出当前类的版本号
        在写入文件时，类的版本号也会被写入其中
        如果在写入文件后，对 javabeen 类进行了修改，就会导致当前类的版本号发生了改变
        这时再通过反序列化进行对象的取出，java虚拟机就会发现两个版本号的不同，从而报错。

        为了解决这个问题，我们可以在类中提前写好一个静态不可变的版本号，从而控制所有的这种类都是一个版本号
        */
        //  细节2:
        /*
        类里有些东西你不想序列化到本地文件中，要在变量前加 transient
        transient 也叫瞬态关键字
        */

    }
}
