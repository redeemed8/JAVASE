package Stream;

import java.util.*;
import java.util.stream.Stream;

public class Introduce1 {
    public static void main(String[] args) {

        //  先得到一条流水线（stream流）
        /*
        单列集合            collection中的默认方法stream()
        双列集合            先转换成 Set 和 EntrySet         再使用上面的
        数组               Arrays工具类中的静态方法
        一堆零散数据         stream接口中的静态方法
        */

        //  1.单列集合
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e");
        //  获取到一条流水线，并把集合中的数据都放到流水线上
        Stream<String> stream1 = list.stream();
        //  使用终结方法打印一下流水线上的所有数据
        //  stream1.forEach( o -> System.out.println(o));
        stream1.forEach(System.out::println);
        System.out.println("------------------------------");
        //  2.双列集合
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("aaa",111);
        hm.put("bbb",222);
        hm.put("ccc",333);
        hm.put("ddd",444);
        //  第一种获取stream流
        hm.keySet().stream().forEach(System.out::println);

        //  第二种获取stream流
        hm.entrySet().stream().forEach(System.out::println);


    }
}
