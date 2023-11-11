package SeniorArray.Map.LinkedHashMap;

import java.util.LinkedHashMap;

public class Introduce {
    public static void main(String[] args) {
        //  有序，不重复，无索引          都是由键的值决定的，与值没啥关系
        //  底层数据是哈希表，只是每个键值对元素又额外多了个双链表的机制记录存储的顺序，，，所以有序
        //  当然，多了链表机制，耗时也更长
        //  方法和 HashMap 无异

        //  创建集合
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("aa",123);
        lhm.put("bb",456);
        lhm.put("cc",789);
        lhm.put("dd",901);

        System.out.println(lhm);

    }
}
