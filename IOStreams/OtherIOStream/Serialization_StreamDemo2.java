package IOStreams.OtherIOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serialization_StreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
        需求：将多个自定义对象序列化到文件中，但是对象的个数不确定，那应该怎么办？
        */

        //  因为 集合ArrayList 也实现了序列化接口，
        //  所以我们可以把集合序列化到文件中，反序列化的时候读出来的也是集合

        //  1.序列化多个对象
        Animal a1 = new Animal("狗",10,"傻逼");
        Animal a2 = new Animal("猫",15,"大傻逼");
        Animal a3 = new Animal("鱼",23,"大大傻逼");

        ArrayList<Animal> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\protjct\\aaa\\444.txt"));
        oos.writeObject(list);

        oos.close();
    }
}
