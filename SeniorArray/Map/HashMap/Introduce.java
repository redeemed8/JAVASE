package SeniorArray.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Introduce {
    public static void main(String[] args) {
        // 方法和 Map 一致
        //  特点： 无序，不重复，无索引
        //  底层是哈希表（数组，链表，红黑树）
        //  存数据的时候，用来计算哈希值的是键，和值没关系
        //  当链表的长度超过 8 ，并且数组长度大于 64 时，链表自动转化为红黑树
        //  如果键存储的是自定义的对，需要重写 hashCode 和 equals 方法
        //  如果值是自定义对象，那就不用重写

        Animal a1 = new Animal("dog",10);
        Animal a2 = new Animal("cat",99);
        Animal a3 = new Animal("horse",43);
        Animal a4 = new Animal("fish",7);

        HashMap<Animal,String> hm = new HashMap<>();
        hm.put(a1,"吃骨头");
        hm.put(a2,"吃鱼");
        hm.put(a3,"吃草");
        hm.put(a4,"吃修猫");

        for (Map.Entry<Animal, String> entry : hm.entrySet()) {
            Animal key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "  ==  " + value);
        }

        //  可以当作查询操作
        boolean b1 = hm.containsKey(a1);
        System.out.println(b1);
        boolean b2 = hm.containsValue("吃草");
        System.out.println(b2);
        boolean b3 = hm.containsValue("chinima");
        System.out.println(b3);

    }
}
