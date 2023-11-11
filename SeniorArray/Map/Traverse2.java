package SeniorArray.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Traverse2 {
    public static void main(String[] args) {
        //  第二种遍历方式，获取所有的键值对
        Map<String, String> map1 = new HashMap<>();
        map1.put("小111","大111");
        map1.put("小333","大333");
        map1.put("小222","大222");
        map1.put("小444","大444");

        //  先获取所有键值对,方法会返回一个 Set 集合
        Set<Map.Entry<String, String>> entries = map1.entrySet();

        //遍历    entries 集合 得到每一个键值对对象
        for(Map.Entry<String,String> entry : entries){
            //  获取相应的键和值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.print(key + "=" + value + " ");
        }
        System.out.println("\n-------------");

        //  迭代器
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while(it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.print(key + "=" + value + " ");
        }
        System.out.println("\n-------------");

        //  lambda 表达式
        entries.forEach(entry->{
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.print(key + "=" + value + " ");
        });

    }
}
