package IOStreams.OtherIOStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Deserialization_StreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //  创建反序列化流的对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\protjct\\aaa\\444.txt"));

        //  读取数据
        ArrayList<Animal> list = (ArrayList<Animal>) ois.readObject();

        for (Animal animal : list) {
            System.out.println(animal);
        }
        //  释放资源
        ois.close();
    }
}
